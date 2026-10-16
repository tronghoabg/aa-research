package androidx.camera.camera2.pipe;

import androidx.camera.camera2.pipe.CameraStream;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface InputStream {
    /* renamed from: getFormat-8FPWQzE, reason: not valid java name */
    int mo707getFormat8FPWQzE();

    /* renamed from: getId-m1bwn9M, reason: not valid java name */
    int mo708getIdm1bwn9M();

    int getMaxImages();

    /* compiled from: WazeSource */
    public final class Config {
        private final int maxImages;
        private final CameraStream.Config stream;
        private int streamFormat;

        private Config(CameraStream.Config config, int i2, int i3) {
            x.f(config, "stream");
            this.stream = config;
            this.maxImages = i2;
            this.streamFormat = i3;
        }

        public final int getMaxImages() {
            return this.maxImages;
        }

        public final CameraStream.Config getStream() {
            return this.stream;
        }

        /* renamed from: getStreamFormat-8FPWQzE, reason: not valid java name */
        public final int m709getStreamFormat8FPWQzE() {
            return this.streamFormat;
        }

        /* renamed from: setStreamFormat-hNQ4ISI, reason: not valid java name */
        public final void m710setStreamFormathNQ4ISI(int i2) {
            this.streamFormat = i2;
        }

        public /* synthetic */ Config(CameraStream.Config config, int i2, int i3, o oVar) {
            this(config, i2, i3);
        }
    }
}
