package o;

import android.view.ActionMode;
import android.view.SearchEvent;
import android.view.Window;

/* renamed from: o.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3630k {
    public static boolean a(Window.Callback callback, SearchEvent searchEvent) {
        return callback.onSearchRequested(searchEvent);
    }

    public static ActionMode b(Window.Callback callback, ActionMode.Callback callback2, int i5) {
        return callback.onWindowStartingActionMode(callback2, i5);
    }
}
