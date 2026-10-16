package defpackage;

import android.content.Context;
import java.util.Random;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class vsl implements ackr {
    private final acku a;
    private final acku b;
    private final acku c;
    private final acku d;
    private final acku e;
    private final acku f;
    private final acku g;
    private final /* synthetic */ int h;

    public vsl(acku ackuVar, acku ackuVar2, acku ackuVar3, acku ackuVar4, acku ackuVar5, acku ackuVar6, acku ackuVar7, int i) {
        this.h = i;
        this.a = ackuVar;
        this.b = ackuVar2;
        this.c = ackuVar3;
        this.d = ackuVar4;
        this.e = ackuVar5;
        this.f = ackuVar6;
        this.g = ackuVar7;
    }

    @Override // defpackage.aezk, defpackage.aezj
    public final /* synthetic */ Object a() {
        int i = this.h;
        if (i == 0) {
            Object obj = ((acks) this.b).b;
            wci wciVarA = ((vrz) this.a).a();
            Context context = (Context) obj;
            zgt zgtVar = (zgt) this.c.a();
            acku ackuVar = this.f;
            ackk ackkVarB = ackq.b(this.d);
            return new vsi(wciVarA, context, zgtVar, ackkVarB, this.e, this.g);
        }
        if (i == 1) {
            voy voyVar = (voy) this.a.a();
            xxh xxhVar = (xxh) ((acks) this.b).b;
            tmb tmbVar = (tmb) this.f.a();
            acku ackuVar2 = this.d;
            acku ackuVar3 = this.e;
            return new vsq(voyVar, xxhVar, tmbVar, this.c, this.g, ackuVar3, ackuVar2);
        }
        if (i == 2) {
            vqe vqeVar = (vqe) this.c.a();
            zgt zgtVar2 = (zgt) this.d.a();
            Executor executor = (Executor) this.f.a();
            acku ackuVar4 = this.g;
            acku ackuVar5 = this.a;
            return new vve(vqeVar, zgtVar2, executor, ackq.b(this.b), ackq.b(this.e), ackq.b(ackuVar5), (Random) ackuVar4.a());
        }
        if (i == 3) {
            Object obj2 = ((acks) this.f).b;
            return new vwq(((vrz) this.a).a(), (Context) obj2, (vqe) this.c.a(), (Executor) this.d.a(), ackq.b(this.b), ((vxz) this.e).a(), this.g);
        }
        acku ackuVar6 = this.b;
        wci wciVarA2 = ((vrz) this.d).a();
        Executor executor2 = (Executor) ackuVar6.a();
        acku ackuVar7 = this.c;
        acku ackuVar8 = this.f;
        ackk ackkVarB2 = ackq.b(this.g);
        ackk ackkVarB3 = ackq.b(ackuVar8);
        rod rodVarA = ((vyb) ackuVar7).a();
        return new vxe(wciVarA2, executor2, ackkVarB2, ackkVarB3, this.a, this.e, rodVarA);
    }

    public vsl(acku ackuVar, acku ackuVar2, acku ackuVar3, acku ackuVar4, acku ackuVar5, acku ackuVar6, acku ackuVar7, int i, byte[] bArr) {
        this.h = i;
        this.a = ackuVar;
        this.b = ackuVar2;
        this.f = ackuVar3;
        this.c = ackuVar4;
        this.g = ackuVar5;
        this.e = ackuVar6;
        this.d = ackuVar7;
    }

    public vsl(acku ackuVar, acku ackuVar2, acku ackuVar3, acku ackuVar4, acku ackuVar5, acku ackuVar6, acku ackuVar7, int i, char[] cArr) {
        this.h = i;
        this.c = ackuVar;
        this.d = ackuVar2;
        this.f = ackuVar3;
        this.b = ackuVar4;
        this.e = ackuVar5;
        this.a = ackuVar6;
        this.g = ackuVar7;
    }

    public vsl(acku ackuVar, acku ackuVar2, acku ackuVar3, acku ackuVar4, acku ackuVar5, acku ackuVar6, acku ackuVar7, int i, int[] iArr) {
        this.h = i;
        this.d = ackuVar;
        this.b = ackuVar2;
        this.g = ackuVar3;
        this.f = ackuVar4;
        this.a = ackuVar5;
        this.e = ackuVar6;
        this.c = ackuVar7;
    }

    public vsl(acku ackuVar, acku ackuVar2, acku ackuVar3, acku ackuVar4, acku ackuVar5, acku ackuVar6, acku ackuVar7, int i, short[] sArr) {
        this.h = i;
        this.a = ackuVar;
        this.f = ackuVar2;
        this.c = ackuVar3;
        this.d = ackuVar4;
        this.b = ackuVar5;
        this.e = ackuVar6;
        this.g = ackuVar7;
    }
}
