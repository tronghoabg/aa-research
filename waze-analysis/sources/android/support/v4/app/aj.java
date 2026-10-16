package android.support.v4.app;

import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class aj extends ay {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ar f116a;

    aj(ar arVar) {
        this.f116a = arVar;
    }

    @Override // android.support.v4.app.ay
    public final View a(int i2) {
        ar arVar = this.f116a;
        View view = arVar.mView;
        if (view != null) {
            return view.findViewById(i2);
        }
        throw new IllegalStateException(k.e(arVar, "Fragment ", " does not have a view"));
    }

    @Override // android.support.v4.app.ay
    public final boolean b() {
        return this.f116a.mView != null;
    }
}
