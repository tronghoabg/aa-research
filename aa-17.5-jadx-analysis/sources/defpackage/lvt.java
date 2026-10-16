package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes2.dex */
public final class lvt implements lhg {
    public static final yph a = yph.c("GH.MsgActHandlr");
    boolean b;
    BroadcastReceiver c;
    private final Handler d = new Handler(Looper.getMainLooper());

    public static void a(int i) {
        obs.a().h(mki.a.c, mkn.n, i);
    }

    public final void b(String str, lvi lviVar) {
        this.d.post(new kzu(lviVar.p.getKey(), str, 12, null));
    }

    @Override // defpackage.lhg
    public final void c() {
        yph yphVar = a;
        ((ype) yphVar.l().ai((char) 4344)).u("starting");
        Context context = mki.a.c;
        if (this.c == null) {
            this.c = new lvs(this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.google.android.gearhead.ACTION_HANDLE_CONVERSATION_NOTIFICATION_INTENT");
            dup.e(context, this.c, intentFilter, null, true != actj.A() ? 2 : 4);
            ((ype) ((ype) yphVar.f()).ai((char) 4345)).u("receiver active");
        }
        this.b = true;
    }

    @Override // defpackage.lhg
    public final void d() {
        ((ype) a.l().ai((char) 4346)).u("stopping");
        if (!this.b || this.c == null) {
            return;
        }
        mki.a.c.unregisterReceiver(this.c);
        this.c = null;
        this.b = false;
    }
}
