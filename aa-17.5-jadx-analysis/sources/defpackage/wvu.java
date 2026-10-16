package defpackage;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes3.dex */
final class wvu implements Handler.Callback {
    final /* synthetic */ wvw a;

    public wvu(wvw wvwVar) {
        this.a = wvwVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        wvw wvwVar = this.a;
        wvv wvvVar = (wvv) message.obj;
        synchronized (wvwVar.a) {
            if (wvwVar.c == wvvVar || wvwVar.d == wvvVar) {
                wvwVar.d(wvvVar, 2);
            }
        }
        return true;
    }
}
