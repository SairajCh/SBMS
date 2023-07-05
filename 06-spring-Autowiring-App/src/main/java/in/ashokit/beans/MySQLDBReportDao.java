package in.ashokit.beans;

import org.springframework.stereotype.Repository;

@Repository("rdao")
public class MySQLDBReportDao implements ReportDao {

	public void getData() {
		// TODO Auto-generated method stub
		System.out.println("getting data from mysql db..");

	}

}
