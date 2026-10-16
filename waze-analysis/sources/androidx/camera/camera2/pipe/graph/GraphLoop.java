package androidx.camera.camera2.pipe.graph;

import androidx.camera.camera2.pipe.CameraGraphId;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestsKt;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.core.ProcessingQueue;
import androidx.camera.camera2.pipe.graph.GraphCommand;
import h.a.i;
import h.a.r;
import h.ab;
import h.c.b.a.c;
import h.c.b.a.g;
import h.c.e;
import h.e.b;
import h.g.a.l;
import h.g.a.p;
import h.g.b.o;
import h.g.b.x;
import java.io.Closeable;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlinx.coroutines.ae;
import kotlinx.coroutines.af;
import kotlinx.coroutines.ag;
import kotlinx.coroutines.aj;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class GraphLoop implements Closeable {
    public static final Companion Companion = new Companion(null);
    private final kotlinx.a.a _captureProcessingEnabled;
    private Map<?, ? extends Object> _graph3AParameters;
    private GraphParameters _graphParameters;
    private Request _repeatingRequest;
    private List<? extends Request.Listener> _requestListeners;
    private GraphRequestProcessor _requestProcessor;
    private final CameraGraphId cameraGraphId;
    private volatile boolean closed;
    private Map<?, ? extends Object> currentGraph3AParameters;
    private GraphParameters currentGraphParameters;
    private Request currentRepeatingRequest;
    private List<? extends Request.Listener> currentRequestListeners;
    private GraphRequestProcessor currentRequestProcessor;
    private Map<?, ? extends Object> currentRequiredParameters;
    private final Map<?, Object> defaultParameters;
    private final af graphLoopScope;
    private final List<Listener> listeners;
    private final Object lock;
    private final ProcessingQueue<GraphCommand> processingQueue;
    private final List<Request.Listener> requiredListeners;
    private final Map<?, Object> requiredParameters;
    private final af shutdownScope;

    /* compiled from: WazeSource */
    public interface Listener {
        void onGraphShutdown();

        void onGraphStopped();

        void onStopRepeating();
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.graph.GraphLoop$finalizeUnprocessedCommands$1, reason: invalid class name */
    final class AnonymousClass1 extends g implements p<af, e<? super ab>, Object> {
        final /* synthetic */ GraphCommand $command;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(GraphCommand graphCommand, e<? super AnonymousClass1> eVar) {
            super(2, eVar);
            this.$command = graphCommand;
        }

        @Override // h.c.b.a.a
        public final e<ab> create(Object obj, e<?> eVar) {
            return new AnonymousClass1(this.$command, eVar);
        }

        @Override // h.g.a.p
        public final Object invoke(af afVar, e<? super ab> eVar) {
            return ((AnonymousClass1) create(afVar, eVar)).invokeSuspend(ab.f48028a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
        
            if (r5.shutdown$camera_camera2_pipe(r4) != r0) goto L21;
         */
        @Override // h.c.b.a.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                h.c.a.a r0 = h.c.a.a.f48038a
                int r1 = r4.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                e.b.c.b(r5)
                goto L4c
            L10:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L18:
                e.b.c.b(r5)
                goto L35
            L1c:
                e.b.c.b(r5)
                androidx.camera.camera2.pipe.graph.GraphCommand r5 = r4.$command
                androidx.camera.camera2.pipe.graph.GraphCommand$RequestProcessor r5 = (androidx.camera.camera2.pipe.graph.GraphCommand.RequestProcessor) r5
                androidx.camera.camera2.pipe.graph.GraphRequestProcessor r5 = r5.getOld()
                if (r5 == 0) goto L35
                r1 = r4
                h.c.e r1 = (h.c.e) r1
                r4.label = r3
                java.lang.Object r5 = r5.shutdown$camera_camera2_pipe(r1)
                if (r5 != r0) goto L35
                goto L4b
            L35:
                androidx.camera.camera2.pipe.graph.GraphCommand r5 = r4.$command
                androidx.camera.camera2.pipe.graph.GraphCommand$RequestProcessor r5 = (androidx.camera.camera2.pipe.graph.GraphCommand.RequestProcessor) r5
                androidx.camera.camera2.pipe.graph.GraphRequestProcessor r5 = r5.getNew()
                if (r5 == 0) goto L4c
                r1 = r4
                h.c.e r1 = (h.c.e) r1
                r4.label = r2
                java.lang.Object r4 = r5.shutdown$camera_camera2_pipe(r1)
                if (r4 == r0) goto L4b
                goto L4c
            L4b:
                return r0
            L4c:
                h.ab r4 = h.ab.f48028a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.graph.GraphLoop.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.graph.GraphLoop$processRequestProcessor$1, reason: invalid class name and case insensitive filesystem */
    final class C01741 extends c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        C01741(e<? super C01741> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GraphLoop.this.processRequestProcessor(null, 0, null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.graph.GraphLoop$processShutdown$1, reason: invalid class name and case insensitive filesystem */
    final class C01751 extends c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C01751(e<? super C01751> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GraphLoop.this.processShutdown(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GraphLoop(CameraGraphId cameraGraphId, Map<?, ? extends Object> map, Map<?, ? extends Object> map2, List<? extends Request.Listener> list, List<? extends Listener> list2, af afVar, kotlinx.coroutines.ab abVar) {
        x.f(cameraGraphId, "cameraGraphId");
        x.f(map, "defaultParameters");
        x.f(map2, "requiredParameters");
        x.f(list, "requiredListeners");
        x.f(list2, "listeners");
        x.f(afVar, "shutdownScope");
        x.f(abVar, "dispatcher");
        this.cameraGraphId = cameraGraphId;
        this.defaultParameters = map;
        this.requiredParameters = map2;
        this.requiredListeners = list;
        this.listeners = list2;
        this.shutdownScope = afVar;
        af afVarE = aj.e(abVar.plus(new ae("CXCP-GraphLoop")));
        this.graphLoopScope = afVarE;
        ProcessingQueue.Companion companion = ProcessingQueue.Companion;
        ProcessingQueue<GraphCommand> processingQueue = new ProcessingQueue<>(0, new GraphLoop$processingQueue$1(this), new GraphLoop$processingQueue$2(this), 1, null);
        companion.processIn(processingQueue, afVarE);
        this.processingQueue = processingQueue;
        this.lock = new Object();
        int i2 = 3;
        this._graphParameters = new GraphParameters(null, 0 == true ? 1 : 0, i2, 0 == true ? 1 : 0);
        this._graph3AParameters = r.j();
        this._requestListeners = i.h();
        this._captureProcessingEnabled = b.e(true);
        this.currentGraphParameters = new GraphParameters(0 == true ? 1 : 0, 0 == true ? 1 : 0, i2, 0 == true ? 1 : 0);
        this.currentGraph3AParameters = r.j();
        this.currentRequiredParameters = map2;
        this.currentRequestListeners = list;
    }

    private final void abortRequests(List<Request> list) {
        List<Request> list2 = list;
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            Request request = list.get(i2);
            int size2 = getCurrentActiveListeners().size();
            for (int i3 = 0; i3 < size2; i3++) {
                getCurrentActiveListeners().get(i3).onAborted(request);
            }
        }
        int size3 = list2.size();
        for (int i4 = 0; i4 < size3; i4++) {
            Request request2 = list.get(i4);
            int size4 = request2.getListeners().size();
            for (int i5 = 0; i5 < size4; i5++) {
                request2.getListeners().get(i5).onAborted(request2);
            }
        }
    }

    private final boolean buildAndSubmit(boolean z, List<Request> list, Map<?, ? extends Object> map) {
        Map<?, ? extends Object> mapB;
        GraphRequestProcessor graphRequestProcessor = this.currentRequestProcessor;
        if (graphRequestProcessor == null) {
            return false;
        }
        Map<?, ? extends Object> map2 = this.defaultParameters;
        Map<?, Object> parameters = this.currentGraphParameters.getParameters();
        if (map.isEmpty()) {
            mapB = this.currentRequiredParameters;
        } else {
            Map mapC = r.c();
            RequestsKt.putAllMetadata(mapC, this.currentGraph3AParameters);
            RequestsKt.putAllMetadata(mapC, map);
            RequestsKt.putAllMetadata(mapC, this.requiredParameters);
            mapB = r.b(mapC);
        }
        boolean zSubmit$camera_camera2_pipe = graphRequestProcessor.submit$camera_camera2_pipe(z, list, map2, parameters, mapB, getCurrentActiveListeners());
        if (!zSubmit$camera_camera2_pipe) {
            if (z) {
                if (Log.INSTANCE.getWARN_LOGGABLE()) {
                    Object objX = i.X(list);
                    Objects.toString(objX);
                    android.util.Log.w(Log.TAG, "Failed to repeat with ".concat(String.valueOf(objX)));
                    return false;
                }
            } else if (map.isEmpty()) {
                if (Log.INSTANCE.getWARN_LOGGABLE()) {
                    Objects.toString(list);
                    android.util.Log.w(Log.TAG, "Failed to submit capture with ".concat(String.valueOf(list)));
                    return false;
                }
            } else if (Log.INSTANCE.getWARN_LOGGABLE()) {
                android.util.Log.w(Log.TAG, "Failed to trigger with " + i.X(list) + " and " + map);
                return false;
            }
        }
        return zSubmit$camera_camera2_pipe;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ boolean buildAndSubmit$default(GraphLoop graphLoop, boolean z, List list, Map map, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            map = r.j();
        }
        return graphLoop.buildAndSubmit(z, list, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finalizeUnprocessedCommands(List<? extends GraphCommand> list) {
        for (GraphCommand graphCommand : list) {
            if (graphCommand instanceof GraphCommand.Capture) {
                abortRequests(((GraphCommand.Capture) graphCommand).getRequests());
            } else if (graphCommand instanceof GraphCommand.RequestProcessor) {
                aj.z(this.shutdownScope, null, ag.f51345d, new AnonymousClass1(graphCommand, null), 1);
            }
        }
    }

    private final List<Request.Listener> getCurrentActiveListeners() {
        return i.af(this.currentRequestListeners, this.currentGraphParameters.getListeners());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object process(List<GraphCommand> list, e<? super ab> eVar) {
        int iSelectGraphCommand = selectGraphCommand(list);
        GraphCommand graphCommand = list.get(iSelectGraphCommand);
        if (x.n(graphCommand, GraphCommand.Invalidate.INSTANCE)) {
            list.remove(iSelectGraphCommand);
        } else if (x.n(graphCommand, GraphCommand.Shutdown.INSTANCE)) {
            Object objProcessShutdown = processShutdown(list, eVar);
            if (objProcessShutdown == h.c.a.a.f48038a) {
                return objProcessShutdown;
            }
        } else if (x.n(graphCommand, GraphCommand.Abort.INSTANCE)) {
            processAbort(list, iSelectGraphCommand);
        } else if (x.n(graphCommand, GraphCommand.Stop.INSTANCE)) {
            processStop(list, iSelectGraphCommand);
        } else if (graphCommand instanceof GraphCommand.RequestProcessor) {
            Object objProcessRequestProcessor = processRequestProcessor(list, iSelectGraphCommand, (GraphCommand.RequestProcessor) graphCommand, eVar);
            if (objProcessRequestProcessor == h.c.a.a.f48038a) {
                return objProcessRequestProcessor;
            }
        } else if (graphCommand instanceof GraphCommand.Capture) {
            processCapture$default(this, list, iSelectGraphCommand, (GraphCommand.Capture) graphCommand, false, 8, null);
        } else if (graphCommand instanceof GraphCommand.Trigger) {
            processTrigger(list, iSelectGraphCommand, (GraphCommand.Trigger) graphCommand);
        } else if (graphCommand instanceof GraphCommand.Parameters) {
            processParameters(list, iSelectGraphCommand, (GraphCommand.Parameters) graphCommand);
        } else if (graphCommand instanceof GraphCommand.Listeners) {
            processListeners(list, iSelectGraphCommand, (GraphCommand.Listeners) graphCommand);
        } else {
            if (!(graphCommand instanceof GraphCommand.Repeat)) {
                throw new h.i();
            }
            processRepeat$default(this, list, iSelectGraphCommand, false, 4, null);
        }
        return ab.f48028a;
    }

    private final void processAbort(List<GraphCommand> list, int i2) {
        GraphRequestProcessor graphRequestProcessor = this.currentRequestProcessor;
        if (graphRequestProcessor != null) {
            graphRequestProcessor.abortCaptures$camera_camera2_pipe();
        }
        this.currentRepeatingRequest = null;
        list.remove(i2);
        int i3 = 0;
        while (i3 < i2) {
            GraphCommand graphCommand = list.get(i3);
            if (!x.n(graphCommand, GraphCommand.Stop.INSTANCE) && !x.n(graphCommand, GraphCommand.Abort.INSTANCE) && !(graphCommand instanceof GraphCommand.Repeat) && !(graphCommand instanceof GraphCommand.Trigger)) {
                if (graphCommand instanceof GraphCommand.Capture) {
                    abortRequests(((GraphCommand.Capture) graphCommand).getRequests());
                } else {
                    i3++;
                }
            }
            list.remove(i3);
            i2--;
        }
    }

    private final void processCapture(List<GraphCommand> list, int i2, GraphCommand.Capture capture, boolean z) {
        GraphLoop graphLoop;
        if (getCaptureProcessingEnabled()) {
            graphLoop = this;
            if (buildAndSubmit$default(graphLoop, false, capture.getRequests(), null, 4, null)) {
                list.remove(i2);
                return;
            }
        } else {
            graphLoop = this;
        }
        if (!z || i2 <= 0) {
            return;
        }
        int i3 = i2 - 1;
        if (!(list.get(i3) instanceof GraphCommand.Repeat)) {
            throw new IllegalStateException("Check failed.");
        }
        graphLoop.processRepeat(list, i3, false);
    }

    static /* synthetic */ void processCapture$default(GraphLoop graphLoop, List list, int i2, GraphCommand.Capture capture, boolean z, int i3, Object obj) {
        graphLoop.processCapture(list, i2, capture, z | (!((i3 & 8) == 0)));
    }

    private final void processListeners(List<GraphCommand> list, int i2, GraphCommand.Listeners listeners) {
        this.currentRequestListeners = i.aa(i.af(listeners.getListeners(), this.requiredListeners));
        list.remove(i2);
        int i3 = 0;
        while (i3 < i2) {
            if (list.get(i3) instanceof GraphCommand.Listeners) {
                list.remove(i3);
                i2--;
            } else {
                i3++;
            }
        }
        reissueRepeatingRequest();
    }

    private final void processParameters(List<GraphCommand> list, int i2, GraphCommand.Parameters parameters) {
        Map<?, ? extends Object> mapB;
        this.currentGraphParameters = parameters.getGraphParameters();
        this.currentGraph3AParameters = parameters.getGraph3AParameters();
        if (parameters.getGraph3AParameters().isEmpty()) {
            mapB = this.requiredParameters;
        } else {
            Map mapC = r.c();
            RequestsKt.putAllMetadata(mapC, parameters.getGraph3AParameters());
            RequestsKt.putAllMetadata(mapC, this.requiredParameters);
            mapB = r.b(mapC);
        }
        this.currentRequiredParameters = mapB;
        list.remove(i2);
        int i3 = 0;
        while (i3 < i2) {
            if (list.get(i3) instanceof GraphCommand.Parameters) {
                list.remove(i3);
                i2--;
            } else {
                i3++;
            }
        }
        reissueRepeatingRequest();
    }

    private final void processRepeat(List<GraphCommand> list, int i2, boolean z) {
        int i3;
        GraphLoop graphLoop;
        int i4 = i2;
        while (true) {
            int i5 = 0;
            if (i4 < 0) {
                GraphLoop graphLoop2 = this;
                if (!z || (i3 = i2 + 1) >= list.size()) {
                    return;
                }
                GraphCommand graphCommand = list.get(i3);
                if (graphCommand instanceof GraphCommand.Capture) {
                    graphLoop2.processCapture(list, i3, (GraphCommand.Capture) graphCommand, false);
                    return;
                } else {
                    if (graphCommand instanceof GraphCommand.Trigger) {
                        graphLoop2.processTrigger(list, i3, (GraphCommand.Trigger) graphCommand);
                        return;
                    }
                    return;
                }
            }
            GraphCommand graphCommand2 = list.get(i4);
            if (graphCommand2 instanceof GraphCommand.Repeat) {
                GraphCommand.Repeat repeat = (GraphCommand.Repeat) graphCommand2;
                graphLoop = this;
                if (buildAndSubmit$default(graphLoop, true, i.d(repeat.getRequest()), null, 4, null)) {
                    graphLoop.currentRepeatingRequest = repeat.getRequest();
                    list.remove(i4);
                    while (i5 < i4) {
                        if (list.get(i5) instanceof GraphCommand.Repeat) {
                            list.remove(i5);
                            i4--;
                        } else {
                            i5++;
                        }
                    }
                    return;
                }
            } else {
                graphLoop = this;
            }
            i4--;
            this = graphLoop;
        }
    }

    static /* synthetic */ void processRepeat$default(GraphLoop graphLoop, List list, int i2, boolean z, int i3, Object obj) {
        graphLoop.processRepeat(list, i2, z | (!((i3 & 4) == 0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bd, code lost:
    
        if (r15.shutdown$camera_camera2_pipe(r11) == r3) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0119, code lost:
    
        if (r1.shutdown$camera_camera2_pipe(r11) != r3) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ea, code lost:
    
        r11 = r12;
        r12 = r13;
        r13 = r14;
        r14 = r15;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00f7 -> B:35:0x00f8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processRequestProcessor(java.util.List<androidx.camera.camera2.pipe.graph.GraphCommand> r17, int r18, androidx.camera.camera2.pipe.graph.GraphCommand.RequestProcessor r19, h.c.e<? super h.ab> r20) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.graph.GraphLoop.processRequestProcessor(java.util.List, int, androidx.camera.camera2.pipe.graph.GraphCommand$RequestProcessor, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0099, code lost:
    
        if (r13.shutdown$camera_camera2_pipe(r0) != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ca, code lost:
    
        if (r8.shutdown$camera_camera2_pipe(r0) != r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e5, code lost:
    
        if (r3.shutdown$camera_camera2_pipe(r0) != r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e8, code lost:
    
        return r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00d5 -> B:44:0x00ea). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00e5 -> B:44:0x00ea). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00e9 -> B:44:0x00ea). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processShutdown(java.util.List<androidx.camera.camera2.pipe.graph.GraphCommand> r12, h.c.e<? super h.ab> r13) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.graph.GraphLoop.processShutdown(java.util.List, h.c.e):java.lang.Object");
    }

    private final void processStop(List<GraphCommand> list, int i2) {
        GraphRequestProcessor graphRequestProcessor = this.currentRequestProcessor;
        if (graphRequestProcessor != null) {
            graphRequestProcessor.stopRepeating$camera_camera2_pipe();
        }
        this.currentRepeatingRequest = null;
        list.remove(i2);
        int i3 = 0;
        while (i3 < i2) {
            GraphCommand graphCommand = list.get(i3);
            if (x.n(graphCommand, GraphCommand.Stop.INSTANCE) || (graphCommand instanceof GraphCommand.Repeat)) {
                list.remove(i3);
                i2--;
            } else {
                i3++;
            }
        }
    }

    private final void processTrigger(List<GraphCommand> list, int i2, GraphCommand.Trigger trigger) {
        Request request = this.currentRepeatingRequest;
        if (request == null && i2 == 0) {
            list.remove(0);
            return;
        }
        if (getCaptureProcessingEnabled() && request != null && buildAndSubmit(false, i.d(request), trigger.getTriggerParameters())) {
            list.remove(i2);
        } else if (i2 > 0) {
            int i3 = i2 - 1;
            if (!(list.get(i3) instanceof GraphCommand.Repeat)) {
                throw new IllegalStateException("Check failed.");
            }
            processRepeat(list, i3, false);
        }
    }

    private final boolean reissueRepeatingRequest() {
        Boolean boolValueOf;
        GraphRequestProcessor graphRequestProcessor = this.currentRequestProcessor;
        if (graphRequestProcessor == null) {
            return false;
        }
        Request request = this.currentRepeatingRequest;
        if (request != null) {
            boolValueOf = Boolean.valueOf(graphRequestProcessor.submit$camera_camera2_pipe(true, i.d(request), this.defaultParameters, this.currentGraphParameters.getParameters(), this.currentRequiredParameters, getCurrentActiveListeners()));
        } else {
            boolValueOf = null;
        }
        return x.n(boolValueOf, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int selectGraphCommand(java.util.List<androidx.camera.camera2.pipe.graph.GraphCommand> r11) {
        /*
            r10 = this;
            int r0 = r11.size()
            r1 = 1
            r2 = 0
            if (r0 != r1) goto L9
            return r2
        L9:
            r0 = r11
            java.util.Collection r0 = (java.util.Collection) r0
            int r1 = r0.size()
            r3 = -1
            int r1 = r1 + r3
            if (r1 < 0) goto L4b
            r4 = r3
        L15:
            int r5 = r1 + (-1)
            java.lang.Object r6 = r11.get(r1)
            androidx.camera.camera2.pipe.graph.GraphCommand r6 = (androidx.camera.camera2.pipe.graph.GraphCommand) r6
            androidx.camera.camera2.pipe.graph.GraphCommand$Abort r7 = androidx.camera.camera2.pipe.graph.GraphCommand.Abort.INSTANCE
            boolean r7 = h.g.b.x.n(r6, r7)
            if (r7 != 0) goto L4a
            androidx.camera.camera2.pipe.graph.GraphCommand$Invalidate r7 = androidx.camera.camera2.pipe.graph.GraphCommand.Invalidate.INSTANCE
            boolean r7 = h.g.b.x.n(r6, r7)
            if (r7 != 0) goto L4a
            androidx.camera.camera2.pipe.graph.GraphCommand$Stop r7 = androidx.camera.camera2.pipe.graph.GraphCommand.Stop.INSTANCE
            boolean r7 = h.g.b.x.n(r6, r7)
            if (r7 != 0) goto L4a
            androidx.camera.camera2.pipe.graph.GraphCommand$Shutdown r7 = androidx.camera.camera2.pipe.graph.GraphCommand.Shutdown.INSTANCE
            boolean r7 = h.g.b.x.n(r6, r7)
            if (r7 == 0) goto L3e
            goto L4a
        L3e:
            boolean r6 = r6 instanceof androidx.camera.camera2.pipe.graph.GraphCommand.RequestProcessor
            if (r6 == 0) goto L45
            if (r4 >= 0) goto L45
            r4 = r1
        L45:
            if (r5 >= 0) goto L48
            goto L4c
        L48:
            r1 = r5
            goto L15
        L4a:
            return r1
        L4b:
            r4 = r3
        L4c:
            if (r4 < 0) goto L4f
            return r4
        L4f:
            int r1 = r0.size()
            r4 = r2
            r5 = r3
            r6 = r5
        L56:
            if (r4 >= r1) goto L72
            java.lang.Object r7 = r11.get(r4)
            androidx.camera.camera2.pipe.graph.GraphCommand r7 = (androidx.camera.camera2.pipe.graph.GraphCommand) r7
            boolean r8 = r7 instanceof androidx.camera.camera2.pipe.graph.GraphCommand.Parameters
            if (r8 == 0) goto L64
            r5 = r4
            goto L6f
        L64:
            boolean r8 = r7 instanceof androidx.camera.camera2.pipe.graph.GraphCommand.Listeners
            if (r8 == 0) goto L6a
            r6 = r4
            goto L6f
        L6a:
            boolean r7 = r7 instanceof androidx.camera.camera2.pipe.graph.GraphCommand.Repeat
            if (r7 != 0) goto L6f
            goto L72
        L6f:
            int r4 = r4 + 1
            goto L56
        L72:
            if (r5 < 0) goto L75
            return r5
        L75:
            if (r6 < 0) goto L78
            return r6
        L78:
            androidx.camera.camera2.pipe.Request r1 = r10.currentRepeatingRequest
            if (r1 == 0) goto L9c
            boolean r10 = r10.getCaptureProcessingEnabled()
            if (r10 == 0) goto L9c
            int r10 = r0.size()
            r1 = r2
        L87:
            if (r1 >= r10) goto L9c
            java.lang.Object r4 = r11.get(r1)
            androidx.camera.camera2.pipe.graph.GraphCommand r4 = (androidx.camera.camera2.pipe.graph.GraphCommand) r4
            boolean r5 = r4 instanceof androidx.camera.camera2.pipe.graph.GraphCommand.Capture
            if (r5 != 0) goto L9b
            boolean r4 = r4 instanceof androidx.camera.camera2.pipe.graph.GraphCommand.Trigger
            if (r4 == 0) goto L98
            goto L9b
        L98:
            int r1 = r1 + 1
            goto L87
        L9b:
            return r1
        L9c:
            int r10 = r0.size()
            r0 = r3
            r3 = r2
        La2:
            if (r3 >= r10) goto Lb4
            java.lang.Object r1 = r11.get(r3)
            androidx.camera.camera2.pipe.graph.GraphCommand r1 = (androidx.camera.camera2.pipe.graph.GraphCommand) r1
            boolean r1 = r1 instanceof androidx.camera.camera2.pipe.graph.GraphCommand.Repeat
            if (r1 == 0) goto Lb4
            int r0 = r3 + 1
            r9 = r3
            r3 = r0
            r0 = r9
            goto La2
        Lb4:
            if (r0 < 0) goto Lb7
            return r0
        Lb7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.graph.GraphLoop.selectGraphCommand(java.util.List):int");
    }

    public final void abort() {
        this.processingQueue.tryEmit(GraphCommand.Abort.INSTANCE);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this.lock) {
            if (this.closed) {
                return;
            }
            this.closed = true;
            GraphRequestProcessor graphRequestProcessor = this._requestProcessor;
            if (graphRequestProcessor != null) {
                aj.z(this.shutdownScope, null, null, new GraphLoop$close$1$1$1(graphRequestProcessor, null), 3);
            }
            this._requestProcessor = null;
            this.processingQueue.tryEmit(GraphCommand.Shutdown.INSTANCE);
            int size = this.listeners.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.listeners.get(i2).onGraphShutdown();
            }
        }
    }

    public final boolean getCaptureProcessingEnabled() {
        return this._captureProcessingEnabled.c();
    }

    public final Map<?, Object> getGraph3AParameters() {
        Map<?, ? extends Object> map;
        synchronized (this.lock) {
            map = this._graph3AParameters;
        }
        return map;
    }

    public final GraphParameters getGraphParameters() {
        GraphParameters graphParameters;
        synchronized (this.lock) {
            graphParameters = this._graphParameters;
        }
        return graphParameters;
    }

    public final Request getRepeatingRequest() {
        Request request;
        synchronized (this.lock) {
            request = this._repeatingRequest;
        }
        return request;
    }

    public final List<Request.Listener> getRequestListeners() {
        List list;
        synchronized (this.lock) {
            list = this._requestListeners;
        }
        return list;
    }

    public final GraphRequestProcessor getRequestProcessor() {
        GraphRequestProcessor graphRequestProcessor;
        synchronized (this.lock) {
            graphRequestProcessor = this._requestProcessor;
        }
        return graphRequestProcessor;
    }

    public final void invalidate() {
        this.processingQueue.tryEmit(GraphCommand.Invalidate.INSTANCE);
    }

    public final void setCaptureProcessingEnabled(boolean z) {
        this._captureProcessingEnabled.a(z);
        if (z) {
            invalidate();
        }
    }

    public final void setGraph3AParameters(Map<?, ? extends Object> map) {
        x.f(map, "value");
        synchronized (this.lock) {
            this._graph3AParameters = map;
            this.processingQueue.tryEmit(new GraphCommand.Parameters(this._graphParameters, map));
        }
    }

    public final void setGraphParameters(GraphParameters graphParameters) {
        x.f(graphParameters, "value");
        synchronized (this.lock) {
            this._graphParameters = graphParameters;
            this.processingQueue.tryEmit(new GraphCommand.Parameters(graphParameters, this._graph3AParameters));
        }
    }

    public final void setRepeatingRequest(Request request) {
        synchronized (this.lock) {
            Request request2 = this._repeatingRequest;
            this._repeatingRequest = request;
            if (request2 != null || request != null) {
                ProcessingQueue<GraphCommand> processingQueue = this.processingQueue;
                if (request != null) {
                    processingQueue.tryEmit(new GraphCommand.Repeat(request));
                } else {
                    processingQueue.tryEmit(GraphCommand.Stop.INSTANCE);
                }
            }
        }
        if (request == null) {
            int size = this.listeners.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.listeners.get(i2).onStopRepeating();
            }
        }
    }

    public final void setRequestListeners(List<? extends Request.Listener> list) {
        x.f(list, "value");
        synchronized (this.lock) {
            this._requestListeners = list;
            this.processingQueue.tryEmit(new GraphCommand.Listeners(this._requestListeners));
        }
    }

    public final void setRequestProcessor(GraphRequestProcessor graphRequestProcessor) {
        synchronized (this.lock) {
            GraphRequestProcessor graphRequestProcessor2 = this._requestProcessor;
            this._requestProcessor = graphRequestProcessor;
            if (this.closed) {
                this._requestProcessor = null;
                if (graphRequestProcessor != null) {
                    aj.z(this.shutdownScope, null, null, new GraphLoop$requestProcessor$2$1(graphRequestProcessor, null), 3);
                }
                return;
            }
            if (graphRequestProcessor2 != graphRequestProcessor) {
                this.processingQueue.tryEmit(new GraphCommand.RequestProcessor(graphRequestProcessor2, graphRequestProcessor));
            }
            if (graphRequestProcessor == null) {
                int size = this.listeners.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.listeners.get(i2).onGraphStopped();
                }
            }
        }
    }

    public final boolean submit(List<Request> list) {
        x.f(list, "requests");
        if (this.processingQueue.tryEmit(new GraphCommand.Capture(list))) {
            return true;
        }
        abortRequests(list);
        return false;
    }

    public String toString() {
        return "GraphLoop(" + this.cameraGraphId + ")";
    }

    public final boolean trigger(Map<?, ? extends Object> map) {
        x.f(map, "parameters");
        if (getRepeatingRequest() != null) {
            return this.processingQueue.tryEmit(new GraphCommand.Trigger(map));
        }
        throw new IllegalStateException("Cannot submit parameters without an active repeating request!");
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        private final <T> void removeUpTo(List<T> list, int i2, l<? super T, Boolean> lVar) {
            int i3 = 0;
            while (i3 < i2) {
                if (lVar.invoke(list.get(i3)).booleanValue()) {
                    list.remove(i3);
                    i2--;
                } else {
                    i3++;
                }
            }
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public final boolean submit(Request request) {
        x.f(request, "request");
        return submit(i.d(request));
    }
}
