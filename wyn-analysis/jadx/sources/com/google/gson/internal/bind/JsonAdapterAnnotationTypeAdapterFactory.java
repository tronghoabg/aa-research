package com.google.gson.internal.bind;

import ba.C1521a;
import j$.util.concurrent.ConcurrentHashMap;
import la.InterfaceC3449A;
import ma.InterfaceC3527a;
import qa.C3883a;

/* loaded from: classes4.dex */
public final class JsonAdapterAnnotationTypeAdapterFactory implements InterfaceC3449A {

    /* renamed from: c, reason: collision with root package name */
    public static final InterfaceC3449A f27389c;

    /* renamed from: d, reason: collision with root package name */
    public static final InterfaceC3449A f27390d;

    /* renamed from: a, reason: collision with root package name */
    public final C1521a f27391a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f27392b = new ConcurrentHashMap();

    public static class DummyTypeAdapterFactory implements InterfaceC3449A {
        private DummyTypeAdapterFactory() {
        }

        @Override // la.InterfaceC3449A
        public final la.z create(la.l lVar, C3883a c3883a) {
            throw new AssertionError("Factory should not be used");
        }

        public /* synthetic */ DummyTypeAdapterFactory(int i5) {
            this();
        }
    }

    static {
        int i5 = 0;
        f27389c = new DummyTypeAdapterFactory(i5);
        f27390d = new DummyTypeAdapterFactory(i5);
    }

    public JsonAdapterAnnotationTypeAdapterFactory(C1521a c1521a) {
        this.f27391a = c1521a;
    }

    public final la.z a(C1521a c1521a, la.l lVar, C3883a c3883a, InterfaceC3527a interfaceC3527a, boolean z2) {
        la.z zVarCreate;
        Object objD = c1521a.t(new C3883a(interfaceC3527a.value())).d();
        boolean zNullSafe = interfaceC3527a.nullSafe();
        if (objD instanceof la.z) {
            zVarCreate = (la.z) objD;
        } else if (objD instanceof InterfaceC3449A) {
            InterfaceC3449A interfaceC3449A = (InterfaceC3449A) objD;
            if (z2) {
                InterfaceC3449A interfaceC3449A2 = (InterfaceC3449A) this.f27392b.putIfAbsent(c3883a.f44183a, interfaceC3449A);
                if (interfaceC3449A2 != null) {
                    interfaceC3449A = interfaceC3449A2;
                }
            }
            zVarCreate = interfaceC3449A.create(lVar, c3883a);
        } else {
            if (!(objD instanceof la.n)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objD.getClass().getName() + " as a @JsonAdapter for " + na.d.l(c3883a.f44184b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            C1774u c1774u = new C1774u(objD instanceof la.n ? (la.n) objD : null, lVar, c3883a, z2 ? f27389c : f27390d, zNullSafe);
            zNullSafe = false;
            zVarCreate = c1774u;
        }
        return (zVarCreate == null || !zNullSafe) ? zVarCreate : zVarCreate.a();
    }

    @Override // la.InterfaceC3449A
    public final la.z create(la.l lVar, C3883a c3883a) {
        InterfaceC3527a interfaceC3527a = (InterfaceC3527a) c3883a.f44183a.getAnnotation(InterfaceC3527a.class);
        if (interfaceC3527a == null) {
            return null;
        }
        return a(this.f27391a, lVar, c3883a, interfaceC3527a, true);
    }
}
