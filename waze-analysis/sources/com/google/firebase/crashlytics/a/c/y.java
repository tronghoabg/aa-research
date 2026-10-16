package com.google.firebase.crashlytics.a.c;

import j$.util.Objects;
import java.io.IOException;
import java.util.concurrent.Callable;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class y implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f9223a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ aa f9224b;

    y(aa aaVar, String str) {
        this.f9223a = str;
        Objects.requireNonNull(aaVar);
        this.f9224b = aaVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws IOException {
        aa.m(this.f9224b, this.f9223a, false);
        return null;
    }
}
