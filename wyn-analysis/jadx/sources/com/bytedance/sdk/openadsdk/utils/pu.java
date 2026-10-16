package com.bytedance.sdk.openadsdk.utils;

import android.os.SystemClock;

/* loaded from: classes3.dex */
public class pu {

    /* renamed from: oa, reason: collision with root package name */
    private long f26160oa;
    public long uef;

    private pu(boolean z2) {
        if (z2) {
            lw();
        }
    }

    public static pu oa() {
        return new pu(true);
    }

    public static pu yo() {
        return new pu(false);
    }

    public boolean ivm() {
        return this.f26160oa > 0;
    }

    public void lw() {
        this.uef = System.currentTimeMillis();
        this.f26160oa = SystemClock.elapsedRealtime();
    }

    public long moa() {
        return SystemClock.elapsedRealtime() - this.f26160oa;
    }

    public String toString() {
        return String.valueOf(this.uef);
    }

    public long uef() {
        return this.f26160oa;
    }

    public long uef(pu puVar) {
        return Math.abs(puVar.f26160oa - this.f26160oa);
    }
}
