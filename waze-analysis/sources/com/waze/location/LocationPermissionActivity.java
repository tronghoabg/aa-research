package com.waze.location;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.core.app.ActivityCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import com.waze.car_lib.r.cq;
import com.waze.dv;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class LocationPermissionActivity extends com.waze.ifs.ui.a implements org.a.a.b.a {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f25168f = 0;

    /* renamed from: g, reason: collision with root package name */
    private final h.f f25169g;

    /* renamed from: h, reason: collision with root package name */
    private final h.f f25170h;

    public LocationPermissionActivity() {
        LocationPermissionActivity locationPermissionActivity = this;
        this.f25169g = org.a.b.b.d.b(locationPermissionActivity);
        this.f25170h = h.g.b(h.h.f48132c, new aj(locationPermissionActivity));
    }

    public static /* synthetic */ h.ab n(State state, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1379202437, i2, -1, "com.waze.location.LocationPermissionActivity.onCreate.<anonymous>.<anonymous> (LocationPermissionActivity.kt:53)");
            }
            com.waze.install.ah.b(v(state).c(), v(state).a(), v(state).b(), v(state).d(), composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }

    static final h.ab o(LocationPermissionActivity locationPermissionActivity, Composer composer, int i2) {
        if (composer.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(906255041, i2, -1, "com.waze.location.LocationPermissionActivity.onCreate.<anonymous> (LocationPermissionActivity.kt:43)");
            }
            cq.k(false, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1379202437, true, new dv(SnapshotStateKt.collectAsState(locationPermissionActivity.w().f(), new as(new com.waze.ui.ac.m(""), new com.waze.ui.ac.m(""), new com.waze.ui.ac.m(""), new com.waze.ab.z(6)), null, composer, 0, 2), 20), composer, 54), composer, 196608);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return h.ab.f48028a;
    }

    static final h.ab p(LocationPermissionActivity locationPermissionActivity, com.google.android.gms.location.g gVar) {
        com.google.android.gms.location.i iVarB = gVar.b();
        if (iVarB == null || !iVarB.a()) {
            locationPermissionActivity.w().i();
        } else {
            locationPermissionActivity.w().k();
        }
        return h.ab.f48028a;
    }

    public static final /* synthetic */ void q(LocationPermissionActivity locationPermissionActivity) {
        if (ActivityCompat.checkSelfPermission(locationPermissionActivity, "android.permission.ACCESS_FINE_LOCATION") != 0) {
            ActivityCompat.requestPermissions(locationPermissionActivity, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 1001);
        } else {
            locationPermissionActivity.w().h();
        }
    }

    static final void s(LocationPermissionActivity locationPermissionActivity, Exception exc) {
        h.g.b.x.f(exc, "e");
        if (exc instanceof com.google.android.gms.common.api.y) {
            try {
                ((com.google.android.gms.common.api.y) exc).c(locationPermissionActivity);
            } catch (IntentSender.SendIntentException unused) {
                locationPermissionActivity.w().i();
            }
        }
    }

    private static final as v(State state) {
        return (as) state.getValue();
    }

    private final ax w() {
        return (ax) this.f25170h.getValue();
    }

    @Override // com.waze.sharedui.a.e
    public final boolean bs() {
        return false;
    }

    @Override // com.waze.sharedui.a.e
    public final boolean bt() {
        return false;
    }

    @Override // org.a.a.b.a
    public final org.a.d.k.b l() {
        return (org.a.d.k.b) this.f25169g.getValue();
    }

    @Override // org.a.a.b.a
    public final /* synthetic */ void m() {
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, android.support.v4.app.av, androidx.activity.ComponentActivity, android.app.Activity
    protected final void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 == 1002) {
            LocationPermissionActivity locationPermissionActivity = this;
            w().m(ActivityCompat.checkSelfPermission(locationPermissionActivity, "android.permission.ACCESS_COARSE_LOCATION") == 0, ActivityCompat.checkSelfPermission(locationPermissionActivity, "android.permission.ACCESS_FINE_LOCATION") == 0);
        } else {
            if (i2 != 1003) {
                return;
            }
            w().j();
        }
    }

    @Override // com.waze.sharedui.a.e, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        w().g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, com.waze.app_nav.hub.af, android.support.v4.app.av, androidx.activity.ComponentActivity, android.support.v4.app.dd, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        aE();
        super.onCreate(bundle);
        ComponentActivityKt.setContent$default(this, null, ComposableLambdaKt.composableLambdaInstance(906255041, true, new af(this, 0 == true ? 1 : 0)), 1, null);
        kotlinx.coroutines.b.ai.m(kotlinx.coroutines.b.ai.K(w().e(), new ai(this, null)), LifecycleOwnerKt.getLifecycleScope(this));
        LocationPermissionActivity locationPermissionActivity = this;
        int iCheckSelfPermission = ActivityCompat.checkSelfPermission(locationPermissionActivity, "android.permission.ACCESS_FINE_LOCATION");
        int iCheckSelfPermission2 = ActivityCompat.checkSelfPermission(locationPermissionActivity, "android.permission.ACCESS_COARSE_LOCATION");
        w().o(iCheckSelfPermission2 == 0, iCheckSelfPermission == 0);
    }

    @Override // android.support.v4.app.av, androidx.activity.ComponentActivity, android.app.Activity, androidx.core.app.ActivityCompat.OnRequestPermissionsResultCallback
    public final void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        h.g.b.x.f(strArr, "permissions");
        h.g.b.x.f(iArr, "grantResults");
        super.onRequestPermissionsResult(i2, strArr, iArr);
        w().l(i2, iArr);
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, android.support.v7.app.o, android.support.v4.app.av, android.app.Activity
    protected final void onStart() {
        super.onStart();
        w().n();
    }
}
