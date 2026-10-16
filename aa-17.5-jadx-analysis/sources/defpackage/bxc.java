package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* loaded from: classes.dex */
public final class bxc {
    public static final void a(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void b(String str) {
        throw new IllegalStateException(str);
    }

    public static final void c(bzj bzjVar, List list, bxg bxgVar) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int iA = bzjVar.a((bzb) list.get(i));
            int iM = bzjVar.m(bzjVar.b, bzjVar.g(iA));
            Object obj = iM < bzjVar.c(bzjVar.b, bzjVar.g(iA + 1)) ? bzjVar.c[bzjVar.d(iM)] : buw.a;
            bxf bxfVar = obj instanceof bxf ? (bxf) obj : null;
            if (bxfVar != null) {
                bxfVar.a = bxgVar;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(bxc bxcVar) {
        ajab ajabVar;
        cck cckVar;
        cck cckVar2;
        do {
            ajabVar = bxn.k;
            cckVar = (cck) ajabVar.b();
            cbu cbuVarB = cckVar.d;
            bii biiVar = (bii) cbuVarB.get(bxcVar);
            if (biiVar == null) {
                cckVar2 = cckVar;
            } else {
                cce cceVar = cbuVarB.b;
                cce cceVarJ = cceVar.j(bxcVar != null ? bxcVar.hashCode() : 0, bxcVar, 0);
                if (cceVar != cceVarJ) {
                    cbuVarB = cceVarJ == null ? cbu.a : new cbu(cceVarJ, cbuVarB.a() - 1);
                }
                if (biiVar.d()) {
                    Object obj = biiVar.a;
                    V v = cbuVarB.get(obj);
                    v.getClass();
                    cbuVarB = cbuVarB.b(obj, ((bii) v).e(biiVar.b));
                }
                if (biiVar.c()) {
                    Object obj2 = biiVar.b;
                    V v2 = cbuVarB.get(obj2);
                    v2.getClass();
                    cbuVarB = cbuVarB.b(obj2, new bii(biiVar.a, ((bii) v2).b));
                }
                cckVar2 = new cck(!biiVar.d() ? biiVar.b : cckVar.b, !biiVar.c() ? biiVar.a : cckVar.c, cbuVarB);
            }
            if (cckVar == cckVar2) {
                return;
            }
        } while (!ajabVar.e(cckVar, cckVar2));
    }

    public static final bym e(eqj eqjVar, bux buxVar) {
        return f(eqjVar, eqjVar.e(), buxVar);
    }

    public static final bym f(eqj eqjVar, Object obj, bux buxVar) {
        eqa eqaVar = (eqa) buxVar.f(erz.a);
        Object objG = buxVar.g();
        Object obj2 = buw.a;
        if (objG == obj2) {
            if (eqjVar.o()) {
                obj = eqjVar.e();
            }
            Object parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(obj, bxp.c);
            buxVar.x(parcelableSnapshotMutableState);
            objG = parcelableSnapshotMutableState;
        }
        bwq bwqVar = (bwq) objG;
        boolean zE = buxVar.E(eqjVar) | buxVar.E(eqaVar);
        Object objG2 = buxVar.g();
        if (zE || objG2 == obj2) {
            objG2 = new acg(eqjVar, eqaVar, bwqVar, 12);
            buxVar.x(objG2);
        }
        bvq.b(eqjVar, eqaVar, (afec) objG2, buxVar);
        return bwqVar;
    }

    public static final void g(bux buxVar, afeg afegVar) {
        affz.g(afegVar, 2);
        afegVar.invoke(buxVar, 1);
    }

    public static final boolean h(bxf bxfVar, bxf bxfVar2) {
        return bxfVar == null || !bxfVar.o() || affa.f(bxfVar, bxfVar2) || affa.f(bxfVar.e, bxfVar2.e);
    }

    public static final cct i(int i, boolean z, Object obj, bux buxVar) {
        Object objG = buxVar.g();
        if (objG == buw.a) {
            objG = new cct(i, z, obj);
            buxVar.x(objG);
        }
        cct cctVar = (cct) objG;
        if (!affa.f(cctVar.b, obj)) {
            Object obj2 = cctVar.b;
            cctVar.b = obj;
            if (obj2 != null && cctVar.a) {
                bxf bxfVar = cctVar.d;
                if (bxfVar != null) {
                    bxfVar.a();
                    cctVar.d = null;
                }
                List list = cctVar.c;
                if (list != null) {
                    int size = list.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((bxf) list.get(i2)).a();
                    }
                    list.clear();
                }
            }
        }
        return cctVar;
    }

    public static final cfy j(cfy cfyVar, cil cilVar) {
        return cfyVar.a(new cim(cilVar));
    }

    public static final cfy k(cfy cfyVar, afec afecVar) {
        return cfyVar.a(new cif(new cih(afecVar)));
    }

    public static final cfy l(cfy cfyVar, afec afecVar) {
        return cfyVar.a(new chp(afecVar));
    }

    public static /* synthetic */ cfy m(cfy cfyVar, float f, ckv ckvVar) {
        int iA = dlj.a(f, BitmapDescriptorFactory.HUE_RED);
        int iA2 = dlj.a(f, BitmapDescriptorFactory.HUE_RED);
        boolean z = true;
        boolean z2 = iA > 0;
        if (iA2 > 0) {
            z = z2;
        } else if (!z2) {
            return cfyVar;
        }
        return cfyVar.a(new chl(f, ckvVar, z));
    }

    public static final cfy n(cfy cfyVar, float f, float f2) {
        return (f == 1.0f && f2 == 1.0f) ? cfyVar : cjn.g(cfyVar, f, f2, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, false, 0, 1048572);
    }

    public static /* synthetic */ cfy o(cfy cfyVar, cmw cmwVar, cfn cfnVar, csi csiVar, float f, cjw cjwVar, int i) {
        if ((i & 4) != 0) {
            cfnVar = cfl.e;
        }
        cfn cfnVar2 = cfnVar;
        if ((i & 8) != 0) {
            csiVar = csh.e;
        }
        csi csiVar2 = csiVar;
        boolean z = (i & 2) != 0;
        if ((i & 16) != 0) {
            f = 1.0f;
        }
        return cfyVar.a(new chi(cmwVar, z, cfnVar2, csiVar2, f, cjwVar));
    }

    public static final cfy p(cfy cfyVar, afec afecVar) {
        return cfyVar.a(new chb(afecVar));
    }

    public static final cfy q(cfy cfyVar, afec afecVar) {
        return cfyVar.a(new che(afecVar));
    }

    public static final cfy r(cfy cfyVar, afec afecVar) {
        return cfyVar.a(new chf(afecVar));
    }

    public static final cgy s(afec afecVar) {
        return new cgy(new cgz(), afecVar);
    }

    public static final cfy t(cfy cfyVar, float f) {
        return f == 1.0f ? cfyVar : cjn.g(cfyVar, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, null, true, 0, 1044475);
    }
}
