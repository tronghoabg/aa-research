package androidx.camera.camera2.adapter;

import android.hardware.camera2.CaptureRequest;
import android.view.Surface;
import androidx.camera.camera2.pipe.FrameInfo;
import androidx.camera.camera2.pipe.FrameMetadata;
import androidx.camera.camera2.pipe.Metadata;
import androidx.camera.camera2.pipe.Request;
import androidx.camera.camera2.pipe.RequestMetadata;
import androidx.camera.camera2.pipe.StreamId;
import androidx.camera.camera2.pipe.UnsafeWrapper;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.savedstate.serialization.ClassDiscriminatorModeKt;
import h.a.i;
import h.a.r;
import h.g.b.x;
import h.l.c;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class FrameMetadataConverter {
    public static final FrameMetadataConverter INSTANCE = new FrameMetadataConverter();
    private static final FrameMetadataConverter$emptyRequestMetadata$1 emptyRequestMetadata = new RequestMetadata() { // from class: androidx.camera.camera2.adapter.FrameMetadataConverter$emptyRequestMetadata$1
        private final int template = 0;
        private final Map<StreamId, Surface> streams = r.j();
        private final boolean repeating = true;
        private final Request request = new Request(i.h(), null, null, null, null, null, 62, null);
        private final long requestNumber = 0;

        @Override // androidx.camera.camera2.pipe.RequestMetadata
        public <T> T get(CaptureRequest.Key<T> key) {
            x.f(key, "key");
            return null;
        }

        @Override // androidx.camera.camera2.pipe.RequestMetadata
        public <T> T getOrDefault(CaptureRequest.Key<T> key, T t) {
            x.f(key, "key");
            return t;
        }

        @Override // androidx.camera.camera2.pipe.RequestMetadata
        public boolean getRepeating() {
            return this.repeating;
        }

        @Override // androidx.camera.camera2.pipe.RequestMetadata
        public Request getRequest() {
            return this.request;
        }

        @Override // androidx.camera.camera2.pipe.RequestMetadata
        /* renamed from: getRequestNumber-my6kx4g, reason: not valid java name */
        public long mo198getRequestNumbermy6kx4g() {
            return this.requestNumber;
        }

        @Override // androidx.camera.camera2.pipe.RequestMetadata
        public Map<StreamId, Surface> getStreams() {
            return this.streams;
        }

        @Override // androidx.camera.camera2.pipe.RequestMetadata
        /* renamed from: getTemplate-fGx8uWA, reason: not valid java name */
        public int mo199getTemplatefGx8uWA() {
            return this.template;
        }

        @Override // androidx.camera.camera2.pipe.UnsafeWrapper, androidx.camera.common.UnsafeWrapper
        public <T> T unwrapAs(Class<T> cls) {
            x.f(cls, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
            return null;
        }

        @Override // androidx.camera.camera2.pipe.Metadata
        public <T> T getOrDefault(Metadata.Key<T> key, T t) {
            x.f(key, "key");
            return t;
        }

        @Override // androidx.camera.camera2.pipe.Metadata
        public <T> T get(Metadata.Key<T> key) {
            x.f(key, "key");
            return null;
        }

        @Override // androidx.camera.camera2.pipe.UnsafeWrapper
        public /* synthetic */ Object unwrapAs(c cVar) {
            return UnsafeWrapper.CC.$default$unwrapAs(this, cVar);
        }
    };

    private FrameMetadataConverter() {
    }

    public final CameraCaptureResult toCameraCaptureResult(final FrameMetadata frameMetadata) {
        x.f(frameMetadata, "<this>");
        return new CaptureResultAdapter(emptyRequestMetadata, frameMetadata.mo689getFrameNumberUgla2oM(), new FrameInfo(frameMetadata) { // from class: androidx.camera.camera2.adapter.FrameMetadataConverter$toCameraCaptureResult$frameInfo$1
            private final String camera;
            private final FrameMetadata frameMetadata;
            private final long frameNumber;
            private final FrameMetadata metadata;
            private final RequestMetadata requestMetadata = FrameMetadataConverter.emptyRequestMetadata;

            {
                this.frameMetadata = frameMetadata;
                this.metadata = frameMetadata;
                this.camera = frameMetadata.mo688getCameraDz_R5H8();
                this.frameNumber = frameMetadata.mo689getFrameNumberUgla2oM();
            }

            @Override // androidx.camera.camera2.pipe.FrameInfo
            /* renamed from: get-EfqyGwQ, reason: not valid java name */
            public FrameMetadata mo200getEfqyGwQ(String str) {
                x.f(str, "camera");
                return this.frameMetadata;
            }

            @Override // androidx.camera.camera2.pipe.FrameInfo
            /* renamed from: getCamera-Dz_R5H8, reason: not valid java name */
            public String mo201getCameraDz_R5H8() {
                return this.camera;
            }

            @Override // androidx.camera.camera2.pipe.FrameInfo
            /* renamed from: getFrameNumber-Ugla2oM, reason: not valid java name */
            public long mo202getFrameNumberUgla2oM() {
                return this.frameNumber;
            }

            @Override // androidx.camera.camera2.pipe.FrameInfo
            public FrameMetadata getMetadata() {
                return this.metadata;
            }

            @Override // androidx.camera.camera2.pipe.FrameInfo
            public RequestMetadata getRequestMetadata() {
                return this.requestMetadata;
            }

            @Override // androidx.camera.camera2.pipe.UnsafeWrapper, androidx.camera.common.UnsafeWrapper
            public <T> T unwrapAs(Class<T> cls) {
                x.f(cls, ClassDiscriminatorModeKt.CLASS_DISCRIMINATOR_KEY);
                return null;
            }

            @Override // androidx.camera.camera2.pipe.UnsafeWrapper
            public /* synthetic */ Object unwrapAs(c cVar) {
                return UnsafeWrapper.CC.$default$unwrapAs(this, cVar);
            }
        }, null);
    }
}
