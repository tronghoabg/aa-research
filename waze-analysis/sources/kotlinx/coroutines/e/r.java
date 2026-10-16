package kotlinx.coroutines.e;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f51912a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final int f51913b = c(Throwable.class, -1);

    /* renamed from: c, reason: collision with root package name */
    private static final h f51914c;

    static {
        aw awVar;
        try {
            awVar = s.a() ? aw.f51886a : b.f51889a;
        } catch (Throwable unused) {
            awVar = aw.f51886a;
        }
        f51914c = awVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Throwable a(Throwable th) {
        Object objA;
        if (!(th instanceof kotlinx.coroutines.x)) {
            return (Throwable) f51914c.a(th.getClass()).invoke(th);
        }
        try {
            objA = ((kotlinx.coroutines.x) th).a();
        } catch (Throwable th2) {
            objA = e.b.c.a(th2);
        }
        if (true == (objA instanceof h.l)) {
            objA = null;
        }
        return (Throwable) objA;
    }

    private static final int c(Class cls, int i2) {
        Object objA;
        h.g.b.o.y(cls);
        int i3 = 0;
        do {
            try {
                int i4 = 0;
                for (Field field : cls.getDeclaredFields()) {
                    if (!Modifier.isStatic(field.getModifiers())) {
                        i4++;
                    }
                }
                i3 += i4;
                cls = cls.getSuperclass();
            } catch (Throwable th) {
                objA = e.b.c.a(th);
            }
        } while (cls != null);
        objA = Integer.valueOf(i3);
        Object objValueOf = Integer.valueOf(i2);
        if (true == (objA instanceof h.l)) {
            objA = objValueOf;
        }
        return ((Number) objA).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h.g.a.l d(Class cls) throws NoSuchMethodException, SecurityException {
        h.g.a.l lVar;
        h.k kVar;
        h.k kVar2;
        kotlinx.coroutines.z zVar = new kotlinx.coroutines.z(4);
        Object next = null;
        try {
            final Method method = cls.getMethod("copyForStackTraceRecovery", null);
            return new h.g.a.l() { // from class: kotlinx.coroutines.e.m
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    Object objA;
                    Throwable th = (Throwable) obj;
                    int i2 = r.f51912a;
                    try {
                        objA = (Throwable) method.invoke(th, null);
                    } catch (Throwable th2) {
                        objA = e.b.c.a(th2);
                    }
                    return (Throwable) (true != (objA instanceof h.l) ? objA : null);
                }
            };
        } catch (NoClassDefFoundError | NoSuchMethodException | SecurityException unused) {
            if (f51913b == c(cls, 0)) {
                Constructor<?>[] constructors = cls.getConstructors();
                ArrayList arrayList = new ArrayList(constructors.length);
                for (final Constructor<?> constructor : constructors) {
                    Class<?>[] parameterTypes = constructor.getParameterTypes();
                    int length = parameterTypes.length;
                    int i2 = 11;
                    if (length != 0) {
                        if (length == 1) {
                            Class<?> cls2 = parameterTypes[0];
                            if (h.g.b.x.n(cls2, String.class)) {
                                kVar = new h.k(new com.waze.uid.b(new h.g.a.l() { // from class: kotlinx.coroutines.e.o
                                    @Override // h.g.a.l
                                    public final Object invoke(Object obj) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                                        Throwable th = (Throwable) obj;
                                        int i3 = r.f51912a;
                                        Object objNewInstance = constructor.newInstance(th.getMessage());
                                        h.g.b.x.d(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
                                        Throwable th2 = (Throwable) objNewInstance;
                                        th2.initCause(th);
                                        return th2;
                                    }
                                }, i2), 2);
                            } else if (h.g.b.x.n(cls2, Throwable.class)) {
                                kVar = new h.k(new com.waze.uid.b(new h.g.a.l() { // from class: kotlinx.coroutines.e.p
                                    @Override // h.g.a.l
                                    public final Object invoke(Object obj) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                                        int i3 = r.f51912a;
                                        Object objNewInstance = constructor.newInstance((Throwable) obj);
                                        h.g.b.x.d(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
                                        return (Throwable) objNewInstance;
                                    }
                                }, i2), 1);
                            } else {
                                kVar2 = new h.k(null, -1);
                            }
                        } else if (length != 2) {
                            kVar2 = new h.k(null, -1);
                        } else if (h.g.b.x.n(parameterTypes[0], String.class) && h.g.b.x.n(parameterTypes[1], Throwable.class)) {
                            kVar = new h.k(new com.waze.uid.b(new h.g.a.l() { // from class: kotlinx.coroutines.e.n
                                @Override // h.g.a.l
                                public final Object invoke(Object obj) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                                    Throwable th = (Throwable) obj;
                                    int i3 = r.f51912a;
                                    Object objNewInstance = constructor.newInstance(th.getMessage(), th);
                                    h.g.b.x.d(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
                                    return (Throwable) objNewInstance;
                                }
                            }, i2), 3);
                        } else {
                            kVar2 = new h.k(null, -1);
                        }
                        arrayList.add(kVar2);
                    } else {
                        kVar = new h.k(new com.waze.uid.b(new h.g.a.l() { // from class: kotlinx.coroutines.e.q
                            @Override // h.g.a.l
                            public final Object invoke(Object obj) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                                int i3 = r.f51912a;
                                Object objNewInstance = constructor.newInstance(null);
                                h.g.b.x.d(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
                                Throwable th = (Throwable) objNewInstance;
                                th.initCause((Throwable) obj);
                                return th;
                            }
                        }, i2), 0);
                    }
                    kVar2 = kVar;
                    arrayList.add(kVar2);
                }
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        int iIntValue = ((Number) ((h.k) next).d()).intValue();
                        while (true) {
                            Object next2 = it.next();
                            int iIntValue2 = ((Number) ((h.k) next2).d()).intValue();
                            int i3 = iIntValue < iIntValue2 ? iIntValue2 : iIntValue;
                            if (iIntValue < iIntValue2) {
                                next = next2;
                            }
                            if (!it.hasNext()) {
                                break;
                            }
                            iIntValue = i3;
                        }
                    }
                }
                h.k kVar3 = (h.k) next;
                if (kVar3 != null && (lVar = (h.g.a.l) kVar3.c()) != null) {
                    return lVar;
                }
            }
            return zVar;
        }
    }
}
