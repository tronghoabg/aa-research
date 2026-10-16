package com.google.gson.internal.bind;

import la.InterfaceC3449A;
import qa.C3883a;

/* loaded from: classes4.dex */
class TypeAdapters$30 implements InterfaceC3449A {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Class f27411a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Class f27412b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ la.z f27413c;

    public TypeAdapters$30(Class cls, Class cls2, la.z zVar) {
        this.f27411a = cls;
        this.f27412b = cls2;
        this.f27413c = zVar;
    }

    @Override // la.InterfaceC3449A
    public final la.z create(la.l lVar, C3883a c3883a) {
        Class cls = c3883a.f44183a;
        if (cls == this.f27411a || cls == this.f27412b) {
            return this.f27413c;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.f27412b.getName() + "+" + this.f27411a.getName() + ",adapter=" + this.f27413c + "]";
    }
}
