package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final class ndh implements afeh {
    final /* synthetic */ boolean a;
    final /* synthetic */ afdr b;
    final /* synthetic */ asf c;
    final /* synthetic */ boolean d;
    final /* synthetic */ boolean e;
    final /* synthetic */ afeh f;
    final /* synthetic */ afdr g;
    final /* synthetic */ float h;
    final /* synthetic */ float i;
    final /* synthetic */ ndp j;
    final /* synthetic */ boolean k;
    final /* synthetic */ boolean l;
    final /* synthetic */ boolean m;
    final /* synthetic */ boolean n;
    final /* synthetic */ afdr o;
    final /* synthetic */ boolean p;
    final /* synthetic */ boolean q;
    final /* synthetic */ asf r;
    final /* synthetic */ bym s;
    final /* synthetic */ bym t;

    public ndh(boolean z, afdr afdrVar, asf asfVar, boolean z2, boolean z3, afeh afehVar, afdr afdrVar2, float f, float f2, ndp ndpVar, boolean z4, boolean z5, boolean z6, boolean z7, afdr afdrVar3, boolean z8, boolean z9, asf asfVar2, bym bymVar, bym bymVar2) {
        this.a = z;
        this.b = afdrVar;
        this.c = asfVar;
        this.d = z2;
        this.e = z3;
        this.f = afehVar;
        this.g = afdrVar2;
        this.h = f;
        this.i = f2;
        this.j = ndpVar;
        this.k = z4;
        this.l = z5;
        this.m = z6;
        this.n = z7;
        this.o = afdrVar3;
        this.p = z8;
        this.q = z9;
        this.r = asfVar2;
        this.s = bymVar;
        this.t = bymVar2;
    }

    @Override // defpackage.afeh
    public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        cfy cfyVarH;
        bux buxVar = (bux) obj2;
        int iIntValue = ((Number) obj3).intValue();
        boolean z = false;
        if (buxVar.I((iIntValue & 17) != 16, iIntValue & 1)) {
            ldy ldyVar = ldz.a;
            if (ldyVar.a().b() && this.a) {
                buxVar.v(-289308942);
                cfyVarH = asl.H(cfy.e, gjk.b.k);
                if (((Boolean) buxVar.f(mvy.a)).booleanValue()) {
                    cfyVarH = kfn.k(cfyVarH, null, buxVar, 1);
                }
                buxVar.o();
            } else {
                buxVar.v(-289159832);
                buxVar.o();
                cfyVarH = cfy.e;
            }
            Object objG = buxVar.g();
            Object obj4 = buw.a;
            if (objG == obj4) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(false, bxp.c);
                buxVar.x(parcelableSnapshotMutableState);
                objG = parcelableSnapshotMutableState;
            }
            bwq bwqVar = (bwq) objG;
            buxVar.v(-1533342121);
            Object objG2 = buxVar.g();
            if (objG2 == obj4) {
                objG2 = new hko(bwqVar, 18);
                buxVar.x(objG2);
            }
            cfy cfyVarL = bxc.l(cfyVarH, (afec) objG2);
            if (ldyVar.a().b() && this.b != null) {
                z = true;
            }
            asf asfVar = this.c;
            afdr afdrVar = this.b;
            if (z) {
                cfy cfyVarG = cjn.g(cfyVarL, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, kst.a.c, true, 0, 1042431);
                akg akgVar = (akg) buxVar.f(aki.a);
                boolean zC = buxVar.C(afdrVar);
                Object objG3 = buxVar.g();
                if (zC || objG3 == obj4) {
                    objG3 = new ahq(afdrVar, 20);
                    buxVar.x(objG3);
                }
                cfy cfyVarW = afp.w(cfyVarG, asfVar, akgVar, true, null, (afdr) objG3);
                String str = mwb.a;
                cfyVarL = das.d(cfyVarW, mwb.c);
            }
            buxVar.o();
            fww.L(cfyVarL, null, null, null, bxc.i(1758345962, true, new ndg(this.d, this.e, this.f, this.g, this.h, this.i, bwqVar, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t), buxVar), buxVar, 196608, 30);
        } else {
            buxVar.s();
        }
        return afak.a;
    }
}
