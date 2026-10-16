package defpackage;

import android.graphics.RectF;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class wty implements wtz {
    private final float a;

    public wty(float f) {
        this.a = f;
    }

    @Override // defpackage.wtz
    public final float a(RectF rectF) {
        return dlz.i(this.a, BitmapDescriptorFactory.HUE_RED, Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wty) && this.a == ((wty) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.a)});
    }
}
