package defpackage;

import android.support.v4.app.Fragment;
import android.view.View;

/* loaded from: classes.dex */
public final class av extends be {
    final /* synthetic */ Fragment a;

    public av(Fragment fragment) {
        this.a = fragment;
    }

    @Override // defpackage.be
    public final View a(int i) {
        Fragment fragment = this.a;
        View view = fragment.mView;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException(a.bm(fragment, "Fragment ", " does not have a view"));
    }

    @Override // defpackage.be
    public final boolean b() {
        return this.a.mView != null;
    }
}
