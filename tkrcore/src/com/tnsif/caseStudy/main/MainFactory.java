package com.tnsif.caseStudy.main;

import com.tnsif.caseStudy.application.GSNormalAcc;
import com.tnsif.caseStudy.application.GSPrimeAcc;

public class MainFactory {

	public static void main(String[] args) {
		GSPrimeAcc gsprime = new GSPrimeAcc(1,"mahesh",1953.3f,true);
		GSNormalAcc gsnormal = new GSNormalAcc(2,"shiva",2499.8f,45.9f);

		gsprime.bookProduct(990.0f);
		gsnormal.bookProduct(299.0f);
	}

}


