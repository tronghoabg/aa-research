package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ztm extends ztq {
    private final String a;

    public ztm(String str) {
        ysi.X(str, "absolutePath cannot be null");
        this.a = str;
    }

    @Override // defpackage.ztq
    public final Bitmap a(gjt gjtVar) {
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(this.a);
        if (bitmapDecodeFile != null) {
            return bitmapDecodeFile;
        }
        throw new zsd("Failed to decode image. The provided image must be a Bitmap.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ztm) {
            return a.C(this.a, ((ztm) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        zsa zsaVarA = zsa.a(this);
        zsaVarA.b("absolutePath", this.a);
        return zsaVarA.toString();
    }
}
