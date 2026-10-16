package com.airbnb.lottie.a;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import androidx.core.view.ViewCompat;
import com.airbnb.lottie.g.f;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class a extends Paint {
    public a(PorterDuff.Mode mode, byte[] bArr) {
        super(1);
        setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i2) {
        if (Build.VERSION.SDK_INT >= 30) {
            int i3 = f.f2413a;
            super.setAlpha(Math.max(0, Math.min(255, i2)));
        } else {
            int color = getColor();
            int i4 = f.f2413a;
            setColor((Math.max(0, Math.min(255, i2)) << 24) | (color & ViewCompat.MEASURED_SIZE_MASK));
        }
    }

    public a(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public final void setTextLocales(LocaleList localeList) {
    }
}
