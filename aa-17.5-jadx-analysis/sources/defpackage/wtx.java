package defpackage;

import android.graphics.RectF;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class wtx implements wtz {
    private final wtz a;
    private final float b;

    public wtx(float f, wtz wtzVar) {
        while (wtzVar instanceof wtx) {
            wtzVar = ((wtx) wtzVar).a;
            f += ((wtx) wtzVar).b;
        }
        this.a = wtzVar;
        this.b = f;
    }

    @Override // defpackage.wtz
    public final float a(RectF rectF) {
        return Math.max(BitmapDescriptorFactory.HUE_RED, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wtx)) {
            return false;
        }
        wtx wtxVar = (wtx) obj;
        return this.a.equals(wtxVar.a) && this.b == wtxVar.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
