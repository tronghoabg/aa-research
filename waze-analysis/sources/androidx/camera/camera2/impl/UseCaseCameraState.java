package androidx.camera.camera2.impl;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.compat.workaround.TemplateParamsOverride;
import androidx.camera.camera2.config.UseCaseCameraContext;
import androidx.camera.camera2.config.UseCaseCameraScope;
import androidx.camera.camera2.pipe.AeMode;
import androidx.camera.camera2.pipe.AfMode;
import androidx.camera.camera2.pipe.AwbMode;
import androidx.camera.camera2.pipe.CameraControls3A;
import androidx.camera.camera2.pipe.CameraGraph;
import androidx.camera.camera2.pipe.FrameInfo;
import androidx.camera.camera2.pipe.FrameMetadata;
import androidx.camera.camera2.pipe.Metadata;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestFailure;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.camera2.pipe.RequestTemplate;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.core.Logger;
import h.a.i;
import h.a.u;
import h.ab;
import h.c.a.a;
import h.c.b.a.c;
import h.c.e;
import h.g.b.x;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlinx.a.b;
import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
@UseCaseCameraScope
/* loaded from: classes2.dex */
public final class UseCaseCameraState {
    private final Map<Metadata.Key<?>, Object> currentInternalParameters;
    private final Set<Request.Listener> currentListeners;
    private final Map<CaptureRequest.Key<?>, Object> currentParameters;
    private final Set<StreamId> currentStreams;
    private RequestTemplate currentTemplate;
    private AeMode lastAeMode;
    private AfMode lastAfMode;
    private AwbMode lastAwbMode;
    private final Object lock;
    private final b pendingSignalCount;
    private final RequestListener requestListener;
    private final b submittedRequestCounter;
    private final TemplateParamsOverride templateParamsOverride;
    private CompletableDeferred<ab> updateSignal;
    private u<RequestSignal> updateSignals;
    private boolean updating;
    private final UseCaseCameraContext useCaseCameraContext;

    /* compiled from: WazeSource */
    public final class RequestSignal {
        private final int requestNo;
        private final CompletableDeferred<ab> signal;

        public RequestSignal(int i2, CompletableDeferred<ab> completableDeferred) {
            x.f(completableDeferred, "signal");
            this.requestNo = i2;
            this.signal = completableDeferred;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RequestSignal copy$default(RequestSignal requestSignal, int i2, CompletableDeferred completableDeferred, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i2 = requestSignal.requestNo;
            }
            if ((i3 & 2) != 0) {
                completableDeferred = requestSignal.signal;
            }
            return requestSignal.copy(i2, completableDeferred);
        }

        public final int component1() {
            return this.requestNo;
        }

        public final CompletableDeferred<ab> component2() {
            return this.signal;
        }

        public final RequestSignal copy(int i2, CompletableDeferred<ab> completableDeferred) {
            x.f(completableDeferred, "signal");
            return new RequestSignal(i2, completableDeferred);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RequestSignal)) {
                return false;
            }
            RequestSignal requestSignal = (RequestSignal) obj;
            return this.requestNo == requestSignal.requestNo && x.n(this.signal, requestSignal.signal);
        }

        public final int getRequestNo() {
            return this.requestNo;
        }

        public final CompletableDeferred<ab> getSignal() {
            return this.signal;
        }

        public int hashCode() {
            return (this.requestNo * 31) + this.signal.hashCode();
        }

        public String toString() {
            return "RequestSignal(requestNo=" + this.requestNo + ", signal=" + this.signal + ")";
        }
    }

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.impl.UseCaseCameraState$submitLatest$1, reason: invalid class name */
    final class AnonymousClass1 extends c {
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
            return UseCaseCameraState.this.submitLatest(this);
        }
    }

    public UseCaseCameraState(UseCaseCameraContext useCaseCameraContext, TemplateParamsOverride templateParamsOverride) {
        x.f(useCaseCameraContext, "useCaseCameraContext");
        x.f(templateParamsOverride, "templateParamsOverride");
        this.useCaseCameraContext = useCaseCameraContext;
        this.templateParamsOverride = templateParamsOverride;
        this.lock = new Object();
        this.submittedRequestCounter = h.e.b.f(0);
        this.updateSignals = new u<>();
        this.currentParameters = new LinkedHashMap();
        this.currentInternalParameters = new LinkedHashMap();
        this.currentStreams = new LinkedHashSet();
        this.currentListeners = new LinkedHashSet();
        this.requestListener = new RequestListener();
        this.pendingSignalCount = h.e.b.f(0);
    }

    private final Integer getIntOrNull(Map<CaptureRequest.Key<?>, ? extends Object> map, CaptureRequest.Key<?> key) {
        Object obj = map != null ? map.get(key) : null;
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object submitLatest(h.c.e<? super h.ab> r20) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.UseCaseCameraState.submitLatest(h.c.e):java.lang.Object");
    }

    private final void update3A(CameraGraph.Session session, Map<CaptureRequest.Key<?>, ? extends Object> map) {
        CaptureRequest.Key<?> key = CaptureRequest.CONTROL_AE_MODE;
        x.e(key, "CONTROL_AE_MODE");
        Integer intOrNull = getIntOrNull(map, key);
        AeMode aeModeM305fromIntOrNullkQd0u18 = intOrNull != null ? AeMode.Companion.m305fromIntOrNullkQd0u18(intOrNull.intValue()) : null;
        CaptureRequest.Key<?> key2 = CaptureRequest.CONTROL_AF_MODE;
        x.e(key2, "CONTROL_AF_MODE");
        Integer intOrNull2 = getIntOrNull(map, key2);
        AfMode afModeM323fromIntOrNullMKXwA8g = intOrNull2 != null ? AfMode.Companion.m323fromIntOrNullMKXwA8g(intOrNull2.intValue()) : null;
        CaptureRequest.Key<?> key3 = CaptureRequest.CONTROL_AWB_MODE;
        x.e(key3, "CONTROL_AWB_MODE");
        Integer intOrNull3 = getIntOrNull(map, key3);
        AwbMode awbModeM349fromIntOrNullSaEiwI = intOrNull3 != null ? AwbMode.Companion.m349fromIntOrNullSaEiwI(intOrNull3.intValue()) : null;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = (aeModeM305fromIntOrNullkQd0u18 == null || x.n(aeModeM305fromIntOrNullkQd0u18, this.lastAeMode)) ? false : true;
        boolean z4 = (afModeM323fromIntOrNullMKXwA8g == null || x.n(afModeM323fromIntOrNullMKXwA8g, this.lastAfMode)) ? false : true;
        if (awbModeM349fromIntOrNullSaEiwI != null && !x.n(awbModeM349fromIntOrNullSaEiwI, this.lastAwbMode)) {
            z2 = true;
        }
        if (z3 || z4) {
            z = z2;
        } else if (!z2) {
            return;
        }
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled(Log.TAG)) {
            android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "UseCaseCameraState: Updating 3A modes: AE(" + aeModeM305fromIntOrNullkQd0u18 + ", changed=" + z3 + "), AF(" + afModeM323fromIntOrNullMKXwA8g + ", changed=" + z4 + "), AWB(" + awbModeM349fromIntOrNullSaEiwI + ", changed=" + z + ")");
        }
        CameraControls3A.CC.m432update3Aznct4lo$default(session, aeModeM305fromIntOrNullkQd0u18, afModeM323fromIntOrNullMKXwA8g, awbModeM349fromIntOrNullSaEiwI, null, null, null, null, null, false, 504, null);
        if (aeModeM305fromIntOrNullkQd0u18 != null) {
            this.lastAeMode = aeModeM305fromIntOrNullkQd0u18;
        }
        if (afModeM323fromIntOrNullMKXwA8g != null) {
            this.lastAfMode = afModeM323fromIntOrNullMKXwA8g;
        }
        if (awbModeM349fromIntOrNullSaEiwI != null) {
            this.lastAwbMode = awbModeM349fromIntOrNullSaEiwI;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: updateAsync-Tp9XwKQ$default, reason: not valid java name */
    public static /* synthetic */ Object m290updateAsyncTp9XwKQ$default(UseCaseCameraState useCaseCameraState, Map map, boolean z, Map map2, boolean z2, Set set, RequestTemplate requestTemplate, Set set2, e eVar, int i2, Object obj) {
        if (1 == (i2 & 1)) {
            map = null;
        }
        boolean z3 = z | (!((i2 & 2) == 0));
        if ((i2 & 4) != 0) {
            map2 = null;
        }
        boolean z4 = z2 | (!((i2 & 8) == 0));
        if ((i2 & 16) != 0) {
            set = null;
        }
        if ((i2 & 32) != 0) {
            requestTemplate = null;
        }
        if ((i2 & 64) != 0) {
            set2 = null;
        }
        return useCaseCameraState.m292updateAsyncTp9XwKQ(map, z3, map2, z4, set, requestTemplate, set2, eVar);
    }

    /* renamed from: updateState-HOTx9TI, reason: not valid java name */
    private final void m291updateStateHOTx9TI(Map<CaptureRequest.Key<?>, ? extends Object> map, boolean z, Map<Metadata.Key<?>, ? extends Object> map2, boolean z2, Set<StreamId> set, RequestTemplate requestTemplate, Set<? extends Request.Listener> set2) {
        Camera2Logger camera2Logger = Camera2Logger.INSTANCE;
        if (Logger.isDebugEnabled(Log.TAG)) {
            android.util.Log.d(Camera2Logger.TRUNCATED_TAG, "UseCaseCameraState#updateState: parameters = " + map + ", internalParameters = " + map2 + ", streams = " + set + ", template = " + requestTemplate);
        }
        if (map != null) {
            if (!z) {
                this.currentParameters.clear();
            }
            this.currentParameters.putAll(map);
        }
        if (map2 != null) {
            if (!z2) {
                this.currentInternalParameters.clear();
            }
            this.currentInternalParameters.putAll(map2);
        }
        if (set != null) {
            this.currentStreams.clear();
            this.currentStreams.addAll(set);
        }
        if (requestTemplate != null) {
            this.currentTemplate = requestTemplate;
        }
        if (set2 != null) {
            this.currentListeners.clear();
            this.currentListeners.addAll(set2);
        }
    }

    public final void close() {
        synchronized (this.lock) {
            if (this.updating) {
                this.updating = false;
                CompletableDeferred<ab> completableDeferred = this.updateSignal;
                if (completableDeferred != null) {
                    completableDeferred.b(new CancellationException("UseCaseCameraState closed"));
                }
                this.updateSignal = null;
            }
            while (!this.updateSignals.isEmpty()) {
                this.updateSignals.removeFirst().getSignal().b(new CancellationException("UseCaseCameraState closed"));
                this.pendingSignalCount.a();
            }
        }
    }

    public final Object tryStartRepeating(e<? super ab> eVar) throws Exception {
        Object objSubmitLatest = submitLatest(eVar);
        return objSubmitLatest == a.f48038a ? objSubmitLatest : ab.f48028a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* renamed from: updateAsync-Tp9XwKQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m292updateAsyncTp9XwKQ(java.util.Map<android.hardware.camera2.CaptureRequest.Key<?>, ? extends java.lang.Object> r8, boolean r9, java.util.Map<androidx.camera.camera2.pipe.Metadata.Key<?>, ? extends java.lang.Object> r10, boolean r11, java.util.Set<androidx.camera.camera2.pipe.StreamId> r12, androidx.camera.camera2.pipe.RequestTemplate r13, java.util.Set<? extends androidx.camera.camera2.pipe.Request.Listener> r14, h.c.e<? super kotlinx.coroutines.am<h.ab>> r15) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.UseCaseCameraState.m292updateAsyncTp9XwKQ(java.util.Map, boolean, java.util.Map, boolean, java.util.Set, androidx.camera.camera2.pipe.RequestTemplate, java.util.Set, h.c.e):java.lang.Object");
    }

    /* compiled from: WazeSource */
    public final class RequestListener implements Request.Listener {
        public RequestListener() {
        }

        private final void complete(u<RequestSignal> uVar, int i2) {
            while (!uVar.isEmpty() && ((RequestSignal) uVar.a()).getRequestNo() <= i2) {
                ((RequestSignal) uVar.a()).getSignal().a(ab.f48028a);
                i.u(uVar);
                UseCaseCameraState.this.pendingSignalCount.a();
            }
        }

        private final void completeExceptionally(RequestMetadata requestMetadata, RequestFailure requestFailure) {
            String str;
            Integer num = (Integer) requestMetadata.get(TagsKt.getUSE_CASE_CAMERA_STATE_CUSTOM_TAG());
            if (num != null) {
                UseCaseCameraState useCaseCameraState = UseCaseCameraState.this;
                int iIntValue = num.intValue();
                synchronized (useCaseCameraState.lock) {
                    u<RequestSignal> uVar = useCaseCameraState.updateSignals;
                    if (requestFailure != null) {
                        str = " with CaptureFailure.reason = " + requestFailure.getReason();
                    } else {
                        str = "";
                    }
                    completeExceptionally(uVar, iIntValue, new Throwable("Failed in framework level" + str));
                }
            }
        }

        static /* synthetic */ void completeExceptionally$default(RequestListener requestListener, RequestMetadata requestMetadata, RequestFailure requestFailure, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                requestFailure = null;
            }
            requestListener.completeExceptionally(requestMetadata, requestFailure);
        }

        @Override // androidx.camera.camera2.pipe.Request.Listener
        public /* synthetic */ void onAborted(Request request) {
            x.f(request, "request");
        }

        @Override // androidx.camera.camera2.pipe.Request.Listener
        /* renamed from: onBufferLost-DlC0U5Y */
        public /* synthetic */ void mo187onBufferLostDlC0U5Y(RequestMetadata requestMetadata, long j2, int i2) {
            x.f(requestMetadata, "requestMetadata");
        }

        @Override // androidx.camera.camera2.pipe.Request.Listener
        /* renamed from: onBufferLost-iiEMlm4 */
        public /* synthetic */ void mo188onBufferLostiiEMlm4(RequestMetadata requestMetadata, long j2, int i2, int i3) {
            x.f(requestMetadata, "requestMetadata");
        }

        @Override // androidx.camera.camera2.pipe.Request.Listener
        public /* synthetic */ void onCaptureProgress(RequestMetadata requestMetadata, int i2) {
            x.f(requestMetadata, "requestMetadata");
        }

        @Override // androidx.camera.camera2.pipe.Request.Listener
        /* renamed from: onComplete-CcXjc1I */
        public /* synthetic */ void mo189onCompleteCcXjc1I(RequestMetadata requestMetadata, long j2, FrameInfo frameInfo) {
            Request.Listener.CC.m854$default$onCompleteCcXjc1I(this, requestMetadata, j2, frameInfo);
        }

        @Override // androidx.camera.camera2.pipe.Request.Listener
        /* renamed from: onFailed-CcXjc1I */
        public void mo190onFailedCcXjc1I(RequestMetadata requestMetadata, long j2, RequestFailure requestFailure) {
            x.f(requestMetadata, "requestMetadata");
            x.f(requestFailure, "requestFailure");
            if (UseCaseCameraState.this.pendingSignalCount.d() == 0) {
                return;
            }
            completeExceptionally(requestMetadata, requestFailure);
        }

        @Override // androidx.camera.camera2.pipe.Request.Listener
        /* renamed from: onPartialCaptureResult-CcXjc1I */
        public /* synthetic */ void mo191onPartialCaptureResultCcXjc1I(RequestMetadata requestMetadata, long j2, FrameMetadata frameMetadata) {
            Request.Listener.CC.m856$default$onPartialCaptureResultCcXjc1I(this, requestMetadata, j2, frameMetadata);
        }

        @Override // androidx.camera.camera2.pipe.Request.Listener
        /* renamed from: onReadoutStarted-mP9r-9w */
        public /* synthetic */ void mo192onReadoutStartedmP9r9w(RequestMetadata requestMetadata, long j2, long j3) {
            x.f(requestMetadata, "requestMetadata");
        }

        @Override // androidx.camera.camera2.pipe.Request.Listener
        public /* synthetic */ void onRequestSequenceAborted(RequestMetadata requestMetadata) {
            x.f(requestMetadata, "requestMetadata");
        }

        @Override // androidx.camera.camera2.pipe.Request.Listener
        /* renamed from: onRequestSequenceCompleted-RuT0dZU */
        public /* synthetic */ void mo193onRequestSequenceCompletedRuT0dZU(RequestMetadata requestMetadata, long j2) {
            x.f(requestMetadata, "requestMetadata");
        }

        @Override // androidx.camera.camera2.pipe.Request.Listener
        public /* synthetic */ void onRequestSequenceCreated(RequestMetadata requestMetadata) {
            x.f(requestMetadata, "requestMetadata");
        }

        @Override // androidx.camera.camera2.pipe.Request.Listener
        public /* synthetic */ void onRequestSequenceSubmitted(RequestMetadata requestMetadata) {
            x.f(requestMetadata, "requestMetadata");
        }

        @Override // androidx.camera.camera2.pipe.Request.Listener
        /* renamed from: onStarted-uGKBvU4 */
        public /* synthetic */ void mo194onStarteduGKBvU4(RequestMetadata requestMetadata, long j2, long j3) {
            x.f(requestMetadata, "requestMetadata");
        }

        @Override // androidx.camera.camera2.pipe.Request.Listener
        /* renamed from: onTotalCaptureResult-CcXjc1I */
        public void mo195onTotalCaptureResultCcXjc1I(RequestMetadata requestMetadata, long j2, FrameInfo frameInfo) {
            Integer num;
            x.f(requestMetadata, "requestMetadata");
            x.f(frameInfo, "totalCaptureResult");
            if (UseCaseCameraState.this.pendingSignalCount.d() == 0 || (num = (Integer) requestMetadata.get(TagsKt.getUSE_CASE_CAMERA_STATE_CUSTOM_TAG())) == null) {
                return;
            }
            UseCaseCameraState useCaseCameraState = UseCaseCameraState.this;
            int iIntValue = num.intValue();
            synchronized (useCaseCameraState.lock) {
                complete(useCaseCameraState.updateSignals, iIntValue);
            }
        }

        private final void completeExceptionally(u<RequestSignal> uVar, int i2, Throwable th) {
            while (!uVar.isEmpty() && ((RequestSignal) uVar.a()).getRequestNo() <= i2) {
                ((RequestSignal) uVar.a()).getSignal().b(th);
                i.u(uVar);
                UseCaseCameraState.this.pendingSignalCount.a();
            }
        }
    }
}
