package com.example.demo_02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Fortune 
{
	@GetMapping( "/fortune" )
	public String start() {
		double fn = Math.random();		//0.0～1.0までの乱数を生成
		if( fn >= 0.7 ) {
			return( "greatFortune.html" );
		}else if ( fn >= 0.4 ) {
			return( "middleFortune.html" );
		}else if ( fn >= 0.1 ) {
			return( "smallFortune.html" );
		} else{
			return( "misFortune.html" );	
		}			
	}    		
}