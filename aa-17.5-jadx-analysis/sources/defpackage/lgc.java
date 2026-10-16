package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import com.google.android.apps.auto.components.graphics.icon.GhIcon;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class lgc implements Runnable {
    final Context a;
    public final Message b;
    final Executor c;
    final int d;
    final /* synthetic */ GhIcon e;

    public lgc(GhIcon ghIcon, Context context, int i, Handler handler, Executor executor, ajmd ajmdVar) {
        this.e = ghIcon;
        this.a = context;
        this.d = i;
        this.c = executor;
        this.b = Message.obtain(handler, new kzu(this, ajmdVar, 4));
    }

    @Override // java.lang.Runnable
    public final void run() {
        GhIcon ghIcon = this.e;
        Context context = this.a;
        int i = this.d;
        Message message = this.b;
        message.obj = ghIcon.f(context, i);
        message.sendToTarget();
    }
}
