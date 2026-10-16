package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class AppBarRowScopeImpl implements AppBarRowScope, AppBarScope, AppBarItemProvider {
    private final AppBarScopeImpl impl;

    public AppBarRowScopeImpl(AppBarScopeImpl appBarScopeImpl) {
        this.impl = appBarScopeImpl;
    }

    @Override // androidx.compose.material3.AppBarScope
    public void clickableItem(a<ab> aVar, p<? super Composer, ? super Integer, ab> pVar, String str, boolean z) {
        this.impl.clickableItem(aVar, pVar, str, z);
    }

    @Override // androidx.compose.material3.AppBarScope
    public void customItem(p<? super Composer, ? super Integer, ab> pVar, q<? super AppBarMenuState, ? super Composer, ? super Integer, ab> qVar) {
        this.impl.customItem(pVar, qVar);
    }

    public final AppBarScopeImpl getImpl() {
        return this.impl;
    }

    @Override // androidx.compose.material3.AppBarItemProvider
    public List<AppBarItem> getItems() {
        return this.impl.getItems();
    }

    @Override // androidx.compose.material3.AppBarItemProvider
    public int getItemsCount() {
        return this.impl.getItemsCount();
    }

    @Override // androidx.compose.material3.AppBarScope
    public void toggleableItem(boolean z, l<? super Boolean, ab> lVar, p<? super Composer, ? super Integer, ab> pVar, String str, boolean z2) {
        this.impl.toggleableItem(z, lVar, pVar, str, z2);
    }
}
