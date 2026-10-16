package defpackage;

import android.util.Log;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class dlb {
    public static final dlb a = new dlb();

    public static final void a(String str, String str2, bux buxVar, Object... objArr) {
        try {
            Class<?> cls = Class.forName(str);
            int length = objArr.length;
            Method methodC = c(cls, str2, Arrays.copyOf(objArr, length));
            if (methodC == null) {
                throw new NoSuchMethodException(a.bC(str2, str, "Composable ", ".", " not found"));
            }
            methodC.setAccessible(true);
            if (Modifier.isStatic(methodC.getModifiers())) {
                d(methodC, null, buxVar, Arrays.copyOf(objArr, length));
            } else {
                d(methodC, cls.getConstructor(null).newInstance(null), buxVar, Arrays.copyOf(objArr, length));
            }
        } catch (Exception e) {
            Log.w("PreviewLogger", a.bC(str2, str, "Failed to invoke Composable Method '", ".", "'"), null);
            throw e;
        }
    }

    private static final int b(int i, int i2) {
        if (i == 0) {
            return 1;
        }
        return (int) Math.ceil((i + i2) / 10.0d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v3 */
    private static final Method c(Class cls, String str, Object... objArr) throws NoSuchMethodException, SecurityException {
        Method method;
        ArrayList arrayList = new ArrayList();
        int length = objArr.length;
        boolean z = false;
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            Class<?> cls2 = obj != null ? obj.getClass() : null;
            if (cls2 != null) {
                arrayList.add(cls2);
            }
        }
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        try {
            try {
                int iB = b(clsArr.length, 0);
                Class cls3 = Integer.TYPE;
                afha afhaVarM = afpt.m(0, iB);
                ArrayList arrayList2 = new ArrayList(woy.bp(afhaVarM, 10));
                afbk it = afhaVarM.iterator();
                while (((afgz) it).a) {
                    it.a();
                    arrayList2.add(cls3);
                }
                Class[] clsArr2 = (Class[]) arrayList2.toArray(new Class[0]);
                Method[] declaredMethods = cls.getDeclaredMethods();
                ArrayList arrayList3 = new ArrayList(3);
                affx.a(clsArr, arrayList3);
                arrayList3.add(bux.class);
                affx.a(clsArr2, arrayList3);
                Class[] clsArr3 = (Class[]) arrayList3.toArray(new Class[arrayList3.size()]);
                int length2 = declaredMethods.length;
                int i2 = 0;
                loop2: while (true) {
                    if (i2 >= length2) {
                        method = null;
                        break;
                    }
                    method = declaredMethods[i2];
                    if (affa.f(str, method.getName()) || afyh.g(method.getName(), str.concat("-"), z)) {
                        Class<?>[] parameterTypes = method.getParameterTypes();
                        Class<?>[] clsArr4 = (Class[]) Arrays.copyOf(clsArr3, clsArr3.length);
                        int length3 = parameterTypes.length;
                        if (length3 == clsArr4.length) {
                            ArrayList arrayList4 = new ArrayList(length3);
                            ?? r14 = z;
                            for (?? r13 = r13; r13 < length3; r13++) {
                                Class<?> cls4 = parameterTypes[r13];
                                int i3 = r14 + 1;
                                Class<?> cls5 = clsArr4[r14];
                                boolean z2 = true;
                                if (!affa.f(affa.l(cls4), affa.l(cls5)) && !cls4.isAssignableFrom(cls5)) {
                                    z2 = false;
                                }
                                arrayList4.add(Boolean.valueOf(z2));
                                r14 = i3;
                            }
                            if (!arrayList4.isEmpty()) {
                                Iterator it2 = arrayList4.iterator();
                                while (it2.hasNext()) {
                                    if (!((Boolean) it2.next()).booleanValue()) {
                                        break;
                                    }
                                }
                                break loop2;
                            }
                            break;
                        }
                        continue;
                    }
                    i2++;
                    z = false;
                }
                if (method != null) {
                    return method;
                }
                throw new NoSuchMethodException(str.concat(" not found"));
            } catch (ReflectiveOperationException unused) {
                for (Method method2 : cls.getDeclaredMethods()) {
                    if (affa.f(method2.getName(), str) || afyh.g(method2.getName(), a.bK(str, "-"), false)) {
                        return method2;
                    }
                }
                return null;
            }
        } catch (ReflectiveOperationException unused2) {
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void d(java.lang.reflect.Method r10, java.lang.Object r11, defpackage.bux r12, java.lang.Object... r13) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dlb.d(java.lang.reflect.Method, java.lang.Object, bux, java.lang.Object[]):void");
    }
}
