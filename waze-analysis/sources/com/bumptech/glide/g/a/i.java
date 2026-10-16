package com.bumptech.glide.g.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private volatile boolean f2889a;

    public static i a() {
        return new i();
    }

    public final void b(boolean z) {
        this.f2889a = z;
    }

    public final void c() {
        if (this.f2889a) {
            throw new IllegalStateException("Already released");
        }
    }
}
