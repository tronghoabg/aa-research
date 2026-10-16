package androidx.camera.camera2.config;

import androidx.camera.camera2.adapter.CameraStateAdapter;
import androidx.camera.camera2.adapter.GraphStateToCameraStateAdapter;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.CameraStream;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.core.impl.DeferrableSurface;
import g.a.a;
import h.a.r;
import h.c.b.a.c;
import h.c.e;
import h.f;
import h.g;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class UseCaseCameraContext {
    private final f<CameraGraph> _graph;
    private final a<CameraGraph> cameraGraphProvider;
    private final CameraStateAdapter cameraStateAdapter;
    private final GraphStateToCameraStateAdapter graphStateToCameraStateAdapter;
    private final a<Map<CameraStream.Config, DeferrableSurface>> streamConfigMapProvider;
    private final f surfaceToStreamMap$delegate;

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.config.UseCaseCameraContext$useGraphSession$1, reason: invalid class name */
    final class AnonymousClass1<T> extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(e<? super AnonymousClass1> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UseCaseCameraContext.this.useGraphSession(null, this);
        }
    }

    public UseCaseCameraContext(a<CameraGraph> aVar, CameraStateAdapter cameraStateAdapter, GraphStateToCameraStateAdapter graphStateToCameraStateAdapter, a<Map<CameraStream.Config, DeferrableSurface>> aVar2, final Map<DeferrableSurface, StreamId> map) {
        x.f(aVar, "cameraGraphProvider");
        x.f(cameraStateAdapter, "cameraStateAdapter");
        x.f(graphStateToCameraStateAdapter, "graphStateToCameraStateAdapter");
        x.f(aVar2, "streamConfigMapProvider");
        this.cameraGraphProvider = aVar;
        this.cameraStateAdapter = cameraStateAdapter;
        this.graphStateToCameraStateAdapter = graphStateToCameraStateAdapter;
        this.streamConfigMapProvider = aVar2;
        this._graph = g.a(new h.g.a.a() { // from class: androidx.camera.camera2.config.UseCaseCameraContext$$ExternalSyntheticLambda3
            @Override // h.g.a.a
            public final Object invoke() {
                return this.f$0.cameraGraphProvider.get();
            }
        });
        this.surfaceToStreamMap$delegate = g.a(new h.g.a.a() { // from class: androidx.camera.camera2.config.UseCaseCameraContext$$ExternalSyntheticLambda4
            @Override // h.g.a.a
            public final Object invoke() {
                return UseCaseCameraContext.surfaceToStreamMap_delegate$lambda$0(map, this);
            }
        });
    }

    static final Map surfaceToStreamMap_delegate$lambda$0(Map map, UseCaseCameraContext useCaseCameraContext) {
        if (map != null) {
            return map;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<CameraStream.Config, DeferrableSurface> map2 = useCaseCameraContext.streamConfigMapProvider.get();
        x.e(map2, "get(...)");
        for (Map.Entry<CameraStream.Config, DeferrableSurface> entry : map2.entrySet()) {
            CameraStream.Config key = entry.getKey();
            DeferrableSurface value = entry.getValue();
            CameraStream cameraStream = useCaseCameraContext.getGraph().getStreams().get(key);
            if (cameraStream != null) {
                linkedHashMap.put(value, StreamId.m974boximpl(cameraStream.m578getIdptHMqGs()));
            }
        }
        return r.r(linkedHashMap);
    }

    private final <T> Object useGraphSession$$forInline(l<? super CameraGraph.Session, ? extends T> lVar, e<? super T> eVar) throws Exception {
        AutoCloseable autoCloseable = (AutoCloseable) getGraph().acquireSession(eVar);
        try {
            T tInvoke = lVar.invoke((CameraGraph.Session) autoCloseable);
            r.y(autoCloseable, null);
            return tInvoke;
        } finally {
        }
    }

    public final void closeGraph() throws Exception {
        if (this._graph.isInitialized()) {
            CameraGraph graph = getGraph();
            UseCaseCameraContext$$ExternalSyntheticAutoCloseableDispatcher0.m(graph);
            this.cameraStateAdapter.onGraphClosed(graph);
        }
    }

    public final void configureCameraStateListener() {
        this.graphStateToCameraStateAdapter.setCameraGraph(getGraph());
        this.cameraStateAdapter.onGraphUpdated(getGraph());
    }

    public final CameraGraph getGraph() {
        CameraGraph value = this._graph.getValue();
        x.e(value, "getValue(...)");
        return value;
    }

    public final Set<StreamId> getStreamIdsFromSurfaces(Collection<? extends DeferrableSurface> collection) {
        x.f(collection, "deferrableSurfaces");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            StreamId streamId = getSurfaceToStreamMap().get((DeferrableSurface) it.next());
            if (streamId != null) {
                linkedHashSet.add(StreamId.m974boximpl(streamId.m980unboximpl()));
            }
        }
        return linkedHashSet;
    }

    public final Map<DeferrableSurface, StreamId> getSurfaceToStreamMap() {
        return (Map) this.surfaceToStreamMap$delegate.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> java.lang.Object useGraphSession(h.g.a.l<? super androidx.camera.camera2.pipe.CameraGraph.Session, ? extends T> r5, h.c.e<? super T> r6) throws java.lang.Exception {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.camera.camera2.config.UseCaseCameraContext.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.camera.camera2.config.UseCaseCameraContext$useGraphSession$1 r0 = (androidx.camera.camera2.config.UseCaseCameraContext.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.config.UseCaseCameraContext$useGraphSession$1 r0 = new androidx.camera.camera2.config.UseCaseCameraContext$useGraphSession$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r4 = r0.L$0
            r5 = r4
            h.g.a.l r5 = (h.g.a.l) r5
            e.b.c.b(r6)
            goto L45
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            e.b.c.b(r6)
            androidx.camera.camera2.pipe.CameraGraph r4 = r4.getGraph()
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r4.acquireSession(r0)
            if (r6 == r1) goto L5a
        L45:
            java.lang.AutoCloseable r6 = (java.lang.AutoCloseable) r6
            r4 = r6
            androidx.camera.camera2.pipe.CameraGraph$Session r4 = (androidx.camera.camera2.pipe.CameraGraph.Session) r4     // Catch: java.lang.Throwable -> L53
            java.lang.Object r4 = r5.invoke(r4)     // Catch: java.lang.Throwable -> L53
            r5 = 0
            h.a.r.y(r6, r5)
            return r4
        L53:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L55
        L55:
            r5 = move-exception
            h.a.r.y(r6, r4)
            throw r5
        L5a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.config.UseCaseCameraContext.useGraphSession(h.g.a.l, h.c.e):java.lang.Object");
    }

    public /* synthetic */ UseCaseCameraContext(a aVar, CameraStateAdapter cameraStateAdapter, GraphStateToCameraStateAdapter graphStateToCameraStateAdapter, a aVar2, Map map, int i2, o oVar) {
        this(aVar, cameraStateAdapter, graphStateToCameraStateAdapter, aVar2, (i2 & 16) != 0 ? null : map);
    }
}
