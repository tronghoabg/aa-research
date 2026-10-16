package androidx.media3.decoder;

import androidx.media3.decoder.DecoderException;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface Decoder<I, O, E extends DecoderException> {

    /* compiled from: WazeSource */
    /* renamed from: androidx.media3.decoder.Decoder$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$setCallback(Decoder decoder, Callback callback, Executor executor) {
        }
    }

    /* compiled from: WazeSource */
    public interface Callback {
        void onInputBufferAvailable();

        void onOutputBufferAvailable();
    }

    I dequeueInputBuffer();

    O dequeueOutputBuffer();

    void flush();

    String getName();

    void queueInputBuffer(I i2);

    void release();

    void setCallback(Callback callback, Executor executor);

    void setOutputStartTimeUs(long j2);
}
