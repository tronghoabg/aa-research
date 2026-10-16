package android.support.v4.app;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.core.view.MenuProvider;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
final class bg implements MenuProvider {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bv f173a;

    bg(bv bvVar) {
        this.f173a = bvVar;
    }

    @Override // androidx.core.view.MenuProvider
    public final void onCreateMenu(Menu menu, MenuInflater menuInflater) {
        this.f173a.aI(menu, menuInflater);
    }

    @Override // androidx.core.view.MenuProvider
    public final void onMenuClosed(Menu menu) {
        this.f173a.W(menu);
    }

    @Override // androidx.core.view.MenuProvider
    public final boolean onMenuItemSelected(MenuItem menuItem) {
        return this.f173a.aJ(menuItem);
    }

    @Override // androidx.core.view.MenuProvider
    public final void onPrepareMenu(Menu menu) {
        this.f173a.aK(menu);
    }
}
