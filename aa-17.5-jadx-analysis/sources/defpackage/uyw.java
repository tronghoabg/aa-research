package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
public final class uyw implements ackr {
    private final acku a;
    private final acku b;
    private final acku c;
    private final acku d;

    public uyw(acku ackuVar, acku ackuVar2, acku ackuVar3, acku ackuVar4) {
        this.a = ackuVar;
        this.b = ackuVar2;
        this.c = ackuVar3;
        this.d = ackuVar4;
    }

    @Override // defpackage.aezk, defpackage.aezj
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final aacq a() {
        Context context = (Context) this.a.a();
        vja vjaVar = (vja) this.b.a();
        ((uxv) this.c).b();
        return new aacq(context, vjaVar, ((uxv) this.d).b());
    }
}
