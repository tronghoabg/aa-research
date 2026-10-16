package defpackage;

import android.content.Context;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class ivu {
    public static final yph a = yph.c("CAR.AUDIO");
    public final OutputStream b;

    @ResultIgnorabilityUnspecified
    public ivu(Context context) {
        File fileB = ilb.b(context);
        BufferedOutputStream bufferedOutputStream = null;
        if (fileB == null) {
            ((ype) ((ype) a.f()).ai((char) 1431)).u("Failed to get directory");
            this.b = null;
            return;
        }
        File file = new File(fileB, "mic-" + new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss", Locale.US).format(Long.valueOf(System.currentTimeMillis())) + ".pcm_16k_mono.raw");
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        } catch (IOException unused) {
            ((ype) ((ype) a.f()).ai((char) 1430)).y("Cannot create file for audio saving: %s", file);
        }
        this.b = bufferedOutputStream;
    }
}
