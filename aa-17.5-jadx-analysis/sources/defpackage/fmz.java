package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes2.dex */
public final class fmz extends BroadcastReceiver {
    final /* synthetic */ fna a;

    public fmz(fna fnaVar) {
        this.a = fnaVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        this.a.c(intent);
    }
}
