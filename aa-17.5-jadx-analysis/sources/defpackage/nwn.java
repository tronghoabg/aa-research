package defpackage;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class nwn extends Fragment {
    static final /* synthetic */ afia[] a = {new affn(nwn.class, "holder", "getHolder()Lcom/google/android/apps/auto/components/system/notification/ui/HunViewFragment$Holder;", 0)};
    private final afgl b;

    public nwn() {
        getLifecycle().c(new mzq(this, 4));
        this.b = new mzr(this, 4);
    }

    @Override // android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        nwf nwfVar = new nwf(layoutInflater.getContext());
        ((nwm) this.b.getValue(this, a[0])).e(nwfVar);
        return nwfVar;
    }
}
