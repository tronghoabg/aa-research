package defpackage;

import com.google.android.gms.car.control.CarAction;

/* loaded from: classes2.dex */
public final class jun {
    public static final void a(gdc gdcVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-2074984813);
        if (i3 == 0) {
            i2 = i | (true != buxVarC.E(gdcVar) ? 2 : 4);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            Object obj = buw.a;
            if (objS == obj) {
                afdr afdrVar = gdcVar.d;
                afdr afdrVar2 = gdcVar.b;
                afdr afdrVar3 = gdcVar.c;
                git gitVar = new git(afdrVar, afdrVar2, afdrVar3, afdrVar3);
                bvvVar.ad(gitVar);
                objS = gitVar;
            }
            git gitVar2 = (git) objS;
            gitVar2.b(new Object[0], buxVarC);
            gitVar2.a(gdcVar.d);
            gitVar2.b = gdcVar.b;
            afdr afdrVar4 = gdcVar.c;
            gitVar2.c = afdrVar4;
            gitVar2.d = afdrVar4;
            long jI = cjn.i(0);
            bcm bcmVarB = bcr.b(8.0f);
            aezr aezrVar = ktf.a;
            ktf ktfVarJ = kgq.j(jI, 0L, 0L, 0L, buxVarC, 254);
            Object objS2 = bvvVar.S();
            if (objS2 == obj) {
                objS2 = new grl(12);
                bvvVar.ad(objS2);
            }
            khc.j((afdr) objS2, cfyVar, null, false, false, bcmVarB, null, ktfVarJ, null, null, null, gitVar2.e, false, bxc.i(1865391019, true, new jjb(gdcVar, 2), buxVarC), buxVarC, (i2 & 112) | 6, 24576, 14172);
            buxVarC = buxVarC;
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new jtt(gdcVar, cfyVar, i, 11);
        }
    }

    public static final String b(CarAction carAction) {
        carAction.getClass();
        int i = carAction.a;
        return i != 1 ? i != 2 ? i != 3 ? a.bp(i, "Car action id: ") : "Launch Control Center" : "Launch Car Media" : "Launch HVAC";
    }

    public static final String c(int i, int i2) {
        if (!a.Y(i, 356517121)) {
            return a.Y(i, 289408270) ? i2 != 48 ? i2 != 49 ? a.bp(i2, "Unknown: ") : "Fahrenheit" : "Celsius" : String.valueOf(i2);
        }
        switch (i2) {
        }
        return a.bp(i2, "Unknown: ");
    }

    public static final eqj d(eqj eqjVar, afec afecVar) {
        eqjVar.getClass();
        return eqy.b(eqjVar, new kaa(afecVar, 15));
    }

    public static final eqj e(eqj eqjVar) {
        eqjVar.getClass();
        return eqy.b(eqjVar, new kki(0));
    }
}
