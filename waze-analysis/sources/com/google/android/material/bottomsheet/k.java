package com.google.android.material.bottomsheet;

import android.view.View;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class k extends WindowInsetsAnimationCompat.Callback {

    /* renamed from: a, reason: collision with root package name */
    private final View f6299a;

    /* renamed from: b, reason: collision with root package name */
    private int f6300b;

    /* renamed from: c, reason: collision with root package name */
    private int f6301c;

    /* renamed from: d, reason: collision with root package name */
    private final int[] f6302d;

    public k(View view) {
        super(0);
        this.f6302d = new int[2];
        this.f6299a = view;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final void onEnd(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        this.f6299a.setTranslationY(0.0f);
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final void onPrepare(WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        View view = this.f6299a;
        int[] iArr = this.f6302d;
        view.getLocationOnScreen(iArr);
        this.f6300b = iArr[1];
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final WindowInsetsCompat onProgress(WindowInsetsCompat windowInsetsCompat, List<WindowInsetsAnimationCompat> list) {
        Iterator<WindowInsetsAnimationCompat> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((it.next().getTypeMask() & 8) != 0) {
                this.f6299a.setTranslationY(com.google.android.material.a.a.a(this.f6301c, 0, r0.getInterpolatedFraction()));
                break;
            }
        }
        return windowInsetsCompat;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public final WindowInsetsAnimationCompat.BoundsCompat onStart(WindowInsetsAnimationCompat windowInsetsAnimationCompat, WindowInsetsAnimationCompat.BoundsCompat boundsCompat) {
        View view = this.f6299a;
        int[] iArr = this.f6302d;
        view.getLocationOnScreen(iArr);
        int i2 = this.f6300b - iArr[1];
        this.f6301c = i2;
        view.setTranslationY(i2);
        return boundsCompat;
    }
}
