package com.waze.main_screen.af.b;

import com.waze.asks.as;
import com.waze.ui.a.l;
import h.g.b.x;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.main_screen.af.a.i f25801a;

    /* renamed from: b, reason: collision with root package name */
    private final af f25802b;

    /* renamed from: c, reason: collision with root package name */
    private final ch f25803c;

    public j(com.waze.main_screen.af.a.i iVar) {
        x.f(iVar, "controller");
        this.f25801a = iVar;
        this.f25802b = l.p(this, "WazeAsksStateHolderImpl");
        this.f25803c = iVar.d();
    }

    @Override // com.waze.main_screen.af.b.i
    public final ch a() {
        return this.f25803c;
    }

    @Override // com.waze.main_screen.af.b.i
    public final void b() {
        this.f25801a.f();
    }

    @Override // com.waze.main_screen.af.b.i
    public final void c(as asVar, com.waze.asks.d dVar) {
        x.f(asVar, "question");
        x.f(dVar, "answer");
        this.f25801a.i(asVar, dVar);
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        aj.h(this.f25802b, null);
    }

    @Override // com.waze.main_screen.af.b.i
    public final void d(as asVar) {
        x.f(asVar, "question");
        this.f25801a.g(asVar);
    }

    @Override // com.waze.main_screen.af.b.i
    public final void e(as asVar) {
        x.f(asVar, "question");
        this.f25801a.h(asVar);
    }

    @Override // com.waze.main_screen.af.b.i
    public final void f(as asVar) {
        x.f(asVar, "question");
        this.f25801a.j(asVar);
    }
}
