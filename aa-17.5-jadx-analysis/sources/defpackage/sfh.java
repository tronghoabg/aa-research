package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class sfh extends Fragment {
    private static final ypf a = ols.R("CAR.SETUP.FRX");
    private bc b;

    public final void a() {
        bc bcVar = this.b;
        if (bcVar == null) {
            a.h().ai(8858).u("IncompatibleAlertFragment dismiss called without being attached to activity.");
        } else {
            bcVar.finish();
            this.b.overridePendingTransition(0, 0);
        }
    }

    public final void b() {
        bc bcVar = this.b;
        if (bcVar != null) {
            bcVar.setTheme(R.style.BottomSheetTheme);
        }
    }

    @Override // android.support.v4.app.Fragment
    /* renamed from: onCreate */
    public final void m107lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m107lambda$performCreate$3$androidsupportv4appFragment(bundle);
        Context context = getContext();
        spu.aw(context);
        bc bcVar = (bc) context;
        this.b = bcVar;
        bcVar.setTheme(R.style.Theme_Gearhead_Material3_DayNight_NoActionBar);
        wou wouVar = new wou(context, 0);
        wouVar.B(getString(R.string.car_presetup_frx_device_not_supported_title));
        wouVar.v(getString(R.string.car_presetup_frx_device_not_supported_sub_title));
        wouVar.x(getString(R.string.car_presetup_frx_device_not_supported_negative_button_name), new mhb(this, 10));
        en enVarB = wouVar.b();
        enVarB.setOnCancelListener(new sdm(this, 3));
        enVarB.show();
    }

    @Override // android.support.v4.app.Fragment
    public final void onStart() {
        super.onStart();
        woy.aa(isAdded(), "Called IncompatibleAlertFragment#getController while detached from activity.");
        ((sfu) requireContext()).B().g.L(yzz.FRX_PRESETUP_INCOMPATIBLE, yzy.f);
    }
}
