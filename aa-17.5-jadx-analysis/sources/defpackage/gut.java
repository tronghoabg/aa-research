package defpackage;

import androidx.car.app.model.Alert;
import java.util.Map;

/* loaded from: classes2.dex */
public final class gut {
    public static final void a(guu guuVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(1488839806);
        int i4 = 2;
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? buxVarC.C(guuVar) : buxVarC.E(guuVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            gui.b(awd.r(gui.d(cfyVar, true, buxVarC, 0)), atd.e, null, bxc.i(1569096756, true, new guq(guuVar, i4), buxVarC), buxVarC, 3120, 4);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new gul(guuVar, cfyVar, i, 4, null);
        }
    }

    public static final void b(gfa gfaVar, gfa gfaVar2, bux buxVar, int i) {
        int i2;
        gfa gfaVar3;
        int i3;
        avy avyVar;
        int i4;
        bvv bvvVar;
        cfv cfvVar;
        boolean z;
        bvv bvvVar2;
        bux buxVarC = buxVar.c(1233260447);
        if ((i & 6) == 0) {
            i2 = (true != buxVarC.z(36.0f) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != ((i & 64) == 0 ? buxVarC.C(gfaVar) : buxVarC.E(gfaVar)) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != ((i & sk.AUDIO_CONTENT_BUFFER_SIZE) == 0 ? buxVarC.C(gfaVar2) : buxVarC.E(gfaVar2)) ? 128 : 256;
        }
        if (buxVarC.I((i2 & 147) != 146, i2 & 1)) {
            int i5 = (i2 >> 3) & 14;
            boolean zT = fwl.t(gfaVar, buxVarC, i5);
            int i6 = (i2 >> 6) & 14;
            boolean zT2 = fwl.t(gfaVar2, buxVarC, i6);
            if (zT && zT2) {
                bxf bxfVarJ = buxVarC.J();
                if (bxfVarJ != null) {
                    bxfVarJ.c = new gul(gfaVar, gfaVar2, i, 5);
                    return;
                }
                return;
            }
            asz aszVar = new asz(gjk.b.k, false, null);
            cfr cfrVar = cfl.n;
            cfv cfvVar2 = cfy.e;
            ctp ctpVarA = avv.a(aszVar, cfrVar, buxVarC, 48);
            bvv bvvVar3 = (bvv) buxVarC;
            int iG = a.g(bvvVar3.u);
            ccx ccxVarAh = bvvVar3.ah();
            cfy cfyVarJ = bzi.j(buxVarC, cfvVar2);
            afdr afdrVar = cwb.a;
            buxVarC.w();
            if (bvvVar3.t) {
                buxVarC.j(afdrVar);
            } else {
                buxVarC.y();
            }
            byq.c(buxVarC, ctpVarA, cwb.e);
            byq.c(buxVarC, ccxVarAh, cwb.d);
            byq.c(buxVarC, Integer.valueOf(iG), cwb.f);
            byq.b(buxVarC, cwb.g);
            byq.c(buxVarC, cfyVarJ, cwb.c);
            avy avyVar2 = avy.a;
            if (zT) {
                i3 = i2;
                avyVar = avyVar2;
                i4 = i6;
                bvvVar = bvvVar3;
                cfvVar = cfvVar2;
                z = false;
                buxVarC.v(322999719);
                bvvVar.Y(false);
            } else {
                buxVarC.v(322754664);
                i3 = i2;
                i4 = i6;
                cfvVar = cfvVar2;
                avyVar = avyVar2;
                fzc.h(gfaVar, null, Alert.DURATION_SHOW_INDEFINITELY, 0, 0L, dfw.v(czz.av(buxVarC).i, gux.c(buxVarC).T(), 0L, null, null, null, null, 0L, null, 0, 0, 0L, null, null, 16777214), 0L, null, 0, 0, null, new dlj(36.0f), null, false, false, buxVarC, i5 | 384, (i2 << 3) & 112, 63450);
                buxVarC = buxVarC;
                bvvVar = bvvVar3;
                z = false;
                bvvVar.Y(false);
            }
            if (zT || zT2) {
                buxVarC.v(323298311);
                bvvVar.Y(z);
            } else {
                buxVarC.v(323128028);
                fww.n(null, woy.bg(new cjv(gux.c(buxVarC).T())), 0, 0, czz.av(buxVarC).l, 0L, null, 0, null, buxVarC, 48, 0, 4057);
                bvvVar.Y(z);
            }
            if (zT2) {
                boolean z2 = z;
                bvvVar2 = bvvVar;
                gfaVar3 = gfaVar2;
                buxVarC.v(323588967);
                bvvVar2.Y(z2);
            } else {
                buxVarC.v(323328536);
                bux buxVar2 = buxVarC;
                bvv bvvVar4 = bvvVar;
                gfaVar3 = gfaVar2;
                fzc.h(gfaVar3, avyVar.b(cfvVar, 1.0f, z), 0, 0, 0L, dfw.v(czz.av(buxVarC).l, gux.c(buxVarC).U(), 0L, null, null, null, null, 0L, null, 0, 0, 0L, null, null, 16777214), 0L, null, 0, 0, null, new dlj(36.0f), null, false, false, buxVar2, i4, (i3 << 3) & 112, 63452);
                buxVarC = buxVar2;
                bvvVar2 = bvvVar4;
                bvvVar2.Y(false);
            }
            bvvVar2.Y(true);
        } else {
            gfaVar3 = gfaVar2;
            buxVarC.s();
        }
        bxf bxfVarJ2 = buxVarC.J();
        if (bxfVarJ2 != null) {
            bxfVarJ2.c = new gul(gfaVar, gfaVar3, i, 6);
        }
    }

    public static final wb c(wb wbVar, geu geuVar, gzc gzcVar) {
        if (wbVar instanceof gmw) {
            hem hemVarL = geuVar.l(gyw.class);
            hemVarL.getClass();
            gwc gwcVarB = ((gyw) hemVarL).b(wbVar.getClass());
            if (gwcVarB != null) {
                geuVar.e().b("Emitter", gwcVarB.getClass().getSimpleName());
                gwcVarB.h(gzcVar);
                gwcVarB.g((gmw) wbVar);
                return new gza(gwcVarB, wbVar);
            }
        }
        return wbVar;
    }

    public static final hit d(int i) {
        wnh wnhVar = new wnh(i);
        double d = wnhVar.a;
        double d2 = wnhVar.b;
        wnj wnjVarB = wnj.b(d, d2);
        wnj wnjVarB2 = wnj.b(d, d2 / 3.0d);
        wnj wnjVarB3 = wnj.b(60.0d + d, d2 / 2.0d);
        wnj wnjVarB4 = wnj.b(d, Math.min(d2 / 12.0d, 4.0d));
        wnj wnjVarB5 = wnj.b(d, Math.min(d2 / 6.0d, 8.0d));
        wnj.b(25.0d, 84.0d);
        return new hit(wnjVarB, wnjVarB2, wnjVarB3, wnjVarB4, wnjVarB5);
    }

    public static final cfy e(cfy cfyVar, hju hjuVar) {
        cfy cfyVarD;
        cfyVar.getClass();
        Map map = hio.a;
        String str = (String) gur.f(hjuVar).a("test-tag");
        return (str == null || (cfyVarD = das.d(cfyVar, str)) == null) ? cfyVar : cfyVarD;
    }
}
