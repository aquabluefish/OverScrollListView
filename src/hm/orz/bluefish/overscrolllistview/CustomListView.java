package hm.orz.bluefish.overscrolllistview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

public class CustomListView extends ListView {

	private int maxOverScrollY = 0;

	public CustomListView(Context context) {
		super(context);
	}

	public CustomListView(Context context, AttributeSet attrs) {
		super(context, attrs);
		this.maxOverScrollY = attrs.getAttributeIntValue(null, "maxOverScrollY", 0);    }

	public CustomListView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		this.maxOverScrollY = attrs.getAttributeIntValue(null, "maxOverScrollY", 0);    }


	@Override
	protected boolean overScrollBy(int deltaX, int deltaY, int scrollX, int scrollY,
			int scrollRangeX, int scrollRangeY, int maxOverScrollX, int maxOverScrollY, boolean isTouchEvent) {
		return super.overScrollBy(deltaX, deltaY, scrollX, scrollY,
				scrollRangeX, scrollRangeY, maxOverScrollX, this.maxOverScrollY, isTouchEvent);
	}
}
