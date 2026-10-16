package com.bytedance.adsdk.oa.uef.uef;

import android.graphics.PointF;
import com.bytedance.adsdk.oa.uef.oa.uef;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class bs implements uef.InterfaceC0035uef, oib {
    private com.bytedance.adsdk.oa.yo.oa.dz moa;

    /* renamed from: oa, reason: collision with root package name */
    private final String f24585oa;
    private final com.bytedance.adsdk.oa.cz uef;
    private final com.bytedance.adsdk.oa.uef.oa.uef<Float, Float> yo;

    public bs(com.bytedance.adsdk.oa.cz czVar, com.bytedance.adsdk.oa.yo.yo.uef uefVar, com.bytedance.adsdk.oa.yo.oa.cq cqVar) {
        this.uef = czVar;
        this.f24585oa = cqVar.uef();
        com.bytedance.adsdk.oa.uef.oa.uef<Float, Float> uefVarUef = cqVar.oa().uef();
        this.yo = uefVarUef;
        uefVar.uef(uefVarUef);
        uefVarUef.uef(this);
    }

    public com.bytedance.adsdk.oa.uef.oa.uef<Float, Float> oa() {
        return this.yo;
    }

    @Override // com.bytedance.adsdk.oa.uef.uef.yo
    public void uef(List<yo> list, List<yo> list2) {
    }

    private com.bytedance.adsdk.oa.yo.oa.dz oa(com.bytedance.adsdk.oa.yo.oa.dz dzVar) {
        List<com.bytedance.adsdk.oa.yo.uef> listYo = dzVar.yo();
        boolean zOa = dzVar.oa();
        int size = listYo.size() - 1;
        int i5 = 0;
        while (size >= 0) {
            com.bytedance.adsdk.oa.yo.uef uefVar = listYo.get(size);
            com.bytedance.adsdk.oa.yo.uef uefVar2 = listYo.get(uef(size - 1, listYo.size()));
            PointF pointFYo = (size != 0 || zOa) ? uefVar2.yo() : dzVar.uef();
            i5 = (((size != 0 || zOa) ? uefVar2.oa() : pointFYo).equals(pointFYo) && uefVar.uef().equals(pointFYo) && !(!dzVar.oa() && size == 0 && size == listYo.size() - 1)) ? i5 + 2 : i5 + 1;
            size--;
        }
        com.bytedance.adsdk.oa.yo.oa.dz dzVar2 = this.moa;
        if (dzVar2 == null || dzVar2.yo().size() != i5) {
            ArrayList arrayList = new ArrayList(i5);
            for (int i10 = 0; i10 < i5; i10++) {
                arrayList.add(new com.bytedance.adsdk.oa.yo.uef());
            }
            this.moa = new com.bytedance.adsdk.oa.yo.oa.dz(new PointF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), false, arrayList);
        }
        this.moa.uef(zOa);
        return this.moa;
    }

    @Override // com.bytedance.adsdk.oa.uef.oa.uef.InterfaceC0035uef
    public void uef() {
        this.uef.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    @Override // com.bytedance.adsdk.oa.uef.uef.oib
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.bytedance.adsdk.oa.yo.oa.dz uef(com.bytedance.adsdk.oa.yo.oa.dz r19) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.oa.uef.uef.bs.uef(com.bytedance.adsdk.oa.yo.oa.dz):com.bytedance.adsdk.oa.yo.oa.dz");
    }

    private static int oa(int i5, int i10) {
        int i11 = i5 / i10;
        return ((i5 ^ i10) >= 0 || i10 * i11 == i5) ? i11 : i11 - 1;
    }

    private static int uef(int i5, int i10) {
        return i5 - (oa(i5, i10) * i10);
    }
}
