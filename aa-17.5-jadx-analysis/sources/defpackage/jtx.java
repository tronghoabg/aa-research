package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class jtx {
    public static final void a(final fxu fxuVar, final cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1008985485);
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(fxuVar) : buxVarC.E(fxuVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            gfa gfaVar = fxuVar.a;
            gfk gfkVar = fxuVar.b;
            aezr aezrVar = ktf.a;
            jtk.d(gfaVar, gfkVar, kgq.h(buxVarC), fxuVar.e, fxuVar.f, false, bxc.i(1578169345, true, new afeh() { // from class: jtv
                /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.Map] */
                @Override // defpackage.afeh
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    asf asfVar;
                    kzt kztVar = (kzt) obj;
                    bux buxVar2 = (bux) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    kztVar.getClass();
                    int i4 = 2;
                    int i5 = 4;
                    boolean z = true;
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= true != ((iIntValue & 8) == 0 ? buxVar2.C(kztVar) : buxVar2.E(kztVar)) ? 2 : 4;
                    }
                    int i6 = 0;
                    if (buxVar2.I((iIntValue & 19) != 18, iIntValue & 1)) {
                        fxu fxuVar2 = fxuVar;
                        if (!fxuVar2.g && fxuVar2.c == null) {
                            z = false;
                        }
                        if (z) {
                            buxVar2.v(-1763857048);
                            Object objG = buxVar2.g();
                            if (objG == buw.a) {
                                objG = new asg();
                                buxVar2.x(objG);
                            }
                            asfVar = (asf) objG;
                            buxVar2.o();
                        } else {
                            buxVar2.v(-1763794645);
                            Object objG2 = buxVar2.g();
                            if (objG2 == buw.a) {
                                objG2 = new fvt();
                                buxVar2.x(objG2);
                            }
                            asfVar = (fvt) objG2;
                            buxVar2.o();
                        }
                        asf asfVar2 = asfVar;
                        cfy cfyVar2 = cfyVar;
                        Object obj4 = kztVar.d;
                        if (obj4 != null) {
                            deu deuVar = (deu) obj4;
                            if (deuVar.a() != 0) {
                                buxVar2.v(-1763691508);
                                Object obj5 = kztVar.b;
                                boolean z2 = fxuVar2.d;
                                ksy ksyVarF = jtk.f((fwf) buxVar2.f(fwg.a));
                                boolean zD = buxVar2.D(z);
                                Object objG3 = buxVar2.g();
                                if (zD || objG3 == buw.a) {
                                    objG3 = new jtp(z, 3);
                                    buxVar2.x(objG3);
                                }
                                cfy cfyVarE = gut.e(bxc.k(cfyVar2, (afec) objG3), fxuVar2);
                                Object obj6 = kztVar.a;
                                ?? r13 = kztVar.c;
                                boolean zE = buxVar2.E(fxuVar2);
                                Object objG4 = buxVar2.g();
                                if (zE || objG4 == buw.a) {
                                    objG4 = new jtw(fxuVar2, i6);
                                    buxVar2.x(objG4);
                                }
                                ksy ksyVar = ksy.a;
                                khc.m((cmw) obj5, deuVar, (afdr) objG4, cfyVarE, ksyVarF, z2, null, (ktf) obj6, null, asfVar2, null, r13, buxVar2, 8, 0, 5568);
                                buxVar2.o();
                                return afak.a;
                            }
                        }
                        buxVar2.v(-1763117791);
                        buxVar2.o();
                        Object obj7 = kztVar.b;
                        if (obj7 != null) {
                            buxVar2.v(-1763070950);
                            boolean z3 = fxuVar2.d;
                            ksy ksyVarF2 = jtk.f((fwf) buxVar2.f(fwg.a));
                            boolean zD2 = buxVar2.D(z);
                            Object objG5 = buxVar2.g();
                            if (zD2 || objG5 == buw.a) {
                                objG5 = new jtp(z, i5);
                                buxVar2.x(objG5);
                            }
                            cfy cfyVarE2 = gut.e(bxc.k(cfyVar2, (afec) objG5), fxuVar2);
                            Object obj8 = kztVar.a;
                            boolean zE2 = buxVar2.E(fxuVar2);
                            Object objG6 = buxVar2.g();
                            if (zE2 || objG6 == buw.a) {
                                objG6 = new jtw(fxuVar2, i4);
                                buxVar2.x(objG6);
                            }
                            ksy ksyVar2 = ksy.a;
                            khc.o((cmw) obj7, (afdr) objG6, cfyVarE2, ksyVarF2, z3, null, (ktf) obj8, null, asfVar2, null, buxVar2, 8, 0, 2784);
                            buxVar2.o();
                        } else {
                            buxVar2.v(-1762596991);
                            buxVar2.o();
                        }
                    } else {
                        buxVar2.s();
                    }
                    return afak.a;
                }
            }, buxVarC), buxVarC, 1572928, 32);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new jtt(fxuVar, cfyVar, i, 5);
        }
    }

    public static Context b(int i, Context context, boolean z) {
        if (i - 1 != 0) {
            return ksa.a.a().e(context, true != z ? R.style.ThemeOverlay_Gearhead_Coolwalk_Light : R.style.ThemeOverlay_Gearhead_Coolwalk_Dark);
        }
        return new ContextThemeWrapper(context, true != z ? R.style.ThemeOverlay_Template_Material_Neutral_Light : R.style.ThemeOverlay_Template_Material_Neutral_Dark);
    }

    public static kso c(int i, boolean z, bux buxVar) {
        kso ksoVarD;
        if (i - 1 == 0) {
            buxVar.v(-2080309497);
            kso ksoVarG = z ? ksp.g(jtu.b(hiu.a), null, -2) : ksp.i(jtu.b(hiu.a), null, -2);
            ((bvv) buxVar).Y(false);
            return ksoVarG;
        }
        buxVar.v(1514451919);
        if (z) {
            buxVar.v(-1594237912);
            ksoVarD = ksp.f(buxVar);
            ((bvv) buxVar).Y(false);
        } else {
            buxVar.v(-1594189273);
            ksoVarD = ksp.d(ksp.e(buxVar));
            ((bvv) buxVar).Y(false);
        }
        ((bvv) buxVar).Y(false);
        return ksoVarD;
    }

    public static kev d(Context context, int i, String str, String str2, String str3) {
        String str4;
        String string = context.getString(R.string.complete);
        int i2 = i - 1;
        if (i2 == 1) {
            str4 = context.getString(R.string.test_failed_text) + " " + str;
        } else if (i2 != 2) {
            str4 = context.getString(R.string.test_failed_preconditions_text) + " " + str;
            str3 = context.getString(R.string.please_fix);
        } else {
            str4 = context.getString(R.string.test_passed_text) + " " + str;
            str3 = string;
        }
        return new kev(str4, str2, str3, i);
    }

    public static final llu e(Context context, ComponentName componentName, llu lluVar) {
        return new llu(context, componentName, lluVar, new Bundle());
    }

    public static int[] f(double d, double d2) {
        return new int[]{(int) Math.round(d2 * 0.017453292519943295d * 1.708913188941079E8d), (int) Math.min(Math.max(Math.round(Math.log(Math.tan((d * 0.017453292519943295d * 0.5d) + 0.7853981633974483d)) * 1.708913188941079E8d), -2147483648L), 2147483647L)};
    }
}
