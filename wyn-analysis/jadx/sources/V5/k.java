package V5;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import q2.C3860d;

/* loaded from: classes3.dex */
public interface k {
    void c(Bundle bundle);

    void d(int i5, int i10, long j8, int i11);

    MediaFormat f();

    void flush();

    void h(int i5);

    ByteBuffer i(int i5);

    void j(Surface surface);

    void n(int i5, long j8);

    int o();

    int q(MediaCodec.BufferInfo bufferInfo);

    ByteBuffer r(int i5);

    void release();

    void u(int i5, H5.c cVar, long j8);

    void v(C3860d c3860d, Handler handler);

    void x(int i5, boolean z2);
}
