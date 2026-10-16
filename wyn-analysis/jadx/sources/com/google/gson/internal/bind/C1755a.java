package com.google.gson.internal.bind;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import la.InterfaceC3449A;
import qa.C3883a;
import ra.C3962a;
import ra.C3963b;

/* renamed from: com.google.gson.internal.bind.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1755a extends la.z {

    /* renamed from: c, reason: collision with root package name */
    public static final InterfaceC3449A f27444c = new InterfaceC3449A() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter$1
        @Override // la.InterfaceC3449A
        public final la.z create(la.l lVar, C3883a c3883a) {
            Type type = c3883a.f44184b;
            boolean z2 = type instanceof GenericArrayType;
            if (!z2 && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            Type genericComponentType = z2 ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
            return new C1755a(lVar, lVar.c(new C3883a(genericComponentType)), na.d.h(genericComponentType));
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final Class f27445a;

    /* renamed from: b, reason: collision with root package name */
    public final com.dexterous.flutterlocalnotifications.j f27446b;

    public C1755a(la.l lVar, la.z zVar, Class cls) {
        this.f27446b = new com.dexterous.flutterlocalnotifications.j(lVar, zVar, cls);
        this.f27445a = cls;
    }

    @Override // la.z
    public final Object b(C3962a c3962a) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        if (c3962a.e0() == 9) {
            c3962a.a0();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        c3962a.a();
        while (c3962a.D()) {
            arrayList.add(((la.z) this.f27446b.f26236c).b(c3962a));
        }
        c3962a.i();
        int size = arrayList.size();
        Class cls = this.f27445a;
        if (!cls.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
        }
        Object objNewInstance = Array.newInstance((Class<?>) cls, size);
        for (int i5 = 0; i5 < size; i5++) {
            Array.set(objNewInstance, i5, arrayList.get(i5));
        }
        return objNewInstance;
    }

    @Override // la.z
    public final void c(C3963b c3963b, Object obj) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException {
        if (obj == null) {
            c3963b.z();
            return;
        }
        c3963b.b();
        int length = Array.getLength(obj);
        for (int i5 = 0; i5 < length; i5++) {
            this.f27446b.c(c3963b, Array.get(obj, i5));
        }
        c3963b.i();
    }
}
