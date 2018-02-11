import java.util.GregorianCalendar;
import java.util.Calendar;

public class MemberTest
{
    public static void main(String[] args){
        Member member1;

        member1 = new Member("MB-001", "สุภาพ เรียบร้อย", new GregorianCalendar(2019, Calendar.FEBRUARY, 12));
        System.out.println(member1.toString());
        System.out.println("\n");

        // add point
        member1.addPoint(200);
        System.out.println("เพิ่มแต้ม 200 แต้ม == > แต้มสะสม = " + member1.getPoint());

        // redeem point
        member1.redeemPoint(50);
        System.out.println("ตัดแต้ม: 50 แต้ม == > แต้มสะสม = " + member1.getPoint());

        // change expiry date
        member1.setExpiryDate(new GregorianCalendar(2019, Calendar.JUNE, 30));

        // show object data
        System.out.println("รหัสสมาชิก : " + member1.getMemberId());
        System.out.println("ชื่อสมาชิก : " + member1.getMemberName());
        System.out.println(String.format("วันหมดอายุ: %1$td/%1$tm/%1$ty", member1.getExpiryDate()));
        System.out.println(String.format("แตัมสะสม: %5d", member1.getPoint()));
    } // end main
} // end MemberTest
