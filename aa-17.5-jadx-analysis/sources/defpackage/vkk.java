package defpackage;

import org.chromium.net.CronetEngine;

/* loaded from: classes3.dex */
public final class vkk implements ackr {
    private final acku a;
    private final acku b;
    private final acku c;

    public vkk(acku ackuVar, acku ackuVar2, acku ackuVar3) {
        this.a = ackuVar;
        this.b = ackuVar2;
        this.c = ackuVar3;
    }

    @Override // defpackage.aezk, defpackage.aezj
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final vkj a() {
        return new vkj((CronetEngine) this.a.a(), (tmb) this.b.a(), ((uxv) this.c).b(), 0);
    }
}
