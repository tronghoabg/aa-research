package androidx.media3.muxer;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.system.ErrnoException;
import android.system.Os;
import androidx.media3.common.util.MediaFormatUtil;
import androidx.media3.common.util.Util;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.container.Mp4LocationData;
import androidx.media3.container.Mp4OrientationData;
import androidx.media3.muxer.Mp4Muxer;
import androidx.media3.muxer.SeekableMuxerOutput;
import com.google.d.b.an;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class MediaMuxerCompat {
    public static final int OUTPUT_FORMAT_MP4 = 0;
    private boolean closedMuxer;
    private final FileDescriptor fileDescriptor;
    private final Muxer muxer;
    private boolean startedMuxer;

    /* compiled from: WazeSource */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface OutputFormat {
    }

    public MediaMuxerCompat(FileDescriptor fileDescriptor, int i2) throws IOException, ErrnoException {
        try {
            FileDescriptor fileDescriptorDup = Os.dup(fileDescriptor);
            this.fileDescriptor = fileDescriptorDup;
            this.muxer = createMuxer(new FileOutputStream(fileDescriptorDup), i2);
        } catch (ErrnoException e2) {
            throw new IOException("Failed to create a copy of FileDescriptor", e2);
        }
    }

    private void closeMuxer() throws ErrnoException {
        try {
            this.muxer.close();
            FileDescriptor fileDescriptor = this.fileDescriptor;
            if (fileDescriptor != null) {
                Os.close(fileDescriptor);
            }
            this.closedMuxer = true;
            this.startedMuxer = false;
        } catch (ErrnoException | MuxerException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static Muxer createMuxer(FileOutputStream fileOutputStream, int i2) {
        an.l(i2 == 0);
        return new Mp4Muxer.Builder(SeekableMuxerOutput.CC.of(fileOutputStream)).build();
    }

    public int addTrack(MediaFormat mediaFormat) {
        an.u(!this.startedMuxer);
        try {
            float floatFromIntOrFloat = MediaFormatUtil.getFloatFromIntOrFloat(mediaFormat, "capture-rate", -3.4028235E38f);
            if (floatFromIntOrFloat != -3.4028235E38f) {
                this.muxer.addMetadataEntry(new MdtaMetadataEntry(MdtaMetadataEntry.KEY_ANDROID_CAPTURE_FPS, Util.toByteArray(floatFromIntOrFloat), 23));
            }
            return this.muxer.addTrack(MediaFormatUtil.createFormatFromMediaFormat(mediaFormat));
        } catch (MuxerException e2) {
            throw new RuntimeException(e2);
        }
    }

    public void release() throws ErrnoException {
        if (this.closedMuxer) {
            return;
        }
        closeMuxer();
    }

    public void setLocation(float f2, float f3) {
        an.u(!this.startedMuxer);
        this.muxer.addMetadataEntry(new Mp4LocationData(f2, f3));
    }

    public void setOrientationHint(int i2) {
        an.u(!this.startedMuxer);
        this.muxer.addMetadataEntry(new Mp4OrientationData(i2));
    }

    public void start() {
        an.u(!this.startedMuxer);
        an.u(!this.closedMuxer);
        this.startedMuxer = true;
    }

    public void stop() throws ErrnoException {
        an.u(this.startedMuxer);
        closeMuxer();
    }

    public void writeSampleData(int i2, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        an.u(this.startedMuxer);
        try {
            this.muxer.writeSampleData(i2, byteBuffer, MuxerUtil.getMuxerBufferInfoFromMediaCodecBufferInfo(bufferInfo));
        } catch (MuxerException e2) {
            throw new RuntimeException(e2);
        }
    }

    public MediaMuxerCompat(String str, int i2) {
        this.fileDescriptor = null;
        this.muxer = createMuxer(new FileOutputStream(str), i2);
    }
}
