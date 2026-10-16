package androidx.media3.exoplayer.upstream;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.media3.common.C;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.TraceUtil;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.util.ReleasableExecutor;
import com.google.d.b.an;
import j$.util.Objects;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.concurrent.ExecutorService;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class Loader implements LoaderErrorThrower {
    private static final int ACTION_TYPE_DONT_RETRY = 2;
    private static final int ACTION_TYPE_DONT_RETRY_FATAL = 3;
    private static final int ACTION_TYPE_RETRY = 0;
    private static final int ACTION_TYPE_RETRY_AND_RESET_ERROR_COUNT = 1;
    public static final LoadErrorAction DONT_RETRY;
    public static final LoadErrorAction DONT_RETRY_FATAL;
    public static final LoadErrorAction RETRY;
    public static final LoadErrorAction RETRY_RESET_ERROR_COUNT;
    private static final String THREAD_NAME_PREFIX = "ExoPlayer:Loader:";
    private LoadTask<? extends Loadable> currentTask;
    private final ReleasableExecutor downloadExecutor;
    private IOException fatalError;

    /* compiled from: WazeSource */
    public interface Callback<T extends Loadable> {

        /* compiled from: WazeSource */
        /* renamed from: androidx.media3.exoplayer.upstream.Loader$Callback$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$onLoadStarted(Callback callback, Loadable loadable, long j2, long j3, int i2) {
            }
        }

        void onLoadCanceled(T t, long j2, long j3, boolean z);

        void onLoadCompleted(T t, long j2, long j3);

        LoadErrorAction onLoadError(T t, long j2, long j3, IOException iOException, int i2);

        void onLoadStarted(T t, long j2, long j3, int i2);
    }

    /* compiled from: WazeSource */
    public final class LoadErrorAction {
        private final long retryDelayMillis;
        private final int type;

        private LoadErrorAction(int i2, long j2) {
            this.type = i2;
            this.retryDelayMillis = j2;
        }

        public boolean isRetry() {
            int i2 = this.type;
            return i2 == 0 || i2 == 1;
        }
    }

    /* compiled from: WazeSource */
    final class LoadTask<T extends Loadable> extends Handler implements Runnable {
        private static final int MSG_FATAL_ERROR = 4;
        private static final int MSG_FINISH = 2;
        private static final int MSG_IO_EXCEPTION = 3;
        private static final int MSG_START = 1;
        private static final String TAG = "LoadTask";
        private Callback<T> callback;
        private boolean canceled;
        private IOException currentError;
        public final int defaultMinRetryCount;
        private int errorCount;
        private Thread executorThread;
        private final T loadable;
        private volatile boolean released;
        private final long startTimeMs;
        final /* synthetic */ Loader this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadTask(Loader loader, Looper looper, T t, Callback<T> callback, int i2, long j2) {
            super(looper);
            Objects.requireNonNull(loader);
            this.this$0 = loader;
            this.loadable = t;
            this.callback = callback;
            this.defaultMinRetryCount = i2;
            this.startTimeMs = j2;
        }

        private void execute() {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = jElapsedRealtime - this.startTimeMs;
            Callback<T> callback = this.callback;
            an.B(callback);
            callback.onLoadStarted(this.loadable, jElapsedRealtime, j2, this.errorCount);
            this.currentError = null;
            Loader loader = this.this$0;
            ReleasableExecutor releasableExecutor = loader.downloadExecutor;
            LoadTask loadTask = loader.currentTask;
            an.B(loadTask);
            releasableExecutor.execute(loadTask);
        }

        private void finish() {
            this.this$0.currentTask = null;
        }

        private long getRetryDelayMillis() {
            return Math.min((this.errorCount - 1) * 1000, 5000);
        }

        public void cancel(boolean z) {
            this.released = z;
            this.currentError = null;
            if (hasMessages(1)) {
                this.canceled = true;
                removeMessages(1);
                if (!z) {
                    sendEmptyMessage(2);
                }
            } else {
                synchronized (this) {
                    this.canceled = true;
                    this.loadable.cancelLoad();
                    Thread thread = this.executorThread;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z) {
                finish();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                Callback<T> callback = this.callback;
                an.B(callback);
                callback.onLoadCanceled(this.loadable, jElapsedRealtime, jElapsedRealtime - this.startTimeMs, true);
                this.callback = null;
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.released) {
                return;
            }
            if (message.what == 1) {
                execute();
                return;
            }
            if (message.what == 4) {
                throw ((Error) message.obj);
            }
            finish();
            long j2 = this.startTimeMs;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = jElapsedRealtime - j2;
            Callback<T> callback = this.callback;
            an.B(callback);
            if (this.canceled) {
                callback.onLoadCanceled(this.loadable, jElapsedRealtime, j3, false);
                return;
            }
            int i2 = message.what;
            if (i2 == 2) {
                try {
                    callback.onLoadCompleted(this.loadable, jElapsedRealtime, j3);
                    return;
                } catch (RuntimeException e2) {
                    Log.e(TAG, "Unexpected exception handling load completed", e2);
                    this.this$0.fatalError = new UnexpectedLoaderException(e2);
                    return;
                }
            }
            if (i2 != 3) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.currentError = iOException;
            int i3 = this.errorCount + 1;
            this.errorCount = i3;
            LoadErrorAction loadErrorActionOnLoadError = callback.onLoadError(this.loadable, jElapsedRealtime, j3, iOException, i3);
            if (loadErrorActionOnLoadError.type == 3) {
                this.this$0.fatalError = this.currentError;
            } else if (loadErrorActionOnLoadError.type != 2) {
                if (loadErrorActionOnLoadError.type == 1) {
                    this.errorCount = 1;
                }
                start(loadErrorActionOnLoadError.retryDelayMillis != C.TIME_UNSET ? loadErrorActionOnLoadError.retryDelayMillis : getRetryDelayMillis());
            }
        }

        public void maybeThrowError(int i2) throws IOException {
            IOException iOException = this.currentError;
            if (iOException != null && this.errorCount > i2) {
                throw iOException;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            try {
                synchronized (this) {
                    z = this.canceled;
                    this.executorThread = Thread.currentThread();
                }
                if (!z) {
                    TraceUtil.beginSection("load:" + this.loadable.getClass().getSimpleName());
                    try {
                        this.loadable.load();
                        TraceUtil.endSection();
                    } catch (Throwable th) {
                        TraceUtil.endSection();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.executorThread = null;
                    Thread.interrupted();
                }
                if (this.released) {
                    return;
                }
                sendEmptyMessage(2);
            } catch (IOException e2) {
                if (this.released) {
                    return;
                }
                obtainMessage(3, e2).sendToTarget();
            } catch (OutOfMemoryError e3) {
                if (this.released) {
                    return;
                }
                Log.e(TAG, "OutOfMemory error loading stream", e3);
                obtainMessage(3, new UnexpectedLoaderException(e3)).sendToTarget();
            } catch (Error e4) {
                if (!this.released) {
                    Log.e(TAG, "Unexpected error loading stream", e4);
                    obtainMessage(4, e4).sendToTarget();
                }
                throw e4;
            } catch (Exception e5) {
                if (this.released) {
                    return;
                }
                Log.e(TAG, "Unexpected exception loading stream", e5);
                obtainMessage(3, new UnexpectedLoaderException(e5)).sendToTarget();
            }
        }

        public void start(long j2) {
            an.u(this.this$0.currentTask == null);
            this.this$0.currentTask = this;
            if (j2 > 0) {
                sendEmptyMessageDelayed(1, j2);
            } else {
                execute();
            }
        }
    }

    /* compiled from: WazeSource */
    public interface Loadable {
        void cancelLoad();

        void load();
    }

    /* compiled from: WazeSource */
    public interface ReleaseCallback {
        void onLoaderReleased();
    }

    /* compiled from: WazeSource */
    final class ReleaseTask implements Runnable {
        private final ReleaseCallback callback;

        public ReleaseTask(ReleaseCallback releaseCallback) {
            this.callback = releaseCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.callback.onLoaderReleased();
        }
    }

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @interface RetryActionType {
    }

    /* compiled from: WazeSource */
    public final class UnexpectedLoaderException extends IOException {
        public UnexpectedLoaderException(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + (th.getMessage() != null ? ": ".concat(String.valueOf(th.getMessage())) : ""), th);
        }
    }

    static {
        long j2 = C.TIME_UNSET;
        RETRY = createRetryAction(false, C.TIME_UNSET);
        RETRY_RESET_ERROR_COUNT = createRetryAction(true, C.TIME_UNSET);
        DONT_RETRY = new LoadErrorAction(2, j2);
        DONT_RETRY_FATAL = new LoadErrorAction(3, j2);
    }

    public Loader(String str) {
        this(ReleasableExecutor.CC.from(Util.newSingleThreadExecutor(THREAD_NAME_PREFIX.concat(String.valueOf(str))), new Consumer() { // from class: androidx.media3.exoplayer.upstream.Loader$$ExternalSyntheticLambda0
            @Override // androidx.media3.common.util.Consumer
            public final void accept(Object obj) {
                ((ExecutorService) obj).shutdown();
            }
        }));
    }

    public static LoadErrorAction createRetryAction(boolean z, long j2) {
        return new LoadErrorAction(z ? 1 : 0, j2);
    }

    public void cancelLoading() {
        LoadTask<? extends Loadable> loadTask = this.currentTask;
        an.B(loadTask);
        loadTask.cancel(false);
    }

    public void clearFatalError() {
        this.fatalError = null;
    }

    public boolean hasFatalError() {
        return this.fatalError != null;
    }

    public boolean isLoading() {
        return this.currentTask != null;
    }

    @Override // androidx.media3.exoplayer.upstream.LoaderErrorThrower
    public void maybeThrowError(int i2) throws IOException {
        IOException iOException = this.fatalError;
        if (iOException != null) {
            throw iOException;
        }
        LoadTask<? extends Loadable> loadTask = this.currentTask;
        if (loadTask != null) {
            if (i2 == Integer.MIN_VALUE) {
                i2 = loadTask.defaultMinRetryCount;
            }
            loadTask.maybeThrowError(i2);
        }
    }

    public void release(ReleaseCallback releaseCallback) {
        LoadTask<? extends Loadable> loadTask = this.currentTask;
        if (loadTask != null) {
            loadTask.cancel(true);
        }
        if (releaseCallback != null) {
            this.downloadExecutor.execute(new ReleaseTask(releaseCallback));
        }
        this.downloadExecutor.release();
    }

    public <T extends Loadable> long startLoading(T t, Callback<T> callback, int i2) {
        Looper looperMyLooper = Looper.myLooper();
        an.B(looperMyLooper);
        this.fatalError = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new LoadTask(this, looperMyLooper, t, callback, i2, jElapsedRealtime).start(0L);
        return jElapsedRealtime;
    }

    @Override // androidx.media3.exoplayer.upstream.LoaderErrorThrower
    public void maybeThrowError() throws IOException {
        maybeThrowError(Integer.MIN_VALUE);
    }

    public void release() {
        release(null);
    }

    public Loader(ReleasableExecutor releasableExecutor) {
        this.downloadExecutor = releasableExecutor;
    }
}
