package j$.sun.misc;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f49787b;

    /* renamed from: a, reason: collision with root package name */
    public final Unsafe f49788a;

    static {
        Field declaredField;
        try {
            declaredField = Unsafe.class.getDeclaredField("theUnsafe");
        } catch (NoSuchFieldException e2) {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                if (Modifier.isStatic(field.getModifiers()) && Unsafe.class.isAssignableFrom(field.getType())) {
                    declaredField = field;
                }
            }
            throw new AssertionError("Couldn't find the Unsafe", e2);
        }
        declaredField.setAccessible(true);
        try {
            f49787b = new a((Unsafe) declaredField.get(null));
        } catch (IllegalAccessException e3) {
            throw new AssertionError("Couldn't get the Unsafe", e3);
        }
    }

    public a(Unsafe unsafe) {
        this.f49788a = unsafe;
    }

    public final long a(Class cls, String str) throws NoSuchFieldException {
        try {
            return this.f49788a.objectFieldOffset(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e2) {
            throw new AssertionError("Cannot find field:", e2);
        }
    }
}
