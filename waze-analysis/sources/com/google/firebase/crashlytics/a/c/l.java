package com.google.firebase.crashlytics.a.c;

import j$.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class l implements com.google.android.gms.o.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Callable f9195a;

    l(n nVar, Callable callable) {
        this.f9195a = callable;
        Objects.requireNonNull(nVar);
    }

    @Override // com.google.android.gms.o.a
    public final Object a(com.google.android.gms.o.t tVar) {
        return this.f9195a.call();
    }
}
