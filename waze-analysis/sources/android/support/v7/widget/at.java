package android.support.v7.widget;

import android.view.View;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class at extends cr {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ba f1086a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bd f1087b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    at(bd bdVar, View view, ba baVar) {
        super(view);
        this.f1087b = bdVar;
        this.f1086a = baVar;
    }

    @Override // android.support.v7.widget.cr
    public final android.support.v7.view.menu.ah a() {
        return this.f1086a;
    }

    @Override // android.support.v7.widget.cr
    public final boolean b() {
        bd bdVar = this.f1087b;
        if (bdVar.b().u()) {
            return true;
        }
        bdVar.c();
        return true;
    }
}
