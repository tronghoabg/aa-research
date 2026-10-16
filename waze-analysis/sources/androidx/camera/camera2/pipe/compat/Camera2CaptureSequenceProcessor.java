package androidx.camera.camera2.pipe.compat;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Trace;
import android.view.Surface;
import androidx.camera.camera2.pipe.CameraStream;
import androidx.camera.camera2.pipe.CaptureSequence;
import androidx.camera.camera2.pipe.CaptureSequenceProcessor;
import androidx.camera.camera2.pipe.InputStream;
import androidx.camera.camera2.pipe.OutputId;
import androidx.camera.camera2.pipe.OutputStream;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestTemplate;
import androidx.camera.camera2.pipe.StreamFormat;
import androidx.camera.camera2.pipe.StreamGraph;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.camera2.pipe.StrictMode;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.core.Threads;
import androidx.camera.camera2.pipe.media.AndroidImageWriter;
import androidx.camera.camera2.pipe.media.ImageWriterWrapper;
import h.a.i;
import h.ab;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Camera2CaptureSequenceProcessor implements CaptureSequenceProcessor<CaptureRequest, Camera2CaptureSequence> {
    public static final Companion Companion = new Companion(null);
    private static final long WAIT_FOR_REPEATING_TIMEOUT;
    private final boolean awaitRepeatingRequestOnDisconnect;
    private final int debugId;
    private boolean disconnected;
    private final ImageWriterWrapper imageWriter;
    private Camera2CaptureSequence lastSingleRepeatingRequestSequence;
    private final Object lock;
    private final Map<OutputId, Surface> outputToSurfaceMap;
    private final CameraCaptureSessionWrapper session;
    private final StreamGraph streamGraph;
    private final Map<StreamId, Surface> streamToSurfaceMap;
    private final StrictMode strictMode;
    private final int template;
    private final Threads threads;

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.compat.Camera2CaptureSequenceProcessor$awaitRepeatingRequestStarted$2, reason: invalid class name */
    final class AnonymousClass2 extends h.c.b.a.g implements l<h.c.e<? super ab>, Object> {
        final /* synthetic */ Camera2CaptureSequence $captureSequence;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Camera2CaptureSequence camera2CaptureSequence, h.c.e<? super AnonymousClass2> eVar) {
            super(1, eVar);
            this.$captureSequence = camera2CaptureSequence;
        }

        @Override // h.c.b.a.a
        public final h.c.e<ab> create(h.c.e<?> eVar) {
            return new AnonymousClass2(this.$captureSequence, eVar);
        }

        @Override // h.g.a.l
        public final Object invoke(h.c.e<? super ab> eVar) {
            return ((AnonymousClass2) create(eVar)).invokeSuspend(ab.f48028a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.f48038a;
            int i2 = this.label;
            if (i2 == 0) {
                e.b.c.b(obj);
                this.label = 1;
                if (this.$captureSequence.awaitStarted$camera_camera2_pipe(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.b.c.b(obj);
            }
            return ab.f48028a;
        }
    }

    static {
        h.o.c cVar = h.o.a.f48264a;
        WAIT_FOR_REPEATING_TIMEOUT = h.o.c.i(2, h.o.d.f48273d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Camera2CaptureSequenceProcessor(CameraCaptureSessionWrapper cameraCaptureSessionWrapper, Threads threads, int i2, Map<StreamId, ? extends Surface> map, Map<OutputId, ? extends Surface> map2, StreamGraph streamGraph, StrictMode strictMode, boolean z) {
        x.f(cameraCaptureSessionWrapper, "session");
        x.f(threads, "threads");
        x.f(map, "streamToSurfaceMap");
        x.f(map2, "outputToSurfaceMap");
        x.f(streamGraph, "streamGraph");
        x.f(strictMode, "strictMode");
        this.session = cameraCaptureSessionWrapper;
        this.threads = threads;
        this.template = i2;
        this.streamToSurfaceMap = map;
        this.outputToSurfaceMap = map2;
        this.streamGraph = streamGraph;
        this.strictMode = strictMode;
        this.awaitRepeatingRequestOnDisconnect = z;
        this.debugId = Camera2CaptureSequenceProcessorKt.getCaptureSequenceProcessorDebugIds().e();
        this.lock = new Object();
        ImageWriterWrapper imageWriterWrapperM1255createU86x6Zg = null;
        if (!streamGraph.getInputs().isEmpty()) {
            InputStream inputStream = (InputStream) i.P(streamGraph.getInputs());
            Surface inputSurface = cameraCaptureSessionWrapper.getInputSurface();
            if (inputSurface == null) {
                throw new IllegalStateException("inputSurface is required to create instance of imageWriter.");
            }
            try {
                imageWriterWrapperM1255createU86x6Zg = AndroidImageWriter.Companion.m1255createU86x6Zg(inputSurface, inputStream.mo708getIdm1bwn9M(), inputStream.getMaxImages(), StreamFormat.m918boximpl(inputStream.mo707getFormat8FPWQzE()), threads.getCamera2Handler());
            } catch (RuntimeException e2) {
                RuntimeException runtimeException = e2;
                if (Log.INSTANCE.getERROR_LOGGABLE()) {
                    android.util.Log.e(Log.TAG, "Failed to create ImageWriter for session " + this.session + "! Reprocessing will not be supported!", runtimeException);
                }
            }
            if (imageWriterWrapperM1255createU86x6Zg != null && Log.INSTANCE.getDEBUG_LOGGABLE()) {
                android.util.Log.d(Log.TAG, "Created ImageWriter " + imageWriterWrapperM1255createU86x6Zg + " for session " + this.session);
            }
        }
        this.imageWriter = imageWriterWrapperM1255createU86x6Zg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void awaitRepeatingRequestStarted(Camera2CaptureSequence camera2CaptureSequence) {
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            Objects.toString(camera2CaptureSequence);
            android.util.Log.d(Log.TAG, "Waiting for the last repeating request sequence: ".concat(String.valueOf(camera2CaptureSequence)));
        }
        if (((ab) this.threads.m1119runBlockingCheckedOrNullVtjQ1oo(WAIT_FOR_REPEATING_TIMEOUT, new AnonymousClass2(camera2CaptureSequence, null))) == null && Log.INSTANCE.getERROR_LOGGABLE()) {
            android.util.Log.e(Log.TAG, this + "#close: awaitStarted on last repeating request timed out, lastSingleRepeatingRequestSequence = " + camera2CaptureSequence);
        }
    }

    /* renamed from: buildCaptureRequestBuilder-0UCm73U, reason: not valid java name */
    private final CaptureRequest.Builder m1015buildCaptureRequestBuilder0UCm73U(Request request, int i2) {
        CaptureRequest.Builder builderMo983createCaptureRequest2PPcXtw;
        if (request.getInputRequest() != null) {
            TotalCaptureResult totalCaptureResult = (TotalCaptureResult) request.getInputRequest().getFrameInfo().unwrapAs(TotalCaptureResult.class);
            if (totalCaptureResult == null) {
                throw new IllegalStateException("Failed to unwrap FrameInfo " + request.getInputRequest().getFrameInfo() + " as TotalCaptureResult");
            }
            builderMo983createCaptureRequest2PPcXtw = this.session.getDevice().createReprocessCaptureRequest(totalCaptureResult);
        } else {
            builderMo983createCaptureRequest2PPcXtw = this.session.getDevice().mo983createCaptureRequest2PPcXtw(i2);
        }
        if (builderMo983createCaptureRequest2PPcXtw != null) {
            return builderMo983createCaptureRequest2PPcXtw;
        }
        if (request.getInputRequest() != null) {
            if (Log.INSTANCE.getINFO_LOGGABLE()) {
                android.util.Log.i(Log.TAG, "Failed to create a ReprocessingCaptureRequest.Builder from " + request.getInputRequest().getFrameInfo() + "!");
            }
        } else if (Log.INSTANCE.getINFO_LOGGABLE()) {
            android.util.Log.i(Log.TAG, "Failed to create a CaptureRequest.Builder from " + RequestTemplate.m893toStringimpl(i2) + "!");
        }
        return null;
    }

    private final boolean buildSurfaceMaps(List<Request> list, Map<Surface, StreamId> map, Map<Surface, OutputId> map2, Map<StreamId, Surface> map3) {
        if (list.isEmpty()) {
            throw new IllegalStateException("build(...) should never be called with an empty request list!");
        }
        for (Request request : list) {
            Iterator<StreamId> it = request.getStreams().iterator();
            boolean z = false;
            while (it.hasNext()) {
                int iM980unboximpl = it.next().m980unboximpl();
                if (!map3.containsKey(StreamId.m974boximpl(iM980unboximpl))) {
                    Surface surface = this.streamToSurfaceMap.get(StreamId.m974boximpl(iM980unboximpl));
                    if (surface != null) {
                        map.put(surface, StreamId.m974boximpl(iM980unboximpl));
                        map3.put(StreamId.m974boximpl(iM980unboximpl), surface);
                        CameraStream cameraStreamMo962getaKI5c8E = this.streamGraph.mo962getaKI5c8E(iM980unboximpl);
                        if (cameraStreamMo962getaKI5c8E == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        for (OutputStream outputStream : cameraStreamMo962getaKI5c8E.getOutputs()) {
                            Surface surface2 = this.outputToSurfaceMap.get(OutputId.m734boximpl(outputStream.mo758getId4LaLFng()));
                            if (surface2 == null) {
                                throw new IllegalStateException("Required value was null.");
                            }
                            map2.put(surface2, OutputId.m734boximpl(outputStream.mo758getId4LaLFng()));
                        }
                    } else {
                        continue;
                    }
                }
                z = true;
            }
            if (!z) {
                if (Log.INSTANCE.getINFO_LOGGABLE()) {
                    android.util.Log.i(Log.TAG, a.a(request, "  Failed to bind any surfaces for ", "!"));
                }
                return false;
            }
        }
        return true;
    }

    private final boolean validateRequestList(List<Request> list, CameraCaptureSessionWrapper cameraCaptureSessionWrapper) {
        boolean z;
        boolean z2;
        if (list.isEmpty()) {
            throw new IllegalStateException("build(...) should never be called with an empty request list!");
        }
        if (cameraCaptureSessionWrapper instanceof CameraConstrainedHighSpeedCaptureSessionWrapper) {
            Boolean bool = null;
            Boolean bool2 = null;
            for (Request request : list) {
                List<StreamId> streams = request.getStreams();
                if ((streams instanceof Collection) && streams.isEmpty()) {
                    z = false;
                } else {
                    Iterator<T> it = streams.iterator();
                    while (it.hasNext()) {
                        ((StreamId) it.next()).m980unboximpl();
                        List<OutputStream> outputs = this.streamGraph.getOutputs();
                        if (!(outputs instanceof Collection) || !outputs.isEmpty()) {
                            for (OutputStream outputStream : outputs) {
                                OutputStream.StreamUseCase streamUseCaseMo760getStreamUseCase8x2ez34 = outputStream.mo760getStreamUseCase8x2ez34();
                                long jM823getPREVIEWvrKr8v8 = OutputStream.StreamUseCase.Companion.m823getPREVIEWvrKr8v8();
                                if (streamUseCaseMo760getStreamUseCase8x2ez34 == null || !OutputStream.StreamUseCase.m817equalsimpl0(streamUseCaseMo760getStreamUseCase8x2ez34.m820unboximpl(), jM823getPREVIEWvrKr8v8)) {
                                    OutputStream.StreamUseHint streamUseHintMo761getStreamUseHintHIPxoCc = outputStream.mo761getStreamUseHintHIPxoCc();
                                    long jM835getDEFAULT4VYZOf8 = OutputStream.StreamUseHint.Companion.m835getDEFAULT4VYZOf8();
                                    if ((streamUseHintMo761getStreamUseHintHIPxoCc != null && OutputStream.StreamUseHint.m831equalsimpl0(streamUseHintMo761getStreamUseHintHIPxoCc.m834unboximpl(), jM835getDEFAULT4VYZOf8)) || outputStream.mo761getStreamUseHintHIPxoCc() == null) {
                                    }
                                }
                                z = true;
                            }
                        }
                    }
                    z = false;
                }
                Boolean boolValueOf = Boolean.valueOf(z);
                if (bool != null && !x.n(bool, boolValueOf) && Log.INSTANCE.getERROR_LOGGABLE()) {
                    android.util.Log.e(Log.TAG, c.a(boolValueOf, bool, "The previous high speed request and the current high speed request must both have a preview stream use case or hint. Previous request contains preview stream use case or hint: ", ". Current request contains preview stream use case or hint: ", "."));
                }
                List<StreamId> streams2 = request.getStreams();
                if ((streams2 instanceof Collection) && streams2.isEmpty()) {
                    z2 = false;
                } else {
                    Iterator<T> it2 = streams2.iterator();
                    while (it2.hasNext()) {
                        ((StreamId) it2.next()).m980unboximpl();
                        List<OutputStream> outputs2 = this.streamGraph.getOutputs();
                        if (!(outputs2 instanceof Collection) || !outputs2.isEmpty()) {
                            for (OutputStream outputStream2 : outputs2) {
                                OutputStream.StreamUseCase streamUseCaseMo760getStreamUseCase8x2ez342 = outputStream2.mo760getStreamUseCase8x2ez34();
                                long jM827getVIDEO_RECORDvrKr8v8 = OutputStream.StreamUseCase.Companion.m827getVIDEO_RECORDvrKr8v8();
                                if (streamUseCaseMo760getStreamUseCase8x2ez342 == null || !OutputStream.StreamUseCase.m817equalsimpl0(streamUseCaseMo760getStreamUseCase8x2ez342.m820unboximpl(), jM827getVIDEO_RECORDvrKr8v8)) {
                                    OutputStream.StreamUseHint streamUseHintMo761getStreamUseHintHIPxoCc2 = outputStream2.mo761getStreamUseHintHIPxoCc();
                                    long jM836getVIDEO_RECORD4VYZOf8 = OutputStream.StreamUseHint.Companion.m836getVIDEO_RECORD4VYZOf8();
                                    if (streamUseHintMo761getStreamUseHintHIPxoCc2 != null && OutputStream.StreamUseHint.m831equalsimpl0(streamUseHintMo761getStreamUseHintHIPxoCc2.m834unboximpl(), jM836getVIDEO_RECORD4VYZOf8)) {
                                    }
                                }
                                z2 = true;
                            }
                        }
                    }
                    z2 = false;
                }
                Boolean boolValueOf2 = Boolean.valueOf(z2);
                if (bool2 != null && !x.n(bool2, boolValueOf2) && Log.INSTANCE.getERROR_LOGGABLE()) {
                    android.util.Log.e(Log.TAG, c.a(boolValueOf2, bool2, "The previous high speed request and the current high speed request do not have the same video stream use case. Previous request contains video stream use case: ", ". Current request contains video stream use case: ", "."));
                }
                List<OutputStream> outputs3 = this.streamGraph.getOutputs();
                if (!(outputs3 instanceof Collection) || !outputs3.isEmpty()) {
                    Iterator<T> it3 = outputs3.iterator();
                    while (it3.hasNext()) {
                        if (!((OutputStream) it3.next()).isValidForHighSpeedOperatingMode()) {
                            if (Log.INSTANCE.getERROR_LOGGABLE()) {
                                List<OutputStream> outputs4 = this.streamGraph.getOutputs();
                                Objects.toString(outputs4);
                                android.util.Log.e(Log.TAG, "HIGH_SPEED CameraGraph must only contain Preview and/or Video streams. Configured outputs are ".concat(String.valueOf(outputs4)));
                            }
                            return false;
                        }
                    }
                }
                bool2 = boolValueOf2;
                bool = boolValueOf;
            }
        }
        return true;
    }

    @Override // androidx.camera.camera2.pipe.CaptureSequenceProcessor
    public void abortCaptures() {
        synchronized (this.lock) {
            if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                android.util.Log.d(Log.TAG, this + "#abortCaptures");
            }
            this.session.abortCaptures();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:95:0x0297 A[LOOP:4: B:94:0x0295->B:95:0x0297, LOOP_END] */
    @Override // androidx.camera.camera2.pipe.CaptureSequenceProcessor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.camera.camera2.pipe.compat.Camera2CaptureSequence build(boolean r26, java.util.List<androidx.camera.camera2.pipe.Request> r27, java.util.Map<?, ? extends java.lang.Object> r28, java.util.Map<?, ? extends java.lang.Object> r29, java.util.Map<?, ? extends java.lang.Object> r30, androidx.camera.camera2.pipe.CaptureSequence.CaptureSequenceListener r31, java.util.List<? extends androidx.camera.camera2.pipe.Request.Listener> r32) {
        /*
            Method dump skipped, instructions count: 970
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.pipe.compat.Camera2CaptureSequenceProcessor.build(boolean, java.util.List, java.util.Map, java.util.Map, java.util.Map, androidx.camera.camera2.pipe.CaptureSequence$CaptureSequenceListener, java.util.List):androidx.camera.camera2.pipe.compat.Camera2CaptureSequence");
    }

    public final void disconnect$camera_camera2_pipe() {
        Camera2CaptureSequence camera2CaptureSequence;
        toString();
        try {
            Trace.beginSection(toString().concat("#disconnect"));
            synchronized (this.lock) {
                if (this.disconnected) {
                    camera2CaptureSequence = null;
                } else {
                    this.disconnected = true;
                    ImageWriterWrapper imageWriterWrapper = this.imageWriter;
                    if (imageWriterWrapper != null) {
                        Camera2CaptureSequenceProcessor$$ExternalSyntheticAutoCloseableDispatcher0.m(imageWriterWrapper);
                    }
                    Surface inputSurface = this.session.getInputSurface();
                    if (inputSurface != null) {
                        inputSurface.release();
                    }
                    camera2CaptureSequence = this.lastSingleRepeatingRequestSequence;
                }
            }
            if (this.awaitRepeatingRequestOnDisconnect && camera2CaptureSequence != null) {
                awaitRepeatingRequestStarted(camera2CaptureSequence);
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.camera.camera2.pipe.CaptureSequenceProcessor
    public Object shutdown(h.c.e<? super ab> eVar) {
        disconnect$camera_camera2_pipe();
        return ab.f48028a;
    }

    @Override // androidx.camera.camera2.pipe.CaptureSequenceProcessor
    public void stopRepeating() {
        synchronized (this.lock) {
            if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                android.util.Log.d(Log.TAG, this + "#stopRepeating");
            }
            this.session.stopRepeating();
        }
    }

    @Override // androidx.camera.camera2.pipe.CaptureSequenceProcessor
    public Integer submit(Camera2CaptureSequence camera2CaptureSequence) {
        Integer repeatingBurst;
        x.f(camera2CaptureSequence, "captureSequence");
        synchronized (this.lock) {
            if (this.disconnected) {
                if (Log.INSTANCE.getWARN_LOGGABLE()) {
                    android.util.Log.w(Log.TAG, this + " disconnected. " + camera2CaptureSequence + " won't be submitted");
                }
                return null;
            }
            Camera2CaptureSequence camera2CaptureSequence2 = camera2CaptureSequence;
            if (camera2CaptureSequence.getCaptureRequestList().size() != 1 || (this.session instanceof CameraConstrainedHighSpeedCaptureSessionWrapper)) {
                boolean repeating = camera2CaptureSequence.getRepeating();
                CameraCaptureSessionWrapper cameraCaptureSessionWrapper = this.session;
                repeatingBurst = repeating ? cameraCaptureSessionWrapper.setRepeatingBurst(camera2CaptureSequence.getCaptureRequestList(), camera2CaptureSequence2) : cameraCaptureSessionWrapper.captureBurst(camera2CaptureSequence.getCaptureRequestList(), camera2CaptureSequence2);
            } else if (camera2CaptureSequence.getRepeating()) {
                if (this.awaitRepeatingRequestOnDisconnect) {
                    this.lastSingleRepeatingRequestSequence = camera2CaptureSequence;
                }
                repeatingBurst = this.session.setRepeatingRequest(camera2CaptureSequence.getCaptureRequestList().get(0), camera2CaptureSequence2);
            } else {
                repeatingBurst = this.session.capture(camera2CaptureSequence.getCaptureRequestList().get(0), camera2CaptureSequence2);
            }
            return repeatingBurst;
        }
    }

    public String toString() {
        return "Camera2CaptureSequenceProcessor-" + this.debugId;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    @Override // androidx.camera.camera2.pipe.CaptureSequenceProcessor
    public /* bridge */ /* synthetic */ CaptureSequence build(boolean z, List list, Map map, Map map2, Map map3, CaptureSequence.CaptureSequenceListener captureSequenceListener, List list2) {
        return build(z, (List<Request>) list, (Map<?, ? extends Object>) map, (Map<?, ? extends Object>) map2, (Map<?, ? extends Object>) map3, captureSequenceListener, (List<? extends Request.Listener>) list2);
    }

    public /* synthetic */ Camera2CaptureSequenceProcessor(CameraCaptureSessionWrapper cameraCaptureSessionWrapper, Threads threads, int i2, Map map, Map map2, StreamGraph streamGraph, StrictMode strictMode, boolean z, o oVar) {
        this(cameraCaptureSessionWrapper, threads, i2, map, map2, streamGraph, strictMode, z);
    }

    public /* synthetic */ Camera2CaptureSequenceProcessor(CameraCaptureSessionWrapper cameraCaptureSessionWrapper, Threads threads, int i2, Map map, Map map2, StreamGraph streamGraph, StrictMode strictMode, boolean z, int i3, o oVar) {
        this(cameraCaptureSessionWrapper, threads, i2, map, map2, streamGraph, strictMode, ((i3 & 128) == 0) & z, null);
    }
}
