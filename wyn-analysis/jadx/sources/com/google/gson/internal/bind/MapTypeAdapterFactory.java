package com.google.gson.internal.bind;

import ba.C1521a;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import la.InterfaceC3449A;
import qa.C3883a;

/* loaded from: classes4.dex */
public final class MapTypeAdapterFactory implements InterfaceC3449A {

    /* renamed from: a, reason: collision with root package name */
    public final C1521a f27393a;

    public MapTypeAdapterFactory(C1521a c1521a) {
        this.f27393a = c1521a;
    }

    @Override // la.InterfaceC3449A
    public final la.z create(la.l lVar, C3883a c3883a) {
        Type[] actualTypeArguments;
        Type type = c3883a.f44184b;
        Class cls = c3883a.f44183a;
        if (!Map.class.isAssignableFrom(cls)) {
            return null;
        }
        if (Properties.class.isAssignableFrom(cls)) {
            actualTypeArguments = new Type[]{String.class, String.class};
        } else {
            if (type instanceof WildcardType) {
                type = ((WildcardType) type).getUpperBounds()[0];
            }
            na.d.b(Map.class.isAssignableFrom(cls));
            Type typeK = na.d.k(type, cls, na.d.g(type, cls, Map.class), new HashMap());
            actualTypeArguments = typeK instanceof ParameterizedType ? ((ParameterizedType) typeK).getActualTypeArguments() : new Type[]{Object.class, Object.class};
        }
        Type type2 = actualTypeArguments[0];
        return new C1765k(this, lVar, actualTypeArguments[0], (type2 == Boolean.TYPE || type2 == Boolean.class) ? Y.f27421c : lVar.c(new C3883a(type2)), actualTypeArguments[1], lVar.c(new C3883a(actualTypeArguments[1])), this.f27393a.t(c3883a));
    }
}
