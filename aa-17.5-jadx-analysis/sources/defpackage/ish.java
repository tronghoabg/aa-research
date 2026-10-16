package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class ish extends iwk {
    public final yph a;
    public final long b;
    private final int l;
    private final int m;

    public ish(String str, int i, int i2) {
        super(str, null);
        this.a = yph.c("CAR.AUDIO.".concat(String.valueOf(str)));
        this.l = i;
        this.m = i2;
        int i3 = i * i2;
        this.b = 1000000 / (i3 + i3);
    }

    @Override // defpackage.iwk
    protected final int a() {
        return 8;
    }

    @Override // defpackage.iwk
    public final int b() {
        return -19;
    }

    @Override // defpackage.iwk
    public final MediaCodec c() throws IOException {
        yph yphVar = this.a;
        ((ype) ((ype) yphVar.f()).ai((char) 1287)).u("initEncoder");
        int i = this.l;
        int i2 = this.m;
        MediaFormat mediaFormatCreateAudioFormat = MediaFormat.createAudioFormat("audio/mp4a-latm", i, i2);
        mediaFormatCreateAudioFormat.setInteger("aac-profile", 2);
        mediaFormatCreateAudioFormat.setInteger("bitrate", Math.min(((i * i2) * 16) >> 1, 512000));
        ((ype) ((ype) yphVar.f()).ai((char) 1288)).u("createEncoderByType");
        iwf iwfVar = this.d;
        MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType("audio/mp4a-latm");
        iwfVar.c();
        mediaCodecCreateEncoderByType.configure(mediaFormatCreateAudioFormat, (Surface) null, (MediaCrypto) null, 1);
        ((ype) ((ype) yphVar.f()).ai((char) 1289)).u("AacEncoder start");
        mediaCodecCreateEncoderByType.start();
        ((ype) ((ype) yphVar.f()).ai((char) 1290)).u("initEncoder complete");
        return mediaCodecCreateEncoderByType;
    }

    @Override // defpackage.iwk
    protected final iwf d() {
        return new isg(this);
    }

    @Override // defpackage.iwk
    protected final String e() {
        return "Audio EncodingThread";
    }

    @Override // defpackage.iwk
    public final void f(MediaCodec.BufferInfo bufferInfo, ByteBuffer byteBuffer) {
        bufferInfo.presentationTimeUs = SystemClock.elapsedRealtime() * 1000;
    }

    @Override // defpackage.iwk
    public final void h() throws MediaCodec.CryptoException {
        MediaCodec mediaCodec = j().b.j;
        mediaCodec.getClass();
        int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(-1L);
        if (iDequeueInputBuffer >= 0) {
            mediaCodec.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
        }
    }

    public final isg j() {
        return (isg) this.d;
    }

    @Override // defpackage.iwk
    public final void i() {
    }

    @Override // defpackage.iwk
    public final void g(MediaCodec.BufferInfo bufferInfo, ByteBuffer byteBuffer) {
    }
}
