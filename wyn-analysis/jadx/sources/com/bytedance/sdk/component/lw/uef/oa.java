package com.bytedance.sdk.component.lw.uef;

import com.bytedance.sdk.component.lw.dz;
import com.bytedance.sdk.component.lw.lw;

/* loaded from: classes.dex */
public class oa implements lw {
    private dz moa;

    /* renamed from: oa, reason: collision with root package name */
    private boolean f25050oa;
    private String uef;
    private boolean yo;

    public oa(String str, boolean z2, boolean z10, dz dzVar) {
        this.uef = str;
        this.f25050oa = z2;
        this.yo = z10;
        this.moa = dzVar;
    }

    @Override // com.bytedance.sdk.component.lw.lw
    public boolean oa() {
        return this.f25050oa;
    }

    @Override // com.bytedance.sdk.component.lw.lw
    public String uef() {
        return this.uef;
    }

    @Override // com.bytedance.sdk.component.lw.lw
    public boolean yo() {
        return this.yo;
    }
}
