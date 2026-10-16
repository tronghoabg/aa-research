package android.support.v7.widget;

import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class l extends cr {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ m f1599a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(m mVar, View view) {
        super(view);
        this.f1599a = mVar;
    }

    @Override // android.support.v7.widget.cr
    public final android.support.v7.view.menu.ah a() {
        n nVar = this.f1599a.f1600a.f1604g;
        if (nVar == null) {
            return null;
        }
        return nVar.a();
    }

    @Override // android.support.v7.widget.cr
    public final boolean b() {
        this.f1599a.f1600a.v();
        return true;
    }

    @Override // android.support.v7.widget.cr
    public final boolean c() {
        p pVar = this.f1599a.f1600a;
        if (pVar.f1606i != null) {
            return false;
        }
        pVar.t();
        return true;
    }
}
