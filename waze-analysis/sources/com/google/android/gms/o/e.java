package com.google.android.gms.o;

import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class e<TResult, TContinuationResult> implements u, o, m, h {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f5757a;

    /* renamed from: b, reason: collision with root package name */
    private final a f5758b;

    /* renamed from: c, reason: collision with root package name */
    private final aa f5759c;

    public e(Executor executor, a aVar, aa aaVar) {
        this.f5757a = executor;
        this.f5758b = aVar;
        this.f5759c = aaVar;
    }

    @Override // com.google.android.gms.o.u
    public final void c(t tVar) {
        this.f5757a.execute(new d(this, tVar));
    }

    @Override // com.google.android.gms.o.h
    public final void d() {
        this.f5759c.v();
    }

    @Override // com.google.android.gms.o.m
    public final void onFailure(Exception exc) {
        this.f5759c.s(exc);
    }

    @Override // com.google.android.gms.o.o
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f5759c.t(tcontinuationresult);
    }
}
