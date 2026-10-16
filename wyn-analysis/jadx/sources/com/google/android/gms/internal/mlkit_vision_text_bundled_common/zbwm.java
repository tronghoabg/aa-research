package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import com.google.android.gms.internal.consent_sdk.a;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zbwm {
    private static final zbwm zba = new zbwm(0, new int[0], new Object[0], false);
    private int zbb;
    private int[] zbc;
    private Object[] zbd;
    private int zbe;
    private boolean zbf;

    private zbwm(int i5, int[] iArr, Object[] objArr, boolean z2) {
        this.zbe = -1;
        this.zbb = i5;
        this.zbc = iArr;
        this.zbd = objArr;
        this.zbf = z2;
    }

    public static zbwm zbc() {
        return zba;
    }

    public static zbwm zbe(zbwm zbwmVar, zbwm zbwmVar2) {
        int i5 = zbwmVar.zbb + zbwmVar2.zbb;
        int[] iArrCopyOf = Arrays.copyOf(zbwmVar.zbc, i5);
        System.arraycopy(zbwmVar2.zbc, 0, iArrCopyOf, zbwmVar.zbb, zbwmVar2.zbb);
        Object[] objArrCopyOf = Arrays.copyOf(zbwmVar.zbd, i5);
        System.arraycopy(zbwmVar2.zbd, 0, objArrCopyOf, zbwmVar.zbb, zbwmVar2.zbb);
        return new zbwm(i5, iArrCopyOf, objArrCopyOf, true);
    }

    public static zbwm zbf() {
        return new zbwm(0, new int[8], new Object[8], true);
    }

    private final void zbm(int i5) {
        int[] iArr = this.zbc;
        if (i5 > iArr.length) {
            int i10 = this.zbb;
            int i11 = (i10 / 2) + i10;
            if (i11 >= i5) {
                i5 = i11;
            }
            if (i5 < 8) {
                i5 = 8;
            }
            this.zbc = Arrays.copyOf(iArr, i5);
            this.zbd = Arrays.copyOf(this.zbd, i5);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zbwm)) {
            return false;
        }
        zbwm zbwmVar = (zbwm) obj;
        int i5 = this.zbb;
        if (i5 == zbwmVar.zbb) {
            int[] iArr = this.zbc;
            int[] iArr2 = zbwmVar.zbc;
            int i10 = 0;
            while (true) {
                if (i10 >= i5) {
                    Object[] objArr = this.zbd;
                    Object[] objArr2 = zbwmVar.zbd;
                    int i11 = this.zbb;
                    for (int i12 = 0; i12 < i11; i12++) {
                        if (objArr[i12].equals(objArr2[i12])) {
                        }
                    }
                    return true;
                }
                if (iArr[i10] != iArr2[i10]) {
                    break;
                }
                i10++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i5 = this.zbb;
        int i10 = i5 + 527;
        int[] iArr = this.zbc;
        int iHashCode = 17;
        int i11 = 17;
        for (int i12 = 0; i12 < i5; i12++) {
            i11 = (i11 * 31) + iArr[i12];
        }
        int i13 = ((i10 * 31) + i11) * 31;
        Object[] objArr = this.zbd;
        int i14 = this.zbb;
        for (int i15 = 0; i15 < i14; i15++) {
            iHashCode = (iHashCode * 31) + objArr[i15].hashCode();
        }
        return i13 + iHashCode;
    }

    public final int zba() {
        int iZbD;
        int iZbE;
        int iZbD2;
        int i5 = this.zbe;
        if (i5 != -1) {
            return i5;
        }
        int iZbD3 = 0;
        for (int i10 = 0; i10 < this.zbb; i10++) {
            int i11 = this.zbc[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 != 0) {
                if (i13 == 1) {
                    ((Long) this.zbd[i10]).getClass();
                    iZbD2 = zbtk.zbD(i12 << 3) + 8;
                } else if (i13 == 2) {
                    int i14 = i12 << 3;
                    zbtc zbtcVar = (zbtc) this.zbd[i10];
                    int iZbD4 = zbtk.zbD(i14);
                    int iZbd = zbtcVar.zbd();
                    iZbD3 = zbtk.zbD(iZbd) + iZbd + iZbD4 + iZbD3;
                } else if (i13 == 3) {
                    int iZbD5 = zbtk.zbD(i12 << 3);
                    iZbD = iZbD5 + iZbD5;
                    iZbE = ((zbwm) this.zbd[i10]).zba();
                } else {
                    if (i13 != 5) {
                        throw new IllegalStateException(new zbup("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.zbd[i10]).getClass();
                    iZbD2 = zbtk.zbD(i12 << 3) + 4;
                }
                iZbD3 = iZbD2 + iZbD3;
            } else {
                int i15 = i12 << 3;
                long jLongValue = ((Long) this.zbd[i10]).longValue();
                iZbD = zbtk.zbD(i15);
                iZbE = zbtk.zbE(jLongValue);
            }
            iZbD3 = iZbE + iZbD + iZbD3;
        }
        this.zbe = iZbD3;
        return iZbD3;
    }

    public final int zbb() {
        int i5 = this.zbe;
        if (i5 != -1) {
            return i5;
        }
        int iA = 0;
        for (int i10 = 0; i10 < this.zbb; i10++) {
            int i11 = this.zbc[i10] >>> 3;
            zbtc zbtcVar = (zbtc) this.zbd[i10];
            int iZbD = zbtk.zbD(8);
            int iZbD2 = zbtk.zbD(i11) + zbtk.zbD(16);
            int iZbD3 = zbtk.zbD(24);
            int iZbd = zbtcVar.zbd();
            iA += iZbD + iZbD + iZbD2 + a.A(iZbd, iZbd, iZbD3);
        }
        this.zbe = iA;
        return iA;
    }

    public final zbwm zbd(zbwm zbwmVar) {
        if (zbwmVar.equals(zba)) {
            return this;
        }
        zbg();
        int i5 = this.zbb + zbwmVar.zbb;
        zbm(i5);
        System.arraycopy(zbwmVar.zbc, 0, this.zbc, this.zbb, zbwmVar.zbb);
        System.arraycopy(zbwmVar.zbd, 0, this.zbd, this.zbb, zbwmVar.zbb);
        this.zbb = i5;
        return this;
    }

    public final void zbg() {
        if (!this.zbf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zbh() {
        if (this.zbf) {
            this.zbf = false;
        }
    }

    public final void zbi(StringBuilder sb2, int i5) {
        for (int i10 = 0; i10 < this.zbb; i10++) {
            zbvo.zbb(sb2, i5, String.valueOf(this.zbc[i10] >>> 3), this.zbd[i10]);
        }
    }

    public final void zbj(int i5, Object obj) {
        zbg();
        zbm(this.zbb + 1);
        int[] iArr = this.zbc;
        int i10 = this.zbb;
        iArr[i10] = i5;
        this.zbd[i10] = obj;
        this.zbb = i10 + 1;
    }

    public final void zbk(zbwy zbwyVar) throws IOException {
        for (int i5 = 0; i5 < this.zbb; i5++) {
            zbwyVar.zbx(this.zbc[i5] >>> 3, this.zbd[i5]);
        }
    }

    public final void zbl(zbwy zbwyVar) throws IOException {
        if (this.zbb != 0) {
            for (int i5 = 0; i5 < this.zbb; i5++) {
                int i10 = this.zbc[i5];
                Object obj = this.zbd[i5];
                int i11 = i10 & 7;
                int i12 = i10 >>> 3;
                if (i11 == 0) {
                    zbwyVar.zbt(i12, ((Long) obj).longValue());
                } else if (i11 == 1) {
                    zbwyVar.zbm(i12, ((Long) obj).longValue());
                } else if (i11 == 2) {
                    zbwyVar.zbd(i12, (zbtc) obj);
                } else if (i11 == 3) {
                    zbwyVar.zbG(i12);
                    ((zbwm) obj).zbl(zbwyVar);
                    zbwyVar.zbh(i12);
                } else {
                    if (i11 != 5) {
                        throw new RuntimeException(new zbup("Protocol message tag had invalid wire type."));
                    }
                    zbwyVar.zbk(i12, ((Integer) obj).intValue());
                }
            }
        }
    }

    private zbwm() {
        this(0, new int[8], new Object[8], true);
    }
}
