package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes.dex */
public class affa {
    private affa() {
    }

    public static Object A(Object obj, Object obj2, Comparator comparator) {
        comparator.getClass();
        return comparator.compare(obj, obj2) <= 0 ? obj : obj2;
    }

    public static int B(int i) {
        if (i <= 0) {
            i = 1;
        }
        return Integer.highestOneBit(i * 3);
    }

    public static int b(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i != i2 ? 1 : 0;
    }

    public static int c(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j != j2 ? 1 : 0;
    }

    public static void d(String str) {
        afaj afajVar = new afaj(a.bq(str, "lateinit property ", " has not been initialized"));
        g(afajVar, affa.class.getName());
        throw afajVar;
    }

    public static boolean e(Float f, float f2) {
        return f != null && f.floatValue() == f2;
    }

    public static boolean f(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    static void g(Throwable th, String str) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (true == str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        th.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public static Class h(afhe afheVar) {
        afheVar.getClass();
        Class<?> jClass = ((afer) afheVar).getJClass();
        jClass.getClass();
        return jClass;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static Class i(afhe afheVar) {
        afheVar.getClass();
        Class<?> jClass = ((afer) afheVar).getJClass();
        if (!jClass.isPrimitive()) {
            jClass.getClass();
            return jClass;
        }
        String name = jClass.getName();
        if (name != null) {
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        jClass = Double.class;
                        break;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        jClass = Integer.class;
                        break;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        jClass = Byte.class;
                        break;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        jClass = Character.class;
                        break;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        jClass = Long.class;
                        break;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        jClass = Void.class;
                        break;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        jClass = Boolean.class;
                        break;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        jClass = Float.class;
                        break;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        jClass = Short.class;
                        break;
                    }
                    break;
            }
        }
        jClass.getClass();
        return jClass;
    }

    public static Class j(afhe afheVar) {
        afheVar.getClass();
        Class<?> jClass = ((afer) afheVar).getJClass();
        if (jClass.isPrimitive()) {
            jClass.getClass();
            return jClass;
        }
        String name = jClass.getName();
        if (name == null) {
            return null;
        }
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    public static afhe k(Annotation annotation) {
        annotation.getClass();
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        clsAnnotationType.getClass();
        afhe afheVarL = l(clsAnnotationType);
        afheVarL.getClass();
        return afheVarL;
    }

    public static afhe l(Class cls) {
        cls.getClass();
        return affw.a.getOrCreateKotlinClass(cls);
    }

    public static void m(AutoCloseable autoCloseable, Throwable th) throws Exception {
        if (th == null) {
            autoCloseable.close();
            return;
        }
        try {
            autoCloseable.close();
        } catch (Throwable th2) {
            adqs.y(th, th2);
        }
    }

    public static void n(Closeable closeable, Throwable th) throws IOException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                adqs.y(th, th2);
            }
        }
    }

    public static int o(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i >= i2) {
                return i2;
            }
            int i4 = i2 % i3;
            if (i4 < 0) {
                i4 += i3;
            }
            int i5 = i % i3;
            if (i5 < 0) {
                i5 += i3;
            }
            int i6 = (i4 - i5) % i3;
            if (i6 < 0) {
                i6 += i3;
            }
            return i2 - i6;
        }
        if (i3 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        }
        if (i <= i2) {
            return i2;
        }
        int i7 = -i3;
        int i8 = i % i7;
        if (i8 < 0) {
            i8 += i7;
        }
        int i9 = i2 % i7;
        if (i9 < 0) {
            i9 += i7;
        }
        int i10 = (i8 - i9) % i7;
        if (i10 < 0) {
            i10 += i7;
        }
        return i2 + i10;
    }

    public static afdf p(Enum[] enumArr) {
        enumArr.getClass();
        return new afdg(enumArr);
    }

    public static Object q(afeg afegVar, Object obj, afck afckVar) {
        afegVar.getClass();
        afco afcoVarHH = afckVar.hH();
        afck afcwVar = afcoVarHH == afcp.a ? new afcw(afckVar) : new afcx(afckVar, afcoVarHH);
        affz.g(afegVar, 2);
        return afegVar.invoke(obj, afcwVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static afck r(afeg afegVar, Object obj, afck afckVar) {
        afegVar.getClass();
        if (afegVar instanceof afcy) {
            return ((afcy) afegVar).b(obj, afckVar);
        }
        afco afcoVarHH = afckVar.hH();
        return afcoVarHH == afcp.a ? new afcu(afckVar, afegVar, obj) : new afcv(afckVar, afcoVarHH, afegVar, obj);
    }

    public static afck s(afck afckVar) {
        afckVar.getClass();
        afda afdaVar = afckVar instanceof afda ? (afda) afckVar : null;
        if (afdaVar != null && (afckVar = afdaVar.r) == null) {
            afcl afclVar = (afcl) afdaVar.hH().get(afcl.k);
            afckVar = afclVar != null ? afclVar.hx(afdaVar) : afdaVar;
            afdaVar.r = afckVar;
        }
        return afckVar;
    }

    public static afcm t(afcm afcmVar, afcn afcnVar) {
        afcnVar.getClass();
        if (f(afcmVar.getKey(), afcnVar)) {
            return afcmVar;
        }
        return null;
    }

    public static afco u(afcm afcmVar, afcn afcnVar) {
        afcnVar.getClass();
        return f(afcmVar.getKey(), afcnVar) ? afcp.a : afcmVar;
    }

    public static afco v(afcm afcmVar, afco afcoVar) {
        afcoVar.getClass();
        return w(afcmVar, afcoVar);
    }

    public static afco w(afco afcoVar, afco afcoVar2) {
        afcoVar2.getClass();
        return afcoVar2 == afcp.a ? afcoVar : (afco) afcoVar2.fold(afcoVar, new nno(11));
    }

    public static int x(Comparable comparable, Comparable comparable2) {
        if (comparable == null) {
            return comparable2 == null ? 0 : -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static Comparable y(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2) >= 0 ? comparable : comparable2;
    }

    public static Comparable z(Comparable comparable, Comparable comparable2) {
        comparable.getClass();
        return comparable.compareTo(comparable2) <= 0 ? comparable : comparable2;
    }
}
