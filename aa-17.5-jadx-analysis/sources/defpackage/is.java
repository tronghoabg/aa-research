package defpackage;

import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.Window;

/* loaded from: classes.dex */
public final class is implements he {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public is(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.he
    public final void I(hg hgVar) {
        int i = this.b;
        if (i == 0) {
            he heVar = ((ActionMenuView) this.a).d;
            if (heVar != null) {
                heVar.I(hgVar);
                return;
            }
            return;
        }
        Object obj = this.a;
        if (i != 1) {
            Toolbar toolbar = (Toolbar) obj;
            if (!toolbar.a.m()) {
                toolbar.B.k(hgVar);
            }
            he heVar2 = toolbar.z;
            if (heVar2 != null) {
                heVar2.I(hgVar);
                return;
            }
            return;
        }
        fl flVar = (fl) obj;
        if (flVar.c.l()) {
            flVar.a.onPanelClosed(108, hgVar);
            return;
        }
        Window.Callback callback = flVar.a;
        if (callback.onPreparePanel(0, null, hgVar)) {
            callback.onMenuOpened(108, hgVar);
        }
    }

    @Override // defpackage.he
    public final boolean M(hg hgVar, MenuItem menuItem) {
        izj izjVar;
        if (this.b == 0 && (izjVar = ((ActionMenuView) this.a).e) != null) {
            Toolbar toolbar = (Toolbar) izjVar.a;
            if (toolbar.B.l(menuItem)) {
                return true;
            }
            izj izjVar2 = toolbar.C;
            return izjVar2 != null && ((fl) izjVar2.a).a.onMenuItemSelected(0, menuItem);
        }
        return false;
    }
}
