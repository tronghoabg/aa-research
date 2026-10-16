package com.google.d.m.a;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ao implements af {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ aq f7996a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ af f7997b;

    ao(as asVar, aq aqVar, af afVar) {
        this.f7996a = aqVar;
        this.f7997b = afVar;
        Objects.requireNonNull(asVar);
    }

    @Override // com.google.d.m.a.af
    public final bm a() {
        return !this.f7996a.compareAndSet(ap.f7998a, ap.f8000c) ? bd.f() : this.f7997b.a();
    }

    public final String toString() {
        return this.f7997b.toString();
    }
}
