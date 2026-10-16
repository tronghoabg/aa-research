package androidx.work.impl.background.systemalarm;

import A7.RunnableC0299w0;
import J3.r;
import K3.q;
import R8.v;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f19074a = r.f("ConstrntProxyUpdtRecvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            q.c(context).f6504d.v(new RunnableC0299w0(13, intent, context, goAsync(), false));
        } else {
            r.d().a(f19074a, v.f("Ignoring unknown action ", action));
        }
    }
}
