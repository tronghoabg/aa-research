package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.StrictMode;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ztj extends ztq {
    private final String a;

    public ztj(String str) {
        ysi.X(str, "fileName cannot be null");
        this.a = str;
    }

    @Override // defpackage.ztq
    public final Bitmap a(gjt gjtVar) {
        StrictMode.ThreadPolicy threadPolicyA = zrr.a.a();
        try {
            try {
                FileInputStream fileInputStreamOpenFileInput = ((Context) gjtVar.a).openFileInput(this.a);
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(fileInputStreamOpenFileInput);
                    if (bitmapDecodeStream == null) {
                        throw new zsd("Failed to decode image. The provided image must be a Bitmap.");
                    }
                    zrr.a.d(threadPolicyA);
                    return bitmapDecodeStream;
                } finally {
                    try {
                        fileInputStreamOpenFileInput.close();
                    } catch (IOException unused) {
                    }
                }
            } catch (IOException unused2) {
                throw new zsd("Failed to decode image. The provided image must be a Bitmap.");
            }
        } catch (Throwable th) {
            zrr.a.d(threadPolicyA);
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ztj) {
            return a.C(this.a, ((ztj) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        zsa zsaVarA = zsa.a(this);
        zsaVarA.b("fileName", this.a);
        return zsaVarA.toString();
    }
}
