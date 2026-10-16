package com.google.firebase.crashlytics.a.c;

import j$.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class w implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f9216a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f9217b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ aa f9218c;

    w(aa aaVar, long j2, String str) {
        this.f9216a = j2;
        this.f9217b = str;
        Objects.requireNonNull(aaVar);
        this.f9218c = aaVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        aa aaVar = this.f9218c;
        if (aaVar.u()) {
            return null;
        }
        aaVar.o.d(this.f9216a, this.f9217b);
        return null;
    }
}
