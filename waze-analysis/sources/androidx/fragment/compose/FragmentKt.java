package androidx.fragment.compose;

import android.support.v4.app.ar;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import h.ab;
import h.g.a.p;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public final class FragmentKt {
    public static final ComposeView content(ar arVar, p<? super Composer, ? super Integer, ab> pVar) {
        ComposeView composeView = new ComposeView(arVar.requireContext(), null, 0, 6, null);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.INSTANCE);
        composeView.setContent(pVar);
        return composeView;
    }
}
