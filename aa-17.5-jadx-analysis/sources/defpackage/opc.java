package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class opc implements afei {
    final /* synthetic */ afec a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    final /* synthetic */ Object f;
    private final /* synthetic */ int g;

    public opc(List list, Set set, List list2, kwp kwpVar, afec afecVar, afec afecVar2, int i) {
        this.g = i;
        this.b = list;
        this.c = set;
        this.d = list2;
        this.f = kwpVar;
        this.e = afecVar;
        this.a = afecVar2;
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r3v12, types: [bym, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v1, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7, types: [bym, java.lang.Object] */
    @Override // defpackage.afei
    public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        if (this.g == 0) {
            bii biiVar = (bii) obj;
            int iIntValue = ((Number) obj2).intValue();
            bux buxVar = (bux) obj3;
            int iIntValue2 = ((Number) obj4).intValue();
            if ((iIntValue2 & 6) == 0) {
                i = iIntValue2 | (true == buxVar.C(biiVar) ? 4 : 2);
            } else {
                i = iIntValue2;
            }
            if ((iIntValue2 & 48) == 0) {
                i |= true != buxVar.A(iIntValue) ? 16 : 32;
            }
            if (buxVar.I((i & 147) != 146, i & 1)) {
                opm opmVar = (opm) this.b.get(iIntValue);
                buxVar.v(1139759568);
                String str = opmVar.a;
                boolean zContains = this.c.contains(str);
                ?? r3 = this.d;
                vy.a(asl.I(awd.r(cfy.e), gjk.d.k, BitmapDescriptorFactory.HUE_RED), r3.size() == 1 ? bcr.b(20.0f) : iIntValue == 0 ? bcr.c(28.0f, 28.0f, 4.0f, 4.0f) : iIntValue == r3.size() + (-1) ? bcr.c(4.0f, 4.0f, 28.0f, 28.0f) : bcr.b(4.0f), vs.c(czz.at(buxVar).D, 0L, buxVar, 14), vs.d(62), null, bxc.i(1147641767, true, new opb(opmVar, zContains, (kwp) this.f, this.e, str, this.a), buxVar), buxVar, 196608, 16);
                buxVar.o();
            } else {
                buxVar.s();
            }
            return afak.a;
        }
        Object obj5 = (bii) obj;
        int iIntValue3 = ((Number) obj2).intValue();
        bux buxVar2 = (bux) obj3;
        int iIntValue4 = ((Number) obj4).intValue();
        if ((iIntValue4 & 6) == 0) {
            i2 = (true != buxVar2.C(obj5) ? 2 : 4) | iIntValue4;
        } else {
            i2 = iIntValue4;
        }
        if ((iIntValue4 & 48) == 0) {
            i2 |= true != buxVar2.A(iIntValue3) ? 16 : 32;
        }
        if (buxVar2.I((i2 & 147) != 146, i2 & 1)) {
            oqb oqbVar = (oqb) this.e.get(iIntValue3);
            buxVar2.v(-1371131310);
            int i3 = oqbVar.a;
            int iIntValue5 = ((Number) this.b.a()).intValue();
            boolean z = i3 == iIntValue5;
            boolean zA = buxVar2.A(i3);
            Object objG = buxVar2.g();
            if (zA || objG == buw.a) {
                objG = new ParcelableSnapshotMutableFloatState(i3 == iIntValue5 ? 0.8f : 1.0f);
                buxVar2.x(objG);
            }
            byb bybVar = (byb) objG;
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zD = buxVar2.D(z) | buxVar2.C(bybVar);
            Object obj6 = this.c;
            boolean zE = zD | buxVar2.E(obj6);
            Object objG2 = buxVar2.g();
            if (zE || objG2 == buw.a) {
                Object farVar = new far(z, (oqc) obj6, bybVar, (afck) null, 9);
                buxVar2.x(farVar);
                objG2 = farVar;
            }
            bvq.g(boolValueOf, (afeg) objG2, buxVar2);
            Object objB = ady.b(bybVar.e(), new aft(0.5f, 1500.0f, null), null, null, buxVar2, 48, 28);
            oqbVar.getClass();
            int size = roc.ag(this.d).size();
            Object obj7 = this.f;
            boolean zE2 = buxVar2.E(obj6);
            Object objG3 = buxVar2.g();
            if (zE2 || objG3 == buw.a) {
                objG3 = new ezb(obj6, 12, (float[][]) null);
                buxVar2.x(objG3);
            }
            afeg afegVar = (afeg) objG3;
            boolean zE3 = buxVar2.E(obj6) | buxVar2.E(oqbVar);
            Object objG4 = buxVar2.g();
            if (zE3 || objG4 == buw.a) {
                objG4 = new ndw(oqbVar, 16);
                buxVar2.x(objG4);
            }
            afec afecVar = this.a;
            afdr afdrVar = (afdr) objG4;
            boolean zC = buxVar2.C(afecVar) | buxVar2.E(oqbVar);
            Object objG5 = buxVar2.g();
            if (zC || objG5 == buw.a) {
                objG5 = new nxf(afecVar, oqbVar, 4);
                buxVar2.x(objG5);
            }
            afdr afdrVar2 = (afdr) objG5;
            cfv cfvVar = cfy.e;
            boolean zC2 = buxVar2.C(objB);
            Object objG6 = buxVar2.g();
            if (zC2 || objG6 == buw.a) {
                objG6 = new nxj(objB, 2);
                buxVar2.x(objG6);
            }
            mlq.x(oqbVar, iIntValue3, size, (axr) obj7, afegVar, afdrVar, afdrVar2, cjn.f(cfvVar, (afec) objG6), buxVar2, (i2 & 112) | 8);
            buxVar2.o();
        } else {
            buxVar2.s();
        }
        return afak.a;
    }

    public opc(List list, oqc oqcVar, axr axrVar, afec afecVar, bym bymVar, bym bymVar2, int i) {
        this.g = i;
        this.e = list;
        this.c = oqcVar;
        this.f = axrVar;
        this.a = afecVar;
        this.b = bymVar;
        this.d = bymVar2;
    }
}
