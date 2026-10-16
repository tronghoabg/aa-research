package j$.com.android.tools.r8;

/* JADX INFO: compiled from: r8-map-id-90908930df84e21cddb8f575a31af6dbb9b5560b3b51c7a13ad777fd26cd64ad */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a {
    public static final /* synthetic */ sun.misc.Unsafe c;
    public final /* synthetic */ java.lang.Class a;
    public final /* synthetic */ long b;

    static {
        java.lang.reflect.Field declaredField;
        try {
            declaredField = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
        } catch (java.lang.NoSuchFieldException e) {
            java.lang.reflect.Field[] declaredFields = sun.misc.Unsafe.class.getDeclaredFields();
            int length = declaredFields.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    declaredField = null;
                    break;
                }
                java.lang.reflect.Field field = declaredFields[i];
                if (java.lang.reflect.Modifier.isStatic(field.getModifiers()) && sun.misc.Unsafe.class.isAssignableFrom(field.getType())) {
                    declaredField = field;
                    break;
                }
                i++;
            }
            if (declaredField != null) {
                throw new java.lang.UnsupportedOperationException("Couldn't find the Unsafe", e);
            }
        }
        declaredField.setAccessible(true);
        try {
            c = (sun.misc.Unsafe) declaredField.get(null);
        } catch (java.lang.Exception e2) {
            throw new java.lang.RuntimeException(e2);
        }
    }

    public /* synthetic */ a(java.lang.Class cls, java.lang.String str, java.lang.Class cls2) {
        this.a = cls.getDeclaredField(str).getType();
        if (!cls2.isPrimitive() || cls2 == java.lang.Integer.TYPE || cls2 == java.lang.Long.TYPE) {
            this.b = c.objectFieldOffset(cls.getDeclaredField(str));
            return;
        }
        throw new java.lang.UnsupportedOperationException("Using a VarHandle for a field of type '" + cls2.getName() + "' requires native VarHandle support available from Android 13. VarHandle desugaring only supports primitive types int and long and reference types.");
    }

    public static /* synthetic */ int d(java.lang.Object obj) {
        if (obj instanceof java.lang.Integer) {
            return ((java.lang.Integer) obj).intValue();
        }
        if (obj instanceof java.lang.Byte) {
            return ((java.lang.Byte) obj).byteValue();
        }
        if (obj instanceof java.lang.Character) {
            return ((java.lang.Character) obj).charValue();
        }
        if (obj instanceof java.lang.Short) {
            return ((java.lang.Short) obj).shortValue();
        }
        throw new java.lang.RuntimeException("java.lang.invoke.WrongMethodTypeException");
    }

    public static /* synthetic */ long e(java.lang.Object obj) {
        return obj instanceof java.lang.Long ? ((java.lang.Long) obj).longValue() : d(obj);
    }

    public final /* synthetic */ boolean a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.Class cls = this.a;
        java.lang.Class cls2 = java.lang.Integer.TYPE;
        long j = this.b;
        if (cls == cls2) {
            return c.compareAndSwapInt(obj, j, d(obj2), d(obj3));
        }
        if (cls == java.lang.Long.TYPE) {
            return c.compareAndSwapLong(obj, j, e(obj2), e(obj3));
        }
        while (true) {
            sun.misc.Unsafe unsafe = c;
            java.lang.Object obj4 = obj2;
            java.lang.Object obj5 = obj3;
            if (unsafe.compareAndSwapObject(obj, j, obj4, obj5)) {
                return true;
            }
            if (unsafe.getObject(obj, j) != obj4) {
                return false;
            }
            obj2 = obj4;
            obj3 = obj5;
        }
    }

    public final /* synthetic */ void b(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Class cls = java.lang.Long.TYPE;
        long j = this.b;
        java.lang.Class cls2 = this.a;
        java.lang.Class cls3 = java.lang.Integer.TYPE;
        if (cls2 == cls3) {
            int iD = d(obj2);
            if (cls2 == cls3) {
                c.putInt(obj, j, iD);
                return;
            } else if (cls2 != cls) {
                b(obj, java.lang.Integer.valueOf(iD));
                return;
            } else {
                c.putLong(obj, this.b, iD);
                return;
            }
        }
        sun.misc.Unsafe unsafe = c;
        if (cls2 != cls) {
            unsafe.putObject(obj, j, obj2);
            return;
        }
        long jE = e(obj2);
        if (cls2 == cls) {
            unsafe.putLong(obj, this.b, jE);
        } else {
            if (cls2 == cls3) {
                throw new java.lang.RuntimeException("java.lang.invoke.WrongMethodTypeException");
            }
            unsafe.putObject(obj, j, java.lang.Long.valueOf(jE));
        }
    }

    public final /* synthetic */ void c(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Class cls = java.lang.Long.TYPE;
        long j = this.b;
        java.lang.Class cls2 = this.a;
        java.lang.Class cls3 = java.lang.Integer.TYPE;
        if (cls2 == cls3) {
            int iD = d(obj2);
            if (cls2 == cls3) {
                c.putOrderedInt(obj, j, iD);
                return;
            } else if (cls2 != cls) {
                c(obj, java.lang.Integer.valueOf(iD));
                return;
            } else {
                c.putOrderedLong(obj, this.b, iD);
                return;
            }
        }
        sun.misc.Unsafe unsafe = c;
        if (cls2 != cls) {
            unsafe.putOrderedObject(obj, j, obj2);
            return;
        }
        long jE = e(obj2);
        if (cls2 == cls) {
            unsafe.putOrderedLong(obj, this.b, jE);
        } else {
            if (cls2 == cls3) {
                throw new java.lang.RuntimeException("java.lang.invoke.WrongMethodTypeException");
            }
            unsafe.putOrderedObject(obj, j, java.lang.Long.valueOf(jE));
        }
    }

    public final /* synthetic */ boolean f(j$.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue, java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Class cls = this.a;
        java.lang.Class cls2 = java.lang.Integer.TYPE;
        long j = this.b;
        if (cls == cls2) {
            return c.compareAndSwapInt(concurrentLinkedQueue, j, d(obj), d(obj2));
        }
        if (cls == java.lang.Long.TYPE) {
            return c.compareAndSwapLong(concurrentLinkedQueue, j, e(obj), e(obj2));
        }
        while (true) {
            sun.misc.Unsafe unsafe = c;
            java.lang.Object obj3 = obj;
            java.lang.Object obj4 = obj2;
            if (unsafe.compareAndSwapObject(concurrentLinkedQueue, j, obj3, obj4)) {
                return true;
            }
            if (unsafe.getObject(concurrentLinkedQueue, j) != obj3) {
                return false;
            }
            obj = obj3;
            obj2 = obj4;
        }
    }
}
