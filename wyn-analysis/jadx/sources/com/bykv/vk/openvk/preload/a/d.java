package com.bykv.vk.openvk.preload.a;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public abstract class d<IN, OUT> {

    /* renamed from: d, reason: collision with root package name */
    private static AtomicLong f24261d = new AtomicLong();

    /* renamed from: a, reason: collision with root package name */
    d f24262a;

    /* renamed from: b, reason: collision with root package name */
    IN f24263b;

    /* renamed from: c, reason: collision with root package name */
    OUT f24264c;

    /* renamed from: e, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.a.b.a f24265e;

    /* renamed from: f, reason: collision with root package name */
    private b f24266f;

    /* renamed from: g, reason: collision with root package name */
    private long f24267g;

    public abstract Object a(b<OUT> bVar, IN in) throws Throwable;

    public void a(Object... objArr) {
    }

    public final long b() {
        return this.f24267g;
    }

    public final void c() {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f24265e;
        if (aVar == null) {
            return;
        }
        aVar.a(this.f24266f, this);
    }

    public final void d() {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f24265e;
        if (aVar == null) {
            return;
        }
        aVar.c(this.f24266f, this);
    }

    public final void e() {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f24265e;
        if (aVar == null) {
            return;
        }
        aVar.b(this.f24266f, this);
    }

    public final OUT f() {
        return this.f24264c;
    }

    public final void a(b bVar, d dVar, IN in, com.bykv.vk.openvk.preload.a.b.a aVar, Object[] objArr) {
        this.f24266f = new m(bVar);
        this.f24262a = dVar;
        this.f24263b = in;
        this.f24265e = aVar;
        if (dVar != null) {
            this.f24267g = dVar.f24267g;
        } else {
            long andIncrement = f24261d.getAndIncrement();
            this.f24267g = andIncrement;
            if (andIncrement < 0) {
                throw new RuntimeException("Pipeline ID use up!");
            }
        }
        a(objArr);
    }

    public final void b(Throwable th) {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f24265e;
        if (aVar == null) {
            return;
        }
        aVar.a(this.f24266f, this, th);
    }

    public final void c(Throwable th) {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f24265e;
        if (aVar == null) {
            return;
        }
        aVar.b(this.f24266f, this, th);
    }

    public final void d(Throwable th) {
        com.bykv.vk.openvk.preload.a.b.a aVar = this.f24265e;
        if (aVar == null) {
            return;
        }
        aVar.c(this.f24266f, this, th);
    }
}
