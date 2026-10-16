package androidx.navigation.fragment;

import android.view.View;
import androidx.navigation.fragment.FragmentNavigator;
import h.g.b.x;
import h.k;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class FragmentNavigatorExtrasKt {
    public static final FragmentNavigator.Extras FragmentNavigatorExtras(k<? extends View, String>... kVarArr) {
        x.f(kVarArr, "sharedElements");
        FragmentNavigator.Extras.Builder builder = new FragmentNavigator.Extras.Builder();
        for (k<? extends View, String> kVar : kVarArr) {
            builder.addSharedElement((View) kVar.a(), (String) kVar.b());
        }
        return builder.build();
    }
}
