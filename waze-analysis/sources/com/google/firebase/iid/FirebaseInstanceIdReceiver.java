package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.f.v;
import com.google.android.gms.o.ag;
import com.google.firebase.messaging.y;
import java.util.concurrent.ExecutionException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class FirebaseInstanceIdReceiver extends com.google.android.gms.f.g {
    @Override // com.google.android.gms.f.g
    protected final int a(Context context, com.google.android.gms.f.a aVar) {
        try {
            return ((Integer) ag.f(com.google.firebase.messaging.i.b(aVar.a(), context, new v(5)))).intValue();
        } catch (InterruptedException | ExecutionException e2) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e2);
            return 500;
        }
    }

    @Override // com.google.android.gms.f.g
    protected final void c(Bundle bundle) {
        Intent intentPutExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(bundle);
        if (y.p(intentPutExtras)) {
            y.l(intentPutExtras);
        }
    }
}
