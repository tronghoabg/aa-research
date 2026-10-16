package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1440d {

    /* renamed from: c, reason: collision with root package name */
    public static final C1440d f18663c = new C1440d();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f18664a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f18665b = new HashMap();

    public static void b(HashMap map, C1439c c1439c, EnumC1449m enumC1449m, Class cls) {
        EnumC1449m enumC1449m2 = (EnumC1449m) map.get(c1439c);
        if (enumC1449m2 == null || enumC1449m == enumC1449m2) {
            if (enumC1449m2 == null) {
                map.put(c1439c, enumC1449m);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c1439c.f18659b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC1449m2 + ", new value " + enumC1449m);
    }

    public final C1438b a(Class cls, Method[] methodArr) throws SecurityException {
        int i5;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f18664a;
        if (superclass != null) {
            C1438b c1438bA = (C1438b) map2.get(superclass);
            if (c1438bA == null) {
                c1438bA = a(superclass, null);
            }
            map.putAll(c1438bA.f18656b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C1438b c1438bA2 = (C1438b) map2.get(cls2);
            if (c1438bA2 == null) {
                c1438bA2 = a(cls2, null);
            }
            for (Map.Entry entry : c1438bA2.f18656b.entrySet()) {
                b(map, (C1439c) entry.getKey(), (EnumC1449m) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e7) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e7);
            }
        }
        boolean z2 = false;
        for (Method method : methodArr) {
            G g9 = (G) method.getAnnotation(G.class);
            if (g9 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i5 = 0;
                } else {
                    if (!InterfaceC1457v.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i5 = 1;
                }
                EnumC1449m enumC1449mValue = g9.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC1449m.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (enumC1449mValue != EnumC1449m.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i5 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(map, new C1439c(i5, method), enumC1449mValue, cls);
                z2 = true;
            }
        }
        C1438b c1438b = new C1438b(map);
        map2.put(cls, c1438b);
        this.f18665b.put(cls, Boolean.valueOf(z2));
        return c1438b;
    }
}
