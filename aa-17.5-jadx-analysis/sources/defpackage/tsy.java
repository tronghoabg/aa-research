package defpackage;

import android.util.DisplayMetrics;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class tsy {
    float a;
    public tsx b;
    private volatile boolean c = false;
    private final DisplayMetrics d;

    public tsy(DisplayMetrics displayMetrics, float f) {
        this.a = 65.0f;
        this.d = displayMetrics;
        this.a = f;
    }

    public static float a(float f) {
        if (Float.isNaN(f) || Float.isInfinite(f)) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return (f % 360.0f) + (f < BitmapDescriptorFactory.HUE_RED ? 360 : 0);
    }

    public static float b(float f) {
        if (Float.isNaN(f)) {
            return 2.0f;
        }
        return Math.max(2.0f, Math.min(f, 21.0f));
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.ttl r12) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tsy.c(ttl):void");
    }
}
