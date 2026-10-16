package com.google.firebase.crashlytics.a.c;

import android.os.Bundle;
import j$.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class z implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f9225a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ aa f9226b;

    z(aa aaVar, long j2) {
        this.f9225a = j2;
        Objects.requireNonNull(aaVar);
        this.f9226b = aaVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.f9225a);
        this.f9226b.q.a(bundle);
        return null;
    }
}
