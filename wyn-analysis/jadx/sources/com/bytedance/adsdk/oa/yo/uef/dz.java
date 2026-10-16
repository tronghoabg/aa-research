package com.bytedance.adsdk.oa.yo.uef;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
abstract class dz<V, O> implements cq<V, O> {
    final List<com.bytedance.adsdk.oa.xs.uef<V>> uef;

    public dz(List<com.bytedance.adsdk.oa.xs.uef<V>> list) {
        this.uef = list;
    }

    @Override // com.bytedance.adsdk.oa.yo.uef.cq
    public boolean oa() {
        return this.uef.isEmpty() || (this.uef.size() == 1 && this.uef.get(0).lw());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (!this.uef.isEmpty()) {
            sb2.append("values=");
            sb2.append(Arrays.toString(this.uef.toArray()));
        }
        return sb2.toString();
    }

    @Override // com.bytedance.adsdk.oa.yo.uef.cq
    public List<com.bytedance.adsdk.oa.xs.uef<V>> yo() {
        return this.uef;
    }
}
