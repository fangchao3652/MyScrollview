package com.example.testscrollview;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;

public class MainActivity extends Activity implements ScrollviewListener{
Myscrollview scrollView;
ImageView imageView;
RelativeLayout layout;
//Myscrollview scrollView_img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scrollView=(Myscrollview) findViewById(R.id.scrollview);
     //   scrollView_img=(Myscrollview) findViewById(R.id.scrollview_img);
        scrollView.setScrollViewListener(this);
      
       // scrollView_img.setScrollViewListener(this);
        layout=(RelativeLayout) findViewById(R.id.layout);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }


	@Override
	public void onScrollChanged(Myscrollview scrollView1, int x, int y,
			int oldx, int oldy) {
		Log.e("fc", x+"  "+y);
            layout.scrollTo(x, -y/3);  
	
        /* else if(scrollView1 == scrollView_img) {  
            scrollView.scrollTo(x, y*3);  
        }  */
		
	}
    
}
