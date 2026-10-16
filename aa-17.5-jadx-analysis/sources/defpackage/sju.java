package defpackage;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* loaded from: classes2.dex */
final class sju extends sss {
    final /* synthetic */ sjv a;
    private final Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sju(sjv sjvVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.a = sjvVar;
        this.b = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what != 1) {
            Log.w("GoogleApiAvailability", a.cc(message, "Don't know how to handle this message: "));
            return;
        }
        sjv sjvVar = this.a;
        Context context = this.b;
        int iL = sjvVar.l(context, 17895000);
        boolean z = skm.a;
        if (iL == 1 || iL == 2 || iL == 3 || iL == 9) {
            sjvVar.i(context, iL);
        }
    }
}
