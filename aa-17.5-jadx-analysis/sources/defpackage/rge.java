package defpackage;

import android.media.AudioRecord;

/* loaded from: classes2.dex */
public final class rge implements rfy {
    public static final ypf a = ols.R("CAR.AUDIO");
    private final AudioRecord b;

    public rge(AudioRecord audioRecord) {
        this.b = audioRecord;
    }

    public static rge e(AudioRecord audioRecord) {
        if (audioRecord != null) {
            return new rge(audioRecord);
        }
        return null;
    }

    @Override // defpackage.rfy
    public final int a() {
        return this.b.getState();
    }

    @Override // defpackage.rfy
    public final int b(byte[] bArr, int i, int i2) {
        return this.b.read(bArr, i, i2);
    }

    @Override // defpackage.rfy
    public final void c() {
        AudioRecord audioRecord = this.b;
        if (audioRecord.getRecordingState() == 3) {
            audioRecord.stop();
        }
        audioRecord.release();
    }

    @Override // defpackage.rfy
    public final void d() {
        this.b.startRecording();
    }
}
