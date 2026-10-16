package defpackage;

import androidx.car.app.model.Alert;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class affz {
    public affz() {
    }

    public static ClassCastException a(ClassCastException classCastException) {
        affa.g(classCastException, affz.class.getName());
        throw classCastException;
    }

    public static Set b(Object obj) {
        if ((obj instanceof afgc) && !(obj instanceof afgh)) {
            c(obj, "kotlin.collections.MutableSet");
        }
        try {
            return (Set) obj;
        } catch (ClassCastException e) {
            throw a(e);
        }
    }

    public static void c(Object obj, String str) {
        throw a(new ClassCastException(a.bJ(str, obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ")));
    }

    public static boolean d(Object obj, int i) {
        if (obj instanceof aezn) {
            if ((obj instanceof afew ? ((afew) obj).getArity() : obj instanceof afdr ? 0 : obj instanceof afec ? 1 : obj instanceof afeg ? 2 : obj instanceof afeh ? 3 : obj instanceof afei ? 4 : obj instanceof afej ? 5 : obj instanceof afek ? 6 : obj instanceof afel ? 7 : obj instanceof afem ? 8 : obj instanceof afen ? 9 : obj instanceof afds ? 10 : obj instanceof afdt ? 11 : obj instanceof afdu ? 12 : obj instanceof afdv ? 13 : obj instanceof afdw ? 14 : obj instanceof afdx ? 15 : obj instanceof afdy ? 16 : obj instanceof afdz ? 17 : obj instanceof afea ? 18 : obj instanceof afeb ? 19 : obj instanceof afed ? 20 : obj instanceof afee ? 21 : obj instanceof afef ? 22 : -1) == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(Object obj) {
        if (obj instanceof Map.Entry) {
            return !(obj instanceof afgc) || (obj instanceof afgf);
        }
        return false;
    }

    public static boolean f(Object obj) {
        if (obj instanceof Set) {
            return !(obj instanceof afgc) || (obj instanceof afgh);
        }
        return false;
    }

    public static void g(Object obj, int i) {
        if (obj == null || d(obj, i)) {
            return;
        }
        c(obj, a.bp(i, "kotlin.jvm.functions.Function"));
    }

    public static void h(Object obj) {
        if (!(obj instanceof afgc) || (obj instanceof afgd)) {
            return;
        }
        c(obj, "kotlin.collections.MutableCollection");
    }

    public static void i(Object obj) {
        if (!(obj instanceof afgc) || (obj instanceof afgg)) {
            return;
        }
        c(obj, "kotlin.collections.MutableMap");
    }

    public static int j(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        if (d > 2.147483647E9d) {
            return Alert.DURATION_SHOW_INDEFINITELY;
        }
        if (d < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d);
    }

    public static int k(float f) {
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f);
    }

    public static long l(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d);
    }

    public static long m(float f) {
        return afgi.l(f);
    }

    public static /* synthetic */ String n(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "DROP_LATEST" : "DROP_OLDEST" : "SUSPEND";
    }

    public static Object o(afck afckVar) throws aiui {
        Object obj;
        afco afcoVarHH = afckVar.hH();
        affx.f(afcoVarHH);
        afck afckVarS = affa.s(afckVar);
        ajca ajcaVar = afckVarS instanceof ajca ? (ajca) afckVarS : null;
        if (ajcaVar == null) {
            obj = afak.a;
        } else {
            aitu aituVar = ajcaVar.a;
            try {
                if (aituVar.eQ(afcoVarHH)) {
                    ajcaVar.c(afcoVarHH, afak.a);
                } else {
                    aiws aiwsVar = new aiws();
                    afco afcoVarPlus = afcoVarHH.plus(aiwsVar);
                    afak afakVar = afak.a;
                    ajcaVar.c(afcoVarPlus, afakVar);
                    if (aiwsVar.a) {
                        boolean z = aitz.a;
                        ThreadLocal threadLocal = aiwj.a;
                        aius aiusVarA = aiwj.a();
                        if (aiusVarA.q()) {
                            obj = afak.a;
                        } else {
                            if (aiusVarA.p()) {
                                ajcaVar.c = afakVar;
                                ajcaVar.e = 1;
                                aiusVarA.n(ajcaVar);
                                obj = afcr.a;
                            } else {
                                aiusVarA.o(true);
                                try {
                                    ajcaVar.run();
                                    do {
                                    } while (aiusVarA.r());
                                } finally {
                                    try {
                                    } finally {
                                    }
                                }
                                obj = afak.a;
                            }
                        }
                    }
                }
                obj = afcr.a;
            } catch (Throwable th) {
                throw new aiui(th, aituVar, afcoVarHH);
            }
        }
        afcr afcrVar = afcr.a;
        if (obj == afcrVar) {
            afckVar.getClass();
        }
        return obj == afcrVar ? obj : afak.a;
    }

    public affz(byte[] bArr) {
    }
}
