package hm.orz.bluefish.overscrolllistview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

public class CustomListView extends ListView {

 private int mOverscrollDistance = 200;

    public CustomListView(Context context) {
        super(context);
    }

    public CustomListView(Context context, AttributeSet attrs) {
     super(context, attrs);
    }

    public CustomListView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }


 @Override
 protected boolean overScrollBy(int deltaX, int deltaY, int scrollX, int scrollY, int scrollRangeX, int scrollRangeY, int maxOverScrollX, int maxOverScrollY, boolean isTouchEvent) {
  return super.overScrollBy(deltaX, deltaY, scrollX, scrollY, scrollRangeX, scrollRangeY, maxOverScrollX, mOverscrollDistance, isTouchEvent);
 }
}
