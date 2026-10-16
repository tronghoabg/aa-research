package android.support.v7.view.menu;

import android.support.v7.widget.cr;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class b extends cr {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ActionMenuItemView f779a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f779a = actionMenuItemView;
    }

    @Override // android.support.v7.widget.cr
    public final ah a() {
        c cVar = this.f779a.f715c;
        if (cVar != null) {
            return cVar.a();
        }
        return null;
    }

    @Override // android.support.v7.widget.cr
    protected final boolean b() {
        ah ahVarA;
        ActionMenuItemView actionMenuItemView = this.f779a;
        p pVar = actionMenuItemView.f714b;
        return pVar != null && pVar.b(actionMenuItemView.f713a) && (ahVarA = a()) != null && ahVarA.u();
    }
}
