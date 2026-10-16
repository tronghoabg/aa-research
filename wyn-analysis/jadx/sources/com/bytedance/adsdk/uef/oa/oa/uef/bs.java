package com.bytedance.adsdk.uef.oa.oa.uef;

/* loaded from: classes.dex */
public abstract class bs implements com.bytedance.adsdk.uef.oa.oa.uef {

    /* renamed from: oa, reason: collision with root package name */
    protected com.bytedance.adsdk.uef.oa.oa.uef f24662oa;
    protected com.bytedance.adsdk.uef.oa.oa.uef uef;
    protected com.bytedance.adsdk.uef.oa.moa.yo yo;

    public bs(com.bytedance.adsdk.uef.oa.moa.yo yoVar) {
        this.yo = yoVar;
    }

    public void oa(com.bytedance.adsdk.uef.oa.oa.uef uefVar) {
        this.f24662oa = uefVar;
    }

    public String toString() {
        return oa();
    }

    public void uef(com.bytedance.adsdk.uef.oa.oa.uef uefVar) {
        this.uef = uefVar;
    }

    @Override // com.bytedance.adsdk.uef.oa.oa.uef
    public String oa() {
        return this.uef.oa() + this.yo.uef() + this.f24662oa.oa();
    }

    @Override // com.bytedance.adsdk.uef.oa.oa.uef
    public com.bytedance.adsdk.uef.oa.moa.lw uef() {
        return com.bytedance.adsdk.uef.oa.moa.ivm.OPERATOR_RESULT;
    }
}
