package androidx.camera.camera2.pipe.internal;

import androidx.camera.camera2.pipe.Frame;
import h.e.b;
import h.g.b.x;
import kotlinx.a.a;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ListenerState {
    private final a isCompletedInvoked;
    private final a isFrameInfoInvoked;
    private final a isImagesInvoked;
    private final a isStarted;
    private final Frame.Listener listener;

    public ListenerState(Frame.Listener listener) {
        x.f(listener, "listener");
        this.listener = listener;
        this.isStarted = b.e(false);
        this.isImagesInvoked = b.e(false);
        this.isFrameInfoInvoked = b.e(false);
        this.isCompletedInvoked = b.e(false);
    }

    public final Frame.Listener getListener() {
        return this.listener;
    }

    /* renamed from: invokeOnFrameComplete-cfZT-5Y, reason: not valid java name */
    public final void m1222invokeOnFrameCompletecfZT5Y(long j2, long j3) {
        m1225invokeOnImagesAvailablecfZT5Y(j2, j3);
        m1223invokeOnFrameInfoAvailablecfZT5Y(j2, j3);
        if (this.isCompletedInvoked.b(false, true)) {
            this.listener.onFrameComplete();
        }
    }

    /* renamed from: invokeOnFrameInfoAvailable-cfZT-5Y, reason: not valid java name */
    public final void m1223invokeOnFrameInfoAvailablecfZT5Y(long j2, long j3) {
        m1226invokeOnStartedcfZT5Y(j2, j3);
        if (this.isFrameInfoInvoked.b(false, true)) {
            this.listener.onFrameInfoAvailable();
        }
    }

    /* renamed from: invokeOnImageAvailable-aKI5c8E, reason: not valid java name */
    public final void m1224invokeOnImageAvailableaKI5c8E(int i2) {
        this.listener.m673onImageAvailableaKI5c8E(i2);
    }

    /* renamed from: invokeOnImagesAvailable-cfZT-5Y, reason: not valid java name */
    public final void m1225invokeOnImagesAvailablecfZT5Y(long j2, long j3) {
        m1226invokeOnStartedcfZT5Y(j2, j3);
        if (this.isImagesInvoked.b(false, true)) {
            this.listener.onImagesAvailable();
        }
    }

    /* renamed from: invokeOnStarted-cfZT-5Y, reason: not valid java name */
    public final void m1226invokeOnStartedcfZT5Y(long j2, long j3) {
        if (this.isStarted.b(false, true)) {
            this.listener.m672onFrameStartedcfZT5Y(j2, j3);
        }
    }
}
