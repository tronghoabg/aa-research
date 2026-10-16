package androidx.camera.camera2.pipe;

import h.g.a.l;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.b.bq;
import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface FrameBuffer extends AutoCloseable {

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.FrameBuffer$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ List peekAllReferences$default(FrameBuffer frameBuffer, l lVar, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: peekAllReferences");
            }
            if (1 == (i2 & 1)) {
                lVar = null;
            }
            return frameBuffer.peekAllReferences(lVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FrameReference peekFirstReference$default(FrameBuffer frameBuffer, l lVar, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: peekFirstReference");
            }
            if (1 == (i2 & 1)) {
                lVar = null;
            }
            return frameBuffer.peekFirstReference(lVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FrameReference peekLastReference$default(FrameBuffer frameBuffer, l lVar, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: peekLastReference");
            }
            if (1 == (i2 & 1)) {
                lVar = null;
            }
            return frameBuffer.peekLastReference(lVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ boolean releaseAll$default(FrameBuffer frameBuffer, l lVar, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: releaseAll");
            }
            if (1 == (i2 & 1)) {
                lVar = null;
            }
            return frameBuffer.releaseAll(lVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ boolean releaseFirst$default(FrameBuffer frameBuffer, l lVar, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: releaseFirst");
            }
            if (1 == (i2 & 1)) {
                lVar = null;
            }
            return frameBuffer.releaseFirst(lVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ boolean releaseLast$default(FrameBuffer frameBuffer, l lVar, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: releaseLast");
            }
            if (1 == (i2 & 1)) {
                lVar = null;
            }
            return frameBuffer.releaseLast(lVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ List removeAll$default(FrameBuffer frameBuffer, l lVar, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removeAll");
            }
            if (1 == (i2 & 1)) {
                lVar = null;
            }
            return frameBuffer.removeAll(lVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Frame removeFirst$default(FrameBuffer frameBuffer, l lVar, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removeFirst");
            }
            if (1 == (i2 & 1)) {
                lVar = null;
            }
            return frameBuffer.removeFirst(lVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Frame removeLast$default(FrameBuffer frameBuffer, l lVar, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removeLast");
            }
            if (1 == (i2 & 1)) {
                lVar = null;
            }
            return frameBuffer.removeLast(lVar);
        }
    }

    @Override // java.lang.AutoCloseable
    void close();

    int getCapacity();

    bq<FrameReference> getFrameFlow();

    Map<Object, Object> getParameters();

    ch<Integer> getSize();

    Set<StreamId> getStreams();

    List<FrameReference> peekAllReferences(l<? super FrameReference, Boolean> lVar);

    FrameReference peekFirstReference(l<? super FrameReference, Boolean> lVar);

    FrameReference peekLastReference(l<? super FrameReference, Boolean> lVar);

    boolean release(FrameReference frameReference);

    boolean releaseAll(l<? super FrameReference, Boolean> lVar);

    boolean releaseFirst(l<? super FrameReference, Boolean> lVar);

    boolean releaseLast(l<? super FrameReference, Boolean> lVar);

    List<Frame> removeAll(l<? super FrameReference, Boolean> lVar);

    Frame removeFirst(l<? super FrameReference, Boolean> lVar);

    Frame removeLast(l<? super FrameReference, Boolean> lVar);

    void setCapacity(int i2);
}
