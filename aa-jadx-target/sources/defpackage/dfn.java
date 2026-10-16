package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class dfn implements defpackage.dex {
    public final int a;
    public final int b;
    public final long c;
    public final defpackage.dlh d;
    public final defpackage.dfq e;
    public final defpackage.dla f;
    public final int g;
    public final int h;
    public final defpackage.dli i;

    public dfn(int i, int i2, long j, defpackage.dlh dlhVar, defpackage.dfq dfqVar, defpackage.dla dlaVar, int i3, int i4, defpackage.dli dliVar) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = dlhVar;
        this.e = dfqVar;
        this.f = dlaVar;
        this.g = i3;
        this.h = i4;
        this.i = dliVar;
        defpackage.dmc[] dmcVarArr = defpackage.dmb.a;
        if (j != 2143289344 && java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) < 0.0f) {
            defpackage.dki.d("lineHeight can't be negative (" + java.lang.Float.intBitsToFloat((int) (4294967295L & j)) + ")");
        }
    }

    public final defpackage.dfn a(defpackage.dfn dfnVar) {
        return dfnVar == null ? this : defpackage.dfo.a(this, dfnVar.a, dfnVar.b, dfnVar.c, dfnVar.d, dfnVar.e, dfnVar.f, dfnVar.g, dfnVar.h, dfnVar.i);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.dfn)) {
            return false;
        }
        defpackage.dfn dfnVar = (defpackage.dfn) obj;
        if (this.a == dfnVar.a && this.b == dfnVar.b) {
            long j = this.c;
            long j2 = dfnVar.c;
            defpackage.dmc[] dmcVarArr = defpackage.dmb.a;
            return j == j2 && defpackage.afga.f(this.d, dfnVar.d) && defpackage.afga.f(this.e, dfnVar.e) && defpackage.afga.f(this.f, dfnVar.f) && this.g == dfnVar.g && this.h == dfnVar.h && defpackage.afga.f(this.i, dfnVar.i);
        }
        return false;
    }

    public final int hashCode() {
        defpackage.dmc[] dmcVarArr = defpackage.dmb.a;
        defpackage.dlh dlhVar = this.d;
        int iHashCode = dlhVar != null ? dlhVar.hashCode() : 0;
        long j = this.c;
        int i = this.a;
        int i2 = this.b;
        int i3 = this.e != null ? 38347 : 0;
        int i4 = (((((i * 31) + i2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + iHashCode;
        defpackage.dla dlaVar = this.f;
        int iHashCode2 = ((((((((i4 * 31) + i3) * 31) + (dlaVar != null ? dlaVar.hashCode() : 0)) * 31) + this.g) * 31) + this.h) * 31;
        defpackage.dli dliVar = this.i;
        return iHashCode2 + (dliVar != null ? dliVar.hashCode() : 0);
    }

    public final java.lang.String toString() {
        int i = this.g;
        return "ParagraphStyle(textAlign=" + defpackage.dlb.a(this.a) + ", textDirection=" + defpackage.dld.a(this.b) + ", lineHeight=" + defpackage.dmb.c(this.c) + ", textIndent=" + this.d + ", platformStyle=" + this.e + ", lineHeightStyle=" + this.f + ", lineBreak=" + defpackage.dky.a(i) + ", hyphens=" + defpackage.dkx.a(this.h) + ", textMotion=" + this.i + ")";
    }
}
