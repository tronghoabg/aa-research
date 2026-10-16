package K8;

import A7.RunnableC0278p;
import android.app.Application;
import android.content.Context;
import android.os.HandlerThread;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C1690d;
import com.google.android.gms.internal.p002firebaseauthapi.zzg;

/* loaded from: classes4.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public volatile int f6687a;

    /* renamed from: b, reason: collision with root package name */
    public final C0700l f6688b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f6689c;

    public z(s8.g gVar) {
        gVar.a();
        Context context = gVar.f45328a;
        C0700l c0700l = new C0700l();
        C0700l.f6658f.e("Initializing TokenRefresher", new Object[0]);
        HandlerThread handlerThread = new HandlerThread("TokenRefresher", 10);
        handlerThread.start();
        c0700l.f6662d = new zzg(handlerThread.getLooper());
        gVar.a();
        c0700l.f6663e = new RunnableC0278p(c0700l, gVar.f45329b);
        c0700l.f6661c = 300000L;
        this.f6689c = false;
        this.f6687a = 0;
        this.f6688b = c0700l;
        ComponentCallbacks2C1690d.c((Application) context.getApplicationContext());
        ComponentCallbacks2C1690d.f26513e.a(new C(this));
    }

    public final void a(int i5) {
        if (i5 > 0 && this.f6687a == 0) {
            this.f6687a = i5;
            if (this.f6687a > 0 && !this.f6689c) {
                this.f6688b.a();
            }
        } else if (i5 == 0 && this.f6687a != 0) {
            C0700l c0700l = this.f6688b;
            c0700l.f6662d.removeCallbacks(c0700l.f6663e);
        }
        this.f6687a = i5;
    }
}
