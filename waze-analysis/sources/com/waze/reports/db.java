package com.waze.reports;

import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageButton;
import j$.util.Objects;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class db implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Object f33826a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f33827b;

    db(cm cmVar, int i2) {
        this.f33827b = i2;
        Objects.requireNonNull(cmVar);
        this.f33826a = cmVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        int i2 = this.f33827b;
        if (i2 == 0) {
            ((di) this.f33826a).f33845e.D();
            return;
        }
        if (i2 == 1) {
            ((android.support.v7.app.ap) this.f33826a).dismiss();
            return;
        }
        if (i2 == 2) {
            h.g.b.x.f(animation, "animation");
            ImageButton imageButton = ((eb) this.f33826a).f33890a;
            if (imageButton == null) {
                h.g.b.x.j("cameraOk");
                imageButton = null;
            }
            imageButton.setVisibility(8);
            return;
        }
        if (i2 == 3) {
            h.g.b.x.f(animation, "animation");
            ((View) this.f33826a).setVisibility(8);
        } else {
            if (i2 == 4) {
                h.g.b.x.f(animation, "animation");
                ((View) this.f33826a).setVisibility(8);
                return;
            }
            h.g.b.x.f(animation, "animation");
            eb ebVar = (eb) this.f33826a;
            eb.l(ebVar);
            ebVar.F();
            eb.k(ebVar);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        int i2 = this.f33827b;
        if (i2 == 0 || i2 == 1) {
            return;
        }
        if (i2 == 2) {
            h.g.b.x.f(animation, "animation");
            return;
        }
        if (i2 == 3) {
            h.g.b.x.f(animation, "animation");
        } else if (i2 != 4) {
            h.g.b.x.f(animation, "animation");
        } else {
            h.g.b.x.f(animation, "animation");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        int i2 = this.f33827b;
        if (i2 == 0 || i2 == 1) {
            return;
        }
        if (i2 == 2) {
            h.g.b.x.f(animation, "animation");
            ImageButton imageButton = ((eb) this.f33826a).f33891b;
            if (imageButton == null) {
                h.g.b.x.j("cameraDone");
                imageButton = null;
            }
            imageButton.setVisibility(0);
            return;
        }
        if (i2 == 3) {
            h.g.b.x.f(animation, "animation");
        } else if (i2 != 4) {
            h.g.b.x.f(animation, "animation");
        } else {
            h.g.b.x.f(animation, "animation");
        }
    }

    db(Object obj, int i2) {
        this.f33827b = i2;
        this.f33826a = obj;
    }

    db(di diVar, int i2) {
        this.f33827b = i2;
        Objects.requireNonNull(diVar);
        this.f33826a = diVar;
    }
}
