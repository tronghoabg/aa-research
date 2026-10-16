package defpackage;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class e3 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ g3 a;

    public e3(g3 g3Var) {
        this.a = g3Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.a.d();
        return true;
    }
}
