package com.bytedance.sdk.openadsdk.component.lw;

import com.bytedance.sdk.openadsdk.core.model.gzw;

/* loaded from: classes3.dex */
public class yo {
    private String ivm;
    private int lw;
    private com.bytedance.sdk.openadsdk.core.model.uef moa;

    /* renamed from: oa, reason: collision with root package name */
    private int f25344oa;
    private int uef;
    private boolean xs;
    private gzw yo;

    public yo(int i5, int i10, gzw gzwVar, com.bytedance.sdk.openadsdk.core.model.uef uefVar) {
        this.uef = i5;
        this.f25344oa = i10;
        this.yo = gzwVar;
        this.moa = uefVar;
    }

    public String ivm() {
        return this.ivm;
    }

    public int lw() {
        return this.lw;
    }

    public gzw moa() {
        return this.yo;
    }

    public int oa() {
        return this.uef;
    }

    public com.bytedance.sdk.openadsdk.core.model.uef uef() {
        return this.moa;
    }

    public int yo() {
        return this.f25344oa;
    }

    public void uef(boolean z2) {
        this.xs = z2;
    }

    public yo(int i5, int i10, int i11, String str) {
        this.uef = i5;
        this.f25344oa = i10;
        this.lw = i11;
        this.ivm = str;
    }
}
