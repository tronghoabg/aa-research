package com.bytedance.sdk.openadsdk.moa.uef;

/* loaded from: classes3.dex */
class yo implements com.bytedance.sdk.component.ivm.uef.lw.yo {
    private final com.bytedance.sdk.component.xs.oa.oa uef;

    public yo() {
        com.bytedance.sdk.component.xs.oa.oa oaVarYo = com.bytedance.sdk.openadsdk.dhk.oa.oa().yo().yo();
        this.uef = oaVarYo;
        oaVarYo.uef(7);
        oaVarYo.oa("track_url");
    }

    @Override // com.bytedance.sdk.component.ivm.uef.lw.yo
    public void uef(String str) {
        this.uef.yo(str);
    }

    @Override // com.bytedance.sdk.component.ivm.uef.lw.yo
    public void uef(String str, String str2) {
        this.uef.oa(str, str2);
    }

    @Override // com.bytedance.sdk.component.ivm.uef.lw.yo
    public com.bytedance.sdk.component.ivm.uef.lw.moa uef() {
        return new lw(this.uef.lw());
    }
}
