package androidx.datastore.preferences.protobuf;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1404v extends AbstractC1382a {
    private static Map<Object, AbstractC1404v> defaultInstanceMap = new ConcurrentHashMap();
    protected int memoizedSerializedSize;
    protected j0 unknownFields;

    public AbstractC1404v() {
        this.memoizedHashCode = 0;
        this.unknownFields = j0.f18234f;
        this.memoizedSerializedSize = -1;
    }

    public static AbstractC1404v e(Class cls) throws ClassNotFoundException {
        AbstractC1404v abstractC1404v = defaultInstanceMap.get(cls);
        if (abstractC1404v == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC1404v = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e7) {
                throw new IllegalStateException("Class initialization cannot fail.", e7);
            }
        }
        if (abstractC1404v != null) {
            return abstractC1404v;
        }
        AbstractC1404v abstractC1404v2 = (AbstractC1404v) ((AbstractC1404v) s0.a(cls)).d(6);
        if (abstractC1404v2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, abstractC1404v2);
        return abstractC1404v2;
    }

    public static Object f(Method method, AbstractC1382a abstractC1382a, Object... objArr) {
        try {
            return method.invoke(abstractC1382a, objArr);
        } catch (IllegalAccessException e7) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e7);
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static void h(Class cls, AbstractC1404v abstractC1404v) {
        defaultInstanceMap.put(cls, abstractC1404v);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1382a
    public final int a() {
        if (this.memoizedSerializedSize == -1) {
            Y y10 = Y.f18175c;
            y10.getClass();
            this.memoizedSerializedSize = y10.a(getClass()).d(this);
        }
        return this.memoizedSerializedSize;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1382a
    public final void c(C1393j c1393j) {
        Y y10 = Y.f18175c;
        y10.getClass();
        InterfaceC1385b0 interfaceC1385b0A = y10.a(getClass());
        J j8 = c1393j.f18229c;
        if (j8 == null) {
            j8 = new J(c1393j);
        }
        interfaceC1385b0A.c(this, j8);
    }

    public abstract Object d(int i5);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((AbstractC1404v) d(6)).getClass().isInstance(obj)) {
            return false;
        }
        Y y10 = Y.f18175c;
        y10.getClass();
        return y10.a(getClass()).h(this, (AbstractC1404v) obj);
    }

    public final boolean g() {
        byte bByteValue = ((Byte) d(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        Y y10 = Y.f18175c;
        y10.getClass();
        boolean zB = y10.a(getClass()).b(this);
        d(2);
        return zB;
    }

    public final int hashCode() {
        int i5 = this.memoizedHashCode;
        if (i5 != 0) {
            return i5;
        }
        Y y10 = Y.f18175c;
        y10.getClass();
        int iG = y10.a(getClass()).g(this);
        this.memoizedHashCode = iG;
        return iG;
    }

    public final String toString() {
        String string = super.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(string);
        Q.k(this, sb2, 0);
        return sb2.toString();
    }
}
