package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class toe extends tou {
    public too[] a;
    public final tot b;

    protected toe(too[] tooVarArr) {
        this.a = tooVarArr;
        tot totVar = new tot(new too(), new too());
        totVar.i(tooVarArr);
        this.b = totVar;
    }

    public static toe c(too tooVar, too tooVar2, too tooVar3, too tooVar4) {
        return new toe(new too[]{tooVar, tooVar2, tooVar4, tooVar3});
    }

    @Override // defpackage.tou, defpackage.tnz
    public final tot a() {
        return this.b;
    }

    @Override // defpackage.tou
    public final too d() {
        return this.a[3];
    }

    @Override // defpackage.tou
    public final too e(int i) {
        return this.a[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof toe) {
            return Arrays.equals(this.a, ((toe) obj).a);
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    @Override // defpackage.tou
    public final boolean f(too tooVar) {
        for (too tooVar2 : this.a) {
            if (tooVar2.equals(tooVar)) {
                return true;
            }
        }
        too[] tooVarArr = this.a;
        ?? K = tss.k(tooVarArr[0], tooVarArr[1], tooVar);
        too[] tooVarArr2 = this.a;
        int i = K;
        if (tss.k(tooVarArr2[1], tooVarArr2[2], tooVar)) {
            i = K + 1;
        }
        too[] tooVarArr3 = this.a;
        int i2 = i;
        if (tss.k(tooVarArr3[2], tooVarArr3[3], tooVar)) {
            i2 = i + 1;
        }
        too[] tooVarArr4 = this.a;
        int i3 = i2;
        if (tss.k(tooVarArr4[3], tooVarArr4[0], tooVar)) {
            i3 = i2 + 1;
        }
        return i3 == 1;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return "[" + String.valueOf(this.a[0]) + "," + String.valueOf(this.a[1]) + "," + String.valueOf(this.a[2]) + "," + String.valueOf(this.a[3]) + "]";
    }
}
