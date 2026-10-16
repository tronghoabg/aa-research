package v6;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import u6.AbstractC4256a;
import u6.v;

/* loaded from: classes3.dex */
public final class m implements Choreographer.FrameCallback, Handler.Callback {

    /* renamed from: e, reason: collision with root package name */
    public static final m f46891e = new m();

    /* renamed from: a, reason: collision with root package name */
    public volatile long f46892a = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f46893b;

    /* renamed from: c, reason: collision with root package name */
    public Choreographer f46894c;

    /* renamed from: d, reason: collision with root package name */
    public int f46895d;

    public m() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        int i5 = v.f46721a;
        Handler handler = new Handler(looper, this);
        this.f46893b = handler;
        handler.sendEmptyMessage(0);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j8) {
        this.f46892a = j8;
        Choreographer choreographer = this.f46894c;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i5 = message.what;
        if (i5 == 0) {
            try {
                this.f46894c = Choreographer.getInstance();
                return true;
            } catch (RuntimeException e7) {
                AbstractC4256a.D(e7, "VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error");
            }
        } else if (i5 == 1) {
            Choreographer choreographer = this.f46894c;
            if (choreographer != null) {
                int i10 = this.f46895d + 1;
                this.f46895d = i10;
                if (i10 == 1) {
                    choreographer.postFrameCallback(this);
                    return true;
                }
            }
        } else {
            if (i5 != 2) {
                return false;
            }
            Choreographer choreographer2 = this.f46894c;
            if (choreographer2 != null) {
                int i11 = this.f46895d - 1;
                this.f46895d = i11;
                if (i11 == 0) {
                    choreographer2.removeFrameCallback(this);
                    this.f46892a = -9223372036854775807L;
                    return true;
                }
            }
        }
        return true;
    }
}
