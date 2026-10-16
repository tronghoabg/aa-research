package com.google.gson.internal.bind;

import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import la.InterfaceC3449A;
import ma.InterfaceC3528b;
import qa.C3883a;
import ra.C3962a;
import ra.C3963b;

/* renamed from: com.google.gson.internal.bind.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1759e extends la.z {

    /* renamed from: d, reason: collision with root package name */
    public static final InterfaceC3449A f27451d = new InterfaceC3449A() { // from class: com.google.gson.internal.bind.EnumTypeAdapter$1
        @Override // la.InterfaceC3449A
        public final la.z create(la.l lVar, C3883a c3883a) {
            Class superclass = c3883a.f44183a;
            if (!Enum.class.isAssignableFrom(superclass) || superclass == Enum.class) {
                return null;
            }
            if (!superclass.isEnum()) {
                superclass = superclass.getSuperclass();
            }
            return new C1759e(superclass);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f27452a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f27453b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f27454c = new HashMap();

    public C1759e(Class cls) throws SecurityException {
        try {
            Field[] declaredFields = cls.getDeclaredFields();
            int i5 = 0;
            for (Field field : declaredFields) {
                if (field.isEnumConstant()) {
                    declaredFields[i5] = field;
                    i5++;
                }
            }
            Field[] fieldArr = (Field[]) Arrays.copyOf(declaredFields, i5);
            AccessibleObject.setAccessible(fieldArr, true);
            for (Field field2 : fieldArr) {
                Enum r42 = (Enum) field2.get(null);
                String strName = r42.name();
                String string = r42.toString();
                InterfaceC3528b interfaceC3528b = (InterfaceC3528b) field2.getAnnotation(InterfaceC3528b.class);
                if (interfaceC3528b != null) {
                    strName = interfaceC3528b.value();
                    for (String str : interfaceC3528b.alternate()) {
                        this.f27452a.put(str, r42);
                    }
                }
                this.f27452a.put(strName, r42);
                this.f27453b.put(string, r42);
                this.f27454c.put(r42, strName);
            }
        } catch (IllegalAccessException e7) {
            throw new AssertionError(e7);
        }
    }

    @Override // la.z
    public final Object b(C3962a c3962a) throws IOException {
        if (c3962a.e0() == 9) {
            c3962a.a0();
            return null;
        }
        String strC0 = c3962a.c0();
        Enum r02 = (Enum) this.f27452a.get(strC0);
        return r02 == null ? (Enum) this.f27453b.get(strC0) : r02;
    }

    @Override // la.z
    public final void c(C3963b c3963b, Object obj) throws IOException {
        Enum r32 = (Enum) obj;
        c3963b.Y(r32 == null ? null : (String) this.f27454c.get(r32));
    }
}
