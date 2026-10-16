package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes3.dex */
public final class wqg implements ValueAnimator.AnimatorUpdateListener {
    public static final /* synthetic */ int a = 0;
    private final wqf b;
    private final View[] c;

    public wqg(wqf wqfVar, View... viewArr) {
        this.b = wqfVar;
        this.c = viewArr;
    }

    public static wqg a(View... viewArr) {
        return new wqg(new wqe(3), viewArr);
    }

    public static wqg b(View... viewArr) {
        return new wqg(new wqe(1), viewArr);
    }

    public static wqg c(View... viewArr) {
        return new wqg(new wqe(2), viewArr);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = 0;
        while (true) {
            View[] viewArr = this.c;
            if (i >= viewArr.length) {
                return;
            }
            this.b.a(valueAnimator, viewArr[i]);
            i++;
        }
    }
}
