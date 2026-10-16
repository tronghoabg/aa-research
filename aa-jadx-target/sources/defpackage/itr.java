package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class itr implements defpackage.itn {
    public static final defpackage.yqm a = defpackage.yqm.c("CAR.AudioRecordWrapper");
    private final android.media.AudioRecord b;

    public itr(android.media.AudioRecord audioRecord) {
        this.b = audioRecord;
    }

    @Override // defpackage.itn
    public final int a() {
        return this.b.getState();
    }

    @Override // defpackage.itn
    public final int b(byte[] bArr, int i, int i2) {
        return this.b.read(bArr, i, i2);
    }

    @Override // defpackage.itn
    public final void c() {
        android.media.AudioRecord audioRecord = this.b;
        if (audioRecord.getRecordingState() == 3) {
            audioRecord.stop();
        }
        audioRecord.release();
    }

    @Override // defpackage.itn
    public final void d() {
        this.b.startRecording();
    }
}
