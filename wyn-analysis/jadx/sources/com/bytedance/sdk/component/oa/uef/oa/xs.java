package com.bytedance.sdk.component.oa.uef.oa;

import java.util.Arrays;

/* loaded from: classes.dex */
final class xs extends moa {
    final transient int[] bcc;
    final transient byte[][] xs;

    public xs(uef uefVar, int i5) {
        super(null);
        cz.uef(uefVar.f25064oa, 0L, i5);
        lw lwVar = uefVar.uef;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i5) {
            int i13 = lwVar.yo;
            int i14 = lwVar.f25062oa;
            if (i13 == i14) {
                throw new AssertionError("s.limit == s.pos");
            }
            i11 += i13 - i14;
            i12++;
            lwVar = lwVar.ivm;
        }
        this.xs = new byte[i12][];
        this.bcc = new int[i12 * 2];
        lw lwVar2 = uefVar.uef;
        int i15 = 0;
        while (i10 < i5) {
            byte[][] bArr = this.xs;
            bArr[i15] = lwVar2.uef;
            int i16 = lwVar2.yo;
            int i17 = lwVar2.f25062oa;
            int i18 = (i16 - i17) + i10;
            i10 = i18 > i5 ? i5 : i18;
            int[] iArr = this.bcc;
            iArr[i15] = i10;
            iArr[bArr.length + i15] = i17;
            lwVar2.moa = true;
            i15++;
            lwVar2 = lwVar2.ivm;
        }
    }

    private moa lw() {
        return new moa(moa());
    }

    @Override // com.bytedance.sdk.component.oa.uef.oa.moa
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof moa) {
            moa moaVar = (moa) obj;
            if (moaVar.yo() == yo() && uef(0, moaVar, 0, yo())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.oa.uef.oa.moa
    public int hashCode() {
        int i5 = this.lw;
        if (i5 != 0) {
            return i5;
        }
        int length = this.xs.length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            byte[] bArr = this.xs[i10];
            int[] iArr = this.bcc;
            int i13 = iArr[length + i10];
            int i14 = iArr[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        this.lw = i11;
        return i11;
    }

    @Override // com.bytedance.sdk.component.oa.uef.oa.moa
    public byte[] moa() {
        int[] iArr = this.bcc;
        byte[][] bArr = this.xs;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i5 = 0;
        int i10 = 0;
        while (i5 < length) {
            int[] iArr2 = this.bcc;
            int i11 = iArr2[length + i5];
            int i12 = iArr2[i5];
            System.arraycopy(this.xs[i5], i11, bArr2, i10, i12 - i10);
            i5++;
            i10 = i12;
        }
        return bArr2;
    }

    @Override // com.bytedance.sdk.component.oa.uef.oa.moa
    public String oa() {
        return lw().oa();
    }

    @Override // com.bytedance.sdk.component.oa.uef.oa.moa
    public String toString() {
        return lw().toString();
    }

    @Override // com.bytedance.sdk.component.oa.uef.oa.moa
    public String uef() {
        return lw().uef();
    }

    @Override // com.bytedance.sdk.component.oa.uef.oa.moa
    public int yo() {
        return this.bcc[this.xs.length - 1];
    }

    private int oa(int i5) {
        int iBinarySearch = Arrays.binarySearch(this.bcc, 0, this.xs.length, i5 + 1);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    @Override // com.bytedance.sdk.component.oa.uef.oa.moa
    public moa uef(int i5, int i10) {
        return lw().uef(i5, i10);
    }

    @Override // com.bytedance.sdk.component.oa.uef.oa.moa
    public byte uef(int i5) {
        cz.uef(this.bcc[this.xs.length - 1], i5, 1L);
        int iOa = oa(i5);
        int i10 = iOa == 0 ? 0 : this.bcc[iOa - 1];
        int[] iArr = this.bcc;
        byte[][] bArr = this.xs;
        return bArr[iOa][(i5 - i10) + iArr[bArr.length + iOa]];
    }

    @Override // com.bytedance.sdk.component.oa.uef.oa.moa
    public boolean uef(int i5, moa moaVar, int i10, int i11) {
        if (i5 < 0 || i5 > yo() - i11) {
            return false;
        }
        int iOa = oa(i5);
        while (i11 > 0) {
            int i12 = iOa == 0 ? 0 : this.bcc[iOa - 1];
            int iMin = Math.min(i11, ((this.bcc[iOa] - i12) + i12) - i5);
            int[] iArr = this.bcc;
            byte[][] bArr = this.xs;
            if (!moaVar.uef(i10, bArr[iOa], (i5 - i12) + iArr[bArr.length + iOa], iMin)) {
                return false;
            }
            i5 += iMin;
            i10 += iMin;
            i11 -= iMin;
            iOa++;
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.oa.uef.oa.moa
    public boolean uef(int i5, byte[] bArr, int i10, int i11) {
        if (i5 < 0 || i5 > yo() - i11 || i10 < 0 || i10 > bArr.length - i11) {
            return false;
        }
        int iOa = oa(i5);
        while (i11 > 0) {
            int i12 = iOa == 0 ? 0 : this.bcc[iOa - 1];
            int iMin = Math.min(i11, ((this.bcc[iOa] - i12) + i12) - i5);
            int[] iArr = this.bcc;
            byte[][] bArr2 = this.xs;
            if (!cz.uef(bArr2[iOa], (i5 - i12) + iArr[bArr2.length + iOa], bArr, i10, iMin)) {
                return false;
            }
            i5 += iMin;
            i10 += iMin;
            i11 -= iMin;
            iOa++;
        }
        return true;
    }
}
