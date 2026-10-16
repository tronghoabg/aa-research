package androidx.media3.muxer;

import java.io.FileOutputStream;
import java.nio.channels.WritableByteChannel;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface SeekableMuxerOutput extends WritableByteChannel {
    long getPosition();

    long getSize();

    void setPosition(long j2);

    void truncate(long j2);

    /* compiled from: WazeSource */
    /* renamed from: androidx.media3.muxer.SeekableMuxerOutput$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static SeekableMuxerOutput of(String str) {
            return new FileOutputStreamSeekableMuxerOutput(new FileOutputStream(str));
        }

        public static SeekableMuxerOutput of(FileOutputStream fileOutputStream) {
            return new FileOutputStreamSeekableMuxerOutput(fileOutputStream);
        }
    }
}
