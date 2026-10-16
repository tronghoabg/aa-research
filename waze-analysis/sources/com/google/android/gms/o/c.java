package com.google.android.gms.o;

import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class c implements u {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f5752a;

    /* renamed from: b, reason: collision with root package name */
    private final a f5753b;

    /* renamed from: c, reason: collision with root package name */
    private final aa f5754c;

    public c(Executor executor, a aVar, aa aaVar) {
        this.f5752a = executor;
        this.f5753b = aVar;
        this.f5754c = aaVar;
    }

    @Override // com.google.android.gms.o.u
    public final void c(t tVar) {
        this.f5752a.execute(new b(this, tVar));
    }
}
