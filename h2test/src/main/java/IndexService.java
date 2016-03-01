

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.scd.miaoqian.h2.service.IIndexService;

@ContextConfiguration(locations={"classpath:applicationContext-bean.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
//If true does not change the data in the database, if false will change the data
@TransactionConfiguration(transactionManager="transactionManager",defaultRollback=true)
public class IndexService {
	
	@Autowired
	private IIndexService indexService;
	
	@Test
	public void TestIndex(){
		
		indexService.doIndex();
	}

}