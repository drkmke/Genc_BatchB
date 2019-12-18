package com.cognizant.zuulgateway;

import com.netflix.zuul.ZuulFilter;

public class SimpleFilter extends ZuulFilter{

	public Object run() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";
	}

}
