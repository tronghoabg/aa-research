package com.google.gson.internal.bind;

import la.InterfaceC3449A;
import qa.C3883a;

/* loaded from: classes4.dex */
class ObjectTypeAdapter$1 implements InterfaceC3449A {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ la.x f27395a;

    public ObjectTypeAdapter$1(la.x xVar) {
        this.f27395a = xVar;
    }

    @Override // la.InterfaceC3449A
    public final la.z create(la.l lVar, C3883a c3883a) {
        if (c3883a.f44183a == Object.class) {
            return new C1767m(lVar, this.f27395a);
        }
        return null;
    }
}
