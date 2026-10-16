package com.bytedance.sdk.component.ivm.uef.moa.oa;

/* loaded from: classes.dex */
public class uef {

    /* renamed from: oa, reason: collision with root package name */
    private int f24991oa;
    private int uef;

    public uef(int i5, int i10, long j8) {
        if (i10 < i5) {
            throw new IllegalStateException("atMostBatchSendCount should meet a condition (atMostBatchSendCount >= maxCacheCount)");
        }
        this.uef = i5;
        this.f24991oa = i10;
    }

    public static uef lw() {
        return new uef(3, 100, 172800000L);
    }

    public static uef moa() {
        return new uef(1, 100, -1L);
    }

    public static uef yo() {
        return new uef(1, 100, 172800000L);
    }

    public int oa() {
        return this.f24991oa;
    }

    public int uef() {
        return this.uef;
    }
}
