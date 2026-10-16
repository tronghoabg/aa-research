package androidx.media3.common.util;

import android.os.Looper;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface HandlerWrapper {

    /* compiled from: WazeSource */
    public interface Message {
        HandlerWrapper getTarget();

        void sendToTarget();
    }

    Looper getLooper();

    boolean hasMessages(int i2);

    Message obtainMessage(int i2);

    Message obtainMessage(int i2, int i3, int i4);

    Message obtainMessage(int i2, int i3, int i4, Object obj);

    Message obtainMessage(int i2, Object obj);

    boolean post(Runnable runnable);

    boolean postAtFrontOfQueue(Runnable runnable);

    boolean postDelayed(Runnable runnable, long j2);

    void removeCallbacks(Runnable runnable);

    void removeCallbacksAndMessages(Object obj);

    void removeMessages(int i2);

    boolean sendEmptyMessage(int i2);

    boolean sendEmptyMessageAtTime(int i2, long j2);

    boolean sendEmptyMessageDelayed(int i2, int i3);

    boolean sendMessageAtFrontOfQueue(Message message);
}
