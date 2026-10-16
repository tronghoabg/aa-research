package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes3.dex */
public class wlc<V extends View> extends dsg<V> {
    private wld a;
    private int b;

    public wlc() {
        this.b = 0;
    }

    public final int U() {
        wld wldVar = this.a;
        if (wldVar != null) {
            return wldVar.b;
        }
        return 0;
    }

    public final boolean V(int i) {
        wld wldVar = this.a;
        if (wldVar != null) {
            return wldVar.c(i);
        }
        this.b = i;
        return false;
    }

    @Override // defpackage.dsg
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        gG(coordinatorLayout, view, i);
        wld wldVar = this.a;
        if (wldVar == null) {
            wldVar = new wld(view);
            this.a = wldVar;
        }
        wldVar.b();
        this.a.a();
        int i2 = this.b;
        if (i2 == 0) {
            return true;
        }
        this.a.c(i2);
        this.b = 0;
        return true;
    }

    protected void gG(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.j(view, i);
    }

    public wlc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
    }
}
