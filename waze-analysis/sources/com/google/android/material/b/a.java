package com.google.android.material.b;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class a extends Animatable2Compat.AnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f6205a;

    a(e eVar) {
        Objects.requireNonNull(eVar);
        this.f6205a = eVar;
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f6205a.f6212a;
        if (colorStateList != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        e eVar = this.f6205a;
        ColorStateList colorStateList = eVar.f6212a;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(eVar.s, colorStateList.getDefaultColor()));
        }
    }
}
