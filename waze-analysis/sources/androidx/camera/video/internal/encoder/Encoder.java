package androidx.camera.video.internal.encoder;

import android.view.Surface;
import androidx.camera.video.internal.BufferProvider;
import com.google.d.m.a.bm;
import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface Encoder {
    public static final long NO_TIMESTAMP = -1;

    /* compiled from: WazeSource */
    public interface ByteBufferInput extends EncoderInput, BufferProvider<InputBuffer> {
    }

    /* compiled from: WazeSource */
    public interface EncoderInput {
    }

    /* compiled from: WazeSource */
    public interface SurfaceInput extends EncoderInput {
        Surface getSurface();
    }

    int getConfiguredBitrate();

    EncoderInfo getEncoderInfo();

    EncoderInput getInput();

    bm<Void> getReleasedFuture();

    void pause();

    void release();

    void requestKeyFrame();

    void setEncoderCallback(EncoderCallback encoderCallback, Executor executor);

    void start();

    void stop();

    void stop(long j2);
}
