package com.waze.planned_drive;

import android.os.Bundle;
import com.waze.R;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class PlannedDriveActivity extends com.waze.sharedui.a.e implements org.a.a.b.a {

    /* renamed from: f, reason: collision with root package name */
    private final h.f f33162f = org.a.b.b.d.c(this);

    @Override // org.a.a.b.a
    public final org.a.d.k.b l() {
        return (org.a.d.k.b) this.f33162f.getValue();
    }

    @Override // org.a.a.b.a
    public final /* synthetic */ void m() {
    }

    @Override // com.waze.sharedui.a.e, com.waze.app_nav.hub.af, android.support.v4.app.av, androidx.activity.ComponentActivity, android.support.v4.app.dd, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        aE();
        getWindow().setNavigationBarContrastEnforced(false);
        bv().aC(new b(this));
        super.onCreate(bundle);
        setContentView(R.layout.planned_drive_activity);
    }
}
