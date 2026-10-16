package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class uza implements ackr {
    private final acku a;
    private final acku b;
    private final /* synthetic */ int c;

    public uza(acku ackuVar, acku ackuVar2, int i) {
        this.c = i;
        this.a = ackuVar;
        this.b = ackuVar2;
    }

    @Override // defpackage.aezk, defpackage.aezj
    public final /* synthetic */ Object a() {
        int i = this.c;
        if (i == 0) {
            return new aacq((Context) this.a.a(), (Executor) ((uxv) this.b).b());
        }
        acku ackuVar = this.a;
        if (i != 1) {
            Context context = (Context) ackuVar.a();
            return new vja(context);
        }
        uyu uyuVar = (uyu) ((acks) ackuVar).b;
        ygp ygpVar = new ygp();
        if (uyuVar.a) {
            ygpVar.c((yqt) this.b.a());
        }
        return new zjg((yqt[]) ygpVar.g().toArray(new yqt[0]));
    }
}
