package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class vvk implements ackr {
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

    public vvk(acku ackuVar, acku ackuVar2, acku ackuVar3, acku ackuVar4, acku ackuVar5, acku ackuVar6, acku ackuVar7, acku ackuVar8, acku ackuVar9, acku ackuVar10, acku ackuVar11, int i) {
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
        if (this.l != 0) {
            Object obj = ((acks) this.j).b;
            wci wciVarA = ((vrz) this.a).a();
            Context context = (Context) obj;
            Executor executor = (Executor) this.k.a();
            acku ackuVar = this.d;
            acku ackuVar2 = this.f;
            vtq vtqVarA = ((vtr) this.c).a();
            ackk ackkVarB = ackq.b(ackuVar2);
            voy voyVar = (voy) ackuVar.a();
            rdx rdxVar = (rdx) this.i.a();
            acku ackuVar3 = this.e;
            acku ackuVar4 = this.b;
            return new vtt(wciVarA, context, executor, vtqVarA, this.h, ackkVarB, voyVar, rdxVar, this.g, ackuVar4, ackuVar3);
        }
        acku ackuVar5 = this.b;
        wci wciVarA2 = ((vrz) this.a).a();
        acku ackuVar6 = this.e;
        Object objA = this.d.a();
        zgt zgtVar = (zgt) ackuVar6.a();
        acku ackuVar7 = this.h;
        acku ackuVar8 = this.g;
        ackk ackkVarB2 = ackq.b(this.f);
        Object objA2 = ackuVar8.a();
        return new vvj(wciVarA2, (vve) objA, zgtVar, ackkVarB2, (vvp) objA2, (vll) ackuVar7.a(), this.i, (Executor) this.j.a(), (xxh) ((acks) this.k).b);
    }

    public vvk(acku ackuVar, acku ackuVar2, acku ackuVar3, acku ackuVar4, acku ackuVar5, acku ackuVar6, acku ackuVar7, acku ackuVar8, acku ackuVar9, acku ackuVar10, acku ackuVar11, int i, byte[] bArr) {
        this.l = i;
        this.a = ackuVar;
        this.j = ackuVar2;
        this.k = ackuVar3;
        this.c = ackuVar4;
        this.h = ackuVar5;
        this.f = ackuVar6;
        this.d = ackuVar7;
        this.i = ackuVar8;
        this.g = ackuVar9;
        this.b = ackuVar10;
        this.e = ackuVar11;
    }
}
