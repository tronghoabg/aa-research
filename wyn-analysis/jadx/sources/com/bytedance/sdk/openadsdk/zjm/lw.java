package com.bytedance.sdk.openadsdk.zjm;

import com.bytedance.sdk.component.lw.cz;
import com.bytedance.sdk.component.lw.oib;

/* loaded from: classes3.dex */
public class lw implements oib {
    private static int uef;
    private final String lw;
    private boolean moa;

    /* renamed from: oa, reason: collision with root package name */
    private long f26207oa = 0;
    private long yo;

    public lw() {
        uef++;
        this.lw = "image_request_" + uef;
    }

    private String yo(String str, cz czVar) {
        return str;
    }

    @Override // com.bytedance.sdk.component.lw.oib
    public void oa(String str, cz czVar) {
        this.yo += System.currentTimeMillis() - this.f26207oa;
        yo(str, czVar);
    }

    @Override // com.bytedance.sdk.component.lw.oib
    public void uef(String str, cz czVar) {
        if (!this.moa) {
            czVar.uef();
            czVar.oa();
            czVar.yo();
            this.moa = true;
        }
        this.f26207oa = System.currentTimeMillis();
        yo(str, czVar);
    }
}
