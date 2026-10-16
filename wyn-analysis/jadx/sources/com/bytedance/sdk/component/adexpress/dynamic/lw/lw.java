package com.bytedance.sdk.component.adexpress.dynamic.lw;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.dynamic.lw.oa;
import com.bytedance.sdk.component.adexpress.oa.cq;
import com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class lw {
    private uef moa;

    /* renamed from: oa, reason: collision with root package name */
    protected oa f24841oa;
    public com.bytedance.sdk.component.adexpress.dynamic.moa.oa uef;
    private com.bytedance.sdk.component.adexpress.dynamic.moa.bcc yo;

    public static class uef {

        /* renamed from: oa, reason: collision with root package name */
        float f24842oa;
        float uef;
        float yo;
    }

    public lw(double d3, int i5, double d5, String str, cq cqVar) {
        this.f24841oa = new oa(d3, i5, d5, str, cqVar);
    }

    public void uef(uef uefVar) {
        this.moa = uefVar;
    }

    public void uef() {
        this.f24841oa.uef();
    }

    public void uef(com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar, float f10, float f11) {
        if (bccVar != null) {
            this.yo = bccVar;
        }
        com.bytedance.sdk.component.adexpress.dynamic.moa.bcc bccVar2 = this.yo;
        float fBcc = bccVar2.bcc();
        float fCz = bccVar2.cz();
        float f12 = TextUtils.equals(bccVar2.zjm().lw().ue(), "fixed") ? fCz : 65536.0f;
        this.f24841oa.uef();
        this.f24841oa.yo(bccVar2, fBcc, f12);
        oa.yo yoVarUef = this.f24841oa.uef(bccVar2);
        com.bytedance.sdk.component.adexpress.dynamic.moa.oa oaVar = new com.bytedance.sdk.component.adexpress.dynamic.moa.oa();
        oaVar.uef = f10;
        oaVar.f24865oa = f11;
        if (yoVarUef != null) {
            fBcc = yoVarUef.uef;
        }
        oaVar.yo = fBcc;
        if (yoVarUef != null) {
            fCz = yoVarUef.f24846oa;
        }
        oaVar.moa = fCz;
        oaVar.lw = "root";
        oaVar.cz = 1280.0f;
        oaVar.ivm = bccVar2;
        bccVar2.yo(f10);
        oaVar.ivm.moa(oaVar.f24865oa);
        oaVar.ivm.lw(oaVar.yo);
        oaVar.ivm.ivm(oaVar.moa);
        com.bytedance.sdk.component.adexpress.dynamic.moa.oa oaVarUef = uef(oaVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.uef = oaVarUef;
        uef(oaVarUef);
    }

    public void uef(com.bytedance.sdk.component.adexpress.dynamic.moa.oa oaVar) {
        if (oaVar == null) {
            return;
        }
        oaVar.ivm.zjm().oa();
        List<List<com.bytedance.sdk.component.adexpress.dynamic.moa.oa>> list = oaVar.xs;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (List<com.bytedance.sdk.component.adexpress.dynamic.moa.oa> list2 : list) {
            if (list2 != null && list2.size() > 0) {
                Iterator<com.bytedance.sdk.component.adexpress.dynamic.moa.oa> it = list2.iterator();
                while (it.hasNext()) {
                    uef(it.next());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.bytedance.sdk.component.adexpress.dynamic.moa.oa uef(com.bytedance.sdk.component.adexpress.dynamic.moa.oa r37, float r38) {
        /*
            Method dump skipped, instructions count: 1004
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.lw.lw.uef(com.bytedance.sdk.component.adexpress.dynamic.moa.oa, float):com.bytedance.sdk.component.adexpress.dynamic.moa.oa");
    }

    private com.bytedance.sdk.component.adexpress.dynamic.moa.cz uef(com.bytedance.sdk.component.adexpress.dynamic.moa.ivm ivmVar, oa.yo yoVar, oa.yo yoVar2) {
        float fVj = ivmVar.vj();
        float fNe = ivmVar.ne();
        float fIx = ivmVar.ix();
        float fDh = ivmVar.dh();
        boolean zWxf = ivmVar.wxf();
        boolean zHg = ivmVar.hg();
        boolean zOu = ivmVar.ou();
        boolean zHnk = ivmVar.hnk();
        if (!zWxf) {
            if (zHg) {
                float f10 = this.moa.uef;
                fVj = ((f10 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Math.min(f10, yoVar.uef) : yoVar.uef) - fIx) - yoVar2.uef;
            } else {
                fVj = 0.0f;
            }
        }
        if (!zOu) {
            if (zHnk) {
                float f11 = this.moa.f24842oa;
                if (f11 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f11 = yoVar.f24846oa;
                }
                fNe = (f11 - fDh) - yoVar2.f24846oa;
            } else {
                fNe = 0.0f;
            }
        }
        return new com.bytedance.sdk.component.adexpress.dynamic.moa.cz(fVj, fNe);
    }

    private com.bytedance.sdk.component.adexpress.dynamic.moa.cz uef(com.bytedance.sdk.component.adexpress.dynamic.moa.oa oaVar, com.bytedance.sdk.component.adexpress.dynamic.moa.ivm ivmVar, float f10, float f11) {
        float f12;
        float f13;
        float f14 = oaVar.uef;
        float f15 = oaVar.f24865oa;
        float fVj = ivmVar.vj();
        float fNe = ivmVar.ne();
        float fIx = ivmVar.ix();
        float fDh = ivmVar.dh();
        boolean zWxf = ivmVar.wxf();
        boolean zHg = ivmVar.hg();
        boolean zOu = ivmVar.ou();
        boolean zHnk = ivmVar.hnk();
        String strVyg = ivmVar.vyg();
        float f16 = oaVar.yo;
        float f17 = oaVar.moa;
        if (TextUtils.equals(strVyg, "0")) {
            if (zWxf) {
                f14 = oaVar.uef + fVj;
            } else if (zHg) {
                f14 = ((oaVar.uef + f16) - fIx) - f10;
            }
            if (zOu) {
                f13 = oaVar.f24865oa;
                f15 = f13 + fNe;
            } else if (zHnk) {
                f12 = oaVar.f24865oa;
                f15 = ((f12 + f17) - fDh) - f11;
            }
        } else if (TextUtils.equals(strVyg, UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION)) {
            f14 = oaVar.uef + ((f16 - f10) / 2.0f);
            if (zOu) {
                f13 = oaVar.f24865oa;
                f15 = f13 + fNe;
            } else if (zHnk) {
                f12 = oaVar.f24865oa;
                f15 = ((f12 + f17) - fDh) - f11;
            }
        } else if (TextUtils.equals(strVyg, CommonGetHeaderBiddingToken.HB_TOKEN_VERSION)) {
            f15 = oaVar.f24865oa + ((f17 - f11) / 2.0f);
            if (zWxf) {
                f14 = oaVar.uef + fVj;
            } else if (zHg) {
                f14 = ((oaVar.uef + f16) - fIx) - f10;
            }
        } else if (TextUtils.equals(strVyg, "3")) {
            f14 = oaVar.uef + ((f16 - f10) / 2.0f);
            f15 = ((f17 - f11) / 2.0f) + oaVar.f24865oa;
        }
        return new com.bytedance.sdk.component.adexpress.dynamic.moa.cz(f14, f15);
    }
}
