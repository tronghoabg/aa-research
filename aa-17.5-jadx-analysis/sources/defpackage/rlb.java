package defpackage;

import android.content.Context;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class rlb {
    public static final ypf a = ols.R("CAR.AUDIO");
    private final OutputStream b;

    public rlb(Context context, int i, int i2, xkj xkjVar) {
        File fileB = qsu.b(context);
        BufferedOutputStream bufferedOutputStream = null;
        if (fileB == null) {
            a.f().ai(8176).u("Failed to get directory");
            this.b = null;
            return;
        }
        rhx rhxVar = rhx.c;
        String strQ = roc.q(i);
        String str = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss", Locale.US).format(Long.valueOf(System.currentTimeMillis()));
        int i3 = i2 - 1;
        String str2 = i3 != 1 ? i3 != 3 ? "16k_mono" : "48k_mono" : "48k_stereo";
        int iOrdinal = xkjVar.ordinal();
        File file = new File(fileB, strQ + "_" + str + "_" + str2 + "." + (iOrdinal != 0 ? (iOrdinal == 1 || iOrdinal == 3) ? "aac" : String.valueOf(xkjVar.h) : "raw"));
        try {
            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        } catch (IOException unused) {
            a.f().ai(8175).y("Cannot create file for audio saving: %s", file);
        }
        this.b = bufferedOutputStream;
    }

    public final void a() throws IOException {
        OutputStream outputStream = this.b;
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public final void b(byte[] bArr, int i, int i2) throws IOException {
        OutputStream outputStream = this.b;
        if (outputStream != null) {
            try {
                outputStream.write(bArr, i, i2);
            } catch (IOException unused) {
            }
        }
    }
}
