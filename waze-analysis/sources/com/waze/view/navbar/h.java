package com.waze.view.navbar;

import android.view.animation.Animation;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class h implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ i f45079a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f45080b;

    h(i iVar, int i2, byte[] bArr) {
        this.f45080b = i2;
        Objects.requireNonNull(iVar);
        this.f45079a = iVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        int i2 = this.f45080b;
        if (i2 == 0) {
            i iVar = this.f45079a;
            iVar.f45092l = false;
            iVar.f45086f.setVisibility(8);
            return;
        }
        i iVar2 = this.f45079a;
        if (i2 != 1) {
            super/*android.widget.RelativeLayout*/.setVisibility(iVar2.p);
            iVar2.q = false;
        } else {
            iVar2.f45092l = false;
            iVar2.f45091k = true;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    h(i iVar, int i2) {
        this.f45080b = i2;
        Objects.requireNonNull(iVar);
        this.f45079a = iVar;
    }

    h(i iVar, int i2, char[] cArr) {
        this.f45080b = i2;
        Objects.requireNonNull(iVar);
        this.f45079a = iVar;
    }
}
