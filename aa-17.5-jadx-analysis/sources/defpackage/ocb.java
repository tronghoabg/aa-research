package defpackage;

import android.view.animation.Interpolator;
import java.util.List;

/* loaded from: classes2.dex */
public final class ocb implements Interpolator {
    private final List a;

    public ocb(List list) {
        this.a = list;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        for (oca ocaVar : this.a) {
            float f2 = ocaVar.b;
            if (f2 <= f) {
                float f3 = ocaVar.d;
                if (f <= f3) {
                    float interpolation = ocaVar.a.getInterpolation((f - f2) / (f3 - f2));
                    float f4 = ocaVar.e;
                    float f5 = ocaVar.c;
                    return (interpolation * (f4 - f5)) + f5;
                }
            }
        }
        throw new IllegalStateException(a.bG(f, "Can't find Entry for progress: "));
    }
}
