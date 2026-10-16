package com.bytedance.sdk.openadsdk.core.zjm.uef;

import com.bytedance.sdk.component.cz.ivm;
import com.bytedance.sdk.openadsdk.cq.dj;

/* loaded from: classes3.dex */
public class moa implements dj {
    private final ivm uef;

    public moa(ivm ivmVar) {
        this.uef = ivmVar;
    }

    @Override // com.bytedance.sdk.openadsdk.cq.dj
    public void oa() {
        ivm ivmVar = this.uef;
        if (ivmVar == null) {
            return;
        }
        ivmVar.sy();
    }

    @Override // com.bytedance.sdk.openadsdk.cq.dj
    public void uef() {
        ivm ivmVar = this.uef;
        if (ivmVar == null) {
            return;
        }
        ivmVar.wk();
    }
}
