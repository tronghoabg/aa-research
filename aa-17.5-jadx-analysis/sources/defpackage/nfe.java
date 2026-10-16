package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class nfe extends BroadcastReceiver {
    final /* synthetic */ nff a;

    public nfe(nff nffVar) {
        this.a = nffVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        this.a.m(Boolean.valueOf(mva.q(context)));
    }
}
