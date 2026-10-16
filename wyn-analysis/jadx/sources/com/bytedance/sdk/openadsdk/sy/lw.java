package com.bytedance.sdk.openadsdk.sy;

import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.wk;
import com.bytedance.sdk.openadsdk.core.zjm;

/* loaded from: classes3.dex */
class lw implements moa {
    private int moa;

    /* renamed from: oa, reason: collision with root package name */
    private int f26091oa;
    private moa uef;
    private int yo;

    public lw(moa moaVar, int i5, int i10, int i11) {
        this.uef = moaVar;
        this.f26091oa = i5;
        this.yo = i10;
        this.moa = i11;
    }

    @Override // com.bytedance.sdk.openadsdk.sy.moa
    public com.bytedance.sdk.openadsdk.sy.oa.uef uef() {
        com.bytedance.sdk.openadsdk.sy.oa.uef uefVarUef = this.uef.uef();
        uefVarUef.uef(BuildConfig.VERSION_NAME);
        uefVarUef.uef(this.f26091oa);
        uefVarUef.oa(this.yo);
        uefVarUef.yo(this.moa);
        uefVarUef.ivm(zjm.oa().xs());
        uefVarUef.moa(wk.moa());
        return uefVarUef;
    }
}
