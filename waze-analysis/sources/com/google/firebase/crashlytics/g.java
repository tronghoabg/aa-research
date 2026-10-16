package com.google.firebase.crashlytics;

import com.google.firebase.crashlytics.a.c.ae;
import java.util.concurrent.Callable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class g implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f9781a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ae f9782b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ com.google.firebase.crashlytics.a.h.f f9783c;

    g(boolean z, ae aeVar, com.google.firebase.crashlytics.a.h.f fVar) {
        this.f9781a = z;
        this.f9782b = aeVar;
        this.f9783c = fVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        if (!this.f9781a) {
            return null;
        }
        this.f9782b.n(this.f9783c);
        return null;
    }
}
