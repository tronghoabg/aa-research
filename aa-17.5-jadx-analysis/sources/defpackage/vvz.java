package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class vvz implements ackr {
    private final acku a;
    private final acku b;
    private final acku c;
    private final acku d;
    private final acku e;
    private final acku f;
    private final acku g;
    private final acku h;
    private final acku i;
    private final /* synthetic */ int j;

    public vvz(acku ackuVar, acku ackuVar2, acku ackuVar3, acku ackuVar4, acku ackuVar5, acku ackuVar6, acku ackuVar7, acku ackuVar8, acku ackuVar9, int i) {
        this.j = i;
        this.a = ackuVar;
        this.b = ackuVar2;
        this.c = ackuVar3;
        this.d = ackuVar4;
        this.e = ackuVar5;
        this.f = ackuVar6;
        this.g = ackuVar7;
        this.h = ackuVar8;
        this.i = ackuVar9;
    }

    @Override // defpackage.aezk, defpackage.aezj
    public final /* synthetic */ Object a() {
        int i = this.j;
        acku ackuVar = this.b;
        if (i == 0) {
            Object obj = ((acks) ackuVar).b;
            wci wciVarA = ((vrz) this.a).a();
            Context context = (Context) obj;
            vqe vqeVar = (vqe) this.c.a();
            zgt zgtVar = (zgt) this.d.a();
            acku ackuVar2 = this.h;
            acku ackuVar3 = this.f;
            return new vvy(wciVarA, context, vqeVar, zgtVar, ackq.b(this.e), ackq.b(ackuVar3), this.g, (Executor) ackuVar2.a(), (rju) this.i.a());
        }
        Context context2 = (Context) ((acks) ackuVar).b;
        xxh xxhVar = (xxh) this.h.a();
        acku ackuVar4 = this.a;
        acku ackuVar5 = this.d;
        return new vsb(context2, xxhVar, ((vsd) this.g).a(), this.f, ((vrq) ackuVar5).a(), (xxh) ackuVar4.a(), (xxh) ((acks) this.e).b, (xxh) ((acks) this.c).b, this.i);
    }

    public vvz(acku ackuVar, acku ackuVar2, acku ackuVar3, acku ackuVar4, acku ackuVar5, acku ackuVar6, acku ackuVar7, acku ackuVar8, acku ackuVar9, int i, byte[] bArr) {
        this.j = i;
        this.b = ackuVar;
        this.h = ackuVar2;
        this.g = ackuVar3;
        this.f = ackuVar4;
        this.d = ackuVar5;
        this.a = ackuVar6;
        this.e = ackuVar7;
        this.c = ackuVar8;
        this.i = ackuVar9;
    }
}
