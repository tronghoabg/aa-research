package C8;

import android.app.Application;
import android.content.Context;
import com.google.android.gms.common.api.internal.ComponentCallbacks2C1690d;
import com.google.android.gms.common.internal.AbstractC1732v;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import za.C4658a;

/* loaded from: classes4.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final h f1953a;

    /* renamed from: b, reason: collision with root package name */
    public final C4658a f1954b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f1955c;

    /* renamed from: d, reason: collision with root package name */
    public volatile int f1956d;

    /* renamed from: e, reason: collision with root package name */
    public volatile long f1957e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f1958f;

    public n(Context context, f fVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        AbstractC1732v.i(context);
        AbstractC1732v.i(fVar);
        h hVar = new h(fVar, executor, scheduledExecutorService);
        C4658a c4658a = new C4658a(15);
        this.f1953a = hVar;
        this.f1954b = c4658a;
        this.f1957e = -1L;
        ComponentCallbacks2C1690d.c((Application) context.getApplicationContext());
        ComponentCallbacks2C1690d.f26513e.a(new m(this, hVar, c4658a));
    }

    public final void a(int i5) {
        if (this.f1956d == 0 && i5 > 0) {
            this.f1956d = i5;
            if (b()) {
                h hVar = this.f1953a;
                long j8 = this.f1957e;
                this.f1954b.getClass();
                hVar.b(j8 - System.currentTimeMillis());
            }
        } else if (this.f1956d > 0 && i5 == 0) {
            this.f1953a.a();
        }
        this.f1956d = i5;
    }

    public final boolean b() {
        return this.f1958f && !this.f1955c && this.f1956d > 0 && this.f1957e != -1;
    }
}
