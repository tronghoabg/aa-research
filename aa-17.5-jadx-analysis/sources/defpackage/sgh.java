package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class sgh extends sfw {
    final sgg a = new sgg();

    @Override // defpackage.sfw
    public final yzz b() {
        return yzz.FRX_PRESETUP_UNPLUG_REPLUG;
    }

    @Override // android.support.v4.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.a.f(getChildFragmentManager(), "unplug_replug_dialog");
        return null;
    }
}
