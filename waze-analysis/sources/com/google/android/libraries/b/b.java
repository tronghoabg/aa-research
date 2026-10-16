package com.google.android.libraries.b;

import com.google.d.m.a.k;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class b extends k {

    /* renamed from: a, reason: collision with root package name */
    Object f5797a;

    b(Object obj) {
        this.f5797a = obj;
    }

    @Override // com.google.d.m.a.k
    public final String a() {
        Object obj = this.f5797a;
        return obj == null ? "" : obj.toString();
    }

    @Override // com.google.d.m.a.k
    protected final void b() {
        this.f5797a = null;
    }

    @Override // com.google.d.m.a.k
    public final boolean c(Object obj) {
        return super.c(obj);
    }

    @Override // com.google.d.m.a.k
    public final boolean d(Throwable th) {
        return super.d(th);
    }
}
