package com.google.gson.internal.bind;

import ba.C1521a;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import java.util.HashMap;
import la.InterfaceC3449A;
import qa.C3883a;

/* loaded from: classes4.dex */
public final class CollectionTypeAdapterFactory implements InterfaceC3449A {

    /* renamed from: a, reason: collision with root package name */
    public final C1521a f27388a;

    public CollectionTypeAdapterFactory(C1521a c1521a) {
        this.f27388a = c1521a;
    }

    @Override // la.InterfaceC3449A
    public final la.z create(la.l lVar, C3883a c3883a) {
        Type type = c3883a.f44184b;
        Class cls = c3883a.f44183a;
        if (!Collection.class.isAssignableFrom(cls)) {
            return null;
        }
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        na.d.b(Collection.class.isAssignableFrom(cls));
        Type typeK = na.d.k(type, cls, na.d.g(type, cls, Collection.class), new HashMap());
        Class cls2 = typeK instanceof ParameterizedType ? ((ParameterizedType) typeK).getActualTypeArguments()[0] : Object.class;
        return new P(lVar, cls2, lVar.c(new C3883a(cls2)), this.f27388a.t(c3883a));
    }
}
