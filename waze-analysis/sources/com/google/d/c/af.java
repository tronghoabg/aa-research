package com.google.d.c;

import com.google.d.m.a.bv;
import com.google.d.m.a.cf;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class af implements as {

    /* renamed from: a, reason: collision with root package name */
    volatile as f7268a;

    /* renamed from: b, reason: collision with root package name */
    final bv f7269b;

    /* renamed from: c, reason: collision with root package name */
    final com.google.d.b.ai f7270c;

    public af() {
        as asVar = bd.f7345b;
        this.f7269b = bv.f();
        this.f7270c = com.google.d.b.ai.c();
        this.f7268a = asVar;
    }

    @Override // com.google.d.c.as
    public final int a() {
        return 0;
    }

    @Override // com.google.d.c.as
    public final as b(ReferenceQueue referenceQueue, Object obj, be beVar) {
        return this;
    }

    @Override // com.google.d.c.as
    public final be c() {
        return null;
    }

    @Override // com.google.d.c.as
    public final Object d() {
        return cf.s(this.f7269b);
    }

    @Override // com.google.d.c.as
    public final void e(Object obj) {
        if (obj != null) {
            h(obj);
        } else {
            this.f7268a = bd.f7345b;
        }
    }

    @Override // com.google.d.c.as
    public final boolean f() {
        return false;
    }

    @Override // com.google.d.c.as
    public final boolean g() {
        return true;
    }

    @Override // com.google.d.c.as
    public final Object get() {
        return null;
    }

    public final boolean h(Object obj) {
        return this.f7269b.c(obj);
    }

    public final void i() {
        this.f7270c.a(TimeUnit.NANOSECONDS);
    }
}
