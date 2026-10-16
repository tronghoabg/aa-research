package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class npw {
    public final List a;
    private final float b;
    private final float c;
    private final float d;
    private final Float e;
    private final Float f;
    private final afha g;

    public npw(float f, float f2, float f3, Float f4, Float f5) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
        afbt afbtVar = new afbt(10);
        if (f4 != null) {
            afbtVar.add(Float.valueOf(f4.floatValue()));
        }
        while (f <= this.c) {
            afbtVar.add(Float.valueOf(f));
            f += this.d;
        }
        Float f6 = this.f;
        if (f6 != null) {
            afbtVar.add(Float.valueOf(f6.floatValue()));
        }
        List listF = afbtVar.f();
        this.a = listF;
        this.g = woy.bm(listF);
    }

    private final Float d(float f, afec afecVar, String str) {
        List list = this.a;
        int iIndexOf = list.indexOf(Float.valueOf(f));
        if (iIndexOf == -1) {
            ((ype) npc.c.h()).A("current temperature %s is not a valid value, can't find next value for %s", f, str);
            return null;
        }
        afha afhaVar = this.g;
        Integer numValueOf = Integer.valueOf(iIndexOf);
        int iIntValue = ((Number) afecVar.invoke(numValueOf)).intValue();
        if (afhaVar.a <= iIntValue && iIntValue <= afhaVar.b) {
            return (Float) list.get(((Number) afecVar.invoke(numValueOf)).intValue());
        }
        npc.c.l().A("current value is %s, no valid next value for %s found", f, str);
        return null;
    }

    public final npp a(float f) {
        int iIndexOf = this.a.indexOf(Float.valueOf(f));
        afha afhaVar = this.g;
        int i = afhaVar.a;
        if (iIndexOf == i && this.e != null) {
            return npn.a;
        }
        int i2 = afhaVar.b;
        if (iIndexOf == i2 && this.f != null) {
            return npm.a;
        }
        if (iIndexOf > i2 || i > iIndexOf) {
            return null;
        }
        return new npo(f);
    }

    public final Float b(float f) {
        return d(f, npu.a, "decrement");
    }

    public final Float c(float f) {
        return d(f, npv.a, "increment");
    }
}
