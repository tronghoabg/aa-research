package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class ajci {
    public static final /* synthetic */ int a = 0;
    private static final int b = c(Throwable.class, -1);
    private static final ajby c;

    static {
        ajby ajbyVar;
        try {
            ajbyVar = ajcj.a ? ajdh.a : ajbs.a;
        } catch (Throwable unused) {
            ajbyVar = ajdh.a;
        }
        c = ajbyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Throwable a(Throwable th) {
        Object objDE;
        if (!(th instanceof aitr)) {
            return (Throwable) c.a(th.getClass()).invoke(th);
        }
        try {
            objDE = ((aitr) th).a();
        } catch (Throwable th2) {
            objDE = woy.dE(th2);
        }
        if (true == (objDE instanceof aezv)) {
            objDE = null;
        }
        return (Throwable) objDE;
    }

    public static final afec b(Class cls) throws NoSuchMethodException, SecurityException {
        afec afecVar;
        aezu aezuVar;
        aezu aezuVar2;
        airt airtVar = new airt(4);
        Object next = null;
        try {
            final Method method = cls.getMethod("copyForStackTraceRecovery", null);
            return new afec() { // from class: ajcd
                @Override // defpackage.afec
                public final Object invoke(Object obj) {
                    Object objDE;
                    Throwable th = (Throwable) obj;
                    int i = ajci.a;
                    try {
                        objDE = (Throwable) method.invoke(th, null);
                    } catch (Throwable th2) {
                        objDE = woy.dE(th2);
                    }
                    return (Throwable) (true != (objDE instanceof aezv) ? objDE : null);
                }
            };
        } catch (NoClassDefFoundError | NoSuchMethodException | SecurityException unused) {
            if (b == c(cls, 0)) {
                Constructor<?>[] constructors = cls.getConstructors();
                ArrayList arrayList = new ArrayList(constructors.length);
                for (final Constructor<?> constructor : constructors) {
                    Class<?>[] parameterTypes = constructor.getParameterTypes();
                    int length = parameterTypes.length;
                    int i = 9;
                    if (length != 0) {
                        if (length == 1) {
                            Class<?> cls2 = parameterTypes[0];
                            if (affa.f(cls2, String.class)) {
                                aezuVar = new aezu(new xrr(new afec() { // from class: ajcf
                                    @Override // defpackage.afec
                                    public final Object invoke(Object obj) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                                        Throwable th = (Throwable) obj;
                                        int i2 = ajci.a;
                                        Object objNewInstance = constructor.newInstance(th.getMessage());
                                        objNewInstance.getClass();
                                        Throwable th2 = (Throwable) objNewInstance;
                                        th2.initCause(th);
                                        return th2;
                                    }
                                }, i), 2);
                            } else if (affa.f(cls2, Throwable.class)) {
                                aezuVar = new aezu(new xrr(new afec() { // from class: ajcg
                                    @Override // defpackage.afec
                                    public final Object invoke(Object obj) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                                        int i2 = ajci.a;
                                        Object objNewInstance = constructor.newInstance((Throwable) obj);
                                        objNewInstance.getClass();
                                        return (Throwable) objNewInstance;
                                    }
                                }, i), 1);
                            } else {
                                aezuVar2 = new aezu(null, -1);
                            }
                        } else if (length != 2) {
                            aezuVar2 = new aezu(null, -1);
                        } else if (affa.f(parameterTypes[0], String.class) && affa.f(parameterTypes[1], Throwable.class)) {
                            aezuVar = new aezu(new xrr(new afec() { // from class: ajce
                                @Override // defpackage.afec
                                public final Object invoke(Object obj) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                                    Throwable th = (Throwable) obj;
                                    int i2 = ajci.a;
                                    Object objNewInstance = constructor.newInstance(th.getMessage(), th);
                                    objNewInstance.getClass();
                                    return (Throwable) objNewInstance;
                                }
                            }, i), 3);
                        } else {
                            aezuVar2 = new aezu(null, -1);
                        }
                        arrayList.add(aezuVar2);
                    } else {
                        aezuVar = new aezu(new xrr(new afec() { // from class: ajch
                            @Override // defpackage.afec
                            public final Object invoke(Object obj) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                                int i2 = ajci.a;
                                Object objNewInstance = constructor.newInstance(null);
                                objNewInstance.getClass();
                                Throwable th = (Throwable) objNewInstance;
                                th.initCause((Throwable) obj);
                                return th;
                            }
                        }, i), 0);
                    }
                    aezuVar2 = aezuVar;
                    arrayList.add(aezuVar2);
                }
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        int iIntValue = ((Number) ((aezu) next).b).intValue();
                        while (true) {
                            Object next2 = it.next();
                            int iIntValue2 = ((Number) ((aezu) next2).b).intValue();
                            int i2 = iIntValue < iIntValue2 ? iIntValue2 : iIntValue;
                            if (iIntValue < iIntValue2) {
                                next = next2;
                            }
                            if (!it.hasNext()) {
                                break;
                            }
                            iIntValue = i2;
                        }
                    }
                }
                aezu aezuVar3 = (aezu) next;
                if (aezuVar3 != null && (afecVar = (afec) aezuVar3.a) != null) {
                    return afecVar;
                }
            }
            return airtVar;
        }
    }

    private static final int c(Class cls, int i) {
        Object objDE;
        affa.l(cls);
        int i2 = 0;
        do {
            try {
                int i3 = 0;
                for (Field field : cls.getDeclaredFields()) {
                    if (!Modifier.isStatic(field.getModifiers())) {
                        i3++;
                    }
                }
                i2 += i3;
                cls = cls.getSuperclass();
            } catch (Throwable th) {
                objDE = woy.dE(th);
            }
        } while (cls != null);
        objDE = Integer.valueOf(i2);
        Object objValueOf = Integer.valueOf(i);
        if (true == (objDE instanceof aezv)) {
            objDE = objValueOf;
        }
        return ((Number) objDE).intValue();
    }
}
