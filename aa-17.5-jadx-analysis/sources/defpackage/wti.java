package defpackage;

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* loaded from: classes3.dex */
public final /* synthetic */ class wti implements View.OnFocusChangeListener {
    private final /* synthetic */ int a;

    public /* synthetic */ wti(int i) {
        this.a = i;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        InputMethodManager inputMethodManagerG;
        if (this.a != 0 || z || (inputMethodManagerG = woy.G(view)) == null) {
            return;
        }
        inputMethodManagerG.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}
