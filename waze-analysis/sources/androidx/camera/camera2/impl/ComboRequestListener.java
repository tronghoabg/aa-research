package androidx.camera.camera2.impl;

import androidx.camera.camera2.config.CameraScope;
import androidx.camera.camera2.pipe.FrameInfo;
import androidx.camera.camera2.pipe.FrameMetadata;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestFailure;
import androidx.camera.camera2.pipe.RequestMetadata;
import h.ab;
import h.g.a.l;
import h.g.b.x;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
@CameraScope
/* loaded from: classes2.dex */
public final class ComboRequestListener implements Request.Listener {
    private final Object lock = new Object();
    private volatile ListenerHolder[] _listenerHolders = new ListenerHolder[0];

    /* compiled from: WazeSource */
    public final class ListenerHolder {
        public final Executor executor;
        public final boolean isDirect;
        public final Request.Listener listener;

        public ListenerHolder(Request.Listener listener, Executor executor, boolean z) {
            x.f(listener, "listener");
            x.f(executor, "executor");
            this.listener = listener;
            this.executor = executor;
            this.isDirect = z;
        }
    }

    private final void dispatch(final l<? super Request.Listener, ab> lVar) {
        ListenerHolder[] listenerHolderArr = this._listenerHolders;
        if (listenerHolderArr.length != 0) {
            for (final ListenerHolder listenerHolder : listenerHolderArr) {
                if (listenerHolder.isDirect) {
                    lVar.invoke(listenerHolder.listener);
                } else {
                    listenerHolder.executor.execute(new Runnable() { // from class: androidx.camera.camera2.impl.ComboRequestListener.dispatch.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            lVar.invoke(listenerHolder.listener);
                        }
                    });
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        r5._listenerHolders = (androidx.camera.camera2.impl.ComboRequestListener.ListenerHolder[]) h.a.c.v(r5._listenerHolders, new androidx.camera.camera2.impl.ComboRequestListener.ListenerHolder(r6, r7, h.g.b.x.n(r7, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor())));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void addListener(androidx.camera.camera2.pipe.Request.Listener r6, java.util.concurrent.Executor r7) {
        /*
            r5 = this;
            java.lang.String r0 = "listener"
            h.g.b.x.f(r6, r0)
            java.lang.String r0 = "executor"
            h.g.b.x.f(r7, r0)
            java.lang.Object r0 = r5.lock
            monitor-enter(r0)
            androidx.camera.camera2.impl.ComboRequestListener$ListenerHolder[] r1 = r5._listenerHolders     // Catch: java.lang.Throwable -> L36
            int r2 = r1.length     // Catch: java.lang.Throwable -> L36
            r3 = 0
        L11:
            if (r3 >= r2) goto L1d
            r4 = r1[r3]     // Catch: java.lang.Throwable -> L36
            androidx.camera.camera2.pipe.Request$Listener r4 = r4.listener     // Catch: java.lang.Throwable -> L36
            if (r4 != r6) goto L1a
            goto L34
        L1a:
            int r3 = r3 + 1
            goto L11
        L1d:
            java.util.concurrent.Executor r1 = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()     // Catch: java.lang.Throwable -> L36
            boolean r1 = h.g.b.x.n(r7, r1)     // Catch: java.lang.Throwable -> L36
            androidx.camera.camera2.impl.ComboRequestListener$ListenerHolder r2 = new androidx.camera.camera2.impl.ComboRequestListener$ListenerHolder     // Catch: java.lang.Throwable -> L36
            r2.<init>(r6, r7, r1)     // Catch: java.lang.Throwable -> L36
            androidx.camera.camera2.impl.ComboRequestListener$ListenerHolder[] r6 = r5._listenerHolders     // Catch: java.lang.Throwable -> L36
            java.lang.Object[] r6 = h.a.c.v(r6, r2)     // Catch: java.lang.Throwable -> L36
            androidx.camera.camera2.impl.ComboRequestListener$ListenerHolder[] r6 = (androidx.camera.camera2.impl.ComboRequestListener.ListenerHolder[]) r6     // Catch: java.lang.Throwable -> L36
            r5._listenerHolders = r6     // Catch: java.lang.Throwable -> L36
        L34:
            monitor-exit(r0)
            return
        L36:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.ComboRequestListener.addListener(androidx.camera.camera2.pipe.Request$Listener, java.util.concurrent.Executor):void");
    }

    public final ListenerHolder[] getListenerHolders$camera_camera2() {
        return this._listenerHolders;
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    public void onAborted(final Request request) {
        x.f(request, "request");
        ListenerHolder[] listenerHolderArr = this._listenerHolders;
        if (listenerHolderArr.length != 0) {
            for (final ListenerHolder listenerHolder : listenerHolderArr) {
                if (listenerHolder.isDirect) {
                    listenerHolder.listener.onAborted(request);
                } else {
                    listenerHolder.executor.execute(new Runnable() { // from class: androidx.camera.camera2.impl.ComboRequestListener$onAborted$$inlined$dispatch$1
                        @Override // java.lang.Runnable
                        public final void run() {
                            listenerHolder.listener.onAborted(request);
                        }
                    });
                }
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onBufferLost-DlC0U5Y */
    public /* synthetic */ void mo187onBufferLostDlC0U5Y(RequestMetadata requestMetadata, long j2, int i2) {
        x.f(requestMetadata, "requestMetadata");
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onBufferLost-iiEMlm4 */
    public void mo188onBufferLostiiEMlm4(RequestMetadata requestMetadata, long j2, int i2, int i3) {
        final RequestMetadata requestMetadata2;
        final long j3;
        final int i4;
        final int i5;
        x.f(requestMetadata, "requestMetadata");
        ListenerHolder[] listenerHolderArr = this._listenerHolders;
        int length = listenerHolderArr.length;
        if (length != 0) {
            int i6 = 0;
            while (i6 < length) {
                final ListenerHolder listenerHolder = listenerHolderArr[i6];
                if (listenerHolder.isDirect) {
                    RequestMetadata requestMetadata3 = requestMetadata;
                    long j4 = j2;
                    int i7 = i2;
                    int i8 = i3;
                    listenerHolder.listener.mo188onBufferLostiiEMlm4(requestMetadata3, j4, i7, i8);
                    requestMetadata2 = requestMetadata3;
                    j3 = j4;
                    i4 = i7;
                    i5 = i8;
                } else {
                    requestMetadata2 = requestMetadata;
                    j3 = j2;
                    i4 = i2;
                    i5 = i3;
                    listenerHolder.executor.execute(new Runnable() { // from class: androidx.camera.camera2.impl.ComboRequestListener$onBufferLost-iiEMlm4$$inlined$dispatch$1
                        @Override // java.lang.Runnable
                        public final void run() {
                            listenerHolder.listener.mo188onBufferLostiiEMlm4(requestMetadata2, j3, i4, i5);
                        }
                    });
                }
                i6++;
                requestMetadata = requestMetadata2;
                j2 = j3;
                i2 = i4;
                i3 = i5;
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    public /* synthetic */ void onCaptureProgress(RequestMetadata requestMetadata, int i2) {
        x.f(requestMetadata, "requestMetadata");
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onComplete-CcXjc1I */
    public void mo189onCompleteCcXjc1I(RequestMetadata requestMetadata, long j2, FrameInfo frameInfo) {
        final RequestMetadata requestMetadata2;
        final long j3;
        final FrameInfo frameInfo2;
        x.f(requestMetadata, "requestMetadata");
        x.f(frameInfo, "result");
        ListenerHolder[] listenerHolderArr = this._listenerHolders;
        int length = listenerHolderArr.length;
        if (length != 0) {
            int i2 = 0;
            while (i2 < length) {
                final ListenerHolder listenerHolder = listenerHolderArr[i2];
                if (listenerHolder.isDirect) {
                    listenerHolder.listener.mo189onCompleteCcXjc1I(requestMetadata, j2, frameInfo);
                    requestMetadata2 = requestMetadata;
                    j3 = j2;
                    frameInfo2 = frameInfo;
                } else {
                    requestMetadata2 = requestMetadata;
                    j3 = j2;
                    frameInfo2 = frameInfo;
                    listenerHolder.executor.execute(new Runnable() { // from class: androidx.camera.camera2.impl.ComboRequestListener$onComplete-CcXjc1I$$inlined$dispatch$1
                        @Override // java.lang.Runnable
                        public final void run() {
                            listenerHolder.listener.mo189onCompleteCcXjc1I(requestMetadata2, j3, frameInfo2);
                        }
                    });
                }
                i2++;
                requestMetadata = requestMetadata2;
                j2 = j3;
                frameInfo = frameInfo2;
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onFailed-CcXjc1I */
    public void mo190onFailedCcXjc1I(RequestMetadata requestMetadata, long j2, RequestFailure requestFailure) {
        final RequestMetadata requestMetadata2;
        final long j3;
        final RequestFailure requestFailure2;
        x.f(requestMetadata, "requestMetadata");
        x.f(requestFailure, "requestFailure");
        ListenerHolder[] listenerHolderArr = this._listenerHolders;
        int length = listenerHolderArr.length;
        if (length != 0) {
            int i2 = 0;
            while (i2 < length) {
                final ListenerHolder listenerHolder = listenerHolderArr[i2];
                if (listenerHolder.isDirect) {
                    listenerHolder.listener.mo190onFailedCcXjc1I(requestMetadata, j2, requestFailure);
                    requestMetadata2 = requestMetadata;
                    j3 = j2;
                    requestFailure2 = requestFailure;
                } else {
                    requestMetadata2 = requestMetadata;
                    j3 = j2;
                    requestFailure2 = requestFailure;
                    listenerHolder.executor.execute(new Runnable() { // from class: androidx.camera.camera2.impl.ComboRequestListener$onFailed-CcXjc1I$$inlined$dispatch$1
                        @Override // java.lang.Runnable
                        public final void run() {
                            listenerHolder.listener.mo190onFailedCcXjc1I(requestMetadata2, j3, requestFailure2);
                        }
                    });
                }
                i2++;
                requestMetadata = requestMetadata2;
                j2 = j3;
                requestFailure = requestFailure2;
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onPartialCaptureResult-CcXjc1I */
    public void mo191onPartialCaptureResultCcXjc1I(RequestMetadata requestMetadata, long j2, FrameMetadata frameMetadata) {
        final RequestMetadata requestMetadata2;
        final long j3;
        final FrameMetadata frameMetadata2;
        x.f(requestMetadata, "requestMetadata");
        x.f(frameMetadata, "captureResult");
        ListenerHolder[] listenerHolderArr = this._listenerHolders;
        int length = listenerHolderArr.length;
        if (length != 0) {
            int i2 = 0;
            while (i2 < length) {
                final ListenerHolder listenerHolder = listenerHolderArr[i2];
                if (listenerHolder.isDirect) {
                    listenerHolder.listener.mo191onPartialCaptureResultCcXjc1I(requestMetadata, j2, frameMetadata);
                    requestMetadata2 = requestMetadata;
                    j3 = j2;
                    frameMetadata2 = frameMetadata;
                } else {
                    requestMetadata2 = requestMetadata;
                    j3 = j2;
                    frameMetadata2 = frameMetadata;
                    listenerHolder.executor.execute(new Runnable() { // from class: androidx.camera.camera2.impl.ComboRequestListener$onPartialCaptureResult-CcXjc1I$$inlined$dispatch$1
                        @Override // java.lang.Runnable
                        public final void run() {
                            listenerHolder.listener.mo191onPartialCaptureResultCcXjc1I(requestMetadata2, j3, frameMetadata2);
                        }
                    });
                }
                i2++;
                requestMetadata = requestMetadata2;
                j2 = j3;
                frameMetadata = frameMetadata2;
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onReadoutStarted-mP9r-9w */
    public /* synthetic */ void mo192onReadoutStartedmP9r9w(RequestMetadata requestMetadata, long j2, long j3) {
        x.f(requestMetadata, "requestMetadata");
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    public void onRequestSequenceAborted(final RequestMetadata requestMetadata) {
        x.f(requestMetadata, "requestMetadata");
        ListenerHolder[] listenerHolderArr = this._listenerHolders;
        if (listenerHolderArr.length != 0) {
            for (final ListenerHolder listenerHolder : listenerHolderArr) {
                if (listenerHolder.isDirect) {
                    listenerHolder.listener.onRequestSequenceAborted(requestMetadata);
                } else {
                    listenerHolder.executor.execute(new Runnable() { // from class: androidx.camera.camera2.impl.ComboRequestListener$onRequestSequenceAborted$$inlined$dispatch$1
                        @Override // java.lang.Runnable
                        public final void run() {
                            listenerHolder.listener.onRequestSequenceAborted(requestMetadata);
                        }
                    });
                }
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onRequestSequenceCompleted-RuT0dZU */
    public void mo193onRequestSequenceCompletedRuT0dZU(final RequestMetadata requestMetadata, final long j2) {
        x.f(requestMetadata, "requestMetadata");
        ListenerHolder[] listenerHolderArr = this._listenerHolders;
        if (listenerHolderArr.length != 0) {
            for (final ListenerHolder listenerHolder : listenerHolderArr) {
                if (listenerHolder.isDirect) {
                    listenerHolder.listener.mo193onRequestSequenceCompletedRuT0dZU(requestMetadata, j2);
                } else {
                    listenerHolder.executor.execute(new Runnable() { // from class: androidx.camera.camera2.impl.ComboRequestListener$onRequestSequenceCompleted-RuT0dZU$$inlined$dispatch$1
                        @Override // java.lang.Runnable
                        public final void run() {
                            listenerHolder.listener.mo193onRequestSequenceCompletedRuT0dZU(requestMetadata, j2);
                        }
                    });
                }
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    public void onRequestSequenceCreated(final RequestMetadata requestMetadata) {
        x.f(requestMetadata, "requestMetadata");
        ListenerHolder[] listenerHolderArr = this._listenerHolders;
        if (listenerHolderArr.length != 0) {
            for (final ListenerHolder listenerHolder : listenerHolderArr) {
                if (listenerHolder.isDirect) {
                    listenerHolder.listener.onRequestSequenceCreated(requestMetadata);
                } else {
                    listenerHolder.executor.execute(new Runnable() { // from class: androidx.camera.camera2.impl.ComboRequestListener$onRequestSequenceCreated$$inlined$dispatch$1
                        @Override // java.lang.Runnable
                        public final void run() {
                            listenerHolder.listener.onRequestSequenceCreated(requestMetadata);
                        }
                    });
                }
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    public void onRequestSequenceSubmitted(final RequestMetadata requestMetadata) {
        x.f(requestMetadata, "requestMetadata");
        ListenerHolder[] listenerHolderArr = this._listenerHolders;
        if (listenerHolderArr.length != 0) {
            for (final ListenerHolder listenerHolder : listenerHolderArr) {
                if (listenerHolder.isDirect) {
                    listenerHolder.listener.onRequestSequenceSubmitted(requestMetadata);
                } else {
                    listenerHolder.executor.execute(new Runnable() { // from class: androidx.camera.camera2.impl.ComboRequestListener$onRequestSequenceSubmitted$$inlined$dispatch$1
                        @Override // java.lang.Runnable
                        public final void run() {
                            listenerHolder.listener.onRequestSequenceSubmitted(requestMetadata);
                        }
                    });
                }
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onStarted-uGKBvU4 */
    public void mo194onStarteduGKBvU4(RequestMetadata requestMetadata, long j2, long j3) {
        final RequestMetadata requestMetadata2;
        final long j4;
        final long j5;
        x.f(requestMetadata, "requestMetadata");
        ListenerHolder[] listenerHolderArr = this._listenerHolders;
        int length = listenerHolderArr.length;
        if (length != 0) {
            int i2 = 0;
            while (i2 < length) {
                final ListenerHolder listenerHolder = listenerHolderArr[i2];
                if (listenerHolder.isDirect) {
                    RequestMetadata requestMetadata3 = requestMetadata;
                    long j6 = j2;
                    long j7 = j3;
                    listenerHolder.listener.mo194onStarteduGKBvU4(requestMetadata3, j6, j7);
                    requestMetadata2 = requestMetadata3;
                    j4 = j6;
                    j5 = j7;
                } else {
                    requestMetadata2 = requestMetadata;
                    j4 = j2;
                    j5 = j3;
                    listenerHolder.executor.execute(new Runnable() { // from class: androidx.camera.camera2.impl.ComboRequestListener$onStarted-uGKBvU4$$inlined$dispatch$1
                        @Override // java.lang.Runnable
                        public final void run() {
                            listenerHolder.listener.mo194onStarteduGKBvU4(requestMetadata2, j4, j5);
                        }
                    });
                }
                i2++;
                requestMetadata = requestMetadata2;
                j2 = j4;
                j3 = j5;
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onTotalCaptureResult-CcXjc1I */
    public void mo195onTotalCaptureResultCcXjc1I(RequestMetadata requestMetadata, long j2, FrameInfo frameInfo) {
        final RequestMetadata requestMetadata2;
        final long j3;
        final FrameInfo frameInfo2;
        x.f(requestMetadata, "requestMetadata");
        x.f(frameInfo, "totalCaptureResult");
        ListenerHolder[] listenerHolderArr = this._listenerHolders;
        int length = listenerHolderArr.length;
        if (length != 0) {
            int i2 = 0;
            while (i2 < length) {
                final ListenerHolder listenerHolder = listenerHolderArr[i2];
                if (listenerHolder.isDirect) {
                    listenerHolder.listener.mo195onTotalCaptureResultCcXjc1I(requestMetadata, j2, frameInfo);
                    requestMetadata2 = requestMetadata;
                    j3 = j2;
                    frameInfo2 = frameInfo;
                } else {
                    requestMetadata2 = requestMetadata;
                    j3 = j2;
                    frameInfo2 = frameInfo;
                    listenerHolder.executor.execute(new Runnable() { // from class: androidx.camera.camera2.impl.ComboRequestListener$onTotalCaptureResult-CcXjc1I$$inlined$dispatch$1
                        @Override // java.lang.Runnable
                        public final void run() {
                            listenerHolder.listener.mo195onTotalCaptureResultCcXjc1I(requestMetadata2, j3, frameInfo2);
                        }
                    });
                }
                i2++;
                requestMetadata = requestMetadata2;
                j2 = j3;
                frameInfo = frameInfo2;
            }
        }
    }

    public final void removeListener(Request.Listener listener) {
        x.f(listener, "listener");
        synchronized (this.lock) {
            ListenerHolder[] listenerHolderArr = this._listenerHolders;
            ArrayList arrayList = new ArrayList();
            for (ListenerHolder listenerHolder : listenerHolderArr) {
                if (listenerHolder.listener != listener) {
                    arrayList.add(listenerHolder);
                }
            }
            this._listenerHolders = (ListenerHolder[]) arrayList.toArray(new ListenerHolder[0]);
        }
    }
}
