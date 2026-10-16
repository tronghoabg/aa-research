package com.bumptech.glide.load.a;

import androidx.core.util.Pools;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class av implements aw, com.bumptech.glide.g.a.f {

    /* renamed from: a, reason: collision with root package name */
    private static final Pools.Pool f3047a = com.bumptech.glide.g.a.h.a(20, new au());

    /* renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.g.a.i f3048b = com.bumptech.glide.g.a.i.a();

    /* renamed from: c, reason: collision with root package name */
    private aw f3049c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f3050d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f3051e;

    av() {
    }

    static av d(aw awVar) {
        av avVar = (av) f3047a.acquire();
        com.bumptech.glide.g.p.f(avVar);
        avVar.f3051e = false;
        avVar.f3050d = true;
        avVar.f3049c = awVar;
        return avVar;
    }

    @Override // com.bumptech.glide.load.a.aw
    public final int a() {
        return this.f3049c.a();
    }

    @Override // com.bumptech.glide.load.a.aw
    public final Class b() {
        return this.f3049c.b();
    }

    @Override // com.bumptech.glide.g.a.f
    public final com.bumptech.glide.g.a.i bl() {
        return this.f3048b;
    }

    @Override // com.bumptech.glide.load.a.aw
    public final Object c() {
        return this.f3049c.c();
    }

    @Override // com.bumptech.glide.load.a.aw
    public final synchronized void e() {
        this.f3048b.c();
        this.f3051e = true;
        if (this.f3050d) {
            return;
        }
        this.f3049c.e();
        this.f3049c = null;
        f3047a.release(this);
    }

    final synchronized void f() {
        this.f3048b.c();
        if (!this.f3050d) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f3050d = false;
        if (this.f3051e) {
            e();
        }
    }
}
