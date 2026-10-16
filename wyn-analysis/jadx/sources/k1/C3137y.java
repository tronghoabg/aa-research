package k1;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* renamed from: k1.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3137y {

    /* renamed from: a, reason: collision with root package name */
    public final View f38882a;

    public void a() {
        View view = this.f38882a;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
}
