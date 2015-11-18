package cn.lightsky.infiniteindicator.viewpager;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;

public class DisallowParentTouchViewPager extends ViewPager {

	private ViewGroup parent;

	public DisallowParentTouchViewPager(Context context) {
		super(context);
	}

	public DisallowParentTouchViewPager(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public void setNestParent(ViewGroup parent) {
		this.parent = parent;
	}

	float x1;
	float y1;
	float x2;
	float y2;

	@Override
	public boolean dispatchTouchEvent(MotionEvent ev) {
		if (parent != null) {
			//parent.requestDisallowInterceptTouchEvent(true);

			if (ev.getAction() == MotionEvent.ACTION_DOWN) {
				// 当手指按下的时候
				x1 = ev.getX();
				y1 = ev.getY();
			}
			if (ev.getAction() == MotionEvent.ACTION_UP) {
				// 当手指离开的时候
				x2 = ev.getX();
				y2 = ev.getY();
				if (x1 - x2 > 50) {
					parent.requestDisallowInterceptTouchEvent(true);
				} else if (x2 - x1 > 50) {
					parent.requestDisallowInterceptTouchEvent(true);
				}
				System.out.println("111111");
			}else{
				parent.requestDisallowInterceptTouchEvent(false);
				System.out.println("222222222");
			}
		}
		return super.dispatchTouchEvent(ev);
	}

	@Override
	public boolean onInterceptTouchEvent(MotionEvent ev) {
		if (parent != null) {
			//parent.requestDisallowInterceptTouchEvent(true);
			if (ev.getAction() == MotionEvent.ACTION_DOWN) {
				// 当手指按下的时候
				x1 = ev.getX();
				y1 = ev.getY();
			}
			if (ev.getAction() == MotionEvent.ACTION_UP) {
				// 当手指离开的时候
				x2 = ev.getX();
				y2 = ev.getY();
				if (x1 - x2 > 50) {
					parent.requestDisallowInterceptTouchEvent(true);
				} else if (x2 - x1 > 50) {
					parent.requestDisallowInterceptTouchEvent(true);
				}
				System.out.println("111111");
			}else{
				parent.requestDisallowInterceptTouchEvent(false);
				System.out.println("222222222");
			}
		}
		return super.onInterceptTouchEvent(ev);
	}

	@Override
	public boolean onTouchEvent(MotionEvent ev) {
		if (parent != null) {
			//parent.requestDisallowInterceptTouchEvent(true);
			
			if (ev.getAction() == MotionEvent.ACTION_DOWN) {
				// 当手指按下的时候
				x1 = ev.getX();
				y1 = ev.getY();
			}
			if (ev.getAction() == MotionEvent.ACTION_UP) {
				// 当手指离开的时候
				x2 = ev.getX();
				y2 = ev.getY();
				if (x1 - x2 > 50) {
					parent.requestDisallowInterceptTouchEvent(true);
				} else if (x2 - x1 > 50) {
					parent.requestDisallowInterceptTouchEvent(true);
				}
				System.out.println("111111");
			}else{
				parent.requestDisallowInterceptTouchEvent(false);
				System.out.println("222222222");
			}
		}
		return super.onTouchEvent(ev);
	}
}