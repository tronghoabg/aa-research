package defpackage;

import java.util.Random;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class vpe implements ackr {
    private final acku a;
    private final acku b;
    private final acku c;
    private final acku d;
    private final /* synthetic */ int e;

    public vpe(acku ackuVar, acku ackuVar2, acku ackuVar3, acku ackuVar4, int i) {
        this.e = i;
        this.a = ackuVar;
        this.b = ackuVar2;
        this.c = ackuVar3;
        this.d = ackuVar4;
    }

    @Override // defpackage.aezk, defpackage.aezj
    public final /* synthetic */ Object a() {
        int i = this.e;
        if (i == 0) {
            return new vpd(this.b, this.c, this.d);
        }
        if (i == 1) {
            Executor executor = (!((vlk) this.b.a()).c || ((xxh) ((acks) this.d).b).f()) ? (Executor) this.c.a() : (Executor) this.a.a();
            executor.getClass();
            return executor;
        }
        if (i == 2) {
            return new vqe((vqk) this.d.a(), (vqq) this.c.a(), this.b, this.a);
        }
        Object obj = ((acks) this.c).b;
        return new vyl((Random) ((xxh) obj).d((Random) this.d.a()), (vxt) this.a.a(), (zeq) this.b.a());
    }

    public vpe(acku ackuVar, acku ackuVar2, acku ackuVar3, acku ackuVar4, int i, byte[] bArr) {
        this.e = i;
        this.a = ackuVar;
        this.c = ackuVar2;
        this.b = ackuVar3;
        this.d = ackuVar4;
    }

    public vpe(acku ackuVar, acku ackuVar2, acku ackuVar3, acku ackuVar4, int i, char[] cArr) {
        this.e = i;
        this.d = ackuVar;
        this.c = ackuVar2;
        this.b = ackuVar3;
        this.a = ackuVar4;
    }

    public vpe(acku ackuVar, acku ackuVar2, acku ackuVar3, acku ackuVar4, int i, short[] sArr) {
        this.e = i;
        this.c = ackuVar;
        this.d = ackuVar2;
        this.a = ackuVar3;
        this.b = ackuVar4;
    }
}
