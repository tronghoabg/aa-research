package com.bumptech.glide.load.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class p {

    /* renamed from: a, reason: collision with root package name */
    private boolean f3157a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f3158b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f3159c;

    private final boolean e() {
        return (this.f3159c || this.f3158b) && this.f3157a;
    }

    final synchronized void a() {
        this.f3158b = false;
        this.f3157a = false;
        this.f3159c = false;
    }

    final synchronized boolean b() {
        this.f3158b = true;
        return e();
    }

    final synchronized boolean c() {
        this.f3159c = true;
        return e();
    }

    final synchronized boolean d() {
        this.f3157a = true;
        return e();
    }
}
