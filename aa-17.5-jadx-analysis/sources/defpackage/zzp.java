package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzp extends ysi {
    public final zzq[] a;

    public zzp(zzq[] zzqVarArr) {
        super(null);
        this.a = zzqVarArr;
        zzq zzqVar = zzqVarArr[0];
        int i = zzqVar.a;
        int i2 = zzqVar.b;
        for (int i3 = 1; i3 < 4; i3++) {
            zzq zzqVar2 = zzqVarArr[i3];
            int i4 = zzqVar2.a;
            int i5 = zzqVar2.b;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [boolean, int] */
    public final boolean Y(zzq zzqVar) {
        zzq[] zzqVarArr = this.a;
        ?? E = zzq.e(zzqVarArr[0], zzqVarArr[1], zzqVar);
        int i = E;
        if (zzq.e(zzqVarArr[1], zzqVarArr[2], zzqVar)) {
            i = E + 1;
        }
        int i2 = i;
        if (zzq.e(zzqVarArr[2], zzqVarArr[3], zzqVar)) {
            i2 = i + 1;
        }
        int i3 = i2;
        if (zzq.e(zzqVarArr[3], zzqVarArr[0], zzqVar)) {
            i3 = i2 + 1;
        }
        return i3 == 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzp) {
            return Arrays.equals(this.a, ((zzp) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        zzq[] zzqVarArr = this.a;
        return "[" + String.valueOf(zzqVarArr[0]) + "," + String.valueOf(zzqVarArr[1]) + "," + String.valueOf(zzqVarArr[2]) + "," + String.valueOf(zzqVarArr[3]) + "]";
    }
}
