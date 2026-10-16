package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class dkh extends TextPaint {
    public int a;
    private dku b;
    private cku c;
    private cjv d;
    private cjs e;
    private bym f;
    private cjd g;
    private cjk h;
    private czz i;

    public dkh(float f) {
        super(1);
        this.density = f;
        this.b = dku.a;
        this.a = 3;
        this.c = cku.a;
    }

    private final void g() {
        this.f = null;
        this.e = null;
        this.g = null;
        setShader(null);
    }

    private final cjk h() {
        cjk cjkVar = this.h;
        if (cjkVar != null) {
            return cjkVar;
        }
        cjk cjkVar2 = new cjk(this);
        this.h = cjkVar2;
        return cjkVar2;
    }

    public final void a(int i) {
        if (i == this.a) {
            return;
        }
        h().i(i);
        this.a = i;
    }

    public final void b(cjs cjsVar, long j, float f) {
        g();
    }

    public final void c(long j) {
        cjv cjvVar = this.d;
        if ((cjvVar != null && cjvVar.a == j) || j == 16) {
            return;
        }
        this.d = new cjv(j);
        float[] fArr = clj.a;
        setColor((int) (cjv.e(j, clj.e) >>> 32));
        g();
    }

    public final void d(cku ckuVar) {
        if (ckuVar == null || affa.f(this.c, ckuVar)) {
            return;
        }
        this.c = ckuVar;
        if (affa.f(ckuVar, cku.a)) {
            clearShadowLayer();
            return;
        }
        cku ckuVar2 = this.c;
        float f = ckuVar2.d;
        if (f == BitmapDescriptorFactory.HUE_RED) {
            f = Float.MIN_VALUE;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (ckuVar2.c >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (this.c.c & 4294967295L));
        long j = this.c.b;
        float[] fArr = clj.a;
        setShadowLayer(f, fIntBitsToFloat, fIntBitsToFloat2, (int) (cjv.e(j, clj.e) >>> 32));
    }

    public final void e(dku dkuVar) {
        if (dkuVar == null || affa.f(this.b, dkuVar)) {
            return;
        }
        this.b = dkuVar;
        setUnderlineText(dkuVar.a(dku.b));
        setStrikeThruText(this.b.a(dku.c));
    }

    public final void f(czz czzVar) {
        if (czzVar == null || affa.f(this.i, czzVar)) {
            return;
        }
        this.i = czzVar;
        if (!affa.f(czzVar, cmf.a)) {
            throw new aezs();
        }
        setStyle(Paint.Style.FILL);
    }
}
