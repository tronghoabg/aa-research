package defpackage;

import android.app.Activity;
import android.os.Handler;
import java.util.Iterator;

/* loaded from: classes.dex */
final class vqo extends vqp {
    final /* synthetic */ vqq a;

    public vqo(vqq vqqVar) {
        this.a = vqqVar;
    }

    @Override // defpackage.vqp, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        vqq vqqVar = this.a;
        int i = vqqVar.b - 1;
        vqqVar.b = i;
        if (i == 0) {
            vqqVar.h = vky.c(null, activity.getClass());
            Handler handler = vqqVar.e;
            wub.K(handler, new Object[0]);
            Runnable runnable = vqqVar.f;
            wub.K(runnable, new Object[0]);
            handler.postDelayed(runnable, 700L);
        }
    }

    @Override // defpackage.vqp, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        vqq vqqVar = this.a;
        int i = vqqVar.b + 1;
        vqqVar.b = i;
        if (i == 1) {
            if (vqqVar.c) {
                Iterator it = vqqVar.g.iterator();
                while (it.hasNext()) {
                    ((vpy) it.next()).l(vky.c(null, activity.getClass()));
                }
                vqqVar.c = false;
                return;
            }
            Handler handler = vqqVar.e;
            wub.K(handler, new Object[0]);
            Runnable runnable = vqqVar.f;
            wub.K(runnable, new Object[0]);
            handler.removeCallbacks(runnable);
        }
    }

    @Override // defpackage.vqp, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        vqq vqqVar = this.a;
        int i = vqqVar.a + 1;
        vqqVar.a = i;
        if (i == 1 && vqqVar.d) {
            for (vpy vpyVar : vqqVar.g) {
                vky.c(null, activity.getClass());
            }
            vqqVar.d = false;
        }
    }

    @Override // defpackage.vqp, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        vqq vqqVar = this.a;
        vqqVar.a--;
        vky.c(null, activity.getClass());
        vqqVar.a();
    }
}
