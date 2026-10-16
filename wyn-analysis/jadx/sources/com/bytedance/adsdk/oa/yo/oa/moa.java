package com.bytedance.adsdk.oa.yo.oa;

import A7.AbstractC0279p0;
import java.util.Arrays;

/* loaded from: classes.dex */
public class moa {

    /* renamed from: oa, reason: collision with root package name */
    private final int[] f24623oa;
    private final float[] uef;

    public moa(float[] fArr, int[] iArr) {
        this.uef = fArr;
        this.f24623oa = iArr;
    }

    public int[] oa() {
        return this.f24623oa;
    }

    public float[] uef() {
        return this.uef;
    }

    public int yo() {
        return this.f24623oa.length;
    }

    public void uef(moa moaVar, moa moaVar2, float f10) {
        if (moaVar.f24623oa.length != moaVar2.f24623oa.length) {
            StringBuilder sb2 = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
            sb2.append(moaVar.f24623oa.length);
            sb2.append(" vs ");
            throw new IllegalArgumentException(AbstractC0279p0.j(moaVar2.f24623oa.length, ")", sb2));
        }
        for (int i5 = 0; i5 < moaVar.f24623oa.length; i5++) {
            this.uef[i5] = com.bytedance.adsdk.oa.ivm.lw.uef(moaVar.uef[i5], moaVar2.uef[i5], f10);
            this.f24623oa[i5] = com.bytedance.adsdk.oa.ivm.oa.uef(f10, moaVar.f24623oa[i5], moaVar2.f24623oa[i5]);
        }
    }

    public moa uef(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i5 = 0; i5 < fArr.length; i5++) {
            iArr[i5] = uef(fArr[i5]);
        }
        return new moa(fArr, iArr);
    }

    private int uef(float f10) {
        int iBinarySearch = Arrays.binarySearch(this.uef, f10);
        if (iBinarySearch >= 0) {
            return this.f24623oa[iBinarySearch];
        }
        int i5 = -(iBinarySearch + 1);
        if (i5 == 0) {
            return this.f24623oa[0];
        }
        int[] iArr = this.f24623oa;
        if (i5 == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.uef;
        int i10 = i5 - 1;
        float f11 = fArr[i10];
        return com.bytedance.adsdk.oa.ivm.oa.uef((f10 - f11) / (fArr[i5] - f11), iArr[i10], iArr[i5]);
    }
}
