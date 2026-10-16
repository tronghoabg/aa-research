package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ajdi {
    public static final /* synthetic */ int a = 0;
    private static final int b = c(java.lang.Throwable.class, -1);
    private static final defpackage.ajcy c;

    static {
        defpackage.ajcy ajcyVar;
        try {
            ajcyVar = defpackage.ajdj.a ? defpackage.ajeh.a : defpackage.ajcs.a;
        } catch (java.lang.Throwable unused) {
            ajcyVar = defpackage.ajeh.a;
        }
        c = ajcyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final java.lang.Throwable a(java.lang.Throwable th) {
        java.lang.Object objCy;
        if (!(th instanceof defpackage.aiur)) {
            return (java.lang.Throwable) c.a(th.getClass()).invoke(th);
        }
        try {
            objCy = ((defpackage.aiur) th).a();
        } catch (java.lang.Throwable th2) {
            objCy = defpackage.afga.cy(th2);
        }
        if (true == (objCy instanceof defpackage.afav)) {
            objCy = null;
        }
        return (java.lang.Throwable) objCy;
    }

    public static final defpackage.affc b(java.lang.Class cls) {
        defpackage.affc affcVar;
        defpackage.afau afauVar;
        defpackage.afau afauVar2;
        defpackage.xsz xszVar = new defpackage.xsz(10);
        java.lang.Object next = null;
        try {
            final java.lang.reflect.Method method = cls.getMethod("copyForStackTraceRecovery", null);
            return new defpackage.affc() { // from class: ajdd
                @Override // defpackage.affc
                public final java.lang.Object invoke(java.lang.Object obj) {
                    java.lang.Object objCy;
                    java.lang.Throwable th = (java.lang.Throwable) obj;
                    int i = defpackage.ajdi.a;
                    try {
                        objCy = (java.lang.Throwable) method.invoke(th, null);
                    } catch (java.lang.Throwable th2) {
                        objCy = defpackage.afga.cy(th2);
                    }
                    return (java.lang.Throwable) (true != (objCy instanceof defpackage.afav) ? objCy : null);
                }
            };
        } catch (java.lang.NoClassDefFoundError | java.lang.NoSuchMethodException | java.lang.SecurityException unused) {
            if (b == c(cls, 0)) {
                java.lang.reflect.Constructor<?>[] constructors = cls.getConstructors();
                java.util.ArrayList arrayList = new java.util.ArrayList(constructors.length);
                for (final java.lang.reflect.Constructor<?> constructor : constructors) {
                    java.lang.Class<?>[] parameterTypes = constructor.getParameterTypes();
                    int length = parameterTypes.length;
                    int i = 3;
                    if (length != 0) {
                        if (length == 1) {
                            java.lang.Class<?> cls2 = parameterTypes[0];
                            if (defpackage.afga.f(cls2, java.lang.String.class)) {
                                afauVar = new defpackage.afau(new defpackage.aitp(new defpackage.affc() { // from class: ajdf
                                    @Override // defpackage.affc
                                    public final java.lang.Object invoke(java.lang.Object obj) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.reflect.InvocationTargetException {
                                        java.lang.Throwable th = (java.lang.Throwable) obj;
                                        int i2 = defpackage.ajdi.a;
                                        java.lang.Object objNewInstance = constructor.newInstance(th.getMessage());
                                        objNewInstance.getClass();
                                        java.lang.Throwable th2 = (java.lang.Throwable) objNewInstance;
                                        th2.initCause(th);
                                        return th2;
                                    }
                                }, i), 2);
                            } else if (defpackage.afga.f(cls2, java.lang.Throwable.class)) {
                                afauVar = new defpackage.afau(new defpackage.aitp(new defpackage.affc() { // from class: ajdg
                                    @Override // defpackage.affc
                                    public final java.lang.Object invoke(java.lang.Object obj) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.reflect.InvocationTargetException {
                                        int i2 = defpackage.ajdi.a;
                                        java.lang.Object objNewInstance = constructor.newInstance((java.lang.Throwable) obj);
                                        objNewInstance.getClass();
                                        return (java.lang.Throwable) objNewInstance;
                                    }
                                }, i), 1);
                            } else {
                                afauVar2 = new defpackage.afau(null, -1);
                            }
                        } else if (length != 2) {
                            afauVar2 = new defpackage.afau(null, -1);
                        } else if (defpackage.afga.f(parameterTypes[0], java.lang.String.class) && defpackage.afga.f(parameterTypes[1], java.lang.Throwable.class)) {
                            afauVar = new defpackage.afau(new defpackage.aitp(new defpackage.affc() { // from class: ajde
                                @Override // defpackage.affc
                                public final java.lang.Object invoke(java.lang.Object obj) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.reflect.InvocationTargetException {
                                    java.lang.Throwable th = (java.lang.Throwable) obj;
                                    int i2 = defpackage.ajdi.a;
                                    java.lang.Object objNewInstance = constructor.newInstance(th.getMessage(), th);
                                    objNewInstance.getClass();
                                    return (java.lang.Throwable) objNewInstance;
                                }
                            }, i), 3);
                        } else {
                            afauVar2 = new defpackage.afau(null, -1);
                        }
                        arrayList.add(afauVar2);
                    } else {
                        afauVar = new defpackage.afau(new defpackage.aitp(new defpackage.affc() { // from class: ajdh
                            @Override // defpackage.affc
                            public final java.lang.Object invoke(java.lang.Object obj) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.reflect.InvocationTargetException {
                                int i2 = defpackage.ajdi.a;
                                java.lang.Object objNewInstance = constructor.newInstance(null);
                                objNewInstance.getClass();
                                java.lang.Throwable th = (java.lang.Throwable) objNewInstance;
                                th.initCause((java.lang.Throwable) obj);
                                return th;
                            }
                        }, i), 0);
                    }
                    afauVar2 = afauVar;
                    arrayList.add(afauVar2);
                }
                java.util.Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        int iIntValue = ((java.lang.Number) ((defpackage.afau) next).b).intValue();
                        while (true) {
                            java.lang.Object next2 = it.next();
                            int iIntValue2 = ((java.lang.Number) ((defpackage.afau) next2).b).intValue();
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
                defpackage.afau afauVar3 = (defpackage.afau) next;
                if (afauVar3 != null && (affcVar = (defpackage.affc) afauVar3.a) != null) {
                    return affcVar;
                }
            }
            return xszVar;
        }
    }

    private static final int c(java.lang.Class cls, int i) {
        java.lang.Object objCy;
        defpackage.afga.l(cls);
        int i2 = 0;
        do {
            try {
                int i3 = 0;
                for (java.lang.reflect.Field field : cls.getDeclaredFields()) {
                    if (!java.lang.reflect.Modifier.isStatic(field.getModifiers())) {
                        i3++;
                    }
                }
                i2 += i3;
                cls = cls.getSuperclass();
            } catch (java.lang.Throwable th) {
                objCy = defpackage.afga.cy(th);
            }
        } while (cls != null);
        objCy = java.lang.Integer.valueOf(i2);
        java.lang.Object objValueOf = java.lang.Integer.valueOf(i);
        if (true == (objCy instanceof defpackage.afav)) {
            objCy = objValueOf;
        }
        return ((java.lang.Number) objCy).intValue();
    }
}
