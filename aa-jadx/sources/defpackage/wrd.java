package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class wrd implements android.animation.ValueAnimator.AnimatorUpdateListener {
    public static final /* synthetic */ int a = 0;
    private final defpackage.wrc b;
    private final android.view.View[] c;

    public wrd(defpackage.wrc wrcVar, android.view.View... viewArr) {
        this.b = wrcVar;
        this.c = viewArr;
    }

    public static defpackage.wrd a(android.view.View... viewArr) {
        return new defpackage.wrd(new defpackage.wrb(3), viewArr);
    }

    public static defpackage.wrd b(android.view.View... viewArr) {
        return new defpackage.wrd(new defpackage.wrb(1), viewArr);
    }

    public static defpackage.wrd c(android.view.View... viewArr) {
        return new defpackage.wrd(new defpackage.wrb(2), viewArr);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        int i = 0;
        while (true) {
            android.view.View[] viewArr = this.c;
            if (i >= viewArr.length) {
                return;
            }
            this.b.a(valueAnimator, viewArr[i]);
            i++;
        }
    }
}
