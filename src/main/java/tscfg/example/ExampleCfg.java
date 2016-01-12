// auto-generated by tscfg 0.1.4 on Mon Jan 11 23:31:01 PST 2016

package tscfg.example;

import com.typesafe.config.Config;

public class ExampleCfg {
  public final Endpoint endpoint;
  public static class Endpoint {
    public final int intReq;
    public final Interface interface_;
    public static class Interface {
      public final int port;
      public Interface(Config c) {
        this.port = c.hasPathOrNull("port") ? c.getInt("port") : 8080; // "int | 8080"
      }
      public String toString() { return toString(""); }
      public String toString(String i) {
      return i+ "port = " + this.port + "\n";
      }
    }
    public final String path;
    public final Integer serial;
    public final String url;
    public Endpoint(Config c) {
      this.intReq = c.getInt("intReq"); // "int"
      this.interface_ = new Interface(c.getConfig("interface"));
      this.path = c.getString("path"); // "string"
      this.serial = c.hasPathOrNull("serial") ? Integer.valueOf(c.getInt("serial")) : null; // "int?"
      this.url = c.hasPathOrNull("url") ? c.getString("url") : "http://example.net"; // "String | http://example.net"
    }
    public String toString() { return toString(""); }
    public String toString(String i) {
    return i+ "intReq = " + this.intReq + "\n"
          +i+ "interface_ {\n" + this.interface_.toString(i+"    ") +i+ "}\n"
          +i+ "path = " + (this.path == null ? null : '"' + this.path + '"') + "\n"
          +i+ "serial = " + this.serial + "\n"
          +i+ "url = " + (this.url == null ? null : '"' + this.url + '"') + "\n";
    }
  }
  public ExampleCfg(Config c) {
    this.endpoint = new Endpoint(c.getConfig("endpoint"));
  }
  public String toString() { return toString(""); }
  public String toString(String i) {
  return i+ "endpoint {\n" + this.endpoint.toString(i+"    ") +i+ "}\n";
  }
}
