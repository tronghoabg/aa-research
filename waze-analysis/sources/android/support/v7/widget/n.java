package android.support.v7.widget;

import android.content.Context;
import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class n extends android.support.v7.view.menu.ab {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ p f1601a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, Context context, android.support.v7.view.menu.q qVar, View view) {
        super(context, qVar, view, true);
        this.f1601a = pVar;
        k();
        g(pVar.f1607j);
    }

    @Override // android.support.v7.view.menu.ab
    protected final void c() {
        p pVar = this.f1601a;
        if (pVar.f782c != null) {
            pVar.f782c.close();
        }
        pVar.f1604g = null;
        super.c();
    }
}
