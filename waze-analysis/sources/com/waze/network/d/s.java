package com.waze.network.d;

import com.waze.navigate.gn;
import h.g.b.x;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class s implements r {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f32220a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicInteger f32221b = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    private final String f32222c;

    /* renamed from: d, reason: collision with root package name */
    private final String f32223d;

    /* renamed from: e, reason: collision with root package name */
    private final String f32224e;

    /* renamed from: f, reason: collision with root package name */
    private final String f32225f;

    /* renamed from: g, reason: collision with root package name */
    private final String f32226g;

    /* renamed from: h, reason: collision with root package name */
    private final h.g.a.a f32227h;

    /* renamed from: i, reason: collision with root package name */
    private final h.g.a.a f32228i;

    public s(com.waze.g.d dVar, com.waze.sharedui.profile.b bVar, n nVar) {
        x.f(dVar, "applicationInfoRepository");
        x.f(bVar, "myProfileManager");
        x.f(nVar, "grpcPlatformProvider");
        this.f32222c = nVar.a().name();
        this.f32223d = dVar.d();
        this.f32224e = ((com.waze.g.c) dVar.e().d()).a();
        this.f32225f = dVar.b().a();
        this.f32226g = dVar.b().b();
        this.f32227h = new gn(dVar, 6);
        this.f32228i = new gn(bVar, 7);
    }

    static final String i() {
        return String.valueOf(f32221b.getAndIncrement());
    }

    @Override // com.waze.network.d.r
    public final String a() {
        return this.f32225f;
    }

    @Override // com.waze.network.d.r
    public final String b() {
        return this.f32222c;
    }

    @Override // com.waze.network.d.r
    public final String c() {
        return this.f32224e;
    }

    @Override // com.waze.network.d.r
    public final String d() {
        return this.f32223d;
    }

    @Override // com.waze.network.d.r
    public final String e() {
        return this.f32226g;
    }

    @Override // com.waze.network.d.r
    public final h.g.a.a f() {
        return this.f32227h;
    }

    @Override // com.waze.network.d.r
    public final h.g.a.a g() {
        return this.f32228i;
    }

    @Override // com.waze.network.d.r
    public final void h() {
    }
}
