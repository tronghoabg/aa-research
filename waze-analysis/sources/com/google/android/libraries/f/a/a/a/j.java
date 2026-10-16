package com.google.android.libraries.f.a.a.a;

import h.g.b.x;
import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class j extends com.google.android.gms.a.b.a.e {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ CompletableDeferred f5937a;

    j(CompletableDeferred completableDeferred) {
        this.f5937a = completableDeferred;
    }

    @Override // com.google.android.gms.a.b.a.f
    public final void a(com.google.android.gms.a.b.b.a aVar) {
        x.f(aVar, "exceptionParcel");
        this.f5937a.a(new b(a.f5923d));
    }

    @Override // com.google.android.gms.a.b.a.f
    public final void b(String str, com.google.android.gms.a.b.a.a aVar) {
        x.f(str, "trustlessToken");
        x.f(aVar, "decagonRequestParcel");
        this.f5937a.a(new c(str));
    }
}
