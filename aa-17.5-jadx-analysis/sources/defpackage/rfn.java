package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Process;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class rfn extends rrg {
    public static final ypf a = ols.R("CAR.AUDIO");
    public final int b;
    public final int c;
    public final int d;
    public ByteBuffer[] e;

    public rfn(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    @Override // defpackage.rrg
    protected final String a() {
        return "Audio EncodingThread";
    }

    @Override // defpackage.rrg
    protected final void b() throws MediaCodec.CryptoException {
        int iM = this.i.M(-1L);
        if (iM >= 0) {
            this.i.O(iM, 0, 0L, 4);
        }
    }

    @Override // defpackage.rrg
    protected final void c() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(-19);
    }

    @Override // defpackage.rrg
    protected final erb d() throws IOException {
        int i = this.b;
        int i2 = this.d;
        MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", i, i2);
        mediaFormatCreateAudioFormat.setInteger("aac-profile", 2);
        mediaFormatCreateAudioFormat.setInteger("bitrate", Math.min(((i * i2) * 16) >> 1, 512000));
        MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType("audio/mp4a-latm");
        mediaCodecCreateEncoderByType.configure(mediaFormatCreateAudioFormat, (Surface) null, (MediaCrypto) null, 1);
        mediaCodecCreateEncoderByType.start();
        return new erb(mediaCodecCreateEncoderByType);
    }
}
