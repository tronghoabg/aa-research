package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wuf implements android.view.View.OnFocusChangeListener {
    private final /* synthetic */ int a;

    public /* synthetic */ wuf(int i) {
        this.a = i;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View view, boolean z) {
        android.view.inputmethod.InputMethodManager inputMethodManagerG;
        if (this.a != 0 || z || (inputMethodManagerG = defpackage.wqn.g(view)) == null) {
            return;
        }
        inputMethodManagerG.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}
