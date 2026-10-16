package com.bytedance.adsdk.oa.uef;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import com.bytedance.adsdk.oa.ivm.lw;

/* loaded from: classes.dex */
public class uef extends Paint {
    public uef() {
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i5) {
        if (Build.VERSION.SDK_INT >= 29) {
            super.setAlpha(lw.uef(i5, 0, 255));
        } else {
            setColor((lw.uef(i5, 0, 255) << 24) | (getColor() & 16777215));
        }
    }

    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
    }

    public uef(int i5) {
        super(i5);
    }

    public uef(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public uef(int i5, PorterDuff.Mode mode) {
        super(i5);
        setXfermode(new PorterDuffXfermode(mode));
    }
}
