package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.libraries.maps.model.BitmapDescriptorFactory;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes3.dex */
public final class wvy extends wox {
    public wvy() {
        super(null);
    }

    @Override // defpackage.wox
    public final void f(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        if (f >= 0.5f) {
            view = view2;
        }
        RectF rectFE = e(tabLayout, view);
        float fA = f < 0.5f ? wkn.a(1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0.5f, f) : wkn.a(BitmapDescriptorFactory.HUE_RED, 1.0f, 0.5f, 1.0f, f);
        drawable.setBounds((int) rectFE.left, drawable.getBounds().top, (int) rectFE.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (fA * 255.0f));
    }
}
