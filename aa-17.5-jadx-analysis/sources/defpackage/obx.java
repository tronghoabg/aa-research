package defpackage;

import android.view.animation.Interpolator;

/* loaded from: classes2.dex */
public final /* synthetic */ class obx {
    public final /* synthetic */ obz a;
    public final /* synthetic */ Interpolator b;
    public final /* synthetic */ float c;

    public /* synthetic */ obx(obz obzVar, Interpolator interpolator, float f) {
        this.a = obzVar;
        this.b = interpolator;
        this.c = f;
    }

    public final obz a(float f) {
        obz obzVar = this.a;
        float f2 = obzVar.a;
        if (f <= f2) {
            throw new IllegalArgumentException("Next progress must be greater than current progress. Attempting to move to progress: " + f + ", but has already defined up to " + f2);
        }
        if (f > 1.0f) {
            throw new IllegalArgumentException(a.bG(f, "Progress can't exceed 1. Attempting to move to progress: "));
        }
        float f3 = this.c;
        obzVar.c.add(new oca(this.b, f2, obzVar.b, f, f3));
        obzVar.a = f;
        obzVar.b = f3;
        return obzVar;
    }
}
