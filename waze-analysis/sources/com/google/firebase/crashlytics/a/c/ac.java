package com.google.firebase.crashlytics.a.c;

import j$.util.Objects;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ac implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ae f9087a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.google.firebase.crashlytics.a.h.f f9088b;

    ac(ae aeVar, com.google.firebase.crashlytics.a.h.f fVar) {
        this.f9088b = fVar;
        Objects.requireNonNull(aeVar);
        this.f9087a = aeVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        ae.k(this.f9087a, this.f9088b);
    }
}
