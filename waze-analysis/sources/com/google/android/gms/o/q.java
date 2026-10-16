package com.google.android.gms.o;

import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class q<TResult, TContinuationResult> implements u, o, m, h {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f5773a;

    /* renamed from: b, reason: collision with root package name */
    private final s f5774b;

    /* renamed from: c, reason: collision with root package name */
    private final aa f5775c;

    public q(Executor executor, s sVar, aa aaVar) {
        this.f5773a = executor;
        this.f5774b = sVar;
        this.f5775c = aaVar;
    }

    @Override // com.google.android.gms.o.u
    public final void c(t tVar) {
        this.f5773a.execute(new p(this, tVar));
    }

    @Override // com.google.android.gms.o.h
    public final void d() {
        this.f5775c.v();
    }

    @Override // com.google.android.gms.o.m
    public final void onFailure(Exception exc) {
        this.f5775c.s(exc);
    }

    @Override // com.google.android.gms.o.o
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.f5775c.t(tcontinuationresult);
    }
}
