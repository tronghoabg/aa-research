package j$.sun.misc;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    private static final a f37470b;

    /* renamed from: a, reason: collision with root package name */
    private final Unsafe f37471a;

    static {
        Field fieldI = i();
        fieldI.setAccessible(true);
        try {
            f37470b = new a((Unsafe) fieldI.get(null));
        } catch (IllegalAccessException e7) {
            throw new AssertionError("Couldn't get the Unsafe", e7);
        }
    }

    a(Unsafe unsafe) {
        this.f37471a = unsafe;
    }

    private static Field i() {
        try {
            return Unsafe.class.getDeclaredField("theUnsafe");
        } catch (NoSuchFieldException e7) {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                if (Modifier.isStatic(field.getModifiers()) && Unsafe.class.isAssignableFrom(field.getType())) {
                    return field;
                }
            }
            throw new AssertionError("Couldn't find the Unsafe", e7);
        }
    }

    public static a h() {
        return f37470b;
    }

    public final int f(Object obj, long j8) {
        while (true) {
            int intVolatile = this.f37471a.getIntVolatile(obj, j8);
            Object obj2 = obj;
            long j10 = j8;
            if (this.f37471a.compareAndSwapInt(obj2, j10, intVolatile, intVolatile - 4)) {
                return intVolatile;
            }
            obj = obj2;
            j8 = j10;
        }
    }

    public final long k(Field field) {
        return this.f37471a.objectFieldOffset(field);
    }

    public final long j(Class cls, String str) {
        try {
            return k(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e7) {
            throw new AssertionError("Cannot find field:", e7);
        }
    }

    public final int a(Class cls) {
        return this.f37471a.arrayBaseOffset(cls);
    }

    public final int b(Class cls) {
        return this.f37471a.arrayIndexScale(cls);
    }

    public final Object g(Object obj, long j8) {
        return this.f37471a.getObjectVolatile(obj, j8);
    }

    public final void l(Object obj, long j8, Object obj2) {
        this.f37471a.putObjectVolatile(obj, j8, obj2);
    }

    public final boolean c(Object obj, long j8, int i5, int i10) {
        return this.f37471a.compareAndSwapInt(obj, j8, i5, i10);
    }

    public final boolean d(Object obj, long j8, long j10, long j11) {
        return this.f37471a.compareAndSwapLong(obj, j8, j10, j11);
    }

    public final boolean e(Object obj, long j8, Object obj2) {
        return j$.com.android.tools.r8.a.e(this.f37471a, obj, j8, obj2);
    }
}
