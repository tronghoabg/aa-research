package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.Collections;

/* loaded from: classes2.dex */
final class eby implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ ecy a;
    final /* synthetic */ ecy b;
    final /* synthetic */ int c;
    final /* synthetic */ View d;
    final /* synthetic */ lds e;

    public eby(lds ldsVar, ecy ecyVar, ecy ecyVar2, int i, View view) {
        this.e = ldsVar;
        this.a = ecyVar;
        this.b = ecyVar2;
        this.c = i;
        this.d = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        lds ldsVar = this.e;
        ldsVar.W(valueAnimator.getAnimatedFraction());
        float fS = ldsVar.S();
        Interpolator interpolator = ecb.a;
        int i = Build.VERSION.SDK_INT;
        ecy ecyVar = this.a;
        ecm eclVar = i >= 36 ? new ecl(ecyVar) : Build.VERSION.SDK_INT >= 35 ? new eck(ecyVar) : Build.VERSION.SDK_INT >= 34 ? new ecj(ecyVar) : Build.VERSION.SDK_INT >= 31 ? new eci(ecyVar) : Build.VERSION.SDK_INT >= 30 ? new ech(ecyVar) : Build.VERSION.SDK_INT >= 29 ? new ecg(ecyVar) : new ecf(ecyVar);
        for (int i2 = 1; i2 <= 512; i2 += i2) {
            if ((this.c & i2) == 0) {
                eclVar.g(i2, ecyVar.f(i2));
            } else {
                ecy ecyVar2 = this.b;
                dve dveVarF = ecyVar.f(i2);
                dve dveVarF2 = ecyVar2.f(i2);
                float f = 1.0f - fS;
                eclVar.g(i2, ecy.j(dveVarF, (int) (((dveVarF.b - dveVarF2.b) * f) + 0.5d), (int) (((dveVarF.c - dveVarF2.c) * f) + 0.5d), (int) (((dveVarF.d - dveVarF2.d) * f) + 0.5d), (int) (((dveVarF.e - dveVarF2.e) * f) + 0.5d)));
            }
        }
        ecb.c(this.d, eclVar.a(), Collections.singletonList(ldsVar));
    }
}
