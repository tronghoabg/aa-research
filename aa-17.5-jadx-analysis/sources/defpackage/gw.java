package defpackage;

import android.support.v7.view.menu.ActionMenuItemView;

/* loaded from: classes2.dex */
public final class gw extends kw {
    final /* synthetic */ ActionMenuItemView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gw(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.a = actionMenuItemView;
    }

    @Override // defpackage.kw
    public final hw a() {
        ij ijVar;
        izj izjVar = this.a.c;
        if (izjVar == null || (ijVar = ((io) izjVar.a).j) == null) {
            return null;
        }
        return ijVar.a();
    }

    @Override // defpackage.kw
    protected final boolean b() {
        hw hwVarA;
        ActionMenuItemView actionMenuItemView = this.a;
        hf hfVar = actionMenuItemView.b;
        return hfVar != null && hfVar.b(actionMenuItemView.a) && (hwVarA = a()) != null && hwVarA.u();
    }
}
