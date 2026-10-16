package defpackage;

import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;
import java.util.List;

/* loaded from: classes2.dex */
public final class het {
    public static /* synthetic */ afak a(hfb hfbVar, cfy cfyVar, bux buxVar, int i) {
        cfyVar.getClass();
        if ((i & 6) == 0) {
            i |= true != buxVar.C(cfyVar) ? 2 : 4;
        }
        if (buxVar.I((i & 19) != 18, i & 1)) {
            hes.a(hfbVar.b, cfyVar, buxVar, (i << 3) & 112, 0);
        } else {
            buxVar.s();
        }
        return afak.a;
    }

    public static final void b(hfb hfbVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        cfy cfyVar2 = cfyVar;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-543788694);
        int i4 = 1;
        if (i3 == 0) {
            i2 = (true != buxVarC.E(hfbVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar2) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            hjo hjoVar = (hjo) buxVarC.f(hjp.a);
            hjm hjmVar = hjoVar.b;
            hjm hjmVar2 = hjm.a;
            boolean z = hjmVar == hjmVar2 && hjoVar.a.compareTo(hjn.b) >= 0;
            boolean z2 = hjmVar == hjmVar2 && hjoVar.a == hjn.a;
            cct cctVarI = bxc.i(1528933214, true, new guq(hfbVar, 12), buxVarC);
            List list = hfbVar.c;
            fxz fxzVar = !list.isEmpty() ? new fxz(list, false, 2, null, 10) : null;
            hfa hfaVar = hfbVar.b;
            if (hfaVar.b == null && hfaVar.c == null) {
                buxVarC.v(609152039);
                hev.b(new hfc(hfbVar.a, hfaVar, list), cfyVar2, buxVarC, i2 & 112);
                ((bvv) buxVarC).Y(false);
            } else if (z) {
                buxVarC.v(608594783);
                hbx.e(hfbVar.a, bxc.i(-848295019, true, new guq(hfbVar, 13), buxVarC), fxzVar, cctVarI, cfyVar2, buxVarC, ((i2 << 9) & 57344) | 3632);
                ((bvv) buxVarC).Y(false);
                cfyVar2 = cfyVar;
            } else if (z2) {
                buxVarC.v(608888353);
                cfyVar2 = cfyVar;
                hkr.d(hfbVar.a, bxc.i(-424454150, true, new guq(hfbVar, 14), buxVarC), fxzVar, cctVarI, cfyVar2, buxVarC, ((i2 << 9) & 57344) | 3632);
                ((bvv) buxVarC).Y(false);
            } else {
                cfyVar2 = cfyVar;
                buxVarC.v(609152039);
                hev.b(new hfc(hfbVar.a, hfaVar, list), cfyVar2, buxVarC, i2 & 112);
                ((bvv) buxVarC).Y(false);
            }
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new heu((Object) hfbVar, cfyVar2, i, i4);
        }
    }

    public static final void c(bux buxVar, int i) {
        bux buxVarC = buxVar.c(-1514769085);
        if (buxVarC.I(i != 0, i & 1)) {
            ca.bb(dao.b(R.drawable.ic_pan_overlay, buxVarC, 0), null, null, null, null, BitmapDescriptorFactory.HUE_RED, null, buxVarC, 56, 124);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gug(i, 2);
        }
    }
}
