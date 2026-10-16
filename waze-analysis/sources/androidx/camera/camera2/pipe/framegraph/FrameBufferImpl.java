package androidx.camera.camera2.pipe.framegraph;

import androidx.camera.camera2.pipe.Frame;
import androidx.camera.camera2.pipe.FrameBuffer;
import androidx.camera.camera2.pipe.FrameReference;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.camera2.pipe.internal.FrameDistributor;
import androidx.camera.camera2.pipe.internal.FrameImpl;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import h.a.i;
import h.a.u;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.a.a;
import kotlinx.coroutines.b.ai;
import kotlinx.coroutines.b.bm;
import kotlinx.coroutines.b.bn;
import kotlinx.coroutines.b.bq;
import kotlinx.coroutines.b.bu;
import kotlinx.coroutines.b.ch;
import kotlinx.coroutines.b.ck;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class FrameBufferImpl implements FrameBuffer, FrameDistributor.FrameStartedListener {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final int FRAME_FLOW_EXTRA_BUFFER_CAPACITY = 4;
    private final bm<FrameReference> _frameFlow;
    private final bn<Integer> _size;
    private int capacity;
    private boolean closed;
    private final bq<FrameReference> frameFlow;
    private final FrameGraphBuffers frameGraphBuffers;
    private u<BufferEntry> frameQueue;
    private final Object lock;
    private final Map<Object, Object> parameters;
    private final ch<Integer> size;
    private final Set<StreamId> streams;

    public FrameBufferImpl(FrameGraphBuffers frameGraphBuffers, Set<StreamId> set, Map<Object, ? extends Object> map, int i2) {
        x.f(frameGraphBuffers, "frameGraphBuffers");
        x.f(set, "streams");
        x.f(map, "parameters");
        this.frameGraphBuffers = frameGraphBuffers;
        this.streams = set;
        this.parameters = map;
        this.lock = new Object();
        this.frameQueue = new u<>(i2);
        bm<FrameReference> bmVarC = bu.c(0, 4, a.f51272b);
        this._frameFlow = bmVarC;
        this.frameFlow = ai.S(bmVarC);
        if (i2 < 0) {
            throw new IllegalArgumentException("FrameBuffer capacity must be greater than or equal to 0");
        }
        bn<Integer> bnVarB = ck.b(0);
        this._size = bnVarB;
        this.size = ai.U(bnVarB);
        this.capacity = i2;
    }

    private final List<Frame> clearQueueAndExtractFrames() {
        u<BufferEntry> uVar = this.frameQueue;
        ArrayList arrayList = new ArrayList();
        for (BufferEntry bufferEntry : uVar) {
            BufferEntry.WithFrame withFrame = bufferEntry instanceof BufferEntry.WithFrame ? (BufferEntry.WithFrame) bufferEntry : null;
            Frame frame = withFrame != null ? withFrame.getFrame() : null;
            if (frame != null) {
                arrayList.add(frame);
            }
        }
        ArrayList arrayList2 = arrayList;
        this.frameQueue.clear();
        this._size.e(0);
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0065 A[Catch: all -> 0x0092, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:11:0x000f, B:12:0x0019, B:14:0x001f, B:16:0x0035, B:26:0x0065, B:17:0x003a, B:18:0x0041, B:20:0x0047, B:23:0x005f), top: B:40:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0091 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean release(h.g.a.l<? super androidx.camera.camera2.pipe.FrameReference, java.lang.Boolean> r6, boolean r7) throws java.lang.Exception {
        /*
            r5 = this;
            java.lang.Object r0 = r5.lock
            monitor-enter(r0)
            boolean r1 = r5.closed     // Catch: java.lang.Throwable -> L92
            r2 = 0
            if (r1 == 0) goto La
            monitor-exit(r0)
            return r2
        La:
            h.a.u<androidx.camera.camera2.pipe.framegraph.FrameBufferImpl$BufferEntry> r1 = r5.frameQueue
            r3 = -1
            if (r7 == 0) goto L3a
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L92
            int r7 = r1.size()     // Catch: java.lang.Throwable -> L92
            java.util.ListIterator r7 = r1.listIterator(r7)     // Catch: java.lang.Throwable -> L92
        L19:
            boolean r1 = r7.hasPrevious()     // Catch: java.lang.Throwable -> L92
            if (r1 == 0) goto L62
            java.lang.Object r1 = r7.previous()     // Catch: java.lang.Throwable -> L92
            androidx.camera.camera2.pipe.framegraph.FrameBufferImpl$BufferEntry r1 = (androidx.camera.camera2.pipe.framegraph.FrameBufferImpl.BufferEntry) r1     // Catch: java.lang.Throwable -> L92
            androidx.camera.camera2.pipe.FrameReference r1 = r1.getFrameReference()     // Catch: java.lang.Throwable -> L92
            java.lang.Object r1 = r6.invoke(r1)     // Catch: java.lang.Throwable -> L92
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L92
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L92
            if (r1 == 0) goto L19
            int r6 = r7.nextIndex()     // Catch: java.lang.Throwable -> L92
            goto L63
        L3a:
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L92
            java.util.Iterator r7 = r1.iterator()     // Catch: java.lang.Throwable -> L92
            r1 = r2
        L41:
            boolean r4 = r7.hasNext()     // Catch: java.lang.Throwable -> L92
            if (r4 == 0) goto L62
            java.lang.Object r4 = r7.next()     // Catch: java.lang.Throwable -> L92
            androidx.camera.camera2.pipe.framegraph.FrameBufferImpl$BufferEntry r4 = (androidx.camera.camera2.pipe.framegraph.FrameBufferImpl.BufferEntry) r4     // Catch: java.lang.Throwable -> L92
            androidx.camera.camera2.pipe.FrameReference r4 = r4.getFrameReference()     // Catch: java.lang.Throwable -> L92
            java.lang.Object r4 = r6.invoke(r4)     // Catch: java.lang.Throwable -> L92
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L92
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L92
            if (r4 == 0) goto L5f
            r6 = r1
            goto L63
        L5f:
            int r1 = r1 + 1
            goto L41
        L62:
            r6 = r3
        L63:
            if (r6 == r3) goto L7d
            h.a.u<androidx.camera.camera2.pipe.framegraph.FrameBufferImpl$BufferEntry> r7 = r5.frameQueue     // Catch: java.lang.Throwable -> L92
            java.lang.Object r6 = r7.remove(r6)     // Catch: java.lang.Throwable -> L92
            androidx.camera.camera2.pipe.framegraph.FrameBufferImpl$BufferEntry r6 = (androidx.camera.camera2.pipe.framegraph.FrameBufferImpl.BufferEntry) r6     // Catch: java.lang.Throwable -> L92
            kotlinx.coroutines.b.bn<java.lang.Integer> r7 = r5._size     // Catch: java.lang.Throwable -> L92
            h.a.u<androidx.camera.camera2.pipe.framegraph.FrameBufferImpl$BufferEntry> r5 = r5.frameQueue     // Catch: java.lang.Throwable -> L92
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L92
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L92
            r7.e(r5)     // Catch: java.lang.Throwable -> L92
            goto L7e
        L7d:
            r6 = 0
        L7e:
            monitor-exit(r0)
            boolean r5 = r6 instanceof androidx.camera.camera2.pipe.framegraph.FrameBufferImpl.BufferEntry.WithFrame
            if (r5 == 0) goto L8d
            r5 = r6
            androidx.camera.camera2.pipe.framegraph.FrameBufferImpl$BufferEntry$WithFrame r5 = (androidx.camera.camera2.pipe.framegraph.FrameBufferImpl.BufferEntry.WithFrame) r5
            androidx.camera.camera2.pipe.Frame r5 = r5.getFrame()
            androidx.camera.camera2.pipe.framegraph.FrameBufferImpl$$ExternalSyntheticAutoCloseableDispatcher0.m(r5)
        L8d:
            if (r6 == 0) goto L91
            r5 = 1
            return r5
        L91:
            return r2
        L92:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.framegraph.FrameBufferImpl.release(h.g.a.l, boolean):boolean");
    }

    static final boolean release$lambda$0(FrameReference frameReference, FrameReference frameReference2) {
        x.f(frameReference2, "it");
        return frameReference2 == frameReference;
    }

    static final boolean releaseFirst$lambda$0(FrameReference frameReference) {
        x.f(frameReference, "it");
        return true;
    }

    static final boolean releaseLast$lambda$0(FrameReference frameReference) {
        x.f(frameReference, "it");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0065 A[Catch: all -> 0x0084, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:11:0x000f, B:12:0x0019, B:14:0x001f, B:16:0x0035, B:26:0x0065, B:17:0x003a, B:18:0x0041, B:20:0x0047, B:23:0x005f), top: B:34:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0082 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.camera.camera2.pipe.Frame removeAndAcquire(h.g.a.l<? super androidx.camera.camera2.pipe.FrameReference, java.lang.Boolean> r6, boolean r7) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.lock
            monitor-enter(r0)
            boolean r1 = r5.closed     // Catch: java.lang.Throwable -> L84
            r2 = 0
            if (r1 == 0) goto La
            monitor-exit(r0)
            return r2
        La:
            h.a.u<androidx.camera.camera2.pipe.framegraph.FrameBufferImpl$BufferEntry> r1 = r5.frameQueue
            r3 = -1
            if (r7 == 0) goto L3a
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L84
            int r7 = r1.size()     // Catch: java.lang.Throwable -> L84
            java.util.ListIterator r7 = r1.listIterator(r7)     // Catch: java.lang.Throwable -> L84
        L19:
            boolean r1 = r7.hasPrevious()     // Catch: java.lang.Throwable -> L84
            if (r1 == 0) goto L62
            java.lang.Object r1 = r7.previous()     // Catch: java.lang.Throwable -> L84
            androidx.camera.camera2.pipe.framegraph.FrameBufferImpl$BufferEntry r1 = (androidx.camera.camera2.pipe.framegraph.FrameBufferImpl.BufferEntry) r1     // Catch: java.lang.Throwable -> L84
            androidx.camera.camera2.pipe.FrameReference r1 = r1.getFrameReference()     // Catch: java.lang.Throwable -> L84
            java.lang.Object r1 = r6.invoke(r1)     // Catch: java.lang.Throwable -> L84
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L84
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L84
            if (r1 == 0) goto L19
            int r6 = r7.nextIndex()     // Catch: java.lang.Throwable -> L84
            goto L63
        L3a:
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L84
            java.util.Iterator r7 = r1.iterator()     // Catch: java.lang.Throwable -> L84
            r1 = 0
        L41:
            boolean r4 = r7.hasNext()     // Catch: java.lang.Throwable -> L84
            if (r4 == 0) goto L62
            java.lang.Object r4 = r7.next()     // Catch: java.lang.Throwable -> L84
            androidx.camera.camera2.pipe.framegraph.FrameBufferImpl$BufferEntry r4 = (androidx.camera.camera2.pipe.framegraph.FrameBufferImpl.BufferEntry) r4     // Catch: java.lang.Throwable -> L84
            androidx.camera.camera2.pipe.FrameReference r4 = r4.getFrameReference()     // Catch: java.lang.Throwable -> L84
            java.lang.Object r4 = r6.invoke(r4)     // Catch: java.lang.Throwable -> L84
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L84
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L84
            if (r4 == 0) goto L5f
            r6 = r1
            goto L63
        L5f:
            int r1 = r1 + 1
            goto L41
        L62:
            r6 = r3
        L63:
            if (r6 == r3) goto L82
            h.a.u<androidx.camera.camera2.pipe.framegraph.FrameBufferImpl$BufferEntry> r7 = r5.frameQueue     // Catch: java.lang.Throwable -> L84
            java.lang.Object r6 = r7.remove(r6)     // Catch: java.lang.Throwable -> L84
            androidx.camera.camera2.pipe.framegraph.FrameBufferImpl$BufferEntry r6 = (androidx.camera.camera2.pipe.framegraph.FrameBufferImpl.BufferEntry) r6     // Catch: java.lang.Throwable -> L84
            kotlinx.coroutines.b.bn<java.lang.Integer> r7 = r5._size     // Catch: java.lang.Throwable -> L84
            h.a.u<androidx.camera.camera2.pipe.framegraph.FrameBufferImpl$BufferEntry> r1 = r5.frameQueue     // Catch: java.lang.Throwable -> L84
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L84
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L84
            r7.e(r1)     // Catch: java.lang.Throwable -> L84
            androidx.camera.camera2.pipe.Frame r5 = r5.tryAcquireFrameForExternalUse(r6)     // Catch: java.lang.Throwable -> L84
            monitor-exit(r0)
            return r5
        L82:
            monitor-exit(r0)
            return r2
        L84:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.framegraph.FrameBufferImpl.removeAndAcquire(h.g.a.l, boolean):androidx.camera.camera2.pipe.Frame");
    }

    static final boolean removeFirst$lambda$0(FrameReference frameReference) {
        x.f(frameReference, "it");
        return true;
    }

    static final boolean removeLast$lambda$0(FrameReference frameReference) {
        x.f(frameReference, "it");
        return true;
    }

    private final Frame tryAcquireForInternalUse(FrameReference frameReference) {
        FrameImpl frameImpl = frameReference instanceof FrameImpl ? (FrameImpl) frameReference : null;
        return frameImpl != null ? frameImpl.tryAcquireForInternalUse$camera_camera2_pipe(getStreams()) : null;
    }

    private final Frame tryAcquireFrameForExternalUse(BufferEntry bufferEntry) {
        Frame frame;
        BufferEntry.WithFrame withFrame = bufferEntry instanceof BufferEntry.WithFrame ? (BufferEntry.WithFrame) bufferEntry : null;
        if (withFrame == null || (frame = withFrame.getFrame()) == null) {
            return null;
        }
        ((FrameImpl) frame).setExternal$camera_camera2_pipe(true);
        return frame;
    }

    @Override // androidx.camera.camera2.pipe.FrameBuffer, java.lang.AutoCloseable
    public void close() throws Exception {
        synchronized (this.lock) {
            if (this.closed) {
                return;
            }
            this.closed = true;
            Iterator<Frame> it = clearQueueAndExtractFrames().iterator();
            while (it.hasNext()) {
                FrameBufferImpl$$ExternalSyntheticAutoCloseableDispatcher0.m(it.next());
            }
            this.frameGraphBuffers.detach$camera_camera2_pipe(this);
        }
    }

    @Override // androidx.camera.camera2.pipe.FrameBuffer
    public int getCapacity() {
        return this.capacity;
    }

    @Override // androidx.camera.camera2.pipe.FrameBuffer
    public bq<FrameReference> getFrameFlow() {
        return this.frameFlow;
    }

    @Override // androidx.camera.camera2.pipe.FrameBuffer
    public Map<Object, Object> getParameters() {
        return this.parameters;
    }

    @Override // androidx.camera.camera2.pipe.FrameBuffer
    public ch<Integer> getSize() {
        return this.size;
    }

    @Override // androidx.camera.camera2.pipe.FrameBuffer
    public Set<StreamId> getStreams() {
        return this.streams;
    }

    @Override // androidx.camera.camera2.pipe.internal.FrameDistributor.FrameStartedListener
    public void onFrameStarted(FrameReference frameReference) throws Exception {
        Frame frame;
        x.f(frameReference, "frameReference");
        if (getCapacity() == 0) {
            synchronized (this.lock) {
                if (!this.closed) {
                    this._frameFlow.c(frameReference);
                }
            }
            return;
        }
        Frame frameTryAcquireForInternalUse = tryAcquireForInternalUse(frameReference);
        BufferEntry.WithoutFrame withFrame = frameTryAcquireForInternalUse != null ? new BufferEntry.WithFrame(frameTryAcquireForInternalUse) : new BufferEntry.WithoutFrame(frameReference);
        synchronized (this.lock) {
            frame = null;
            if (!this.closed) {
                if (this.frameQueue.size() == getCapacity()) {
                    BufferEntry bufferEntryRemoveFirst = this.frameQueue.removeFirst();
                    if (bufferEntryRemoveFirst instanceof BufferEntry.WithFrame) {
                        frame = ((BufferEntry.WithFrame) bufferEntryRemoveFirst).getFrame();
                    }
                }
                this.frameQueue.add(withFrame);
                this._size.e(Integer.valueOf(this.frameQueue.size()));
                this._frameFlow.c(withFrame.getFrameReference());
            } else if (withFrame instanceof BufferEntry.WithFrame) {
                frame = ((BufferEntry.WithFrame) withFrame).getFrame();
            }
        }
        if (frame != null) {
            FrameBufferImpl$$ExternalSyntheticAutoCloseableDispatcher0.m(frame);
        }
    }

    @Override // androidx.camera.camera2.pipe.FrameBuffer
    public List<FrameReference> peekAllReferences(l<? super FrameReference, Boolean> lVar) {
        ArrayList arrayListH;
        synchronized (this.lock) {
            if (this.closed) {
                arrayListH = i.h();
            } else {
                u<BufferEntry> uVar = this.frameQueue;
                if (lVar == null) {
                    u<BufferEntry> uVar2 = uVar;
                    ArrayList arrayList = new ArrayList(i.q(uVar2, 10));
                    Iterator<BufferEntry> it = uVar2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next().getFrameReference());
                    }
                    arrayListH = arrayList;
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<BufferEntry> it2 = uVar.iterator();
                    while (it2.hasNext()) {
                        FrameReference frameReference = it2.next().getFrameReference();
                        if (true != lVar.invoke(frameReference).booleanValue()) {
                            frameReference = null;
                        }
                        if (frameReference != null) {
                            arrayList2.add(frameReference);
                        }
                    }
                    arrayListH = arrayList2;
                }
            }
        }
        return arrayListH;
    }

    @Override // androidx.camera.camera2.pipe.FrameBuffer
    public FrameReference peekFirstReference(l<? super FrameReference, Boolean> lVar) {
        FrameReference frameReference;
        BufferEntry next;
        BufferEntry bufferEntry;
        synchronized (this.lock) {
            frameReference = null;
            if (!this.closed) {
                u<BufferEntry> uVar = this.frameQueue;
                if (lVar == null) {
                    bufferEntry = (BufferEntry) uVar.b();
                } else {
                    Iterator<BufferEntry> it = uVar.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (lVar.invoke(next.getFrameReference()).booleanValue()) {
                            break;
                        }
                    }
                    bufferEntry = next;
                }
                if (bufferEntry != null) {
                    frameReference = bufferEntry.getFrameReference();
                }
            }
        }
        return frameReference;
    }

    @Override // androidx.camera.camera2.pipe.FrameBuffer
    public FrameReference peekLastReference(l<? super FrameReference, Boolean> lVar) {
        FrameReference frameReference;
        BufferEntry bufferEntryPrevious;
        BufferEntry bufferEntry;
        synchronized (this.lock) {
            frameReference = null;
            if (!this.closed) {
                u<BufferEntry> uVar = this.frameQueue;
                if (lVar == null) {
                    bufferEntry = (BufferEntry) uVar.d();
                } else {
                    u<BufferEntry> uVar2 = uVar;
                    ListIterator<BufferEntry> listIterator = uVar2.listIterator(uVar2.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            bufferEntryPrevious = null;
                            break;
                        }
                        bufferEntryPrevious = listIterator.previous();
                        if (lVar.invoke(bufferEntryPrevious.getFrameReference()).booleanValue()) {
                            break;
                        }
                    }
                    bufferEntry = bufferEntryPrevious;
                }
                if (bufferEntry != null) {
                    frameReference = bufferEntry.getFrameReference();
                }
            }
        }
        return frameReference;
    }

    @Override // androidx.camera.camera2.pipe.FrameBuffer
    public boolean releaseAll(l<? super FrameReference, Boolean> lVar) throws Exception {
        ArrayList<BufferEntry> arrayList = new ArrayList();
        synchronized (this.lock) {
            if (!this.closed && !this.frameQueue.isEmpty()) {
                Iterator it = this.frameQueue.iterator();
                while (it.hasNext()) {
                    BufferEntry bufferEntry = (BufferEntry) it.next();
                    if (lVar == null || lVar.invoke(bufferEntry.getFrameReference()).booleanValue()) {
                        it.remove();
                        arrayList.add(bufferEntry);
                    }
                }
                this._size.e(Integer.valueOf(this.frameQueue.size()));
                for (BufferEntry bufferEntry2 : arrayList) {
                    if (bufferEntry2 instanceof BufferEntry.WithFrame) {
                        FrameBufferImpl$$ExternalSyntheticAutoCloseableDispatcher0.m(((BufferEntry.WithFrame) bufferEntry2).getFrame());
                    }
                }
                return !arrayList.isEmpty();
            }
            return false;
        }
    }

    @Override // androidx.camera.camera2.pipe.FrameBuffer
    public boolean releaseFirst(l<? super FrameReference, Boolean> lVar) {
        if (lVar == null) {
            lVar = new l() { // from class: androidx.camera.camera2.pipe.framegraph.FrameBufferImpl$$ExternalSyntheticLambda3
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    FrameBufferImpl.releaseFirst$lambda$0((FrameReference) obj);
                    return true;
                }
            };
        }
        return release(lVar, false);
    }

    @Override // androidx.camera.camera2.pipe.FrameBuffer
    public boolean releaseLast(l<? super FrameReference, Boolean> lVar) {
        if (lVar == null) {
            lVar = new l() { // from class: androidx.camera.camera2.pipe.framegraph.FrameBufferImpl$$ExternalSyntheticLambda4
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    FrameBufferImpl.releaseLast$lambda$0((FrameReference) obj);
                    return true;
                }
            };
        }
        return release(lVar, true);
    }

    @Override // androidx.camera.camera2.pipe.FrameBuffer
    public List<Frame> removeAll(l<? super FrameReference, Boolean> lVar) {
        synchronized (this.lock) {
            if (!this.closed && !this.frameQueue.isEmpty()) {
                if (lVar == null) {
                    return clearQueueAndExtractFrames();
                }
                List listB = i.b();
                Iterator it = this.frameQueue.iterator();
                while (it.hasNext()) {
                    BufferEntry bufferEntry = (BufferEntry) it.next();
                    if (lVar.invoke(bufferEntry.getFrameReference()).booleanValue()) {
                        it.remove();
                        if (bufferEntry instanceof BufferEntry.WithFrame) {
                            listB.add(((BufferEntry.WithFrame) bufferEntry).getFrame());
                        }
                    }
                }
                List<Frame> listA = i.a(listB);
                this._size.e(Integer.valueOf(this.frameQueue.size()));
                return listA;
            }
            return i.h();
        }
    }

    @Override // androidx.camera.camera2.pipe.FrameBuffer
    public Frame removeFirst(l<? super FrameReference, Boolean> lVar) {
        if (lVar == null) {
            lVar = new l() { // from class: androidx.camera.camera2.pipe.framegraph.FrameBufferImpl$$ExternalSyntheticLambda6
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    FrameBufferImpl.removeFirst$lambda$0((FrameReference) obj);
                    return true;
                }
            };
        }
        return removeAndAcquire(lVar, false);
    }

    @Override // androidx.camera.camera2.pipe.FrameBuffer
    public Frame removeLast(l<? super FrameReference, Boolean> lVar) {
        if (lVar == null) {
            lVar = new l() { // from class: androidx.camera.camera2.pipe.framegraph.FrameBufferImpl$$ExternalSyntheticLambda5
                @Override // h.g.a.l
                public final Object invoke(Object obj) {
                    FrameBufferImpl.removeLast$lambda$0((FrameReference) obj);
                    return true;
                }
            };
        }
        return removeAndAcquire(lVar, true);
    }

    @Override // androidx.camera.camera2.pipe.FrameBuffer
    public void setCapacity(int i2) throws Exception {
        if (i2 < 0) {
            throw new IllegalArgumentException("Capacity cannot be negative");
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this.lock) {
            if (!this.closed && i2 != this.capacity) {
                this.capacity = i2;
                int size = this.frameQueue.size();
                if (i2 < size) {
                    for (int i3 = 0; i3 < size - i2; i3++) {
                        BufferEntry bufferEntryRemoveFirst = this.frameQueue.removeFirst();
                        BufferEntry.WithFrame withFrame = bufferEntryRemoveFirst instanceof BufferEntry.WithFrame ? (BufferEntry.WithFrame) bufferEntryRemoveFirst : null;
                        if (withFrame != null) {
                            arrayList.add(withFrame.getFrame());
                        }
                    }
                    this.frameQueue = new u<>(this.frameQueue);
                }
                this._size.e(Integer.valueOf(this.frameQueue.size()));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    FrameBufferImpl$$ExternalSyntheticAutoCloseableDispatcher0.m((Frame) it.next());
                }
            }
        }
    }

    public final void trimAll() throws Exception {
        synchronized (this.lock) {
            if (this.closed) {
                return;
            }
            Iterator<Frame> it = clearQueueAndExtractFrames().iterator();
            while (it.hasNext()) {
                FrameBufferImpl$$ExternalSyntheticAutoCloseableDispatcher0.m(it.next());
            }
        }
    }

    /* compiled from: WazeSource */
    final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* compiled from: WazeSource */
    abstract class BufferEntry {
        private final FrameReference frameReference;

        /* compiled from: WazeSource */
        public final class WithFrame extends BufferEntry {
            private final Frame frame;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WithFrame(Frame frame) {
                super(frame, null);
                x.f(frame, TypedValues.AttributesType.S_FRAME);
                this.frame = frame;
            }

            public final Frame getFrame() {
                return this.frame;
            }
        }

        /* compiled from: WazeSource */
        public final class WithoutFrame extends BufferEntry {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public WithoutFrame(FrameReference frameReference) {
                super(frameReference, null);
                x.f(frameReference, TypedValues.Custom.S_REFERENCE);
            }
        }

        private BufferEntry(FrameReference frameReference) {
            this.frameReference = frameReference;
        }

        public final FrameReference getFrameReference() {
            return this.frameReference;
        }

        public /* synthetic */ BufferEntry(FrameReference frameReference, o oVar) {
            this(frameReference);
        }
    }

    @Override // androidx.camera.camera2.pipe.FrameBuffer
    public boolean release(final FrameReference frameReference) {
        x.f(frameReference, "frameReference");
        return releaseFirst(new l() { // from class: androidx.camera.camera2.pipe.framegraph.FrameBufferImpl$$ExternalSyntheticLambda7
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(FrameBufferImpl.release$lambda$0(frameReference, (FrameReference) obj));
            }
        });
    }
}
