package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import com.google.android.material.search.SearchView;

/* loaded from: classes2.dex */
public final class rbw implements ViewTreeObserver.OnTouchModeChangeListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public rbw(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
    public final void onTouchModeChanged(boolean z) {
        View view;
        EditText editText;
        int i = this.b;
        if (i == 0) {
            Object obj = this.a;
            View view2 = (View) obj;
            view2.getViewTreeObserver().removeOnTouchModeChangeListener(this);
            view2.getViewTreeObserver().addOnPreDrawListener(new fez(obj, 7));
            return;
        }
        if (i == 1) {
            if (z || (view = ((hlf) this.a).l) == null) {
                return;
            }
            view.requestFocus();
            return;
        }
        if (z) {
            return;
        }
        SearchView searchView = (SearchView) this.a;
        if (!searchView.hasWindowFocus() || !searchView.k() || (editText = searchView.k) == null || editText.isFocused()) {
            return;
        }
        editText.post(new wil(editText, 12));
    }
}
