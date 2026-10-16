package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class dkz {
    public static final dkz a;
    public final long b;
    public final long c;

    static {
        long jFloatToRawIntBits = Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED);
        dlu[] dluVarArr = dlt.a;
        a = new dkz((jFloatToRawIntBits & 4294967295L) | 4294967296L, (Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED) & 4294967295L) | 4294967296L);
    }

    public dkz(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkz)) {
            return false;
        }
        long j = this.b;
        dkz dkzVar = (dkz) obj;
        long j2 = dkzVar.b;
        dlu[] dluVarArr = dlt.a;
        return j == j2 && this.c == dkzVar.c;
    }

    public final int hashCode() {
        dlu[] dluVarArr = dlt.a;
        return (((int) (this.b ^ 1)) * 31) + ((int) (this.c ^ 1));
    }

    public final String toString() {
        long j = this.c;
        return "TextIndent(firstLine=" + dlt.c(this.b) + ", restLine=" + dlt.c(j) + ")";
    }
}
