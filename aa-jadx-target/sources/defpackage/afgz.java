package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public class afgz {
    public afgz() {
    }

    public static java.lang.ClassCastException a(java.lang.ClassCastException classCastException) {
        defpackage.afga.g(classCastException, defpackage.afgz.class.getName());
        throw classCastException;
    }

    public static java.util.Set b(java.lang.Object obj) {
        if ((obj instanceof defpackage.afhc) && !(obj instanceof defpackage.afhh)) {
            c(obj, "kotlin.collections.MutableSet");
        }
        try {
            return (java.util.Set) obj;
        } catch (java.lang.ClassCastException e) {
            throw a(e);
        }
    }

    public static void c(java.lang.Object obj, java.lang.String str) {
        throw a(new java.lang.ClassCastException(defpackage.a.bI(str, obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ")));
    }

    public static boolean d(java.lang.Object obj, int i) {
        int arity;
        if (obj instanceof defpackage.afan) {
            if (obj instanceof defpackage.affw) {
                arity = ((defpackage.affw) obj).getArity();
            } else if (obj instanceof defpackage.afer) {
                arity = 0;
            } else if (obj instanceof defpackage.affc) {
                arity = 1;
            } else if (obj instanceof defpackage.affg) {
                arity = 2;
            } else if (obj instanceof defpackage.affh) {
                arity = 3;
            } else if (obj instanceof defpackage.affi) {
                arity = 4;
            } else if (obj instanceof defpackage.affj) {
                arity = 5;
            } else if (obj instanceof defpackage.affk) {
                arity = 6;
            } else if (obj instanceof defpackage.affl) {
                arity = 7;
            } else if (obj instanceof defpackage.affm) {
                arity = 8;
            } else if (obj instanceof defpackage.affn) {
                arity = 9;
            } else if (obj instanceof defpackage.afes) {
                arity = 10;
            } else if (obj instanceof defpackage.afet) {
                arity = 11;
            } else if (obj instanceof defpackage.afeu) {
                arity = 12;
            } else if (obj instanceof defpackage.afev) {
                arity = 13;
            } else if (obj instanceof defpackage.afew) {
                arity = 14;
            } else if (obj instanceof defpackage.afex) {
                arity = 15;
            } else if (obj instanceof defpackage.afey) {
                arity = 16;
            } else if (obj instanceof defpackage.afez) {
                arity = 17;
            } else if (obj instanceof defpackage.affa) {
                arity = 18;
            } else if (obj instanceof defpackage.affb) {
                arity = 19;
            } else if (obj instanceof defpackage.affd) {
                arity = 20;
            } else if (obj instanceof defpackage.affe) {
                arity = 21;
            } else {
                arity = obj instanceof defpackage.afff ? 22 : -1;
            }
            if (arity == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(java.lang.Object obj) {
        if (obj instanceof java.util.Map.Entry) {
            return !(obj instanceof defpackage.afhc) || (obj instanceof defpackage.afhf);
        }
        return false;
    }

    public static boolean f(java.lang.Object obj) {
        if (obj instanceof java.util.Set) {
            return !(obj instanceof defpackage.afhc) || (obj instanceof defpackage.afhh);
        }
        return false;
    }

    public static void g(java.lang.Object obj, int i) {
        if (obj == null || d(obj, i)) {
            return;
        }
        c(obj, defpackage.a.bo(i, "kotlin.jvm.functions.Function"));
    }

    public static void h(java.lang.Object obj) {
        if (!(obj instanceof defpackage.afhc) || (obj instanceof defpackage.afhd)) {
            return;
        }
        c(obj, "kotlin.collections.MutableCollection");
    }

    public static void i(java.lang.Object obj) {
        if (!(obj instanceof defpackage.afhc) || (obj instanceof defpackage.afhg)) {
            return;
        }
        c(obj, "kotlin.collections.MutableMap");
    }

    public static int j(double d) {
        if (java.lang.Double.isNaN(d)) {
            throw new java.lang.IllegalArgumentException("Cannot round NaN value.");
        }
        if (d > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) java.lang.Math.round(d);
    }

    public static int k(float f) {
        if (java.lang.Float.isNaN(f)) {
            throw new java.lang.IllegalArgumentException("Cannot round NaN value.");
        }
        return java.lang.Math.round(f);
    }

    public static long l(double d) {
        if (java.lang.Double.isNaN(d)) {
            throw new java.lang.IllegalArgumentException("Cannot round NaN value.");
        }
        return java.lang.Math.round(d);
    }

    public static long m(float f) {
        return defpackage.afhi.l(f);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aivh */
    public static java.lang.Object n(defpackage.afdk afdkVar) throws aivh {
        java.lang.Object obj;
        defpackage.afdo afdoVarGT = afdkVar.gT();
        s(afdoVarGT);
        ajda ajdaVarS = defpackage.afga.s(afdkVar);
        ajda ajdaVar = ajdaVarS instanceof ajda ? ajdaVarS : null;
        if (ajdaVar == null) {
            obj = defpackage.afbk.a;
        } else {
            aiut aiutVar = ajdaVar.a;
            try {
                if (aiutVar.dY(afdoVarGT)) {
                    ajdaVar.c(afdoVarGT, defpackage.afbk.a);
                } else {
                    aixr aixrVar = new aixr();
                    defpackage.afdo afdoVarPlus = afdoVarGT.plus(aixrVar);
                    defpackage.afbk afbkVar = defpackage.afbk.a;
                    ajdaVar.c(afdoVarPlus, afbkVar);
                    if (aixrVar.a) {
                        boolean z = aiuy.a;
                        java.lang.ThreadLocal threadLocal = aixi.a;
                        aivr aivrVarA = aixi.a();
                        if (aivrVarA.q()) {
                            obj = defpackage.afbk.a;
                        } else if (aivrVarA.p()) {
                            ajdaVar.c = afbkVar;
                            ajdaVar.e = 1;
                            aivrVarA.n(ajdaVar);
                            obj = defpackage.afdr.a;
                        } else {
                            aivrVarA.o(true);
                            try {
                                ajdaVar.run();
                                do {
                                } while (aivrVarA.r());
                            } catch (java.lang.Throwable th) {
                                try {
                                    ajdaVar.H(th);
                                } catch (java.lang.Throwable th2) {
                                    aivrVarA.m(true);
                                    throw th2;
                                }
                            }
                            aivrVarA.m(true);
                            obj = defpackage.afbk.a;
                        }
                    }
                }
                obj = defpackage.afdr.a;
            } catch (java.lang.Throwable th3) {
                throw new aivh(th3, aiutVar, afdoVarGT);
            }
        }
        defpackage.afdr afdrVar = defpackage.afdr.a;
        if (obj == afdrVar) {
            afdkVar.getClass();
        }
        return obj == afdrVar ? obj : defpackage.afbk.a;
    }

    public static java.lang.Object o(aiwg aiwgVar, defpackage.afdk afdkVar) {
        aiwgVar.s((java.util.concurrent.CancellationException) null);
        return aiwgVar.n(afdkVar);
    }

    public static aivn p(aiwg aiwgVar, boolean z, aiwj aiwjVar) {
        return aiwgVar instanceof aiwn ? ((aiwn) aiwgVar).G(z, aiwjVar) : aiwgVar.q(aiwjVar.c(), z, new nxo(aiwjVar, 2, (char[]) null));
    }

    public static aiwg q(defpackage.afdo afdoVar) {
        aiwg aiwgVar = afdoVar.get(aiwg.d);
        if (aiwgVar != null) {
            return aiwgVar;
        }
        java.util.Objects.toString(afdoVar);
        throw new java.lang.IllegalStateException("Current context doesn't contain Job in it: ".concat(java.lang.String.valueOf(afdoVar)));
    }

    public static void r(defpackage.afdo afdoVar, java.util.concurrent.CancellationException cancellationException) {
        aiwg aiwgVar = afdoVar.get(aiwg.d);
        if (aiwgVar != null) {
            aiwgVar.s(cancellationException);
        }
    }

    public static void s(defpackage.afdo afdoVar) {
        aiwg aiwgVar = afdoVar.get(aiwg.d);
        if (aiwgVar != null) {
            t(aiwgVar);
        }
    }

    public static void t(aiwg aiwgVar) {
        if (!aiwgVar.t()) {
            throw aiwgVar.o();
        }
    }

    public static boolean u(defpackage.afdo afdoVar) {
        aiwg aiwgVar = afdoVar.get(aiwg.d);
        if (aiwgVar != null) {
            return aiwgVar.t();
        }
        return true;
    }

    public static void v(aiwg aiwgVar, java.lang.String str) {
        aiwgVar.s(ahzq.a(str, (java.lang.Throwable) null));
    }

    public afgz(byte[] bArr) {
    }
}
