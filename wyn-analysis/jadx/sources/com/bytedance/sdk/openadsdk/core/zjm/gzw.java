package com.bytedance.sdk.openadsdk.core.zjm;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public class gzw implements com.bytedance.sdk.openadsdk.core.cq.xs.yo {
    private String ivm;
    private long uef = 0;

    /* renamed from: oa, reason: collision with root package name */
    private long f25858oa = 0;
    private int yo = 0;
    private String moa = null;
    private String lw = null;
    private final AtomicBoolean xs = new AtomicBoolean(false);

    @Override // com.bytedance.sdk.openadsdk.core.cq.xs.yo
    public void oa(String str) {
        this.lw = str;
        this.f25858oa = SystemClock.elapsedRealtime();
        this.xs.set(true);
    }

    @Override // com.bytedance.sdk.openadsdk.core.cq.xs.yo
    public void uef(String str) {
        this.ivm = str;
        this.uef = SystemClock.elapsedRealtime();
    }

    @Override // com.bytedance.sdk.openadsdk.core.cq.xs.yo
    public void uef(int i5, String str, String str2) {
        this.yo = i5;
        this.moa = str;
        this.lw = str2;
        this.f25858oa = SystemClock.elapsedRealtime();
        this.xs.set(false);
    }

    public void uef(com.bytedance.sdk.openadsdk.core.model.gzw gzwVar, String str) {
        if (this.xs.get()) {
            com.bytedance.sdk.openadsdk.moa.yo.uef(gzwVar, false, str, "success", this.f25858oa - this.uef, this.lw, this.ivm, 0, null);
        } else {
            com.bytedance.sdk.openadsdk.moa.yo.uef(gzwVar, false, str, "fail", this.f25858oa - this.uef, this.lw, this.ivm, this.yo, this.moa);
        }
    }
}
