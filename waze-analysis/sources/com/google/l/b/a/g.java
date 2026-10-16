package com.google.l.b.a;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class g implements com.google.l.v {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f12279a;

    g(int i2) {
        this.f12279a = i2;
    }

    @Override // com.google.l.v
    public final com.google.l.u a(com.google.l.d dVar, com.google.l.c.a aVar) {
        Type genericComponentType;
        int i2 = this.f12279a;
        if (i2 == 0) {
            Class clsC = aVar.c();
            if (!Enum.class.isAssignableFrom(clsC) || clsC == Enum.class) {
                return null;
            }
            if (!clsC.isEnum()) {
                clsC = clsC.getSuperclass();
            }
            return new h(clsC);
        }
        if (i2 != 1) {
            throw new AssertionError("Factory should not be used");
        }
        Type typeD = aVar.d();
        if (typeD instanceof GenericArrayType) {
            genericComponentType = ((GenericArrayType) typeD).getGenericComponentType();
        } else {
            if (!(typeD instanceof Class)) {
                return null;
            }
            Class cls = (Class) typeD;
            if (!cls.isArray()) {
                return null;
            }
            genericComponentType = cls.getComponentType();
        }
        return new a(dVar, dVar.a(com.google.l.c.a.b(genericComponentType)), com.google.l.b.k.a(genericComponentType));
    }
}
