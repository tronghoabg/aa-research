package com.bytedance.sdk.openadsdk.component.bcc;

/* loaded from: classes3.dex */
public final class uef {
    private long lw;
    private boolean moa;

    /* renamed from: oa, reason: collision with root package name */
    private long f25323oa;
    private float uef;
    private long yo;

    public long moa() {
        return this.yo;
    }

    public float oa() {
        return this.uef;
    }

    public void uef(boolean z2) {
        this.moa = z2;
    }

    public long yo() {
        return this.f25323oa;
    }

    public void oa(long j8) {
        this.f25323oa = j8;
    }

    public long uef() {
        return this.lw;
    }

    public void yo(long j8) {
        this.yo = j8;
    }

    public void uef(long j8) {
        this.lw = j8;
    }

    public void uef(float f10) {
        StringBuilder sb2 = new StringBuilder("setTotalTime() called with: time = [");
        sb2.append(f10);
        sb2.append("]");
        this.uef = f10;
    }
}
