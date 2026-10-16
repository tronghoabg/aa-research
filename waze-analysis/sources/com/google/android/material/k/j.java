package com.google.android.material.k;

import androidx.dynamicanimation.animation.FloatPropertyCompat;
import com.google.android.material.button.MaterialButton;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class j extends FloatPropertyCompat {

    /* renamed from: a, reason: collision with root package name */
    private final int f6665a;

    j(int i2) {
        super("cornerSizeAtIndex" + i2);
        this.f6665a = i2;
    }

    @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
    public final /* bridge */ /* synthetic */ float getValue(Object obj) {
        k kVar = (k) obj;
        if (kVar.D != null) {
            return kVar.D[this.f6665a];
        }
        return 0.0f;
    }

    @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
    public final /* bridge */ /* synthetic */ void setValue(Object obj, float f2) {
        k kVar = (k) obj;
        if (kVar.D != null) {
            float[] fArr = kVar.D;
            int i2 = this.f6665a;
            if (fArr[i2] != f2) {
                kVar.D[i2] = f2;
                if (kVar.F != null) {
                    com.google.firebase.messaging.l lVar = kVar.F;
                    MaterialButton.c((MaterialButton) lVar.f10212a, kVar.f());
                }
                kVar.invalidateSelf();
            }
        }
    }
}
