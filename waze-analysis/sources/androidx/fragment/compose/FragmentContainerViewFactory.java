package androidx.fragment.compose;

import android.content.Context;
import android.support.v4.app.FragmentContainerView;
import android.view.View;
import h.g.a.l;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
final class FragmentContainerViewFactory implements l<Context, View> {
    private final int containerId;
    private FragmentContainerView lastCreatedContainer;

    public FragmentContainerViewFactory(int i2) {
        this.containerId = i2;
    }

    public final FragmentContainerView getContainer() {
        FragmentContainerView fragmentContainerView = this.lastCreatedContainer;
        if (fragmentContainerView != null) {
            return fragmentContainerView;
        }
        throw new IllegalStateException("AndroidView has not created a container for " + this.containerId + " yet");
    }

    @Override // h.g.a.l
    public FragmentContainerView invoke(Context context) {
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        fragmentContainerView.setId(this.containerId);
        this.lastCreatedContainer = fragmentContainerView;
        return fragmentContainerView;
    }
}
