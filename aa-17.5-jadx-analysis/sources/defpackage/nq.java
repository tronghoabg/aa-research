package defpackage;

import android.animation.Animator;
import android.view.View;

/* loaded from: classes2.dex */
final class nq extends nu {
    final /* synthetic */ int a;
    final /* synthetic */ mo b;
    final /* synthetic */ nv c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nq(nv nvVar, mo moVar, int i, float f, float f2, float f3, float f4, int i2, mo moVar2) {
        super(moVar, i, f, f2, f3, f4);
        this.c = nvVar;
        this.a = i2;
        this.b = moVar2;
    }

    @Override // defpackage.nu, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        if (this.n) {
            return;
        }
        int i = this.a;
        nv nvVar = this.c;
        if (i <= 0) {
            nvVar.l.c(nvVar.o, this.b);
        } else {
            nvVar.a.add(this.b.a);
            this.k = true;
            nvVar.o.post(new af(nvVar, this, 11, (short[]) null));
        }
        nv nvVar2 = this.c;
        mo moVar = this.b;
        View view = nvVar2.r;
        View view2 = moVar.a;
        if (view == view2) {
            nvVar2.h(view2);
        }
    }
}
