package androidx.camera.video.internal.muxer;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import androidx.camera.video.internal.utils.MediaFormatExt;
import androidx.media3.muxer.MediaMuxerCompat;
import e.b.c;
import h.ab;
import h.d.a;
import h.d.b;
import h.g.b.x;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class Media3MuxerImpl implements Muxer {
    private int captureFps;
    private MediaMuxerCompat mediaMuxerCompat;
    private State state = State.IDLE;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: WazeSource */
    final class State {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State IDLE = new State("IDLE", 0);
        public static final State CONFIGURED = new State("CONFIGURED", 1);
        public static final State STARTED = new State("STARTED", 2);
        public static final State STOPPED = new State("STOPPED", 3);
        public static final State RELEASED = new State("RELEASED", 4);

        private static final /* synthetic */ State[] $values() {
            return new State[]{IDLE, CONFIGURED, STARTED, STOPPED, RELEASED};
        }

        static {
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = b.a(stateArr$values);
        }

        private State(String str, int i2) {
        }

        public static a<State> getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    static final int addTrack$lambda$1(Media3MuxerImpl media3MuxerImpl, MediaFormat mediaFormat) {
        MediaMuxerCompat mediaMuxerCompat = media3MuxerImpl.mediaMuxerCompat;
        x.c(mediaMuxerCompat);
        return mediaMuxerCompat.addTrack(mediaFormat);
    }

    static final ab start$lambda$1(Media3MuxerImpl media3MuxerImpl) {
        MediaMuxerCompat mediaMuxerCompat = media3MuxerImpl.mediaMuxerCompat;
        x.c(mediaMuxerCompat);
        mediaMuxerCompat.start();
        return ab.f48028a;
    }

    static final ab stop$lambda$1(Media3MuxerImpl media3MuxerImpl) throws ErrnoException {
        MediaMuxerCompat mediaMuxerCompat = media3MuxerImpl.mediaMuxerCompat;
        x.c(mediaMuxerCompat);
        mediaMuxerCompat.stop();
        return ab.f48028a;
    }

    private final int toMediaMuxerCompatFormat(int i2) {
        if (i2 == 0 || i2 == 2) {
            return 0;
        }
        throw new IllegalArgumentException("Unsupported format: " + i2);
    }

    private final <T> T wrapMuxerException(h.g.a.a<? extends T> aVar) throws MuxerException {
        try {
            return aVar.invoke();
        } catch (Exception e2) {
            throw new MuxerException("MediaMuxer operation failed", e2);
        }
    }

    static final ab writeSampleData$lambda$1(Media3MuxerImpl media3MuxerImpl, int i2, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        MediaMuxerCompat mediaMuxerCompat = media3MuxerImpl.mediaMuxerCompat;
        x.c(mediaMuxerCompat);
        mediaMuxerCompat.writeSampleData(i2, byteBuffer, bufferInfo);
        return ab.f48028a;
    }

    @Override // androidx.camera.video.internal.muxer.Muxer
    public int addTrack(final MediaFormat mediaFormat) {
        int i2;
        x.f(mediaFormat, "format");
        if (this.state != State.CONFIGURED) {
            State state = this.state;
            Objects.toString(state);
            throw new IllegalStateException("Muxer is not configured. Current state: ".concat(String.valueOf(state)));
        }
        if (MediaFormatExt.INSTANCE.isVideo(mediaFormat) && (i2 = this.captureFps) > 0) {
            mediaFormat.setInteger("capture-rate", i2);
        }
        return ((Number) wrapMuxerException(new h.g.a.a() { // from class: androidx.camera.video.internal.muxer.Media3MuxerImpl$$ExternalSyntheticLambda0
            @Override // h.g.a.a
            public final Object invoke() {
                return Integer.valueOf(Media3MuxerImpl.addTrack$lambda$1(this.f$0, mediaFormat));
            }
        })).intValue();
    }

    @Override // androidx.camera.video.internal.muxer.Muxer
    public boolean isInterruptionResilient() {
        return true;
    }

    @Override // androidx.camera.video.internal.muxer.Muxer
    public void release() {
        if (this.state != State.RELEASED) {
            try {
                Media3MuxerImpl media3MuxerImpl = this;
                MediaMuxerCompat mediaMuxerCompat = this.mediaMuxerCompat;
                if (mediaMuxerCompat != null) {
                    mediaMuxerCompat.release();
                }
            } catch (Throwable th) {
                c.a(th);
            }
            this.mediaMuxerCompat = null;
            this.state = State.RELEASED;
        }
    }

    @Override // androidx.camera.video.internal.muxer.Muxer
    public void setCaptureFps(int i2) {
        if (this.state != State.CONFIGURED) {
            State state = this.state;
            Objects.toString(state);
            throw new IllegalStateException("Muxer is not configured. Current state: ".concat(String.valueOf(state)));
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("captureFps must be positive");
        }
        this.captureFps = i2;
    }

    @Override // androidx.camera.video.internal.muxer.Muxer
    public void setLocation(double d2, double d3) {
        if (this.state != State.CONFIGURED) {
            State state = this.state;
            Objects.toString(state);
            throw new IllegalStateException("Muxer is not configured. Current state: ".concat(String.valueOf(state)));
        }
        MediaMuxerCompat mediaMuxerCompat = this.mediaMuxerCompat;
        x.c(mediaMuxerCompat);
        mediaMuxerCompat.setLocation((float) d2, (float) d3);
    }

    @Override // androidx.camera.video.internal.muxer.Muxer
    public void setOrientationDegrees(int i2) {
        if (this.state != State.CONFIGURED) {
            State state = this.state;
            Objects.toString(state);
            throw new IllegalStateException("Muxer is not configured. Current state: ".concat(String.valueOf(state)));
        }
        MediaMuxerCompat mediaMuxerCompat = this.mediaMuxerCompat;
        x.c(mediaMuxerCompat);
        mediaMuxerCompat.setOrientationHint(i2);
    }

    @Override // androidx.camera.video.internal.muxer.Muxer
    public void setOutput(ParcelFileDescriptor parcelFileDescriptor, int i2) throws IOException {
        x.f(parcelFileDescriptor, "parcelFileDescriptor");
        if (this.state != State.IDLE) {
            State state = this.state;
            Objects.toString(state);
            throw new IllegalStateException("Muxer is not idle. Current state: ".concat(String.valueOf(state)));
        }
        FileDescriptor fileDescriptor = parcelFileDescriptor.getFileDescriptor();
        toMediaMuxerCompatFormat(i2);
        this.mediaMuxerCompat = new MediaMuxerCompat(fileDescriptor, 0);
        parcelFileDescriptor.close();
        this.state = State.CONFIGURED;
    }

    @Override // androidx.camera.video.internal.muxer.Muxer
    public void start() throws MuxerException {
        if (this.state == State.STARTED) {
            return;
        }
        State state = this.state;
        if (state != State.CONFIGURED) {
            Objects.toString(state);
            throw new IllegalStateException("Muxer is not configured. Current state: ".concat(String.valueOf(state)));
        }
        wrapMuxerException(new h.g.a.a() { // from class: androidx.camera.video.internal.muxer.Media3MuxerImpl$$ExternalSyntheticLambda3
            @Override // h.g.a.a
            public final Object invoke() {
                return Media3MuxerImpl.start$lambda$1(this.f$0);
            }
        });
        this.state = State.STARTED;
    }

    @Override // androidx.camera.video.internal.muxer.Muxer
    public void stop() {
        if (this.state == State.STOPPED) {
            return;
        }
        State state = this.state;
        if (state != State.STARTED) {
            Objects.toString(state);
            throw new IllegalStateException("Muxer is not started. Current state: ".concat(String.valueOf(state)));
        }
        try {
            wrapMuxerException(new h.g.a.a() { // from class: androidx.camera.video.internal.muxer.Media3MuxerImpl$$ExternalSyntheticLambda2
                @Override // h.g.a.a
                public final Object invoke() {
                    return Media3MuxerImpl.stop$lambda$1(this.f$0);
                }
            });
        } finally {
            this.state = State.STOPPED;
        }
    }

    @Override // androidx.camera.video.internal.muxer.Muxer
    public void writeSampleData(final int i2, final ByteBuffer byteBuffer, final MediaCodec.BufferInfo bufferInfo) throws MuxerException {
        x.f(byteBuffer, "byteBuffer");
        x.f(bufferInfo, "bufferInfo");
        if (this.state == State.STARTED) {
            wrapMuxerException(new h.g.a.a() { // from class: androidx.camera.video.internal.muxer.Media3MuxerImpl$$ExternalSyntheticLambda1
                @Override // h.g.a.a
                public final Object invoke() {
                    return Media3MuxerImpl.writeSampleData$lambda$1(this.f$0, i2, byteBuffer, bufferInfo);
                }
            });
        } else {
            State state = this.state;
            Objects.toString(state);
            throw new IllegalStateException("Muxer is not started. Current state: ".concat(String.valueOf(state)));
        }
    }

    @Override // androidx.camera.video.internal.muxer.Muxer
    public void setOutput(String str, int i2) {
        x.f(str, "path");
        if (this.state == State.IDLE) {
            toMediaMuxerCompatFormat(i2);
            this.mediaMuxerCompat = new MediaMuxerCompat(str, 0);
            this.state = State.CONFIGURED;
        } else {
            State state = this.state;
            Objects.toString(state);
            throw new IllegalStateException("Muxer is not idle. Current state: ".concat(String.valueOf(state)));
        }
    }
}
