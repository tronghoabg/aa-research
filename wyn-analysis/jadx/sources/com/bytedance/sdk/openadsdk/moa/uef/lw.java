package com.bytedance.sdk.openadsdk.moa.uef;

/* loaded from: classes3.dex */
class lw implements com.bytedance.sdk.component.ivm.uef.lw.moa {
    private final com.bytedance.sdk.component.xs.oa uef;

    public lw(com.bytedance.sdk.component.xs.oa oaVar) {
        this.uef = oaVar;
    }

    @Override // com.bytedance.sdk.component.ivm.uef.lw.moa
    public int oa() {
        com.bytedance.sdk.component.xs.oa oaVar = this.uef;
        if (oaVar != null) {
            return oaVar.uef();
        }
        return -1;
    }

    @Override // com.bytedance.sdk.component.ivm.uef.lw.moa
    public boolean uef() {
        com.bytedance.sdk.component.xs.oa oaVar = this.uef;
        if (oaVar != null) {
            return oaVar.ivm();
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.ivm.uef.lw.moa
    public String yo() {
        com.bytedance.sdk.component.xs.oa oaVar = this.uef;
        return oaVar != null ? oaVar.oa() : "";
    }
}
