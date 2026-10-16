package defpackage;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
final class eph {
    static final defpackage.eph a = new defpackage.eph();
    private final java.util.Map c = new java.util.HashMap();
    public final java.util.Map b = new java.util.HashMap();

    private static final void d(java.util.Map map, defpackage.epg epgVar, defpackage.epw epwVar, java.lang.Class cls) {
        defpackage.epw epwVar2 = (defpackage.epw) map.get(epgVar);
        if (epwVar2 == null || epwVar == epwVar2) {
            if (epwVar2 == null) {
                map.put(epgVar, epwVar);
                return;
            }
            return;
        }
        throw new java.lang.IllegalArgumentException("Method " + epgVar.b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + epwVar2.toString() + ", new value " + java.lang.String.valueOf(epwVar));
    }

    public final java.lang.reflect.Method[] a(java.lang.Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (java.lang.NoClassDefFoundError e) {
            throw new java.lang.IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.Map] */
    public final defpackage.etl b(java.lang.Class cls, java.lang.reflect.Method[] methodArr) {
        int i;
        java.lang.Class superclass = cls.getSuperclass();
        java.util.HashMap map = new java.util.HashMap();
        if (superclass != null) {
            map.putAll(c(superclass).a);
        }
        for (java.lang.Class<?> cls2 : cls.getInterfaces()) {
            for (java.util.Map.Entry entry : c(cls2).a.entrySet()) {
                d(map, (defpackage.epg) entry.getKey(), (defpackage.epw) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = a(cls);
        }
        boolean z = false;
        for (java.lang.reflect.Method method : methodArr) {
            androidx.lifecycle.OnLifecycleEvent onLifecycleEvent = (androidx.lifecycle.OnLifecycleEvent) method.getAnnotation(androidx.lifecycle.OnLifecycleEvent.class);
            if (onLifecycleEvent != null) {
                java.lang.Class<?>[] parameterTypes = method.getParameterTypes();
                int length = parameterTypes.length;
                if (length <= 0) {
                    i = 0;
                } else {
                    if (!defpackage.eqg.class.isAssignableFrom(parameterTypes[0])) {
                        throw new java.lang.IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                defpackage.epw epwVarA = onLifecycleEvent.a();
                if (length > 1) {
                    if (!defpackage.epw.class.isAssignableFrom(parameterTypes[1])) {
                        throw new java.lang.IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (epwVarA != defpackage.epw.ON_ANY) {
                        throw new java.lang.IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (length > 2) {
                    throw new java.lang.IllegalArgumentException("cannot have more than 2 params");
                }
                d(map, new defpackage.epg(i, method), epwVarA, cls);
                z = true;
            }
        }
        defpackage.etl etlVar = new defpackage.etl(map);
        this.c.put(cls, etlVar);
        this.b.put(cls, java.lang.Boolean.valueOf(z));
        return etlVar;
    }

    final defpackage.etl c(java.lang.Class cls) {
        defpackage.etl etlVar = (defpackage.etl) this.c.get(cls);
        return etlVar != null ? etlVar : b(cls, null);
    }
}
