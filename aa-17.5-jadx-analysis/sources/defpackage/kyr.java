package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
final class kyr extends Handler {
    final /* synthetic */ kyw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kyr(kyw kywVar, Looper looper) {
        super(looper);
        this.a = kywVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            if (message.what == 2) {
                nfy.a().c(ngb.n);
                return;
            }
            return;
        }
        kyw kywVar = this.a;
        int i = message.arg1;
        if (kywVar.w.e() == osx.LIVE_ACTIVE) {
            ((ype) ((ype) kyw.a.f()).ai((char) 3614)).u("Not triggering assistant education because live is active");
        } else if (i == 1) {
            nfy.a().c(ngb.m);
        } else {
            nfy.a().c(ngb.l);
        }
    }
}
