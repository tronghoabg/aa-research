package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.projection.gearhead.R;
import j$.util.Optional;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes2.dex */
public final class mlg extends mku {
    public en d;
    public oqf f;
    public final Object c = new Object();
    public Optional e = Optional.empty();

    @Override // defpackage.exv
    public final void e(Bundle bundle, String str) throws Resources.NotFoundException {
        h(R.xml.settings_connect_wireless, str);
        k("key_settings_connection_wireless").n(String.format(getString(R.string.settings_connection_setup_wireless_summary_format), 2021));
        k("key_settings_connection_options").o = new mky(this, 3);
        p();
    }

    @Override // defpackage.mku
    public final yzz l() {
        return yzz.SETTINGS_CONNECT_A_CAR_WIRELESS;
    }

    @Override // defpackage.mku, defpackage.exv, android.support.v4.app.Fragment
    /* renamed from: onCreate */
    public final void m107lambda$performCreate$3$androidsupportv4appFragment(Bundle bundle) {
        super.m107lambda$performCreate$3$androidsupportv4appFragment(bundle);
        this.f = new oqf();
        o(new mld(this, 2));
    }

    @Override // defpackage.exv, android.support.v4.app.Fragment
    public final void onStop() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f.a();
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter.getScanMode() != 20) {
            oqm.b(defaultAdapter, 20);
        }
        super.onStop();
    }

    public final void p() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null || !defaultAdapter.isEnabled()) {
            return;
        }
        o(new mkv(this, defaultAdapter.getName(), 2));
    }
}
