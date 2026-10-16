package pa;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p7.AbstractC3772b;

/* loaded from: classes4.dex */
public final class b extends AbstractC3772b {

    /* renamed from: e, reason: collision with root package name */
    public final Method f43443e = Class.class.getMethod("isRecord", new Class[0]);

    /* renamed from: f, reason: collision with root package name */
    public final Method f43444f = Class.class.getMethod("getRecordComponents", new Class[0]);

    /* renamed from: g, reason: collision with root package name */
    public final Method f43445g;

    /* renamed from: h, reason: collision with root package name */
    public final Method f43446h;

    public b() throws ClassNotFoundException {
        Class<?> cls = Class.forName("java.lang.reflect.RecordComponent");
        this.f43445g = cls.getMethod("getName", new Class[0]);
        this.f43446h = cls.getMethod("getType", new Class[0]);
    }

    @Override // p7.AbstractC3772b
    public final String[] C(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f43444f.invoke(cls, new Object[0]);
            String[] strArr = new String[objArr.length];
            for (int i5 = 0; i5 < objArr.length; i5++) {
                strArr[i5] = (String) this.f43445g.invoke(objArr[i5], new Object[0]);
            }
            return strArr;
        } catch (ReflectiveOperationException e7) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.12.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e7);
        }
    }

    @Override // p7.AbstractC3772b
    public final boolean I(Class cls) {
        try {
            return ((Boolean) this.f43443e.invoke(cls, new Object[0])).booleanValue();
        } catch (ReflectiveOperationException e7) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.12.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e7);
        }
    }

    @Override // p7.AbstractC3772b
    public final Method s(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), new Class[0]);
        } catch (ReflectiveOperationException e7) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.12.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e7);
        }
    }

    @Override // p7.AbstractC3772b
    public final Constructor v(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f43444f.invoke(cls, new Object[0]);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i5 = 0; i5 < objArr.length; i5++) {
                clsArr[i5] = (Class) this.f43446h.invoke(objArr[i5], new Object[0]);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e7) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.12.0). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e7);
        }
    }
}
