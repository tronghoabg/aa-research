package androidx.camera.camera2.pipe.compat;

import androidx.camera.camera2.pipe.CameraError;
import androidx.camera.camera2.pipe.CameraId;
import androidx.camera.camera2.pipe.CameraPipe;
import androidx.camera.camera2.pipe.GraphState;
import androidx.camera.camera2.pipe.compat.VirtualCamera;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.core.Permissions;
import androidx.camera.camera2.pipe.core.PruningProcessingQueue;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.core.Token;
import androidx.camera.camera2.pipe.graph.GraphListener;
import h.ab;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import h.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.af;
import kotlinx.coroutines.am;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Camera2DeviceManagerImpl implements Camera2DeviceManager {
    private final Set<ActiveCamera> activeCameras;
    private final Camera2DeviceCloser camera2DeviceCloser;
    private final Camera2ErrorProcessor camera2ErrorProcessor;
    private final Camera2SystemState camera2SystemState;
    private final CameraPipe.Flags flags;
    private final List<PendingRequestOpen> pendingRequestOpens;
    private final Permissions permissions;
    private final PruningProcessingQueue<CameraRequest> queue;
    private final RetryingCameraStateOpener retryingCameraStateOpener;
    private final af scope;
    private final Threads threads;

    /* compiled from: WazeSource */
    final class PendingRequestOpen {
        private final ActiveCamera activeCamera;
        private final RequestOpen request;
        private final Token token;

        public PendingRequestOpen(RequestOpen requestOpen, ActiveCamera activeCamera, Token token) {
            x.f(requestOpen, "request");
            x.f(activeCamera, "activeCamera");
            x.f(token, "token");
            this.request = requestOpen;
            this.activeCamera = activeCamera;
            this.token = token;
        }

        public final ActiveCamera getActiveCamera() {
            return this.activeCamera;
        }

        public final RequestOpen getRequest() {
            return this.request;
        }

        public final Token getToken() {
            return this.token;
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.compat.Camera2DeviceManagerImpl$connectPendingRequestOpens$1, reason: invalid class name */
    final class AnonymousClass1 extends h.c.b.a.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(h.c.e<? super AnonymousClass1> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Camera2DeviceManagerImpl.this.connectPendingRequestOpens(null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.compat.Camera2DeviceManagerImpl$processRequestClose$1, reason: invalid class name and case insensitive filesystem */
    final class C01581 extends h.c.b.a.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C01581(h.c.e<? super C01581> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Camera2DeviceManagerImpl.this.processRequestClose(null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.compat.Camera2DeviceManagerImpl$processRequestCloseAll$1, reason: invalid class name and case insensitive filesystem */
    final class C01591 extends h.c.b.a.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C01591(h.c.e<? super C01591> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Camera2DeviceManagerImpl.this.processRequestCloseAll(null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.compat.Camera2DeviceManagerImpl$processRequestCloseById$1, reason: invalid class name and case insensitive filesystem */
    final class C01601 extends h.c.b.a.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C01601(h.c.e<? super C01601> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Camera2DeviceManagerImpl.this.processRequestCloseById(null, this);
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.compat.Camera2DeviceManagerImpl$processRequestOpen$1, reason: invalid class name and case insensitive filesystem */
    final class C01611 extends h.c.b.a.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        C01611(h.c.e<? super C01611> eVar) {
            super(eVar);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Camera2DeviceManagerImpl.this.processRequestOpen(null, null, this);
        }
    }

    public Camera2DeviceManagerImpl(Permissions permissions, RetryingCameraStateOpener retryingCameraStateOpener, Camera2DeviceCloser camera2DeviceCloser, Camera2ErrorProcessor camera2ErrorProcessor, Camera2SystemState camera2SystemState, CameraPipe.Flags flags, Threads threads) throws Throwable {
        x.f(permissions, "permissions");
        x.f(retryingCameraStateOpener, "retryingCameraStateOpener");
        x.f(camera2DeviceCloser, "camera2DeviceCloser");
        x.f(camera2ErrorProcessor, "camera2ErrorProcessor");
        x.f(camera2SystemState, "camera2SystemState");
        x.f(flags, "flags");
        x.f(threads, "threads");
        this.permissions = permissions;
        this.retryingCameraStateOpener = retryingCameraStateOpener;
        this.camera2DeviceCloser = camera2DeviceCloser;
        this.camera2ErrorProcessor = camera2ErrorProcessor;
        this.camera2SystemState = camera2SystemState;
        this.flags = flags;
        this.threads = threads;
        af cameraPipeScope = threads.getCameraPipeScope();
        this.scope = cameraPipeScope;
        PruningProcessingQueue.Companion companion = PruningProcessingQueue.Companion;
        PruningProcessingQueue<CameraRequest> pruningProcessingQueue = new PruningProcessingQueue<>(0, new Camera2DeviceManagerImpl$queue$1(this), null, new Camera2DeviceManagerImpl$queue$2(this), 5, null);
        companion.processIn(pruningProcessingQueue, cameraPipeScope);
        this.queue = pruningProcessingQueue;
        this.activeCameras = new LinkedHashSet();
        this.pendingRequestOpens = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fb, code lost:
    
        throw new java.lang.IllegalStateException("Check failed.");
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0112 -> B:45:0x0114). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object connectPendingRequestOpens(java.util.Set<androidx.camera.camera2.pipe.CameraId> r9, h.c.e<? super h.ab> r10) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.Camera2DeviceManagerImpl.connectPendingRequestOpens(java.util.Set, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object disconnectPendingRequestOpens(List<PendingRequestOpen> list, h.c.e<? super ab> eVar) {
        for (PendingRequestOpen pendingRequestOpen : list) {
            pendingRequestOpen.getToken().release();
            this.pendingRequestOpens.remove(pendingRequestOpen);
        }
        return ab.f48028a;
    }

    private final <T> Integer firstFromIndexOrNull(List<? extends T> list, int i2, l<? super T, Boolean> lVar) {
        int size = list.size();
        while (i2 < size) {
            if (lVar.invoke(list.get(i2)).booleanValue()) {
                return Integer.valueOf(i2);
            }
            i2++;
        }
        return null;
    }

    private final void onRemoved(CameraRequest cameraRequest) {
        if (cameraRequest instanceof RequestOpen) {
            VirtualCamera.CC.m1106disconnectTPqeGZw$default(((RequestOpen) cameraRequest).getVirtualCamera(), null, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: openCameraWithRetry-Q2LEGo4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1028openCameraWithRetryQ2LEGo4(java.lang.String r8, java.util.List<androidx.camera.camera2.pipe.CameraId> r9, h.g.a.l<? super h.ab, java.lang.Boolean> r10, kotlinx.coroutines.am<h.ab> r11, kotlinx.coroutines.af r12, h.c.e<? super androidx.camera.camera2.pipe.compat.Camera2DeviceManagerImpl.OpenVirtualCameraResult> r13) {
        /*
            r7 = this;
            boolean r0 = r13 instanceof androidx.camera.camera2.pipe.compat.Camera2DeviceManagerImpl$openCameraWithRetry$1
            if (r0 == 0) goto L13
            r0 = r13
            androidx.camera.camera2.pipe.compat.Camera2DeviceManagerImpl$openCameraWithRetry$1 r0 = (androidx.camera.camera2.pipe.compat.Camera2DeviceManagerImpl$openCameraWithRetry$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.pipe.compat.Camera2DeviceManagerImpl$openCameraWithRetry$1 r0 = new androidx.camera.camera2.pipe.compat.Camera2DeviceManagerImpl$openCameraWithRetry$1
            r0.<init>(r7, r13)
        L18:
            r6 = r0
            java.lang.Object r13 = r6.result
            h.c.a.a r0 = h.c.a.a.f48038a
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L3e
            if (r1 != r2) goto L36
            java.lang.Object r8 = r6.L$2
            r12 = r8
            kotlinx.coroutines.af r12 = (kotlinx.coroutines.af) r12
            java.lang.Object r8 = r6.L$1
            r9 = r8
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r8 = r6.L$0
            java.lang.String r8 = (java.lang.String) r8
            e.b.c.b(r13)
            goto L72
        L36:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3e:
            e.b.c.b(r13)
            androidx.camera.camera2.pipe.core.Log r13 = androidx.camera.camera2.pipe.core.Log.INSTANCE
            boolean r13 = r13.getDEBUG_LOGGABLE()
            if (r13 == 0) goto L56
            java.lang.String r13 = "Opening "
            java.lang.String r1 = " with retries..."
            java.lang.String r13 = androidx.camera.camera2.pipe.compat.d.a(r8, r13, r1)
            java.lang.String r1 = "CXCP"
            android.util.Log.d(r1, r13)
        L56:
            androidx.camera.camera2.pipe.compat.Camera2SystemState r13 = r7.camera2SystemState
            r13.m1055onCameraOpeningEfqyGwQ(r8)
            androidx.camera.camera2.pipe.compat.RetryingCameraStateOpener r1 = r7.retryingCameraStateOpener
            androidx.camera.camera2.pipe.compat.Camera2DeviceCloser r3 = r7.camera2DeviceCloser
            r6.L$0 = r8
            r6.L$1 = r9
            r6.L$2 = r12
            r6.label = r2
            r2 = r8
            r4 = r10
            r5 = r11
            java.lang.Object r13 = r1.mo1092openCameraWithRetryzDSwpeU(r2, r3, r4, r5, r6)
            if (r13 != r0) goto L71
            return r0
        L71:
            r8 = r2
        L72:
            androidx.camera.camera2.pipe.compat.OpenCameraResult r13 = (androidx.camera.camera2.pipe.compat.OpenCameraResult) r13
            androidx.camera.camera2.pipe.compat.AndroidCameraState r10 = r13.getCameraState()
            if (r10 != 0) goto L8a
            androidx.camera.camera2.pipe.compat.Camera2SystemState r7 = r7.camera2SystemState
            r7.m1054onCameraClosedEfqyGwQ(r8)
            androidx.camera.camera2.pipe.compat.Camera2DeviceManagerImpl$OpenVirtualCameraResult$Error r7 = new androidx.camera.camera2.pipe.compat.Camera2DeviceManagerImpl$OpenVirtualCameraResult$Error
            androidx.camera.camera2.pipe.CameraError r8 = r13.m1089getErrorCodemVEW8x0()
            r9 = 0
            r7.<init>(r8, r9)
            return r7
        L8a:
            androidx.camera.camera2.pipe.compat.Camera2DeviceManagerImpl$OpenVirtualCameraResult$Success r10 = new androidx.camera.camera2.pipe.compat.Camera2DeviceManagerImpl$OpenVirtualCameraResult$Success
            androidx.camera.camera2.pipe.compat.ActiveCamera r11 = new androidx.camera.camera2.pipe.compat.ActiveCamera
            androidx.camera.camera2.pipe.compat.AndroidCameraState r13 = r13.getCameraState()
            java.util.Collection r9 = (java.util.Collection) r9
            androidx.camera.camera2.pipe.CameraId r8 = androidx.camera.camera2.pipe.CameraId.m546boximpl(r8)
            java.util.List r8 = h.a.i.ag(r9, r8)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Set r8 = h.a.i.au(r8)
            androidx.camera.camera2.pipe.compat.Camera2DeviceManagerImpl$$ExternalSyntheticLambda3 r9 = new androidx.camera.camera2.pipe.compat.Camera2DeviceManagerImpl$$ExternalSyntheticLambda3
            r9.<init>()
            r11.<init>(r13, r8, r12, r9)
            r10.<init>(r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.Camera2DeviceManagerImpl.m1028openCameraWithRetryQ2LEGo4(java.lang.String, java.util.List, h.g.a.l, kotlinx.coroutines.am, kotlinx.coroutines.af, h.c.e):java.lang.Object");
    }

    static final ab openCameraWithRetry_Q2LEGo4$lambda$1(Camera2DeviceManagerImpl camera2DeviceManagerImpl, ActiveCamera activeCamera) {
        x.f(activeCamera, "activeCamera");
        camera2DeviceManagerImpl.queue.tryEmit(new RequestClose(activeCamera));
        return ab.f48028a;
    }

    static final boolean prewarm_EfqyGwQ$lambda$0(ab abVar) {
        x.f(abVar, "<unused var>");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object process(CameraRequest cameraRequest, am<ab> amVar, h.c.e<? super ab> eVar) {
        if (cameraRequest instanceof RequestOpen) {
            Object objProcessRequestOpen = processRequestOpen((RequestOpen) cameraRequest, amVar, eVar);
            if (objProcessRequestOpen == h.c.a.a.f48038a) {
                return objProcessRequestOpen;
            }
        } else if (cameraRequest instanceof RequestClose) {
            Object objProcessRequestClose = processRequestClose((RequestClose) cameraRequest, eVar);
            if (objProcessRequestClose == h.c.a.a.f48038a) {
                return objProcessRequestClose;
            }
        } else if (cameraRequest instanceof RequestCloseById) {
            Object objProcessRequestCloseById = processRequestCloseById((RequestCloseById) cameraRequest, eVar);
            if (objProcessRequestCloseById == h.c.a.a.f48038a) {
                return objProcessRequestCloseById;
            }
        } else {
            if (!(cameraRequest instanceof RequestCloseAll)) {
                throw new i();
            }
            Object objProcessRequestCloseAll = processRequestCloseAll((RequestCloseAll) cameraRequest, eVar);
            if (objProcessRequestCloseAll == h.c.a.a.f48038a) {
                return objProcessRequestCloseAll;
            }
        }
        return ab.f48028a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bf, code lost:
    
        if (r8.awaitClosed(r0) == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processRequestClose(androidx.camera.camera2.pipe.compat.RequestClose r9, h.c.e<? super h.ab> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof androidx.camera.camera2.pipe.compat.Camera2DeviceManagerImpl.C01581
            if (r0 == 0) goto L13
            r0 = r10
            androidx.camera.camera2.pipe.compat.Camera2DeviceManagerImpl$processRequestClose$1 r0 = (androidx.camera.camera2.pipe.compat.Camera2DeviceManagerImpl.C01581) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.pipe.compat.Camera2DeviceManagerImpl$processRequestClose$1 r0 = new androidx.camera.camera2.pipe.compat.Camera2DeviceManagerImpl$processRequestClose$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            e.b.c.b(r10)
            goto Lc2
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            java.lang.Object r8 = r0.L$0
            r9 = r8
            androidx.camera.camera2.pipe.compat.RequestClose r9 = (androidx.camera.camera2.pipe.compat.RequestClose) r9
            e.b.c.b(r10)
            goto Lab
        L3c:
            e.b.c.b(r10)
            androidx.camera.camera2.pipe.compat.ActiveCamera r10 = r9.getActiveCamera()
            java.lang.String r10 = r10.m981getCameraIdDz_R5H8()
            androidx.camera.camera2.pipe.core.Log r2 = androidx.camera.camera2.pipe.core.Log.INSTANCE
            boolean r2 = r2.getDEBUG_LOGGABLE()
            if (r2 == 0) goto L5c
            java.lang.String r2 = "Camera2DeviceManagerImpl#processRequestClose("
            java.lang.String r5 = ")"
            java.lang.String r10 = androidx.camera.camera2.pipe.compat.d.a(r10, r2, r5)
            java.lang.String r2 = "CXCP"
            android.util.Log.d(r2, r10)
        L5c:
            java.util.Set<androidx.camera.camera2.pipe.compat.ActiveCamera> r10 = r8.activeCameras
            androidx.camera.camera2.pipe.compat.ActiveCamera r2 = r9.getActiveCamera()
            boolean r10 = r10.contains(r2)
            if (r10 == 0) goto L71
            java.util.Set<androidx.camera.camera2.pipe.compat.ActiveCamera> r10 = r8.activeCameras
            androidx.camera.camera2.pipe.compat.ActiveCamera r2 = r9.getActiveCamera()
            r10.remove(r2)
        L71:
            java.util.List<androidx.camera.camera2.pipe.compat.Camera2DeviceManagerImpl$PendingRequestOpen> r10 = r8.pendingRequestOpens
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Iterator r10 = r10.iterator()
        L80:
            boolean r5 = r10.hasNext()
            if (r5 == 0) goto L9f
            java.lang.Object r5 = r10.next()
            r6 = r5
            androidx.camera.camera2.pipe.compat.Camera2DeviceManagerImpl$PendingRequestOpen r6 = (androidx.camera.camera2.pipe.compat.Camera2DeviceManagerImpl.PendingRequestOpen) r6
            androidx.camera.camera2.pipe.compat.ActiveCamera r6 = r6.getActiveCamera()
            androidx.camera.camera2.pipe.compat.ActiveCamera r7 = r9.getActiveCamera()
            boolean r6 = h.g.b.x.n(r6, r7)
            if (r6 == 0) goto L80
            r2.add(r5)
            goto L80
        L9f:
            java.util.List r2 = (java.util.List) r2
            r0.L$0 = r9
            r0.label = r4
            java.lang.Object r8 = r8.disconnectPendingRequestOpens(r2, r0)
            if (r8 == r1) goto Lc5
        Lab:
            androidx.camera.camera2.pipe.compat.ActiveCamera r8 = r9.getActiveCamera()
            r8.close()
            androidx.camera.camera2.pipe.compat.ActiveCamera r8 = r9.getActiveCamera()
            r9 = 0
            r0.L$0 = r9
            r0.label = r3
            java.lang.Object r8 = r8.awaitClosed(r0)
            if (r8 != r1) goto Lc2
            goto Lc5
        Lc2:
            h.ab r8 = h.ab.f48028a
            return r8
        Lc5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.Camera2DeviceManagerImpl.processRequestClose(androidx.camera.camera2.pipe.compat.RequestClose, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (disconnectPendingRequestOpens(r7, r0) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processRequestCloseAll(androidx.camera.camera2.pipe.compat.RequestCloseAll r6, h.c.e<? super h.ab> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.camera.camera2.pipe.compat.Camera2DeviceManagerImpl.C01591
            if (r0 == 0) goto L13
            r0 = r7
            androidx.camera.camera2.pipe.compat.Camera2DeviceManagerImpl$processRequestCloseAll$1 r0 = (androidx.camera.camera2.pipe.compat.Camera2DeviceManagerImpl.C01591) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.camera.camera2.pipe.compat.Camera2DeviceManagerImpl$processRequestCloseAll$1 r0 = new androidx.camera.camera2.pipe.compat.Camera2DeviceManagerImpl$processRequestCloseAll$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            h.c.a.a r1 = h.c.a.a.f48038a
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r6 = r0.L$1
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r2 = r0.L$0
            androidx.camera.camera2.pipe.compat.RequestCloseAll r2 = (androidx.camera.camera2.pipe.compat.RequestCloseAll) r2
            e.b.c.b(r7)
            goto L7f
        L32:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3a:
            java.lang.Object r6 = r0.L$0
            androidx.camera.camera2.pipe.compat.RequestCloseAll r6 = (androidx.camera.camera2.pipe.compat.RequestCloseAll) r6
            e.b.c.b(r7)
            goto L61
        L42:
            e.b.c.b(r7)
            androidx.camera.camera2.pipe.core.Log r7 = androidx.camera.camera2.pipe.core.Log.INSTANCE
            boolean r7 = r7.getDEBUG_LOGGABLE()
            if (r7 == 0) goto L54
            java.lang.String r7 = "CXCP"
            java.lang.String r2 = "Camera2DeviceManagerImpl#processRequestCloseAll()"
            android.util.Log.d(r7, r2)
        L54:
            java.util.List<androidx.camera.camera2.pipe.compat.Camera2DeviceManagerImpl$PendingRequestOpen> r7 = r5.pendingRequestOpens
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r7 = r5.disconnectPendingRequestOpens(r7, r0)
            if (r7 != r1) goto L61
            goto L97
        L61:
            java.util.Set<androidx.camera.camera2.pipe.compat.ActiveCamera> r7 = r5.activeCameras
            java.util.Iterator r7 = r7.iterator()
        L67:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L77
            java.lang.Object r2 = r7.next()
            androidx.camera.camera2.pipe.compat.ActiveCamera r2 = (androidx.camera.camera2.pipe.compat.ActiveCamera) r2
            r2.close()
            goto L67
        L77:
            java.util.Set<androidx.camera.camera2.pipe.compat.ActiveCamera> r7 = r5.activeCameras
            java.util.Iterator r7 = r7.iterator()
            r2 = r6
            r6 = r7
        L7f:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L98
            java.lang.Object r7 = r6.next()
            androidx.camera.camera2.pipe.compat.ActiveCamera r7 = (androidx.camera.camera2.pipe.compat.ActiveCamera) r7
            r0.L$0 = r2
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r7 = r7.awaitClosed(r0)
            if (r7 != r1) goto L7f
        L97:
            return r1
        L98:
            java.util.Set<androidx.camera.camera2.pipe.compat.ActiveCamera> r5 = r5.activeCameras
            r5.clear()
            kotlinx.coroutines.CompletableDeferred r5 = r2.getDeferred()
            h.ab r6 = h.ab.f48028a
            r5.a(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.Camera2DeviceManagerImpl.processRequestCloseAll(androidx.camera.camera2.pipe.compat.RequestCloseAll, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ee, code lost:
    
        if (r4.awaitClosed(r0) == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processRequestCloseById(androidx.camera.camera2.pipe.compat.RequestCloseById r9, h.c.e<? super h.ab> r10) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.Camera2DeviceManagerImpl.processRequestCloseById(androidx.camera.camera2.pipe.compat.RequestCloseById, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02d5, code lost:
    
        if (connectPendingRequestOpens(r11, r0) != r1) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02f3, code lost:
    
        if (r12.connectTo(r10, r13, r0) == r1) goto L123;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0170 A[LOOP:3: B:50:0x016a->B:52:0x0170, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x022b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processRequestOpen(androidx.camera.camera2.pipe.compat.RequestOpen r11, kotlinx.coroutines.am<h.ab> r12, h.c.e<? super h.ab> r13) {
        /*
            Method dump skipped, instructions count: 790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.Camera2DeviceManagerImpl.processRequestOpen(androidx.camera.camera2.pipe.compat.RequestOpen, kotlinx.coroutines.am, h.c.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ab prune$lambda$2$0(CompletableDeferred completableDeferred, Throwable th) {
        ab abVar = ab.f48028a;
        completableDeferred.a(abVar);
        return abVar;
    }

    static final ab prune$lambda$6(CameraRequest cameraRequest, Throwable th) {
        CompletableDeferred<ab> deferred = ((RequestCloseById) cameraRequest).getDeferred();
        ab abVar = ab.f48028a;
        deferred.a(abVar);
        return abVar;
    }

    private final <T> List<T> removeIndices(List<T> list, Set<Integer> set) {
        ArrayList arrayList = new ArrayList();
        Iterator it = h.a.i.ak(set).iterator();
        while (it.hasNext()) {
            arrayList.add(list.remove(((Number) it.next()).intValue() - arrayList.size()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
    
        r10 = r9.acquire();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0088, code lost:
    
        if (r10 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008a, code lost:
    
        r1 = r9;
        r3 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008d, code lost:
    
        r9.close();
        r13.L$0 = r8;
        r13.L$1 = r0;
        r13.L$2 = r11;
        r13.L$3 = r7;
        r13.L$4 = r9;
        r13.label = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a0, code lost:
    
        if (r9.awaitClosed(r13) != r2) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a4, code lost:
    
        r10 = r8;
        r8 = r7;
        r7 = r3;
        r3 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b1, code lost:
    
        if (r1 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b3, code lost:
    
        r9 = r0.getSharedCameraIds();
        r10 = r0.isForegroundObserver();
        r12 = r14.scope;
        r13.L$0 = r8;
        r13.L$1 = r0;
        r13.L$2 = null;
        r13.L$3 = null;
        r13.L$4 = null;
        r13.label = 2;
        r1 = m1028openCameraWithRetryQ2LEGo4(r8, r9, r10, r11, r12, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ce, code lost:
    
        if (r1 == r2) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d0, code lost:
    
        r2 = r0;
        r0 = r1;
        r1 = r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b1 A[EDGE_INSN: B:62:0x00b1->B:29:0x00b1 BREAK  A[LOOP:0: B:17:0x006e->B:65:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00a4 -> B:28:0x00a8). Please report as a decompilation issue!!! */
    /* renamed from: retrieveActiveCamera-aeCOTgg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1029retrieveActiveCameraaeCOTgg(java.lang.String r15, androidx.camera.camera2.pipe.compat.RequestOpen r16, kotlinx.coroutines.am<h.ab> r17, h.c.e<? super androidx.camera.camera2.pipe.compat.Camera2DeviceManagerImpl.RetrieveActiveCameraResult> r18) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.Camera2DeviceManagerImpl.m1029retrieveActiveCameraaeCOTgg(java.lang.String, androidx.camera.camera2.pipe.compat.RequestOpen, kotlinx.coroutines.am, h.c.e):java.lang.Object");
    }

    @Override // androidx.camera.camera2.pipe.compat.Camera2DeviceManager
    /* renamed from: close-EfqyGwQ */
    public am<ab> mo1023closeEfqyGwQ(String str) {
        x.f(str, "cameraId");
        RequestCloseById requestCloseById = new RequestCloseById(str, null);
        if (!this.queue.tryEmit(requestCloseById)) {
            if (Log.INSTANCE.getERROR_LOGGABLE()) {
                android.util.Log.e(Log.TAG, d.a(str, "Camera close by ID request failed for ", "!"));
            }
            requestCloseById.getDeferred().a(ab.f48028a);
        }
        return requestCloseById.getDeferred();
    }

    @Override // androidx.camera.camera2.pipe.compat.Camera2DeviceManager
    public am<ab> closeAll(boolean z) {
        if (z) {
            this.retryingCameraStateOpener.cancelOpen();
        }
        RequestCloseAll requestCloseAll = new RequestCloseAll();
        if (!this.queue.tryEmit(requestCloseAll)) {
            if (Log.INSTANCE.getERROR_LOGGABLE()) {
                android.util.Log.e(Log.TAG, "Camera close all request failed!");
            }
            requestCloseAll.getDeferred().a(ab.f48028a);
        }
        return requestCloseAll.getDeferred();
    }

    public final CameraPipe.Flags getFlags() {
        return this.flags;
    }

    public final Threads getThreads() {
        return this.threads;
    }

    @Override // androidx.camera.camera2.pipe.compat.Camera2DeviceManager
    /* renamed from: open-zDSwpeU */
    public VirtualCamera mo1024openzDSwpeU(String str, List<CameraId> list, GraphListener graphListener, boolean z, l<? super ab, Boolean> lVar) {
        x.f(str, "cameraId");
        x.f(list, "sharedCameraIds");
        x.f(graphListener, "graphListener");
        x.f(lVar, "isForegroundObserver");
        VirtualCameraState virtualCameraState = new VirtualCameraState(str, graphListener, this.scope, null);
        if (this.queue.tryEmit(new RequestOpen(virtualCameraState, list, graphListener, z, lVar))) {
            return virtualCameraState;
        }
        if (Log.INSTANCE.getERROR_LOGGABLE()) {
            android.util.Log.e(Log.TAG, d.a(str, "Camera open request failed for ", "!"));
        }
        graphListener.onGraphError(new GraphState.GraphStateError(CameraError.Companion.m487getERROR_CAMERA_OPENERv7Vf74A(), false, null));
        return null;
    }

    @Override // androidx.camera.camera2.pipe.compat.Camera2DeviceManager
    /* renamed from: prewarm-EfqyGwQ */
    public void mo1025prewarmEfqyGwQ(String str) {
        x.f(str, "cameraId");
        mo1024openzDSwpeU(str, h.a.i.h(), NoOpGraphListener.INSTANCE, true, new l() { // from class: androidx.camera.camera2.pipe.compat.Camera2DeviceManagerImpl$$ExternalSyntheticLambda2
            @Override // h.g.a.l
            public final Object invoke(Object obj) {
                Camera2DeviceManagerImpl.prewarm_EfqyGwQ$lambda$0((ab) obj);
                return false;
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x026e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean prune$camera_camera2_pipe(java.util.List<androidx.camera.camera2.pipe.compat.CameraRequest> r21, androidx.camera.camera2.pipe.compat.CameraRequest r22) {
        /*
            Method dump skipped, instructions count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.Camera2DeviceManagerImpl.prune$camera_camera2_pipe(java.util.List, androidx.camera.camera2.pipe.compat.CameraRequest):boolean");
    }

    /* compiled from: WazeSource */
    interface OpenVirtualCameraResult {

        /* compiled from: WazeSource */
        public final class Success implements OpenVirtualCameraResult {
            private final ActiveCamera activeCamera;

            public Success(ActiveCamera activeCamera) {
                x.f(activeCamera, "activeCamera");
                this.activeCamera = activeCamera;
            }

            public static /* synthetic */ Success copy$default(Success success, ActiveCamera activeCamera, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    activeCamera = success.activeCamera;
                }
                return success.copy(activeCamera);
            }

            public final ActiveCamera component1() {
                return this.activeCamera;
            }

            public final Success copy(ActiveCamera activeCamera) {
                x.f(activeCamera, "activeCamera");
                return new Success(activeCamera);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Success) && x.n(this.activeCamera, ((Success) obj).activeCamera);
            }

            public final ActiveCamera getActiveCamera() {
                return this.activeCamera;
            }

            public int hashCode() {
                return this.activeCamera.hashCode();
            }

            public String toString() {
                return "Success(activeCamera=" + this.activeCamera + ")";
            }
        }

        /* compiled from: WazeSource */
        public final class Error implements OpenVirtualCameraResult {
            private final CameraError lastCameraError;

            private Error(CameraError cameraError) {
                this.lastCameraError = cameraError;
            }

            /* renamed from: copy-TPqeGZw$default, reason: not valid java name */
            public static /* synthetic */ Error m1030copyTPqeGZw$default(Error error, CameraError cameraError, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    cameraError = error.lastCameraError;
                }
                return error.m1032copyTPqeGZw(cameraError);
            }

            /* renamed from: component1-mVEW8x0, reason: not valid java name */
            public final CameraError m1031component1mVEW8x0() {
                return this.lastCameraError;
            }

            /* renamed from: copy-TPqeGZw, reason: not valid java name */
            public final Error m1032copyTPqeGZw(CameraError cameraError) {
                return new Error(cameraError, null);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && x.n(this.lastCameraError, ((Error) obj).lastCameraError);
            }

            /* renamed from: getLastCameraError-mVEW8x0, reason: not valid java name */
            public final CameraError m1033getLastCameraErrormVEW8x0() {
                return this.lastCameraError;
            }

            public int hashCode() {
                CameraError cameraError = this.lastCameraError;
                if (cameraError == null) {
                    return 0;
                }
                return cameraError.m478unboximpl();
            }

            public String toString() {
                return "Error(lastCameraError=" + this.lastCameraError + ")";
            }

            public /* synthetic */ Error(CameraError cameraError, o oVar) {
                this(cameraError);
            }
        }
    }

    /* compiled from: WazeSource */
    interface RetrieveActiveCameraResult {

        /* compiled from: WazeSource */
        public final class Success implements RetrieveActiveCameraResult {
            private final ActiveCamera activeCamera;
            private final Token token;

            public Success(ActiveCamera activeCamera, Token token) {
                x.f(activeCamera, "activeCamera");
                x.f(token, "token");
                this.activeCamera = activeCamera;
                this.token = token;
            }

            public static /* synthetic */ Success copy$default(Success success, ActiveCamera activeCamera, Token token, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    activeCamera = success.activeCamera;
                }
                if ((i2 & 2) != 0) {
                    token = success.token;
                }
                return success.copy(activeCamera, token);
            }

            public final ActiveCamera component1() {
                return this.activeCamera;
            }

            public final Token component2() {
                return this.token;
            }

            public final Success copy(ActiveCamera activeCamera, Token token) {
                x.f(activeCamera, "activeCamera");
                x.f(token, "token");
                return new Success(activeCamera, token);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Success)) {
                    return false;
                }
                Success success = (Success) obj;
                return x.n(this.activeCamera, success.activeCamera) && x.n(this.token, success.token);
            }

            public final ActiveCamera getActiveCamera() {
                return this.activeCamera;
            }

            public final Token getToken() {
                return this.token;
            }

            public int hashCode() {
                return (this.activeCamera.hashCode() * 31) + this.token.hashCode();
            }

            public String toString() {
                return "Success(activeCamera=" + this.activeCamera + ", token=" + this.token + ")";
            }
        }

        /* compiled from: WazeSource */
        public final class Error implements RetrieveActiveCameraResult {
            private final CameraError lastCameraError;

            private Error(CameraError cameraError) {
                this.lastCameraError = cameraError;
            }

            /* renamed from: copy-TPqeGZw$default, reason: not valid java name */
            public static /* synthetic */ Error m1034copyTPqeGZw$default(Error error, CameraError cameraError, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    cameraError = error.lastCameraError;
                }
                return error.m1036copyTPqeGZw(cameraError);
            }

            /* renamed from: component1-mVEW8x0, reason: not valid java name */
            public final CameraError m1035component1mVEW8x0() {
                return this.lastCameraError;
            }

            /* renamed from: copy-TPqeGZw, reason: not valid java name */
            public final Error m1036copyTPqeGZw(CameraError cameraError) {
                return new Error(cameraError, null);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && x.n(this.lastCameraError, ((Error) obj).lastCameraError);
            }

            /* renamed from: getLastCameraError-mVEW8x0, reason: not valid java name */
            public final CameraError m1037getLastCameraErrormVEW8x0() {
                return this.lastCameraError;
            }

            public int hashCode() {
                CameraError cameraError = this.lastCameraError;
                if (cameraError == null) {
                    return 0;
                }
                return cameraError.m478unboximpl();
            }

            public String toString() {
                return "Error(lastCameraError=" + this.lastCameraError + ")";
            }

            public /* synthetic */ Error(CameraError cameraError, o oVar) {
                this(cameraError);
            }
        }
    }
}
