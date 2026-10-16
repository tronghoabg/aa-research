package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes3.dex */
public final class wvx extends wox {
    public wvx() {
        super(null);
    }

    private static float ay(float f) {
        return (float) (1.0d - Math.cos((f * 3.141592653589793d) / 2.0d));
    }

    private static float az(float f) {
        return (float) Math.sin((f * 3.141592653589793d) / 2.0d);
    }

    @Override // defpackage.wox
    public final void f(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float fAz;
        float fAy;
        RectF rectFE = e(tabLayout, view);
        RectF rectFE2 = e(tabLayout, view2);
        if (rectFE.left < rectFE2.left) {
            fAz = ay(f);
            fAy = az(f);
        } else {
            fAz = az(f);
            fAy = ay(f);
        }
        drawable.setBounds(wkn.b((int) rectFE.left, (int) rectFE2.left, fAz), drawable.getBounds().top, wkn.b((int) rectFE.right, (int) rectFE2.right, fAy), drawable.getBounds().bottom);
    }
}
