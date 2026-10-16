package com.waze.main_screen.c;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
final class ao implements an {

    /* renamed from: a, reason: collision with root package name */
    private final ch f26119a;

    /* renamed from: b, reason: collision with root package name */
    private final ch f26120b;

    /* renamed from: c, reason: collision with root package name */
    private final ch f26121c;

    /* renamed from: d, reason: collision with root package name */
    private final ch f26122d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f26123e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f26124f;

    /* renamed from: g, reason: collision with root package name */
    private final MutableState f26125g;

    /* renamed from: h, reason: collision with root package name */
    private final j f26126h;

    public ao(t tVar, am amVar) {
        h.g.b.x.f(tVar, "buttonPackStateHolder");
        h.g.b.x.f(amVar, "initialShownValue");
        this.f26119a = tVar.e();
        this.f26120b = tVar.d();
        this.f26121c = tVar.g();
        this.f26122d = tVar.f();
        this.f26123e = tVar.a().d();
        this.f26124f = tVar.a().e();
        this.f26125g = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(amVar, null, 2, null);
        this.f26126h = tVar.b();
    }

    @Override // com.waze.main_screen.c.an
    public final j a() {
        return this.f26126h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.waze.main_screen.c.an
    public final am b() {
        return (am) this.f26125g.getValue();
    }

    @Override // com.waze.main_screen.c.an
    public final ch c() {
        return this.f26120b;
    }

    @Override // com.waze.main_screen.c.an
    public final ch d() {
        return this.f26119a;
    }

    @Override // com.waze.main_screen.c.an
    public final ch e() {
        return this.f26122d;
    }

    @Override // com.waze.main_screen.c.an
    public final ch f() {
        return this.f26121c;
    }

    @Override // com.waze.main_screen.c.an
    public final void g(am amVar) {
        h.g.b.x.f(amVar, "shownState");
        this.f26125g.setValue(amVar);
    }

    @Override // com.waze.main_screen.c.an
    public final boolean h() {
        return this.f26123e;
    }

    @Override // com.waze.main_screen.c.an
    public final boolean i() {
        return this.f26124f;
    }
}
