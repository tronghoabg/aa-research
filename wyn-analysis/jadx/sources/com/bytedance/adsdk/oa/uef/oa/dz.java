package com.bytedance.adsdk.oa.uef.oa;

import android.graphics.PointF;
import com.unity3d.services.UnityAdsConstants;
import java.util.Collections;

/* loaded from: classes.dex */
public class dz extends uef<PointF, PointF> {
    private final uef<Float, Float> bcc;
    private final uef<Float, Float> cz;
    private final PointF ivm;
    protected com.bytedance.adsdk.oa.xs.oa<Float> lw;
    protected com.bytedance.adsdk.oa.xs.oa<Float> moa;
    private final PointF xs;

    public dz(uef<Float, Float> uefVar, uef<Float, Float> uefVar2) {
        super(Collections.EMPTY_LIST);
        this.ivm = new PointF();
        this.xs = new PointF();
        this.bcc = uefVar;
        this.cz = uefVar2;
        uef(bcc());
    }

    @Override // com.bytedance.adsdk.oa.uef.oa.uef
    /* renamed from: cz, reason: merged with bridge method [inline-methods] */
    public PointF xs() {
        return uef(null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // com.bytedance.adsdk.oa.uef.oa.uef
    /* renamed from: oa, reason: merged with bridge method [inline-methods] */
    public PointF uef(com.bytedance.adsdk.oa.xs.uef<PointF> uefVar, float f10) {
        if (this.moa != null && this.bcc.yo() != null) {
            this.bcc.lw();
            throw null;
        }
        if (this.lw != null && this.cz.yo() != null) {
            this.cz.lw();
            throw null;
        }
        this.xs.set(this.ivm.x, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        PointF pointF = this.xs;
        pointF.set(pointF.x, this.ivm.y);
        return this.xs;
    }

    @Override // com.bytedance.adsdk.oa.uef.oa.uef
    public void uef(float f10) {
        this.bcc.uef(f10);
        this.cz.uef(f10);
        this.ivm.set(this.bcc.xs().floatValue(), this.cz.xs().floatValue());
        for (int i5 = 0; i5 < this.uef.size(); i5++) {
            this.uef.get(i5).uef();
        }
    }
}
