package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zto extends ztq {
    private final int a;

    public zto(int i) {
        ysi.T(i >= 0, String.format("invalid resource id: %s", Integer.valueOf(i)));
        this.a = i;
    }

    @Override // defpackage.ztq
    public final Bitmap a(gjt gjtVar) {
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(gjtVar.z().getResources(), this.a);
        if (bitmapDecodeResource != null) {
            return bitmapDecodeResource;
        }
        throw new zsd("Failed to decode image. The provided image must be a Bitmap.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zto) && this.a == ((zto) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a)});
    }

    public final String toString() {
        zsa zsaVarA = zsa.a(this);
        zsaVarA.e("resourceId ", this.a);
        return zsaVarA.toString();
    }
}
