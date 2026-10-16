package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class bcp implements defpackage.afer {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ bcp(defpackage.affc affcVar, boolean z, int i) {
        this.c = i;
        this.b = affcVar;
        this.a = z;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [affc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v10, types: [bwx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [afer, java.lang.Object] */
    @Override // defpackage.afer
    public final java.lang.Object invoke() {
        int i = this.c;
        if (i == 0) {
            this.b.invoke(java.lang.Boolean.valueOf(!this.a));
            return defpackage.afbk.a;
        }
        if (i == 1) {
            defpackage.alu aluVar = defpackage.amb.a;
            if (this.a) {
                this.b.invoke();
            }
            return defpackage.afbk.a;
        }
        boolean z = this.a;
        if (i != 2) {
            if (z) {
                this.b.b(java.lang.Boolean.valueOf(true));
            }
            return defpackage.afbk.a;
        }
        if (z) {
            ((defpackage.nne) this.b).f.invoke();
        }
        return defpackage.afbk.a;
    }

    public /* synthetic */ bcp(boolean z, java.lang.Object obj, int i) {
        this.c = i;
        this.a = z;
        this.b = obj;
    }
}
