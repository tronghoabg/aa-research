package d2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import q2.C3860d;

/* loaded from: classes.dex */
public interface j {
    void G(int i5);

    boolean J(a2.v vVar);

    void L(C3860d c3860d, Handler handler);

    void c(Bundle bundle);

    void d(int i5, int i10, long j8, int i11);

    MediaFormat f();

    void flush();

    void h(int i5);

    ByteBuffer i(int i5);

    void j(Surface surface);

    void l(int i5, H5.c cVar, long j8, int i10);

    void n(int i5, long j8);

    int o();

    int q(MediaCodec.BufferInfo bufferInfo);

    ByteBuffer r(int i5);

    void release();

    void v();
}
