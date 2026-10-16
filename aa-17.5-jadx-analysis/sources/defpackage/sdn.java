package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.projection.gearhead.R;

/* loaded from: classes2.dex */
public final class sdn extends sei {
    @Override // defpackage.sei, android.support.v4.app.Fragment
    /* renamed from: onCreate */
    public final void m107lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m107lambda$performCreate$3$androidsupportv4appFragment(bundle);
        Context contextRequireContext = requireContext();
        ((bc) contextRequireContext).setTheme(R.style.Theme_Gearhead_Material3_DayNight_NoActionBar);
        wou wouVar = new wou(contextRequireContext, 0);
        wouVar.B(getString(R.string.car_presetup_frx_device_not_supported_title));
        wouVar.v(getString(R.string.car_presetup_frx_device_not_supported_sub_title));
        wouVar.x(getString(R.string.car_presetup_frx_device_not_supported_negative_button_name), new mhb(this, 8));
        en enVarB = wouVar.b();
        enVarB.setOnCancelListener(new sdm(this, 0));
        enVarB.show();
    }
}
