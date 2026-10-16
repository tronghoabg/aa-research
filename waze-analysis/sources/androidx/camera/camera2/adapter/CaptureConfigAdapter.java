package androidx.camera.camera2.adapter;

import android.hardware.camera2.CaptureRequest;
import android.media.Image;
import androidx.camera.camera2.compat.workaround.TemplateParamsOverride;
import androidx.camera.camera2.config.UseCaseCameraContext;
import androidx.camera.camera2.config.UseCaseCameraScope;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.impl.Camera2ImplConfigKt;
import androidx.camera.camera2.impl.CameraCallbackMap;
import androidx.camera.camera2.impl.CameraProperties;
import androidx.camera.camera2.impl.TagsKt;
import androidx.camera.camera2.impl.UseCaseThreads;
import androidx.camera.camera2.pipe.CameraMetadata;
import androidx.camera.camera2.pipe.FrameInfo;
import androidx.camera.camera2.pipe.FrameMetadata;
import androidx.camera.camera2.pipe.InputRequest;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestFailure;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.camera2.pipe.RequestTemplate;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.camera2.pipe.media.AndroidImage;
import androidx.camera.common.UnsafeWrapper;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CameraCaptureResults;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import h.a.i;
import h.a.r;
import h.g.b.o;
import h.g.b.x;
import h.k;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: WazeSource */
@UseCaseCameraScope
/* loaded from: classes2.dex */
public final class CaptureConfigAdapter {
    public static final Companion Companion = new Companion(null);
    private final boolean isLegacyDevice;
    private final TemplateParamsOverride templateParamsOverride;
    private final UseCaseThreads threads;
    private final UseCaseCameraContext useCaseCameraContext;
    private final ZslControl zslControl;

    public CaptureConfigAdapter(CameraProperties cameraProperties, UseCaseCameraContext useCaseCameraContext, ZslControl zslControl, UseCaseThreads useCaseThreads, TemplateParamsOverride templateParamsOverride) {
        x.f(cameraProperties, "cameraProperties");
        x.f(useCaseCameraContext, "useCaseCameraContext");
        x.f(zslControl, "zslControl");
        x.f(useCaseThreads, "threads");
        x.f(templateParamsOverride, "templateParamsOverride");
        this.useCaseCameraContext = useCaseCameraContext;
        this.zslControl = zslControl;
        this.threads = useCaseThreads;
        this.templateParamsOverride = templateParamsOverride;
        this.isLegacyDevice = CameraMetadata.Companion.isHardwareLevelLegacy(cameraProperties.getMetadata());
    }

    private final Request.Listener buildImageClosingRequestListener(ImageProxy imageProxy) {
        final AtomicReference atomicReference = new AtomicReference(imageProxy);
        return new Request.Listener() { // from class: androidx.camera.camera2.adapter.CaptureConfigAdapter.buildImageClosingRequestListener.1
            @Override // androidx.camera.camera2.pipe.Request.Listener
            public void onAborted(Request request) {
                x.f(request, "request");
                CaptureConfigAdapter.buildImageClosingRequestListener$closeImageProxy(atomicReference);
            }

            @Override // androidx.camera.camera2.pipe.Request.Listener
            /* renamed from: onBufferLost-DlC0U5Y, reason: not valid java name */
            public /* synthetic */ void mo187onBufferLostDlC0U5Y(RequestMetadata requestMetadata, long j2, int i2) {
                x.f(requestMetadata, "requestMetadata");
            }

            @Override // androidx.camera.camera2.pipe.Request.Listener
            /* renamed from: onBufferLost-iiEMlm4, reason: not valid java name */
            public /* synthetic */ void mo188onBufferLostiiEMlm4(RequestMetadata requestMetadata, long j2, int i2, int i3) {
                x.f(requestMetadata, "requestMetadata");
            }

            @Override // androidx.camera.camera2.pipe.Request.Listener
            public /* synthetic */ void onCaptureProgress(RequestMetadata requestMetadata, int i2) {
                x.f(requestMetadata, "requestMetadata");
            }

            @Override // androidx.camera.camera2.pipe.Request.Listener
            /* renamed from: onComplete-CcXjc1I, reason: not valid java name */
            public void mo189onCompleteCcXjc1I(RequestMetadata requestMetadata, long j2, FrameInfo frameInfo) {
                x.f(requestMetadata, "requestMetadata");
                x.f(frameInfo, "result");
                CaptureConfigAdapter.buildImageClosingRequestListener$closeImageProxy(atomicReference);
            }

            @Override // androidx.camera.camera2.pipe.Request.Listener
            /* renamed from: onFailed-CcXjc1I, reason: not valid java name */
            public void mo190onFailedCcXjc1I(RequestMetadata requestMetadata, long j2, RequestFailure requestFailure) {
                x.f(requestMetadata, "requestMetadata");
                x.f(requestFailure, "requestFailure");
                CaptureConfigAdapter.buildImageClosingRequestListener$closeImageProxy(atomicReference);
            }

            @Override // androidx.camera.camera2.pipe.Request.Listener
            /* renamed from: onPartialCaptureResult-CcXjc1I, reason: not valid java name */
            public /* synthetic */ void mo191onPartialCaptureResultCcXjc1I(RequestMetadata requestMetadata, long j2, FrameMetadata frameMetadata) {
                Request.Listener.CC.m856$default$onPartialCaptureResultCcXjc1I(this, requestMetadata, j2, frameMetadata);
            }

            @Override // androidx.camera.camera2.pipe.Request.Listener
            /* renamed from: onReadoutStarted-mP9r-9w, reason: not valid java name */
            public /* synthetic */ void mo192onReadoutStartedmP9r9w(RequestMetadata requestMetadata, long j2, long j3) {
                x.f(requestMetadata, "requestMetadata");
            }

            @Override // androidx.camera.camera2.pipe.Request.Listener
            public /* synthetic */ void onRequestSequenceAborted(RequestMetadata requestMetadata) {
                x.f(requestMetadata, "requestMetadata");
            }

            @Override // androidx.camera.camera2.pipe.Request.Listener
            /* renamed from: onRequestSequenceCompleted-RuT0dZU, reason: not valid java name */
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
            /* renamed from: onStarted-uGKBvU4, reason: not valid java name */
            public /* synthetic */ void mo194onStarteduGKBvU4(RequestMetadata requestMetadata, long j2, long j3) {
                x.f(requestMetadata, "requestMetadata");
            }

            @Override // androidx.camera.camera2.pipe.Request.Listener
            /* renamed from: onTotalCaptureResult-CcXjc1I, reason: not valid java name */
            public void mo195onTotalCaptureResultCcXjc1I(RequestMetadata requestMetadata, long j2, FrameInfo frameInfo) {
                x.f(requestMetadata, "requestMetadata");
                x.f(frameInfo, "totalCaptureResult");
                CaptureConfigAdapter.buildImageClosingRequestListener$closeImageProxy(atomicReference);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void buildImageClosingRequestListener$closeImageProxy(AtomicReference<ImageProxy> atomicReference) {
        ImageProxy andSet = atomicReference.getAndSet(null);
        if (andSet != null) {
            andSet.close();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: mapToRequest-nAberiA$default, reason: not valid java name */
    public static /* synthetic */ Request m184mapToRequestnAberiA$default(CaptureConfigAdapter captureConfigAdapter, CaptureConfig captureConfig, int i2, Config config, List list, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            list = i.h();
        }
        return captureConfigAdapter.m185mapToRequestnAberiA(captureConfig, i2, config, list);
    }

    /* renamed from: mapToRequest-nAberiA, reason: not valid java name */
    public final Request m185mapToRequestnAberiA(CaptureConfig captureConfig, int i2, Config config, List<? extends Request.Listener> list) {
        InputRequest inputRequest;
        ImageProxy imageProxyDequeueImageFromBuffer;
        CameraCaptureResult cameraCaptureResultRetrieveCameraCaptureResult;
        x.f(captureConfig, "captureConfig");
        x.f(config, "sessionConfigOptions");
        x.f(list, "additionalListeners");
        List<DeferrableSurface> surfaces = captureConfig.getSurfaces();
        x.e(surfaces, "getSurfaces(...)");
        if (surfaces.isEmpty()) {
            Objects.toString(captureConfig);
            throw new IllegalStateException("Attempted to issue a capture without surfaces using ".concat(String.valueOf(captureConfig)));
        }
        List<DeferrableSurface> list2 = surfaces;
        ArrayList arrayList = new ArrayList(i.q(list2, 10));
        for (DeferrableSurface deferrableSurface : list2) {
            StreamId streamId = this.useCaseCameraContext.getSurfaceToStreamMap().get(deferrableSurface);
            if (streamId == null) {
                Objects.toString(deferrableSurface);
                throw new IllegalStateException("Attempted to issue a capture with an unrecognized surface: ".concat(String.valueOf(deferrableSurface)));
            }
            arrayList.add(StreamId.m974boximpl(streamId.m980unboximpl()));
        }
        ArrayList arrayList2 = arrayList;
        CameraCallbackMap cameraCallbackMap = new CameraCallbackMap();
        List<CameraCaptureCallback> cameraCaptureCallbacks = captureConfig.getCameraCaptureCallbacks();
        x.e(cameraCaptureCallbacks, "getCameraCaptureCallbacks(...)");
        for (CameraCaptureCallback cameraCaptureCallback : cameraCaptureCallbacks) {
            x.c(cameraCaptureCallback);
            cameraCallbackMap.addCaptureCallback(cameraCaptureCallback, this.threads.getSequentialExecutor());
        }
        Config implementationOptions = captureConfig.getImplementationOptions();
        x.e(implementationOptions, "getImplementationOptions(...)");
        Camera2ImplConfig.Builder builder = new Camera2ImplConfig.Builder();
        builder.insertAllOptions(config);
        builder.insertAllOptions(implementationOptions);
        if (implementationOptions.containsOption(CaptureConfig.OPTION_ROTATION)) {
            CaptureRequest.Key key = CaptureRequest.JPEG_ORIENTATION;
            x.e(key, "JPEG_ORIENTATION");
            Object objRetrieveOption = implementationOptions.retrieveOption(CaptureConfig.OPTION_ROTATION);
            x.c(objRetrieveOption);
            builder.setCaptureRequestOption(key, objRetrieveOption);
        }
        if (implementationOptions.containsOption(CaptureConfig.OPTION_JPEG_QUALITY)) {
            CaptureRequest.Key key2 = CaptureRequest.JPEG_QUALITY;
            x.e(key2, "JPEG_QUALITY");
            Object objRetrieveOption2 = implementationOptions.retrieveOption(CaptureConfig.OPTION_JPEG_QUALITY);
            x.c(objRetrieveOption2);
            builder.setCaptureRequestOption(key2, Byte.valueOf((byte) ((Number) objRetrieveOption2).intValue()));
        }
        int templateType = captureConfig.getTemplateType();
        Request.Listener listenerBuildImageClosingRequestListener = null;
        if (captureConfig.getTemplateType() != 5 || this.zslControl.isZslDisabledByUserCaseConfig() || this.zslControl.isZslDisabledByFlashMode() || (imageProxyDequeueImageFromBuffer = this.zslControl.dequeueImageFromBuffer()) == null || (cameraCaptureResultRetrieveCameraCaptureResult = CameraCaptureResults.retrieveCameraCaptureResult(imageProxyDequeueImageFromBuffer.getImageInfo())) == null) {
            inputRequest = null;
        } else {
            if (!(cameraCaptureResultRetrieveCameraCaptureResult instanceof CaptureResultAdapter)) {
                Class<?> cls = cameraCaptureResultRetrieveCameraCaptureResult.getClass();
                Objects.toString(cls);
                throw new IllegalStateException("Unexpected capture result type: ".concat(String.valueOf(cls)));
            }
            Image image = imageProxyDequeueImageFromBuffer.getImage();
            if (image == null) {
                throw new IllegalStateException("Required value was null.");
            }
            AndroidImage androidImage = new AndroidImage(image);
            Object objUnwrapAs = ((UnsafeWrapper) cameraCaptureResultRetrieveCameraCaptureResult).unwrapAs(FrameInfo.class);
            if (objUnwrapAs == null) {
                throw new IllegalStateException("Required value was null.");
            }
            inputRequest = new InputRequest(androidImage, (FrameInfo) objUnwrapAs);
            listenerBuildImageClosingRequestListener = buildImageClosingRequestListener(imageProxyDequeueImageFromBuffer);
        }
        if (inputRequest == null) {
            templateType = Companion.m186getStillCaptureTemplateCMLptTo$camera_camera2(captureConfig, i2, this.isLegacyDevice);
        }
        Map mapO = r.o(this.templateParamsOverride.mo230getOverrideParamsxlOpshk(RequestTemplate.m887boximpl(templateType)), Camera2ImplConfigKt.toParameters(builder.build()));
        List listB = i.b();
        listB.add(cameraCallbackMap);
        if (listenerBuildImageClosingRequestListener != null) {
            listB.add(listenerBuildImageClosingRequestListener);
        }
        listB.addAll(list);
        return new Request(arrayList2, mapO, r.e(new k(TagsKt.getCAMERAX_TAG_BUNDLE(), captureConfig.getTagBundle())), i.a(listB), RequestTemplate.m887boximpl(templateType), inputRequest, null);
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getStillCaptureTemplate-CMLptTo$camera_camera2, reason: not valid java name */
        public final int m186getStillCaptureTemplateCMLptTo$camera_camera2(CaptureConfig captureConfig, int i2, boolean z) {
            x.f(captureConfig, "$this$getStillCaptureTemplate");
            int i3 = (!RequestTemplate.m890equalsimpl0(i2, 3) || z) ? (captureConfig.getTemplateType() == -1 || captureConfig.getTemplateType() == 5) ? 2 : -1 : 4;
            return i3 != -1 ? i3 : captureConfig.getTemplateType();
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
