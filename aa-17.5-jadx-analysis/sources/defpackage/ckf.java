package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ckf {
    private static Method a;
    private static Method b;
    private static boolean c;

    public static final void a(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void b(Canvas canvas, boolean z) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 29) {
            if (z) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (!c) {
            try {
                if (Build.VERSION.SDK_INT == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    a = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    b = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    a = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    b = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method = a;
                if (method != null) {
                    method.setAccessible(true);
                }
                Method method2 = b;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            c = true;
        }
        try {
            if (z) {
                Method method3 = a;
                if (method3 != null) {
                    method3.invoke(canvas, null);
                }
            } else {
                Method method4 = b;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            }
        } catch (IllegalAccessException | InvocationTargetException unused2) {
        }
    }

    public static /* synthetic */ cmu c(cjj cjjVar, int i) {
        cmu cmuVar = new cmu(cjjVar, (cjjVar.c() << 32) | (cjjVar.b() & 4294967295L));
        cmuVar.a = i;
        return cmuVar;
    }

    public static final Rect d(dlp dlpVar) {
        return new Rect(dlpVar.b, dlpVar.c, dlpVar.d, dlpVar.e);
    }

    public static final RectF e(cjb cjbVar) {
        return new RectF(cjbVar.b, cjbVar.c, cjbVar.d, cjbVar.e);
    }

    public static final cjb f(Rect rect) {
        return new cjb(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final cjb g(RectF rectF) {
        return new cjb(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static final dlp h(Rect rect) {
        return new dlp(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final int i(fbk fbkVar, String str) {
        int iA = fbkVar.a();
        for (int i = 0; i < iA; i++) {
            if (affa.f(str, fbkVar.c(i))) {
                return i;
            }
        }
        return -1;
    }

    public static final int j(fbk fbkVar, String str) throws IOException {
        int iR = crt.r(fbkVar, str);
        if (iR >= 0) {
            return iR;
        }
        int iA = fbkVar.a();
        ArrayList arrayList = new ArrayList(iA);
        for (int i = 0; i < iA; i++) {
            arrayList.add(fbkVar.c(i));
        }
        throw new IllegalArgumentException("Column '" + str + "' does not exist. Available columns: [" + woy.cu(arrayList, null, null, null, null, 63) + ']');
    }

    public static final int k(fca fcaVar) throws Exception {
        fbk fbkVarA = fcaVar.a("SELECT changes()");
        try {
            fbkVarA.k();
            int iB = (int) fbkVarA.b(0);
            affa.m(fbkVarA, null);
            return iB;
        } finally {
        }
    }

    public static final Object l(Class cls) throws ClassNotFoundException {
        String name;
        String str;
        Package r0 = cls.getPackage();
        if (r0 == null || (name = r0.getName()) == null) {
            name = "";
        }
        String canonicalName = cls.getCanonicalName();
        canonicalName.getClass();
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
            canonicalName.getClass();
        }
        String strConcat = afyh.I(canonicalName, '.', '_').concat("_Impl");
        try {
            if (name.length() == 0) {
                str = strConcat;
            } else {
                str = name + '.' + strConcat;
            }
            Class<?> cls2 = Class.forName(str, true, cls.getClassLoader());
            cls2.getClass();
            return cls2.getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Cannot find implementation for " + cls.getCanonicalName() + ". " + strConcat + " does not exist. Is Room annotation processor correctly configured?", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Cannot access the constructor ".concat(String.valueOf(cls.getCanonicalName())), e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("Failed to create an instance of ".concat(String.valueOf(cls.getCanonicalName())), e3);
        }
    }

    public static final Object m(ezc ezcVar, boolean z, boolean z2, afec afecVar) {
        ezcVar.j();
        if (ezcVar.o() && !ezcVar.p()) {
            afco afcoVar = (afco) ezcVar.f.get();
            if ((afcoVar != null ? (ezi) afcoVar.get(ezi.a) : null) != null) {
                throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
            }
        }
        afco afcoVar2 = (afco) ezcVar.f.get();
        if (afcoVar2 == null) {
            afcoVar2 = afcp.a;
        }
        return ezd.d(new faq(afcoVar2, ezcVar, z2, z, afecVar, null));
    }

    public static final Object n(ezc ezcVar, afck afckVar) {
        ezi eziVar = (ezi) afckVar.hH().get(ezi.a);
        afco afcoVar = eziVar != null ? eziVar.b : null;
        if (ezcVar.o()) {
            return afcoVar != null ? ezcVar.i().plus(afcoVar) : ezcVar.i();
        }
        afco afcoVarI = ezcVar.i();
        if (afcoVar == null) {
            afcoVar = afcp.a;
        }
        return afcoVarI.plus(afcoVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o(defpackage.ezc r17, boolean r18, defpackage.afec r19, defpackage.afck r20) throws java.lang.Throwable {
        /*
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            boolean r4 = r3 instanceof defpackage.fas
            if (r4 == 0) goto L1b
            r4 = r3
            fas r4 = (defpackage.fas) r4
            int r5 = r4.d
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L1b
            int r5 = r5 - r6
            r4.d = r5
            goto L20
        L1b:
            fas r4 = new fas
            r4.<init>(r3)
        L20:
            java.lang.Object r3 = r4.c
            afcr r5 = defpackage.afcr.a
            int r6 = r4.d
            r7 = 3
            r8 = 2
            r9 = 1
            r10 = 0
            if (r6 == 0) goto L51
            if (r6 == r9) goto L4d
            if (r6 == r8) goto L3e
            if (r6 != r7) goto L36
            defpackage.woy.dF(r3)
            return r3
        L36:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3e:
            boolean r0 = r4.b
            boolean r0 = r4.a
            ewm r1 = r4.f
            androidx.work.impl.WorkDatabase_Impl r2 = r4.e
            defpackage.woy.dF(r3)
            r14 = r0
            r15 = r1
            r13 = r2
            goto L90
        L4d:
            defpackage.woy.dF(r3)
            return r3
        L51:
            defpackage.woy.dF(r3)
            boolean r3 = r0.o()
            if (r3 == 0) goto L75
            boolean r3 = r0.q()
            if (r3 == 0) goto L75
            boolean r3 = r0.p()
            if (r3 == 0) goto L75
            fat r3 = new fat
            r3.<init>(r1, r0, r10, r2)
            r4.d = r9
            java.lang.Object r0 = r0.r(r3, r4)
            if (r0 != r5) goto L74
            goto La6
        L74:
            return r0
        L75:
            r3 = r0
            androidx.work.impl.WorkDatabase_Impl r3 = (androidx.work.impl.WorkDatabase_Impl) r3
            r4.e = r3
            r3 = r2
            ewm r3 = (defpackage.ewm) r3
            r4.f = r3
            r4.a = r1
            r3 = 0
            r4.b = r3
            r4.d = r8
            java.lang.Object r3 = n(r0, r4)
            if (r3 != r5) goto L8d
            goto La6
        L8d:
            r13 = r0
            r14 = r1
            r15 = r2
        L90:
            afco r3 = (defpackage.afco) r3
            far r11 = new far
            r12 = 0
            r16 = 0
            r11.<init>(r12, r13, r14, r15, r16)
            r4.e = r10
            r4.f = r10
            r4.d = r7
            java.lang.Object r0 = defpackage.ahnc.a(r3, r11, r4)
            if (r0 != r5) goto La7
        La6:
            return r5
        La7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckf.o(ezc, boolean, afec, afck):java.lang.Object");
    }
}
