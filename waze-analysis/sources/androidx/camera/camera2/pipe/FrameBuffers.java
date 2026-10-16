package androidx.camera.camera2.pipe;

import androidx.camera.camera2.pipe.FrameReference;
import h.g.a.l;
import h.g.b.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class FrameBuffers {
    public static final FrameBuffers INSTANCE = new FrameBuffers();

    private FrameBuffers() {
    }

    public static final List<Frame> tryPeekAll(FrameBuffer frameBuffer, l<? super FrameReference, Boolean> lVar) {
        x.f(frameBuffer, "<this>");
        List<FrameReference> listPeekAllReferences = frameBuffer.peekAllReferences(lVar);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listPeekAllReferences.iterator();
        while (it.hasNext()) {
            Frame frameTryAcquire$default = FrameReference.CC.tryAcquire$default((FrameReference) it.next(), null, 1, null);
            if (frameTryAcquire$default != null) {
                arrayList.add(frameTryAcquire$default);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ List tryPeekAll$default(FrameBuffer frameBuffer, l lVar, int i2, Object obj) {
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        return tryPeekAll(frameBuffer, lVar);
    }

    public static final Frame tryPeekFirst(FrameBuffer frameBuffer, l<? super FrameReference, Boolean> lVar) {
        x.f(frameBuffer, "<this>");
        FrameReference frameReferencePeekFirstReference = frameBuffer.peekFirstReference(lVar);
        if (frameReferencePeekFirstReference != null) {
            return FrameReference.CC.tryAcquire$default(frameReferencePeekFirstReference, null, 1, null);
        }
        return null;
    }

    public static /* synthetic */ Frame tryPeekFirst$default(FrameBuffer frameBuffer, l lVar, int i2, Object obj) {
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        return tryPeekFirst(frameBuffer, lVar);
    }

    public static final Frame tryPeekLast(FrameBuffer frameBuffer, l<? super FrameReference, Boolean> lVar) {
        x.f(frameBuffer, "<this>");
        FrameReference frameReferencePeekLastReference = frameBuffer.peekLastReference(lVar);
        if (frameReferencePeekLastReference != null) {
            return FrameReference.CC.tryAcquire$default(frameReferencePeekLastReference, null, 1, null);
        }
        return null;
    }

    public static /* synthetic */ Frame tryPeekLast$default(FrameBuffer frameBuffer, l lVar, int i2, Object obj) {
        if (1 == (i2 & 1)) {
            lVar = null;
        }
        return tryPeekLast(frameBuffer, lVar);
    }

    public static final Frame tryPeekFirst(FrameBuffer frameBuffer) {
        x.f(frameBuffer, "<this>");
        return tryPeekFirst$default(frameBuffer, null, 1, null);
    }

    public static final Frame tryPeekLast(FrameBuffer frameBuffer) {
        x.f(frameBuffer, "<this>");
        return tryPeekLast$default(frameBuffer, null, 1, null);
    }

    public static final List<Frame> tryPeekAll(FrameBuffer frameBuffer) {
        x.f(frameBuffer, "<this>");
        return tryPeekAll$default(frameBuffer, null, 1, null);
    }
}
