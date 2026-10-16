package androidx.camera.video.internal.encoder;

import com.google.d.m.a.bm;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public interface InputBuffer {
    boolean cancel();

    ByteBuffer getByteBuffer();

    bm<Void> getTerminationFuture();

    void setEndOfStream(boolean z);

    void setPresentationTimeUs(long j2);

    boolean submit();
}
