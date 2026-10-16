package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class iyl implements izr {
    public static final ypf a = ols.R("CAR.GAL.GAL");
    public izt b;
    public final Context c;
    public final boolean e;
    public boolean g;
    public final jae h;
    private Handler i;
    private Runnable j;
    public volatile boolean d = false;
    public final Object f = new Object();

    public iyl(Context context, jae jaeVar, boolean z) {
        this.c = context;
        this.h = jaeVar;
        this.e = z;
    }

    public final void a() {
        Runnable runnable;
        synchronized (this.f) {
            Handler handler = this.i;
            if (handler != null && (runnable = this.j) != null) {
                handler.removeCallbacks(runnable);
            }
        }
    }

    public final void b(boolean z, xhv xhvVar) {
        synchronized (this.f) {
            if (this.g) {
                a.f().ai(1641).u("Ignoring byebye on released handler");
                return;
            }
            this.i = new sss(Looper.getMainLooper(), (byte[]) null);
            ire ireVar = new ire(this, 8, null);
            this.j = ireVar;
            this.i.postDelayed(ireVar, 200L);
            this.d = true;
            izt iztVar = this.b;
            if (iztVar != null) {
                iztVar.c(xhvVar);
                if (acrb.y()) {
                    jae jaeVar = this.h;
                    if (z) {
                        if (acrb.y()) {
                            ((joi) jaeVar).e.post(new jlh(jaeVar, xhvVar, 6, (char[]) null));
                            return;
                        } else {
                            ((ype) ((ype) joi.a.g()).ai((char) 2484)).u("onPctsByeByeMessageSent invoked, flag is disabled.");
                            return;
                        }
                    }
                    if (acrb.y()) {
                        ((joi) jaeVar).e.post(new jlh(jaeVar, xhvVar, 5, (char[]) null));
                    } else {
                        ((ype) ((ype) joi.a.g()).ai((char) 2483)).u("onByeByeMessageSent invoked, flag is disabled.");
                    }
                }
            }
        }
    }
}
