package defpackage;

import android.graphics.Bitmap;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ztk extends ztq {
    private final Bitmap a;

    public ztk(Bitmap bitmap) {
        this.a = bitmap;
    }

    @Override // defpackage.ztq
    public final Bitmap a(gjt gjtVar) {
        Bitmap bitmap = this.a;
        if (bitmap != null) {
            return bitmap;
        }
        throw new zsd("Failed to decode image. The provided image must be a Bitmap.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ztk) {
            return a.C(this.a, ((ztk) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        zsa zsaVarA = zsa.a(this);
        zsaVarA.b("bitmap", this.a);
        return zsaVarA.toString();
    }
}
