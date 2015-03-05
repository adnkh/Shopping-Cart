package org.apache.jsp.tag.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class genericpage_tag
    extends javax.servlet.jsp.tagext.SimpleTagSupport
    implements org.apache.jasper.runtime.JspSourceDependent {


  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private JspContext jspContext;
  private java.io.Writer _jspx_sout;
  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public void setJspContext(JspContext ctx) {
    super.setJspContext(ctx);
    java.util.ArrayList<String> _jspx_nested = null;
    java.util.ArrayList<String> _jspx_at_begin = null;
    java.util.ArrayList<String> _jspx_at_end = null;
    this.jspContext = new org.apache.jasper.runtime.JspContextWrapper(ctx, _jspx_nested, _jspx_at_begin, _jspx_at_end, null);
  }

  public JspContext getJspContext() {
    return this.jspContext;
  }
  private javax.servlet.jsp.tagext.JspFragment header;
  private javax.servlet.jsp.tagext.JspFragment footer;

  public javax.servlet.jsp.tagext.JspFragment getHeader() {
    return this.header;
  }

  public void setHeader(javax.servlet.jsp.tagext.JspFragment header) {
    this.header = header;
  }

  public javax.servlet.jsp.tagext.JspFragment getFooter() {
    return this.footer;
  }

  public void setFooter(javax.servlet.jsp.tagext.JspFragment footer) {
    this.footer = footer;
  }

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void doTag() throws JspException, java.io.IOException {
    PageContext _jspx_page_context = (PageContext)jspContext;
    HttpServletRequest request = (HttpServletRequest) _jspx_page_context.getRequest();
    HttpServletResponse response = (HttpServletResponse) _jspx_page_context.getResponse();
    HttpSession session = _jspx_page_context.getSession();
    ServletContext application = _jspx_page_context.getServletContext();
    ServletConfig config = _jspx_page_context.getServletConfig();
    JspWriter out = jspContext.getOut();
    if( getHeader() != null ) {
      _jspx_page_context.setAttribute("header", getHeader());
}
    if( getFooter() != null ) {
      _jspx_page_context.setAttribute("footer", getFooter());
}

    try {
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("    <title>e-Commerce - Signup Page</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap Core CSS -->\n");
      out.write("    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom CSS -->\n");
      out.write("    <link href=\"css/shop-homepage.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("    <!--[if lt IE 9]>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n");
      out.write("    <![endif]-->\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("    <!-- Navigation -->\n");
      out.write("    <nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("                <a class=\"navbar-brand\" href=\"#\">Start Bootstrap</a>\n");
      out.write("            </div>\n");
      out.write("            <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"bs-example-navbar-collapse-1\">\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\">About</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\">Services</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"#\">Contact</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"/e-Commerce/signup.jsp\">Signup</a>\n");
      out.write("                    </li>\n");
      out.write("                    \n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"loginUserPassword\">\n");
      out.write("                <form action=\"User\" method=\"post\">\n");
      out.write("                    <input class=\"loginUserPasswordinput\" type=\"text\" name=\"UserName\" placeholder=\"User Name\">\n");
      out.write("                    <input class=\"loginUserPasswordinput\" type=\"text\" name=\"Password\" placeholder=\"Password\">\n");
      out.write("                    <input class=\"loginUserPasswordSubmit\" type=\"submit\" value=\"Login\">                            \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.navbar-collapse -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /.container -->\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("    <!-- Page Content -->\n");
      out.write("    <div class=\"container\">\n");
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("\n");
      out.write("            <div class=\"col-md-3\">\n");
      out.write("                <p class=\"lead\">Shop Name</p>\n");
      out.write("                <div class=\"list-group\">\n");
      out.write("                    <a href=\"#\" class=\"list-group-item\">Category 1</a>\n");
      out.write("                    <a href=\"#\" class=\"list-group-item\">Category 2</a>\n");
      out.write("                    <a href=\"#\" class=\"list-group-item\">Category 3</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-md-9\">\n");
      out.write("\n");
      out.write("                <div class=\"row carousel-holder\">\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div id=\"carousel-example-generic\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                            <ol class=\"carousel-indicators\">\n");
      out.write("                                <li data-target=\"#carousel-example-generic\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                                <li data-target=\"#carousel-example-generic\" data-slide-to=\"1\"></li>\n");
      out.write("                                <li data-target=\"#carousel-example-generic\" data-slide-to=\"2\"></li>\n");
      out.write("                            </ol>\n");
      out.write("                            <div class=\"carousel-inner\">\n");
      out.write("                                <div class=\"item active\">\n");
      out.write("                                    <img class=\"slide-image\" src=\"http://placehold.it/800x300\" alt=\"\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"item\">\n");
      out.write("                                    <img class=\"slide-image\" src=\"http://placehold.it/800x300\" alt=\"\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"item\">\n");
      out.write("                                    <img class=\"slide-image\" src=\"http://placehold.it/800x300\" alt=\"\">\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <a class=\"left carousel-control\" href=\"#carousel-example-generic\" data-slide=\"prev\">\n");
      out.write("                                <span class=\"glyphicon glyphicon-chevron-left\"></span>\n");
      out.write("                            </a>\n");
      out.write("                            <a class=\"right carousel-control\" href=\"#carousel-example-generic\" data-slide=\"next\">\n");
      out.write("                                <span class=\"glyphicon glyphicon-chevron-right\"></span>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("\n");
      out.write("                    <div class=\"col-sm-4 col-lg-4 col-md-4\">\n");
      out.write("                        <div class=\"thumbnail\">\n");
      out.write("                            <img src=\"http://placehold.it/320x150\" alt=\"\">\n");
      out.write("                            <div class=\"caption\">\n");
      out.write("                                <h4 class=\"pull-right\">$24.99</h4>\n");
      out.write("                                <h4><a href=\"#\">First Product</a>\n");
      out.write("                                </h4>\n");
      out.write("                                <p>See more snippets like this online store item at <a target=\"_blank\" href=\"http://www.bootsnipp.com\">Bootsnipp - http://bootsnipp.com</a>.</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"ratings\">\n");
      out.write("                                <p class=\"pull-right\">15 reviews</p>\n");
      out.write("                                <p>\n");
      out.write("                                    <span class=\"glyphicon glyphicon-star\"></span>\n");
      out.write("                                    <span class=\"glyphicon glyphicon-star\"></span>\n");
      out.write("                                    <span class=\"glyphicon glyphicon-star\"></span>\n");
      out.write("                                    <span class=\"glyphicon glyphicon-star\"></span>\n");
      out.write("                                    <span class=\"glyphicon glyphicon-star\"></span>\n");
      out.write("                                </p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-sm-4 col-lg-4 col-md-4\">\n");
      out.write("                        <div class=\"thumbnail\">\n");
      out.write("                            <img src=\"http://placehold.it/320x150\" alt=\"\">\n");
      out.write("                            <div class=\"caption\">\n");
      out.write("                                <h4 class=\"pull-right\">$64.99</h4>\n");
      out.write("                                <h4><a href=\"#\">Second Product</a>\n");
      out.write("                                </h4>\n");
      out.write("                                <p>This is a short description. Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"ratings\">\n");
      out.write("                                <p class=\"pull-right\">12 reviews</p>\n");
      out.write("                                <p>\n");
      out.write("                                    <span class=\"glyphicon glyphicon-star\"></span>\n");
      out.write("                                    <span class=\"glyphicon glyphicon-star\"></span>\n");
      out.write("                                    <span class=\"glyphicon glyphicon-star\"></span>\n");
      out.write("                                    <span class=\"glyphicon glyphicon-star\"></span>\n");
      out.write("                                    <span class=\"glyphicon glyphicon-star-empty\"></span>\n");
      out.write("                                </p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-sm-4 col-lg-4 col-md-4\">\n");
      out.write("                        <div class=\"thumbnail\">\n");
      out.write("                            <img src=\"http://placehold.it/320x150\" alt=\"\">\n");
      out.write("                            <div class=\"caption\">\n");
      out.write("                                <h4 class=\"pull-right\">$74.99</h4>\n");
      out.write("                                <h4><a href=\"#\">Third Product</a>\n");
      out.write("                                </h4>\n");
      out.write("                                <p>This is a short description. Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"ratings\">\n");
      out.write("                                <p class=\"pull-right\">31 reviews</p>\n");
      out.write("                                <p>\n");
      out.write("                                    <span class=\"glyphicon glyphicon-star\"></span>\n");
      out.write("                                    <span class=\"glyphicon glyphicon-star\"></span>\n");
      out.write("                                    <span class=\"glyphicon glyphicon-star\"></span>\n");
      out.write("                                    <span class=\"glyphicon glyphicon-star\"></span>\n");
      out.write("                                    <span class=\"glyphicon glyphicon-star-empty\"></span>\n");
      out.write("                                </p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-sm-4 col-lg-4 col-md-4\">\n");
      out.write("                        <div class=\"thumbnail\">\n");
      out.write("                            <img src=\"http://placehold.it/320x150\" alt=\"\">\n");
      out.write("                            <div class=\"caption\">\n");
      out.write("                                <h4 class=\"pull-right\">$84.99</h4>\n");
      out.write("                                <h4><a href=\"#\">Fourth Product</a>\n");
      out.write("                                </h4>\n");
      out.write("                                <p>This is a short description. Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"ratings\">\n");
      out.write("                                <p class=\"pull-right\">6 reviews</p>\n");
      out.write("                                <p>\n");
      out.write("                                    <span class=\"glyphicon glyphicon-star\"></span>\n");
      out.write("                                    <span class=\"glyphicon glyphicon-star\"></span>\n");
      out.write("                                    <span class=\"glyphicon glyphicon-star\"></span>\n");
      out.write("                                    <span class=\"glyphicon glyphicon-star-empty\"></span>\n");
      out.write("                                    <span class=\"glyphicon glyphicon-star-empty\"></span>\n");
      out.write("                                </p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-sm-4 col-lg-4 col-md-4\">\n");
      out.write("                        <div class=\"thumbnail\">\n");
      out.write("                            <img src=\"http://placehold.it/320x150\" alt=\"\">\n");
      out.write("                            <div class=\"caption\">\n");
      out.write("                                <h4 class=\"pull-right\">$94.99</h4>\n");
      out.write("                                <h4><a href=\"#\">Fifth Product</a>\n");
      out.write("                                </h4>\n");
      out.write("                                <p>This is a short description. Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"ratings\">\n");
      out.write("                                <p class=\"pull-right\">18 reviews</p>\n");
      out.write("                                <p>\n");
      out.write("                                    <span class=\"glyphicon glyphicon-star\"></span>\n");
      out.write("                                    <span class=\"glyphicon glyphicon-star\"></span>\n");
      out.write("                                    <span class=\"glyphicon glyphicon-star\"></span>\n");
      out.write("                                    <span class=\"glyphicon glyphicon-star\"></span>\n");
      out.write("                                    <span class=\"glyphicon glyphicon-star-empty\"></span>\n");
      out.write("                                </p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-sm-4 col-lg-4 col-md-4\">\n");
      out.write("                        <h4><a href=\"#\">Like this template?</a>\n");
      out.write("                        </h4>\n");
      out.write("                        <p>If you like this template, then check out <a target=\"_blank\" href=\"http://maxoffsky.com/code-blog/laravel-shop-tutorial-1-building-a-review-system/\">this tutorial</a> on how to build a working review system for your online store!</p>\n");
      out.write("                        <a class=\"btn btn-primary\" target=\"_blank\" href=\"http://maxoffsky.com/code-blog/laravel-shop-tutorial-1-building-a-review-system/\">View Tutorial</a>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!-- /.container -->\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("\n");
      out.write("        <hr>\n");
      out.write("\n");
      out.write("        <!-- Footer -->\n");
      out.write("        <footer>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-lg-12\">\n");
      out.write("                    <p>Copyright &copy; e-Commerce 2014</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!-- /.container -->\n");
      out.write("\n");
      out.write("    <!-- jQuery -->\n");
      out.write("    <script src=\"js/jquery.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap Core JavaScript -->\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch( Throwable t ) {
      if( t instanceof SkipPageException )
          throw (SkipPageException) t;
      if( t instanceof java.io.IOException )
          throw (java.io.IOException) t;
      if( t instanceof IllegalStateException )
          throw (IllegalStateException) t;
      if( t instanceof JspException )
          throw (JspException) t;
      throw new JspException(t);
    } finally {
      ((org.apache.jasper.runtime.JspContextWrapper) jspContext).syncEndTagFile();
    }
  }
}
