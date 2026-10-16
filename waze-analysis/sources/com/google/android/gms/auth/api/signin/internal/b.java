package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.util.Log;
import androidx.loader.content.AsyncTaskLoader;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b extends AsyncTaskLoader {

    /* renamed from: a, reason: collision with root package name */
    private final Semaphore f4618a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f4619b;

    public b(Context context, Set set) {
        super(context);
        this.f4618a = new Semaphore(0);
        this.f4619b = set;
    }

    @Override // androidx.loader.content.AsyncTaskLoader
    public final /* bridge */ /* synthetic */ Object loadInBackground() throws InterruptedException {
        Iterator it = this.f4619b.iterator();
        if (it.hasNext()) {
            throw new UnsupportedOperationException();
        }
        try {
            this.f4618a.tryAcquire(0, 5L, TimeUnit.SECONDS);
            return null;
        } catch (InterruptedException e2) {
            Log.i("GACSignInLoader", "Unexpected InterruptedException", e2);
            Thread.currentThread().interrupt();
            return null;
        }
    }

    @Override // androidx.loader.content.Loader
    protected final void onStartLoading() {
        this.f4618a.drainPermits();
        forceLoad();
    }
}
