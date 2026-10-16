package defpackage;

import android.content.Context;
import android.support.v4.app.FragmentContainerView;

/* loaded from: classes2.dex */
public final class enz implements afec {
    private final int a;
    private FragmentContainerView b;

    public enz(int i) {
        this.a = i;
    }

    public final FragmentContainerView a() {
        FragmentContainerView fragmentContainerView = this.b;
        if (fragmentContainerView != null) {
            return fragmentContainerView;
        }
        throw new IllegalStateException("AndroidView has not created a container for " + this.a + " yet");
    }

    @Override // defpackage.afec
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        FragmentContainerView fragmentContainerView = new FragmentContainerView((Context) obj);
        fragmentContainerView.setId(this.a);
        this.b = fragmentContainerView;
        return fragmentContainerView;
    }
}
