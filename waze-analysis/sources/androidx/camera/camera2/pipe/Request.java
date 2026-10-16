package androidx.camera.camera2.pipe;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.pipe.Metadata;
import androidx.camera.camera2.pipe.core.Debug;
import h.a.i;
import h.a.r;
import h.g.b.o;
import h.g.b.x;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Request {
    private final Map<Metadata.Key<?>, Object> extras;
    private final InputRequest inputRequest;
    private final List<Listener> listeners;
    private final Map<CaptureRequest.Key<?>, Object> parameters;
    private final List<StreamId> streams;
    private final RequestTemplate template;

    /* compiled from: WazeSource */
    public interface Listener {

        /* compiled from: WazeSource */
        /* renamed from: androidx.camera.camera2.pipe.Request$Listener$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            /* renamed from: $default$onComplete-CcXjc1I, reason: not valid java name */
            public static void m854$default$onCompleteCcXjc1I(Listener listener, RequestMetadata requestMetadata, long j2, FrameInfo frameInfo) {
                x.f(requestMetadata, "requestMetadata");
                x.f(frameInfo, "result");
            }

            /* renamed from: $default$onFailed-CcXjc1I, reason: not valid java name */
            public static void m855$default$onFailedCcXjc1I(Listener listener, RequestMetadata requestMetadata, long j2, RequestFailure requestFailure) {
                x.f(requestMetadata, "requestMetadata");
                x.f(requestFailure, "requestFailure");
            }

            /* renamed from: $default$onPartialCaptureResult-CcXjc1I, reason: not valid java name */
            public static void m856$default$onPartialCaptureResultCcXjc1I(Listener listener, RequestMetadata requestMetadata, long j2, FrameMetadata frameMetadata) {
                x.f(requestMetadata, "requestMetadata");
                x.f(frameMetadata, "captureResult");
            }

            /* renamed from: $default$onTotalCaptureResult-CcXjc1I, reason: not valid java name */
            public static void m860$default$onTotalCaptureResultCcXjc1I(Listener listener, RequestMetadata requestMetadata, long j2, FrameInfo frameInfo) {
                x.f(requestMetadata, "requestMetadata");
                x.f(frameInfo, "totalCaptureResult");
            }
        }

        /* compiled from: WazeSource */
        public final class DefaultImpls {
            @Deprecated
            public static void onAborted(Listener listener, Request request) {
                x.f(request, "request");
                x.f(request, "request");
            }

            @Deprecated
            /* renamed from: onBufferLost-DlC0U5Y, reason: not valid java name */
            public static void m870onBufferLostDlC0U5Y(Listener listener, RequestMetadata requestMetadata, long j2, int i2) {
                x.f(requestMetadata, "requestMetadata");
                x.f(requestMetadata, "requestMetadata");
            }

            @Deprecated
            /* renamed from: onBufferLost-iiEMlm4, reason: not valid java name */
            public static void m871onBufferLostiiEMlm4(Listener listener, RequestMetadata requestMetadata, long j2, int i2, int i3) {
                x.f(requestMetadata, "requestMetadata");
                x.f(requestMetadata, "requestMetadata");
            }

            @Deprecated
            public static void onCaptureProgress(Listener listener, RequestMetadata requestMetadata, int i2) {
                x.f(requestMetadata, "requestMetadata");
                x.f(requestMetadata, "requestMetadata");
            }

            @Deprecated
            /* renamed from: onComplete-CcXjc1I, reason: not valid java name */
            public static void m872onCompleteCcXjc1I(Listener listener, RequestMetadata requestMetadata, long j2, FrameInfo frameInfo) {
                x.f(requestMetadata, "requestMetadata");
                x.f(frameInfo, "result");
                CC.m854$default$onCompleteCcXjc1I(listener, requestMetadata, j2, frameInfo);
            }

            @Deprecated
            /* renamed from: onFailed-CcXjc1I, reason: not valid java name */
            public static void m873onFailedCcXjc1I(Listener listener, RequestMetadata requestMetadata, long j2, RequestFailure requestFailure) {
                x.f(requestMetadata, "requestMetadata");
                x.f(requestFailure, "requestFailure");
                CC.m855$default$onFailedCcXjc1I(listener, requestMetadata, j2, requestFailure);
            }

            @Deprecated
            /* renamed from: onPartialCaptureResult-CcXjc1I, reason: not valid java name */
            public static void m874onPartialCaptureResultCcXjc1I(Listener listener, RequestMetadata requestMetadata, long j2, FrameMetadata frameMetadata) {
                x.f(requestMetadata, "requestMetadata");
                x.f(frameMetadata, "captureResult");
                CC.m856$default$onPartialCaptureResultCcXjc1I(listener, requestMetadata, j2, frameMetadata);
            }

            @Deprecated
            /* renamed from: onReadoutStarted-mP9r-9w, reason: not valid java name */
            public static void m875onReadoutStartedmP9r9w(Listener listener, RequestMetadata requestMetadata, long j2, long j3) {
                x.f(requestMetadata, "requestMetadata");
                x.f(requestMetadata, "requestMetadata");
            }

            @Deprecated
            public static void onRequestSequenceAborted(Listener listener, RequestMetadata requestMetadata) {
                x.f(requestMetadata, "requestMetadata");
                x.f(requestMetadata, "requestMetadata");
            }

            @Deprecated
            /* renamed from: onRequestSequenceCompleted-RuT0dZU, reason: not valid java name */
            public static void m876onRequestSequenceCompletedRuT0dZU(Listener listener, RequestMetadata requestMetadata, long j2) {
                x.f(requestMetadata, "requestMetadata");
                x.f(requestMetadata, "requestMetadata");
            }

            @Deprecated
            public static void onRequestSequenceCreated(Listener listener, RequestMetadata requestMetadata) {
                x.f(requestMetadata, "requestMetadata");
                x.f(requestMetadata, "requestMetadata");
            }

            @Deprecated
            public static void onRequestSequenceSubmitted(Listener listener, RequestMetadata requestMetadata) {
                x.f(requestMetadata, "requestMetadata");
                x.f(requestMetadata, "requestMetadata");
            }

            @Deprecated
            /* renamed from: onStarted-uGKBvU4, reason: not valid java name */
            public static void m877onStarteduGKBvU4(Listener listener, RequestMetadata requestMetadata, long j2, long j3) {
                x.f(requestMetadata, "requestMetadata");
                x.f(requestMetadata, "requestMetadata");
            }

            @Deprecated
            /* renamed from: onTotalCaptureResult-CcXjc1I, reason: not valid java name */
            public static void m878onTotalCaptureResultCcXjc1I(Listener listener, RequestMetadata requestMetadata, long j2, FrameInfo frameInfo) {
                x.f(requestMetadata, "requestMetadata");
                x.f(frameInfo, "totalCaptureResult");
                CC.m860$default$onTotalCaptureResultCcXjc1I(listener, requestMetadata, j2, frameInfo);
            }
        }

        void onAborted(Request request);

        /* renamed from: onBufferLost-DlC0U5Y */
        void mo187onBufferLostDlC0U5Y(RequestMetadata requestMetadata, long j2, int i2);

        /* renamed from: onBufferLost-iiEMlm4 */
        void mo188onBufferLostiiEMlm4(RequestMetadata requestMetadata, long j2, int i2, int i3);

        void onCaptureProgress(RequestMetadata requestMetadata, int i2);

        /* renamed from: onComplete-CcXjc1I */
        void mo189onCompleteCcXjc1I(RequestMetadata requestMetadata, long j2, FrameInfo frameInfo);

        /* renamed from: onFailed-CcXjc1I */
        void mo190onFailedCcXjc1I(RequestMetadata requestMetadata, long j2, RequestFailure requestFailure);

        /* renamed from: onPartialCaptureResult-CcXjc1I */
        void mo191onPartialCaptureResultCcXjc1I(RequestMetadata requestMetadata, long j2, FrameMetadata frameMetadata);

        /* renamed from: onReadoutStarted-mP9r-9w */
        void mo192onReadoutStartedmP9r9w(RequestMetadata requestMetadata, long j2, long j3);

        void onRequestSequenceAborted(RequestMetadata requestMetadata);

        /* renamed from: onRequestSequenceCompleted-RuT0dZU */
        void mo193onRequestSequenceCompletedRuT0dZU(RequestMetadata requestMetadata, long j2);

        void onRequestSequenceCreated(RequestMetadata requestMetadata);

        void onRequestSequenceSubmitted(RequestMetadata requestMetadata);

        /* renamed from: onStarted-uGKBvU4 */
        void mo194onStarteduGKBvU4(RequestMetadata requestMetadata, long j2, long j3);

        /* renamed from: onTotalCaptureResult-CcXjc1I */
        void mo195onTotalCaptureResultCcXjc1I(RequestMetadata requestMetadata, long j2, FrameInfo frameInfo);
    }

    public /* synthetic */ Request(List list, Map map, Map map2, List list2, RequestTemplate requestTemplate, InputRequest inputRequest, int i2, o oVar) {
        this(list, (i2 & 2) != 0 ? r.j() : map, (i2 & 4) != 0 ? r.j() : map2, (i2 & 8) != 0 ? i.h() : list2, (i2 & 16) != 0 ? null : requestTemplate, (i2 & 32) != 0 ? null : inputRequest, null);
    }

    private final <T> T getUnchecked(CaptureRequest.Key<T> key) {
        return (T) this.parameters.get(key);
    }

    private final String toStringInternal(boolean z) {
        RequestTemplate requestTemplate = this.template;
        String strConcat = "";
        String strConcat2 = requestTemplate == null ? "" : ", template=".concat(RequestTemplate.m893toStringimpl(requestTemplate.m894unboximpl()));
        String strConcat3 = (!z || this.parameters.isEmpty()) ? "" : ", parameters=".concat(Debug.INSTANCE.formatParameterMap(this.parameters, 5));
        if (z && !this.extras.isEmpty()) {
            strConcat = ", extras=".concat(Debug.INSTANCE.formatParameterMap(this.extras, 5));
        }
        return "Request(streams=" + this.streams + strConcat2 + strConcat3 + strConcat + ")@" + Integer.toHexString(hashCode());
    }

    public final <T> T get(CaptureRequest.Key<T> key) {
        x.f(key, "key");
        return (T) getUnchecked(key);
    }

    public final Map<Metadata.Key<?>, Object> getExtras() {
        return this.extras;
    }

    public final InputRequest getInputRequest() {
        return this.inputRequest;
    }

    public final List<Listener> getListeners() {
        return this.listeners;
    }

    public final Map<CaptureRequest.Key<?>, Object> getParameters() {
        return this.parameters;
    }

    public final List<StreamId> getStreams() {
        return this.streams;
    }

    /* renamed from: getTemplate-ejQnlcg, reason: not valid java name */
    public final RequestTemplate m851getTemplateejQnlcg() {
        return this.template;
    }

    public String toString() {
        return toStringInternal(false);
    }

    public final String toStringVerbose() {
        return toStringInternal(true);
    }

    private final <T> T getUnchecked(Metadata.Key<T> key) {
        return (T) this.extras.get(key);
    }

    public final <T> T get(Metadata.Key<T> key) {
        x.f(key, "key");
        return (T) getUnchecked(key);
    }

    public /* synthetic */ Request(List list, Map map, Map map2, List list2, RequestTemplate requestTemplate, InputRequest inputRequest, o oVar) {
        this(list, map, map2, list2, requestTemplate, inputRequest);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Request(List<StreamId> list, Map<CaptureRequest.Key<?>, ? extends Object> map, Map<Metadata.Key<?>, ? extends Object> map2, List<? extends Listener> list2, RequestTemplate requestTemplate, InputRequest inputRequest) {
        x.f(list, "streams");
        x.f(map, "parameters");
        x.f(map2, "extras");
        x.f(list2, "listeners");
        this.streams = list;
        this.parameters = map;
        this.extras = map2;
        this.listeners = list2;
        this.template = requestTemplate;
        this.inputRequest = inputRequest;
    }
}
