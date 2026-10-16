package android.support.v7.widget;

import android.content.Context;
import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class i extends android.support.v7.view.menu.ab {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ p f1595a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p pVar, Context context, android.support.v7.view.menu.al alVar, View view) {
        super(context, alVar, view, false);
        this.f1595a = pVar;
        if (!((android.support.v7.view.menu.t) alVar.getItem()).l()) {
            View view2 = pVar.f1603f;
            d(view2 == null ? (View) pVar.f784e : view2);
        }
        g(pVar.f1607j);
    }

    @Override // android.support.v7.view.menu.ab
    protected final void c() {
        this.f1595a.f1605h = null;
        super.c();
    }
}
