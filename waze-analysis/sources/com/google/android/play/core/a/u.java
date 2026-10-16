package com.google.android.play.core.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class u implements c.b.c {

    /* renamed from: a, reason: collision with root package name */
    private final c.b.e f6962a;

    /* renamed from: b, reason: collision with root package name */
    private final c.b.e f6963b;

    private u(c.b.e eVar, c.b.e eVar2) {
        this.f6962a = eVar;
        this.f6963b = eVar2;
    }

    public static u b(c.b.e eVar, c.b.e eVar2) {
        return new u(eVar, eVar2);
    }

    @Override // g.a.a, f.a.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final t get() {
        return new t(this.f6962a, this.f6963b);
    }
}
