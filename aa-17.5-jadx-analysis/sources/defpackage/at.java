package defpackage;

import android.os.Bundle;
import android.support.v4.app.Fragment;

/* loaded from: classes.dex */
public final class at extends az {
    final /* synthetic */ Fragment a;

    public at(Fragment fragment) {
        this.a = fragment;
    }

    @Override // defpackage.az
    public final void a() {
        Fragment fragment = this.a;
        fragment.mSavedStateRegistryController.a();
        erg.b(fragment);
        Bundle bundle = fragment.mSavedFragmentState;
        fragment.mSavedStateRegistryController.b(bundle != null ? bundle.getBundle("registryState") : null);
    }
}
