package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class jzq implements defpackage.bvu {
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public jzq(java.lang.Object obj, java.lang.Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [eqg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.ViewTreeObserver$OnWindowFocusChangeListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [eqf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.bvu
    public final void a() {
        int i = this.c;
        if (i == 0) {
            java.lang.Object obj = this.a;
            if (obj != null) {
                android.view.ViewTreeObserver viewTreeObserver = (android.view.ViewTreeObserver) obj;
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnWindowFocusChangeListener(this.b);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 1) {
            this.a.getLifecycle().d(this.b);
            return;
        }
        if (i == 2) {
            this.a.remove(this.b);
            return;
        }
        java.lang.Object obj2 = this.b;
        obj2.getClass();
        defpackage.afga.bq(((defpackage.khb) this.a).a, new defpackage.kgo(obj2, 15));
    }
}
