package android.support.v4.app;

import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class aa extends ay {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ay f95a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ab f96b;

    aa(ab abVar, ay ayVar) {
        this.f96b = abVar;
        this.f95a = ayVar;
    }

    @Override // android.support.v4.app.ay
    public final View a(int i2) {
        ay ayVar = this.f95a;
        return ayVar.b() ? ayVar.a(i2) : this.f96b.onFindViewById(i2);
    }

    @Override // android.support.v4.app.ay
    public final boolean b() {
        return this.f95a.b() || this.f96b.onHasView();
    }
}
