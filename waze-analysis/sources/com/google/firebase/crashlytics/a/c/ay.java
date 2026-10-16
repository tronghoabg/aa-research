package com.google.firebase.crashlytics.a.c;

import android.os.Looper;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ay {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f9162a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final ExecutorService f9163b = an.a("awaitEvenIfOnMainThread task continuation executor");

    public static Object a(com.google.android.gms.o.t tVar) throws InterruptedException, TimeoutException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        tVar.b(f9163b, new aw(countDownLatch, 2));
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(3L, TimeUnit.SECONDS);
        } else {
            countDownLatch.await(4L, TimeUnit.SECONDS);
        }
        if (tVar.k()) {
            return tVar.g();
        }
        if (tVar.i()) {
            throw new CancellationException("Task is already canceled");
        }
        if (tVar.j()) {
            throw new IllegalStateException(tVar.f());
        }
        throw new TimeoutException();
    }
}
