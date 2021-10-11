package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       ImageView imageView1  = (ImageView) findViewById(R.id.imageView1);
       ImageView imageView2  = (ImageView) findViewById(R.id.imageView2);
       ImageView imageView3  = (ImageView) findViewById(R.id.imageView3);




        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Cafedetail.class);
                intent.putExtra("Cafename", "สถานที่แรกคือ ไร่สิงห์ปาร์ค ," +
                        "ไร่สิงห์ปาร์ค เชียงราย หรือที่คุ้นกันในชื่อไร่บุญรอด ที่นี่ถือเป็นสถานที่ท่องเที่ยวเชิงเกษตรที่ใหญ่ที่สุดในประเทศไทย กับพื้นที่กว่า 8,000 ไร่ เพลิดเพลินไปกับทัวร์ฟาร์มสิงห์ปาร์ค ชมสวนสัตว์สายพันธ์แอฟริกัน ปั่นจักรยานชมธรรมชาติแบบใกล้ชิด กิจกรรมผจญภัย และการแข่งขันกีฬาตลอดทั้งปีอีกมากมาย ส่วนจุดที่น่าสนใจภายในไร่ ได้แก่ จุดบริการรถฟาร์มทัวร์ ร่วมสัมผัสบรรยากาศและธรรมชาติที่โอบล้อมด้วยภูเขา ตระการตากับไร่ชาและสวนผลไม้นานาชนิด, ทุ่งดอกคอสมอส และสระหงส์ หรือจะไปสร้างความตื่นเต้น ณ หอซิปไลน์ หน้าผาจำลอง และซิปไลน์ชมไร่ชาท่ามกลางวิว 360 องศา ก่อนจะไปรับประทานอาหารอร่อย ๆ ที่ร้านอาหารภูภิรมย์");
                intent.putExtra("CafeImg", "baanna");
                startActivity(intent);
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Cafedetail.class);
                intent.putExtra("Cafename", "สถานที่สองที่แนะนำคือ  ภูชี้ฟ้า ," +
                        "เป็นที่ร่ำลือกันว่า \"ภูชี้ฟ้า\" เหมาะสำหรับเป็นจุดชมและถ่ายรูปพระอาทิตย์ขึ้นและตกดินที่สวยที่สุดแห่งหนึ่งของประเทศ โดยเฉพาะอย่างยิ่งในช่วงฤดูหนาว ที่นี่จะสวยมากเป็นพิเศษ นอกเหนือจากวิวทัศน์สวย ๆ แล้ว ไม่แน่ว่าระหว่างทางที่เดินขึ้นไป นักท่องเที่ยวอาจจะได้เจอเข้ากับดอกนางพญาเสือโคร่งและต้นเสี้ยวดอกขาว ซึ่งจะออกดอกบานสะพรั่งในช่วงเดือนมกราคม-กุมภาพันธ์ ความโดดเด่นของภูชี้ฟ้าเห็นจะเป็นหน้าผาหินคล้ายนิ้วชี้ ปกคลุมด้วยหญ้า ไม้พุ่ม และโขดหิน ซึ่งเป็นจุดที่นักท่องเที่ยวนิยมถ่ายรูปเป็นอย่างมาก เพราะจะเห็นสายหมอกที่ลอยละล่องกลางหุบเขางดงามเกินบรรยาย");
                intent.putExtra("CafeImg", "boonsri");
                startActivity(intent);
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Cafedetail.class);
                intent.putExtra("Cafename", "สถานที่3คือ วัดร่องขุ่น ," +
                        "  วัดที่มีชื่อเสียงโด่งดังอีกแห่งหนึ่งของจังหวัดเชียงราย อยู่ในท้องที่ตำบลป่าอ้อดอนชัย อำเภอเมือง ออกแบบและก่อสร้างโดย อาจารย์เฉลิมชัย โฆษิตพิพัฒน์ เมื่อ พ.ศ. 2540 บนพื้นที่เดิมของวัด 3 ไร่ และขยายออกเป็น 12 ไร่ พระอุโบสถสีขาวตกแต่งด้วยลวดลายกระจกสีเงินแวววาว เป็นเชิงชั้นลดหลั่นกันไป หน้าบันประดับด้วยพญานาค ภาพจิตรกรรมฝาผนังภายในพระอุโบสถและห้องแสดงภาพวาดน่าสนใจมาก");
                intent.putExtra("CafeImg", "honeymoon");
                startActivity(intent);
            }
        });



    }
}