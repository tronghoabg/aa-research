package defpackage;

import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class ndu implements afeh {
    final /* synthetic */ boolean a;
    final /* synthetic */ float b;
    final /* synthetic */ float c;
    final /* synthetic */ erm d;
    final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public ndu(boolean z, float f, float f2, nea neaVar, Pattern pattern, int i) {
        this.f = i;
        this.a = z;
        this.b = f;
        this.c = f2;
        this.d = neaVar;
        this.e = pattern;
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [afdr, java.lang.Object] */
    @Override // defpackage.afeh
    public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        cfy cfyVarH;
        cfy cfyVarH2;
        if (this.f != 0) {
            bux buxVar = (bux) obj2;
            int iIntValue = ((Number) obj3).intValue();
            if (buxVar.I((iIntValue & 17) != 16, iIntValue & 1)) {
                ldy ldyVar = ldz.a;
                if (ldyVar.a().b()) {
                    buxVar.v(-289308942);
                    cfyVarH2 = asl.H(cfy.e, gjk.b.k);
                    if (((Boolean) buxVar.f(mvy.a)).booleanValue()) {
                        cfyVarH2 = kfn.k(cfyVarH2, null, buxVar, 1);
                    }
                    buxVar.o();
                } else {
                    buxVar.v(-289159832);
                    buxVar.o();
                    cfyVarH2 = cfy.e;
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
                    objG2 = new hko(bwqVar, 15);
                    buxVar.x(objG2);
                }
                cfy cfyVarL = bxc.l(cfyVarH2, (afec) objG2);
                ldyVar.a().b();
                buxVar.o();
                fww.L(cfyVarL, null, null, null, bxc.i(1758345962, true, new nby(this.a, this.e, this.b, this.c, bwqVar, (ncr) this.d), buxVar), buxVar, 196608, 30);
            } else {
                buxVar.s();
            }
            return afak.a;
        }
        bux buxVar2 = (bux) obj2;
        int iIntValue2 = ((Number) obj3).intValue();
        int i = iIntValue2 & 17;
        if (buxVar2.I(i != 16, iIntValue2 & 1)) {
            ldy ldyVar2 = ldz.a;
            if (ldyVar2.a().b()) {
                buxVar2.v(-289308942);
                cfyVarH = asl.H(cfy.e, gjk.b.k);
                if (((Boolean) buxVar2.f(mvy.a)).booleanValue()) {
                    cfyVarH = kfn.k(cfyVarH, null, buxVar2, 1);
                }
                buxVar2.o();
            } else {
                buxVar2.v(-289159832);
                buxVar2.o();
                cfyVarH = cfy.e;
            }
            Object objG3 = buxVar2.g();
            Object obj5 = buw.a;
            if (objG3 == obj5) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState2 = new ParcelableSnapshotMutableState(false, bxp.c);
                buxVar2.x(parcelableSnapshotMutableState2);
                objG3 = parcelableSnapshotMutableState2;
            }
            bwq bwqVar2 = (bwq) objG3;
            buxVar2.v(-1533342121);
            Object objG4 = buxVar2.g();
            if (objG4 == obj5) {
                objG4 = new ndr(bwqVar2, 1);
                buxVar2.x(objG4);
            }
            cfy cfyVarL2 = bxc.l(cfyVarH, (afec) objG4);
            ldyVar2.a().b();
            buxVar2.o();
            fww.L(cfyVarL2, null, null, null, bxc.i(1758345962, true, new ndt(this.a, this.b, this.c, (nea) this.d, (Pattern) this.e), buxVar2), buxVar2, 196608, 30);
        } else {
            buxVar2.s();
        }
        return afak.a;
    }

    public ndu(boolean z, afdr afdrVar, float f, float f2, ncr ncrVar, int i) {
        this.f = i;
        this.a = z;
        this.e = afdrVar;
        this.b = f;
        this.c = f2;
        this.d = ncrVar;
    }
}
