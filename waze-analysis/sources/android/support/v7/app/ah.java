package android.support.v7.app;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class ah extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ai f510a;

    ah(ai aiVar) {
        this.f510a = aiVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f510a.c();
    }
}
