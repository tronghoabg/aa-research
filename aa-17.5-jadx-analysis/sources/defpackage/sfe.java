package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class sfe extends sfw {
    @Override // defpackage.sfw
    public final yzz b() {
        return yzz.FRX_PRESETUP_ERROR;
    }

    @Override // android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle arguments = getArguments();
        arguments.getClass();
        int i = arguments.getInt("com.google.android.gms.carsetup.setup.ErrorFragment.ERROR_TITLE");
        int i2 = arguments.getInt("com.google.android.gms.carsetup.setup.ErrorFragment.ERROR_MESSAGE");
        wou wouVar = new wou(requireContext(), 0);
        wouVar.A(i);
        wouVar.u(i2);
        wouVar.x(getString(R.string.common_exit), new mhb(this, 9));
        en enVarB = wouVar.b();
        enVarB.setOnCancelListener(new sdm(this, 2));
        enVarB.show();
        return null;
    }
}
