package com.waze.ifs.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ch;
import com.waze.R;
import com.waze.navigate.AddressItem;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class EditMapLocationActivity extends a implements com.waze.reports.m {

    /* renamed from: f, reason: collision with root package name */
    public static final String f24463f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f24464g;

    /* renamed from: h, reason: collision with root package name */
    public static final String f24465h;

    /* renamed from: k, reason: collision with root package name */
    public static final String f24466k;

    /* renamed from: l, reason: collision with root package name */
    public static final String f24467l;
    public static final String m;
    public static final String n;
    public static final String o;
    private static final String p = "com.waze.ifs.ui.EditMapLocationActivity";

    static {
        String name = EditMapLocationActivity.class.getName();
        f24463f = String.valueOf(name).concat(".arg.title");
        f24464g = String.valueOf(name).concat(".arg.button");
        f24465h = String.valueOf(name).concat(".arg.type");
        f24466k = String.valueOf(name).concat(".arg.center_lon");
        f24467l = String.valueOf(name).concat(".arg.center_lat");
        m = String.valueOf(name).concat(".arg.lon");
        n = String.valueOf(name).concat(".arg.lat");
        o = String.valueOf(name).concat(".ret.back_pressed");
    }

    @Override // com.waze.reports.m
    public final void l(com.waze.reports.l lVar) {
        com.waze.av.a.p pVar = lVar.f33944c;
        AddressItem addressItem = new AddressItem(lVar.f33942a, lVar.f33943b, null, pVar.b().b(), pVar.b().a(), pVar.b().f(), pVar.b().c(), null, null);
        Intent intent = new Intent();
        intent.putExtra("ai", addressItem);
        setResult(-1, intent);
        finish();
    }

    @Override // com.waze.sharedui.a.e, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent();
        intent.putExtra(o, true);
        setResult(-1, intent);
        finish();
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, com.waze.app_nav.hub.af, android.support.v4.app.av, androidx.activity.ComponentActivity, android.support.v4.app.dd, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        com.waze.reports.n nVar;
        super.onCreate(bundle);
        setContentView(R.layout.fragment_activity_empty);
        if (bundle == null) {
            nVar = new com.waze.reports.n();
            ch chVarU = bv().u();
            chVarU.q(R.id.container, nVar);
            chVarU.a();
        } else {
            nVar = (com.waze.reports.n) bv().g(R.id.container);
        }
        Intent intent = getIntent();
        int intExtra = intent.getIntExtra(f24463f, -1);
        if (intExtra != -1) {
            nVar.g(intExtra);
        }
        nVar.c(intent.getStringExtra(f24464g));
        nVar.h(intent.getIntExtra(f24465h, 0));
        nVar.f(intent.getIntExtra(m, 0), intent.getIntExtra(n, 0));
        intent.getIntExtra(f24466k, 0);
        intent.getIntExtra(f24467l, 0);
    }
}
