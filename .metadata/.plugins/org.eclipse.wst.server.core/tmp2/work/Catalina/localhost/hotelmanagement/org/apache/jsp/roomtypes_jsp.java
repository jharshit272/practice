/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.34
 * Generated at: 2017-01-07 10:37:55 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class roomtypes_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<pre>\r\n");
      out.write("\r\n");
      out.write("Settle into one of the spacious rooms at the Country Inn & Suites, Sahibabad, the ideal location for a holiday in the Ghaziabad District. Choose from these room types to enjoy a pleasant stay while away from home:\r\n");
      out.write("\r\n");
      out.write("<h4>Superior Hotel Rooms</h4>\r\n");
      out.write("Step into approximately 400 square feet of pleasantly decorated, comfortable accommodation that includes a combined bedroom and living area furnished with a king bed, reading chairs, a table, a writing desk and a bar area. The bathroom features single vanities, a shower, a bathtub and all other modern accessories. All standard amenities are provided, in addition to:\r\n");
      out.write("\r\n");
      out.write("Complimentary Buffet Breakfast in 64/6, the On-Site All-Day Dining Restaurant\r\n");
      out.write("Free Usage of Gymnasium and Swimming Pool\r\n");
      out.write("Iron and Ironing Board (on request)\r\n");
      out.write("\r\n");
      out.write("<h4>Executive Club Rooms</h4>\r\n");
      out.write("The Executive Club Rooms spread out over approximately 400 square feet and include a combined bedroom and living area that is furnished with a king bed, reading chairs, a table, a writing desk and a bar area. Take advantage of the contemporary bathroom, which boasts twin vanities, a shower, a bathtub and all other modern accessories. These serene rooms include all standard amenities and the following:\r\n");
      out.write("\r\n");
      out.write("Complimentary Buffet Breakfast in 64/6, the On-Site All-Day Dining Restaurant\r\n");
      out.write("Free Usage of Gymnasium and Swimming Pool\r\n");
      out.write("Iron and Ironing Board (on request)\r\n");
      out.write("\r\n");
      out.write("<h4>Executive Suites</h4>\r\n");
      out.write("After a dayâs excitement at Sahibabadâs area attractions, you can settle back with a cup of tea or coffee in our Executive Suites. This spacious accommodation features a carpeted living room furnished with sofas, a writing desk, chairs, an LCD TV and a minibar. This room leads to the bedroom, which holds a king bed, a daybed and other contemporary accessories. These 800-square-foot rooms offer all standard amenities and additional perks, such as:\r\n");
      out.write("\r\n");
      out.write("Complimentary Buffet Breakfast in 64/6, the On-Site All-Day Dining Restaurant\r\n");
      out.write("Free Usage of Gymnasium and Swimming Pool\r\n");
      out.write("Iron and Ironing Board (on request)\r\n");
      out.write("Bathrobe and Slippers\r\n");
      out.write("Free Usage of Steam Room and Spa Tub\r\n");
      out.write("Late Check-Out Until 5:00 p.m. (subject to availability)\r\n");
      out.write("Shoe Shiner\r\n");
      out.write("Shaving Mirror\r\n");
      out.write("Three Pieces of Laundry per Day\r\n");
      out.write("Two Bottles of Packaged Water per Day\r\n");
      out.write("Weighing Machine\r\n");
      out.write("\r\n");
      out.write("</pre>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
