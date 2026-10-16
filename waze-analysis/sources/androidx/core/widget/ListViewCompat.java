package androidx.core.widget;

import android.widget.ListView;
import androidx.annotation.ReplaceWith;

/* compiled from: WazeSource */
@Deprecated
/* loaded from: classes3.dex */
public final class ListViewCompat {
    private ListViewCompat() {
    }

    @ReplaceWith(expression = "listView.canScrollList(direction)")
    @Deprecated
    public static boolean canScrollList(ListView listView, int i2) {
        return listView.canScrollList(i2);
    }

    @ReplaceWith(expression = "listView.scrollListBy(y)")
    @Deprecated
    public static void scrollListBy(ListView listView, int i2) {
        listView.scrollListBy(i2);
    }
}
