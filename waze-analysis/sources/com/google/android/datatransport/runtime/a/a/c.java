package com.google.android.datatransport.runtime.a.a;

import j$.util.DesugarCollections;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private Object f4106a = null;

    public c(byte[] bArr) {
    }

    public final d a() {
        return new d((j) this.f4106a);
    }

    public final void b(j jVar) {
        this.f4106a = jVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    public final void c() {
        if (this.f4106a == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        int i2 = com.google.e.a.e.k.f8447a;
        DesugarCollections.unmodifiableMap(this.f4106a);
        this.f4106a = null;
    }

    c() {
    }
}
