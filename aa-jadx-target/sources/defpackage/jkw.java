package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class jkw extends defpackage.jhj {
    final /* synthetic */ defpackage.jkr a;
    final /* synthetic */ defpackage.jkx b;

    public jkw(defpackage.jkx jkxVar, defpackage.jkr jkrVar) {
        this.a = jkrVar;
        this.b = jkxVar;
    }

    @Override // defpackage.jhk
    public final java.lang.String a() {
        return "WatermarkHandler";
    }

    @Override // defpackage.jhj, defpackage.jhk
    public final void b(defpackage.jhl jhlVar) {
        defpackage.jkr jkrVar = this.a;
        jkrVar.K(jhlVar, false);
        jkrVar.M(new defpackage.imx(jhlVar, this.b.c, jkrVar, 5, (short[]) null));
    }

    @Override // defpackage.jhj, defpackage.jhk
    public final void e(defpackage.jhl jhlVar, int i, int i2) {
        android.util.Size size = new android.util.Size(i, i2);
        defpackage.jkx jkxVar = this.b;
        jkxVar.c = size;
        android.util.Size size2 = jkxVar.c;
        defpackage.jkr jkrVar = this.a;
        jkrVar.M(new defpackage.imx(jhlVar, size2, jkrVar, 5, (short[]) null));
        jkrVar.q(jhlVar);
    }

    @Override // defpackage.jhj, defpackage.jhk
    public final void f(defpackage.jhl jhlVar, android.view.KeyEvent keyEvent) {
        throw new java.lang.IllegalStateException("Key event in watermark window");
    }

    @Override // defpackage.jhj, defpackage.jhk
    public final void g(defpackage.jhl jhlVar, android.view.MotionEvent motionEvent) {
        throw new java.lang.IllegalStateException("Motion event in watermark window");
    }

    @Override // defpackage.jhj, defpackage.jhk
    public final void i(defpackage.jhl jhlVar, com.google.android.gms.car.InputFocusChangedEvent inputFocusChangedEvent) {
        throw new java.lang.IllegalStateException("Watermark window received focus");
    }
}
