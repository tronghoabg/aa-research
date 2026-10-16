package androidx.camera.camera2.pipe;

import h.g.b.x;
import h.j;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface FrameReference {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: WazeSource */
    /* renamed from: androidx.camera.camera2.pipe.FrameReference$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        /* renamed from: $default$imageStatus-BWjvHWQ, reason: not valid java name */
        public static int m703$default$imageStatusBWjvHWQ(FrameReference frameReference, int i2) {
            throw new j("An operation is not implemented: Not yet implemented");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Frame tryAcquire$default(FrameReference frameReference, Set set, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryAcquire");
            }
            if (1 == (i2 & 1)) {
                set = null;
            }
            return frameReference.tryAcquire(set);
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Frame acquire$default(Companion companion, FrameReference frameReference, Set set, int i2, Object obj) {
            if (1 == (i2 & 1)) {
                set = null;
            }
            return companion.acquire(frameReference, set);
        }

        public final Frame acquire(FrameReference frameReference, Set<StreamId> set) {
            x.f(frameReference, "<this>");
            Frame frameTryAcquire = frameReference.tryAcquire(set);
            if (frameTryAcquire != null) {
                return frameTryAcquire;
            }
            throw new IllegalStateException("Failed to acquire a strong reference to " + frameReference + "!");
        }
    }

    /* compiled from: WazeSource */
    public final class DefaultImpls {
        @Deprecated
        /* renamed from: imageStatus-BWjvHWQ, reason: not valid java name */
        public static int m705imageStatusBWjvHWQ(FrameReference frameReference, int i2) {
            return CC.m703$default$imageStatusBWjvHWQ(frameReference, i2);
        }
    }

    /* renamed from: getFrameId-OMxQvVY, reason: not valid java name */
    long mo697getFrameIdOMxQvVY();

    /* renamed from: getFrameInfoStatus-U7r42EA, reason: not valid java name */
    int mo698getFrameInfoStatusU7r42EA();

    /* renamed from: getFrameNumber-Ugla2oM, reason: not valid java name */
    long mo699getFrameNumberUgla2oM();

    /* renamed from: getFrameTimestamp-LS1Wq50, reason: not valid java name */
    long mo700getFrameTimestampLS1Wq50();

    Set<StreamId> getImageStreams();

    RequestMetadata getRequestMetadata();

    /* renamed from: imageStatus-BWjvHWQ, reason: not valid java name */
    int mo701imageStatusBWjvHWQ(int i2);

    /* renamed from: imageStatus-Oo2lJfM, reason: not valid java name */
    int mo702imageStatusOo2lJfM(int i2);

    Frame tryAcquire(Set<StreamId> set);
}
