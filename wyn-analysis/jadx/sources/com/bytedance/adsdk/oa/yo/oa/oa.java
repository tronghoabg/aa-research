package com.bytedance.adsdk.oa.yo.oa;

import android.graphics.PointF;

/* loaded from: classes.dex */
public class oa implements yo {
    private final boolean lw;
    private final boolean moa;

    /* renamed from: oa, reason: collision with root package name */
    private final com.bytedance.adsdk.oa.yo.uef.cq<PointF, PointF> f24624oa;
    private final String uef;
    private final com.bytedance.adsdk.oa.yo.uef.ivm yo;

    public oa(String str, com.bytedance.adsdk.oa.yo.uef.cq<PointF, PointF> cqVar, com.bytedance.adsdk.oa.yo.uef.ivm ivmVar, boolean z2, boolean z10) {
        this.uef = str;
        this.f24624oa = cqVar;
        this.yo = ivmVar;
        this.moa = z2;
        this.lw = z10;
    }

    public boolean lw() {
        return this.lw;
    }

    public boolean moa() {
        return this.moa;
    }

    public com.bytedance.adsdk.oa.yo.uef.cq<PointF, PointF> oa() {
        return this.f24624oa;
    }

    @Override // com.bytedance.adsdk.oa.yo.oa.yo
    public com.bytedance.adsdk.oa.uef.uef.yo uef(com.bytedance.adsdk.oa.cz czVar, com.bytedance.adsdk.oa.xs xsVar, com.bytedance.adsdk.oa.yo.yo.uef uefVar) {
        return new com.bytedance.adsdk.oa.uef.uef.ivm(czVar, uefVar, this);
    }

    public com.bytedance.adsdk.oa.yo.uef.ivm yo() {
        return this.yo;
    }

    public String uef() {
        return this.uef;
    }
}
