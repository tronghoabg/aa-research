package defpackage;

import j$.util.Optional;

/* loaded from: classes2.dex */
public final class puz implements ackr {
    private final acku a;
    private final acku b;
    private final acku c;
    private final acku d;

    public puz(acku ackuVar, acku ackuVar2, acku ackuVar3, acku ackuVar4) {
        this.a = ackuVar;
        this.b = ackuVar2;
        this.c = ackuVar3;
        this.d = ackuVar4;
    }

    @Override // defpackage.aezk, defpackage.aezj
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final puy a() {
        Optional optional = (Optional) ((acks) this.b).b;
        return new puy(this.a, optional, ackq.b(this.d));
    }
}
