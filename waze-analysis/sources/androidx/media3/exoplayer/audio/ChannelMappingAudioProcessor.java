package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.audio.BaseAudioProcessor;
import androidx.media3.common.util.Util;
import com.google.d.l.b;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class ChannelMappingAudioProcessor extends BaseAudioProcessor {
    private b outputChannels;
    private b pendingOutputChannels;

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    public AudioProcessor.AudioFormat onConfigure(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        b bVar = this.pendingOutputChannels;
        if (bVar == null) {
            return AudioProcessor.AudioFormat.NOT_SET;
        }
        if (!Util.isEncodingLinearPcm(audioFormat.encoding)) {
            throw new AudioProcessor.UnhandledAudioFormatException(audioFormat);
        }
        int iB = bVar.b();
        boolean z = audioFormat.channelCount != iB;
        int i2 = 0;
        while (i2 < iB) {
            int iA = bVar.a(i2);
            if (iA >= audioFormat.channelCount) {
                throw new AudioProcessor.UnhandledAudioFormatException("Channel map (" + bVar.toString() + ") trying to access non-existent input channel.", audioFormat);
            }
            z |= iA != i2;
            i2++;
        }
        return z ? new AudioProcessor.AudioFormat(audioFormat.sampleRate, iB, audioFormat.encoding) : AudioProcessor.AudioFormat.NOT_SET;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    protected void onFlush(AudioProcessor.StreamMetadata streamMetadata) {
        this.outputChannels = this.pendingOutputChannels;
    }

    @Override // androidx.media3.common.audio.BaseAudioProcessor
    protected void onReset() {
        this.outputChannels = null;
        this.pendingOutputChannels = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    @Override // androidx.media3.common.audio.AudioProcessor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void queueInput(java.nio.ByteBuffer r9) {
        /*
            r8 = this;
            com.google.d.l.b r0 = r8.outputChannels
            com.google.d.b.an.B(r0)
            r1 = r0
            com.google.d.l.b r1 = (com.google.d.l.b) r1
            int r1 = r9.position()
            int r2 = r9.limit()
            int r3 = r2 - r1
            androidx.media3.common.audio.AudioProcessor$AudioFormat r4 = r8.inputAudioFormat
            int r4 = r4.bytesPerFrame
            int r3 = r3 / r4
            androidx.media3.common.audio.AudioProcessor$AudioFormat r4 = r8.outputAudioFormat
            int r4 = r4.bytesPerFrame
            int r3 = r3 * r4
            java.nio.ByteBuffer r3 = r8.replaceOutputBuffer(r3)
        L20:
            if (r1 >= r2) goto Lb3
            r4 = 0
        L23:
            int r5 = r0.b()
            if (r4 >= r5) goto Lac
            int r5 = r0.a(r4)
            androidx.media3.common.audio.AudioProcessor$AudioFormat r6 = r8.inputAudioFormat
            int r6 = r6.encoding
            int r6 = androidx.media3.common.util.Util.getByteDepth(r6)
            int r6 = r6 * r5
            int r6 = r6 + r1
            androidx.media3.common.audio.AudioProcessor$AudioFormat r5 = r8.inputAudioFormat
            int r5 = r5.encoding
            r7 = 2
            if (r5 == r7) goto La1
            r7 = 3
            if (r5 == r7) goto L99
            r7 = 4
            if (r5 == r7) goto L91
            r7 = 21
            if (r5 == r7) goto L89
            r7 = 22
            if (r5 == r7) goto L81
            r7 = 268435456(0x10000000, float:2.524355E-29)
            if (r5 == r7) goto La1
            r7 = 1342177280(0x50000000, float:8.589935E9)
            if (r5 == r7) goto L89
            r7 = 1610612736(0x60000000, float:3.689349E19)
            if (r5 == r7) goto L81
            r7 = 1879048192(0x70000000, float:1.5845633E29)
            if (r5 == r7) goto L79
            r7 = 1895825408(0x71000000, float:6.338253E29)
            if (r5 == r7) goto L91
            r7 = 1912602624(0x72000000, float:2.5353012E30)
            if (r5 != r7) goto L65
            goto L79
        L65:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Unexpected encoding: "
            r9.<init>(r0)
            r9.append(r5)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L79:
            double r5 = r9.getDouble(r6)
            r3.putDouble(r5)
            goto La8
        L81:
            int r5 = r9.getInt(r6)
            r3.putInt(r5)
            goto La8
        L89:
            int r5 = androidx.media3.common.util.Util.getInt24(r9, r6)
            androidx.media3.common.util.Util.putInt24(r3, r5)
            goto La8
        L91:
            float r5 = r9.getFloat(r6)
            r3.putFloat(r5)
            goto La8
        L99:
            byte r5 = r9.get(r6)
            r3.put(r5)
            goto La8
        La1:
            short r5 = r9.getShort(r6)
            r3.putShort(r5)
        La8:
            int r4 = r4 + 1
            goto L23
        Lac:
            androidx.media3.common.audio.AudioProcessor$AudioFormat r4 = r8.inputAudioFormat
            int r4 = r4.bytesPerFrame
            int r1 = r1 + r4
            goto L20
        Lb3:
            r9.position(r2)
            r3.flip()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.audio.ChannelMappingAudioProcessor.queueInput(java.nio.ByteBuffer):void");
    }

    @Deprecated
    public void setChannelMap(int[] iArr) {
        setChannelMap(iArr == null ? null : b.d(iArr));
    }

    public void setChannelMap(b bVar) {
        this.pendingOutputChannels = bVar;
    }
}
