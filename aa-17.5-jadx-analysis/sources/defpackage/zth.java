package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zth extends ztq {
    private final String a;

    public zth(String str) {
        ysi.X(str, "assetName cannot be null");
        this.a = str;
    }

    @Override // defpackage.ztq
    public final Bitmap a(gjt gjtVar) throws IOException {
        try {
            InputStream inputStreamOpen = ((Context) gjtVar.a).getAssets().open(this.a);
            try {
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen);
                if (bitmapDecodeStream != null) {
                    return bitmapDecodeStream;
                }
                throw new zsd("Failed to decode image. The provided image must be a Bitmap.");
            } finally {
                try {
                    inputStreamOpen.close();
                } catch (IOException unused) {
                }
            }
        } catch (IOException unused2) {
            throw new zsd("Failed to decode image. The provided image must be a Bitmap.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zth) {
            return a.C(this.a, ((zth) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        zsa zsaVarA = zsa.a(this);
        zsaVarA.b("assetName", this.a);
        return zsaVarA.toString();
    }
}
