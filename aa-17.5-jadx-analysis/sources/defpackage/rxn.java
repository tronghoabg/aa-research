package defpackage;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class rxn extends HandlerThread {
    private final ykd a;

    public rxn(ykd ykdVar) {
        super("Bug report processor thread", 10);
        this.a = ykdVar;
    }

    @Override // android.os.HandlerThread
    protected final void onLooperPrepared() {
        super.onLooperPrepared();
        Looper looper = getLooper();
        Object obj = this.a.a;
        synchronized (rxk.b) {
            rxk.a.l().ai(8477).u("Looper prepared, creating handler.");
            rxm rxmVar = ((rxk) obj).c;
            rxm.a.l().ai(8498).u("Creating bug report handler with looper.");
            Context context = rxmVar.c;
            rxl rxlVar = new rxl(looper, context, rxmVar.b, new rxo(context));
            if (((rxk) obj).h) {
                rxlVar.d = UUID.randomUUID().toString();
                rxlVar.sendEmptyMessage(2);
                rxlVar.sendEmptyMessage(1);
                ((rxk) obj).g = xxh.h(rxlVar);
            }
        }
    }
}
