package com.bytedance.adsdk.oa.yo.oa;

import android.graphics.PointF;

/* loaded from: classes.dex */
public class dj implements yo {
    private final boolean lw;
    private final com.bytedance.adsdk.oa.yo.uef.oa moa;

    /* renamed from: oa, reason: collision with root package name */
    private final com.bytedance.adsdk.oa.yo.uef.cq<PointF, PointF> f24619oa;
    private final String uef;
    private final com.bytedance.adsdk.oa.yo.uef.cq<PointF, PointF> yo;

    public dj(String str, com.bytedance.adsdk.oa.yo.uef.cq<PointF, PointF> cqVar, com.bytedance.adsdk.oa.yo.uef.cq<PointF, PointF> cqVar2, com.bytedance.adsdk.oa.yo.uef.oa oaVar, boolean z2) {
        this.uef = str;
        this.f24619oa = cqVar;
        this.yo = cqVar2;
        this.moa = oaVar;
        this.lw = z2;
    }

    public boolean lw() {
        return this.lw;
    }

    public com.bytedance.adsdk.oa.yo.uef.cq<PointF, PointF> moa() {
        return this.f24619oa;
    }

    public com.bytedance.adsdk.oa.yo.uef.oa oa() {
        return this.moa;
    }

    public String toString() {
        return "RectangleShape{position=" + this.f24619oa + ", size=" + this.yo + '}';
    }

    public String uef() {
        return this.uef;
    }

    public com.bytedance.adsdk.oa.yo.uef.cq<PointF, PointF> yo() {
        return this.yo;
    }

    @Override // com.bytedance.adsdk.oa.yo.oa.yo
    public com.bytedance.adsdk.oa.uef.uef.yo uef(com.bytedance.adsdk.oa.cz czVar, com.bytedance.adsdk.oa.xs xsVar, com.bytedance.adsdk.oa.yo.yo.uef uefVar) {
        return new com.bytedance.adsdk.oa.uef.uef.wk(czVar, uefVar, this);
    }
}
