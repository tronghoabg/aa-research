package j$.com.android.tools.r8;

import j$.util.concurrent.ConcurrentLinkedQueue;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final /* synthetic */ class b {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ Unsafe f49640c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Class f49641a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f49642b;

    static {
        Field declaredField;
        try {
            declaredField = Unsafe.class.getDeclaredField("theUnsafe");
        } catch (NoSuchFieldException e2) {
            Field[] declaredFields = Unsafe.class.getDeclaredFields();
            int length = declaredFields.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    declaredField = null;
                    break;
                }
                Field field = declaredFields[i2];
                if (Modifier.isStatic(field.getModifiers()) && Unsafe.class.isAssignableFrom(field.getType())) {
                    declaredField = field;
                    break;
                }
                i2++;
            }
            if (declaredField != null) {
                throw new UnsupportedOperationException("Couldn't find the Unsafe", e2);
            }
        }
        declaredField.setAccessible(true);
        try {
            f49640c = (Unsafe) declaredField.get(null);
        } catch (Exception e3) {
            throw new RuntimeException(e3);
        }
    }

    public /* synthetic */ b(Class cls, String str, Class cls2) {
        this.f49641a = cls.getDeclaredField(str).getType();
        if (!cls2.isPrimitive() || cls2 == Integer.TYPE || cls2 == Long.TYPE) {
            this.f49642b = f49640c.objectFieldOffset(cls.getDeclaredField(str));
            return;
        }
        throw new UnsupportedOperationException("Using a VarHandle for a field of type '" + cls2.getName() + "' requires native VarHandle support available from Android 13. VarHandle desugaring only supports primitive types int and long and reference types.");
    }

    public static /* synthetic */ int d(Object obj) {
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof Byte) {
            return ((Byte) obj).byteValue();
        }
        if (obj instanceof Character) {
            return ((Character) obj).charValue();
        }
        if (obj instanceof Short) {
            return ((Short) obj).shortValue();
        }
        throw new RuntimeException("java.lang.invoke.WrongMethodTypeException");
    }

    public static /* synthetic */ long e(Object obj) {
        return obj instanceof Long ? ((Long) obj).longValue() : d(obj);
    }

    public final /* synthetic */ boolean a(Object obj, Object obj2, Object obj3) {
        Class cls = this.f49641a;
        Class cls2 = Integer.TYPE;
        long j2 = this.f49642b;
        if (cls == cls2) {
            return f49640c.compareAndSwapInt(obj, j2, d(obj2), d(obj3));
        }
        if (cls != Long.TYPE) {
            return a.K(f49640c, obj, j2, obj2, obj3);
        }
        return f49640c.compareAndSwapLong(obj, j2, e(obj2), e(obj3));
    }

    public final /* synthetic */ void b(Object obj, Object obj2) {
        Class cls = Long.TYPE;
        long j2 = this.f49642b;
        Class cls2 = this.f49641a;
        Class cls3 = Integer.TYPE;
        if (cls2 == cls3) {
            int iD = d(obj2);
            if (cls2 == cls3) {
                f49640c.putInt(obj, j2, iD);
                return;
            } else if (cls2 != cls) {
                b(obj, Integer.valueOf(iD));
                return;
            } else {
                f49640c.putLong(obj, this.f49642b, iD);
                return;
            }
        }
        Unsafe unsafe = f49640c;
        if (cls2 != cls) {
            unsafe.putObject(obj, j2, obj2);
            return;
        }
        long jE = e(obj2);
        if (cls2 == cls) {
            unsafe.putLong(obj, this.f49642b, jE);
        } else {
            if (cls2 == cls3) {
                throw new RuntimeException("java.lang.invoke.WrongMethodTypeException");
            }
            unsafe.putObject(obj, j2, Long.valueOf(jE));
        }
    }

    public final /* synthetic */ void c(Object obj, Object obj2) {
        Class cls = Long.TYPE;
        long j2 = this.f49642b;
        Class cls2 = this.f49641a;
        Class cls3 = Integer.TYPE;
        if (cls2 == cls3) {
            int iD = d(obj2);
            if (cls2 == cls3) {
                f49640c.putOrderedInt(obj, j2, iD);
                return;
            } else if (cls2 != cls) {
                c(obj, Integer.valueOf(iD));
                return;
            } else {
                f49640c.putOrderedLong(obj, this.f49642b, iD);
                return;
            }
        }
        Unsafe unsafe = f49640c;
        if (cls2 != cls) {
            unsafe.putOrderedObject(obj, j2, obj2);
            return;
        }
        long jE = e(obj2);
        if (cls2 == cls) {
            unsafe.putOrderedLong(obj, this.f49642b, jE);
        } else {
            if (cls2 == cls3) {
                throw new RuntimeException("java.lang.invoke.WrongMethodTypeException");
            }
            unsafe.putOrderedObject(obj, j2, Long.valueOf(jE));
        }
    }

    public final /* synthetic */ boolean f(ConcurrentLinkedQueue concurrentLinkedQueue, Object obj, Object obj2) {
        Class cls = this.f49641a;
        Class cls2 = Integer.TYPE;
        long j2 = this.f49642b;
        if (cls == cls2) {
            return f49640c.compareAndSwapInt(concurrentLinkedQueue, j2, d(obj), d(obj2));
        }
        if (cls != Long.TYPE) {
            return a.K(f49640c, concurrentLinkedQueue, j2, obj, obj2);
        }
        return f49640c.compareAndSwapLong(concurrentLinkedQueue, j2, e(obj), e(obj2));
    }
}
