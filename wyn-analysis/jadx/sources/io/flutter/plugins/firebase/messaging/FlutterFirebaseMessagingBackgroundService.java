package io.flutter.plugins.firebase.messaging;

import Dd.c;
import T3.r;
import android.content.Intent;
import android.os.Handler;
import android.util.Log;
import j$.util.DesugarCollections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import ka.AbstractC3230e0;

/* loaded from: classes5.dex */
public class FlutterFirebaseMessagingBackgroundService extends a {

    /* renamed from: h, reason: collision with root package name */
    public static final List f37174h = DesugarCollections.synchronizedList(new LinkedList());

    /* renamed from: i, reason: collision with root package name */
    public static c f37175i;

    @Override // io.flutter.plugins.firebase.messaging.a
    public final void c(Intent intent) throws InterruptedException {
        f37175i.getClass();
        if (AbstractC3230e0.f39408h.getSharedPreferences("io.flutter.firebase.messaging.callback", 0).getLong("callback_handle", 0L) == 0) {
            Log.w("FLTFireMsgService", "A background message could not be handled in Dart as no onBackgroundMessage handler has been registered.");
            return;
        }
        List list = f37174h;
        synchronized (list) {
            try {
                if (!((AtomicBoolean) f37175i.f2642b).get()) {
                    Log.i("FLTFireMsgService", "Service has not yet started, messages will be queued.");
                    list.add(intent);
                    return;
                }
                CountDownLatch countDownLatch = new CountDownLatch(1);
                new Handler(getMainLooper()).post(new r(21, intent, countDownLatch));
                try {
                    countDownLatch.await();
                } catch (InterruptedException e7) {
                    Log.i("FLTFireMsgService", "Exception waiting to execute Dart callback", e7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.flutter.plugins.firebase.messaging.a, android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (f37175i == null) {
            f37175i = new c(16);
        }
        c cVar = f37175i;
        if (((AtomicBoolean) cVar.f2642b).get()) {
            return;
        }
        long j8 = AbstractC3230e0.f39408h.getSharedPreferences("io.flutter.firebase.messaging.callback", 0).getLong("callback_handle", 0L);
        if (j8 != 0) {
            cVar.R(j8, null);
        }
    }
}
