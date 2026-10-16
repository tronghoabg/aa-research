package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
public final class uap implements ackr {
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
    private final acku k;
    private final /* synthetic */ int l;

    public uap(acku ackuVar, acku ackuVar2, acku ackuVar3, acku ackuVar4, acku ackuVar5, acku ackuVar6, acku ackuVar7, acku ackuVar8, acku ackuVar9, acku ackuVar10, acku ackuVar11, int i) {
        this.l = i;
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
        this.k = ackuVar11;
    }

    @Override // defpackage.aezk, defpackage.aezj
    public final /* synthetic */ Object a() {
        if (this.l == 0) {
            Object obj = ((acks) this.b).b;
            Runnable runnableA = ((pqi) this.a).a();
            xxh xxhVar = (xxh) obj;
            tsn tsnVar = (tsn) this.d.a();
            acku ackuVar = this.i;
            acku ackuVar2 = this.h;
            acku ackuVar3 = this.g;
            acku ackuVar4 = this.f;
            ackk ackkVarB = ackq.b(this.e);
            ackk ackkVarB2 = ackq.b(ackuVar4);
            zgt zgtVarB = ((uxv) ackuVar3).b();
            ackk ackkVarB3 = ackq.b(ackuVar2);
            tmb tmbVar = (tmb) ackuVar.a();
            return new uns(runnableA, xxhVar, this.c, tsnVar, ackkVarB, ackkVarB2, zgtVarB, ackkVarB3, tmbVar, (uaj) this.k.a());
        }
        Context context = (Context) this.g.a();
        acku ackuVar5 = this.c;
        acku ackuVar6 = this.a;
        acku ackuVar7 = this.d;
        acku ackuVar8 = this.i;
        ackk ackkVarB4 = ackq.b(this.b);
        ackk ackkVarB5 = ackq.b(ackuVar8);
        ackk ackkVarB6 = ackq.b(ackuVar7);
        ackk ackkVarB7 = ackq.b(ackuVar6);
        ackq.b(ackuVar5);
        pmy pmyVar = (pmy) this.j.a();
        ((pxi) this.k).a();
        acku ackuVar9 = this.h;
        zgt zgtVarB2 = ((uxv) this.f).b();
        ackk ackkVarB8 = ackq.b(ackuVar9);
        vaq.d();
        return new ppu(context, ackkVarB4, ackkVarB5, ackkVarB6, ackkVarB7, pmyVar, zgtVarB2, ackkVarB8);
    }

    public uap(acku ackuVar, acku ackuVar2, acku ackuVar3, acku ackuVar4, acku ackuVar5, acku ackuVar6, acku ackuVar7, acku ackuVar8, acku ackuVar9, acku ackuVar10, acku ackuVar11, int i, byte[] bArr) {
        this.l = i;
        this.g = ackuVar;
        this.e = ackuVar2;
        this.b = ackuVar3;
        this.i = ackuVar4;
        this.d = ackuVar5;
        this.a = ackuVar6;
        this.c = ackuVar7;
        this.j = ackuVar8;
        this.k = ackuVar9;
        this.f = ackuVar10;
        this.h = ackuVar11;
    }
}
