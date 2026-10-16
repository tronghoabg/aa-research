package com.google.l.b.b;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class c extends a {

    /* renamed from: a, reason: collision with root package name */
    private final Method f12341a = Class.class.getMethod("isRecord", null);

    /* renamed from: b, reason: collision with root package name */
    private final Method f12342b = Class.class.getMethod("getRecordComponents", null);

    /* renamed from: c, reason: collision with root package name */
    private final Method f12343c;

    /* renamed from: d, reason: collision with root package name */
    private final Method f12344d;

    /* synthetic */ c() throws ClassNotFoundException {
        Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
        this.f12343c = cls.getMethod("getName", null);
        this.f12344d = cls.getMethod("getType", null);
    }

    @Override // com.google.l.b.b.a
    public final Constructor a(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f12342b.invoke(cls, null);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i2 = 0; i2 < objArr.length; i2++) {
                clsArr[i2] = (Class) this.f12344d.invoke(objArr[i2], null);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e2) {
            throw d.a(e2);
        }
    }

    @Override // com.google.l.b.b.a
    public final Method b(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), null);
        } catch (ReflectiveOperationException e2) {
            throw d.a(e2);
        }
    }

    @Override // com.google.l.b.b.a
    final boolean c(Class cls) {
        try {
            return ((Boolean) this.f12341a.invoke(cls, null)).booleanValue();
        } catch (ReflectiveOperationException e2) {
            throw d.a(e2);
        }
    }

    @Override // com.google.l.b.b.a
    final String[] d(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f12342b.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i2 = 0; i2 < objArr.length; i2++) {
                strArr[i2] = (String) this.f12343c.invoke(objArr[i2], null);
            }
            return strArr;
        } catch (ReflectiveOperationException e2) {
            throw d.a(e2);
        }
    }
}
