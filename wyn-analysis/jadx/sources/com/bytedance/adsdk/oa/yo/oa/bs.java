package com.bytedance.adsdk.oa.yo.oa;

import Va.M6;

/* loaded from: classes.dex */
public class bs implements yo {
    private final boolean moa;

    /* renamed from: oa, reason: collision with root package name */
    private final int f24615oa;
    private final String uef;
    private final com.bytedance.adsdk.oa.yo.uef.bcc yo;

    public bs(String str, int i5, com.bytedance.adsdk.oa.yo.uef.bcc bccVar, boolean z2) {
        this.uef = str;
        this.f24615oa = i5;
        this.yo = bccVar;
        this.moa = z2;
    }

    public com.bytedance.adsdk.oa.yo.uef.bcc oa() {
        return this.yo;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ShapePath{name=");
        sb2.append(this.uef);
        sb2.append(", index=");
        return M6.r(sb2, this.f24615oa, '}');
    }

    public String uef() {
        return this.uef;
    }

    public boolean yo() {
        return this.moa;
    }

    @Override // com.bytedance.adsdk.oa.yo.oa.yo
    public com.bytedance.adsdk.oa.uef.uef.yo uef(com.bytedance.adsdk.oa.cz czVar, com.bytedance.adsdk.oa.xs xsVar, com.bytedance.adsdk.oa.yo.yo.uef uefVar) {
        return new com.bytedance.adsdk.oa.uef.uef.sy(czVar, uefVar, this);
    }
}
