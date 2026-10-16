package defpackage;

import android.media.AudioRecord;

/* loaded from: classes.dex */
public final class itj implements itf {
    public static final yph a = yph.c("CAR.AudioRecordWrapper");
    private final AudioRecord b;

    public itj(AudioRecord audioRecord) {
        this.b = audioRecord;
    }

    @Override // defpackage.itf
    public final int a() {
        return this.b.getState();
    }

    @Override // defpackage.itf
    public final int b(byte[] bArr, int i, int i2) {
        return this.b.read(bArr, i, i2);
    }

    @Override // defpackage.itf
    public final void c() throws IllegalStateException {
        AudioRecord audioRecord = this.b;
        if (audioRecord.getRecordingState() == 3) {
            audioRecord.stop();
        }
        audioRecord.release();
    }

    @Override // defpackage.itf
    public final void d() throws IllegalStateException {
        this.b.startRecording();
    }
}
