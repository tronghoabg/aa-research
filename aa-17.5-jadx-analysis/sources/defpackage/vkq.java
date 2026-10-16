package defpackage;

import android.content.Context;
import org.chromium.net.CronetEngine;

/* loaded from: classes3.dex */
public final class vkq implements ackr {
    private final acku a;
    private final acku b;
    private final acku c;
    private final acku d;
    private final acku e;
    private final acku f;

    public vkq(acku ackuVar, acku ackuVar2, acku ackuVar3, acku ackuVar4, acku ackuVar5, acku ackuVar6) {
        this.a = ackuVar;
        this.b = ackuVar2;
        this.c = ackuVar3;
        this.d = ackuVar4;
        this.e = ackuVar5;
        this.f = ackuVar6;
    }

    @Override // defpackage.aezk, defpackage.aezj
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final vkp a() {
        return new vkp((CronetEngine) this.a.a(), (tmb) this.b.a(), ((uxv) this.c).b(), ((vkl) this.d).a(), this.e, (Context) this.f.a());
    }
}
