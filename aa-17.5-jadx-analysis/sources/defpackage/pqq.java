package defpackage;

import android.content.Context;
import j$.util.Optional;
import java.util.Set;

/* loaded from: classes2.dex */
public final class pqq implements ackr {
    private final acku a;
    private final acku b;
    private final acku c;
    private final acku d;
    private final acku e;
    private final acku f;
    private final /* synthetic */ int g;

    public pqq(acku ackuVar, acku ackuVar2, acku ackuVar3, acku ackuVar4, acku ackuVar5, acku ackuVar6, int i) {
        this.g = i;
        this.a = ackuVar;
        this.b = ackuVar2;
        this.c = ackuVar3;
        this.d = ackuVar4;
        this.e = ackuVar5;
        this.f = ackuVar6;
    }

    @Override // defpackage.aezk, defpackage.aezj
    public final /* synthetic */ Object a() {
        urd urdVar;
        tuy tuyVar;
        switch (this.g) {
            case 0:
                Context context = (Context) this.a.a();
                acku ackuVar = this.c;
                xxh xxhVarB = ((uyq) this.b).b();
                ackq.b(ackuVar);
                tmb tmbVar = (tmb) this.d.a();
                acku ackuVar2 = this.f;
                Set setA = ((ackv) this.e).a();
                zgt zgtVarB = ((uxv) ackuVar2).b();
                vaq.d();
                return new pmy(context, tmbVar, pyn.a(context, pyo.REMOVE_BLOCKING_ON_NAVIGATION_PARAMETERS), setA, zgtVarB);
            case 1:
                pyh pyhVar = (pyh) this.d.a();
                pqt pqtVar = (pqt) this.f.a();
                Object obj = ((acks) this.c).b;
                acku ackuVar3 = this.a;
                acku ackuVar4 = this.b;
                pqe pqeVar = (pqe) this.e.a();
                vaq.d();
                return new pqg(pqtVar, pqeVar, ackq.b(ackuVar4), ackq.b(ackuVar3), pyhVar, (xxh) obj);
            case 2:
                return new pzn(((pms) this.d).a(), (tmb) this.b.a(), ackq.b(this.a), (xxh) ((acks) this.c).b);
            case 3:
                acku ackuVar5 = this.c;
                uqm uqmVarA = ((uqn) this.d).a();
                ackq.b(this.e);
                ackq.b(this.f);
                return uqmVarA;
            case 4:
                xxh xxhVar = (xxh) ((acks) this.f).b;
                Context context2 = (Context) ((acks) this.d).b;
                rhj rhjVar = (rhj) this.e.a();
                acku ackuVar6 = this.c;
                xxh xxhVar2 = (xxh) ((acks) this.b).b;
                ackk ackkVarB = ackq.b(this.a);
                uaj uajVar = (uaj) ackuVar6.a();
                if (xxhVar.f()) {
                    tuyVar = (tuy) ((ackk) xxhVar.b()).a();
                } else {
                    if (uajVar.i() && uajVar.h()) {
                        urdVar = new urd(rhjVar, ackkVarB, context2.getResources().getDisplayMetrics().density);
                    } else {
                        urdVar = new urd(rhjVar, ackkVarB, context2.getResources().getDisplayMetrics().density);
                    }
                    tuyVar = urdVar;
                }
                tuyVar.getClass();
                return tuyVar;
            case 5:
                psj psjVar = (psj) this.d.a();
                acku ackuVar7 = this.c;
                acku ackuVar8 = this.a;
                zgt zgtVarB2 = ((uxv) this.e).b();
                ackk ackkVarB2 = ackq.b(ackuVar8);
                uak uakVar = (uak) ackuVar7.a();
                acku ackuVar9 = this.f;
                ackk ackkVarB3 = ackq.b(this.b);
                return new qrx(psjVar, zgtVarB2, ackkVarB2, Optional.of(uakVar), Optional.of(ackkVarB3), Optional.empty(), Optional.empty());
            case 6:
                ackq.b(this.b);
                ackq.b(this.f);
                ackq.b(this.a);
                return new uqw(this.c);
            case 7:
                xxh xxhVar3 = (xxh) ((acks) this.f).b;
                qau qauVar = (qau) this.e.a();
                ((uxv) this.c).b();
                return xxhVar3.f() ? (uqi) xxhVar3.b() : new uqi(qauVar, ackq.b(this.a));
            default:
                ackq.b(this.d);
                ackq.b(this.c);
                ackq.b(this.f);
                return xvy.a;
        }
    }

    public pqq(acku ackuVar, acku ackuVar2, acku ackuVar3, acku ackuVar4, acku ackuVar5, acku ackuVar6, int i, byte[] bArr) {
        this.g = i;
        this.d = ackuVar;
        this.f = ackuVar2;
        this.e = ackuVar3;
        this.b = ackuVar4;
        this.a = ackuVar5;
        this.c = ackuVar6;
    }

    public pqq(acku ackuVar, acku ackuVar2, acku ackuVar3, acku ackuVar4, acku ackuVar5, acku ackuVar6, int i, char[] cArr) {
        this.g = i;
        this.f = ackuVar;
        this.d = ackuVar2;
        this.e = ackuVar3;
        this.b = ackuVar4;
        this.a = ackuVar5;
        this.c = ackuVar6;
    }

    public pqq(acku ackuVar, acku ackuVar2, acku ackuVar3, acku ackuVar4, acku ackuVar5, acku ackuVar6, int i, float[] fArr) {
        this.g = i;
        this.d = ackuVar;
        this.e = ackuVar2;
        this.b = ackuVar3;
        this.c = ackuVar4;
        this.f = ackuVar5;
        this.a = ackuVar6;
    }

    public pqq(acku ackuVar, acku ackuVar2, acku ackuVar3, acku ackuVar4, acku ackuVar5, acku ackuVar6, int i, short[] sArr) {
        this.g = i;
        this.d = ackuVar;
        this.c = ackuVar2;
        this.b = ackuVar3;
        this.a = ackuVar4;
        this.e = ackuVar5;
        this.f = ackuVar6;
    }

    public pqq(acku ackuVar, acku ackuVar2, acku ackuVar3, acku ackuVar4, acku ackuVar5, acku ackuVar6, int i, boolean[] zArr) {
        this.g = i;
        this.d = ackuVar;
        this.e = ackuVar2;
        this.a = ackuVar3;
        this.c = ackuVar4;
        this.b = ackuVar5;
        this.f = ackuVar6;
    }

    public pqq(acku ackuVar, acku ackuVar2, acku ackuVar3, acku ackuVar4, acku ackuVar5, acku ackuVar6, int i, byte[][] bArr) {
        this.g = i;
        this.f = ackuVar;
        this.e = ackuVar2;
        this.d = ackuVar3;
        this.c = ackuVar4;
        this.b = ackuVar5;
        this.a = ackuVar6;
    }

    public pqq(acku ackuVar, acku ackuVar2, acku ackuVar3, acku ackuVar4, acku ackuVar5, acku ackuVar6, int i, char[][] cArr) {
        this.g = i;
        this.a = ackuVar;
        this.e = ackuVar2;
        this.b = ackuVar3;
        this.d = ackuVar4;
        this.c = ackuVar5;
        this.f = ackuVar6;
    }
}
