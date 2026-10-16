package com.vungle.ads.internal.executor;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    public j f32980a;

    /* renamed from: b, reason: collision with root package name */
    public j f32981b;

    /* renamed from: c, reason: collision with root package name */
    public j f32982c;

    /* renamed from: d, reason: collision with root package name */
    public j f32983d;

    /* renamed from: e, reason: collision with root package name */
    public j f32984e;

    /* renamed from: f, reason: collision with root package name */
    public j f32985f;

    /* renamed from: g, reason: collision with root package name */
    public j f32986g;

    /* renamed from: h, reason: collision with root package name */
    public j f32987h;

    public d() {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f32982c = new j(iAvailableProcessors, iAvailableProcessors, 5L, timeUnit, new LinkedBlockingQueue(), new c("vng_jr"));
        this.f32980a = new j(1, 1, 5L, timeUnit, new LinkedBlockingQueue(), new c("vng_io"));
        this.f32987h = new j(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new c("vng_api"));
        this.f32983d = new j(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new c("vng_logger"));
        this.f32981b = new j(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new c("vng_background"));
        this.f32984e = new j(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new c("vng_ua"));
        this.f32985f = new j(4, 4, 1L, timeUnit, new PriorityBlockingQueue(), new c("vng_down"));
        this.f32986g = new j(1, 1, 10L, timeUnit, new LinkedBlockingQueue(), new c("vng_ol"));
    }

    public final j a() {
        return this.f32987h;
    }

    public final j b() {
        return this.f32981b;
    }

    public final j c() {
        return this.f32980a;
    }

    public final j d() {
        return this.f32982c;
    }

    public final j e() {
        return this.f32983d;
    }

    public final j f() {
        return this.f32986g;
    }
}
