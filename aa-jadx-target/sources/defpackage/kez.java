package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class kez {
    public final java.lang.Object a;
    public final java.lang.Object b;
    public final java.lang.Object c;

    public kez(android.content.Context context) {
        android.graphics.drawable.Drawable[][] drawableArr = (android.graphics.drawable.Drawable[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) android.graphics.drawable.Drawable.class, 4, 3);
        this.a = drawableArr;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{2130970777, 2130970777, 2130970778, 2130970775, 2130970771, 2130970779, 2130970782, 2130970775, 2130970772, 2130970780, 2130970783, 2130970775, 2130970773, 2130970781});
        android.graphics.drawable.Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        drawable.getClass();
        this.c = drawable;
        android.graphics.drawable.Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(1);
        drawable2.getClass();
        this.b = drawable2;
        android.graphics.drawable.Drawable[] drawableArr2 = drawableArr[0];
        android.graphics.drawable.Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(2);
        drawable3.getClass();
        drawableArr2[2] = drawable3;
        android.graphics.drawable.Drawable[] drawableArr3 = drawableArr[1];
        android.graphics.drawable.Drawable drawable4 = typedArrayObtainStyledAttributes.getDrawable(3);
        drawable4.getClass();
        drawableArr3[2] = drawable4;
        android.graphics.drawable.Drawable[] drawableArr4 = drawableArr[2];
        android.graphics.drawable.Drawable drawable5 = typedArrayObtainStyledAttributes.getDrawable(4);
        drawable5.getClass();
        drawableArr4[2] = drawable5;
        android.graphics.drawable.Drawable[] drawableArr5 = drawableArr[3];
        android.graphics.drawable.Drawable drawable6 = typedArrayObtainStyledAttributes.getDrawable(5);
        drawable6.getClass();
        drawableArr5[2] = drawable6;
        android.graphics.drawable.Drawable[] drawableArr6 = drawableArr[0];
        android.graphics.drawable.Drawable drawable7 = typedArrayObtainStyledAttributes.getDrawable(6);
        drawable7.getClass();
        drawableArr6[0] = drawable7;
        android.graphics.drawable.Drawable[] drawableArr7 = drawableArr[1];
        android.graphics.drawable.Drawable drawable8 = typedArrayObtainStyledAttributes.getDrawable(7);
        drawable8.getClass();
        drawableArr7[0] = drawable8;
        android.graphics.drawable.Drawable[] drawableArr8 = drawableArr[2];
        android.graphics.drawable.Drawable drawable9 = typedArrayObtainStyledAttributes.getDrawable(8);
        drawable9.getClass();
        drawableArr8[0] = drawable9;
        android.graphics.drawable.Drawable[] drawableArr9 = drawableArr[3];
        android.graphics.drawable.Drawable drawable10 = typedArrayObtainStyledAttributes.getDrawable(9);
        drawable10.getClass();
        drawableArr9[0] = drawable10;
        android.graphics.drawable.Drawable[] drawableArr10 = drawableArr[0];
        android.graphics.drawable.Drawable drawable11 = typedArrayObtainStyledAttributes.getDrawable(10);
        drawable11.getClass();
        drawableArr10[1] = drawable11;
        android.graphics.drawable.Drawable[] drawableArr11 = drawableArr[1];
        android.graphics.drawable.Drawable drawable12 = typedArrayObtainStyledAttributes.getDrawable(11);
        drawable12.getClass();
        drawableArr11[1] = drawable12;
        android.graphics.drawable.Drawable[] drawableArr12 = drawableArr[2];
        android.graphics.drawable.Drawable drawable13 = typedArrayObtainStyledAttributes.getDrawable(12);
        drawable13.getClass();
        drawableArr12[1] = drawable13;
        android.graphics.drawable.Drawable[] drawableArr13 = drawableArr[3];
        android.graphics.drawable.Drawable drawable14 = typedArrayObtainStyledAttributes.getDrawable(13);
        drawable14.getClass();
        drawableArr13[1] = drawable14;
        typedArrayObtainStyledAttributes.recycle();
    }

    public static final java.util.Locale h() {
        java.util.Locale locale = java.util.Locale.getDefault();
        locale.getClass();
        return locale;
    }

    private final java.lang.reflect.Method q(java.lang.Class cls) {
        java.lang.Object obj;
        java.lang.reflect.Method methodR = r(cls, (java.lang.String) this.a, (java.lang.Class[]) this.c);
        if (methodR != null && (obj = this.b) != null) {
            if (!((java.lang.Class) obj).isAssignableFrom(methodR.getReturnType())) {
                return null;
            }
        }
        return methodR;
    }

    private static java.lang.reflect.Method r(java.lang.Class cls, java.lang.String str, java.lang.Class[] clsArr) {
        if (cls == null) {
            return null;
        }
        try {
            if ((cls.getModifiers() & 1) == 0) {
                return r(cls.getSuperclass(), str, clsArr);
            }
            java.lang.reflect.Method method = cls.getMethod(str, clsArr);
            try {
                if (1 != (method.getModifiers() & 1)) {
                    return null;
                }
            } catch (java.lang.NoSuchMethodException unused) {
            }
            return method;
        } catch (java.lang.NoSuchMethodException unused2) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0010  */
    /* JADX WARN: Code duplicated, block: B:11:0x0012  */
    /* JADX WARN: Code duplicated, block: B:17:0x001b  */
    /* JADX WARN: Code duplicated, block: B:18:0x001d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x001f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x000c  */
    /* JADX WARN: Code duplicated, block: B:9:0x000e A[DONT_INVERT] */
    public final android.graphics.drawable.Drawable a(boolean z, boolean z2, boolean z3, boolean z4) {
        char c;
        char c2 = 2;
        if (z) {
            if (z2) {
                c = 3;
            } else {
                z2 = false;
                if (z) {
                    c = 0;
                } else if (z2) {
                    c = 2;
                } else {
                    c = 1;
                }
            }
        } else if (z) {
            c = 0;
        } else if (z2) {
            c = 2;
        } else {
            c = 1;
        }
        if (z3) {
            if (!z4) {
                z4 = false;
                if (z3) {
                    c2 = 0;
                } else {
                    if (z4) {
                        throw new java.lang.IllegalArgumentException("Horizontal middle background not supported");
                    }
                    c2 = 1;
                }
            }
        } else if (z3) {
            c2 = 0;
        } else {
            if (z4) {
                throw new java.lang.IllegalArgumentException("Horizontal middle background not supported");
            }
            c2 = 1;
        }
        return ((android.graphics.drawable.Drawable[][]) this.a)[c][c2];
    }

    public final android.graphics.drawable.Drawable b(boolean z) {
        return (android.graphics.drawable.Drawable) (z ? this.b : this.c);
    }

    public final boolean c(java.lang.Class cls, java.lang.Class cls2) {
        return ((java.lang.Class) this.c).isAssignableFrom(cls) && cls2.isAssignableFrom((java.lang.Class) this.a);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.lang.Runnable] */
    public final void d(lvn lvnVar) {
        if (lvnVar == null) {
            return;
        }
        lyr lyrVarA = lyr.a.a();
        java.lang.Long l = (java.lang.Long) lyrVarA.d.get(this.c);
        if (l == null || l.longValue() != lvnVar.e) {
            return;
        }
        this.a.run();
    }

    public final void e() {
        defpackage.lnt.m().i((ajnd) this.b);
    }

    public final void f() {
        defpackage.lnt.m().j((ajnd) this.b);
    }

    public final java.util.Locale g() {
        return vjx.p((android.content.Context) this.c);
    }

    public final synchronized void i(long j, zrv zrvVar) {
        usi usiVar = (usi) ((j$.util.concurrent.ConcurrentHashMap) this.a).remove(java.lang.Long.valueOf(j));
        usiVar.getClass();
        usiVar.b().execute(new defpackage.unw(this, usiVar, zrvVar, 3));
    }

    public final java.lang.Object j() {
        abdv abdvVarQ = ((defpackage.abor) this.b).q();
        sdv sdvVar = (sdv) this.a;
        java.lang.Object obj = sdvVar.b ? sdvVar.d : null;
        usd usdVar = (usd) this.c;
        return new use(abdvVarQ, (tsw) usdVar.b, (uss) obj, (qsv) ((wep) usdVar.a).a);
    }

    public final defpackage.abot k(tsk tskVar) {
        uxy uxyVarE = ((sdv) this.a).e(tskVar);
        defpackage.abot abotVar = (defpackage.abot) abdq.a.n();
        abotVar.t();
        abdq abdqVar = abotVar.b;
        abdqVar.b |= 2;
        abdqVar.d = uxyVarE.a;
        return abotVar;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, udc] */
    public final synchronized void l() {
        ((defpackage.ndd) this.a).a.s((tsr) this.c);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, udc] */
    public final synchronized void m() {
        ((defpackage.ndd) this.a).a.i((abdz) this.b, (tsr) this.c);
    }

    public final java.lang.Object n(java.lang.Object obj, java.lang.Object... objArr) {
        try {
            java.lang.reflect.Method methodQ = q(obj.getClass());
            if (methodQ != null) {
                try {
                    return methodQ.invoke(obj, objArr);
                } catch (java.lang.IllegalAccessException e) {
                    java.lang.AssertionError assertionError = new java.lang.AssertionError("Unexpectedly could not call: ".concat(methodQ.toString()));
                    assertionError.initCause(e);
                    throw assertionError;
                }
            }
            java.lang.Object obj2 = this.a;
            throw new java.lang.AssertionError("Method " + ((java.lang.String) obj2) + " not supported for object " + java.lang.String.valueOf(obj));
        } catch (java.lang.reflect.InvocationTargetException e2) {
            java.lang.Throwable targetException = e2.getTargetException();
            if (targetException instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) targetException);
            }
            java.lang.AssertionError assertionError2 = new java.lang.AssertionError("Unexpected exception");
            assertionError2.initCause(targetException);
            throw assertionError2;
        }
    }

    public final boolean o(java.lang.Object obj) {
        return q(obj.getClass()) != null;
    }

    public final void p(java.lang.Object obj, java.lang.Object... objArr) {
        try {
            java.lang.reflect.Method methodQ = q(obj.getClass());
            if (methodQ == null) {
                return;
            }
            try {
                methodQ.invoke(obj, objArr);
            } catch (java.lang.IllegalAccessException unused) {
            }
        } catch (java.lang.reflect.InvocationTargetException e) {
            java.lang.Throwable targetException = e.getTargetException();
            if (targetException instanceof java.lang.RuntimeException) {
                throw ((java.lang.RuntimeException) targetException);
            }
            java.lang.AssertionError assertionError = new java.lang.AssertionError("Unexpected exception");
            assertionError.initCause(targetException);
            throw assertionError;
        }
    }

    public kez(abdz abdzVar, tsr tsrVar, defpackage.ndd nddVar) {
        this.b = abdzVar;
        this.a = nddVar;
        this.c = tsrVar;
    }

    public kez(defpackage.ador adorVar, defpackage.adtj adtjVar, defpackage.adnd adndVar) {
        this.a = adorVar;
        this.c = adtjVar;
        this.b = adndVar;
    }

    public kez(androidx.core.graphics.drawable.IconCompat iconCompat, java.lang.String str, defpackage.afer aferVar) {
        this.c = iconCompat;
        this.b = str;
        this.a = aferVar;
    }

    public kez(java.lang.Class cls, java.lang.Class cls2, huy huyVar) {
        this.c = cls;
        this.a = cls2;
        this.b = huyVar;
    }

    public kez(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public kez(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, byte[] bArr) {
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public kez(lwi lwiVar, java.lang.Runnable runnable) {
        this.c = lwiVar;
        this.a = runnable;
        this.b = new ajnd(this, (byte[]) null);
    }

    public kez(byte[] bArr) {
        this.b = "f";
        this.a = "g";
        this.c = "h";
    }

    public kez(byte[] bArr, byte[] bArr2) {
        this.a = "s";
        this.c = "t";
        this.b = "u";
    }

    public kez(char[] cArr) {
        this.a = "e";
        this.c = "f";
        this.b = "g";
    }

    public kez(defpackage.afak afakVar) {
        this.a = new j$.util.concurrent.ConcurrentHashMap();
        this.b = defpackage.ysr.aQ(new defpackage.upb(afakVar, 4));
        this.c = defpackage.ysr.aQ(new defpackage.upb(afakVar, 5));
    }

    public kez(android.content.Context context, byte[] bArr) {
        context.getClass();
        this.c = context;
        defpackage.htw htwVar = new defpackage.htw((defpackage.xzi) new defpackage.upb(this, 6));
        vaa vaaVar = new vaa(htwVar);
        char[] cArr = null;
        ((vaw) htwVar.a).k(new defpackage.unw((java.lang.Object) htwVar, (java.lang.Object) this, (java.lang.Object) vaaVar, 4, cArr));
        ((vaw) htwVar.a).l(new defpackage.unw((java.lang.Object) htwVar, (java.lang.Object) this, (java.lang.Object) vaaVar, 5, cArr));
        this.a = htwVar;
        this.b = htwVar.a;
    }

    public kez(jsu jsuVar, jtg jtgVar) {
        this.c = jsuVar;
        this.a = jtgVar;
        tb tbVar = new tb();
        tbVar.e("unused");
        tbVar.d(new gei(this, 6));
        this.b = tbVar.a();
    }

    public kez() {
        this.b = "e";
        this.c = "f";
        this.a = "g";
    }

    public kez(java.util.concurrent.ScheduledExecutorService scheduledExecutorService, jtu jtuVar) {
        this.c = new android.os.Handler(android.os.Looper.getMainLooper());
        this.a = scheduledExecutorService;
        this.b = jtuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    public kez(android.content.Context context, kra kraVar, androidx.core.graphics.drawable.IconCompat iconCompat) {
        this.b = iconCompat;
        defpackage.ygw ygwVar = kraVar.b;
        ygwVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.you youVarListIterator = ygwVar.listIterator(0);
        while (youVarListIterator.hasNext()) {
            krg krgVar = (krg) youVarListIterator.next();
            krgVar.getClass();
            java.lang.String str = kraVar.a;
            str.getClass();
            ?? kzyVar = 0;
            kzyVar = 0;
            kzyVar = 0;
            if (!afzh.v(krgVar.a) && krgVar.c != null && krgVar.d != null) {
                kzyVar = new kzy(krgVar.a, (androidx.core.graphics.drawable.IconCompat) this.b, lya.a(krgVar, str, (java.lang.String) null), new defpackage.kla(context, krgVar, 15, kzyVar), (byte[]) null);
            }
            if (kzyVar != 0) {
                arrayList.add(kzyVar);
            }
        }
        defpackage.afdo afdoVar = defpackage.tcu.a;
        this.a = new defpackage.eqs(arrayList);
        java.lang.String str2 = kraVar.a;
        str2.getClass();
        this.c = str2;
    }
}
