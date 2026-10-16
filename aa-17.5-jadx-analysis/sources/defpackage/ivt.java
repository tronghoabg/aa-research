package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaMuxer;
import android.text.format.Time;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class ivt implements iwi {
    public static final yph a = yph.c("CAR.VIDEO");
    public MediaMuxer b;
    public int c;
    private boolean d = false;
    private final String e;

    public ivt(Context context) throws IOException {
        Time time = new Time();
        time.setToNow();
        String str = time.format("%Y-%m-%d-%H_%M_%S");
        File fileB = ilb.b(context);
        if (fileB == null) {
            throw new IOException("Failed to get directory");
        }
        String absolutePath = new File(fileB, String.valueOf(str).concat(".mp4")).getAbsolutePath();
        this.e = absolutePath;
        ((ype) a.l().ai(1428)).y("Saving video to: %s", absolutePath);
        this.b = new MediaMuxer(absolutePath, 0);
    }

    @Override // defpackage.iwi
    public final synchronized void a() {
        if (this.d) {
            this.b.release();
        }
    }

    @Override // defpackage.iwi
    public final synchronized void b(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        if (!this.d) {
            this.b.start();
            this.d = true;
        }
        this.b.writeSampleData(this.c, byteBuffer, bufferInfo);
    }
}
