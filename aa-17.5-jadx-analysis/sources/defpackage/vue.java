package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class vue implements ackr {
    private final acku a;
    private final acku b;
    private final acku c;
    private final /* synthetic */ int d;

    public vue(acku ackuVar, acku ackuVar2, acku ackuVar3, int i) {
        this.d = i;
        this.a = ackuVar;
        this.b = ackuVar2;
        this.c = ackuVar3;
    }

    @Override // defpackage.aezk, defpackage.aezj
    public final /* synthetic */ Object a() {
        if (this.d != 0) {
            return new vkx((zgt) this.a.a(), (vqk) this.b.a(), this.c);
        }
        Object obj = ((acks) this.b).b;
        return new vud(ackq.b(this.a), (xxh) obj, (Executor) this.c.a());
    }
}
