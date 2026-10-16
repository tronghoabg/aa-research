package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import h.ab;
import h.g.a.a;
import h.g.a.l;
import h.g.a.p;
import h.g.a.q;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class AppBarScopeImpl implements AppBarScope, AppBarItemProvider {
    public static final int $stable = 8;
    private final List<AppBarItem> items = new ArrayList();

    @Override // androidx.compose.material3.AppBarScope
    public void clickableItem(a<ab> aVar, p<? super Composer, ? super Integer, ab> pVar, String str, boolean z) {
        getItems().add(new ClickableAppBarItem(aVar, pVar, z, str));
    }

    @Override // androidx.compose.material3.AppBarScope
    public void customItem(p<? super Composer, ? super Integer, ab> pVar, q<? super AppBarMenuState, ? super Composer, ? super Integer, ab> qVar) {
        getItems().add(new CustomAppBarItem(pVar, qVar));
    }

    @Override // androidx.compose.material3.AppBarItemProvider
    public List<AppBarItem> getItems() {
        return this.items;
    }

    @Override // androidx.compose.material3.AppBarItemProvider
    public int getItemsCount() {
        return getItems().size();
    }

    @Override // androidx.compose.material3.AppBarScope
    public void toggleableItem(boolean z, l<? super Boolean, ab> lVar, p<? super Composer, ? super Integer, ab> pVar, String str, boolean z2) {
        getItems().add(new ToggleableAppBarItem(z, lVar, pVar, z2, str));
    }
}
