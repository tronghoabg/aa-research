package com.carstream.tech.car.player;

import android.content.ContextWrapper;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import defpackage.cd;
import defpackage.k1;
import defpackage.md;
import defpackage.s8;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class PlayerStyles$Preview extends FrameLayout {
    public final FrameLayout a;
    public final int b;
    public final int c;

    public PlayerStyles$Preview(ContextWrapper contextWrapper, String str) {
        super(contextWrapper);
        setBackground(k1.t(-15460838, k1.g(contextWrapper, 10.0f)));
        setClipToOutline(true);
        int iG = k1.g(contextWrapper, 880.0f);
        this.b = iG;
        int iG2 = k1.g(contextWrapper, 540.0f);
        this.c = iG2;
        FrameLayout frameLayout = new FrameLayout(contextWrapper);
        cd cdVar = md.a.i;
        s8 s8VarE = k1.e(contextWrapper, str, cdVar);
        frameLayout.addView(s8VarE.a(cdVar, k1.f), s8VarE.b(cdVar));
        s8VarE.f("Tên video mẫu");
        s8VarE.c(true);
        s8VarE.g(62000L, 100000L);
        this.a = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(iG, iG2));
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i <= 0 || i2 <= 0) {
            return;
        }
        float f = i;
        float f2 = this.b;
        float f3 = i2;
        float f4 = this.c;
        float fMin = Math.min(f / f2, f3 / f4);
        FrameLayout frameLayout = this.a;
        frameLayout.setPivotX(0.0f);
        frameLayout.setPivotY(0.0f);
        frameLayout.setScaleX(fMin);
        frameLayout.setScaleY(fMin);
        frameLayout.setTranslationX((f - (f2 * fMin)) / 2.0f);
        frameLayout.setTranslationY((f3 - (f4 * fMin)) / 2.0f);
    }
}
