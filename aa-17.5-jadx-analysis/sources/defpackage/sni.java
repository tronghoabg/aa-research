package defpackage;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* loaded from: classes.dex */
final class sni extends sss {
    final /* synthetic */ snp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sni(snp snpVar, Looper looper) {
        super(looper);
        this.a = snpVar;
    }

    private static final void a(Message message) {
        snj snjVar = (snj) message.obj;
        if (snjVar != null) {
            snjVar.e();
        }
    }

    private static final boolean b(Message message) {
        return message.what == 2 || message.what == 1 || message.what == 7;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, slz] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) throws ClassNotFoundException {
        Object obj;
        snp snpVar = this.a;
        if (snpVar.o.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        if ((message.what == 1 || message.what == 7 || message.what == 4 || message.what == 5) && !snpVar.q()) {
            a(message);
            return;
        }
        if (message.what == 4) {
            snpVar.l = new ConnectionResult(1, message.arg2, null, null, null);
            if (!snpVar.m && !TextUtils.isEmpty(snpVar.c()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(snpVar.c());
                    this.a.G(3, null);
                    return;
                } catch (ClassNotFoundException unused) {
                }
            }
            snp snpVar2 = this.a;
            ConnectionResult connectionResult = snpVar2.l;
            if (connectionResult == null) {
                connectionResult = new ConnectionResult(1, 8, null, null, null);
            }
            snpVar2.f.a(connectionResult);
            System.currentTimeMillis();
            return;
        }
        if (message.what == 5) {
            snp snpVar3 = this.a;
            ConnectionResult connectionResult2 = snpVar3.l;
            if (connectionResult2 == null) {
                connectionResult2 = new ConnectionResult(1, 8, null, null, null);
            }
            snpVar3.f.a(connectionResult2);
            System.currentTimeMillis();
            return;
        }
        if (message.what == 3) {
            this.a.f.a(new ConnectionResult(1, message.arg2, message.obj instanceof PendingIntent ? (PendingIntent) message.obj : null, null, null));
            System.currentTimeMillis();
            return;
        }
        if (message.what == 6) {
            snp snpVar4 = this.a;
            snpVar4.G(5, null);
            wyd wydVar = snpVar4.t;
            if (wydVar != null) {
                wydVar.a.b(message.arg2);
            }
            int i = message.arg2;
            snpVar4.E();
            snpVar4.F(5, 1, null);
            return;
        }
        if (message.what == 2 && !this.a.p()) {
            a(message);
            return;
        }
        if (!b(message)) {
            Log.wtf("GmsClient", a.cc(message, "Don't know how to handle message: "), new Exception());
            return;
        }
        snj snjVar = (snj) message.obj;
        synchronized (snjVar) {
            obj = snjVar.d;
            if (snjVar.e) {
                Log.w("GmsClient", a.bW(snjVar, "Callback proxy ", " being reused. This is not safe."));
            }
        }
        if (obj != null) {
            snjVar.c();
        }
        synchronized (snjVar) {
            snjVar.e = true;
        }
        snjVar.e();
    }
}
