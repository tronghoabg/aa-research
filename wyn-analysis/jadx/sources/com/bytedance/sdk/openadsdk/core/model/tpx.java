package com.bytedance.sdk.openadsdk.core.model;

/* loaded from: classes3.dex */
public class tpx {
    private long uef = 10000;

    /* renamed from: oa, reason: collision with root package name */
    private long f25710oa = 10000;
    private long yo = 10;
    private long moa = 20;
    private String lw = "";

    public String lw() {
        return this.lw;
    }

    public long moa() {
        return this.moa;
    }

    public long oa() {
        return this.f25710oa;
    }

    public long uef() {
        return this.uef;
    }

    public long yo() {
        return this.yo;
    }

    public void moa(long j8) {
        if (j8 < 0) {
            this.moa = 20L;
        } else {
            this.moa = j8;
        }
    }

    public void oa(long j8) {
        if (j8 < 0) {
            this.f25710oa = 20L;
        } else {
            this.f25710oa = j8;
        }
    }

    public void uef(long j8) {
        if (j8 <= 0) {
            this.uef = 10L;
        } else {
            this.uef = j8;
        }
    }

    public void yo(long j8) {
        if (j8 <= 0) {
            this.yo = 10L;
        } else {
            this.yo = j8;
        }
    }

    public void uef(String str) {
        this.lw = str;
    }
}
