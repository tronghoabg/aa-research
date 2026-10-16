package androidx.camera.camera2.pipe.framegraph;

import androidx.camera.camera2.pipe.FrameCapture;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.config.FrameGraphCoroutineScope;
import androidx.camera.camera2.pipe.config.FrameGraphScope;
import androidx.camera.camera2.pipe.core.Token;
import androidx.camera.camera2.pipe.graph.GraphProcessor;
import androidx.camera.camera2.pipe.internal.FrameCaptureQueue;
import androidx.camera.camera2.pipe.internal.GraphSessionLock;
import e.b.c;
import h.a.i;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.b.am;
import h.g.b.aq;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
@FrameGraphScope
/* loaded from: classes2.dex */
public final class FrameGraphFrameCaptureQueue implements AutoCloseable {
    private boolean closed;
    private boolean dirty;
    private final FrameCaptureQueue frameCaptureQueue;
    private final af frameGraphCoroutineScope;
    private final GraphProcessor graphProcessor;
    private final Object lock;
    private final List<PendingFrameCapture> requestBuffer;
    private final GraphSessionLock sessionLock;

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.framegraph.FrameGraphFrameCaptureQueue$applyUpdate$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<Token, e<? super ab>, Object> {
        int label;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return FrameGraphFrameCaptureQueue.this.new AnonymousClass1(eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(Token token, e<? super ab> eVar) {
            return ((AnonymousClass1) create(token, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) throws Exception {
            ab abVar;
            a aVar = a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            aq aqVar = new aq();
            am amVar = new am();
            try {
                Object obj2 = FrameGraphFrameCaptureQueue.this.lock;
                FrameGraphFrameCaptureQueue frameGraphFrameCaptureQueue = FrameGraphFrameCaptureQueue.this;
                synchronized (obj2) {
                    amVar.f48101a = frameGraphFrameCaptureQueue.closed;
                    if (!frameGraphFrameCaptureQueue.requestBuffer.isEmpty()) {
                        aqVar.f48105a = new ArrayList(frameGraphFrameCaptureQueue.requestBuffer);
                        frameGraphFrameCaptureQueue.requestBuffer.clear();
                    }
                    frameGraphFrameCaptureQueue.dirty = false;
                }
                if (amVar.f48101a) {
                    List list = (List) aqVar.f48105a;
                    if (list != null) {
                        FrameGraphFrameCaptureQueue.this.abortAll(list);
                    }
                    abVar = ab.f48028a;
                } else {
                    Collection collection = (Collection) aqVar.f48105a;
                    if (collection != null && !collection.isEmpty()) {
                        FrameGraphFrameCaptureQueue.this.flush((List) aqVar.f48105a);
                        return ab.f48028a;
                    }
                    abVar = ab.f48028a;
                }
                return abVar;
            } finally {
                List list2 = (List) aqVar.f48105a;
                if (list2 != null) {
                    FrameGraphFrameCaptureQueue.this.abortAll(list2);
                }
            }
        }
    }

    public FrameGraphFrameCaptureQueue(FrameCaptureQueue frameCaptureQueue, GraphProcessor graphProcessor, GraphSessionLock graphSessionLock, @FrameGraphCoroutineScope af afVar) {
        x.f(frameCaptureQueue, "frameCaptureQueue");
        x.f(graphProcessor, "graphProcessor");
        x.f(graphSessionLock, "sessionLock");
        x.f(afVar, "frameGraphCoroutineScope");
        this.frameCaptureQueue = frameCaptureQueue;
        this.graphProcessor = graphProcessor;
        this.sessionLock = graphSessionLock;
        this.frameGraphCoroutineScope = afVar;
        this.lock = new Object();
        this.requestBuffer = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void abortAll(List<PendingFrameCapture> list) throws Exception {
        Iterator<PendingFrameCapture> it = list.iterator();
        while (it.hasNext()) {
            it.next().abort();
        }
    }

    private final void applyUpdate() {
        this.sessionLock.withTokenIn$camera_camera2_pipe(this.frameGraphCoroutineScope, new AnonymousClass1(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void flush(List<PendingFrameCapture> list) throws Exception {
        List<PendingFrameCapture> list2 = list;
        ArrayList arrayList = new ArrayList(i.q(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((PendingFrameCapture) it.next()).getRequest());
        }
        ArrayList arrayList2 = arrayList;
        List<FrameCapture> listEnqueue = this.frameCaptureQueue.enqueue(arrayList2);
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.graphProcessor.submit((Request) arrayList2.get(i2))) {
                list.get(i2).setFrameCapture(listEnqueue.get(i2));
            } else {
                FrameGraphFrameCaptureQueue$$ExternalSyntheticAutoCloseableDispatcher0.m(listEnqueue.get(i2));
                list.get(i2).abort();
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        synchronized (this.lock) {
            if (this.closed) {
                return;
            }
            this.closed = true;
            ArrayList arrayList = new ArrayList(this.requestBuffer);
            this.requestBuffer.clear();
            abortAll(arrayList);
        }
    }

    public final List<FrameCapture> enqueue(List<Request> list) throws Exception {
        boolean z;
        boolean z2;
        x.f(list, "requests");
        List<Request> list2 = list;
        ArrayList arrayList = new ArrayList(i.q(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new PendingFrameCapture((Request) it.next()));
        }
        ArrayList arrayList2 = arrayList;
        synchronized (this.lock) {
            z = true;
            z2 = false;
            if (this.closed) {
                z2 = true;
                z = false;
            } else {
                this.requestBuffer.addAll(arrayList2);
                if (this.dirty) {
                    z = false;
                } else {
                    this.dirty = true;
                }
            }
        }
        if (z) {
            applyUpdate();
            return arrayList2;
        }
        if (z2) {
            abortAll(arrayList2);
        }
        return arrayList2;
    }

    public final FrameCapture enqueue(Request request) {
        x.f(request, "request");
        return (FrameCapture) i.P(enqueue(i.d(request)));
    }
}
