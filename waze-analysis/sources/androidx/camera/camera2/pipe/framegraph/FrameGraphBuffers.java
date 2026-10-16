package androidx.camera.camera2.pipe.framegraph;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.FrameBuffer;
import androidx.camera.camera2.pipe.FrameReference;
import androidx.camera.camera2.pipe.Metadata;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestsKt;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.camera2.pipe.config.FrameGraphCoroutineScope;
import androidx.camera.camera2.pipe.config.FrameGraphScope;
import androidx.camera.camera2.pipe.internal.FrameDistributor;
import e.b.c;
import h.a.i;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.q;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
@FrameGraphScope
/* loaded from: classes2.dex */
public final class FrameGraphBuffers implements FrameDistributor.FrameStartedListener {
    private final List<FrameBufferImpl> buffers;
    private final CameraGraph cameraGraph;
    private final af frameGraphCoroutineScope;
    private final Object lock;
    private Map<Object, Object> parameters;
    private Set<StreamId> streams;

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.framegraph.FrameGraphBuffers$invalidate$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements q<af, CameraGraph.Session, e<? super ab>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(3, eVar);
        }

        @Override // h.g.a.q
        public final Object invoke(af afVar, CameraGraph.Session session, e<? super ab> eVar) {
            AnonymousClass1 anonymousClass1 = FrameGraphBuffers.this.new AnonymousClass1(eVar);
            anonymousClass1.L$0 = session;
            return anonymousClass1.invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            FrameGraphBuffers.this.flush((CameraGraph.Session) this.L$0);
            return ab.f48028a;
        }
    }

    public FrameGraphBuffers(CameraGraph cameraGraph, @FrameGraphCoroutineScope af afVar) {
        x.f(cameraGraph, "cameraGraph");
        x.f(afVar, "frameGraphCoroutineScope");
        this.cameraGraph = cameraGraph;
        this.frameGraphCoroutineScope = afVar;
        this.lock = new Object();
        this.buffers = new ArrayList();
        this.streams = new LinkedHashSet();
        this.parameters = new LinkedHashMap();
    }

    private final boolean updateStreamsAndParameters() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (FrameBufferImpl frameBufferImpl : this.buffers) {
            linkedHashSet.addAll(frameBufferImpl.getStreams());
            for (Map.Entry<Object, Object> entry : frameBufferImpl.getParameters().entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (!(key instanceof CaptureRequest.Key) && !(key instanceof Metadata.Key)) {
                    Object key2 = entry.getKey();
                    Objects.toString(key2);
                    throw new IllegalStateException("Invalid type for ".concat(String.valueOf(key2)));
                }
                if (linkedHashMap.containsKey(key) && !x.n(linkedHashMap.get(key), value)) {
                    throw new IllegalStateException("Conflicting parameter values: " + key + " has different values (" + linkedHashMap.get(key) + " and " + value + ").");
                }
                linkedHashMap.put(key, value);
            }
        }
        boolean z = true;
        if (x.n(linkedHashSet, this.streams) && x.n(linkedHashMap, this.parameters)) {
            z = false;
        }
        this.streams = linkedHashSet;
        this.parameters = linkedHashMap;
        return z;
    }

    public final FrameBuffer attach$camera_camera2_pipe(Set<StreamId> set, Map<Object, ? extends Object> map, int i2) {
        boolean zUpdateStreamsAndParameters;
        x.f(set, "streams");
        x.f(map, "parameters");
        FrameBufferImpl frameBufferImpl = new FrameBufferImpl(this, set, map, i2);
        synchronized (this.lock) {
            this.buffers.add(frameBufferImpl);
            zUpdateStreamsAndParameters = updateStreamsAndParameters();
        }
        if (zUpdateStreamsAndParameters) {
            invalidate();
        }
        return frameBufferImpl;
    }

    public final void detach$camera_camera2_pipe(FrameBufferImpl frameBufferImpl) {
        boolean zUpdateStreamsAndParameters;
        x.f(frameBufferImpl, "frameBuffer");
        synchronized (this.lock) {
            this.buffers.remove(frameBufferImpl);
            zUpdateStreamsAndParameters = updateStreamsAndParameters();
        }
        if (zUpdateStreamsAndParameters) {
            invalidate();
        }
    }

    public final void flush(CameraGraph.Session session) {
        x.f(session, "session");
        synchronized (this.lock) {
            if (this.buffers.isEmpty()) {
                session.stopRepeating();
            } else {
                session.startRepeating(new Request(i.ao(this.streams), RequestsKt.filterToCaptureRequestParameters(this.parameters), RequestsKt.filterToMetadataParameters(this.parameters), null, null, null, 56, null));
            }
        }
    }

    public final void invalidate() {
        this.cameraGraph.useSessionIn(this.frameGraphCoroutineScope, new AnonymousClass1(null));
    }

    @Override // androidx.camera.camera2.pipe.internal.FrameDistributor.FrameStartedListener
    public void onFrameStarted(FrameReference frameReference) {
        x.f(frameReference, "frameReference");
        synchronized (this.lock) {
            Iterator<FrameBufferImpl> it = this.buffers.iterator();
            while (it.hasNext()) {
                it.next().onFrameStarted(frameReference);
            }
        }
    }

    /* renamed from: trimAll-aKI5c8E, reason: not valid java name */
    public final void m1137trimAllaKI5c8E(int i2) {
        ArrayList arrayList;
        synchronized (this.lock) {
            List<FrameBufferImpl> list = this.buffers;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (((FrameBufferImpl) obj).getStreams().contains(StreamId.m974boximpl(i2))) {
                    arrayList2.add(obj);
                }
            }
            arrayList = arrayList2;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((FrameBufferImpl) it.next()).trimAll();
        }
    }
}
