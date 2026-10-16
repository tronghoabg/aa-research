package androidx.camera.camera2.pipe.internal;

import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestListeners;
import androidx.camera.camera2.pipe.config.CameraGraphScope;
import androidx.camera.camera2.pipe.config.ForCameraGraph;
import androidx.camera.camera2.pipe.core.Token;
import androidx.camera.camera2.pipe.graph.GraphProcessor;
import e.b.c;
import h.a.i;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.b.x;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
@CameraGraphScope
/* loaded from: classes2.dex */
public final class CameraGraphRequestListenersImpl implements RequestListeners {
    private boolean dirty;
    private final GraphProcessor graphProcessor;
    private final af graphScope;
    private final Set<Request.Listener> listeners;
    private final Object lock;
    private final GraphSessionLock sessionLock;

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.internal.CameraGraphRequestListenersImpl$applyUpdate$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<Token, e<? super ab>, Object> {
        int label;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return CameraGraphRequestListenersImpl.this.new AnonymousClass1(eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(Token token, e<? super ab> eVar) {
            return ((AnonymousClass1) create(token, eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.f48038a;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c.b(obj);
            CameraGraphRequestListenersImpl.this.flush();
            return ab.f48028a;
        }
    }

    public CameraGraphRequestListenersImpl(GraphSessionLock graphSessionLock, GraphProcessor graphProcessor, @ForCameraGraph af afVar) {
        x.f(graphSessionLock, "sessionLock");
        x.f(graphProcessor, "graphProcessor");
        x.f(afVar, "graphScope");
        this.sessionLock = graphSessionLock;
        this.graphProcessor = graphProcessor;
        this.graphScope = afVar;
        this.lock = new Object();
        this.listeners = new LinkedHashSet();
    }

    private final void applyUpdate() {
        this.sessionLock.withTokenIn$camera_camera2_pipe(this.graphScope, new AnonymousClass1(null));
    }

    private final boolean shouldApplyUpdate(boolean z) {
        if (!z || this.dirty) {
            return false;
        }
        this.dirty = true;
        return true;
    }

    @Override // androidx.camera.camera2.pipe.RequestListeners
    public void add(Request.Listener listener) {
        x.f(listener, "listener");
        addAll(i.d(listener));
    }

    @Override // androidx.camera.camera2.pipe.RequestListeners
    public void addAll(List<? extends Request.Listener> list) {
        boolean zShouldApplyUpdate;
        x.f(list, "listeners");
        synchronized (this.lock) {
            zShouldApplyUpdate = shouldApplyUpdate(this.listeners.addAll(list));
        }
        if (zShouldApplyUpdate) {
            applyUpdate();
        }
    }

    public final void flush() {
        synchronized (this.lock) {
            if (this.dirty) {
                this.dirty = false;
                this.graphProcessor.updateRequestListeners(i.ao(this.listeners));
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.RequestListeners
    public void remove(Request.Listener listener) {
        x.f(listener, "listener");
        removeAll(i.d(listener));
    }

    @Override // androidx.camera.camera2.pipe.RequestListeners
    public void removeAll(List<? extends Request.Listener> list) {
        boolean zShouldApplyUpdate;
        x.f(list, "listeners");
        synchronized (this.lock) {
            zShouldApplyUpdate = shouldApplyUpdate(this.listeners.removeAll(i.au(list)));
        }
        if (zShouldApplyUpdate) {
            applyUpdate();
        }
    }
}
