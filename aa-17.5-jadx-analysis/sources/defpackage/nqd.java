package defpackage;

import android.content.Intent;
import com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography;
import com.google.android.gms.car.display.CarDisplayId;
import com.google.android.gms.car.display.CarRegionId;

/* loaded from: classes.dex */
public final class nqd extends lhf {
    public static final nqa a = new nqa();
    public static final yph b = yph.c("GH.AssistantIM");
    public static final afgl c = new ofw(mki.b, 1);
    public final eqj d;
    public nqb e;
    public nsn f;
    private final eqj g;
    private eqj h;
    private final aezr i;

    /* JADX WARN: Multi-variable type inference failed */
    public nqd() {
        eqj eqjVar = (eqj) nfh.a().a;
        this.g = eqjVar;
        afco afcoVar = tby.a;
        this.d = tby.v(tby.v(eqjVar, new nox(17)), new nox(18));
        this.e = new nqb(false, (int) (0 == true ? 1 : 0), 6);
        this.i = woy.dG(new njb(this, 20));
    }

    public static final nqd a() {
        return a.a();
    }

    private final mpb k() {
        return (mpb) this.i.a();
    }

    private final CarRegionId l(nsn nsnVar) {
        return b().r(nsnVar);
    }

    private final void m(nsn nsnVar) {
        CarRegionId carRegionIdL = l(nsnVar);
        rcc rccVar = new rcc();
        rccVar.b(carRegionIdL, 0);
        mub mubVar = mud.h;
        rccVar.b(l(mubVar.a().e()), 1);
        rccVar.a = true;
        rccVar.d();
        p(rccVar.a());
        mubVar.a().g(true);
        n(nsnVar);
    }

    private final void n(nsn nsnVar) {
        this.f = nsnVar;
        rcc rccVar = new rcc();
        rccVar.b(l(nsnVar), 1);
        rccVar.b(l(mud.h.a().e()), 0);
        rccVar.a = true;
        rccVar.d();
        p(rccVar.a());
    }

    private final void o(nsn nsnVar) {
        khc.t(new wci("GH.AssistantIM", yzz.ASSISTANT, yzy.pv, "Car not connected when trying to stop activity", new Object[0]), new npz(l(nsnVar), 0));
    }

    private static final void p(ProjectionWindowAnimationChoreography projectionWindowAnimationChoreography) {
        khc.t(new wci("GH.AssistantIM", yzz.ASSISTANT, yzy.pu, "Car not connected when trying to begin choreography", new Object[0]), new npz(projectionWindowAnimationChoreography, 1));
    }

    private static final boolean q(nso nsoVar) {
        return nsoVar.m() != nsv.f;
    }

    public final nso b() {
        return nsr.c().b();
    }

    @Override // defpackage.lhf, defpackage.lhg
    public final void c() {
        super.c();
        eqm eqmVar = b().A;
        eqj eqjVarG = kfl.h().g();
        eqjVarG.getClass();
        this.h = tby.v(spu.aX(new nje(tby.d(eqmVar, eqjVarG, new niz(11)), this, 6)), new nox(19));
        mpd.b().g(k());
        eqj eqjVar = this.h;
        if (eqjVar == null) {
            affa.d("fullscreenImmersiveState");
            eqjVar = null;
        }
        eqjVar.fE(this, new nns(new noo(this, 9), 2));
    }

    @Override // defpackage.lhf, defpackage.lhg
    public final void d() {
        super.d();
        mpd.b().j(k());
        this.f = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(android.content.Intent r6) {
        /*
            r5 = this;
            r6.getClass()
            boolean r0 = defpackage.nqa.b(r6)
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r6
            java.lang.String r6 = "Intent %s is not an immersive intent"
            defpackage.aclh.o(r0, r6, r2)
            mub r6 = defpackage.mud.h
            mud r6 = r6.a()
            boolean r6 = r6.t()
            if (r6 == 0) goto L39
            nso r6 = r5.b()
            nsv r6 = r6.m()
            nsv r0 = defpackage.nsv.e
            if (r6 != r0) goto L39
            defpackage.mmc.c()
            boolean r6 = defpackage.mmc.h()
            if (r6 != 0) goto L39
            nsn r6 = defpackage.nsn.w
            r5.m(r6)
            goto L42
        L39:
            nsn r6 = r5.f
            if (r6 == 0) goto L42
            nsn r6 = defpackage.nsn.w
            r5.n(r6)
        L42:
            nso r6 = r5.b()
            boolean r6 = q(r6)
            if (r6 == 0) goto L8b
            mpd r6 = defpackage.mpd.b()
            nsn r0 = defpackage.nsn.x
            com.google.android.gms.car.display.CarRegionId r2 = r5.l(r0)
            mqc r6 = r6.e(r2)
            if (r6 != 0) goto L5d
            goto L8b
        L5d:
            rcc r6 = new rcc
            r6.<init>()
            nsn r2 = defpackage.nsn.w
            com.google.android.gms.car.display.CarRegionId r2 = r5.l(r2)
            r6.b(r2, r3)
            com.google.android.gms.car.display.CarRegionId r2 = r5.l(r0)
            r6.b(r2, r1)
            com.google.android.gms.car.display.CarRegionId r5 = r5.l(r0)
            com.google.android.gms.car.animation.ProjectionWindowAnimationParams r0 = new com.google.android.gms.car.animation.ProjectionWindowAnimationParams
            r2 = 2130772027(0x7f01003b, float:1.714716E38)
            r4 = 0
            r0.<init>(r2, r3, r4, r3)
            r6.c(r5, r0)
            r6.a = r1
            com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography r5 = r6.a()
            p(r5)
        L8b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nqd.e(android.content.Intent):void");
    }

    public final void f(CarRegionId carRegionId) {
        if ((this.f == nsn.x && j(carRegionId)) || (this.f == nsn.w && i(carRegionId))) {
            mud.h.a().n();
            this.f = null;
        }
    }

    public final void g(Intent intent) {
        intent.getClass();
        aclh.o(nqa.b(intent), "Intent %s is not an immersive intent", new Object[]{intent});
        if (mud.h.a().t() && b().F()) {
            mmc.c();
            if (!mmc.h()) {
                m(nsn.x);
                return;
            }
        }
        if (this.f != null) {
            n(nsn.x);
        }
    }

    public final void h() {
        ((ype) b.f()).u("Stopping immersives");
        o(nsn.w);
        if (q(b())) {
            o(nsn.x);
        }
    }

    public final boolean i(CarRegionId carRegionId) {
        return CarDisplayId.b(carRegionId.h) && q(b()) && affa.f(carRegionId, l(nsn.w));
    }

    public final boolean j(CarRegionId carRegionId) {
        return CarDisplayId.b(carRegionId.h) && q(b()) && affa.f(carRegionId, l(nsn.x));
    }
}
