package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
final class tbh extends BroadcastReceiver {
    final /* synthetic */ tbi a;

    public tbh(tbi tbiVar) {
        this.a = tbiVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.m(intent);
    }
}
