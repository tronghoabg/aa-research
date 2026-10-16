package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class vh {
    public static cng a;

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public static final void a(Throwable th, afdr afdrVar) {
        List listCD;
        Object objInvoke;
        th.getClass();
        cfh cfhVar = null;
        if (afdk.a()) {
            Throwable[] suppressed = th.getSuppressed();
            suppressed.getClass();
            listCD = woy.cD(suppressed);
        } else {
            Method method = afdi.b;
            listCD = (method == null || (objInvoke = method.invoke(th, null)) == null) ? afbe.a : woy.cD((Throwable[]) objInvoke);
        }
        int size = listCD.size();
        for (int i = 0; i < size; i++) {
            if (((Throwable) listCD.get(i)) instanceof cfh) {
                return;
            }
        }
        try {
            admq admqVar = (admq) afdrVar.invoke();
            if (admqVar != null) {
                if (admqVar.a) {
                    ?? r7 = admqVar.b;
                    int size2 = r7.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        vq vqVar = ((cfc) r7.get(i2)).c;
                    }
                } else if (!admqVar.b.isEmpty()) {
                    admqVar.getClass();
                    cfhVar = new cfh(admqVar);
                }
            }
        } catch (Throwable th2) {
            cfhVar = th2;
        }
        if (cfhVar != null) {
            adqs.y(th, cfhVar);
        }
    }

    public static final Integer b(bzf bzfVar, bvb bvbVar, int i, int i2) {
        Integer numB;
        while (true) {
            if (i >= i2) {
                return null;
            }
            int iC = bzfVar.c(i) + i;
            if (bzfVar.y(i) && bzfVar.b(i) == 206 && affa.f(bzfVar.m(i), buz.f)) {
                Object objL = bzfVar.l(i, 0);
                bxr bxrVar = objL instanceof bxr ? (bxr) objL : null;
                Object objA = bxrVar != null ? bxrVar.a() : null;
                bvt bvtVar = objA instanceof bvt ? (bvt) objA : null;
                if (bvtVar != null && affa.f(bvtVar.a, bvbVar)) {
                    return Integer.valueOf(i);
                }
            }
            if (bzfVar.w(i) && (numB = b(bzfVar, bvbVar, i + 1, iC)) != null) {
                return Integer.valueOf(numB.intValue());
            }
            i = iC;
        }
    }

    public static final List c(bzf bzfVar, int i, Object obj) {
        ArrayList arrayList = new ArrayList();
        int iE = bzfVar.e(i);
        bzb bzbVarG = bzfVar.g(i);
        while (i >= 0) {
            cdj.c(bzfVar.b(i), bzfVar.z(i) ? bzfVar.m(i) : buw.a, bzfVar.a.j(i), obj, arrayList);
            if (iE >= 0) {
                bzb bzbVar = bzbVarG;
                bzbVarG = bzfVar.g(iE);
                i = iE;
                iE = bzfVar.e(iE);
                obj = bzbVar;
            } else {
                i = iE;
                obj = bzbVarG;
            }
        }
        return arrayList;
    }

    public static final List d(bzj bzjVar, int i, Integer num) {
        int iK;
        int iH;
        aag aagVar;
        if (bzjVar.r || bzjVar.f() == 0) {
            return afbe.a;
        }
        ArrayList arrayList = new ArrayList();
        if (num != null) {
            iK = num.intValue();
        } else {
            iK = bzjVar.q;
            if (iK < 0) {
                iK = bzjVar.k(i);
            }
        }
        int iN = bzjVar.h - bzjVar.n(i);
        zh zhVar = bzjVar.t;
        int i2 = 0;
        if (zhVar != null && (aagVar = (aag) zhVar.a(i)) != null) {
            i2 = aagVar.b;
        }
        Object objValueOf = Integer.valueOf(iN + i2);
        if (bzjVar.g(i) * 5 < bzjVar.b.length) {
            iH = bzjVar.h(i);
        } else {
            int iK2 = iK >= 0 ? bzjVar.k(iK) : iK;
            iH = bzjVar.h(iK);
            int i3 = iK;
            iK = iK2;
            i = i3;
        }
        while (i >= 0) {
            cdj.c(iH, (bzjVar.b[(bzjVar.g(i) * 5) + 1] & 536870912) != 0 ? bzjVar.r(i) : buw.a, bzjVar.Y(i), objValueOf, arrayList);
            objValueOf = bzjVar.o(i);
            if (iK >= 0) {
                int iK3 = bzjVar.k(iK);
                iH = bzjVar.h(iK);
                int i4 = iK;
                iK = iK3;
                i = i4;
            } else {
                i = iK;
            }
        }
        return arrayList;
    }

    public static final cjj e(Resources resources, int i) throws Resources.NotFoundException {
        Drawable drawable = resources.getDrawable(i, null);
        drawable.getClass();
        return new cjj(((BitmapDrawable) drawable).getBitmap());
    }

    public static final Object f(cwd cwdVar, afdr afdrVar, afck afckVar) {
        Object obj;
        cst cstVarO;
        Object objD;
        cxx cxxVar;
        if (cwdVar.M().A) {
            if (!cwdVar.M().A) {
                crt.c("visitAncestors called on an unattached node");
            }
            cfx cfxVar = cwdVar.M().t;
            cxb cxbVarQ = bzi.q(cwdVar);
            loop0: while (true) {
                obj = null;
                if (cxbVarQ == null) {
                    break;
                }
                if ((cxbVarQ.v.f.s & 524288) != 0) {
                    while (cfxVar != null) {
                        if ((cfxVar.r & 524288) != 0) {
                            cfx cfxVarN = cfxVar;
                            byw bywVar = null;
                            while (cfxVarN != null) {
                                if (cfxVarN instanceof dcs) {
                                    obj = cfxVarN;
                                    break loop0;
                                }
                                if ((cfxVarN.r & 524288) != 0 && (cfxVarN instanceof cwe)) {
                                    int i = 0;
                                    for (cfx cfxVar2 = ((cwe) cfxVarN).C; cfxVar2 != null; cfxVar2 = cfxVar2.u) {
                                        if ((cfxVar2.r & 524288) != 0) {
                                            i++;
                                            if (i == 1) {
                                                cfxVarN = cfxVar2;
                                            } else {
                                                if (bywVar == null) {
                                                    bywVar = new byw(new cfx[16]);
                                                }
                                                if (cfxVarN != null) {
                                                    bywVar.n(cfxVarN);
                                                }
                                                bywVar.n(cfxVar2);
                                                cfxVarN = null;
                                            }
                                        }
                                    }
                                    if (i != 1) {
                                    }
                                }
                                cfxVarN = bzi.n(bywVar);
                            }
                        }
                        cfxVar = cfxVar.t;
                    }
                }
                cxbVarQ = cxbVarQ.l();
                cfxVar = (cxbVarQ == null || (cxxVar = cxbVarQ.v) == null) ? null : cxxVar.e;
            }
            dcs dcsVar = (dcs) obj;
            if (dcsVar != null && (objD = dcsVar.d((cstVarO = bzi.o(cwdVar)), new bsh(afdrVar, cstVarO, 9), afckVar)) == afcr.a) {
                return objD;
            }
        }
        return afak.a;
    }

    public static final boolean g(List list) {
        List list2;
        long j;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() <= 1) {
            list2 = afbe.a;
        } else {
            ArrayList arrayList = new ArrayList();
            Object obj = list.get(0);
            int size = list.size() - 1;
            int i = 0;
            while (i < size) {
                i++;
                Object obj2 = list.get(i);
                ddu dduVar = (ddu) obj2;
                ddu dduVar2 = (ddu) obj;
                arrayList.add(new cja((Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (dduVar2.b().a() >> 32)) - Float.intBitsToFloat((int) (dduVar.b().a() >> 32)))) << 32) | (Float.floatToRawIntBits(Math.abs(Float.intBitsToFloat((int) (dduVar2.b().a() & 4294967295L)) - Float.intBitsToFloat((int) (dduVar.b().a() & 4294967295L)))) & 4294967295L)));
                obj = obj2;
            }
            list2 = arrayList;
        }
        if (list2.size() == 1) {
            j = ((cja) woy.bF(list2)).a;
        } else {
            if (list2.isEmpty()) {
                dlz.b("Empty collection can't be reduced.");
            }
            Object objBF = woy.bF(list2);
            int size2 = list2.size() - 1;
            if (size2 > 0) {
                int i2 = 1;
                while (true) {
                    objBF = new cja(a.ai(((cja) objBF).a, ((cja) list2.get(i2)).a));
                    if (i2 == size2) {
                        break;
                    }
                    i2++;
                }
            }
            j = ((cja) objBF).a;
        }
        return Float.intBitsToFloat((int) (4294967295L & j)) < Float.intBitsToFloat((int) (j >> 32));
    }

    public static final boolean h(ddu dduVar) {
        return (dduVar.g().g(ddx.f) == null && dduVar.g().g(ddx.e) == null) ? false : true;
    }

    public static final boolean i(float f, float f2, long j, float f3, float f4) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float f5 = f2 - f4;
        float f6 = f - f3;
        return ((f6 * f6) / (fIntBitsToFloat * fIntBitsToFloat)) + ((f5 * f5) / (fIntBitsToFloat2 * fIntBitsToFloat2)) <= 1.0f;
    }

    public static final boolean j(cjm cjmVar, float f, float f2) {
        cjb cjbVar = new cjb(f - 0.005f, (-0.005f) + f2, f + 0.005f, f2 + 0.005f);
        cjm cjmVar2 = new cjm((byte[]) null);
        cjmVar2.p(cjbVar);
        cjm cjmVar3 = new cjm((byte[]) null);
        cjmVar3.n(cjmVar, cjmVar2, 1);
        boolean zIsEmpty = cjmVar3.a.isEmpty();
        cjmVar3.j();
        cjmVar2.j();
        return !zIsEmpty;
    }
}
