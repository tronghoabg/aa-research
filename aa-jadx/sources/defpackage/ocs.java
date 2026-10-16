package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ocs {
    public final /* synthetic */ defpackage.oct a;
    public final /* synthetic */ android.view.animation.Interpolator b;
    public final /* synthetic */ float c;

    public /* synthetic */ ocs(defpackage.oct octVar, android.view.animation.Interpolator interpolator, float f) {
        this.a = octVar;
        this.b = interpolator;
        this.c = f;
    }

    public final defpackage.oct a(float f) {
        defpackage.oct octVar = this.a;
        float f2 = octVar.a;
        if (f <= f2) {
            throw new java.lang.IllegalArgumentException("Next progress must be greater than current progress. Attempting to move to progress: " + f + ", but has already defined up to " + f2);
        }
        if (f > 1.0f) {
            throw new java.lang.IllegalArgumentException(defpackage.a.bF(f, "Progress can't exceed 1. Attempting to move to progress: "));
        }
        float f3 = this.c;
        octVar.c.add(new defpackage.ocu(this.b, f2, octVar.b, f, f3));
        octVar.a = f;
        octVar.b = f3;
        return octVar;
    }
}
