package androidx.media3.common.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.common.util.HandlerWrapper;
import com.google.d.b.an;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class SystemHandlerWrapper implements HandlerWrapper {
    private static final int MAX_POOL_SIZE = 50;
    private static final List<SystemMessage> messagePool = new ArrayList(50);
    private final Handler handler;

    /* compiled from: WazeSource */
    final class SystemMessage implements HandlerWrapper.Message {
        private SystemHandlerWrapper handler;
        private Message message;

        private SystemMessage() {
        }

        private void recycle() {
            this.message = null;
            this.handler = null;
            SystemHandlerWrapper.recycleMessage(this);
        }

        @Override // androidx.media3.common.util.HandlerWrapper.Message
        public HandlerWrapper getTarget() {
            SystemHandlerWrapper systemHandlerWrapper = this.handler;
            an.B(systemHandlerWrapper);
            return systemHandlerWrapper;
        }

        public boolean sendAtFrontOfQueue(Handler handler) {
            Message message = this.message;
            an.B(message);
            boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
            recycle();
            return zSendMessageAtFrontOfQueue;
        }

        @Override // androidx.media3.common.util.HandlerWrapper.Message
        public void sendToTarget() {
            Message message = this.message;
            an.B(message);
            message.sendToTarget();
            recycle();
        }

        public SystemMessage setMessage(Message message, SystemHandlerWrapper systemHandlerWrapper) {
            this.message = message;
            this.handler = systemHandlerWrapper;
            return this;
        }
    }

    public SystemHandlerWrapper(Handler handler) {
        this.handler = handler;
    }

    private static SystemMessage obtainSystemMessage() {
        SystemMessage systemMessage;
        List<SystemMessage> list = messagePool;
        synchronized (list) {
            systemMessage = list.isEmpty() ? new SystemMessage() : list.remove(list.size() - 1);
        }
        return systemMessage;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void recycleMessage(SystemMessage systemMessage) {
        List<SystemMessage> list = messagePool;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(systemMessage);
            }
        }
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public Looper getLooper() {
        return this.handler.getLooper();
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public boolean hasMessages(int i2) {
        an.l(i2 != 0);
        return this.handler.hasMessages(i2);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public HandlerWrapper.Message obtainMessage(int i2) {
        Handler handler = this.handler;
        SystemMessage systemMessageObtainSystemMessage = obtainSystemMessage();
        systemMessageObtainSystemMessage.setMessage(handler.obtainMessage(i2), this);
        return systemMessageObtainSystemMessage;
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public boolean post(Runnable runnable) {
        return this.handler.post(runnable);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public boolean postAtFrontOfQueue(Runnable runnable) {
        return this.handler.postAtFrontOfQueue(runnable);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public boolean postDelayed(Runnable runnable, long j2) {
        return this.handler.postDelayed(runnable, j2);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public void removeCallbacks(Runnable runnable) {
        this.handler.removeCallbacks(runnable);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public void removeCallbacksAndMessages(Object obj) {
        this.handler.removeCallbacksAndMessages(obj);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public void removeMessages(int i2) {
        an.l(i2 != 0);
        this.handler.removeMessages(i2);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public boolean sendEmptyMessage(int i2) {
        return this.handler.sendEmptyMessage(i2);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public boolean sendEmptyMessageAtTime(int i2, long j2) {
        return this.handler.sendEmptyMessageAtTime(i2, j2);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public boolean sendEmptyMessageDelayed(int i2, int i3) {
        return this.handler.sendEmptyMessageDelayed(i2, i3);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public boolean sendMessageAtFrontOfQueue(HandlerWrapper.Message message) {
        return ((SystemMessage) message).sendAtFrontOfQueue(this.handler);
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public HandlerWrapper.Message obtainMessage(int i2, int i3, int i4) {
        Handler handler = this.handler;
        SystemMessage systemMessageObtainSystemMessage = obtainSystemMessage();
        systemMessageObtainSystemMessage.setMessage(handler.obtainMessage(i2, i3, i4), this);
        return systemMessageObtainSystemMessage;
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public HandlerWrapper.Message obtainMessage(int i2, int i3, int i4, Object obj) {
        Handler handler = this.handler;
        SystemMessage systemMessageObtainSystemMessage = obtainSystemMessage();
        systemMessageObtainSystemMessage.setMessage(handler.obtainMessage(i2, i3, i4, obj), this);
        return systemMessageObtainSystemMessage;
    }

    @Override // androidx.media3.common.util.HandlerWrapper
    public HandlerWrapper.Message obtainMessage(int i2, Object obj) {
        Handler handler = this.handler;
        SystemMessage systemMessageObtainSystemMessage = obtainSystemMessage();
        systemMessageObtainSystemMessage.setMessage(handler.obtainMessage(i2, obj), this);
        return systemMessageObtainSystemMessage;
    }
}
