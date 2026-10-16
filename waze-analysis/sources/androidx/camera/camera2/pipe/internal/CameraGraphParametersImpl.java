package androidx.camera.camera2.pipe.internal;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.pipe.Metadata;
import androidx.camera.camera2.pipe.ParameterUpdateListener;
import androidx.camera.camera2.pipe.Parameters;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.config.CameraGraphScope;
import androidx.camera.camera2.pipe.config.ForCameraGraph;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.core.Token;
import androidx.camera.camera2.pipe.graph.GraphProcessor;
import e.b.c;
import h.a.i;
import h.a.r;
import h.ab;
import h.c.a.a;
import h.c.b.a.g;
import h.c.e;
import h.g.a.p;
import h.g.b.x;
import h.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.af;

/* compiled from: WazeSource */
@CameraGraphScope
/* loaded from: classes2.dex */
public final class CameraGraphParametersImpl implements Parameters {
    private boolean dirty;
    private final GraphProcessor graphProcessor;
    private final af graphScope;
    private final Map<CaptureRequest.Key<?>, Request.Listener> listenerMap;
    private final List<ParameterUpdateRequestListener> listeners;
    private final Object lock;
    private final Map<Object, Object> parameters;
    private final GraphSessionLock sessionLock;

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.internal.CameraGraphParametersImpl$applyUpdate$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<Token, e<? super ab>, Object> {
        int label;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(2, eVar);
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return CameraGraphParametersImpl.this.new AnonymousClass1(eVar);
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
            CameraGraphParametersImpl.this.flush();
            return ab.f48028a;
        }
    }

    public CameraGraphParametersImpl(GraphSessionLock graphSessionLock, GraphProcessor graphProcessor, @ForCameraGraph af afVar) {
        x.f(graphSessionLock, "sessionLock");
        x.f(graphProcessor, "graphProcessor");
        x.f(afVar, "graphScope");
        this.sessionLock = graphSessionLock;
        this.graphProcessor = graphProcessor;
        this.graphScope = afVar;
        this.lock = new Object();
        this.parameters = new LinkedHashMap();
        this.listeners = new ArrayList();
        this.listenerMap = new LinkedHashMap();
    }

    private final void applyUpdate() {
        this.sessionLock.withTokenIn$camera_camera2_pipe(this.graphScope, new AnonymousClass1(null));
    }

    private final boolean modify(Map<Object, Object> map, Object obj, Object obj2) {
        if ((obj instanceof CaptureRequest.Key) || (obj instanceof Metadata.Key)) {
            if (map.containsKey(obj) && x.n(map.get(obj), obj2)) {
                return false;
            }
            map.put(obj, obj2);
            return true;
        }
        if (!Log.INSTANCE.getWARN_LOGGABLE()) {
            return false;
        }
        android.util.Log.w(Log.TAG, "Skipping set parameter (key=" + obj + ", value=" + obj2 + "). " + obj + " is not a valid parameter type.");
        return false;
    }

    private final boolean shouldApplyUpdate(boolean z) {
        if (!z || this.dirty) {
            return false;
        }
        this.dirty = true;
        return true;
    }

    @Override // androidx.camera.camera2.pipe.Parameters
    public <T> void apply(CaptureRequest.Key<T> key, T t, ParameterUpdateListener parameterUpdateListener) {
        boolean z;
        boolean zShouldApplyUpdate;
        x.f(key, "key");
        x.f(parameterUpdateListener, "listener");
        synchronized (this.lock) {
            z = true;
            zShouldApplyUpdate = false;
            if (!this.parameters.containsKey(key) || !x.n(this.parameters.get(key), t)) {
                ParameterUpdateRequestListener parameterUpdateRequestListener = new ParameterUpdateRequestListener(key, parameterUpdateListener, this);
                modify(this.parameters, key, t);
                this.listeners.add(parameterUpdateRequestListener);
                this.listenerMap.put(key, parameterUpdateRequestListener);
                z = false;
                zShouldApplyUpdate = shouldApplyUpdate(true);
            }
        }
        if (z) {
            parameterUpdateListener.onUpdateSkipped(null);
        } else if (zShouldApplyUpdate) {
            applyUpdate();
        }
    }

    @Override // androidx.camera.camera2.pipe.Parameters
    public void clear() {
        boolean zShouldApplyUpdate;
        synchronized (this.lock) {
            if (this.parameters.isEmpty()) {
                zShouldApplyUpdate = false;
            } else {
                this.parameters.clear();
                zShouldApplyUpdate = shouldApplyUpdate(true);
            }
        }
        if (zShouldApplyUpdate) {
            applyUpdate();
        }
    }

    public final void flush() {
        i.h();
        synchronized (this.lock) {
            if (this.dirty) {
                this.dirty = false;
                List<? extends Request.Listener> listAo = i.ao(this.listenerMap.values());
                this.graphProcessor.updateGraphParameters(new HashMap(this.parameters), listAo);
            }
        }
    }

    @Override // androidx.camera.camera2.pipe.Parameters
    public <T> T get(CaptureRequest.Key<T> key) {
        T t;
        x.f(key, "key");
        synchronized (this.lock) {
            t = (T) this.parameters.get(key);
        }
        return t;
    }

    @Override // androidx.camera.camera2.pipe.Parameters
    public <T> boolean remove(CaptureRequest.Key<T> key) {
        x.f(key, "key");
        return removeAll(e.c.d.a.o(key));
    }

    @Override // androidx.camera.camera2.pipe.Parameters
    public boolean removeAll(Set<?> set) {
        boolean z;
        boolean zShouldApplyUpdate;
        x.f(set, "keys");
        synchronized (this.lock) {
            z = false;
            for (Object obj : set) {
                if (obj == null) {
                    throw new IllegalStateException("Parameter key should not be null!");
                }
                if (this.parameters.containsKey(obj)) {
                    this.parameters.remove(obj);
                    z = true;
                }
                if (!(obj instanceof CaptureRequest.Key) && !(obj instanceof Metadata.Key) && Log.INSTANCE.getWARN_LOGGABLE()) {
                    android.util.Log.w(Log.TAG, "Skipping removing parameter with key " + obj + ". " + obj + " is not a valid parameter type.");
                }
            }
            zShouldApplyUpdate = shouldApplyUpdate(z);
        }
        if (zShouldApplyUpdate) {
            applyUpdate();
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        if (h.g.b.x.n(r5.listenerMap.get(r6), r7) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003b, code lost:
    
        r5.listenerMap.remove(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        r2.remove();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void removeAndPurgePriors$camera_camera2_pipe(android.hardware.camera2.CaptureRequest.Key<?> r6, androidx.camera.camera2.pipe.internal.ParameterUpdateRequestListener r7) {
        /*
            r5 = this;
            java.lang.String r0 = "key"
            h.g.b.x.f(r6, r0)
            java.lang.String r0 = "listener"
            h.g.b.x.f(r7, r0)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.Set r0 = (java.util.Set) r0
            java.lang.Object r1 = r5.lock
            monitor-enter(r1)
            java.util.List<androidx.camera.camera2.pipe.internal.ParameterUpdateRequestListener> r2 = r5.listeners     // Catch: java.lang.Throwable -> L68
            java.util.ListIterator r2 = r2.listIterator()     // Catch: java.lang.Throwable -> L68
        L1a:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L68
            if (r3 == 0) goto L52
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L68
            androidx.camera.camera2.pipe.internal.ParameterUpdateRequestListener r3 = (androidx.camera.camera2.pipe.internal.ParameterUpdateRequestListener) r3     // Catch: java.lang.Throwable -> L68
            boolean r4 = h.g.b.x.n(r3, r7)     // Catch: java.lang.Throwable -> L68
            if (r4 == 0) goto L41
            r2.remove()     // Catch: java.lang.Throwable -> L68
            java.util.Map<android.hardware.camera2.CaptureRequest$Key<?>, androidx.camera.camera2.pipe.Request$Listener> r2 = r5.listenerMap     // Catch: java.lang.Throwable -> L68
            java.lang.Object r2 = r2.get(r6)     // Catch: java.lang.Throwable -> L68
            boolean r7 = h.g.b.x.n(r2, r7)     // Catch: java.lang.Throwable -> L68
            if (r7 == 0) goto L52
            java.util.Map<android.hardware.camera2.CaptureRequest$Key<?>, androidx.camera.camera2.pipe.Request$Listener> r5 = r5.listenerMap     // Catch: java.lang.Throwable -> L68
            r5.remove(r6)     // Catch: java.lang.Throwable -> L68
            goto L52
        L41:
            android.hardware.camera2.CaptureRequest$Key r4 = r3.getKey()     // Catch: java.lang.Throwable -> L68
            boolean r4 = h.g.b.x.n(r4, r6)     // Catch: java.lang.Throwable -> L68
            if (r4 == 0) goto L1a
            r0.add(r3)     // Catch: java.lang.Throwable -> L68
            r2.remove()     // Catch: java.lang.Throwable -> L68
            goto L1a
        L52:
            monitor-exit(r1)
            java.util.Iterator r5 = r0.iterator()
        L57:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L67
            java.lang.Object r6 = r5.next()
            androidx.camera.camera2.pipe.internal.ParameterUpdateRequestListener r6 = (androidx.camera.camera2.pipe.internal.ParameterUpdateRequestListener) r6
            r6.trySkip$camera_camera2_pipe()
            goto L57
        L67:
            return
        L68:
            r5 = move-exception
            monitor-exit(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.internal.CameraGraphParametersImpl.removeAndPurgePriors$camera_camera2_pipe(android.hardware.camera2.CaptureRequest$Key, androidx.camera.camera2.pipe.internal.ParameterUpdateRequestListener):void");
    }

    @Override // androidx.camera.camera2.pipe.Parameters
    public <T> void set(CaptureRequest.Key<T> key, T t) {
        x.f(key, "key");
        setAll(r.e(new k(key, t)));
    }

    @Override // androidx.camera.camera2.pipe.Parameters
    public void setAll(Map<Object, ? extends Object> map) {
        boolean zShouldApplyUpdate;
        x.f(map, "newParameters");
        synchronized (this.lock) {
            boolean z = false;
            for (Map.Entry<Object, ? extends Object> entry : map.entrySet()) {
                if (modify(this.parameters, entry.getKey(), entry.getValue())) {
                    z = true;
                }
            }
            zShouldApplyUpdate = shouldApplyUpdate(z);
        }
        if (zShouldApplyUpdate) {
            applyUpdate();
        }
    }

    @Override // androidx.camera.camera2.pipe.Parameters
    public <T> boolean remove(Metadata.Key<T> key) {
        x.f(key, "key");
        return removeAll(e.c.d.a.o(key));
    }

    @Override // androidx.camera.camera2.pipe.Parameters
    public <T> void set(Metadata.Key<T> key, T t) {
        x.f(key, "key");
        setAll(r.e(new k(key, t)));
    }

    @Override // androidx.camera.camera2.pipe.Parameters
    public <T> T get(Metadata.Key<T> key) {
        T t;
        x.f(key, "key");
        synchronized (this.lock) {
            t = (T) this.parameters.get(key);
        }
        return t;
    }
}
