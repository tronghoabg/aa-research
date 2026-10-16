package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class eql {
    public static final defpackage.eql a = new defpackage.eql();
    private static final java.util.Map c = new java.util.HashMap();
    public static final java.util.Map b = new java.util.HashMap();

    public static final ept b(java.lang.reflect.Constructor constructor, java.lang.Object obj) {
        try {
            java.lang.Object objNewInstance = constructor.newInstance(obj);
            objNewInstance.getClass();
            return (ept) objNewInstance;
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.RuntimeException(e);
        } catch (java.lang.InstantiationException e2) {
            throw new java.lang.RuntimeException(e2);
        } catch (java.lang.reflect.InvocationTargetException e3) {
            throw new java.lang.RuntimeException(e3);
        }
    }

    private static final boolean c(java.lang.Class cls) {
        return cls != null && defpackage.eqf.class.isAssignableFrom(cls);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e5 A[PHI: r1
  0x00e5: PHI (r1v5 java.util.ArrayList) = (r1v4 java.util.ArrayList), (r1v11 java.util.ArrayList) binds: [B:44:0x00c9, B:48:0x00d5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:57:0x0101 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x0103  */
    /* JADX WARN: Code duplicated, block: B:62:0x011b  */
    /* JADX WARN: Code duplicated, block: B:70:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x0116 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final int a(java.lang.Class cls) {
        java.lang.reflect.Constructor declaredConstructor;
        java.lang.Class superclass;
        java.lang.Class<?>[] interfaces;
        java.lang.Integer num = (java.lang.Integer) c.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i = 1;
        if (cls.getCanonicalName() != null) {
            java.util.ArrayList arrayList = null;
            try {
                java.lang.Package r4 = cls.getPackage();
                java.lang.String canonicalName = cls.getCanonicalName();
                java.lang.String name = r4 != null ? r4.getName() : "";
                name.getClass();
                if (name.length() != 0) {
                    canonicalName.getClass();
                    canonicalName = canonicalName.substring(name.length() + 1);
                    canonicalName.getClass();
                }
                canonicalName.getClass();
                java.lang.String strConcat = afzh.J(canonicalName, ".", "_").concat("_LifecycleAdapter");
                if (name.length() != 0) {
                    strConcat = defpackage.a.bI(strConcat, name, ".");
                }
                java.lang.Class<?> cls2 = java.lang.Class.forName(strConcat);
                cls2.getClass();
                declaredConstructor = cls2.getDeclaredConstructor(cls);
                if (!declaredConstructor.isAccessible()) {
                    declaredConstructor.setAccessible(true);
                }
            } catch (java.lang.ClassNotFoundException unused) {
                declaredConstructor = null;
            } catch (java.lang.NoSuchMethodException e) {
                throw new java.lang.RuntimeException(e);
            }
            if (declaredConstructor != null) {
                java.util.Map map = b;
                java.util.List listSingletonList = java.util.Collections.singletonList(declaredConstructor);
                listSingletonList.getClass();
                map.put(cls, listSingletonList);
            } else {
                defpackage.eph ephVar = defpackage.eph.a;
                java.util.Map map2 = ephVar.b;
                java.lang.Boolean bool = (java.lang.Boolean) map2.get(cls);
                if (bool == null) {
                    java.lang.reflect.Method[] methodArrA = ephVar.a(cls);
                    for (java.lang.reflect.Method method : methodArrA) {
                        if (method.getAnnotation(androidx.lifecycle.OnLifecycleEvent.class) != null) {
                            ephVar.b(cls, methodArrA);
                        }
                    }
                    map2.put(cls, java.lang.Boolean.FALSE);
                    superclass = cls.getSuperclass();
                    if (c(superclass)) {
                        superclass.getClass();
                        if (a(superclass) != 1) {
                            java.lang.Object obj = b.get(superclass);
                            obj.getClass();
                            arrayList = new java.util.ArrayList((java.util.Collection) obj);
                            interfaces = cls.getInterfaces();
                            interfaces.getClass();
                            for (java.lang.Class<?> cls3 : interfaces) {
                                if (c(cls3)) {
                                    cls3.getClass();
                                    if (a(cls3) == 1) {
                                        if (arrayList == null) {
                                            arrayList = new java.util.ArrayList();
                                        }
                                        java.lang.Object obj2 = b.get(cls3);
                                        obj2.getClass();
                                        arrayList.addAll((java.util.Collection) obj2);
                                    }
                                }
                            }
                            if (arrayList != null) {
                                b.put(cls, arrayList);
                            }
                        }
                    } else {
                        interfaces = cls.getInterfaces();
                        interfaces.getClass();
                        while (i < interfaces.length) {
                            if (c(cls3)) {
                                cls3.getClass();
                                if (a(cls3) == 1) {
                                    if (arrayList == null) {
                                        arrayList = new java.util.ArrayList();
                                    }
                                    java.lang.Object obj3 = b.get(cls3);
                                    obj3.getClass();
                                    arrayList.addAll((java.util.Collection) obj3);
                                }
                            }
                        }
                        if (arrayList != null) {
                            b.put(cls, arrayList);
                        }
                    }
                } else if (!bool.booleanValue()) {
                    superclass = cls.getSuperclass();
                    if (c(superclass)) {
                        superclass.getClass();
                        if (a(superclass) != 1) {
                            java.lang.Object obj4 = b.get(superclass);
                            obj4.getClass();
                            arrayList = new java.util.ArrayList((java.util.Collection) obj4);
                            interfaces = cls.getInterfaces();
                            interfaces.getClass();
                            while (i < interfaces.length) {
                                if (c(cls3)) {
                                    cls3.getClass();
                                    if (a(cls3) == 1) {
                                        if (arrayList == null) {
                                            arrayList = new java.util.ArrayList();
                                        }
                                        java.lang.Object obj5 = b.get(cls3);
                                        obj5.getClass();
                                        arrayList.addAll((java.util.Collection) obj5);
                                    }
                                }
                            }
                            if (arrayList != null) {
                                b.put(cls, arrayList);
                            }
                        }
                    } else {
                        interfaces = cls.getInterfaces();
                        interfaces.getClass();
                        while (i < interfaces.length) {
                            if (c(cls3)) {
                                cls3.getClass();
                                if (a(cls3) == 1) {
                                    if (arrayList == null) {
                                        arrayList = new java.util.ArrayList();
                                    }
                                    java.lang.Object obj6 = b.get(cls3);
                                    obj6.getClass();
                                    arrayList.addAll((java.util.Collection) obj6);
                                }
                            }
                        }
                        if (arrayList != null) {
                            b.put(cls, arrayList);
                        }
                    }
                }
            }
            i = 2;
        }
        c.put(cls, java.lang.Integer.valueOf(i));
        return i;
    }
}
