package q2;

import Q1.x;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;

/* loaded from: classes.dex */
public final class n implements Choreographer.FrameCallback, Handler.Callback {

    /* renamed from: e, reason: collision with root package name */
    public static final n f44079e = new n();

    /* renamed from: a, reason: collision with root package name */
    public volatile long f44080a = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f44081b;

    /* renamed from: c, reason: collision with root package name */
    public Choreographer f44082c;

    /* renamed from: d, reason: collision with root package name */
    public int f44083d;

    public n() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        int i5 = x.f9724a;
        Handler handler = new Handler(looper, this);
        this.f44081b = handler;
        handler.sendEmptyMessage(1);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j8) {
        this.f44080a = j8;
        Choreographer choreographer = this.f44082c;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i5 = message.what;
        if (i5 == 1) {
            try {
                this.f44082c = Choreographer.getInstance();
            } catch (RuntimeException e7) {
                Q1.k.x("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e7);
            }
            return true;
        }
        if (i5 == 2) {
            Choreographer choreographer = this.f44082c;
            if (choreographer != null) {
                int i10 = this.f44083d + 1;
                this.f44083d = i10;
                if (i10 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        }
        if (i5 != 3) {
            return false;
        }
        Choreographer choreographer2 = this.f44082c;
        if (choreographer2 != null) {
            int i11 = this.f44083d - 1;
            this.f44083d = i11;
            if (i11 == 0) {
                choreographer2.removeFrameCallback(this);
                this.f44080a = -9223372036854775807L;
            }
        }
        return true;
    }
}
