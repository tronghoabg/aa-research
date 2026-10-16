package com.bytedance.adsdk.oa.yo.uef;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class yo extends dz<com.bytedance.adsdk.oa.yo.oa.moa, com.bytedance.adsdk.oa.yo.oa.moa> {
    public yo(List<com.bytedance.adsdk.oa.xs.uef<com.bytedance.adsdk.oa.yo.oa.moa>> list) {
        super(uef(list));
    }

    private static List<com.bytedance.adsdk.oa.xs.uef<com.bytedance.adsdk.oa.yo.oa.moa>> uef(List<com.bytedance.adsdk.oa.xs.uef<com.bytedance.adsdk.oa.yo.oa.moa>> list) {
        for (int i5 = 0; i5 < list.size(); i5++) {
            list.set(i5, uef(list.get(i5)));
        }
        return list;
    }

    @Override // com.bytedance.adsdk.oa.yo.uef.dz, com.bytedance.adsdk.oa.yo.uef.cq
    public /* bridge */ /* synthetic */ boolean oa() {
        return super.oa();
    }

    @Override // com.bytedance.adsdk.oa.yo.uef.dz
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.bytedance.adsdk.oa.yo.uef.dz, com.bytedance.adsdk.oa.yo.uef.cq
    public /* bridge */ /* synthetic */ List yo() {
        return super.yo();
    }

    private static com.bytedance.adsdk.oa.xs.uef<com.bytedance.adsdk.oa.yo.oa.moa> uef(com.bytedance.adsdk.oa.xs.uef<com.bytedance.adsdk.oa.yo.oa.moa> uefVar) {
        com.bytedance.adsdk.oa.yo.oa.moa moaVar = uefVar.uef;
        com.bytedance.adsdk.oa.yo.oa.moa moaVar2 = uefVar.f24604oa;
        if (moaVar == null || moaVar2 == null || moaVar.uef().length == moaVar2.uef().length) {
            return uefVar;
        }
        float[] fArrUef = uef(moaVar.uef(), moaVar2.uef());
        return uefVar.uef(moaVar.uef(fArrUef), moaVar2.uef(fArrUef));
    }

    public static float[] uef(float[] fArr, float[] fArr2) {
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
        System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
        Arrays.sort(fArr3);
        float f10 = Float.NaN;
        int i5 = 0;
        for (int i10 = 0; i10 < length; i10++) {
            float f11 = fArr3[i10];
            if (f11 != f10) {
                fArr3[i5] = f11;
                i5++;
                f10 = fArr3[i10];
            }
        }
        return Arrays.copyOfRange(fArr3, 0, i5);
    }

    @Override // com.bytedance.adsdk.oa.yo.uef.cq
    public com.bytedance.adsdk.oa.uef.oa.uef<com.bytedance.adsdk.oa.yo.oa.moa, com.bytedance.adsdk.oa.yo.oa.moa> uef() {
        return new com.bytedance.adsdk.oa.uef.oa.lw(this.uef);
    }
}
