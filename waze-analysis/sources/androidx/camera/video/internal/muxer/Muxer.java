package androidx.camera.video.internal.muxer;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.ParcelFileDescriptor;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface Muxer {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int MUXER_FORMAT_3GPP = 2;
    public static final int MUXER_FORMAT_MPEG_4 = 0;
    public static final int MUXER_FORMAT_WEBM = 1;

    /* compiled from: WazeSource */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int MUXER_FORMAT_3GPP = 2;
        public static final int MUXER_FORMAT_MPEG_4 = 0;
        public static final int MUXER_FORMAT_WEBM = 1;

        private Companion() {
        }
    }

    /* compiled from: WazeSource */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Format {
    }

    int addTrack(MediaFormat mediaFormat);

    boolean isInterruptionResilient();

    void release();

    void setCaptureFps(int i2);

    void setLocation(double d2, double d3);

    void setOrientationDegrees(int i2);

    void setOutput(ParcelFileDescriptor parcelFileDescriptor, int i2);

    void setOutput(String str, int i2);

    void start();

    void stop();

    void writeSampleData(int i2, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo);
}
