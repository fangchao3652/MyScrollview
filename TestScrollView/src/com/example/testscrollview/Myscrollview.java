package com.example.testscrollview;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.ScrollView;

public class Myscrollview extends ScrollView {

	 private ScrollviewListener scrollViewListener = null;  

	public Myscrollview(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
	}

	public Myscrollview(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	public Myscrollview(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void computeScroll() {
		// TODO Auto-generated method stub
		super.computeScroll();
	}

	@Override
	public void fling(int velocityY) {
		
		super.fling(velocityY);
	}

	  public void setScrollViewListener(ScrollviewListener scrollViewListener) {  
	        this.scrollViewListener = scrollViewListener;  
	    }  
	  
	
	  @Override
	protected void onScrollChanged(int x, int y, int oldx, int oldy) {
		// TODO Auto-generated method stub
		//super.onScrollChanged(x,y,oldx,oldy);
		
		if(scrollViewListener != null) {  
            scrollViewListener.onScrollChanged(this, x, y, oldx, oldy);  
        }  
	}
}
