package androidx.core.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.compose.runtime.composer.linkbuffer.GroupFlagsKt;
import java.io.Closeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.CountDownLatch;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class PendingIntentCompat {

    /* compiled from: WazeSource */
    class Api26Impl {
        private Api26Impl() {
        }

        public static PendingIntent getForegroundService(Context context, int i2, Intent intent, int i3) {
            return PendingIntent.getForegroundService(context, i2, intent, i3);
        }
    }

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    /* compiled from: WazeSource */
    class GatedCallback implements Closeable {
        private PendingIntent.OnFinished mCallback;
        private final CountDownLatch mComplete = new CountDownLatch(1);
        private boolean mSuccess = false;

        GatedCallback(PendingIntent.OnFinished onFinished) {
            this.mCallback = onFinished;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void onSendFinished(PendingIntent pendingIntent, Intent intent, int i2, String str, Bundle bundle) {
            boolean z = false;
            while (true) {
                try {
                    this.mComplete.await();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                    pendingIntent = pendingIntent;
                    intent = intent;
                    i2 = i2;
                    str = str;
                    bundle = bundle;
                } catch (Throwable th) {
                    if (!z) {
                        throw th;
                    }
                    Thread.currentThread().interrupt();
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            PendingIntent.OnFinished onFinished = this.mCallback;
            if (onFinished != null) {
                onFinished.onSendFinished(pendingIntent, intent, i2, str, bundle);
                this.mCallback = null;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.mSuccess) {
                this.mCallback = null;
            }
            this.mComplete.countDown();
        }

        public void complete() {
            this.mSuccess = true;
        }

        public PendingIntent.OnFinished getCallback() {
            if (this.mCallback == null) {
                return null;
            }
            return new PendingIntent.OnFinished() { // from class: androidx.core.app.PendingIntentCompat$GatedCallback$$ExternalSyntheticLambda0
                @Override // android.app.PendingIntent.OnFinished
                public final void onSendFinished(PendingIntent pendingIntent, Intent intent, int i2, String str, Bundle bundle) {
                    this.f$0.onSendFinished(pendingIntent, intent, i2, str, bundle);
                }
            };
        }
    }

    private PendingIntentCompat() {
    }

    static int addMutabilityFlags(boolean z, int i2) {
        int i3;
        if (!z) {
            i3 = 67108864;
        } else {
            if (Build.VERSION.SDK_INT < 31) {
                return i2;
            }
            i3 = GroupFlagsKt.HasAuxSlotFlag;
        }
        return i3 | i2;
    }

    public static PendingIntent getActivities(Context context, int i2, Intent[] intentArr, int i3, Bundle bundle, boolean z) {
        return PendingIntent.getActivities(context, i2, intentArr, addMutabilityFlags(z, i3), bundle);
    }

    public static PendingIntent getActivity(Context context, int i2, Intent intent, int i3, Bundle bundle, boolean z) {
        return PendingIntent.getActivity(context, i2, intent, addMutabilityFlags(z, i3), bundle);
    }

    public static PendingIntent getBroadcast(Context context, int i2, Intent intent, int i3, boolean z) {
        return PendingIntent.getBroadcast(context, i2, intent, addMutabilityFlags(z, i3));
    }

    public static PendingIntent getForegroundService(Context context, int i2, Intent intent, int i3, boolean z) {
        return Api26Impl.getForegroundService(context, i2, intent, addMutabilityFlags(z, i3));
    }

    public static PendingIntent getService(Context context, int i2, Intent intent, int i3, boolean z) {
        return PendingIntent.getService(context, i2, intent, addMutabilityFlags(z, i3));
    }

    public static void send(PendingIntent pendingIntent, int i2, PendingIntent.OnFinished onFinished, Handler handler) {
        GatedCallback gatedCallback = new GatedCallback(onFinished);
        try {
            pendingIntent.send(i2, gatedCallback.getCallback(), handler);
            gatedCallback.complete();
            gatedCallback.close();
        } catch (Throwable th) {
            try {
                gatedCallback.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static PendingIntent getActivities(Context context, int i2, Intent[] intentArr, int i3, boolean z) {
        return PendingIntent.getActivities(context, i2, intentArr, addMutabilityFlags(z, i3));
    }

    public static PendingIntent getActivity(Context context, int i2, Intent intent, int i3, boolean z) {
        return PendingIntent.getActivity(context, i2, intent, addMutabilityFlags(z, i3));
    }

    public static void send(PendingIntent pendingIntent, Context context, int i2, Intent intent, PendingIntent.OnFinished onFinished, Handler handler) {
        send(pendingIntent, context, i2, intent, onFinished, handler, null, null);
    }

    public static void send(PendingIntent pendingIntent, Context context, int i2, Intent intent, PendingIntent.OnFinished onFinished, Handler handler, String str, Bundle bundle) {
        GatedCallback gatedCallback = new GatedCallback(onFinished);
        try {
            pendingIntent.send(context, i2, intent, onFinished, handler, str, bundle);
            gatedCallback.complete();
            gatedCallback.close();
        } finally {
        }
    }
}
