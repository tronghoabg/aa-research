package androidx.camera.core.internal;

import androidx.camera.core.ImageCapture;
import androidx.camera.core.Logger;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class ScreenFlashWrapper implements ImageCapture.ScreenFlash {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "ScreenFlashWrapper";
    private boolean isClearScreenFlashPending;
    private final Object lock;
    private ImageCapture.ScreenFlashListener pendingListener;
    private final ImageCapture.ScreenFlash screenFlash;

    private ScreenFlashWrapper(ImageCapture.ScreenFlash screenFlash) {
        this.screenFlash = screenFlash;
        this.lock = new Object();
    }

    static final void apply$lambda$1(ScreenFlashWrapper screenFlashWrapper) {
        synchronized (screenFlashWrapper.lock) {
            if (screenFlashWrapper.pendingListener == null) {
                Logger.w(TAG, "apply: pendingListener is null!");
            }
            screenFlashWrapper.completePendingScreenFlashListener();
        }
    }

    private final void completePendingScreenFlashClear() {
        synchronized (this.lock) {
            if (this.isClearScreenFlashPending) {
                ImageCapture.ScreenFlash screenFlash = this.screenFlash;
                if (screenFlash != null) {
                    screenFlash.clear();
                } else {
                    ScreenFlashWrapper screenFlashWrapper = this;
                    Logger.e(TAG, "completePendingScreenFlashClear: screenFlash is null!");
                }
            } else {
                Logger.w(TAG, "completePendingScreenFlashClear: none pending!");
            }
            this.isClearScreenFlashPending = false;
        }
    }

    private final void completePendingScreenFlashListener() {
        synchronized (this.lock) {
            ImageCapture.ScreenFlashListener screenFlashListener = this.pendingListener;
            if (screenFlashListener != null) {
                screenFlashListener.onCompleted();
            }
            this.pendingListener = null;
        }
    }

    public static final ScreenFlashWrapper from(ImageCapture.ScreenFlash screenFlash) {
        return Companion.from(screenFlash);
    }

    @Override // androidx.camera.core.ImageCapture.ScreenFlash
    public void apply(long j2, ImageCapture.ScreenFlashListener screenFlashListener) {
        x.f(screenFlashListener, "screenFlashListener");
        synchronized (this.lock) {
            this.isClearScreenFlashPending = true;
            this.pendingListener = screenFlashListener;
        }
        ImageCapture.ScreenFlash screenFlash = this.screenFlash;
        if (screenFlash != null) {
            screenFlash.apply(j2, new ImageCapture.ScreenFlashListener() { // from class: androidx.camera.core.internal.ScreenFlashWrapper$$ExternalSyntheticLambda0
                @Override // androidx.camera.core.ImageCapture.ScreenFlashListener
                public final void onCompleted() {
                    ScreenFlashWrapper.apply$lambda$1(this.f$0);
                }
            });
        } else {
            Logger.e(TAG, "apply: screenFlash is null!");
            completePendingScreenFlashListener();
        }
    }

    @Override // androidx.camera.core.ImageCapture.ScreenFlash
    public void clear() {
        completePendingScreenFlashClear();
    }

    public final void completePendingTasks() {
        completePendingScreenFlashListener();
        completePendingScreenFlashClear();
    }

    public final ImageCapture.ScreenFlash getBaseScreenFlash() {
        return this.screenFlash;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final ScreenFlashWrapper from(ImageCapture.ScreenFlash screenFlash) {
            return new ScreenFlashWrapper(screenFlash, null);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ ScreenFlashWrapper(ImageCapture.ScreenFlash screenFlash, o oVar) {
        this(screenFlash);
    }
}
