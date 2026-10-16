package androidx.work.impl.diagnostics;

import A7.C0237b0;
import J3.r;
import K3.q;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;

/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f19083a = r.f("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        r rVarD = r.d();
        String str = f19083a;
        rVarD.a(str, "Requesting diagnostics");
        try {
            q.c(context).a(new C0237b0(DiagnosticsWorker.class).i());
        } catch (IllegalStateException e7) {
            r.d().c(str, "WorkManager is not initialized", e7);
        }
    }
}
