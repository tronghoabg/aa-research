package defpackage;

import android.media.AudioRecord;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

/* loaded from: classes.dex */
public interface kxe {
    public static final yph a = yph.c("GH.Assistant.Recorder");
    public static final int b = Math.max(AudioRecord.getMinBufferSize(sk.AUDIO_CONTENT_SAMPLING_RATE, 16, 2) * 4, 8192);

    ParcelFileDescriptor a() throws IOException;

    void b();

    void c();

    boolean d();
}
