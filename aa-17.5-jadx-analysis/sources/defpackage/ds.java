package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes2.dex */
final class ds extends Handler {
    final /* synthetic */ du a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ds(du duVar, Looper looper) {
        super(looper);
        this.a = duVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        dv dvVar;
        ds dsVar;
        if (message.what == 1) {
            du duVar = this.a;
            synchronized (duVar.a) {
                dvVar = (dv) duVar.c.get();
                dsVar = duVar.d;
            }
            if (dvVar == null || this.a != dvVar.a() || dsVar == null) {
                return;
            }
            dvVar.d();
            dvVar.d();
        }
    }
}
