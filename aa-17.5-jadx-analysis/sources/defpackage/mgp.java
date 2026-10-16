package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class mgp extends mgr {
    public View g;
    public final eqm h = new eqm();

    @Override // android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.g = layoutInflater.cloneInContext(kfl.j(requireContext())).inflate(R.layout.connection_error, viewGroup);
        this.h.fE(this, new lsh(this, 7));
        return this.g;
    }
}
