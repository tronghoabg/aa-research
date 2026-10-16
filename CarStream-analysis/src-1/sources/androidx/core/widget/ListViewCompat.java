package androidx.core.widget;

import android.widget.ListView;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class ListViewCompat {
    private ListViewCompat() {
    }

    public static boolean canScrollList(ListView listView, int i) {
        return listView.canScrollList(i);
    }

    public static void scrollListBy(ListView listView, int i) {
        listView.scrollListBy(i);
    }
}
