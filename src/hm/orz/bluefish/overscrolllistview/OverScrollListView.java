package hm.orz.bluefish.overscrolllistview;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class OverScrollListView extends ListActivity {

    String[] mData = {
            "Apple",
            "Banana",
            "Grape",
            "Lemon",
            "Melon",
            "Orange",
            "Peach",
            "Water Melon",
        };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.list, R.id.list_textView1, mData);
        setListAdapter(adapter);
    }
}
