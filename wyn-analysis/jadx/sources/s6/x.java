package s6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes3.dex */
public final class x extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45279a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f45280b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f45281c;

    public /* synthetic */ x(y yVar, t tVar, int i5) {
        this.f45279a = i5;
        this.f45281c = yVar;
        this.f45280b = tVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45279a) {
            case 0:
                y yVar = this.f45281c;
                yVar.i(1);
                if (yVar.f45283B) {
                    this.f45280b.post(yVar.f45302s);
                    yVar.f45283B = false;
                    break;
                }
                break;
            case 1:
                y yVar2 = this.f45281c;
                yVar2.i(2);
                if (yVar2.f45283B) {
                    this.f45280b.post(yVar2.f45302s);
                    yVar2.f45283B = false;
                    break;
                }
                break;
            default:
                y yVar3 = this.f45281c;
                yVar3.i(2);
                if (yVar3.f45283B) {
                    this.f45280b.post(yVar3.f45302s);
                    yVar3.f45283B = false;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f45279a) {
            case 0:
                this.f45281c.i(3);
                break;
            case 1:
                this.f45281c.i(3);
                break;
            default:
                this.f45281c.i(3);
                break;
        }
    }
}
