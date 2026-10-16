package e.a;

import java.util.Arrays;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class dn implements dp {

    /* renamed from: a, reason: collision with root package name */
    final int f47339a;

    /* renamed from: b, reason: collision with root package name */
    final dp[] f47340b;

    /* renamed from: c, reason: collision with root package name */
    private final int f47341c;

    private dn(int i2, dp[] dpVarArr, int i3) {
        this.f47339a = i2;
        this.f47340b = dpVarArr;
        this.f47341c = i3;
    }

    static dp b(dp dpVar, int i2, dp dpVar2, int i3, int i4) {
        int iD = d(i2, i4);
        int iD2 = d(i3, i4);
        if (iD == iD2) {
            dp dpVarB = b(dpVar, i2, dpVar2, i3, i4 + 5);
            return new dn(iD, new dp[]{dpVarB}, ((dn) dpVarB).f47341c);
        }
        int iE = e(i2, i4);
        int iE2 = e(i3, i4);
        dp dpVar3 = iE > iE2 ? dpVar : dpVar2;
        if (iE > iE2) {
            dpVar = dpVar2;
        }
        return new dn(iD | iD2, new dp[]{dpVar, dpVar3}, dpVar.a() + dpVar3.a());
    }

    private static int d(int i2, int i3) {
        return 1 << e(i2, i3);
    }

    private static int e(int i2, int i3) {
        return (i2 >>> i3) & 31;
    }

    @Override // e.a.dp
    public final int a() {
        return this.f47341c;
    }

    @Override // e.a.dp
    public final dp c(Object obj, Object obj2, int i2, int i3) {
        int i4 = this.f47339a;
        int iD = d(i2, i3);
        int iBitCount = Integer.bitCount((iD - 1) & i4);
        int i5 = i4 & iD;
        dp[] dpVarArr = this.f47340b;
        if (i5 != 0) {
            dp[] dpVarArr2 = (dp[]) Arrays.copyOf(dpVarArr, dpVarArr.length);
            dp dpVarC = dpVarArr[iBitCount].c(obj, obj2, i2, i3 + 5);
            dpVarArr2[iBitCount] = dpVarC;
            return new dn(i4, dpVarArr2, (this.f47341c + dpVarC.a()) - dpVarArr[iBitCount].a());
        }
        int i6 = i4 | iD;
        int length = dpVarArr.length;
        dp[] dpVarArr3 = new dp[length + 1];
        System.arraycopy(dpVarArr, 0, dpVarArr3, 0, iBitCount);
        dpVarArr3[iBitCount] = new Cdo(obj, obj2, 0);
        System.arraycopy(dpVarArr, iBitCount, dpVarArr3, iBitCount + 1, length - iBitCount);
        return new dn(i6, dpVarArr3, this.f47341c + 1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompressedIndex(");
        sb.append(String.format("bitmap=%s ", Integer.toBinaryString(this.f47339a)));
        for (dp dpVar : this.f47340b) {
            sb.append(dpVar);
            sb.append(" ");
        }
        sb.append(")");
        return sb.toString();
    }
}
