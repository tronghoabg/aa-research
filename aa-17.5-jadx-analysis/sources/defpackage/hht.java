package defpackage;

import androidx.car.app.serialization.Bundleable;

/* loaded from: classes2.dex */
public final class hht extends gej {
    final /* synthetic */ hhz f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hht(hhz hhzVar, geu geuVar, glf glfVar) {
        super(geuVar, glfVar);
        this.f = hhzVar;
    }

    @Override // defpackage.gej, androidx.car.app.IOnDoneCallback
    public final void onFailure(Bundleable bundleable) {
        super.onFailure(bundleable);
        gks.j("CarApp.H", "Failed to get app theme, falling back to system theme.");
        this.f.u();
    }

    @Override // defpackage.gej, androidx.car.app.IOnDoneCallback
    public final void onSuccess(Bundleable bundleable) {
        super.onSuccess(bundleable);
        if (bundleable != null) {
            try {
                ((Integer) bundleable.a()).intValue();
                this.f.a.d();
            } catch (xr e) {
                gks.f("CarApp.H", e, "Failed to unbundle app theme");
            }
        }
        this.f.u();
    }
}
