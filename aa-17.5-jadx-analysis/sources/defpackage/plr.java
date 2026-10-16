package defpackage;

import android.content.Context;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes2.dex */
public final class plr implements ackr {
    private final acku a;
    private final acku b;
    private final acku c;
    private final acku d;
    private final /* synthetic */ int e;

    public plr(acku ackuVar, acku ackuVar2, acku ackuVar3, acku ackuVar4, int i) {
        this.e = i;
        this.a = ackuVar;
        this.b = ackuVar2;
        this.c = ackuVar3;
        this.d = ackuVar4;
    }

    @Override // defpackage.aezk, defpackage.aezj
    public final /* synthetic */ Object a() {
        switch (this.e) {
            case 0:
                plq plqVar = new plq((Context) this.a.a(), ((plw) this.b).a());
                ((uxv) this.c).b().execute(new pfq(plqVar, ackq.b(this.d), 8, null));
                return plqVar;
            case 1:
                Context context = (Context) this.c.a();
                ((uxv) this.d).b();
                return new plj(context, (pli) this.b.a(), (vja) this.a.a());
            case 2:
                return new pxm((psj) this.d.a(), ((pne) this.c).a(), ((uxv) this.a).b(), (puw) this.b.a());
            case 3:
                Context context2 = (Context) this.c.a();
                acku ackuVar = this.d;
                return new pxv(context2, context2.getResources().getDisplayMetrics(), ackq.b(this.a), ackq.b(this.b), ackq.b(ackuVar));
            case 4:
                pyx pyxVar = new pyx((Context) this.d.a(), ((uxv) this.b).b(), (psj) this.a.a(), ((uyq) this.c).b());
                vaq.d();
                if (pyxVar.k.getCount() == 0) {
                    pyxVar.f.a();
                    pyxVar.k = new CountDownLatch(1);
                }
                pyxVar.i.a();
                psj psjVar = pyxVar.q;
                psb psbVar = psb.UI_THREAD;
                yfy yfyVarK = yfy.k(psbVar, pyxVar.e);
                ygs ygsVar = new ygs();
                ygsVar.b(pyq.class, new pyy(pyq.class, pyxVar, psbVar, pyy.b(psbVar, yfyVarK)));
                psjVar.d(pyxVar, ygsVar.a());
                qsb qsbVar = pyxVar.r;
                if (qsbVar != null) {
                    qsbVar.b().c(new pru(pyxVar, 15), zfq.a);
                }
                return pyxVar;
            case 5:
                ((uxv) this.b).b();
                ((uxv) this.d).b();
                return new lxr();
            case 6:
                tno tnoVar = (tno) this.a.a();
                tuy tuyVar = (tuy) this.d.a();
                return new urb(tnoVar.d(), tuyVar);
            case 7:
                erb erbVar = (erb) this.c.a();
                qce qceVar = (qce) ((acks) this.a).b;
                xxh xxhVar = (xxh) ((acks) this.b).b;
                ackk ackkVarB = ackq.b(this.d);
                return ((uaj) ackkVarB.a()).l() ? new umt() : new umu(erbVar, qceVar, (pye) xxhVar.e(), ackkVarB);
            case 8:
                usy usyVar = (usy) this.d.a();
                Object obj = ((acks) this.c).b;
                ackq.b(this.b);
                return new gms(usyVar, (Context) obj);
            default:
                return new ajdr((tqv) this.b.a(), (rjs) this.c.a(), (Context) ((acks) this.d).b, ackq.b(this.a));
        }
    }

    public plr(acku ackuVar, acku ackuVar2, acku ackuVar3, acku ackuVar4, int i, byte[] bArr) {
        this.e = i;
        this.c = ackuVar;
        this.d = ackuVar2;
        this.b = ackuVar3;
        this.a = ackuVar4;
    }

    public plr(acku ackuVar, acku ackuVar2, acku ackuVar3, acku ackuVar4, int i, char[] cArr) {
        this.e = i;
        this.d = ackuVar;
        this.c = ackuVar2;
        this.a = ackuVar3;
        this.b = ackuVar4;
    }

    public plr(acku ackuVar, acku ackuVar2, acku ackuVar3, acku ackuVar4, int i, float[] fArr) {
        this.e = i;
        this.a = ackuVar;
        this.d = ackuVar2;
        this.c = ackuVar3;
        this.b = ackuVar4;
    }

    public plr(acku ackuVar, acku ackuVar2, acku ackuVar3, acku ackuVar4, int i, int[] iArr) {
        this.e = i;
        this.d = ackuVar;
        this.b = ackuVar2;
        this.a = ackuVar3;
        this.c = ackuVar4;
    }

    public plr(acku ackuVar, acku ackuVar2, acku ackuVar3, acku ackuVar4, int i, short[] sArr) {
        this.e = i;
        this.c = ackuVar;
        this.a = ackuVar2;
        this.b = ackuVar3;
        this.d = ackuVar4;
    }

    public plr(acku ackuVar, acku ackuVar2, acku ackuVar3, acku ackuVar4, int i, boolean[] zArr) {
        this.e = i;
        this.c = ackuVar;
        this.b = ackuVar2;
        this.d = ackuVar3;
        this.a = ackuVar4;
    }

    public plr(acku ackuVar, acku ackuVar2, acku ackuVar3, acku ackuVar4, int i, char[][] cArr) {
        this.e = i;
        this.d = ackuVar;
        this.a = ackuVar2;
        this.c = ackuVar3;
        this.b = ackuVar4;
    }

    public plr(acku ackuVar, acku ackuVar2, acku ackuVar3, acku ackuVar4, int i, short[][] sArr) {
        this.e = i;
        this.b = ackuVar;
        this.c = ackuVar2;
        this.d = ackuVar3;
        this.a = ackuVar4;
    }
}
