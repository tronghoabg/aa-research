package com.b.b.a;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class b extends m {

    /* renamed from: d, reason: collision with root package name */
    private a f2579d;

    @Override // com.b.b.a.m
    protected final void b() {
        boolean z = this.f2599a;
        a aVar = this.f2579d;
        if (aVar != null) {
            aVar.a(this.f2600b.a());
        }
    }

    public final void c(a aVar) {
        this.f2579d = aVar;
        if (this.f2600b == null || !this.f2600b.c()) {
            return;
        }
        b();
    }
}
