package defpackage;

import android.graphics.Paint;
import android.text.TextUtils;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* loaded from: classes.dex */
public final class den {
    public final dep a;
    public final dgi b;
    public final CharSequence c;
    public float d;
    public final List e;
    private final int f;
    private final int g;
    private final long h;

    /* JADX WARN: Removed duplicated region for block: B:101:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public den(defpackage.dep r26, int r27, int r28, long r29) {
        /*
            Method dump skipped, instructions count: 884
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.den.<init>(dep, int, int, long):void");
    }

    private final dgi l(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        float f = f();
        dkh dkhVarI = i();
        dkf dkfVar = dkg.a;
        dep depVar = this.a;
        return new dgi(charSequence, f, dkhVarI, i, truncateAt, depVar.e, i3, i5, i6, 0, 0, i2, depVar.d);
    }

    public final float a() {
        return b(g() - 1);
    }

    public final float b(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        dgi dgiVar = this.b;
        return dgiVar.f + ((i != dgiVar.e + (-1) || (fontMetricsInt = dgiVar.i) == null) ? dgiVar.d.getLineBaseline(i) : dgiVar.d(i) - fontMetricsInt.ascent) + BitmapDescriptorFactory.HUE_RED;
    }

    public final float c(int i) {
        return this.b.b(i);
    }

    public final float d(int i) {
        return this.b.c(i);
    }

    public final float e(int i) {
        return this.b.d(i);
    }

    public final float f() {
        return dle.b(this.h);
    }

    public final int g() {
        return this.b.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long h(defpackage.cjb r12, int r13, defpackage.dfr r14) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.den.h(cjb, int, dfr):long");
    }

    public final dkh i() {
        return this.a.b;
    }

    public final boolean j() {
        return this.b.c;
    }

    public final void k(cju cjuVar, long j, cku ckuVar, dku dkuVar, czz czzVar) {
        int i = i().a;
        dkh dkhVarI = i();
        dkhVarI.c(j);
        dkhVarI.d(ckuVar);
        dkhVarI.e(dkuVar);
        dkhVarI.f(czzVar);
        dkhVarI.a(3);
        new bhd(this, 2, (char[]) null).invoke(cjuVar);
        i().a(i);
    }
}
