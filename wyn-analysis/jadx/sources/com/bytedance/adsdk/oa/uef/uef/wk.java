package com.bytedance.adsdk.oa.uef.uef;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.bytedance.adsdk.oa.uef.oa.uef;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes.dex */
public class wk implements uef.InterfaceC0035uef, cq, dj {
    private final com.bytedance.adsdk.oa.uef.oa.uef<?, Float> bcc;
    private boolean dj;
    private final com.bytedance.adsdk.oa.uef.oa.uef<?, PointF> ivm;
    private final com.bytedance.adsdk.oa.cz lw;
    private final boolean moa;
    private final com.bytedance.adsdk.oa.uef.oa.uef<?, PointF> xs;
    private final String yo;
    private final Path uef = new Path();

    /* renamed from: oa, reason: collision with root package name */
    private final RectF f24594oa = new RectF();
    private final oa cz = new oa();
    private com.bytedance.adsdk.oa.uef.oa.uef<Float, Float> zjm = null;

    public wk(com.bytedance.adsdk.oa.cz czVar, com.bytedance.adsdk.oa.yo.yo.uef uefVar, com.bytedance.adsdk.oa.yo.oa.dj djVar) {
        this.yo = djVar.uef();
        this.moa = djVar.lw();
        this.lw = czVar;
        com.bytedance.adsdk.oa.uef.oa.uef<PointF, PointF> uefVarUef = djVar.moa().uef();
        this.ivm = uefVarUef;
        com.bytedance.adsdk.oa.uef.oa.uef<PointF, PointF> uefVarUef2 = djVar.yo().uef();
        this.xs = uefVarUef2;
        com.bytedance.adsdk.oa.uef.oa.uef<Float, Float> uefVarUef3 = djVar.oa().uef();
        this.bcc = uefVarUef3;
        uefVar.uef(uefVarUef);
        uefVar.uef(uefVarUef2);
        uefVar.uef(uefVarUef3);
        uefVarUef.uef(this);
        uefVarUef2.uef(this);
        uefVarUef3.uef(this);
    }

    private void oa() {
        this.dj = false;
        this.lw.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.oa.uef.uef.cq
    public Path moa() {
        com.bytedance.adsdk.oa.uef.oa.uef<Float, Float> uefVar;
        if (this.dj) {
            return this.uef;
        }
        this.uef.reset();
        if (this.moa) {
            this.dj = true;
            return this.uef;
        }
        PointF pointFXs = this.xs.xs();
        float f10 = pointFXs.x / 2.0f;
        float f11 = pointFXs.y / 2.0f;
        com.bytedance.adsdk.oa.uef.oa.uef<?, Float> uefVar2 = this.bcc;
        float fCz = uefVar2 == null ? 0.0f : ((com.bytedance.adsdk.oa.uef.oa.moa) uefVar2).cz();
        if (fCz == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (uefVar = this.zjm) != null) {
            fCz = Math.min(uefVar.xs().floatValue(), Math.min(f10, f11));
        }
        float fMin = Math.min(f10, f11);
        if (fCz > fMin) {
            fCz = fMin;
        }
        PointF pointFXs2 = this.ivm.xs();
        this.uef.moveTo(pointFXs2.x + f10, (pointFXs2.y - f11) + fCz);
        this.uef.lineTo(pointFXs2.x + f10, (pointFXs2.y + f11) - fCz);
        if (fCz > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            RectF rectF = this.f24594oa;
            float f12 = pointFXs2.x;
            float f13 = fCz * 2.0f;
            float f14 = pointFXs2.y;
            rectF.set((f12 + f10) - f13, (f14 + f11) - f13, f12 + f10, f14 + f11);
            this.uef.arcTo(this.f24594oa, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 90.0f, false);
        }
        this.uef.lineTo((pointFXs2.x - f10) + fCz, pointFXs2.y + f11);
        if (fCz > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            RectF rectF2 = this.f24594oa;
            float f15 = pointFXs2.x;
            float f16 = pointFXs2.y;
            float f17 = fCz * 2.0f;
            rectF2.set(f15 - f10, (f16 + f11) - f17, (f15 - f10) + f17, f16 + f11);
            this.uef.arcTo(this.f24594oa, 90.0f, 90.0f, false);
        }
        this.uef.lineTo(pointFXs2.x - f10, (pointFXs2.y - f11) + fCz);
        if (fCz > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            RectF rectF3 = this.f24594oa;
            float f18 = pointFXs2.x;
            float f19 = pointFXs2.y;
            float f20 = fCz * 2.0f;
            rectF3.set(f18 - f10, f19 - f11, (f18 - f10) + f20, (f19 - f11) + f20);
            this.uef.arcTo(this.f24594oa, 180.0f, 90.0f, false);
        }
        this.uef.lineTo((pointFXs2.x + f10) - fCz, pointFXs2.y - f11);
        if (fCz > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            RectF rectF4 = this.f24594oa;
            float f21 = pointFXs2.x;
            float f22 = fCz * 2.0f;
            float f23 = pointFXs2.y;
            rectF4.set((f21 + f10) - f22, f23 - f11, f21 + f10, (f23 - f11) + f22);
            this.uef.arcTo(this.f24594oa, 270.0f, 90.0f, false);
        }
        this.uef.close();
        this.cz.uef(this.uef);
        this.dj = true;
        return this.uef;
    }

    @Override // com.bytedance.adsdk.oa.uef.oa.uef.InterfaceC0035uef
    public void uef() {
        oa();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    @Override // com.bytedance.adsdk.oa.uef.uef.yo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void uef(java.util.List<com.bytedance.adsdk.oa.uef.uef.yo> r5, java.util.List<com.bytedance.adsdk.oa.uef.uef.yo> r6) {
        /*
            r4 = this;
            r6 = 0
        L1:
            int r0 = r5.size()
            if (r6 >= r0) goto L34
            java.lang.Object r0 = r5.get(r6)
            com.bytedance.adsdk.oa.uef.uef.yo r0 = (com.bytedance.adsdk.oa.uef.uef.yo) r0
            boolean r1 = r0 instanceof com.bytedance.adsdk.oa.uef.uef.tpx
            if (r1 == 0) goto L25
            r1 = r0
            com.bytedance.adsdk.oa.uef.uef.tpx r1 = (com.bytedance.adsdk.oa.uef.uef.tpx) r1
            com.bytedance.adsdk.oa.yo.oa.oib$uef r2 = r1.oa()
            com.bytedance.adsdk.oa.yo.oa.oib$uef r3 = com.bytedance.adsdk.oa.yo.oa.oib.uef.SIMULTANEOUSLY
            if (r2 != r3) goto L25
            com.bytedance.adsdk.oa.uef.uef.oa r0 = r4.cz
            r0.uef(r1)
            r1.uef(r4)
            goto L31
        L25:
            boolean r1 = r0 instanceof com.bytedance.adsdk.oa.uef.uef.bs
            if (r1 == 0) goto L31
            com.bytedance.adsdk.oa.uef.uef.bs r0 = (com.bytedance.adsdk.oa.uef.uef.bs) r0
            com.bytedance.adsdk.oa.uef.oa.uef r0 = r0.oa()
            r4.zjm = r0
        L31:
            int r6 = r6 + 1
            goto L1
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.oa.uef.uef.wk.uef(java.util.List, java.util.List):void");
    }
}
