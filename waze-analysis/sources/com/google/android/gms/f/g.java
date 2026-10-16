package com.google.android.gms.f;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.o.ag;
import j$.util.Objects;
import java.lang.ref.SoftReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class g extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private static SoftReference f5228a;

    /* renamed from: b, reason: collision with root package name */
    private static SoftReference f5229b;

    public static /* synthetic */ void b(g gVar, Intent intent, final Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        Executor executorB;
        int iA;
        try {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            if (intent2 != null) {
                iA = gVar.d(intent2);
            } else if (intent.getExtras() == null) {
                iA = 500;
            } else {
                final a aVar = new a(intent);
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                synchronized (g.class) {
                    SoftReference softReference = f5229b;
                    executorB = softReference != null ? (Executor) softReference.get() : null;
                    if (executorB == null) {
                        executorB = com.google.android.gms.k.e.b.d.a().b(new com.google.android.gms.common.util.a.b("pscm-ack-executor"));
                        f5229b = new SoftReference(executorB);
                    }
                }
                executorB.execute(new Runnable() { // from class: com.google.android.gms.f.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.google.android.gms.o.t tVarC;
                        a aVar2 = aVar;
                        int i2 = 1;
                        if (TextUtils.isEmpty(aVar2.c())) {
                            tVarC = ag.c(null);
                        } else {
                            Bundle bundle = new Bundle();
                            bundle.putString("google.message_id", aVar2.c());
                            Integer numB = aVar2.b();
                            if (numB != null) {
                                bundle.putInt("google.product_id", numB.intValue());
                            }
                            Context context2 = context;
                            bundle.putBoolean("supports_message_handled", true);
                            tVarC = t.b(context2).c(2, bundle);
                        }
                        tVarC.n(new v(1), new com.google.android.gms.common.api.internal.b(countDownLatch, i2));
                    }
                });
                iA = gVar.a(context, aVar);
                try {
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    if (!countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                        Log.w("CloudMessagingReceiver", "Message ack timed out");
                    }
                } catch (InterruptedException e2) {
                    Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e2.toString()));
                }
            }
            if (z && pendingResult != null) {
                pendingResult.setResultCode(iA);
            }
        } finally {
            if (pendingResult != null) {
                pendingResult.finish();
            }
        }
    }

    private final int d(Intent intent) throws PendingIntent.CanceledException {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if (Objects.equals(intent.getAction(), "com.google.firebase.messaging.NOTIFICATION_DISMISS")) {
            c(extras);
            return -1;
        }
        Log.e("CloudMessagingReceiver", "Unknown notification action");
        return 500;
    }

    protected abstract int a(Context context, a aVar);

    protected void c(Bundle bundle) {
        throw null;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        ExecutorService executorService;
        if (intent == null) {
            return;
        }
        final boolean zIsOrderedBroadcast = isOrderedBroadcast();
        final BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        synchronized (g.class) {
            SoftReference softReference = f5228a;
            ExecutorService executorServiceUnconfigurableExecutorService = softReference != null ? (ExecutorService) softReference.get() : null;
            if (executorServiceUnconfigurableExecutorService == null) {
                com.google.android.gms.k.e.b.d.a();
                executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new com.google.android.gms.common.util.a.b("firebase-iid-executor")));
                f5228a = new SoftReference(executorServiceUnconfigurableExecutorService);
            }
            executorService = executorServiceUnconfigurableExecutorService;
        }
        executorService.execute(new Runnable() { // from class: com.google.android.gms.f.f
            @Override // java.lang.Runnable
            public final void run() {
                g.b(this.f5223a, intent, context, zIsOrderedBroadcast, pendingResultGoAsync);
            }
        });
    }
}
