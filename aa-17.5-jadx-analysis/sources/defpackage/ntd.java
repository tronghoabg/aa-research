package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
final class ntd extends BroadcastReceiver {
    final /* synthetic */ nte a;

    public ntd(nte nteVar) {
        this.a = nteVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.a(context);
    }
}
