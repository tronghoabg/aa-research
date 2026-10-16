package defpackage;

import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes2.dex */
public final /* synthetic */ class mck implements afeg {
    public final /* synthetic */ GhIcon a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ long e;
    private final /* synthetic */ int f;

    public /* synthetic */ mck(GhIcon ghIcon, long j, boolean z, boolean z2, long j2, int i) {
        this.f = i;
        this.a = ghIcon;
        this.b = j;
        this.c = z;
        this.d = z2;
        this.e = j2;
    }

    @Override // defpackage.afeg
    public final Object invoke(Object obj, Object obj2) {
        long jN;
        long jN2;
        if (this.f != 0) {
            bux buxVar = (bux) obj;
            int iIntValue = ((Integer) obj2).intValue();
            if (buxVar.I((iIntValue & 3) != 2, iIntValue & 1)) {
                boolean z = this.c;
                long j = this.b;
                cmw cmwVarF = lgi.f(this.a, BitmapDescriptorFactory.HUE_RED, buxVar, 3);
                cfv cfvVar = cfy.e;
                bcm bcmVar = bcr.a;
                cfy cfyVarH = asl.H(mcd.h(cfvVar, j, 2.0f, bcmVar), 2.0f);
                if (z) {
                    cfyVarH = asl.H(afp.E(cfyVarH, this.e, bcmVar), 2.0f);
                }
                boolean z2 = this.d;
                boolean zD = buxVar.D(z2);
                Object objG = buxVar.g();
                if (zD || objG == buw.a) {
                    objG = new jtp(z2, 8);
                    buxVar.x(objG);
                }
                cfy cfyVarF = cjn.f(cfyVarH, (afec) objG);
                if (z) {
                    buxVar.v(196507007);
                    jN2 = ((cjv) buxVar.f(bnm.a)).a;
                    buxVar.o();
                } else {
                    buxVar.v(196507619);
                    buxVar.o();
                    jN2 = cjn.n();
                }
                boc.a(cmwVarF, null, cfyVarF, jN2, buxVar, 56, 0);
            } else {
                buxVar.s();
            }
            return afak.a;
        }
        bux buxVar2 = (bux) obj;
        int iIntValue2 = ((Integer) obj2).intValue();
        int i = iIntValue2 & 3;
        if (buxVar2.I(i != 2, iIntValue2 & 1)) {
            boolean z3 = this.c;
            long j2 = this.b;
            cmw cmwVarF2 = lgi.f(this.a, BitmapDescriptorFactory.HUE_RED, buxVar2, 3);
            cfv cfvVar2 = cfy.e;
            bcm bcmVar2 = bcr.a;
            cfy cfyVarH2 = asl.H(mcd.h(cfvVar2, j2, 2.0f, bcmVar2), 2.0f);
            if (z3) {
                cfyVarH2 = asl.H(afp.E(cfyVarH2, this.e, bcmVar2), 2.0f);
            }
            boolean z4 = this.d;
            boolean zD2 = buxVar2.D(z4);
            Object objG2 = buxVar2.g();
            if (zD2 || objG2 == buw.a) {
                objG2 = new jtp(z4, 7);
                buxVar2.x(objG2);
            }
            cfy cfyVarF2 = cjn.f(cfyVarH2, (afec) objG2);
            if (z3) {
                buxVar2.v(548652722);
                jN = ((cjv) buxVar2.f(bnm.a)).a;
                buxVar2.o();
            } else {
                buxVar2.v(548653334);
                buxVar2.o();
                jN = cjn.n();
            }
            boc.a(cmwVarF2, null, cfyVarF2, jN, buxVar2, 56, 0);
        } else {
            buxVar2.s();
        }
        return afak.a;
    }
}
