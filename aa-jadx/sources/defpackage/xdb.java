package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xdb implements android.view.ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ xdb(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        int i = this.b;
        java.lang.Object obj = this.a;
        if (i != 0) {
            ((defpackage.mhl) obj).F();
        } else {
            ((defpackage.xdc) obj).f();
        }
    }
}
