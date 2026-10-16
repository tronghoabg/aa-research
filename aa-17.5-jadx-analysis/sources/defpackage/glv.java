package defpackage;

import androidx.car.app.serialization.Bundleable;

/* loaded from: classes2.dex */
final class glv extends gej {
    final /* synthetic */ gmg f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public glv(gmg gmgVar, geu geuVar, glf glfVar) {
        super(geuVar, glfVar);
        this.f = gmgVar;
    }

    @Override // defpackage.gej, androidx.car.app.IOnDoneCallback
    public final void onSuccess(Bundleable bundleable) {
        super.onSuccess(bundleable);
        glf glfVar = this.f.o;
        glfVar.getClass();
        gev.c(new elt(glfVar, 20));
    }
}
