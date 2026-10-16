package defpackage;

import android.content.Context;
import android.telecom.Call;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class efz extends afde implements afeg {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    private /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efz(dws dwsVar, Call call, afec afecVar, afck afckVar, int i) {
        super(2, afckVar);
        this.f = i;
        this.d = dwsVar;
        this.b = call;
        this.c = afecVar;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [aiyk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [afeg, java.lang.Object] */
    @Override // defpackage.afcy
    public final afck b(Object obj, afck afckVar) {
        int i = this.f;
        if (i == 0) {
            efz efzVar = new efz((egd) this.b, (afeg) this.c, (fdf) this.d, afckVar, 0);
            efzVar.e = obj;
            return efzVar;
        }
        if (i == 1) {
            Object obj2 = this.d;
            dws dwsVar = (dws) obj2;
            efz efzVar2 = new efz(dwsVar, (Call) this.b, (afec) this.c, afckVar, 1);
            efzVar2.e = obj;
            return efzVar2;
        }
        if (i == 2) {
            Object obj3 = this.d;
            ept eptVar = (ept) obj3;
            efz efzVar3 = new efz(eptVar, (eps) this.b, (aiyk) this.c, afckVar, 2);
            efzVar3.e = obj;
            return efzVar3;
        }
        Object obj4 = this.d;
        if (i != 3) {
            ept eptVar2 = (ept) obj4;
            efz efzVar4 = new efz(eptVar2, (eps) this.b, this.c, afckVar, 4, null);
            efzVar4.e = obj;
            return efzVar4;
        }
        ept eptVar3 = (ept) obj4;
        efz efzVar5 = new efz(eptVar3, (eps) this.b, (afeg) this.c, afckVar, 3);
        efzVar5.e = obj;
        return efzVar5;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [aitx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [aixl, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v19, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v5, types: [aiyk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [afeg, java.lang.Object] */
    @Override // defpackage.afcy
    public final Object hT(Object obj) throws Throwable {
        aixv aixvVar;
        Throwable th;
        fgp fgpVar;
        int i = this.f;
        if (i == 0) {
            aitx aitxVar = (aitx) this.e;
            afcr afcrVar = afcr.a;
            if (this.a != 0) {
                woy.dF(obj);
                return obj;
            }
            woy.dF(obj);
            aitm aitmVar = new aitm();
            Object obj2 = this.b;
            ?? r7 = this.c;
            Object obj3 = this.d;
            egd egdVar = (egd) obj2;
            ehi ehiVarH = egdVar.g.h();
            wci wciVar = new wci((afeg) r7, aitmVar, ehiVarH instanceof ees ? new egv(((ees) ehiVarH).c) : ehiVarH, aitxVar.c(), (fdf) obj3);
            mko mkoVar = egdVar.h;
            Object objJ = mkoVar.c.j(wciVar);
            if (objJ instanceof aixn) {
                Throwable thB = aixp.b(objJ);
                if (thB == null) {
                    throw new aixs("Channel was closed normally");
                }
                throw thB;
            }
            if (!aixp.c(objJ)) {
                throw new IllegalStateException("Check failed.");
            }
            if (((AtomicInteger) ((kwp) mkoVar.d).a).getAndIncrement() == 0) {
                ahnc.d(mkoVar.b, null, 0, new ehe(mkoVar, null), 3);
            }
            this.e = null;
            this.a = 1;
            Object objHL = aitmVar.hL(this);
            return objHL == afcrVar ? afcrVar : objHL;
        }
        if (i == 1) {
            afcr afcrVar2 = afcr.a;
            if (this.a != 0) {
                woy.dF(obj);
            } else {
                woy.dF(obj);
                aitx aitxVar2 = (aitx) this.e;
                Context applicationContext = ((dws) this.d).getApplicationContext();
                applicationContext.getClass();
                aabf aabfVar = new aabf(applicationContext, aitxVar2, (Call) this.b);
                String str = dws.a;
                Log.v(str, "connectExtensions: calling init");
                this.c.invoke(aabfVar);
                Log.v(str, "connectExtensions: connecting extensions");
                this.a = 1;
                if (aabfVar.h(this) == afcrVar2) {
                    return afcrVar2;
                }
            }
            return afak.a;
        }
        if (i == 2) {
            afcr afcrVar3 = afcr.a;
            if (this.a != 0) {
                aixvVar = (aixv) this.e;
                woy.dF(obj);
            } else {
                woy.dF(obj);
                aixv aixvVar2 = (aixv) this.e;
                Object obj4 = this.d;
                Object obj5 = this.b;
                ehs ehsVar = new ehs((aiyk) this.c, aixvVar2, (afck) null, 2);
                this.e = aixvVar2;
                this.a = 1;
                if (eqs.b((ept) obj4, (eps) obj5, ehsVar, this) == afcrVar3) {
                    return afcrVar3;
                }
                aixvVar = aixvVar2;
            }
            aixvVar.u(null);
            return afak.a;
        }
        if (i != 3) {
            afcr afcrVar4 = afcr.a;
            int i2 = this.a;
            woy.dF(obj);
            if (i2 == 0) {
                aitx aitxVar3 = (aitx) this.e;
                aitu aituVar = aium.a;
                aivr aivrVarI = ajct.a.i();
                eqx eqxVar = new eqx((ept) this.d, (eps) this.b, aitxVar3, this.c, null);
                this.a = 1;
                if (ahnc.a(aivrVarI, eqxVar, this) == afcrVar4) {
                    return afcrVar4;
                }
            }
            return afak.a;
        }
        afcr afcrVar5 = afcr.a;
        if (this.a != 0) {
            fgpVar = (fgp) this.e;
            try {
                woy.dF(obj);
                fgpVar.a();
                return obj;
            } catch (Throwable th2) {
                th = th2;
                fgpVar.a();
                throw th;
            }
        }
        woy.dF(obj);
        aivh aivhVar = (aivh) ((aitx) this.e).c().get(aivh.d);
        if (aivhVar == null) {
            throw new IllegalStateException("when[State] methods should have a parent job");
        }
        eqp eqpVar = new eqp();
        fgp fgpVar2 = new fgp((ept) this.d, (eps) this.b, eqpVar.a, aivhVar);
        try {
            ?? r13 = this.c;
            this.e = fgpVar2;
            this.a = 1;
            obj = ahnc.a(eqpVar, r13, this);
            if (obj == afcrVar5) {
                return afcrVar5;
            }
            fgpVar = fgpVar2;
            fgpVar.a();
            return obj;
        } catch (Throwable th3) {
            th = th3;
            fgpVar = fgpVar2;
            fgpVar.a();
            throw th;
        }
    }

    @Override // defpackage.afeg
    public final /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.f;
        if (i == 0) {
            return ((efz) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        if (i == 1) {
            return ((efz) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        if (i == 2) {
            return ((efz) b((aixv) obj, (afck) obj2)).hT(afak.a);
        }
        if (i != 3) {
            return ((efz) b((aitx) obj, (afck) obj2)).hT(afak.a);
        }
        return ((efz) b((aitx) obj, (afck) obj2)).hT(afak.a);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efz(egd egdVar, afeg afegVar, fdf fdfVar, afck afckVar, int i) {
        super(2, afckVar);
        this.f = i;
        this.b = egdVar;
        this.c = afegVar;
        this.d = fdfVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efz(ept eptVar, eps epsVar, afeg afegVar, afck afckVar, int i) {
        super(2, afckVar);
        this.f = i;
        this.d = eptVar;
        this.b = epsVar;
        this.c = afegVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efz(ept eptVar, eps epsVar, afeg afegVar, afck afckVar, int i, byte[] bArr) {
        super(2, afckVar);
        this.f = i;
        this.d = eptVar;
        this.b = epsVar;
        this.c = afegVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efz(ept eptVar, eps epsVar, aiyk aiykVar, afck afckVar, int i) {
        super(2, afckVar);
        this.f = i;
        this.d = eptVar;
        this.b = epsVar;
        this.c = aiykVar;
    }
}
