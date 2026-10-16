package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.projection.gearhead.R;

/* loaded from: classes.dex */
public class mgr extends wmf {
    public bc k;

    @Override // defpackage.wmf, defpackage.fh, defpackage.ao
    public final Dialog gn(Bundle bundle) {
        Dialog dialogGn = super.gn(bundle);
        ((wme) dialogGn).setOnShowListener(new mgq());
        return dialogGn;
    }

    public final void i() {
        bc bcVar = this.k;
        if (bcVar != null) {
            bcVar.finish();
        }
    }

    @Override // defpackage.ao, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        i();
    }

    @Override // defpackage.ao, android.support.v4.app.Fragment
    /* renamed from: onCreate */
    public final void m107lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m107lambda$performCreate$3$androidsupportv4appFragment(bundle);
        this.k = getActivity();
    }

    @Override // android.support.v4.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Vibrator vibrator = (Vibrator) requireContext().getSystemService("vibrator");
        vibrator.getClass();
        vibrator.vibrate(VibrationEffect.createOneShot(1000L, -1));
        if (getContext() != null && requireContext().getResources().getDisplayMetrics().widthPixels / requireContext().getResources().getDisplayMetrics().density >= 600.0f) {
            if (acvh.n()) {
                ols.d(view);
            }
            BottomSheetBehavior.M((View) requireView().getParent()).f = getResources().getDimensionPixelSize(R.dimen.gm3_bottom_sheet_dialog_max_tablet_width);
        }
    }
}
