package com.google.android.apps.auto.components.settings.connectacar;

import android.os.Bundle;
import com.google.android.apps.auto.components.connectivity.models.CarInfoWrapper$Core;
import com.google.android.projection.gearhead.R;
import defpackage.bf;
import defpackage.mks;
import defpackage.mku;
import defpackage.mkz;

/* loaded from: classes2.dex */
public class CarDetailsActivity extends mks {
    @Override // defpackage.mks
    protected final int A() {
        return R.string.settings_connection_car_title_no_connection;
    }

    @Override // defpackage.mks
    protected final mku B() {
        Bundle extras = getIntent().getExtras();
        extras.getClass();
        CarInfoWrapper$Core carInfoWrapper$Core = (CarInfoWrapper$Core) extras.getParcelable("key_car_info_core");
        mkz mkzVar = (mkz) new bf().a(getClassLoader(), mkz.class.getName());
        Bundle bundle = new Bundle();
        bundle.putParcelable("key_car_info_core", carInfoWrapper$Core);
        mkzVar.setArguments(bundle);
        return mkzVar;
    }
}
