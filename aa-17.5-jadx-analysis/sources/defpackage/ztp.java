package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class ztp extends ztq {
    private final int a;
    private final int b;

    public ztp(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.ztq
    public final Bitmap a(gjt gjtVar) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.a, this.b, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        paint.setColor(0);
        canvas.drawBitmap(bitmapCreateBitmap, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint);
        return bitmapCreateBitmap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ztp)) {
            return false;
        }
        ztp ztpVar = (ztp) obj;
        return this.a == ztpVar.a && this.b == ztpVar.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b)});
    }

    public final String toString() {
        zsa zsaVarA = zsa.a(this);
        zsaVarA.b("size", String.format(Locale.US, "%dx%d", Integer.valueOf(this.a), Integer.valueOf(this.b)));
        return zsaVarA.toString();
    }
}
