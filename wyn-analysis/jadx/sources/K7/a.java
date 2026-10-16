package K7;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;
import k1.S;

/* loaded from: classes4.dex */
public abstract class a extends V0.a {

    /* renamed from: a, reason: collision with root package name */
    public b f6556a;

    @Override // V0.a
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i5) {
        r(coordinatorLayout, view, i5);
        if (this.f6556a == null) {
            this.f6556a = new b(view);
        }
        b bVar = this.f6556a;
        View view2 = bVar.f6558b;
        bVar.f6557a = view2.getTop();
        bVar.f6559c = view2.getLeft();
        b bVar2 = this.f6556a;
        View view3 = bVar2.f6558b;
        int top = 0 - (view3.getTop() - bVar2.f6557a);
        WeakHashMap weakHashMap = S.f38779a;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - bVar2.f6559c));
        return true;
    }

    public void r(CoordinatorLayout coordinatorLayout, View view, int i5) {
        coordinatorLayout.q(i5, view);
    }
}
