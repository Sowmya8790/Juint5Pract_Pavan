package Tests;



import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
//@SelectPackages({"Annotations","Tests"})
//@SelectClasses(Tests.test.class)
@IncludeTags("sanity")
public class RunnerClass {
	
	

}
