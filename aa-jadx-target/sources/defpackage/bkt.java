package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class bkt implements defpackage.afer {
    public final /* synthetic */ int a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ bkt(int i, defpackage.afer aferVar, int i2) {
        this.c = i2;
        this.a = i;
        this.b = aferVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [afer, java.lang.Object] */
    @Override // defpackage.afer
    public final java.lang.Object invoke() {
        if (this.c == 0) {
            return java.lang.Integer.valueOf(((defpackage.bkl) this.b).d.g(this.a));
        }
        defpackage.bbz bbzVar = defpackage.bca.a;
        return new defpackage.bau(this.a, 0.0f, this.b);
    }

    public /* synthetic */ bkt(defpackage.bkl bklVar, int i, int i2) {
        this.c = i2;
        this.b = bklVar;
        this.a = i;
    }
}
