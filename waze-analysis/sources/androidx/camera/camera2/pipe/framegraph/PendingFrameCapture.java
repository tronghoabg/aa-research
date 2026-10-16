package androidx.camera.camera2.pipe.framegraph;

import androidx.camera.camera2.pipe.Frame;
import androidx.camera.camera2.pipe.FrameCapture;
import androidx.camera.camera2.pipe.OutputStatus;
import androidx.camera.camera2.pipe.Request;
import h.c.b.a.c;
import h.c.e;
import h.g.b.aq;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.bo;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class PendingFrameCapture implements FrameCapture {
    private boolean aborted;
    private boolean closed;
    private final CompletableDeferred<FrameCapture> deferred;
    private final Object lock;
    private List<Frame.Listener> pendingListeners;
    private final Request request;

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.framegraph.PendingFrameCapture$awaitFrame$1, reason: invalid class name */
    final class AnonymousClass1 extends c {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PendingFrameCapture.this.awaitFrame(this);
        }
    }

    public PendingFrameCapture(Request request) {
        x.f(request, "request");
        this.request = request;
        this.lock = new Object();
        this.deferred = bo.j();
        this.pendingListeners = new ArrayList();
    }

    private final void terminate(boolean z) throws Exception {
        aq aqVar = new aq();
        synchronized (this.lock) {
            if (!this.closed && !this.aborted) {
                if (z) {
                    this.closed = true;
                } else {
                    this.aborted = true;
                }
                this.deferred.a(null);
                List<Frame.Listener> list = this.pendingListeners;
                this.pendingListeners = null;
                aqVar.f48105a = list;
                Object objE = this.deferred.e();
                Object obj = aqVar.f48105a;
                if (obj != null) {
                    Iterator it = ((List) obj).iterator();
                    while (it.hasNext()) {
                        ((Frame.Listener) it.next()).onFrameComplete();
                    }
                }
                FrameCapture frameCapture = (FrameCapture) objE;
                if (frameCapture != null) {
                    PendingFrameCapture$$ExternalSyntheticAutoCloseableDispatcher0.m(frameCapture);
                }
            }
        }
    }

    public final void abort() throws Exception {
        terminate(false);
    }

    @Override // androidx.camera.camera2.pipe.FrameCapture
    public void addListener(Frame.Listener listener) {
        x.f(listener, "listener");
        synchronized (this.lock) {
            if (this.closed || this.aborted) {
                listener.onFrameComplete();
            } else {
                if (this.deferred.ca()) {
                    FrameCapture frameCapture = (FrameCapture) this.deferred.e();
                    if (frameCapture != null) {
                        frameCapture.addListener(listener);
                        return;
                    }
                    return;
                }
                List<Frame.Listener> list = this.pendingListeners;
                if (list != null) {
                    list.add(listener);
                }
            }
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
            boolean r0 = r6 instanceof androidx.camera.camera2.pipe.framegraph.PendingFrameCapture.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.camera.camera2.pipe.framegraph.PendingFrameCapture$awaitFrame$1 r0 = (androidx.camera.camera2.pipe.framegraph.PendingFrameCapture.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.pipe.framegraph.PendingFrameCapture$awaitFrame$1 r0 = new androidx.camera.camera2.pipe.framegraph.PendingFrameCapture$awaitFrame$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            e.b.c.b(r6)
            return r6
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            e.b.c.b(r6)
            goto L43
        L36:
            e.b.c.b(r6)
            kotlinx.coroutines.CompletableDeferred<androidx.camera.camera2.pipe.FrameCapture> r5 = r5.deferred
            r0.label = r4
            java.lang.Object r6 = r5.c(r0)
            if (r6 == r1) goto L53
        L43:
            androidx.camera.camera2.pipe.FrameCapture r6 = (androidx.camera.camera2.pipe.FrameCapture) r6
            if (r6 == 0) goto L51
            r0.label = r3
            java.lang.Object r5 = r6.awaitFrame(r0)
            if (r5 != r1) goto L50
            goto L53
        L50:
            return r5
        L51:
            r5 = 0
            return r5
        L53:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.framegraph.PendingFrameCapture.awaitFrame(h.c.e):java.lang.Object");
    }

    @Override // java.lang.AutoCloseable
    public void close() throws Exception {
        terminate(true);
    }

    @Override // androidx.camera.camera2.pipe.FrameCapture
    public Frame getFrame() {
        FrameCapture frameCapture;
        if (!this.deferred.ca() || (frameCapture = (FrameCapture) this.deferred.e()) == null) {
            return null;
        }
        return frameCapture.getFrame();
    }

    @Override // androidx.camera.camera2.pipe.FrameCapture
    public Request getRequest() {
        return this.request;
    }

    @Override // androidx.camera.camera2.pipe.FrameCapture
    /* renamed from: getStatus-U7r42EA */
    public int mo675getStatusU7r42EA() {
        FrameCapture frameCapture;
        synchronized (this.lock) {
            if (!this.deferred.ca() || (frameCapture = (FrameCapture) this.deferred.e()) == null) {
                return this.aborted ? OutputStatus.Companion.m749getERROR_OUTPUT_ABORTEDU7r42EA() : this.closed ? OutputStatus.Companion.m754getUNAVAILABLEU7r42EA() : OutputStatus.Companion.m753getPENDINGU7r42EA();
            }
            return frameCapture.mo675getStatusU7r42EA();
        }
    }

    public final void setFrameCapture(FrameCapture frameCapture) {
        x.f(frameCapture, "frameCapture");
        synchronized (this.lock) {
            if (this.closed || this.aborted || !this.deferred.a(frameCapture)) {
                PendingFrameCapture$$ExternalSyntheticAutoCloseableDispatcher0.m(frameCapture);
                return;
            }
            List<Frame.Listener> list = this.pendingListeners;
            this.pendingListeners = null;
            if (list != null) {
                Iterator<Frame.Listener> it = list.iterator();
                while (it.hasNext()) {
                    frameCapture.addListener(it.next());
                }
            }
        }
    }
}
