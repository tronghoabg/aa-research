package com.google.firebase.crashlytics.a.a;

import android.os.Bundle;
import com.google.firebase.crashlytics.a.i;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private final d f9054a;

    /* renamed from: b, reason: collision with root package name */
    private final TimeUnit f9055b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f9056c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private CountDownLatch f9057d;

    public b(d dVar, TimeUnit timeUnit) {
        this.f9054a = dVar;
        this.f9055b = timeUnit;
    }

    @Override // com.google.firebase.crashlytics.a.a.a
    public final void a(Bundle bundle) {
        synchronized (this.f9056c) {
            i.a().g("Logging event _ae to Firebase Analytics with params " + bundle.toString());
            this.f9057d = new CountDownLatch(1);
            this.f9054a.a(bundle);
            i.a().g("Awaiting app exception callback from Analytics...");
            try {
                if (this.f9057d.await(500L, this.f9055b)) {
                    i.a().g("App exception callback received from Analytics listener.");
                } else {
                    i.a().h("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                }
            } catch (InterruptedException unused) {
                i.a().d("Interrupted while awaiting app exception callback from Analytics listener.");
            }
            this.f9057d = null;
        }
    }
}
