package androidx.camera.camera2.pipe.internal;

import android.os.Build;
import androidx.camera.camera2.pipe.CameraStream;
import androidx.camera.camera2.pipe.FrameInfo;
import androidx.camera.camera2.pipe.FrameMetadata;
import androidx.camera.camera2.pipe.FrameReference;
import androidx.camera.camera2.pipe.ImageSourceConfig;
import androidx.camera.camera2.pipe.OutputId;
import androidx.camera.camera2.pipe.OutputStatus;
import androidx.camera.camera2.pipe.OutputStream;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestFailure;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.camera2.pipe.graph.StreamGraphImpl;
import androidx.camera.camera2.pipe.internal.FrameCaptureQueue;
import androidx.camera.camera2.pipe.internal.FrameState;
import androidx.camera.camera2.pipe.media.ClosingFinalizer;
import androidx.camera.camera2.pipe.media.ExpectedOutputsListener;
import androidx.camera.camera2.pipe.media.ImageListener;
import androidx.camera.camera2.pipe.media.ImageSource;
import androidx.camera.camera2.pipe.media.ImageWrapper;
import androidx.camera.camera2.pipe.media.NoOpFinalizer;
import androidx.camera.camera2.pipe.media.OutputImage;
import androidx.media3.common.video.Frame;
import h.a.r;
import h.g.b.o;
import h.g.b.x;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class FrameDistributor implements AutoCloseable, Request.Listener {
    public static final Companion Companion = new Companion(null);
    private final Set<StreamId> concurrentImageStreams;
    private final FrameCaptureQueue frameCaptureQueue;
    private final OutputDistributor<FrameInfo> frameInfoDistributor;
    private FrameStartedListener frameStartedListener;
    private final Map<StreamId, Map<OutputId, OutputDistributor<OutputImage>>> imageDistributors;
    private final Set<CameraStream> imageStreams;
    private final StreamGraphImpl streamGraphImpl;

    /* compiled from: WazeSource */
    public interface FrameStartedListener {
        void onFrameStarted(FrameReference frameReference);
    }

    public FrameDistributor(StreamGraphImpl streamGraphImpl, FrameCaptureQueue frameCaptureQueue, boolean z, long j2) {
        x.f(streamGraphImpl, "streamGraphImpl");
        x.f(frameCaptureQueue, "frameCaptureQueue");
        this.streamGraphImpl = streamGraphImpl;
        this.frameCaptureQueue = frameCaptureQueue;
        this.frameInfoDistributor = new OutputDistributor<>(0, NoOpFinalizer.INSTANCE, OutputMatcher.Companion.getEXACT(), 1, null);
        this.frameStartedListener = new FrameStartedListener() { // from class: androidx.camera.camera2.pipe.internal.FrameDistributor$$ExternalSyntheticLambda0
            @Override // androidx.camera.camera2.pipe.internal.FrameDistributor.FrameStartedListener
            public final void onFrameStarted(FrameReference frameReference) {
                x.f(frameReference, "it");
            }
        };
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Map<StreamId, ImageSource> imageSourceMap$camera_camera2_pipe = streamGraphImpl.getImageSourceMap$camera_camera2_pipe();
        LinkedHashMap linkedHashMap = new LinkedHashMap(r.a(imageSourceMap$camera_camera2_pipe.size()));
        Iterator<T> it = imageSourceMap$camera_camera2_pipe.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            int iM980unboximpl = ((StreamId) entry.getKey()).m980unboximpl();
            final ImageSource imageSource = (ImageSource) entry.getValue();
            final CameraStream cameraStreamMo962getaKI5c8E = this.streamGraphImpl.mo962getaKI5c8E(iM980unboximpl);
            if (cameraStreamMo962getaKI5c8E == null) {
                throw new IllegalStateException("Required value was null.");
            }
            CameraStream.Config configM1188getCameraStreamConfigaKI5c8E = this.streamGraphImpl.m1188getCameraStreamConfigaKI5c8E(iM980unboximpl);
            x.c(configM1188getCameraStreamConfigaKI5c8E);
            ImageSourceConfig imageSourceConfig = configM1188getCameraStreamConfigaKI5c8E.getImageSourceConfig();
            x.c(imageSourceConfig);
            linkedHashSet.add(cameraStreamMo962getaKI5c8E);
            if (configM1188getCameraStreamConfigaKI5c8E.getImageSourceConfig().getEnableConcurrentOutputs()) {
                linkedHashSet2.add(StreamId.m974boximpl(iM980unboximpl));
            }
            OutputMatcher outputMatcherM1211selectTimestampMatcher5y4XNsE = Companion.m1211selectTimestampMatcher5y4XNsE(iM980unboximpl, configM1188getCameraStreamConfigaKI5c8E, imageSourceConfig, z, j2);
            Map mapC = r.c();
            Iterator<OutputStream> it2 = cameraStreamMo962getaKI5c8E.getOutputs().iterator();
            while (it2.hasNext()) {
                mapC.put(OutputId.m734boximpl(it2.next().mo758getId4LaLFng()), new OutputDistributor(0, ClosingFinalizer.INSTANCE, outputMatcherM1211selectTimestampMatcher5y4XNsE, 1, null));
            }
            final Map mapB = r.b(mapC);
            imageSource.setImageListener(new ImageListener() { // from class: androidx.camera.camera2.pipe.internal.FrameDistributor$1$1
                @Override // androidx.camera.camera2.pipe.media.ImageListener
                /* renamed from: onImage-2cgRUCs, reason: not valid java name */
                public final void mo1209onImage2cgRUCs(int i2, int i3, long j3, ImageWrapper imageWrapper) {
                    OutputDistributor<OutputImage> outputDistributor = mapB.get(OutputId.m734boximpl(i3));
                    if (outputDistributor != null) {
                        OutputDistributor<OutputImage> outputDistributor2 = outputDistributor;
                        if (imageWrapper != null) {
                            outputDistributor2.m1228onOutputResultDvZWqE8(j3, OutputImage.Companion.m1263fromAQuxepk(i2, i3, imageWrapper));
                            return;
                        } else {
                            outputDistributor2.m1228onOutputResultDvZWqE8(j3, OutputStatus.m741boximpl(OutputStatus.Companion.m750getERROR_OUTPUT_DROPPEDU7r42EA()));
                            return;
                        }
                    }
                    throw new IllegalStateException("Received unexpected images on " + imageSource + " from (" + StreamId.m979toStringimpl(i2) + ", " + OutputId.m739toStringimpl(i3) + ")");
                }
            });
            imageSource.setExpectedOutputsListener(new ExpectedOutputsListener() { // from class: androidx.camera.camera2.pipe.internal.FrameDistributor$$ExternalSyntheticLambda1
                @Override // androidx.camera.camera2.pipe.media.ExpectedOutputsListener
                public final void onExpectedOutputs(long j3, Set set) {
                    FrameDistributor.lambda$0$1(cameraStreamMo962getaKI5c8E, mapB, j3, set);
                }
            });
            linkedHashMap.put(key, mapB);
        }
        this.imageDistributors = linkedHashMap;
        this.imageStreams = linkedHashSet;
        this.concurrentImageStreams = true == linkedHashSet2.isEmpty() ? null : linkedHashSet2;
    }

    static final void lambda$0$1(CameraStream cameraStream, Map map, long j2, Set set) {
        x.f(set, "outputIds");
        List<OutputStream> outputs = cameraStream.getOutputs();
        int size = outputs.size();
        for (int i2 = 0; i2 < size; i2++) {
            int iMo758getId4LaLFng = outputs.get(i2).mo758getId4LaLFng();
            if (!set.contains(OutputId.m734boximpl(iMo758getId4LaLFng))) {
                Object obj = map.get(OutputId.m734boximpl(iMo758getId4LaLFng));
                if (obj == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                ((OutputDistributor) obj).m1228onOutputResultDvZWqE8(j2, OutputStatus.m741boximpl(OutputStatus.Companion.m754getUNAVAILABLEU7r42EA()));
            }
        }
    }

    /* renamed from: selectTimestampMatcher-5y4XNsE, reason: not valid java name */
    private static final OutputMatcher m1208selectTimestampMatcher5y4XNsE(int i2, CameraStream.Config config, ImageSourceConfig imageSourceConfig, boolean z, long j2) {
        return Companion.m1211selectTimestampMatcher5y4XNsE(i2, config, imageSourceConfig, z, j2);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.frameCaptureQueue.close();
        this.frameInfoDistributor.close();
        Iterator<Map<OutputId, OutputDistributor<OutputImage>>> it = this.imageDistributors.values().iterator();
        while (it.hasNext()) {
            Iterator<OutputDistributor<OutputImage>> it2 = it.next().values().iterator();
            while (it2.hasNext()) {
                it2.next().close();
            }
        }
    }

    public final FrameStartedListener getFrameStartedListener() {
        return this.frameStartedListener;
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    public void onAborted(Request request) {
        x.f(request, "request");
        FrameCaptureQueue.FrameCaptureImpl frameCaptureImplRemove = this.frameCaptureQueue.remove(request);
        if (frameCaptureImplRemove != null) {
            frameCaptureImplRemove.m1207completeWithFailuretXNfJfc(OutputStatus.Companion.m749getERROR_OUTPUT_ABORTEDU7r42EA());
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onBufferLost-DlC0U5Y */
    public /* synthetic */ void mo187onBufferLostDlC0U5Y(RequestMetadata requestMetadata, long j2, int i2) {
        x.f(requestMetadata, "requestMetadata");
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onBufferLost-iiEMlm4 */
    public void mo188onBufferLostiiEMlm4(RequestMetadata requestMetadata, long j2, int i2, int i3) {
        x.f(requestMetadata, "requestMetadata");
        Map<OutputId, OutputDistributor<OutputImage>> map = this.imageDistributors.get(StreamId.m974boximpl(i2));
        if (map == null) {
            return;
        }
        Set<StreamId> set = this.concurrentImageStreams;
        if (set != null && set.contains(StreamId.m974boximpl(i2))) {
            OutputDistributor<OutputImage> outputDistributor = map.get(OutputId.m734boximpl(i3));
            if (outputDistributor == null) {
                throw new IllegalStateException("Required value was null.");
            }
            outputDistributor.m1227onOutputFailureVw7M1qk(j2);
            return;
        }
        if (!map.containsKey(OutputId.m734boximpl(i3))) {
            throw new IllegalStateException("Check failed.");
        }
        Iterator<OutputDistributor<OutputImage>> it = map.values().iterator();
        while (it.hasNext()) {
            it.next().m1227onOutputFailureVw7M1qk(j2);
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    public /* synthetic */ void onCaptureProgress(RequestMetadata requestMetadata, int i2) {
        x.f(requestMetadata, "requestMetadata");
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onComplete-CcXjc1I */
    public void mo189onCompleteCcXjc1I(RequestMetadata requestMetadata, long j2, FrameInfo frameInfo) {
        x.f(requestMetadata, "requestMetadata");
        x.f(frameInfo, "result");
        this.frameInfoDistributor.m1228onOutputResultDvZWqE8(j2, frameInfo);
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onFailed-CcXjc1I */
    public void mo190onFailedCcXjc1I(RequestMetadata requestMetadata, long j2, RequestFailure requestFailure) {
        x.f(requestMetadata, "requestMetadata");
        x.f(requestFailure, "requestFailure");
        this.frameInfoDistributor.m1228onOutputResultDvZWqE8(j2, OutputStatus.m741boximpl(OutputStatus.Companion.m751getERROR_OUTPUT_FAILEDU7r42EA()));
        if (requestFailure.getWasImageCaptured()) {
            return;
        }
        Iterator<StreamId> it = requestMetadata.getStreams().keySet().iterator();
        while (it.hasNext()) {
            Map<OutputId, OutputDistributor<OutputImage>> map = this.imageDistributors.get(StreamId.m974boximpl(it.next().m980unboximpl()));
            if (map != null) {
                Iterator<OutputDistributor<OutputImage>> it2 = map.values().iterator();
                while (it2.hasNext()) {
                    it2.next().m1227onOutputFailureVw7M1qk(j2);
                }
            }
        }
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onStarted-uGKBvU4 */
    public void mo194onStarteduGKBvU4(RequestMetadata requestMetadata, long j2, long j3) throws Exception {
        FrameCaptureQueue.FrameCaptureImpl frameCaptureImplRemove;
        x.f(requestMetadata, "requestMetadata");
        FrameState frameState = new FrameState(requestMetadata, j2, j3, this.imageStreams, this.concurrentImageStreams, null);
        this.frameInfoDistributor.m1229onOutputStartedqGubWw0(j2, j3, j2, frameState.getFrameInfoOutput());
        int size = frameState.getImageOutputs().size();
        for (int i2 = 0; i2 < size; i2++) {
            FrameState.ImageOutput imageOutput = frameState.getImageOutputs().get(i2);
            Map<OutputId, OutputDistributor<OutputImage>> map = this.imageDistributors.get(StreamId.m974boximpl(imageOutput.m1221getStreamIdptHMqGs()));
            if (map == null) {
                throw new IllegalStateException("Required value was null.");
            }
            OutputDistributor<OutputImage> outputDistributor = map.get(OutputId.m734boximpl(imageOutput.m1220getOutputId4LaLFng()));
            if (outputDistributor == null) {
                throw new IllegalStateException("Required value was null.");
            }
            OutputDistributor<OutputImage> outputDistributor2 = outputDistributor;
            outputDistributor2.m1229onOutputStartedqGubWw0(j2, j3, j3, imageOutput);
            if (!requestMetadata.getStreams().keySet().contains(StreamId.m974boximpl(imageOutput.m1221getStreamIdptHMqGs()))) {
                outputDistributor2.m1227onOutputFailureVw7M1qk(frameState.m1213getFrameNumberUgla2oM());
            }
        }
        FrameImpl frameImpl = new FrameImpl(frameState, null, 2, 0 == true ? 1 : 0);
        if (requestMetadata.getRepeating() || (frameCaptureImplRemove = this.frameCaptureQueue.remove(requestMetadata.getRequest())) == null) {
            this.frameStartedListener.onFrameStarted(frameImpl);
            frameImpl.close();
        } else {
            frameImpl.setExternal$camera_camera2_pipe(true);
            this.frameStartedListener.onFrameStarted(frameImpl);
            frameCaptureImplRemove.completeWith(frameImpl);
        }
    }

    @Override // androidx.camera.camera2.pipe.Request.Listener
    /* renamed from: onTotalCaptureResult-CcXjc1I */
    public /* synthetic */ void mo195onTotalCaptureResultCcXjc1I(RequestMetadata requestMetadata, long j2, FrameInfo frameInfo) {
        Request.Listener.CC.m860$default$onTotalCaptureResultCcXjc1I(this, requestMetadata, j2, frameInfo);
    }

    public final void setFrameStartedListener(FrameStartedListener frameStartedListener) {
        x.f(frameStartedListener, "<set-?>");
        this.frameStartedListener = frameStartedListener;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        private final boolean isDefaultTimebase(CameraStream.Config config) {
            if (Build.VERSION.SDK_INT >= 33) {
                List<OutputStream.Config> outputs = config.getOutputs();
                if ((outputs instanceof Collection) && outputs.isEmpty()) {
                    return true;
                }
                for (OutputStream.Config config2 : outputs) {
                    if (config2.m769getTimestampBasepcPfPbY() != null) {
                        OutputStream.TimestampBase timestampBaseM769getTimestampBasepcPfPbY = config2.m769getTimestampBasepcPfPbY();
                        int iM845getTIMESTAMP_BASE_DEFAULT6HVI0MA = OutputStream.TimestampBase.Companion.m845getTIMESTAMP_BASE_DEFAULT6HVI0MA();
                        if (timestampBaseM769getTimestampBasepcPfPbY == null || !OutputStream.TimestampBase.m840equalsimpl0(timestampBaseM769getTimestampBasepcPfPbY.m843unboximpl(), iM845getTIMESTAMP_BASE_DEFAULT6HVI0MA)) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }

        private final boolean isHwComposerUsage(ImageSourceConfig imageSourceConfig) {
            return (Build.VERSION.SDK_INT < 33 || imageSourceConfig.getUsageFlags() == null || (imageSourceConfig.getUsageFlags().longValue() & Frame.USAGE_COMPOSER_OVERLAY) == 0) ? false : true;
        }

        private final boolean isRealtimeTimebase(CameraStream.Config config) {
            if (Build.VERSION.SDK_INT >= 33) {
                List<OutputStream.Config> outputs = config.getOutputs();
                if ((outputs instanceof Collection) && outputs.isEmpty()) {
                    return false;
                }
                Iterator<T> it = outputs.iterator();
                while (it.hasNext()) {
                    OutputStream.TimestampBase timestampBaseM769getTimestampBasepcPfPbY = ((OutputStream.Config) it.next()).m769getTimestampBasepcPfPbY();
                    if (timestampBaseM769getTimestampBasepcPfPbY == null ? false : OutputStream.TimestampBase.m840equalsimpl0(timestampBaseM769getTimestampBasepcPfPbY.m843unboximpl(), OutputStream.TimestampBase.Companion.m847getTIMESTAMP_BASE_REALTIME6HVI0MA())) {
                        return true;
                    }
                }
            }
            return false;
        }

        private final boolean isSensorTimebase(CameraStream.Config config) {
            if (Build.VERSION.SDK_INT >= 33) {
                List<OutputStream.Config> outputs = config.getOutputs();
                if ((outputs instanceof Collection) && outputs.isEmpty()) {
                    return false;
                }
                Iterator<T> it = outputs.iterator();
                while (it.hasNext()) {
                    OutputStream.TimestampBase timestampBaseM769getTimestampBasepcPfPbY = ((OutputStream.Config) it.next()).m769getTimestampBasepcPfPbY();
                    if (timestampBaseM769getTimestampBasepcPfPbY == null ? false : OutputStream.TimestampBase.m840equalsimpl0(timestampBaseM769getTimestampBasepcPfPbY.m843unboximpl(), OutputStream.TimestampBase.Companion.m848getTIMESTAMP_BASE_SENSOR6HVI0MA())) {
                        return true;
                    }
                }
            }
            return false;
        }

        private final boolean isVideoEncodeUsage(ImageSourceConfig imageSourceConfig) {
            return (imageSourceConfig.getUsageFlags() == null || (imageSourceConfig.getUsageFlags().longValue() & Frame.USAGE_VIDEO_ENCODE) == 0) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00c4  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00c8  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0113  */
        /* renamed from: selectTimestampMatcher-5y4XNsE, reason: not valid java name */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final androidx.camera.camera2.pipe.internal.OutputMatcher m1211selectTimestampMatcher5y4XNsE(int r10, androidx.camera.camera2.pipe.CameraStream.Config r11, androidx.camera.camera2.pipe.ImageSourceConfig r12, boolean r13, long r14) {
            /*
                Method dump skipped, instructions count: 434
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.internal.FrameDistributor.Companion.m1211selectTimestampMatcher5y4XNsE(int, androidx.camera.camera2.pipe.CameraStream$Config, androidx.camera.camera2.pipe.ImageSourceConfig, boolean, long):androidx.camera.camera2.pipe.internal.OutputMatcher");
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
