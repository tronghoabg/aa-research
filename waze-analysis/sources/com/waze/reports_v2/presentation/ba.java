package com.waze.reports_v2.presentation;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class ba {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f34840a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f34841b;

    /* renamed from: c, reason: collision with root package name */
    private final h.g.a.a f34842c;

    public /* synthetic */ ba(boolean z, int i2) {
        com.waze.navigate.dc dcVar = new com.waze.navigate.dc(6);
        this.f34840a = 1 == ((i2 & 1) ^ 1);
        this.f34841b = z & ((i2 & 2) == 0);
        this.f34842c = dcVar;
    }

    public h.g.a.a a() {
        throw null;
    }

    public h.g.a.a b() {
        return this.f34842c;
    }

    public final boolean c() {
        return this.f34840a;
    }

    public final boolean d() {
        return this.f34841b;
    }
}
