package androidx.camera.camera2.pipe.internal;

import androidx.camera.camera2.pipe.Frame;
import androidx.camera.camera2.pipe.FrameCapture;
import androidx.camera.camera2.pipe.OutputStatus;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.config.CameraGraphScope;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import h.a.i;
import h.a.u;
import h.e.b;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.a.a;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
@CameraGraphScope
/* loaded from: classes2.dex */
public final class FrameCaptureQueue implements AutoCloseable {
    private boolean closed;
    private final Object lock = new Object();
    private final u<FrameCaptureImpl> queue = new u<>();

    /* compiled from: WazeSource */
    public final class FrameCaptureImpl implements FrameCapture {
        private final a closed;
        private List<Frame.Listener> frameListeners;
        private final Request request;
        private final CompletableDeferred<OutputResult<Frame>> result;
        final /* synthetic */ FrameCaptureQueue this$0;

        public FrameCaptureImpl(FrameCaptureQueue frameCaptureQueue, Request request) {
            x.f(request, "request");
            this.this$0 = frameCaptureQueue;
            this.request = request;
            this.closed = b.e(false);
            this.result = bo.j();
            this.frameListeners = new ArrayList();
        }

        @Override // androidx.camera.camera2.pipe.FrameCapture
        public void addListener(Frame.Listener listener) {
            boolean z;
            x.f(listener, "listener");
            synchronized (this) {
                List<Frame.Listener> list = this.frameListeners;
                z = false;
                if (list != null) {
                    if (list.add(listener)) {
                        z = true;
                    }
                }
            }
            if (z) {
                return;
            }
            CompletableDeferred<OutputResult<Frame>> completableDeferred = this.result;
            Object obj = null;
            if (completableDeferred.ca() && !completableDeferred.u()) {
                Object objM1249unboximpl = ((OutputResult) completableDeferred.e()).m1249unboximpl();
                if (true == OutputResult.m1243getAvailableimpl(objM1249unboximpl)) {
                    obj = objM1249unboximpl;
                }
            }
            Frame frame = (Frame) obj;
            if (frame != null) {
                frame.addListener(listener);
            } else {
                listener.onFrameComplete();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // androidx.camera.camera2.pipe.FrameCapture
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object awaitFrame(h.c.e<? super androidx.camera.camera2.pipe.Frame> r6) {
            /*
                r5 = this;
                boolean r0 = r6 instanceof androidx.camera.camera2.pipe.internal.FrameCaptureQueue$FrameCaptureImpl$awaitFrame$1
                if (r0 == 0) goto L13
                r0 = r6
                androidx.camera.camera2.pipe.internal.FrameCaptureQueue$FrameCaptureImpl$awaitFrame$1 r0 = (androidx.camera.camera2.pipe.internal.FrameCaptureQueue$FrameCaptureImpl$awaitFrame$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.camera.camera2.pipe.internal.FrameCaptureQueue$FrameCaptureImpl$awaitFrame$1 r0 = new androidx.camera.camera2.pipe.internal.FrameCaptureQueue$FrameCaptureImpl$awaitFrame$1
                r0.<init>(r5, r6)
            L18:
                java.lang.Object r6 = r0.result
                h.c.a.a r1 = h.c.a.a.f48038a
                int r2 = r0.label
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L30
                if (r2 != r3) goto L28
                e.b.c.b(r6)
                goto L46
            L28:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L30:
                e.b.c.b(r6)
                kotlinx.a.a r6 = r5.closed
                boolean r6 = r6.c()
                if (r6 == 0) goto L3c
                return r4
            L3c:
                kotlinx.coroutines.CompletableDeferred<androidx.camera.camera2.pipe.internal.OutputResult<androidx.camera.camera2.pipe.Frame>> r5 = r5.result
                r0.label = r3
                java.lang.Object r6 = r5.c(r0)
                if (r6 == r1) goto L5f
            L46:
                androidx.camera.camera2.pipe.internal.OutputResult r6 = (androidx.camera.camera2.pipe.internal.OutputResult) r6
                java.lang.Object r5 = r6.m1249unboximpl()
                boolean r6 = androidx.camera.camera2.pipe.internal.OutputResult.m1243getAvailableimpl(r5)
                if (r3 == r6) goto L53
                r5 = r4
            L53:
                androidx.camera.camera2.pipe.Frame r5 = (androidx.camera.camera2.pipe.Frame) r5
                if (r5 == 0) goto L5e
                androidx.camera.camera2.pipe.FrameReference r5 = (androidx.camera.camera2.pipe.FrameReference) r5
                androidx.camera.camera2.pipe.Frame r5 = androidx.camera.camera2.pipe.FrameReference.CC.tryAcquire$default(r5, r4, r3, r4)
                return r5
            L5e:
                return r4
            L5f:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.internal.FrameCaptureQueue.FrameCaptureImpl.awaitFrame(h.c.e):java.lang.Object");
        }

        @Override // java.lang.AutoCloseable
        public void close() throws Exception {
            if (this.closed.b(false, true)) {
                m1207completeWithFailuretXNfJfc(OutputStatus.Companion.m754getUNAVAILABLEU7r42EA());
                CompletableDeferred<OutputResult<Frame>> completableDeferred = this.result;
                Object obj = null;
                if (completableDeferred.ca() && !completableDeferred.u()) {
                    Object objM1249unboximpl = ((OutputResult) completableDeferred.e()).m1249unboximpl();
                    if (true == OutputResult.m1243getAvailableimpl(objM1249unboximpl)) {
                        obj = objM1249unboximpl;
                    }
                }
                Frame frame = (Frame) obj;
                if (frame != null) {
                    FrameCaptureQueue$FrameCaptureImpl$$ExternalSyntheticAutoCloseableDispatcher0.m(frame);
                }
                FrameCaptureQueue frameCaptureQueue = this.this$0;
                synchronized (frameCaptureQueue.lock) {
                    frameCaptureQueue.queue.remove(this);
                }
            }
        }

        public final void completeWith(Frame frame) throws Exception {
            List<Frame.Listener> list;
            x.f(frame, TypedValues.AttributesType.S_FRAME);
            if (!this.result.a(OutputResult.m1239boximpl(frame))) {
                FrameCaptureQueue$FrameCaptureImpl$$ExternalSyntheticAutoCloseableDispatcher0.m(frame);
                return;
            }
            synchronized (this) {
                list = this.frameListeners;
                this.frameListeners = null;
            }
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    frame.addListener(list.get(i2));
                }
            }
        }

        /* renamed from: completeWithFailure-tXNfJfc, reason: not valid java name */
        public final void m1207completeWithFailuretXNfJfc(int i2) {
            List<Frame.Listener> list;
            if (this.result.a(OutputResult.m1239boximpl(OutputStatus.m741boximpl(i2)))) {
                synchronized (this) {
                    list = this.frameListeners;
                    this.frameListeners = null;
                }
                if (list != null) {
                    int size = list.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        list.get(i3).onFrameComplete();
                    }
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
        @Override // androidx.camera.camera2.pipe.FrameCapture
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public androidx.camera.camera2.pipe.Frame getFrame() {
            /*
                r3 = this;
                kotlinx.a.a r0 = r3.closed
                boolean r0 = r0.c()
                r1 = 0
                if (r0 == 0) goto La
                goto L37
            La:
                kotlinx.coroutines.CompletableDeferred<androidx.camera.camera2.pipe.internal.OutputResult<androidx.camera.camera2.pipe.Frame>> r3 = r3.result
                kotlinx.coroutines.am r3 = (kotlinx.coroutines.am) r3
                boolean r0 = r3.ca()
                r2 = 1
                if (r0 == 0) goto L2b
                boolean r0 = r3.u()
                if (r0 != 0) goto L2b
                java.lang.Object r3 = r3.e()
                androidx.camera.camera2.pipe.internal.OutputResult r3 = (androidx.camera.camera2.pipe.internal.OutputResult) r3
                java.lang.Object r3 = r3.m1249unboximpl()
                boolean r0 = androidx.camera.camera2.pipe.internal.OutputResult.m1243getAvailableimpl(r3)
                if (r2 == r0) goto L2c
            L2b:
                r3 = r1
            L2c:
                androidx.camera.camera2.pipe.Frame r3 = (androidx.camera.camera2.pipe.Frame) r3
                if (r3 == 0) goto L37
                androidx.camera.camera2.pipe.FrameReference r3 = (androidx.camera.camera2.pipe.FrameReference) r3
                androidx.camera.camera2.pipe.Frame r3 = androidx.camera.camera2.pipe.FrameReference.CC.tryAcquire$default(r3, r1, r2, r1)
                return r3
            L37:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.internal.FrameCaptureQueue.FrameCaptureImpl.getFrame():androidx.camera.camera2.pipe.Frame");
        }

        @Override // androidx.camera.camera2.pipe.FrameCapture
        public Request getRequest() {
            return this.request;
        }

        @Override // androidx.camera.camera2.pipe.FrameCapture
        /* renamed from: getStatus-U7r42EA */
        public int mo675getStatusU7r42EA() {
            if (this.closed.c()) {
                return OutputStatus.Companion.m754getUNAVAILABLEU7r42EA();
            }
            CompletableDeferred<OutputResult<Frame>> completableDeferred = this.result;
            if (!completableDeferred.ca()) {
                return OutputStatus.Companion.m753getPENDINGU7r42EA();
            }
            if (completableDeferred.u()) {
                return OutputStatus.Companion.m754getUNAVAILABLEU7r42EA();
            }
            Object objM1249unboximpl = ((OutputResult) completableDeferred.e()).m1249unboximpl();
            return OutputResult.m1243getAvailableimpl(objM1249unboximpl) ? OutputStatus.Companion.m748getAVAILABLEU7r42EA() : objM1249unboximpl == null ? OutputStatus.Companion.m754getUNAVAILABLEU7r42EA() : ((OutputStatus) objM1249unboximpl).m747unboximpl();
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        synchronized (this.lock) {
            if (this.closed) {
                return;
            }
            this.closed = true;
            List listAo = i.ao(this.queue);
            this.queue.clear();
            Iterator it = listAo.iterator();
            while (it.hasNext()) {
                ((FrameCaptureImpl) it.next()).m1207completeWithFailuretXNfJfc(OutputStatus.Companion.m749getERROR_OUTPUT_ABORTEDU7r42EA());
            }
        }
    }

    public final List<FrameCapture> enqueue(List<Request> list) {
        ArrayList arrayList;
        x.f(list, "requests");
        synchronized (this.lock) {
            List<Request> list2 = list;
            ArrayList arrayList2 = new ArrayList(i.q(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList2.add(new FrameCaptureImpl(this, (Request) it.next()));
            }
            arrayList = arrayList2;
            if (this.closed) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((FrameCaptureImpl) it2.next()).close();
                }
            } else {
                this.queue.addAll(arrayList);
            }
        }
        return arrayList;
    }

    public final FrameCaptureImpl remove(Request request) {
        FrameCaptureImpl frameCaptureImpl;
        FrameCaptureImpl next;
        x.f(request, "request");
        synchronized (this.lock) {
            frameCaptureImpl = null;
            if (!this.closed) {
                Iterator<FrameCaptureImpl> it = this.queue.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (x.n(next.getRequest(), request)) {
                        break;
                    }
                }
                FrameCaptureImpl frameCaptureImpl2 = next;
                if (frameCaptureImpl2 != null) {
                    this.queue.remove(frameCaptureImpl2);
                    frameCaptureImpl = frameCaptureImpl2;
                }
            }
        }
        return frameCaptureImpl;
    }

    public final FrameCaptureImpl enqueue(Request request) {
        FrameCaptureImpl frameCaptureImpl;
        x.f(request, "request");
        synchronized (this.lock) {
            frameCaptureImpl = new FrameCaptureImpl(this, request);
            if (!this.closed) {
                this.queue.add(frameCaptureImpl);
            } else {
                frameCaptureImpl.close();
            }
        }
        return frameCaptureImpl;
    }
}
