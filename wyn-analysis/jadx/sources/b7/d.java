package b7;

import A.AbstractC0213f;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.o;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public J1.b f19376a;

    /* renamed from: b, reason: collision with root package name */
    public Context f19377b;

    /* renamed from: g, reason: collision with root package name */
    public Executor f19382g;

    /* renamed from: h, reason: collision with root package name */
    public volatile K1.a f19383h;

    /* renamed from: i, reason: collision with root package name */
    public volatile K1.a f19384i;
    public final Set k;

    /* renamed from: c, reason: collision with root package name */
    public boolean f19378c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f19379d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f19380e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f19381f = false;

    /* renamed from: j, reason: collision with root package name */
    public final Semaphore f19385j = new Semaphore(0);

    public d(SignInHubActivity signInHubActivity, Set set) {
        this.f19377b = signInHubActivity.getApplicationContext();
        this.k = set;
    }

    public final void a() {
        if (this.f19383h != null) {
            boolean z2 = this.f19378c;
            if (!z2) {
                if (z2) {
                    c();
                } else {
                    this.f19381f = true;
                }
            }
            if (this.f19384i != null) {
                this.f19383h.getClass();
                this.f19383h = null;
                return;
            }
            this.f19383h.getClass();
            K1.a aVar = this.f19383h;
            aVar.f6328c.set(true);
            if (aVar.f6326a.cancel(false)) {
                this.f19384i = this.f19383h;
            }
            this.f19383h = null;
        }
    }

    public final void b() {
        if (this.f19384i != null || this.f19383h == null) {
            return;
        }
        this.f19383h.getClass();
        if (this.f19382g == null) {
            this.f19382g = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        K1.a aVar = this.f19383h;
        Executor executor = this.f19382g;
        if (aVar.f6327b == 1) {
            aVar.f6327b = 2;
            executor.execute(aVar.f6326a);
            return;
        }
        int iF = AbstractC0213f.f(aVar.f6327b);
        if (iF == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (iF == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    public final void c() {
        a();
        this.f19383h = new K1.a(this);
        b();
    }

    public final void d() throws InterruptedException {
        Iterator it = this.k.iterator();
        if (it.hasNext()) {
            ((o) it.next()).getClass();
            throw new UnsupportedOperationException();
        }
        try {
            this.f19385j.tryAcquire(0, 5L, TimeUnit.SECONDS);
        } catch (InterruptedException e7) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e7);
            Thread.currentThread().interrupt();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        Class<?> cls = getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append(" id=0}");
        return sb2.toString();
    }
}
