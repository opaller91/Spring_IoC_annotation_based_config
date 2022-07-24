package atm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("bean.xml"); //ใช้อันนี้กรณีที่ทำแบบ annotation-base
        //ไปเรียกbean.xml เพราะในbean.xmlบอกว่าเป็นการทำแบบannotation บอกpackage

        AtmUI atmUI = context.getBean(AtmUI.class);//ใช้สร้างobjectแทนการnew
        atmUI.run();
    }
}
