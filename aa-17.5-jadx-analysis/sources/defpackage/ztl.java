package defpackage;

import android.graphics.Bitmap;
import com.google.android.libraries.maps.R;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class ztl extends ztq {
    private final int a;

    public ztl() {
        String.format("invalid resource id: %s", Integer.valueOf(R.drawable.maps_default_marker));
        this.a = R.drawable.maps_default_marker;
    }

    @Override // defpackage.ztq
    public final Bitmap a(gjt gjtVar) {
        Bitmap bitmapC = gjtVar.C(R.drawable.maps_default_marker);
        if (bitmapC != null) {
            return bitmapC;
        }
        throw new zsd("Failed to decode image. The provided image must be a Bitmap.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ztl)) {
            return false;
        }
        int i = ((ztl) obj).a;
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(R.drawable.maps_default_marker)});
    }

    public final String toString() {
        zsa zsaVarA = zsa.a(this);
        zsaVarA.e("resourceId ", R.drawable.maps_default_marker);
        return zsaVarA.toString();
    }
}
