package androidx.navigation;

import android.support.v4.app.ar;
import androidx.navigation.fragment.FragmentKt;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$8 implements a<NavBackStackEntry> {
    final /* synthetic */ String $navGraphRoute;
    final /* synthetic */ ar $this_navGraphViewModels;

    public NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$8(ar arVar, String str) {
        this.$this_navGraphViewModels = arVar;
        this.$navGraphRoute = str;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h.g.a.a
    public final NavBackStackEntry invoke() {
        return FragmentKt.findNavController(this.$this_navGraphViewModels).getBackStackEntry(this.$navGraphRoute);
    }
}
