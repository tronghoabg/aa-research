package com.google.android.datatransport.runtime.scheduling.a;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class s implements c.b.c {

    /* renamed from: a, reason: collision with root package name */
    private final c.b.e f4282a;

    /* renamed from: b, reason: collision with root package name */
    private final c.b.e f4283b;

    private s(c.b.e eVar, c.b.e eVar2) {
        this.f4282a = eVar;
        this.f4283b = eVar2;
    }

    public static s a(c.b.e eVar, c.b.e eVar2) {
        return new s(eVar, eVar2);
    }

    @Override // g.a.a, f.a.a
    public final /* bridge */ /* synthetic */ Object get() {
        return new r(com.google.android.datatransport.runtime.p.c(), com.google.android.datatransport.runtime.p.d(), c.a(), ((w) this.f4282a).get(), this.f4283b);
    }
}
