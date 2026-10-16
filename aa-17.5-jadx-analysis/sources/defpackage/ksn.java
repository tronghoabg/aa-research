package defpackage;

/* loaded from: classes.dex */
final class ksn {
    public final dfw a;
    public final dfw b;
    public final dfw c;
    public final dfw d;
    public final dfw e;
    public final dfw f;
    public final dfw g;
    public final dfw h;
    public final dfw i;
    public final dfw j;
    public final dfw k;
    public final dfw l;
    public final dfw m;
    public final dfw n;
    public final dfw o;
    private final dfw p;
    private final die q;
    private final dlg r;

    public ksn(dfw dfwVar, die dieVar, dlg dlgVar) {
        dieVar.getClass();
        dlgVar.getClass();
        this.p = dfwVar;
        this.q = dieVar;
        this.r = dlgVar;
        this.a = dfw.v(dfwVar, 0L, a(56.0f), null, null, null, null, 0L, null, 0, 0, a(64.0f), null, null, 16646141);
        this.b = dfw.v(dfwVar, 0L, a(44.0f), null, null, null, null, 0L, null, 0, 0, a(52.0f), null, null, 16646141);
        this.c = dfw.v(dfwVar, 0L, a(36.0f), null, null, null, null, 0L, null, 0, 0, a(44.0f), null, null, 16646141);
        this.d = dfw.v(dfwVar, 0L, a(32.0f), null, null, null, null, 0L, null, 0, 0, a(40.0f), null, null, 16646141);
        dfw dfwVarV = dfw.v(dfwVar, 0L, a(28.0f), null, null, null, null, 0L, null, 0, 0, a(36.0f), null, null, 16646141);
        this.e = dfwVarV;
        dfw dfwVarV2 = dfw.v(dfwVar, 0L, a(24.0f), null, null, null, null, 0L, null, 0, 0, a(32.0f), null, null, 16646141);
        this.f = dfwVarV2;
        dfw dfwVarV3 = dfw.v(dfwVarV, 0L, 0L, dieVar, null, null, null, 0L, null, 0, 0, 0L, null, null, 16777211);
        this.g = dfwVarV3;
        this.h = dfwVarV3;
        dfw dfwVarV4 = dfw.v(dfwVarV2, 0L, 0L, dieVar, null, null, null, 0L, null, 0, 0, 0L, null, null, 16777211);
        this.i = dfwVarV4;
        this.j = dfwVarV;
        this.k = dfwVarV;
        this.l = dfwVarV2;
        this.m = dfwVarV4;
        this.n = dfwVarV4;
        this.o = dfw.v(dfwVar, 0L, a(16.0f), dieVar, null, null, null, 0L, null, 0, 0, a(24.0f), null, null, 16646137);
    }

    private final long a(float f) {
        return this.r.eI(f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ksn)) {
            return false;
        }
        ksn ksnVar = (ksn) obj;
        return affa.f(this.p, ksnVar.p) && affa.f(this.q, ksnVar.q) && affa.f(this.r, ksnVar.r);
    }

    public final int hashCode() {
        return (((this.p.hashCode() * 31) + this.q.o) * 31) + this.r.hashCode();
    }

    public final String toString() {
        return "AdjustedStyles(baseStyle=" + this.p + ", increasedWeight=" + this.q + ", density=" + this.r + ")";
    }
}
