package com.bytedance.adsdk.oa.uef.uef;

import android.graphics.Path;
import android.graphics.PointF;
import com.bytedance.adsdk.oa.uef.oa.uef;
import com.bytedance.adsdk.oa.yo.oa.oib;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;

/* loaded from: classes.dex */
public class ivm implements uef.InterfaceC0035uef, cq, dj {
    private boolean bcc;
    private final com.bytedance.adsdk.oa.yo.oa.oa ivm;
    private final com.bytedance.adsdk.oa.uef.oa.uef<?, PointF> lw;
    private final com.bytedance.adsdk.oa.uef.oa.uef<?, PointF> moa;

    /* renamed from: oa, reason: collision with root package name */
    private final String f24587oa;
    private final Path uef = new Path();
    private final oa xs = new oa();
    private final com.bytedance.adsdk.oa.cz yo;

    public ivm(com.bytedance.adsdk.oa.cz czVar, com.bytedance.adsdk.oa.yo.yo.uef uefVar, com.bytedance.adsdk.oa.yo.oa.oa oaVar) {
        this.f24587oa = oaVar.uef();
        this.yo = czVar;
        com.bytedance.adsdk.oa.uef.oa.uef<PointF, PointF> uefVarUef = oaVar.yo().uef();
        this.moa = uefVarUef;
        com.bytedance.adsdk.oa.uef.oa.uef<PointF, PointF> uefVarUef2 = oaVar.oa().uef();
        this.lw = uefVarUef2;
        this.ivm = oaVar;
        uefVar.uef(uefVarUef);
        uefVar.uef(uefVarUef2);
        uefVarUef.uef(this);
        uefVarUef2.uef(this);
    }

    private void oa() {
        this.bcc = false;
        this.yo.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.oa.uef.uef.cq
    public Path moa() {
        if (this.bcc) {
            return this.uef;
        }
        this.uef.reset();
        if (this.ivm.lw()) {
            this.bcc = true;
            return this.uef;
        }
        PointF pointFXs = this.moa.xs();
        float f10 = pointFXs.x / 2.0f;
        float f11 = pointFXs.y / 2.0f;
        float f12 = f10 * 0.55228f;
        float f13 = 0.55228f * f11;
        this.uef.reset();
        if (this.ivm.moa()) {
            float f14 = -f11;
            this.uef.moveTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f14);
            Path path = this.uef;
            float f15 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - f12;
            float f16 = -f10;
            float f17 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - f13;
            path.cubicTo(f15, f14, f16, f17, f16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            Path path2 = this.uef;
            float f18 = f13 + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            path2.cubicTo(f16, f18, f15, f11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f11);
            Path path3 = this.uef;
            float f19 = f12 + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            path3.cubicTo(f19, f11, f10, f18, f10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.uef.cubicTo(f10, f17, f19, f14, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f14);
        } else {
            float f20 = -f11;
            this.uef.moveTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f20);
            Path path4 = this.uef;
            float f21 = f12 + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            float f22 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - f13;
            path4.cubicTo(f21, f20, f10, f22, f10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            Path path5 = this.uef;
            float f23 = f13 + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            path5.cubicTo(f10, f23, f21, f11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f11);
            Path path6 = this.uef;
            float f24 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - f12;
            float f25 = -f10;
            path6.cubicTo(f24, f11, f25, f23, f25, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.uef.cubicTo(f25, f22, f24, f20, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f20);
        }
        PointF pointFXs2 = this.lw.xs();
        this.uef.offset(pointFXs2.x, pointFXs2.y);
        this.uef.close();
        this.xs.uef(this.uef);
        this.bcc = true;
        return this.uef;
    }

    @Override // com.bytedance.adsdk.oa.uef.oa.uef.InterfaceC0035uef
    public void uef() {
        oa();
    }

    @Override // com.bytedance.adsdk.oa.uef.uef.yo
    public void uef(List<yo> list, List<yo> list2) {
        for (int i5 = 0; i5 < list.size(); i5++) {
            yo yoVar = list.get(i5);
            if (yoVar instanceof tpx) {
                tpx tpxVar = (tpx) yoVar;
                if (tpxVar.oa() == oib.uef.SIMULTANEOUSLY) {
                    this.xs.uef(tpxVar);
                    tpxVar.uef(this);
                }
            }
        }
    }
}
