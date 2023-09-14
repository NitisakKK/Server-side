package sit.int202.simfri.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import sit.int202.simfri.entity.Subject;
import sit.int202.simfri.repositories.SubjectRepository;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "FavoriteSubjectServlet", value = "/favouriteSubject")
public class FavoriteSubjectServlet extends HttpServlet {
    private long startTime;

    @Override
    public void destroy() {
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("Duration of SubjectListServlet Is " +
                (System.currentTimeMillis() - startTime) + "milli seconds");
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Override
    public void init() throws ServletException {
        startTime = System.currentTimeMillis();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SubjectRepository subjectRepositoy = new SubjectRepository();
        List<Subject> subject = subjectRepositoy.findAll();
        request.setAttribute("subject", subject);
        request.getRequestDispatcher("/subject.List.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doProcess(request, response);
    }

    protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String id = request.getParameter("id");
        String[] subjects = request.getParameterValues("subject");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Your Favorite Subject</h1><hr>");
        out.println("Student Id : " + id + "<br>");
        out.println("Student Name : " + name + "<br>");
        out.println("YourFavorite Subjects:<br>");
        for (String subject : subjects) {
            out.println("&nbsp; &nbsp; - " + subject + "<br>");
        }
        out.println("<hr>");
        out.println("<a href='favorite_subject.html'> Back </a");
        out.println("</body><a/html>");
    }
}
