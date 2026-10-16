package R8;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10510a;

    /* renamed from: b, reason: collision with root package name */
    public final R0.e f10511b;

    /* renamed from: c, reason: collision with root package name */
    public final S3.s f10512c;

    /* renamed from: d, reason: collision with root package name */
    public final long f10513d;

    /* renamed from: e, reason: collision with root package name */
    public S3.e f10514e;

    /* renamed from: f, reason: collision with root package name */
    public S3.e f10515f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10516g;

    /* renamed from: h, reason: collision with root package name */
    public m f10517h;

    /* renamed from: i, reason: collision with root package name */
    public final z f10518i;

    /* renamed from: j, reason: collision with root package name */
    public final X8.c f10519j;
    public final N8.a k;

    /* renamed from: l, reason: collision with root package name */
    public final N8.a f10520l;

    /* renamed from: m, reason: collision with root package name */
    public final j f10521m;

    /* renamed from: n, reason: collision with root package name */
    public final O8.a f10522n;

    /* renamed from: o, reason: collision with root package name */
    public final xa.d f10523o;

    /* renamed from: p, reason: collision with root package name */
    public final S8.f f10524p;

    public s(s8.g gVar, z zVar, O8.a aVar, R0.e eVar, N8.a aVar2, N8.a aVar3, X8.c cVar, j jVar, xa.d dVar, S8.f fVar) {
        this.f10511b = eVar;
        gVar.a();
        this.f10510a = gVar.f45328a;
        this.f10518i = zVar;
        this.f10522n = aVar;
        this.k = aVar2;
        this.f10520l = aVar3;
        this.f10519j = cVar;
        this.f10521m = jVar;
        this.f10523o = dVar;
        this.f10524p = fVar;
        this.f10513d = System.currentTimeMillis();
        this.f10512c = new S3.s((byte) 0, 20);
    }

    public final void a(K3.r rVar) {
        S8.f.a();
        S8.f.a();
        this.f10514e.l();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        try {
            try {
                this.k.b(new r(this));
                this.f10517h.h();
                if (!rVar.c().f17033b.f2896a) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                    }
                    throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
                }
                if (!this.f10517h.d(rVar)) {
                    Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                }
                this.f10517h.j(((TaskCompletionSource) ((AtomicReference) rVar.f6519i).get()).getTask());
                c();
            } catch (Exception e7) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e7);
                c();
            }
        } catch (Throwable th) {
            c();
            throw th;
        }
    }

    public final void b(K3.r rVar) {
        Future<?> futureSubmit = this.f10524p.f11034a.f11029a.submit(new n(this, rVar, 1));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e7) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e7);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e10) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e10);
        } catch (TimeoutException e11) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e11);
        }
    }

    public final void c() {
        S8.f.a();
        try {
            S3.e eVar = this.f10514e;
            String str = (String) eVar.f10941b;
            X8.c cVar = (X8.c) eVar.f10942c;
            cVar.getClass();
            if (new File((File) cVar.f16186c, str).delete()) {
                return;
            }
            Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
        } catch (Exception e7) {
            Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e7);
        }
    }
}
