package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.apps.auto.carservice.frx.phonescreen.PhonescreenFrxActivity;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public abstract class jms extends wmf {
    @Override // defpackage.wmf, defpackage.fh, defpackage.ao
    public final Dialog gn(Bundle bundle) {
        Dialog dialogGn = super.gn(bundle);
        ((wme) dialogGn).setOnShowListener(new les(1));
        return dialogGn;
    }

    protected abstract yzz h();

    public final void j(yzy yzyVar) {
        k().A(h(), yzyVar);
    }

    public final PhonescreenFrxActivity k() {
        return (PhonescreenFrxActivity) requireContext();
    }

    @Override // defpackage.ao, android.support.v4.app.Fragment
    /* renamed from: onCreate */
    public final void m107lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m107lambda$performCreate$3$androidsupportv4appFragment(bundle);
        if (bundle == null) {
            j(yzy.f);
        }
    }

    @Override // android.support.v4.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Context context = getContext();
        if (context != null && context.getResources().getDisplayMetrics().widthPixels / context.getResources().getDisplayMetrics().density >= 600.0f) {
            BottomSheetBehavior.M((View) requireView().getParent()).f = getResources().getDimensionPixelSize(R.dimen.gm3_bottom_sheet_dialog_max_tablet_width);
        }
    }
}
