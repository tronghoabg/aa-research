package androidx.asynclayoutinflater.view;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.util.Pools;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AsyncLayoutInflater {
    private static final String TAG = "AsyncLayoutInflater";
    Handler mHandler;
    private Handler.Callback mHandlerCallback;
    InflateThread mInflateThread;
    LayoutInflater mInflater;

    /* compiled from: WazeSource */
    /* renamed from: androidx.asynclayoutinflater.view.AsyncLayoutInflater$1, reason: invalid class name */
    class AnonymousClass1 implements Handler.Callback {
        AnonymousClass1() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            final InflateRequest inflateRequest = (InflateRequest) message.obj;
            if (inflateRequest.view == null) {
                inflateRequest.view = inflateRequest.mInflater.inflate(inflateRequest.resid, inflateRequest.parent, false);
            }
            Executor executor = inflateRequest.mExecutor;
            if (executor != null) {
                executor.execute(new Runnable() { // from class: androidx.asynclayoutinflater.view.AsyncLayoutInflater$1$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m150x72db0100(inflateRequest);
                    }
                });
                return true;
            }
            AsyncLayoutInflater.triggerCallbacks(inflateRequest, AsyncLayoutInflater.this.mInflateThread);
            return true;
        }

        /* renamed from: lambda$handleMessage$0$androidx-asynclayoutinflater-view-AsyncLayoutInflater$1, reason: not valid java name */
        /* synthetic */ void m150x72db0100(InflateRequest inflateRequest) {
            AsyncLayoutInflater.triggerCallbacks(inflateRequest, AsyncLayoutInflater.this.mInflateThread);
        }
    }

    /* compiled from: WazeSource */
    class BasicInflater extends LayoutInflater {
        private static final String[] sClassPrefixList = {"android.widget.", "android.webkit.", "android.app."};

        BasicInflater(Context context) {
            super(context);
        }

        @Override // android.view.LayoutInflater
        public LayoutInflater cloneInContext(Context context) {
            return new BasicInflater(context);
        }

        @Override // android.view.LayoutInflater
        protected View onCreateView(String str, AttributeSet attributeSet) {
            View viewCreateView;
            for (String str2 : sClassPrefixList) {
                try {
                    viewCreateView = createView(str, str2, attributeSet);
                } catch (ClassNotFoundException unused) {
                }
                if (viewCreateView != null) {
                    return viewCreateView;
                }
            }
            return super.onCreateView(str, attributeSet);
        }
    }

    /* compiled from: WazeSource */
    class InflateRequest {
        OnInflateFinishedListener callback;
        Executor mExecutor;
        Handler mHandler;
        LayoutInflater mInflater;
        ViewGroup parent;
        int resid;
        View view;

        InflateRequest() {
        }
    }

    /* compiled from: WazeSource */
    class InflateThread extends Thread {
        private static final InflateThread sInstance;
        private ArrayBlockingQueue<InflateRequest> mQueue = new ArrayBlockingQueue<>(10);
        private Pools.SynchronizedPool<InflateRequest> mRequestPool = new Pools.SynchronizedPool<>(10);

        static {
            InflateThread inflateThread = new InflateThread();
            sInstance = inflateThread;
            inflateThread.setName("AsyncLayoutInflator");
            inflateThread.start();
        }

        private InflateThread() {
        }

        public static InflateThread getInstance() {
            return sInstance;
        }

        public void enqueue(InflateRequest inflateRequest) throws InterruptedException {
            try {
                this.mQueue.put(inflateRequest);
            } catch (InterruptedException e2) {
                throw new RuntimeException("Failed to enqueue async inflate request", e2);
            }
        }

        /* renamed from: lambda$runInner$0$androidx-asynclayoutinflater-view-AsyncLayoutInflater$InflateThread, reason: not valid java name */
        /* synthetic */ void m151x77c520c6(InflateRequest inflateRequest) {
            AsyncLayoutInflater.triggerCallbacks(inflateRequest, this);
        }

        public InflateRequest obtainRequest() {
            InflateRequest inflateRequestAcquire = this.mRequestPool.acquire();
            return inflateRequestAcquire == null ? new InflateRequest() : inflateRequestAcquire;
        }

        public void releaseRequest(InflateRequest inflateRequest) {
            inflateRequest.callback = null;
            inflateRequest.mInflater = null;
            inflateRequest.mHandler = null;
            inflateRequest.parent = null;
            inflateRequest.resid = 0;
            inflateRequest.view = null;
            inflateRequest.mExecutor = null;
            this.mRequestPool.release(inflateRequest);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() throws InterruptedException {
            while (true) {
                runInner();
            }
        }

        public void runInner() throws InterruptedException {
            Executor executor;
            try {
                final InflateRequest inflateRequestTake = this.mQueue.take();
                try {
                    inflateRequestTake.view = inflateRequestTake.mInflater.inflate(inflateRequestTake.resid, inflateRequestTake.parent, false);
                } catch (RuntimeException e2) {
                    Log.w(AsyncLayoutInflater.TAG, "Failed to inflate resource in the background! Retrying on the UI thread", e2);
                }
                if (inflateRequestTake.view == null || (executor = inflateRequestTake.mExecutor) == null) {
                    Message.obtain(inflateRequestTake.mHandler, 0, inflateRequestTake).sendToTarget();
                } else {
                    executor.execute(new Runnable() { // from class: androidx.asynclayoutinflater.view.AsyncLayoutInflater$InflateThread$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.m151x77c520c6(inflateRequestTake);
                        }
                    });
                }
            } catch (InterruptedException e3) {
                Log.w(AsyncLayoutInflater.TAG, e3);
            }
        }
    }

    /* compiled from: WazeSource */
    public interface OnInflateFinishedListener {
        void onInflateFinished(View view, int i2, ViewGroup viewGroup);
    }

    public AsyncLayoutInflater(Context context, AsyncLayoutFactory asyncLayoutFactory) {
        this.mHandlerCallback = new AnonymousClass1();
        BasicInflater basicInflater = new BasicInflater(context);
        this.mInflater = basicInflater;
        basicInflater.setFactory2(asyncLayoutFactory);
        this.mHandler = new Handler(Looper.myLooper(), this.mHandlerCallback);
        this.mInflateThread = InflateThread.getInstance();
    }

    private void inflateInternal(int i2, ViewGroup viewGroup, OnInflateFinishedListener onInflateFinishedListener, LayoutInflater layoutInflater, Executor executor) throws InterruptedException {
        if (onInflateFinishedListener == null) {
            throw new NullPointerException("callback argument may not be null!");
        }
        InflateRequest inflateRequestObtainRequest = this.mInflateThread.obtainRequest();
        inflateRequestObtainRequest.mInflater = layoutInflater;
        inflateRequestObtainRequest.mHandler = this.mHandler;
        inflateRequestObtainRequest.resid = i2;
        inflateRequestObtainRequest.parent = viewGroup;
        inflateRequestObtainRequest.callback = onInflateFinishedListener;
        inflateRequestObtainRequest.mExecutor = executor;
        this.mInflateThread.enqueue(inflateRequestObtainRequest);
    }

    static void triggerCallbacks(InflateRequest inflateRequest, InflateThread inflateThread) {
        inflateRequest.callback.onInflateFinished(inflateRequest.view, inflateRequest.resid, inflateRequest.parent);
        inflateThread.releaseRequest(inflateRequest);
    }

    public void inflate(int i2, ViewGroup viewGroup, OnInflateFinishedListener onInflateFinishedListener) throws InterruptedException {
        inflateInternal(i2, viewGroup, onInflateFinishedListener, this.mInflater, null);
    }

    public void inflate(int i2, ViewGroup viewGroup, Executor executor, OnInflateFinishedListener onInflateFinishedListener) throws InterruptedException {
        inflateInternal(i2, viewGroup, onInflateFinishedListener, this.mInflater, executor);
    }

    public AsyncLayoutInflater(Context context) {
        this.mHandlerCallback = new AnonymousClass1();
        this.mInflater = new BasicInflater(context);
        this.mHandler = new Handler(Looper.myLooper(), this.mHandlerCallback);
        this.mInflateThread = InflateThread.getInstance();
    }
}
