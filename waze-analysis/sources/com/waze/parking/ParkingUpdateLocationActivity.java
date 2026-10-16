package com.waze.parking;

import android.os.Build;
import android.os.Bundle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.waze.navigate.gn;
import h.g.b.ar;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public class ParkingUpdateLocationActivity extends h {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f32938f = 0;

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, com.waze.app_nav.hub.af, android.support.v4.app.av, androidx.activity.ComponentActivity, android.support.v4.app.dd, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.waze.shared_infra.h.c cVar = Build.VERSION.SDK_INT >= 33 ? (com.waze.shared_infra.h.c) getIntent().getSerializableExtra("original_parking_location", com.waze.shared_infra.h.c.class) : (com.waze.shared_infra.h.c) getIntent().getSerializableExtra("original_parking_location");
        if (cVar == null) {
            finish();
            return;
        }
        h.g.b.x.f(cVar, "originalParking");
        ParkingUpdateLocationActivity parkingUpdateLocationActivity = this;
        gn gnVar = new gn(cVar, 9);
        ViewModelStore viewModelStore = parkingUpdateLocationActivity.getViewModelStore();
        CreationExtras defaultViewModelCreationExtras = parkingUpdateLocationActivity.getDefaultViewModelCreationExtras();
        org.a.d.k.b bVarD = org.chromium.support_lib_boundary.a.b.d(parkingUpdateLocationActivity);
        int i2 = ar.f48106a;
        ComponentActivityKt.setContent$default(parkingUpdateLocationActivity, null, ComposableLambdaKt.composableLambdaInstance(205783444, true, new f((y) org.a.b.c.a.a(new h.g.b.m(y.class), viewModelStore, defaultViewModelCreationExtras, bVarD, gnVar), this, 1)), 1, null);
    }
}
