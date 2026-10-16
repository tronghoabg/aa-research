package androidx.media3.exoplayer.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import androidx.media3.common.util.EGLSurfaceTexture;
import androidx.media3.common.util.GlUtil;
import androidx.media3.common.util.Log;
import com.google.d.b.an;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class PlaceholderSurface extends Surface {
    private static final String TAG = "PlaceholderSurface";
    private static int secureMode;
    private static boolean secureModeInitialized;
    public final boolean secure;
    private final PlaceholderSurfaceThread thread;
    private boolean threadReleased;

    /* compiled from: WazeSource */
    class PlaceholderSurfaceThread extends HandlerThread implements Handler.Callback {
        private static final int MSG_INIT = 1;
        private static final int MSG_RELEASE = 2;
        private EGLSurfaceTexture eglSurfaceTexture;
        private Handler handler;
        private Error initError;
        private RuntimeException initException;
        private PlaceholderSurface surface;

        public PlaceholderSurfaceThread() {
            super("ExoPlayer:PlaceholderSurface");
        }

        private void initInternal(int i2) throws GlUtil.GlException {
            an.B(this.eglSurfaceTexture);
            this.eglSurfaceTexture.init(i2);
            this.surface = new PlaceholderSurface(this, this.eglSurfaceTexture.getSurfaceTexture(), i2 != 0);
        }

        private void releaseInternal() {
            an.B(this.eglSurfaceTexture);
            this.eglSurfaceTexture.release();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i2 = message.what;
            try {
                if (i2 == 1) {
                    try {
                        try {
                            initInternal(message.arg1);
                            synchronized (this) {
                                notify();
                            }
                        } catch (RuntimeException e2) {
                            Log.e(PlaceholderSurface.TAG, "Failed to initialize placeholder surface", e2);
                            this.initException = e2;
                            synchronized (this) {
                                notify();
                            }
                        }
                    } catch (GlUtil.GlException e3) {
                        Log.e(PlaceholderSurface.TAG, "Failed to initialize placeholder surface", e3);
                        this.initException = new IllegalStateException(e3);
                        synchronized (this) {
                            notify();
                        }
                    } catch (Error e4) {
                        Log.e(PlaceholderSurface.TAG, "Failed to initialize placeholder surface", e4);
                        this.initError = e4;
                        synchronized (this) {
                            notify();
                        }
                    }
                } else if (i2 == 2) {
                    try {
                        releaseInternal();
                    } finally {
                        try {
                            return true;
                        } finally {
                        }
                    }
                    return true;
                }
                return true;
            } catch (Throwable th) {
                synchronized (this) {
                    notify();
                    throw th;
                }
            }
        }

        public PlaceholderSurface init(int i2) {
            boolean z;
            start();
            this.handler = new Handler(getLooper(), this);
            this.eglSurfaceTexture = new EGLSurfaceTexture(this.handler);
            synchronized (this) {
                z = false;
                this.handler.obtainMessage(1, i2, 0).sendToTarget();
                while (this.surface == null && this.initException == null && this.initError == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.initException;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.initError;
            if (error != null) {
                throw error;
            }
            PlaceholderSurface placeholderSurface = this.surface;
            an.B(placeholderSurface);
            return placeholderSurface;
        }

        public void release() {
            an.B(this.handler);
            this.handler.sendEmptyMessage(2);
        }
    }

    private PlaceholderSurface(PlaceholderSurfaceThread placeholderSurfaceThread, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.thread = placeholderSurfaceThread;
        this.secure = z;
    }

    private static int getSecureMode(Context context) {
        try {
            if (GlUtil.isProtectedContentExtensionSupported(context)) {
                return GlUtil.isSurfacelessContextExtensionSupported() ? 1 : 2;
            }
            return 0;
        } catch (GlUtil.GlException e2) {
            Log.e(TAG, "Failed to determine secure mode due to GL error: ".concat(String.valueOf(e2.getMessage())));
            return 0;
        }
    }

    public static synchronized boolean isSecureSupported(Context context) {
        if (!secureModeInitialized) {
            secureMode = getSecureMode(context);
            secureModeInitialized = true;
        }
        return secureMode != 0;
    }

    public static PlaceholderSurface newInstance(Context context, boolean z) {
        boolean z2 = true;
        if (z && !isSecureSupported(context)) {
            z2 = false;
        }
        an.u(z2);
        return new PlaceholderSurfaceThread().init(z ? secureMode : 0);
    }

    @Deprecated
    public static PlaceholderSurface newInstanceV17(Context context, boolean z) {
        return newInstance(context, z);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.thread) {
            if (!this.threadReleased) {
                this.thread.release();
                this.threadReleased = true;
            }
        }
    }
}
