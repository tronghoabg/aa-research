package androidx.camera.video.internal.audio;

import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface AudioStream {

    /* compiled from: WazeSource */
    public abstract class PacketInfo {
        public static PacketInfo of(int i2, long j2) {
            return new AutoValue_AudioStream_PacketInfo(i2, j2);
        }

        public abstract int getSizeInBytes();

        public abstract long getTimestampNs();
    }

    PacketInfo read(ByteBuffer byteBuffer);

    void release();

    void setCallback(AudioStreamCallback audioStreamCallback, Executor executor);

    void start();

    void stop();

    /* compiled from: WazeSource */
    public class AudioStreamException extends Exception {
        public AudioStreamException() {
        }

        public AudioStreamException(String str) {
            super(str);
        }

        public AudioStreamException(String str, Throwable th) {
            super(str, th);
        }

        public AudioStreamException(Throwable th) {
            super(th);
        }
    }

    /* compiled from: WazeSource */
    public interface AudioStreamCallback {
        void onSilenceStateChanged(boolean z);

        /* compiled from: WazeSource */
        /* renamed from: androidx.camera.video.internal.audio.AudioStream$AudioStreamCallback$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$onSilenceStateChanged(AudioStreamCallback audioStreamCallback, boolean z) {
            }
        }
    }
}
