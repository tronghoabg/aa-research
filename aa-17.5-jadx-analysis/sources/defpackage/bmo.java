package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class bmo {
    public static final avp a;
    public static final float b;
    private static final float c;

    static {
        avr avrVar = new avr(24.0f, 8.0f, 24.0f, 8.0f);
        a = avrVar;
        new avr(16.0f, 8.0f, 24.0f, 8.0f);
        c = 12.0f;
        new avr(12.0f, avrVar.a, 12.0f, avrVar.b);
        new avr(12.0f, avrVar.a, 16.0f, avrVar.b);
        b = 58.0f;
    }

    public static final bmr a(float f, float f2, float f3, float f4, float f5, int i) {
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        if ((i & 16) != 0) {
            f5 = BitmapDescriptorFactory.HUE_RED;
        }
        if ((i & 8) != 0) {
            f4 = 3.0f;
        }
        if ((i & 4) != 0) {
            f3 = 1.0f;
        }
        if ((i & 2) != 0) {
            f2 = 1.0f;
        }
        if (1 == (i & 1)) {
            f6 = f5;
            f7 = f4;
            f8 = f3;
            f9 = f2;
            f10 = 1.0f;
        } else {
            f6 = f5;
            f7 = f4;
            f8 = f3;
            f9 = f2;
            f10 = f;
        }
        return new bmr(f10, f9, f8, f7, f6);
    }

    public static final bmn b(bng bngVar) {
        bmn bmnVar = bngVar.W;
        if (bmnVar != null) {
            return bmnVar;
        }
        bmn bmnVar2 = new bmn(bnh.e(bngVar, 26), bnh.e(bngVar, 10), cjv.h(bnh.e(bngVar, 18), 0.1f), cjv.h(bnh.e(bngVar, 19), 0.38f));
        bngVar.W = bmnVar2;
        return bmnVar2;
    }

    public static final float c() {
        return ((Boolean) bos.a.a()).booleanValue() ? 36.0f : 40.0f;
    }

    public static final ckv d(bux buxVar) {
        return czz.aq(((bog) buxVar.f(boh.a)).c, 7);
    }

    public static final bmn e(long j, long j2, long j3, long j4, bux buxVar, int i) {
        long jN = (i & 1) != 0 ? cjn.n() : j;
        long jN2 = (i & 2) != 0 ? cjn.n() : j2;
        long jN3 = (i & 4) != 0 ? cjn.n() : j3;
        long jN4 = (i & 8) != 0 ? cjn.n() : j4;
        bmn bmnVarB = b(czz.at(buxVar));
        if (jN == 16) {
            jN = bmnVarB.a;
        }
        if (jN2 == 16) {
            jN2 = bmnVarB.b;
        }
        if (jN3 == 16) {
            jN3 = bmnVarB.c;
        }
        if (jN4 == 16) {
            jN4 = bmnVarB.d;
        }
        return new bmn(jN, jN2, jN3, jN4);
    }
}
