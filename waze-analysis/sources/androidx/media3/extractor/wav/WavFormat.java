package androidx.media3.extractor.wav;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class WavFormat {
    public final int averageBytesPerSecond;
    public final int bitsPerSample;
    public final int blockSize;
    public final int channelMask;
    public final byte[] extraData;
    public final int formatType;
    public final int frameRateHz;
    public final int numChannels;

    public WavFormat(int i2, int i3, int i4, int i5, int i6, int i7, byte[] bArr, int i8) {
        this.formatType = i2;
        this.numChannels = i3;
        this.frameRateHz = i4;
        this.averageBytesPerSecond = i5;
        this.blockSize = i6;
        this.bitsPerSample = i7;
        this.extraData = bArr;
        this.channelMask = i8;
    }
}
