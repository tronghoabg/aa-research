package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
public final class uaq implements ackr {
    private final acku a;
    private final acku b;
    private final acku c;
    private final acku d;
    private final acku e;
    private final acku f;
    private final acku g;
    private final acku h;
    private final acku i;
    private final acku j;
    private final /* synthetic */ int k;

    public uaq(acku ackuVar, acku ackuVar2, acku ackuVar3, acku ackuVar4, acku ackuVar5, acku ackuVar6, acku ackuVar7, acku ackuVar8, acku ackuVar9, acku ackuVar10, int i) {
        this.k = i;
        this.a = ackuVar;
        this.b = ackuVar2;
        this.c = ackuVar3;
        this.d = ackuVar4;
        this.e = ackuVar5;
        this.f = ackuVar6;
        this.g = ackuVar7;
        this.h = ackuVar8;
        this.i = ackuVar9;
        this.j = ackuVar10;
    }

    @Override // defpackage.aezk, defpackage.aezj
    public final /* synthetic */ Object a() {
        int i = this.k;
        if (i == 0) {
            tmb tmbVar = (tmb) this.a.a();
            acku ackuVar = this.j;
            acku ackuVar2 = this.i;
            acku ackuVar3 = this.h;
            acku ackuVar4 = this.g;
            acku ackuVar5 = this.f;
            acku ackuVar6 = this.e;
            acku ackuVar7 = this.d;
            ackk ackkVarB = ackq.b(this.c);
            ackk ackkVarB2 = ackq.b(ackuVar7);
            ackk ackkVarB3 = ackq.b(ackuVar6);
            zgt zgtVarA = ((pse) ackuVar5).a();
            zgt zgtVarB = ((uxv) ackuVar4).b();
            ackk ackkVarB4 = ackq.b(ackuVar3);
            achj achjVarA = ((ppm) ackuVar2).a();
            gjv gjvVar = (gjv) ackuVar.a();
            achh achhVar = achjVarA.g;
            if (achhVar == null) {
                achhVar = achh.a;
            }
            achh achhVar2 = achhVar;
            return new unp(tmbVar, ackkVarB, ackkVarB2, ackkVarB3, zgtVarA, zgtVarB, new plb(achhVar2.d, null, null, null), ackkVarB4, achhVar2, gjvVar);
        }
        if (i == 1) {
            acku ackuVar8 = this.d;
            sm smVarA = ((aaaz) this.a).a();
            tsn tsnVar = (tsn) ackuVar8.a();
            acku ackuVar9 = this.f;
            acku ackuVar10 = this.j;
            acku ackuVar11 = this.e;
            ackk ackkVarB5 = ackq.b(this.c);
            zgt zgtVarB2 = ((uxv) ackuVar11).b();
            ackk ackkVarB6 = ackq.b(ackuVar10);
            return new uak(smVarA, tsnVar, ackkVarB5, zgtVarB2, ackkVarB6, ackq.b(this.i), (gjv) this.b.a(), (xxh) ((acks) this.g).b, ackq.b(this.h));
        }
        Context context = (Context) this.a.a();
        tmb tmbVar2 = (tmb) this.e.a();
        acku ackuVar12 = this.f;
        ackk ackkVarB7 = ackq.b(this.g);
        urg urgVar = (urg) ackuVar12.a();
        kex kexVar = (kex) this.d.a();
        ykd ykdVar = (ykd) this.j.a();
        gms gmsVar = (gms) this.c.a();
        upa upaVar = new upa(context, urgVar, (tpa) this.i.a(), tmbVar2, gmsVar, ackkVarB7, ((uxv) this.b).b(), kexVar, ykdVar, (uyp) this.h.a());
        upaVar.h.m(new ueh(upaVar, 20));
        return upaVar;
    }

    public uaq(acku ackuVar, acku ackuVar2, acku ackuVar3, acku ackuVar4, acku ackuVar5, acku ackuVar6, acku ackuVar7, acku ackuVar8, acku ackuVar9, acku ackuVar10, int i, byte[] bArr) {
        this.k = i;
        this.a = ackuVar;
        this.d = ackuVar2;
        this.c = ackuVar3;
        this.e = ackuVar4;
        this.j = ackuVar5;
        this.f = ackuVar6;
        this.i = ackuVar7;
        this.b = ackuVar8;
        this.g = ackuVar9;
        this.h = ackuVar10;
    }

    public uaq(acku ackuVar, acku ackuVar2, acku ackuVar3, acku ackuVar4, acku ackuVar5, acku ackuVar6, acku ackuVar7, acku ackuVar8, acku ackuVar9, acku ackuVar10, int i, char[] cArr) {
        this.k = i;
        this.a = ackuVar;
        this.e = ackuVar2;
        this.g = ackuVar3;
        this.f = ackuVar4;
        this.d = ackuVar5;
        this.j = ackuVar6;
        this.c = ackuVar7;
        this.i = ackuVar8;
        this.b = ackuVar9;
        this.h = ackuVar10;
    }
}
