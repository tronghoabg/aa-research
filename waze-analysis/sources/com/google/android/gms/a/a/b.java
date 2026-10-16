package com.google.android.gms.a.a;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class b extends Thread {

    /* renamed from: a, reason: collision with root package name */
    final CountDownLatch f4374a;

    /* renamed from: b, reason: collision with root package name */
    private final WeakReference f4375b;

    /* renamed from: c, reason: collision with root package name */
    private final long f4376c;

    public b(d dVar, long j2) {
        super("AdIdClientAutoDisconnectThread");
        this.f4375b = new WeakReference(dVar);
        this.f4376c = j2;
        this.f4374a = new CountDownLatch(1);
        start();
    }

    private final void a() {
        d dVar = (d) this.f4375b.get();
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.f4374a.await(this.f4376c, TimeUnit.MILLISECONDS)) {
                return;
            }
            a();
        } catch (InterruptedException unused) {
            a();
        }
    }
}
