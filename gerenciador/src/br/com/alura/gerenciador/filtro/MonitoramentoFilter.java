package br.com.alura.gerenciador.filtro;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//@WebFilter(urlPatterns = "/entrada")
public class MonitoramentoFilter implements Filter {
    @Override
    public void destroy() {
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	System.out.println("Monitoramento  ->>>-  Filter");
	long start = System.currentTimeMillis();
	String acao = request.getParameter("acao");
	chain.doFilter(request, response);

	long end = System.currentTimeMillis();
	System.out.println((end - start) + " milisegundos " + acao + " ");
    }

}
