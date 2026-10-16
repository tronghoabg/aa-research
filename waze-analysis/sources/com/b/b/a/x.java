package com.b.b.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class x extends m {

    /* renamed from: d, reason: collision with root package name */
    private volatile v f2613d;

    /* renamed from: e, reason: collision with root package name */
    private volatile w f2614e;

    final void a() {
        boolean z = this.f2599a;
    }

    @Override // com.b.b.a.m
    protected final void b() {
        boolean z = this.f2599a;
        if (this.f2613d != null) {
            this.f2613d.a(this.f2600b.a());
        }
    }

    public final void c(v vVar) {
        this.f2613d = vVar;
        if (this.f2600b == null || !this.f2600b.c()) {
            return;
        }
        b();
    }
}
