package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* loaded from: classes.dex */
public class mq extends dzp {
    final RecyclerView a;
    public final mp b;

    public mq(RecyclerView recyclerView) {
        this.a = recyclerView;
        dzp dzpVarJ = j();
        if (dzpVarJ == null || !(dzpVarJ instanceof mp)) {
            this.b = new mp(this);
        } else {
            this.b = (mp) dzpVarJ;
        }
    }

    @Override // defpackage.dzp
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || k()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.g() != null) {
            recyclerView.g().Z(accessibilityEvent);
        }
    }

    @Override // defpackage.dzp
    public final void c(View view, edg edgVar) {
        super.c(view, edgVar);
        if (k()) {
            return;
        }
        RecyclerView recyclerView = this.a;
        if (recyclerView.g() != null) {
            lz lzVarG = recyclerView.g();
            RecyclerView recyclerView2 = lzVarG.s;
            lzVarG.fX(recyclerView2.e, recyclerView2.N, edgVar);
        }
    }

    @Override // defpackage.dzp
    public final boolean i(View view, int i, Bundle bundle) {
        if (super.i(view, i, bundle)) {
            return true;
        }
        if (k()) {
            return false;
        }
        RecyclerView recyclerView = this.a;
        if (recyclerView.g() != null) {
            return recyclerView.g().ga(i, bundle);
        }
        return false;
    }

    public dzp j() {
        return this.b;
    }

    final boolean k() {
        return this.a.am();
    }
}
