package WindowsListService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import com.zj.spring.condition.LinuxCondition;
import com.zj.spring.condition.LinuxListService;
import com.zj.spring.condition.ListService;
import com.zj.spring.condition.WindowsCondition;
import com.zj.spring.condition.WindowsListService;

@Configuration
public class ConditionConfig {
	@Bean
	@Conditional(WindowsCondition.class)  //符合Windows条件则实例化WindowsListService
	public ListService windowsListService(){
		return new WindowsListService();
	}
	
	@Bean
	@Conditional(LinuxCondition.class)  //符合Linux条件则实例化LinuxListService
	public ListService linuxListService(){
		return new LinuxListService();
	}
}
