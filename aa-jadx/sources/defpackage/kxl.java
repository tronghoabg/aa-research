package defpackage;

/* JADX INFO: loaded from: classes.dex */
public interface kxl {
    public static final defpackage.yqm a = defpackage.yqm.c("GH.Assistant.Recorder");
    public static final int b = java.lang.Math.max(android.media.AudioRecord.getMinBufferSize(defpackage.sp.AUDIO_CONTENT_SAMPLING_RATE, 16, 2) * 4, 8192);

    android.os.ParcelFileDescriptor a() throws java.io.IOException;

    void b();

    void c();

    boolean d();
}
