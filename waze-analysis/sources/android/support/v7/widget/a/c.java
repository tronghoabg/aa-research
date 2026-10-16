package android.support.v7.widget.a;

import android.animation.Animator;
import android.support.v7.widget.fe;
import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class c extends i {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f992a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ fe f993b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ j f994c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(j jVar, fe feVar, int i2, float f2, float f3, float f4, float f5, int i3, fe feVar2) {
        super(feVar, i2, f2, f3, f4, f5);
        this.f994c = jVar;
        this.f992a = i3;
        this.f993b = feVar2;
    }

    @Override // android.support.v7.widget.a.i, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        if (this.n) {
            return;
        }
        int i2 = this.f992a;
        j jVar = this.f994c;
        if (i2 <= 0) {
            jVar.f1021h.d();
        } else {
            jVar.f1014a.add(this.f993b.itemView);
            this.f1012k = true;
            jVar.f1024k.post(new d(jVar, this));
        }
        j jVar2 = this.f994c;
        fe feVar = this.f993b;
        View view = jVar2.n;
        View view2 = feVar.itemView;
        if (view == view2) {
            jVar2.g(view2);
        }
    }
}
