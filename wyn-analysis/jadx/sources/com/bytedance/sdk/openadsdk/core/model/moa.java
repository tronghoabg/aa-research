package com.bytedance.sdk.openadsdk.core.model;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public class moa {
    private com.bytedance.sdk.openadsdk.core.dz.moa uef = new com.bytedance.sdk.openadsdk.core.dz.moa();

    /* renamed from: oa, reason: collision with root package name */
    private Set<com.bytedance.sdk.openadsdk.core.dz.zjm> f25700oa = new HashSet();

    public Set<com.bytedance.sdk.openadsdk.core.dz.zjm> oa() {
        return this.f25700oa;
    }

    public com.bytedance.sdk.openadsdk.core.dz.moa uef() {
        return this.uef;
    }

    public void oa(Set<com.bytedance.sdk.openadsdk.core.dz.zjm> set) {
        if (set == null || set.isEmpty()) {
            return;
        }
        this.f25700oa.addAll(set);
    }

    public void uef(com.bytedance.sdk.openadsdk.core.dz.moa moaVar) {
        if (moaVar == null) {
            moaVar = new com.bytedance.sdk.openadsdk.core.dz.moa();
        }
        this.uef = moaVar;
    }

    public void uef(Set<com.bytedance.sdk.openadsdk.core.dz.zjm> set) {
        this.f25700oa = set;
    }

    public void uef(gzw gzwVar) {
        com.bytedance.sdk.openadsdk.core.dz.moa moaVar = this.uef;
        if (moaVar != null) {
            moaVar.uef(gzwVar);
        }
    }
}
