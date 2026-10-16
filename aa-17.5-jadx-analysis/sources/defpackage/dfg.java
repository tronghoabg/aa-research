package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class dfg implements deq {
    public final int a;
    public final int b;
    public final long c;
    public final dkz d;
    public final dfj e;
    public final dks f;
    public final int g;
    public final int h;
    public final dla i;

    public dfg(int i, int i2, long j, dkz dkzVar, dfj dfjVar, dks dksVar, int i3, int i4, dla dlaVar) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = dkzVar;
        this.e = dfjVar;
        this.f = dksVar;
        this.g = i3;
        this.h = i4;
        this.i = dlaVar;
        dlu[] dluVarArr = dlt.a;
        if (j != (Float.floatToRawIntBits(Float.NaN) & 4294967295L) && Float.intBitsToFloat((int) (j & 4294967295L)) < BitmapDescriptorFactory.HUE_RED) {
            dka.d("lineHeight can't be negative (" + Float.intBitsToFloat((int) (j & 4294967295L)) + ")");
        }
    }

    public final dfg a(dfg dfgVar) {
        return dfgVar == null ? this : dfh.a(this, dfgVar.a, dfgVar.b, dfgVar.c, dfgVar.d, dfgVar.e, dfgVar.f, dfgVar.g, dfgVar.h, dfgVar.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dfg)) {
            return false;
        }
        dfg dfgVar = (dfg) obj;
        if (this.a == dfgVar.a && this.b == dfgVar.b) {
            long j = this.c;
            long j2 = dfgVar.c;
            dlu[] dluVarArr = dlt.a;
            return j == j2 && affa.f(this.d, dfgVar.d) && affa.f(this.e, dfgVar.e) && affa.f(this.f, dfgVar.f) && this.g == dfgVar.g && this.h == dfgVar.h && affa.f(this.i, dfgVar.i);
        }
        return false;
    }

    public final int hashCode() {
        dlu[] dluVarArr = dlt.a;
        dkz dkzVar = this.d;
        int iHashCode = dkzVar != null ? dkzVar.hashCode() : 0;
        long j = this.c;
        int i = this.a;
        int i2 = this.b;
        int i3 = this.e != null ? 38347 : 0;
        int i4 = (((((i * 31) + i2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + iHashCode;
        dks dksVar = this.f;
        int iHashCode2 = ((((((((i4 * 31) + i3) * 31) + (dksVar != null ? dksVar.hashCode() : 0)) * 31) + this.g) * 31) + this.h) * 31;
        dla dlaVar = this.i;
        return iHashCode2 + (dlaVar != null ? dlaVar.hashCode() : 0);
    }

    public final String toString() {
        int i = this.g;
        return "ParagraphStyle(textAlign=" + dkt.a(this.a) + ", textDirection=" + dkv.a(this.b) + ", lineHeight=" + dlt.c(this.c) + ", textIndent=" + this.d + ", platformStyle=" + this.e + ", lineHeightStyle=" + this.f + ", lineBreak=" + dkq.a(i) + ", hyphens=" + dkp.a(this.h) + ", textMotion=" + this.i + ")";
    }
}
