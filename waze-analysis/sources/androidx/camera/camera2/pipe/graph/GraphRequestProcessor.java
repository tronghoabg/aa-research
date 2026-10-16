package androidx.camera.camera2.pipe.graph;

import android.hardware.camera2.CameraAccessException;
import android.os.Trace;
import androidx.camera.camera2.pipe.CaptureSequence;
import androidx.camera.camera2.pipe.CaptureSequenceProcessor;
import androidx.camera.camera2.pipe.InputRequest;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.camera2.pipe.compat.ObjectUnavailableException;
import androidx.camera.camera2.pipe.core.Log;
import androidx.camera.camera2.pipe.media.ImageWrapper;
import h.a.i;
import h.ab;
import h.c.e;
import h.e.b;
import h.g.b.o;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class GraphRequestProcessor {
    public static final Companion Companion = new Companion(null);
    private final GraphRequestProcessor$activeBurstListener$1 activeBurstListener;
    private final List<CaptureSequence<?>> activeCaptureSequences;
    private final CaptureSequenceProcessor<Object, CaptureSequence<Object>> captureSequenceProcessor;
    private final kotlinx.a.a closed;
    private final int debugId;

    /* JADX WARN: Type inference failed for: r1v7, types: [androidx.camera.camera2.pipe.graph.GraphRequestProcessor$activeBurstListener$1] */
    private GraphRequestProcessor(CaptureSequenceProcessor<? extends Object, CaptureSequence<Object>> captureSequenceProcessor) {
        this.captureSequenceProcessor = captureSequenceProcessor;
        this.debugId = GraphRequestProcessorKt.getGraphRequestProcessorIds().e();
        this.closed = b.e(false);
        this.activeCaptureSequences = new ArrayList();
        this.activeBurstListener = new CaptureSequence.CaptureSequenceListener() { // from class: androidx.camera.camera2.pipe.graph.GraphRequestProcessor$activeBurstListener$1
            @Override // androidx.camera.camera2.pipe.CaptureSequence.CaptureSequenceListener
            public void onCaptureSequenceComplete(CaptureSequence<?> captureSequence) {
                x.f(captureSequence, "captureSequence");
                if (captureSequence.getRepeating()) {
                    return;
                }
                GraphRequestProcessor graphRequestProcessor = this.this$0;
                synchronized (graphRequestProcessor.activeCaptureSequences) {
                    graphRequestProcessor.activeCaptureSequences.remove(captureSequence);
                }
            }
        };
    }

    private final <T> void invokeOnAborted(CaptureSequence<? extends T> captureSequence) {
        Trace.beginSection("InvokeInternalListeners");
        int size = captureSequence.getCaptureMetadataList().size();
        for (int i2 = 0; i2 < size; i2++) {
            RequestMetadata requestMetadata = captureSequence.getCaptureMetadataList().get(i2);
            int size2 = captureSequence.getListeners().size();
            for (int i3 = 0; i3 < size2; i3++) {
                captureSequence.getListeners().get(i3).onAborted(requestMetadata.getRequest());
            }
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size3 = captureSequence.getCaptureMetadataList().size();
        for (int i4 = 0; i4 < size3; i4++) {
            RequestMetadata requestMetadata2 = captureSequence.getCaptureMetadataList().get(i4);
            int size4 = requestMetadata2.getRequest().getListeners().size();
            for (int i5 = 0; i5 < size4; i5++) {
                requestMetadata2.getRequest().getListeners().get(i5).onAborted(requestMetadata2.getRequest());
            }
        }
        Trace.endSection();
    }

    private final <T> void invokeOnRequestSequenceCreated(CaptureSequence<? extends T> captureSequence) {
        Trace.beginSection("InvokeInternalListeners");
        int size = captureSequence.getCaptureMetadataList().size();
        for (int i2 = 0; i2 < size; i2++) {
            RequestMetadata requestMetadata = captureSequence.getCaptureMetadataList().get(i2);
            int size2 = captureSequence.getListeners().size();
            for (int i3 = 0; i3 < size2; i3++) {
                captureSequence.getListeners().get(i3).onRequestSequenceCreated(requestMetadata);
            }
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size3 = captureSequence.getCaptureMetadataList().size();
        for (int i4 = 0; i4 < size3; i4++) {
            RequestMetadata requestMetadata2 = captureSequence.getCaptureMetadataList().get(i4);
            int size4 = requestMetadata2.getRequest().getListeners().size();
            for (int i5 = 0; i5 < size4; i5++) {
                requestMetadata2.getRequest().getListeners().get(i5).onRequestSequenceCreated(requestMetadata2);
            }
        }
        Trace.endSection();
    }

    private final <T> void invokeOnRequestSequenceSubmitted(CaptureSequence<? extends T> captureSequence) {
        Trace.beginSection("InvokeInternalListeners");
        int size = captureSequence.getCaptureMetadataList().size();
        for (int i2 = 0; i2 < size; i2++) {
            RequestMetadata requestMetadata = captureSequence.getCaptureMetadataList().get(i2);
            int size2 = captureSequence.getListeners().size();
            for (int i3 = 0; i3 < size2; i3++) {
                captureSequence.getListeners().get(i3).onRequestSequenceSubmitted(requestMetadata);
            }
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size3 = captureSequence.getCaptureMetadataList().size();
        for (int i4 = 0; i4 < size3; i4++) {
            RequestMetadata requestMetadata2 = captureSequence.getCaptureMetadataList().get(i4);
            int size4 = requestMetadata2.getRequest().getListeners().size();
            for (int i5 = 0; i5 < size4; i5++) {
                requestMetadata2.getRequest().getListeners().get(i5).onRequestSequenceSubmitted(requestMetadata2);
            }
        }
        Trace.endSection();
    }

    public final void abortCaptures$camera_camera2_pipe() {
        List<CaptureSequence> listAo;
        synchronized (this.activeCaptureSequences) {
            listAo = i.ao(this.activeCaptureSequences);
            this.activeCaptureSequences.clear();
        }
        for (CaptureSequence captureSequence : listAo) {
            Trace.beginSection("InvokeInternalListeners");
            int size = captureSequence.getCaptureMetadataList().size();
            for (int i2 = 0; i2 < size; i2++) {
                RequestMetadata requestMetadata = captureSequence.getCaptureMetadataList().get(i2);
                int size2 = captureSequence.getListeners().size();
                for (int i3 = 0; i3 < size2; i3++) {
                    captureSequence.getListeners().get(i3).onAborted(requestMetadata.getRequest());
                }
            }
            Trace.endSection();
            Trace.beginSection("InvokeRequestListeners");
            int size3 = captureSequence.getCaptureMetadataList().size();
            for (int i4 = 0; i4 < size3; i4++) {
                RequestMetadata requestMetadata2 = captureSequence.getCaptureMetadataList().get(i4);
                int size4 = requestMetadata2.getRequest().getListeners().size();
                for (int i5 = 0; i5 < size4; i5++) {
                    requestMetadata2.getRequest().getListeners().get(i5).onAborted(requestMetadata2.getRequest());
                }
            }
            Trace.endSection();
        }
        this.captureSequenceProcessor.abortCaptures();
    }

    public final Object shutdown$camera_camera2_pipe(e<? super ab> eVar) {
        Object objShutdown;
        if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
            toString();
            android.util.Log.d(Log.TAG, "Closing ".concat(toString()));
        }
        return (this.closed.b(false, true) && (objShutdown = this.captureSequenceProcessor.shutdown(eVar)) == h.c.a.a.f48038a) ? objShutdown : ab.f48028a;
    }

    public final void stopRepeating$camera_camera2_pipe() {
        this.captureSequenceProcessor.stopRepeating();
    }

    public final boolean submit$camera_camera2_pipe(boolean z, List<Request> list, Map<?, ? extends Object> map, Map<?, ? extends Object> map2, Map<?, ? extends Object> map3, List<? extends Request.Listener> list2) {
        Throwable th;
        boolean z2;
        ImageWrapper image;
        x.f(list, "requests");
        x.f(map, "defaultParameters");
        x.f(map2, "graphParameters");
        x.f(map3, "requiredParameters");
        x.f(list2, "listeners");
        if (this.closed.c()) {
            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                android.util.Log.w(Log.TAG, "Failed to submit " + list + ": " + this + " is closed.");
            }
            return false;
        }
        try {
            Trace.beginSection("CXCP#buildCaptureSequence");
            CaptureSequence<?> captureSequenceBuild = this.captureSequenceProcessor.build(z, list, map, map2, map3, this.activeBurstListener, list2);
            Trace.endSection();
            boolean z3 = true;
            if (captureSequenceBuild == null) {
                List<Request> list3 = list;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator<T> it = list3.iterator();
                    while (it.hasNext()) {
                        if (((Request) it.next()).getInputRequest() != null) {
                            for (Request request : list) {
                                InputRequest inputRequest = request.getInputRequest();
                                if (inputRequest != null && (image = inputRequest.getImage()) != null) {
                                    GraphRequestProcessor$$ExternalSyntheticAutoCloseableDispatcher0.m(image);
                                }
                                Iterator<Request.Listener> it2 = request.getListeners().iterator();
                                while (it2.hasNext()) {
                                    it2.next().onAborted(request);
                                }
                            }
                            return true;
                        }
                    }
                }
                if (Log.INSTANCE.getWARN_LOGGABLE()) {
                    android.util.Log.w(Log.TAG, "Failed to submit " + list + ": " + this + " failed to build CaptureSequence.");
                }
                return false;
            }
            if (this.closed.c()) {
                if (Log.INSTANCE.getWARN_LOGGABLE()) {
                    android.util.Log.w(Log.TAG, "Failed to submit " + list + ": " + this + " is closed.");
                }
                return false;
            }
            if (!captureSequenceBuild.getRepeating()) {
                synchronized (this.activeCaptureSequences) {
                    this.activeCaptureSequences.add(captureSequenceBuild);
                }
            }
            try {
                if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                    android.util.Log.d(Log.TAG, this + " submitting " + captureSequenceBuild);
                }
                Trace.beginSection("InvokeInternalListeners");
                int size = captureSequenceBuild.getCaptureMetadataList().size();
                for (int i2 = 0; i2 < size; i2++) {
                    RequestMetadata requestMetadata = captureSequenceBuild.getCaptureMetadataList().get(i2);
                    int size2 = captureSequenceBuild.getListeners().size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        captureSequenceBuild.getListeners().get(i3).onRequestSequenceCreated(requestMetadata);
                    }
                }
                Trace.endSection();
                Trace.beginSection("InvokeRequestListeners");
                int size3 = captureSequenceBuild.getCaptureMetadataList().size();
                for (int i4 = 0; i4 < size3; i4++) {
                    RequestMetadata requestMetadata2 = captureSequenceBuild.getCaptureMetadataList().get(i4);
                    int size4 = requestMetadata2.getRequest().getListeners().size();
                    for (int i5 = 0; i5 < size4; i5++) {
                        requestMetadata2.getRequest().getListeners().get(i5).onRequestSequenceCreated(requestMetadata2);
                    }
                }
                synchronized (captureSequenceBuild) {
                    if (this.closed.c()) {
                        if (Log.INSTANCE.getWARN_LOGGABLE()) {
                            android.util.Log.w(Log.TAG, "Failed to submit " + captureSequenceBuild + ": " + this + " is closed.");
                        }
                        if (!captureSequenceBuild.getRepeating()) {
                            List<CaptureSequence<?>> list4 = this.activeCaptureSequences;
                            synchronized (list4) {
                                list4.remove(captureSequenceBuild);
                            }
                            Trace.beginSection("InvokeInternalListeners");
                            int size5 = captureSequenceBuild.getCaptureMetadataList().size();
                            for (int i6 = 0; i6 < size5; i6++) {
                                RequestMetadata requestMetadata3 = captureSequenceBuild.getCaptureMetadataList().get(i6);
                                int size6 = captureSequenceBuild.getListeners().size();
                                for (int i7 = 0; i7 < size6; i7++) {
                                    captureSequenceBuild.getListeners().get(i7).onAborted(requestMetadata3.getRequest());
                                }
                            }
                            Trace.endSection();
                            Trace.beginSection("InvokeRequestListeners");
                            int size7 = captureSequenceBuild.getCaptureMetadataList().size();
                            for (int i8 = 0; i8 < size7; i8++) {
                                RequestMetadata requestMetadata4 = captureSequenceBuild.getCaptureMetadataList().get(i8);
                                int size8 = requestMetadata4.getRequest().getListeners().size();
                                for (int i9 = 0; i9 < size8; i9++) {
                                    requestMetadata4.getRequest().getListeners().get(i9).onAborted(requestMetadata4.getRequest());
                                }
                            }
                        }
                        return false;
                    }
                    try {
                        Trace.beginSection("CXCP#submit(CaptureSequence)");
                        Integer numSubmit = this.captureSequenceProcessor.submit(captureSequenceBuild);
                        int iIntValue = numSubmit != null ? numSubmit.intValue() : -1;
                        captureSequenceBuild.setSequenceNumber(iIntValue);
                        if (iIntValue != -1) {
                            Trace.beginSection("InvokeInternalListeners");
                            int size9 = captureSequenceBuild.getCaptureMetadataList().size();
                            for (int i10 = 0; i10 < size9; i10++) {
                                RequestMetadata requestMetadata5 = captureSequenceBuild.getCaptureMetadataList().get(i10);
                                int size10 = captureSequenceBuild.getListeners().size();
                                for (int i11 = 0; i11 < size10; i11++) {
                                    captureSequenceBuild.getListeners().get(i11).onRequestSequenceSubmitted(requestMetadata5);
                                }
                            }
                            Trace.endSection();
                            Trace.beginSection("InvokeRequestListeners");
                            int size11 = captureSequenceBuild.getCaptureMetadataList().size();
                            for (int i12 = 0; i12 < size11; i12++) {
                                RequestMetadata requestMetadata6 = captureSequenceBuild.getCaptureMetadataList().get(i12);
                                int size12 = requestMetadata6.getRequest().getListeners().size();
                                for (int i13 = 0; i13 < size12; i13++) {
                                    requestMetadata6.getRequest().getListeners().get(i13).onRequestSequenceSubmitted(requestMetadata6);
                                }
                            }
                            try {
                                if (Log.INSTANCE.getDEBUG_LOGGABLE()) {
                                    android.util.Log.d(Log.TAG, this + " submitted " + captureSequenceBuild);
                                }
                                z2 = true;
                            } catch (CameraAccessException | ObjectUnavailableException unused) {
                                return false;
                            } catch (Throwable th2) {
                                th = th2;
                                if (z3 || captureSequenceBuild.getRepeating()) {
                                    throw th;
                                }
                                synchronized (this.activeCaptureSequences) {
                                    this.activeCaptureSequences.remove(captureSequenceBuild);
                                }
                                Trace.beginSection("InvokeInternalListeners");
                                int size13 = captureSequenceBuild.getCaptureMetadataList().size();
                                for (int i14 = 0; i14 < size13; i14++) {
                                    RequestMetadata requestMetadata7 = captureSequenceBuild.getCaptureMetadataList().get(i14);
                                    int size14 = captureSequenceBuild.getListeners().size();
                                    for (int i15 = 0; i15 < size14; i15++) {
                                        captureSequenceBuild.getListeners().get(i15).onAborted(requestMetadata7.getRequest());
                                    }
                                }
                                Trace.endSection();
                                Trace.beginSection("InvokeRequestListeners");
                                int size15 = captureSequenceBuild.getCaptureMetadataList().size();
                                for (int i16 = 0; i16 < size15; i16++) {
                                    RequestMetadata requestMetadata8 = captureSequenceBuild.getCaptureMetadataList().get(i16);
                                    int size16 = requestMetadata8.getRequest().getListeners().size();
                                    for (int i17 = 0; i17 < size16; i17++) {
                                        requestMetadata8.getRequest().getListeners().get(i17).onAborted(requestMetadata8.getRequest());
                                    }
                                }
                                throw th;
                            }
                        } else {
                            if (Log.INSTANCE.getWARN_LOGGABLE()) {
                                android.util.Log.w(Log.TAG, "Failed to submit " + captureSequenceBuild + ": " + this + " received -1 from submit.");
                            }
                            z2 = false;
                            z3 = false;
                        }
                        if (z3 || captureSequenceBuild.getRepeating()) {
                            return z2;
                        }
                        synchronized (this.activeCaptureSequences) {
                            this.activeCaptureSequences.remove(captureSequenceBuild);
                        }
                        Trace.beginSection("InvokeInternalListeners");
                        int size17 = captureSequenceBuild.getCaptureMetadataList().size();
                        for (int i18 = 0; i18 < size17; i18++) {
                            RequestMetadata requestMetadata9 = captureSequenceBuild.getCaptureMetadataList().get(i18);
                            int size18 = captureSequenceBuild.getListeners().size();
                            for (int i19 = 0; i19 < size18; i19++) {
                                captureSequenceBuild.getListeners().get(i19).onAborted(requestMetadata9.getRequest());
                            }
                        }
                        Trace.endSection();
                        Trace.beginSection("InvokeRequestListeners");
                        int size19 = captureSequenceBuild.getCaptureMetadataList().size();
                        for (int i20 = 0; i20 < size19; i20++) {
                            RequestMetadata requestMetadata10 = captureSequenceBuild.getCaptureMetadataList().get(i20);
                            int size20 = requestMetadata10.getRequest().getListeners().size();
                            for (int i21 = 0; i21 < size20; i21++) {
                                requestMetadata10.getRequest().getListeners().get(i21).onAborted(requestMetadata10.getRequest());
                            }
                        }
                        return z2;
                    } finally {
                    }
                }
            } catch (CameraAccessException unused2) {
                if (!captureSequenceBuild.getRepeating()) {
                    synchronized (this.activeCaptureSequences) {
                        this.activeCaptureSequences.remove(captureSequenceBuild);
                        Trace.beginSection("InvokeInternalListeners");
                        int size21 = captureSequenceBuild.getCaptureMetadataList().size();
                        for (int i22 = 0; i22 < size21; i22++) {
                            RequestMetadata requestMetadata11 = captureSequenceBuild.getCaptureMetadataList().get(i22);
                            int size22 = captureSequenceBuild.getListeners().size();
                            for (int i23 = 0; i23 < size22; i23++) {
                                captureSequenceBuild.getListeners().get(i23).onAborted(requestMetadata11.getRequest());
                            }
                        }
                        Trace.endSection();
                        Trace.beginSection("InvokeRequestListeners");
                        int size23 = captureSequenceBuild.getCaptureMetadataList().size();
                        for (int i24 = 0; i24 < size23; i24++) {
                            RequestMetadata requestMetadata12 = captureSequenceBuild.getCaptureMetadataList().get(i24);
                            int size24 = requestMetadata12.getRequest().getListeners().size();
                            for (int i25 = 0; i25 < size24; i25++) {
                                requestMetadata12.getRequest().getListeners().get(i25).onAborted(requestMetadata12.getRequest());
                            }
                        }
                    }
                }
            } catch (ObjectUnavailableException unused3) {
                if (!captureSequenceBuild.getRepeating()) {
                    synchronized (this.activeCaptureSequences) {
                        this.activeCaptureSequences.remove(captureSequenceBuild);
                        Trace.beginSection("InvokeInternalListeners");
                        int size25 = captureSequenceBuild.getCaptureMetadataList().size();
                        for (int i26 = 0; i26 < size25; i26++) {
                            RequestMetadata requestMetadata13 = captureSequenceBuild.getCaptureMetadataList().get(i26);
                            int size26 = captureSequenceBuild.getListeners().size();
                            for (int i27 = 0; i27 < size26; i27++) {
                                captureSequenceBuild.getListeners().get(i27).onAborted(requestMetadata13.getRequest());
                            }
                        }
                        Trace.endSection();
                        Trace.beginSection("InvokeRequestListeners");
                        int size27 = captureSequenceBuild.getCaptureMetadataList().size();
                        for (int i28 = 0; i28 < size27; i28++) {
                            RequestMetadata requestMetadata14 = captureSequenceBuild.getCaptureMetadataList().get(i28);
                            int size28 = requestMetadata14.getRequest().getListeners().size();
                            for (int i29 = 0; i29 < size28; i29++) {
                                requestMetadata14.getRequest().getListeners().get(i29).onAborted(requestMetadata14.getRequest());
                            }
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                z3 = false;
            }
        } finally {
            Trace.endSection();
        }
    }

    public String toString() {
        return "GraphRequestProcessor-" + this.debugId;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final GraphRequestProcessor from(CaptureSequenceProcessor<?, ?> captureSequenceProcessor) {
            x.f(captureSequenceProcessor, "captureSequenceProcessor");
            return new GraphRequestProcessor(captureSequenceProcessor, null);
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ GraphRequestProcessor(CaptureSequenceProcessor captureSequenceProcessor, o oVar) {
        this(captureSequenceProcessor);
    }
}
