package com.google.gson.internal.bind;

import la.InterfaceC3449A;
import qa.C3883a;

/* loaded from: classes4.dex */
class TypeAdapters$29 implements InterfaceC3449A {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Class f27409a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ la.z f27410b;

    public TypeAdapters$29(Class cls, la.z zVar) {
        this.f27409a = cls;
        this.f27410b = zVar;
    }

    @Override // la.InterfaceC3449A
    public final la.z create(la.l lVar, C3883a c3883a) {
        if (c3883a.f44183a == this.f27409a) {
            return this.f27410b;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.f27409a.getName() + ",adapter=" + this.f27410b + "]";
    }
}
