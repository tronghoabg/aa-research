package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class ggh {
    public static final bvf a = new byo(new fwp(13));

    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r18v4 */
    public static final cfy a(cfy cfyVar, ckv ckvVar, long j, long j2, ggi ggiVar, ggi ggiVar2, ase aseVar, boolean z, boolean z2, bux buxVar, int i, int i2) {
        long jI;
        ggi ggiVar3;
        ?? r18;
        bym bymVarI;
        float f;
        boolean z3;
        cfyVar.getClass();
        ckvVar.getClass();
        long jA = (i2 & 2) != 0 ? ((ggg) buxVar.f(a)).a(buxVar) : j;
        if ((i2 & 4) != 0) {
            buxVar.v(-865240942);
            buxVar.o();
            jI = cjn.i(0);
        } else {
            jI = j2;
        }
        ggi ggiVarB = (i2 & 8) != 0 ? ((ggg) buxVar.f(a)).b(buxVar) : ggiVar;
        if ((i2 & 16) != 0) {
            buxVar.v(-1348512636);
            float f2 = (gux.g(buxVar).f.c - 1.0f) + BitmapDescriptorFactory.HUE_RED;
            ggiVar3 = new ggi(f2, f2, f2);
            buxVar.o();
        } else {
            ggiVar3 = ggiVar2;
        }
        bym bymVarJ = null;
        ase aseVar2 = (i2 & 32) != 0 ? null : aseVar;
        boolean z4 = ((i2 & 64) == 0) & z;
        boolean z5 = ((i2 & 128) == 0) & z2;
        if (aseVar2 == null) {
            buxVar.v(692733930);
            buxVar.o();
            r18 = 0;
            bymVarI = null;
        } else {
            r18 = 0;
            buxVar.v(-808937737);
            bymVarI = asl.i(aseVar2, buxVar, (i >> 18) & 14);
            buxVar.o();
        }
        if (bymVarI == null) {
            buxVar.v(692762978);
            Object objG = buxVar.g();
            if (objG == buw.a) {
                f = 0.0f;
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(Boolean.valueOf((boolean) r18), bxp.c);
                buxVar.x(parcelableSnapshotMutableState);
                objG = parcelableSnapshotMutableState;
            } else {
                f = 0.0f;
            }
            bymVarI = (bwq) objG;
        } else {
            f = 0.0f;
            buxVar.v(-808938288);
        }
        buxVar.o();
        if (aseVar2 == null) {
            buxVar.v(692858922);
        } else {
            buxVar.v(-808933705);
            bymVarJ = asl.j(aseVar2, buxVar, (i >> 18) & 14);
        }
        buxVar.o();
        if (bymVarJ == null) {
            buxVar.v(692887970);
            Object objG2 = buxVar.g();
            if (objG2 == buw.a) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = new ParcelableSnapshotMutableState(Boolean.valueOf((boolean) r18), bxp.c);
                buxVar.x(parcelableSnapshotMutableState2);
                objG2 = parcelableSnapshotMutableState2;
            }
            bymVarJ = (bwq) objG2;
        } else {
            buxVar.v(-808934256);
        }
        buxVar.o();
        Object objG3 = buxVar.g();
        Object obj = buw.a;
        if (objG3 == obj) {
            z3 = z5;
            ParcelableSnapshotMutableState parcelableSnapshotMutableState3 = new ParcelableSnapshotMutableState(Boolean.valueOf((boolean) r18), bxp.c);
            buxVar.x(parcelableSnapshotMutableState3);
            objG3 = parcelableSnapshotMutableState3;
        } else {
            z3 = z5;
        }
        bwq bwqVar = (bwq) objG3;
        int iO = ((kwp) buxVar.f(dbc.h)).o();
        Object objG4 = buxVar.g();
        if (objG4 == obj) {
            objG4 = new fzl(bwqVar, 7);
            buxVar.x(objG4);
        }
        cfy cfyVarL = bxc.l(cfyVar, (afec) objG4);
        boolean zBooleanValue = ((Boolean) bymVarI.a()).booleanValue();
        boolean z6 = (a.Y(iO, 2) && (aseVar2 != null ? ((Boolean) bymVarJ.a()).booleanValue() : ((Boolean) bwqVar.a()).booleanValue())) ? true : r18;
        if (!z6) {
            jA = cjn.i(r18);
        }
        if (!z6) {
            jI = cjn.i(r18);
        }
        float f3 = !z6 ? f : zBooleanValue ? ggiVarB.b : ggiVarB.a;
        float f4 = !z6 ? f : zBooleanValue ? ggiVar3.b : ggiVar3.a;
        float f5 = (cjv.a(jI) == f ? f : f4) + f3 + f;
        if (z3) {
            cfyVarL = ebj.m(cfyVarL, f5);
        }
        cfy cfyVarD = afp.D(afp.D(cfyVarL, f3, jA, ckvVar), f3 + f4 + f, jI, ckvVar);
        if (z4) {
            cfyVarD = cjn.g(cfyVarD, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, ckvVar, true, 0, 1042431);
        }
        return z3 ? asl.H(cfyVarD, f5) : cfyVarD;
    }
}
