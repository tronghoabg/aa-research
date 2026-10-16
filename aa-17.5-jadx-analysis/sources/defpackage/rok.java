package defpackage;

import android.os.Looper;
import android.os.Message;

/* loaded from: classes2.dex */
final class rok extends sss {
    final /* synthetic */ rol a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rok(rol rolVar, Looper looper) {
        super(looper);
        this.a = rolVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        qsv qsvVar = this.a.b;
        if (qsvVar == null || message.what != 3) {
            return;
        }
        qsvVar.a((byte[]) message.obj);
    }
}
