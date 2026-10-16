package d7;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zau;

/* loaded from: classes3.dex */
public final class l extends zau {

    /* renamed from: a, reason: collision with root package name */
    public final Context f34142a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f34143b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(e eVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f34143b = eVar;
        this.f34142a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i5 = message.what;
        if (i5 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i5);
            return;
        }
        int i10 = f.f34128a;
        e eVar = this.f34143b;
        Context context = this.f34142a;
        int iD = eVar.d(context, i10);
        int i11 = i.f34135e;
        if (iD == 1 || iD == 2 || iD == 3 || iD == 9) {
            Intent intentB = eVar.b(context, iD, "n");
            eVar.h(context, iD, intentB == null ? null : PendingIntent.getActivity(context, 0, intentB, 201326592));
        }
    }
}
