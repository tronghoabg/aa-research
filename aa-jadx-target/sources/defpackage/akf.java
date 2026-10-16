package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class akf extends defpackage.cwo implements defpackage.cwu {
    private final defpackage.aiz a;
    private final defpackage.ajv b;
    private final defpackage.avv c;

    public akf(defpackage.cwn cwnVar, defpackage.aiz aizVar, defpackage.ajv ajvVar, defpackage.avv avvVar) {
        this.a = aizVar;
        this.b = ajvVar;
        this.c = avvVar;
        W(cwnVar);
    }

    private static final boolean d(float f, long j, android.widget.EdgeEffect edgeEffect, android.graphics.Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f);
        canvas.translate(java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (4294967295L & j)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // defpackage.cwu
    public final void b(defpackage.cxn cxnVar) {
        boolean zD;
        defpackage.aiz aizVar = this.a;
        aizVar.i(cxnVar.o());
        if (defpackage.cjl.d(cxnVar.o())) {
            cxnVar.q();
            return;
        }
        cxnVar.q();
        aizVar.c.a();
        android.graphics.Canvas canvasA = defpackage.cjn.a(cxnVar.r().b());
        defpackage.ajv ajvVar = this.b;
        if (ajvVar.l()) {
            zD = d(270.0f, (((long) java.lang.Float.floatToRawIntBits(cxnVar.dI(this.c.b(cxnVar.p())))) & 4294967295L) | (((long) java.lang.Float.floatToRawIntBits(-java.lang.Float.intBitsToFloat((int) (cxnVar.o() & 4294967295L)))) << 32), ajvVar.c(), canvasA);
        } else {
            zD = false;
        }
        if (ajvVar.r()) {
            zD = d(0.0f, ((long) java.lang.Float.floatToRawIntBits(cxnVar.dI(((defpackage.avx) this.c).a))) & 4294967295L, ajvVar.g(), canvasA) || zD;
        }
        if (ajvVar.o()) {
            zD = d(90.0f, ((long) java.lang.Float.floatToRawIntBits((-((float) defpackage.afhi.k(java.lang.Float.intBitsToFloat((int) (cxnVar.o() >> 32))))) + cxnVar.dI(this.c.c(cxnVar.p())))) & 4294967295L, ajvVar.e(), canvasA) || zD;
        }
        if (ajvVar.i()) {
            android.widget.EdgeEffect edgeEffectA = ajvVar.a();
            zD = d(180.0f, (((long) java.lang.Float.floatToRawIntBits((-java.lang.Float.intBitsToFloat((int) (cxnVar.o() & 4294967295L))) + cxnVar.dI(((defpackage.avx) this.c).b))) & 4294967295L) | (((long) java.lang.Float.floatToRawIntBits(-java.lang.Float.intBitsToFloat((int) (cxnVar.o() >> 32)))) << 32), edgeEffectA, canvasA) || zD;
        }
        if (zD) {
            aizVar.h();
        }
    }

    @Override // defpackage.cwu
    public final /* synthetic */ void a() {
    }
}
