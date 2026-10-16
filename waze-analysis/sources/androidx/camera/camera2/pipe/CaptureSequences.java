package androidx.camera.camera2.pipe;

import android.os.Trace;
import androidx.camera.camera2.pipe.Request;
import h.g.a.l;
import h.g.a.q;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class CaptureSequences {
    public static final CaptureSequences INSTANCE = new CaptureSequences();

    private CaptureSequences() {
    }

    public final <T> void invokeOnRequest(CaptureSequence<? extends T> captureSequence, RequestMetadata requestMetadata, l<? super Request.Listener, ? extends Object> lVar) {
        x.f(captureSequence, "<this>");
        x.f(requestMetadata, "request");
        x.f(lVar, "fn");
        Trace.beginSection("InvokeInternalListeners");
        int size = captureSequence.getListeners().size();
        for (int i2 = 0; i2 < size; i2++) {
            lVar.invoke(captureSequence.getListeners().get(i2));
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size2 = requestMetadata.getRequest().getListeners().size();
        for (int i3 = 0; i3 < size2; i3++) {
            lVar.invoke(requestMetadata.getRequest().getListeners().get(i3));
        }
        Trace.endSection();
    }

    public final <T> void invokeOnRequests(CaptureSequence<? extends T> captureSequence, q<? super RequestMetadata, ? super Integer, ? super Request.Listener, ? extends Object> qVar) {
        x.f(captureSequence, "<this>");
        x.f(qVar, "fn");
        Trace.beginSection("InvokeInternalListeners");
        int size = captureSequence.getCaptureMetadataList().size();
        for (int i2 = 0; i2 < size; i2++) {
            RequestMetadata requestMetadata = captureSequence.getCaptureMetadataList().get(i2);
            int size2 = captureSequence.getListeners().size();
            for (int i3 = 0; i3 < size2; i3++) {
                qVar.invoke(requestMetadata, Integer.valueOf(i2), captureSequence.getListeners().get(i3));
            }
        }
        Trace.endSection();
        Trace.beginSection("InvokeRequestListeners");
        int size3 = captureSequence.getCaptureMetadataList().size();
        for (int i4 = 0; i4 < size3; i4++) {
            RequestMetadata requestMetadata2 = captureSequence.getCaptureMetadataList().get(i4);
            int size4 = requestMetadata2.getRequest().getListeners().size();
            for (int i5 = 0; i5 < size4; i5++) {
                qVar.invoke(requestMetadata2, Integer.valueOf(i4), requestMetadata2.getRequest().getListeners().get(i5));
            }
        }
        Trace.endSection();
    }
}
