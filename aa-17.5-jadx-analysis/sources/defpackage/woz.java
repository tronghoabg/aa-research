package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.projection.gearhead.R;

/* loaded from: classes.dex */
public final class woz {
    private static final int c = (int) Math.round(5.1000000000000005d);
    public final boolean a;
    public final int b;
    private final int d;
    private final int e;
    private final float f;

    public woz(Context context) {
        boolean zA = woy.A(context.getTheme(), R.attr.elevationOverlayEnabled, false);
        TypedValue typedValueX = woy.x(context.getTheme(), R.attr.elevationOverlayColor);
        Integer numValueOf = typedValueX != null ? Integer.valueOf(woy.p(context, typedValueX)) : null;
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        TypedValue typedValueX2 = woy.x(context.getTheme(), R.attr.elevationOverlayAccentColor);
        Integer numValueOf2 = typedValueX2 != null ? Integer.valueOf(woy.p(context, typedValueX2)) : null;
        int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : 0;
        TypedValue typedValueX3 = woy.x(context.getTheme(), R.attr.colorSurface);
        Integer numValueOf3 = typedValueX3 != null ? Integer.valueOf(woy.p(context, typedValueX3)) : null;
        int iIntValue3 = numValueOf3 != null ? numValueOf3.intValue() : 0;
        float f = context.getResources().getDisplayMetrics().density;
        this.a = zA;
        this.d = iIntValue;
        this.e = iIntValue2;
        this.b = iIntValue3;
        this.f = f;
    }

    public final int a(int i, float f) {
        int i2;
        if (this.a) {
            int i3 = (16777215 & i) | (-16777216);
            int i4 = this.b;
            int i5 = dvd.a;
            if (i3 == i4) {
                float fMin = (this.f <= BitmapDescriptorFactory.HUE_RED || f <= BitmapDescriptorFactory.HUE_RED) ? 0.0f : Math.min(((((float) Math.log1p(f / r0)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
                int iAlpha = Color.alpha(i);
                int iO = woy.o(dvd.e(i, 255), this.d, fMin);
                if (fMin > BitmapDescriptorFactory.HUE_RED && (i2 = this.e) != 0) {
                    iO = dvd.d(dvd.e(i2, c), iO);
                }
                return dvd.e(iO, iAlpha);
            }
        }
        return i;
    }
}
