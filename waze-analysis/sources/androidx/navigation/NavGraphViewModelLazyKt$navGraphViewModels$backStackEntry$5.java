package androidx.navigation;

import android.support.v4.app.ar;
import androidx.navigation.fragment.FragmentKt;
import h.g.a.a;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$5 implements a<NavBackStackEntry> {
    final /* synthetic */ int $navGraphId;
    final /* synthetic */ ar $this_navGraphViewModels;

    public NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$5(ar arVar, int i2) {
        this.$this_navGraphViewModels = arVar;
        this.$navGraphId = i2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h.g.a.a
    public final NavBackStackEntry invoke() {
        return FragmentKt.findNavController(this.$this_navGraphViewModels).getBackStackEntry(this.$navGraphId);
    }
}
