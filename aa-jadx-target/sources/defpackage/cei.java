package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class cei implements defpackage.ceg {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ cei(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.ceg
    public final void a() {
        if (this.b == 0) {
            throw null;
        }
        java.lang.Object obj = this.a;
        synchronized (defpackage.cer.b) {
            defpackage.cer.f = defpackage.afga.aP(defpackage.cer.f, obj);
        }
    }
}
