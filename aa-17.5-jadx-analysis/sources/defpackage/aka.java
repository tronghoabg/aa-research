package defpackage;

import android.graphics.Canvas;
import android.widget.EdgeEffect;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
final class aka extends cwe implements cwk {
    private final aiu a;
    private final ajr b;
    private final avp c;

    public aka(cwd cwdVar, aiu aiuVar, ajr ajrVar, avp avpVar) {
        this.a = aiuVar;
        this.b = ajrVar;
        this.c = avpVar;
        W(cwdVar);
    }

    private static final boolean d(float f, long j, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(f);
        canvas.translate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & j)));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    @Override // defpackage.cwk
    public final void b(cxd cxdVar) {
        boolean zD;
        char c;
        aiu aiuVar = this.a;
        aiuVar.i(cxdVar.o());
        if (cjd.d(cxdVar.o())) {
            cxdVar.q();
            return;
        }
        cxdVar.q();
        aiuVar.c.a();
        Canvas canvasA = cjf.a(cxdVar.r().b());
        ajr ajrVar = this.b;
        if (ajrVar.l()) {
            EdgeEffect edgeEffectC = ajrVar.c();
            float f = -Float.intBitsToFloat((int) (cxdVar.o() & 4294967295L));
            zD = d(270.0f, (Float.floatToRawIntBits(cxdVar.eA(this.c.b(cxdVar.p()))) & 4294967295L) | (Float.floatToRawIntBits(f) << 32), edgeEffectC, canvasA);
        } else {
            zD = false;
        }
        if (ajrVar.r()) {
            c = ' ';
            zD = d(BitmapDescriptorFactory.HUE_RED, (((long) Float.floatToRawIntBits(cxdVar.eA(((avr) this.c).a))) & 4294967295L) | (((long) Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED)) << 32), ajrVar.g(), canvasA) || zD;
        } else {
            c = ' ';
        }
        if (ajrVar.o()) {
            zD = d(90.0f, (((long) Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED)) << c) | (((long) Float.floatToRawIntBits((-((float) afgi.k(Float.intBitsToFloat((int) (cxdVar.o() >> c))))) + cxdVar.eA(this.c.c(cxdVar.p())))) & 4294967295L), ajrVar.e(), canvasA) || zD;
        }
        if (ajrVar.i()) {
            EdgeEffect edgeEffectA = ajrVar.a();
            zD = d(180.0f, (((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (cxdVar.o() & 4294967295L))) + cxdVar.eA(((avr) this.c).b))) & 4294967295L) | (((long) Float.floatToRawIntBits(-Float.intBitsToFloat((int) (cxdVar.o() >> c)))) << c), edgeEffectA, canvasA) || zD;
        }
        if (zD) {
            aiuVar.h();
        }
    }

    @Override // defpackage.cwk
    public final /* synthetic */ void a() {
    }
}
