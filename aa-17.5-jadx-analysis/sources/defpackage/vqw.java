package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class vqw implements ackr {
    private final acku a;
    private final acku b;
    private final acku c;
    private final acku d;
    private final acku e;
    private final /* synthetic */ int f;

    public vqw(acku ackuVar, acku ackuVar2, acku ackuVar3, acku ackuVar4, acku ackuVar5, int i) {
        this.f = i;
        this.a = ackuVar;
        this.b = ackuVar2;
        this.c = ackuVar3;
        this.d = ackuVar4;
        this.e = ackuVar5;
    }

    @Override // defpackage.aezk, defpackage.aezj
    public final /* synthetic */ Object a() {
        int i = this.f;
        if (i == 0) {
            acku ackuVar = this.c;
            acku ackuVar2 = this.b;
            String strA = ((vsd) this.a).a();
            aacq aacqVarA = ((vro) ackuVar2).a();
            tmb tmbVar = (tmb) ackuVar.a();
            return new vuo(strA, aacqVarA, tmbVar, this.d);
        }
        if (i == 1) {
            Executor executor = (Executor) this.d.a();
            acku ackuVar3 = this.e;
            return new voy(executor, ((ackv) this.b).a(), ((vov) this.c).a(), (tmb) ackuVar3.a(), this.a);
        }
        if (i == 2) {
            Object obj = ((acks) this.b).b;
            acku ackuVar4 = this.d;
            return new vub(((vrz) this.a).a(), ackq.b(ackuVar4), (xxh) obj, (Executor) this.c.a(), (vqk) this.e.a());
        }
        if (i == 3) {
            acku ackuVar5 = this.c;
            wci wciVarA = ((vrz) this.b).a();
            return new vwi(wciVarA, (Executor) this.d.a(), ackq.b(this.e), this.a);
        }
        acku ackuVar6 = this.d;
        wci wciVarA2 = ((vrz) this.c).a();
        zgt zgtVar = (zgt) ackuVar6.a();
        acku ackuVar7 = this.a;
        return new vxn(wciVarA2, zgtVar, ackq.b(ackuVar7), this.b, this.e);
    }

    public vqw(acku ackuVar, acku ackuVar2, acku ackuVar3, acku ackuVar4, acku ackuVar5, int i, byte[] bArr) {
        this.f = i;
        this.d = ackuVar;
        this.b = ackuVar2;
        this.c = ackuVar3;
        this.e = ackuVar4;
        this.a = ackuVar5;
    }

    public vqw(acku ackuVar, acku ackuVar2, acku ackuVar3, acku ackuVar4, acku ackuVar5, int i, char[] cArr) {
        this.f = i;
        this.a = ackuVar;
        this.d = ackuVar2;
        this.b = ackuVar3;
        this.c = ackuVar4;
        this.e = ackuVar5;
    }

    public vqw(acku ackuVar, acku ackuVar2, acku ackuVar3, acku ackuVar4, acku ackuVar5, int i, int[] iArr) {
        this.f = i;
        this.c = ackuVar;
        this.d = ackuVar2;
        this.a = ackuVar3;
        this.b = ackuVar4;
        this.e = ackuVar5;
    }

    public vqw(acku ackuVar, acku ackuVar2, acku ackuVar3, acku ackuVar4, acku ackuVar5, int i, short[] sArr) {
        this.f = i;
        this.b = ackuVar;
        this.c = ackuVar2;
        this.d = ackuVar3;
        this.e = ackuVar4;
        this.a = ackuVar5;
    }
}
