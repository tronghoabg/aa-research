package androidx.camera.video.internal.encoder;

import android.media.MediaCodec;
import com.google.d.m.a.bm;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface EncodedData extends AutoCloseable {
    @Override // java.lang.AutoCloseable
    void close();

    MediaCodec.BufferInfo getBufferInfo();

    ByteBuffer getByteBuffer();

    bm<Void> getClosedFuture();

    long getPresentationTimeUs();

    boolean isKeyFrame();

    long size();
}
