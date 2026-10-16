package com.google.d.d;

import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ck extends bu {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ cn f7494a;

    ck(cn cnVar) {
        Objects.requireNonNull(cnVar);
        this.f7494a = cnVar;
    }

    @Override // com.google.d.d.bu
    final bs a() {
        return this.f7494a;
    }

    @Override // com.google.d.d.ci, com.google.d.d.bh, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: h */
    public final fu listIterator() {
        return g().iterator();
    }

    @Override // com.google.d.d.ci
    final bn k() {
        return new cj(this);
    }

    @Override // com.google.d.d.bu, com.google.d.d.ci, com.google.d.d.bh
    Object writeReplace() {
        return super.writeReplace();
    }
}
