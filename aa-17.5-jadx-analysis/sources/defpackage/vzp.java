package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class vzp implements ackr {
    private final acku a;
    private final acku b;

    public vzp(acku ackuVar, acku ackuVar2) {
        this.a = ackuVar;
        this.b = ackuVar2;
    }

    @Override // defpackage.aezk, defpackage.aezj
    public final /* synthetic */ Object a() {
        Object obj = ((acks) this.a).b;
        vzn vznVarA = ((vzo) this.b).a();
        return new vzl(((Context) obj).getContentResolver(), vznVarA.a, vznVarA.b);
    }
}
