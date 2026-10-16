package com.waze.planned_drive;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.waze.navigate.AddressItem;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class r implements com.waze.app_nav.l {

    /* renamed from: a, reason: collision with root package name */
    public static final q f33352a = new q();

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.app_nav.w f33353b;

    /* renamed from: c, reason: collision with root package name */
    private AddressItem f33354c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f33355d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f33356e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f33357f;

    /* renamed from: g, reason: collision with root package name */
    private bj f33358g;

    public r(com.waze.app_nav.w wVar) {
        h.g.b.x.f(wVar, "flowController");
        this.f33353b = wVar;
        this.f33358g = bj.f33256a;
    }

    private final Bundle i() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("PLANNED_DRIVE_FLOW_INPUT_INTENT_EXTRA", new s(null, this.f33354c, this.f33355d, this.f33356e, this.f33357f, this.f33358g));
        bundle.putInt("forcedOrientation", 1);
        return bundle;
    }

    public final Intent a(Context context) {
        h.g.b.x.f(context, "context");
        Intent intent = new Intent(context, (Class<?>) PlannedDriveActivity.class);
        intent.putExtra("planned_drive_bundle", i());
        return intent;
    }

    public final com.waze.app_nav.p b() {
        return new com.waze.app_nav.p(PlannedDriveFragment.class, i(), 4);
    }

    public final r c(bj bjVar) {
        h.g.b.x.f(bjVar, "caller");
        this.f33358g = bjVar;
        return this;
    }

    public final r d(AddressItem addressItem) {
        this.f33354c = addressItem;
        return this;
    }

    public final r e(boolean z) {
        this.f33356e = z;
        return this;
    }

    public final r f() {
        this.f33355d = true;
        return this;
    }

    public final r g() {
        this.f33357f = true;
        return this;
    }

    public final void h() {
        com.waze.alerters.a.k.c(this.f33353b, b(), new com.waze.app_nav.ah(false, null, null, 6));
    }
}
