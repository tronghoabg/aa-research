package com.bytedance.adsdk.oa.yo.oa;

/* loaded from: classes.dex */
public class wrv implements yo {
    private final boolean lw;
    private final com.bytedance.adsdk.oa.yo.uef.wrv moa;

    /* renamed from: oa, reason: collision with root package name */
    private final com.bytedance.adsdk.oa.yo.uef.oa f24633oa;
    private final String uef;
    private final com.bytedance.adsdk.oa.yo.uef.oa yo;

    public wrv(String str, com.bytedance.adsdk.oa.yo.uef.oa oaVar, com.bytedance.adsdk.oa.yo.uef.oa oaVar2, com.bytedance.adsdk.oa.yo.uef.wrv wrvVar, boolean z2) {
        this.uef = str;
        this.f24633oa = oaVar;
        this.yo = oaVar2;
        this.moa = wrvVar;
        this.lw = z2;
    }

    public boolean lw() {
        return this.lw;
    }

    public com.bytedance.adsdk.oa.yo.uef.wrv moa() {
        return this.moa;
    }

    public com.bytedance.adsdk.oa.yo.uef.oa oa() {
        return this.f24633oa;
    }

    public String uef() {
        return this.uef;
    }

    public com.bytedance.adsdk.oa.yo.uef.oa yo() {
        return this.yo;
    }

    @Override // com.bytedance.adsdk.oa.yo.oa.yo
    public com.bytedance.adsdk.oa.uef.uef.yo uef(com.bytedance.adsdk.oa.cz czVar, com.bytedance.adsdk.oa.xs xsVar, com.bytedance.adsdk.oa.yo.yo.uef uefVar) {
        return new com.bytedance.adsdk.oa.uef.uef.ab(czVar, uefVar, this);
    }
}
