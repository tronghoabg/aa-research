package com.applovin.impl;

/* loaded from: classes.dex */
public class s6 extends j5 {

    /* renamed from: g, reason: collision with root package name */
    private final Runnable f22782g;

    public s6(com.applovin.impl.sdk.k kVar, String str, Runnable runnable) {
        this(kVar, false, str, runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f22782g.run();
    }

    public s6(com.applovin.impl.sdk.k kVar, boolean z2, String str, Runnable runnable) {
        super(R8.v.f("TaskRunnable:", str), kVar, z2);
        this.f22782g = runnable;
    }
}
