package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Rect;
import android.view.View;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
final class fdt extends AnimatorListenerAdapter implements ffz {
    private final View a;
    private final Rect b;
    private final boolean c;
    private final Rect d;
    private final boolean e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private boolean n;

    public fdt(View view, Rect rect, boolean z, Rect rect2, boolean z2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a = view;
        this.b = rect;
        this.c = z;
        this.d = rect2;
        this.e = z2;
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        this.j = i5;
        this.k = i6;
        this.l = i7;
        this.m = i8;
    }

    @Override // defpackage.ffz
    public final void a(fgc fgcVar) {
        this.n = true;
    }

    @Override // defpackage.ffz
    public final void d() {
        View view = this.a;
        view.setTag(R.id.transition_clip, view.getClipBounds());
        view.setClipBounds(this.e ? null : this.d);
    }

    @Override // defpackage.ffz
    public final void e() {
        View view = this.a;
        Rect rect = (Rect) view.getTag(R.id.transition_clip);
        view.setTag(R.id.transition_clip, null);
        view.setClipBounds(rect);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (this.n) {
            return;
        }
        Rect rect = null;
        if (z) {
            if (!this.c) {
                rect = this.b;
            }
        } else if (!this.e) {
            rect = this.d;
        }
        View view = this.a;
        view.setClipBounds(rect);
        if (z) {
            fgu.c(view, this.f, this.g, this.h, this.i);
        } else {
            fgu.c(view, this.j, this.k, this.l, this.m);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        int i = this.m;
        int i2 = this.i;
        int i3 = this.g;
        int i4 = this.k;
        int i5 = this.l;
        int i6 = this.h;
        int i7 = this.f;
        int i8 = this.j;
        int iMax = Math.max(i6 - i7, i5 - i8);
        int iMax2 = Math.max(i2 - i3, i - i4);
        if (z) {
            i7 = i8;
        }
        if (true == z) {
            i3 = i4;
        }
        View view = this.a;
        fgu.c(view, i7, i3, iMax + i7, iMax2 + i3);
        view.setClipBounds(z ? this.d : this.b);
    }

    @Override // defpackage.ffz
    public final void f() {
    }

    @Override // defpackage.ffz
    public final void b(fgc fgcVar) {
    }

    @Override // defpackage.ffz
    public final /* synthetic */ void c(fgc fgcVar) {
    }

    @Override // defpackage.ffz
    public final /* synthetic */ void g(fgc fgcVar) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        onAnimationStart(animator, false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }
}
