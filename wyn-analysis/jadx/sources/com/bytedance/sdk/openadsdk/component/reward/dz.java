package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.openadsdk.AdSlot;

/* loaded from: classes3.dex */
public class dz implements Runnable {

    /* renamed from: oa, reason: collision with root package name */
    AdSlot f25368oa;
    boolean uef;

    public dz(boolean z2, AdSlot adSlot) {
        this.uef = z2;
        this.f25368oa = adSlot;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.uef) {
            if (com.bytedance.sdk.openadsdk.utils.oa.yo()) {
                sy.uef(com.bytedance.sdk.openadsdk.core.sy.uef()).uef(this.f25368oa);
                return;
            } else {
                bs.uef(com.bytedance.sdk.openadsdk.core.sy.uef()).uef(this.f25368oa);
                return;
            }
        }
        if (com.bytedance.sdk.openadsdk.utils.oa.yo()) {
            xs.uef(com.bytedance.sdk.openadsdk.core.sy.uef()).uef(this.f25368oa);
        } else {
            ivm.uef(com.bytedance.sdk.openadsdk.core.sy.uef()).uef(this.f25368oa);
        }
    }
}
