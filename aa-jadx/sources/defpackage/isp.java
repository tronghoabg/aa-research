package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class isp extends defpackage.iws {
    public final defpackage.yqm a;
    public final long b;
    private final int l;
    private final int m;

    public isp(java.lang.String str, int i, int i2) {
        super(str, null);
        this.a = defpackage.yqm.c("CAR.AUDIO.".concat(java.lang.String.valueOf(str)));
        this.l = i;
        this.m = i2;
        int i3 = i * i2;
        this.b = 1000000 / (i3 + i3);
    }

    @Override // defpackage.iws
    protected final int a() {
        return 8;
    }

    @Override // defpackage.iws
    public final int b() {
        return -19;
    }

    @Override // defpackage.iws
    public final android.media.MediaCodec c() throws java.io.IOException {
        defpackage.yqm yqmVar = this.a;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1287)).u("initEncoder");
        int i = this.l;
        int i2 = this.m;
        android.media.MediaFormat mediaFormatCreateAudioFormat = android.media.MediaFormat.createAudioFormat("audio/mp4a-latm", i, i2);
        mediaFormatCreateAudioFormat.setInteger("aac-profile", 2);
        mediaFormatCreateAudioFormat.setInteger("bitrate", java.lang.Math.min(((i * i2) * 16) >> 1, 512000));
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1288)).u("createEncoderByType");
        defpackage.iwn iwnVar = this.d;
        android.media.MediaCodec mediaCodecCreateEncoderByType = android.media.MediaCodec.createEncoderByType("audio/mp4a-latm");
        iwnVar.c();
        mediaCodecCreateEncoderByType.configure(mediaFormatCreateAudioFormat, (android.view.Surface) null, (android.media.MediaCrypto) null, 1);
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1289)).u("AacEncoder start");
        mediaCodecCreateEncoderByType.start();
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 1290)).u("initEncoder complete");
        return mediaCodecCreateEncoderByType;
    }

    @Override // defpackage.iws
    protected final defpackage.iwn d() {
        return new defpackage.iso(this);
    }

    @Override // defpackage.iws
    protected final java.lang.String e() {
        return "Audio EncodingThread";
    }

    @Override // defpackage.iws
    public final void f(android.media.MediaCodec.BufferInfo bufferInfo, java.nio.ByteBuffer byteBuffer) {
        bufferInfo.presentationTimeUs = android.os.SystemClock.elapsedRealtime() * 1000;
    }

    @Override // defpackage.iws
    public final void h() {
        android.media.MediaCodec mediaCodec = j().b.j;
        mediaCodec.getClass();
        int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(-1L);
        if (iDequeueInputBuffer >= 0) {
            mediaCodec.queueInputBuffer(iDequeueInputBuffer, 0, 0, 0L, 4);
        }
    }

    public final defpackage.iso j() {
        return (defpackage.iso) this.d;
    }

    @Override // defpackage.iws
    public final void i() {
    }

    @Override // defpackage.iws
    public final void g(android.media.MediaCodec.BufferInfo bufferInfo, java.nio.ByteBuffer byteBuffer) {
    }
}
