package com.google.gson.internal.bind;

import la.InterfaceC3449A;
import qa.C3883a;

/* loaded from: classes4.dex */
class TypeAdapters$32 implements InterfaceC3449A {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Class f27415a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ la.z f27416b;

    public TypeAdapters$32(Class cls, la.z zVar) {
        this.f27415a = cls;
        this.f27416b = zVar;
    }

    @Override // la.InterfaceC3449A
    public final la.z create(la.l lVar, C3883a c3883a) {
        Class<?> cls = c3883a.f44183a;
        if (this.f27415a.isAssignableFrom(cls)) {
            return new P(this, cls);
        }
        return null;
    }

    public final String toString() {
        return "Factory[typeHierarchy=" + this.f27415a.getName() + ",adapter=" + this.f27416b + "]";
    }
}
