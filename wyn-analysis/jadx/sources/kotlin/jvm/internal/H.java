package kotlin.jvm.internal;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.jvm.internal.ReflectionFactoryImpl;

/* loaded from: classes5.dex */
public abstract class H {

    /* renamed from: a, reason: collision with root package name */
    public static final I f39741a;

    /* renamed from: b, reason: collision with root package name */
    public static final KClass[] f39742b;

    static {
        I i5 = null;
        try {
            i5 = (I) ReflectionFactoryImpl.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (i5 == null) {
            i5 = new I();
        }
        f39741a = i5;
        f39742b = new KClass[0];
    }

    public static KClass a(Class cls) {
        return f39741a.getOrCreateKotlinClass(cls);
    }

    public static KType b(Class cls) {
        I i5 = f39741a;
        return i5.typeOf(i5.getOrCreateKotlinClass(cls), Collections.EMPTY_LIST, false);
    }

    public static KType c(Class cls, KTypeProjection kTypeProjection) {
        I i5 = f39741a;
        return i5.typeOf(i5.getOrCreateKotlinClass(cls), Collections.singletonList(kTypeProjection), false);
    }

    public static KType d(Class cls, KTypeProjection... kTypeProjectionArr) {
        I i5 = f39741a;
        return i5.typeOf(i5.getOrCreateKotlinClass(cls), ff.m.L0(kTypeProjectionArr), false);
    }

    public static KType e(KTypeProjection kTypeProjection, KTypeProjection kTypeProjection2) {
        I i5 = f39741a;
        return i5.typeOf(i5.getOrCreateKotlinClass(Map.class), Arrays.asList(kTypeProjection, kTypeProjection2), false);
    }
}
