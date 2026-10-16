package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class bqp {
    public static final bvf a = new bvo(bxp.c, new blv(6));

    public static final cfy a(cfy cfyVar, ckv ckvVar, long j, ajh ajhVar, float f) {
        return cjn.g(cfyVar.a(f > BitmapDescriptorFactory.HUE_RED ? cjn.g(cfy.e, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f, BitmapDescriptorFactory.HUE_RED, ckvVar, false, 0, 1042399) : cfy.e).a(ajhVar != null ? new ajg(ajhVar.a, ajhVar.b, ckvVar) : cfy.e).a(new aix(j, ckvVar)), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, ckvVar, true, 0, 1042431);
    }

    public static final void b(cfy cfyVar, ckv ckvVar, long j, long j2, float f, ajh ajhVar, final afeg afegVar, bux buxVar, int i) {
        if ((i & 1) != 0) {
            cfyVar = cfy.e;
        }
        final cfy cfyVar2 = cfyVar;
        if ((i & 2) != 0) {
            ckvVar = ckq.a;
        }
        final ckv ckvVar2 = ckvVar;
        final long j3 = (i & 4) != 0 ? ((bog) buxVar.f(boh.a)).a.p : j;
        long jD = (i & 8) != 0 ? bnh.d(j3, buxVar) : j2;
        final float f2 = (i & 32) != 0 ? 0.0f : f;
        final ajh ajhVar2 = (i & 64) != 0 ? null : ajhVar;
        bvf bvfVar = a;
        final float f3 = BitmapDescriptorFactory.HUE_RED + ((dlj) buxVar.f(bvfVar)).a;
        czz.an(new bxe[]{bnm.a.b(new cjv(jD)), bvfVar.b(new dlj(f3))}, bxc.i(421772006, true, new afeg() { // from class: bqm
            @Override // defpackage.afeg
            public final Object invoke(Object obj, Object obj2) {
                bux buxVar2 = (bux) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = iIntValue & 3;
                if (buxVar2.I(i2 != 2, iIntValue & 1)) {
                    float f4 = f2;
                    ajh ajhVar3 = ajhVar2;
                    float f5 = f3;
                    cfy cfyVarA = bqp.a(cfyVar2, ckvVar2, bnh.c(((bog) buxVar2.f(boh.a)).a, j3, f5, buxVar2), ajhVar3, ((dlg) buxVar2.f(dbc.d)).eA(f4));
                    Object objG = buxVar2.g();
                    Object obj3 = buw.a;
                    if (objG == obj3) {
                        objG = new bmk(12);
                        buxVar2.x(objG);
                    }
                    AtomicInteger atomicInteger = dds.a;
                    cfy cfyVarA2 = cfyVarA.a(new ddg(false, (afec) objG));
                    afak afakVar = afak.a;
                    Object objG2 = buxVar2.g();
                    if (objG2 == obj3) {
                        objG2 = gha.b;
                        buxVar2.x(objG2);
                    }
                    cql cqlVar = crh.a;
                    cfy cfyVarA3 = cfyVarA2.a(new crg(afakVar, null, (PointerInputEventHandler) objG2));
                    ctp ctpVarB = atk.b(cfl.a, true);
                    long jB = buxVar2.b();
                    long j4 = jB ^ (jB >>> 32);
                    ccx ccxVarN = buxVar2.N();
                    cfy cfyVarJ = bzi.j(buxVar2, cfyVarA3);
                    afdr afdrVar = cwb.a;
                    buxVar2.M();
                    buxVar2.w();
                    if (buxVar2.G()) {
                        buxVar2.j(afdrVar);
                    } else {
                        buxVar2.y();
                    }
                    afeg afegVar2 = afegVar;
                    byq.c(buxVar2, ctpVarB, cwb.e);
                    byq.c(buxVar2, ccxVarN, cwb.d);
                    byq.c(buxVar2, Integer.valueOf((int) j4), cwb.f);
                    buxVar2.i(afakVar, new alx(cwb.g, 16));
                    byq.c(buxVar2, cfyVarJ, cwb.c);
                    afegVar2.invoke(buxVar2, 0);
                    buxVar2.n();
                } else {
                    buxVar2.s();
                }
                return afak.a;
            }
        }, buxVar), buxVar, 56);
    }

    public static final void c(final afdr afdrVar, cfy cfyVar, boolean z, ckv ckvVar, long j, long j2, float f, float f2, ajh ajhVar, asf asfVar, final afeg afegVar, bux buxVar, int i) {
        final asf asfVar2;
        final cfy cfyVar2 = (i & 2) != 0 ? cfy.e : cfyVar;
        final boolean z2 = (!((i & 4) == 0)) | z;
        final ckv ckvVar2 = (i & 8) != 0 ? ckq.a : ckvVar;
        final long j3 = (i & 16) != 0 ? ((bog) buxVar.f(boh.a)).a.p : j;
        long jD = (i & 32) != 0 ? bnh.d(j3, buxVar) : j2;
        float f3 = (i & 64) != 0 ? 0.0f : f;
        final float f4 = (i & 128) != 0 ? 0.0f : f2;
        ajh ajhVar2 = (i & 256) != 0 ? null : ajhVar;
        if (asfVar == null) {
            buxVar.v(-1701074900);
            Object objG = buxVar.g();
            if (objG == buw.a) {
                objG = new asg();
                buxVar.x(objG);
            }
            asfVar2 = (asf) objG;
            buxVar.o();
        } else {
            buxVar.v(2023335947);
            buxVar.o();
            asfVar2 = asfVar;
        }
        bvf bvfVar = a;
        final float f5 = ((dlj) buxVar.f(bvfVar)).a + f3;
        final ajh ajhVar3 = ajhVar2;
        czz.an(new bxe[]{bnm.a.b(new cjv(jD)), bvfVar.b(new dlj(f5))}, bxc.i(849208527, true, new afeg() { // from class: bqn
            @Override // defpackage.afeg
            public final Object invoke(Object obj, Object obj2) {
                bux buxVar2 = (bux) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = iIntValue & 3;
                if (buxVar2.I(i2 != 2, iIntValue & 1)) {
                    float f6 = f4;
                    afdr afdrVar2 = afdrVar;
                    boolean z3 = z2;
                    ajh ajhVar4 = ajhVar3;
                    float f7 = f5;
                    long j4 = j3;
                    ckv ckvVar3 = ckvVar2;
                    asf asfVar3 = asfVar2;
                    cfy cfyVarA = cfyVar2.a(bop.a);
                    bvf bvfVar2 = bpe.a;
                    Object obj3 = ((kgx) buxVar2.f(bvfVar2)).a;
                    cfy cfyVarA2 = bqp.a(cfyVarA.a(cfy.e), ckvVar3, bnh.c(((bog) buxVar2.f(boh.a)).a, j4, f7, buxVar2), ajhVar4, ((dlg) buxVar2.f(dbc.d)).eA(f6));
                    Object obj4 = ((kgx) buxVar2.f(bvfVar2)).a;
                    cfy cfyVarA3 = afp.w(cfyVarA2, asfVar3, bpe.a(false, BitmapDescriptorFactory.HUE_RED, 0L, ckvVar3, true, 215), z3, null, afdrVar2).a(new bso(new bes(19)));
                    ctp ctpVarB = atk.b(cfl.a, true);
                    long jB = buxVar2.b();
                    long j5 = jB ^ (jB >>> 32);
                    ccx ccxVarN = buxVar2.N();
                    cfy cfyVarJ = bzi.j(buxVar2, cfyVarA3);
                    afdr afdrVar3 = cwb.a;
                    buxVar2.M();
                    buxVar2.w();
                    if (buxVar2.G()) {
                        buxVar2.j(afdrVar3);
                    } else {
                        buxVar2.y();
                    }
                    afeg afegVar2 = afegVar;
                    byq.c(buxVar2, ctpVarB, cwb.e);
                    byq.c(buxVar2, ccxVarN, cwb.d);
                    byq.c(buxVar2, Integer.valueOf((int) j5), cwb.f);
                    buxVar2.i(afak.a, new alx(cwb.g, 16));
                    byq.c(buxVar2, cfyVarJ, cwb.c);
                    afegVar2.invoke(buxVar2, 0);
                    buxVar2.n();
                } else {
                    buxVar2.s();
                }
                return afak.a;
            }
        }, buxVar), buxVar, 56);
    }
}
