package com.waze.reports;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.waze.NativeManager;
import com.waze.R;
import com.waze.config.ConfigValues;
import com.waze.map.MapViewChooser;
import com.waze.map.canvas.ClosureCanvasDelegatorImpl;
import com.waze.sharedui.views.OvalButton;
import com.waze.view.title.TitleBar;
import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
@Deprecated
/* loaded from: classes7.dex */
public final class ClosureMap extends com.waze.ifs.ui.a {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f33535g = 0;

    /* renamed from: h, reason: collision with root package name */
    private static int f33536h = -1;

    /* renamed from: f, reason: collision with root package name */
    final j f33537f;

    /* renamed from: k, reason: collision with root package name */
    private MapViewChooser f33538k;

    /* renamed from: l, reason: collision with root package name */
    private OvalButton f33539l;
    private final com.waze.shared_infra.o.a m = com.waze.shared_infra.o.b.a();
    private boolean n;
    private final Runnable o;
    private final Runnable p;
    private ClosureCanvasDelegatorImpl q;

    public ClosureMap() {
        this.f33537f = (j) com.waze.web.r.i(j.class);
        this.o = new com.waze.g.f(this, 2);
        this.p = new com.waze.g.f(this, 3);
    }

    public static /* synthetic */ void n(ClosureMap closureMap, int i2, int i3, int i4) {
        com.waze.reports_v2.d.j.f34595a.a().i(i2 >= 0 ? com.waze.reports_v2.d.a.f34554b : com.waze.reports_v2.d.a.f34553a, i2 >= 0 ? Integer.valueOf(i3) : null, i2 >= 0 ? Integer.valueOf(i4) : null);
        closureMap.r(i2);
    }

    public static void o(Context context, boolean z, CompletableDeferred completableDeferred) {
        NativeManager.Post(new h(context, z, completableDeferred));
    }

    public static /* synthetic */ void q(ClosureMap closureMap) {
        closureMap.s();
        closureMap.finish();
    }

    private final void r(int i2) {
        p();
        View viewFindViewById = findViewById(R.id.reportSend);
        if (i2 >= 0) {
            viewFindViewById.setEnabled(true);
            viewFindViewById.setAlpha(1.0f);
        } else {
            viewFindViewById.setEnabled(false);
            viewFindViewById.setAlpha(0.5f);
        }
        f33536h = i2;
    }

    private final void s() {
        this.q.u();
        setResult(-1);
    }

    private final void v() {
        aE();
        setContentView(R.layout.closure_map);
        this.f33539l = (OvalButton) findViewById(R.id.reportLater);
        TitleBar titleBar = (TitleBar) findViewById(R.id.theTitleBar);
        com.waze.shared_infra.o.a aVar = this.m;
        titleBar.c(aVar.c(R.string.CLOSURE, new Object[0]));
        titleBar.m(new com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.n(this, 11));
        titleBar.n(new com.waze.main_screen.bottom_bars.scrollable_eta.scrollable_widgets.n(this, 12));
        findViewById(R.id.reportSend).setOnClickListener(new b(this, 5));
        findViewById(R.id.reportLater).setOnClickListener(new b(this, 6, (byte[]) null));
        MapViewChooser mapViewChooser = (MapViewChooser) findViewById(R.id.searchMapView);
        this.f33538k = mapViewChooser;
        mapViewChooser.d(getLifecycle());
        com.waze.map.canvas.r rVar = (com.waze.map.canvas.r) com.waze.web.r.h(com.waze.map.canvas.r.class);
        MapViewChooser mapViewChooser2 = this.f33538k;
        h.g.b.x.f(rVar, "<this>");
        h.g.b.x.f(mapViewChooser2, "mapViewChooser");
        this.q = rVar.a(mapViewChooser2.c());
        Intent intent = getIntent();
        boolean z = intent != null && intent.getBooleanExtra("reopened", false);
        MapViewChooser mapViewChooser3 = this.f33538k;
        if (z) {
            mapViewChooser3.f(this.p);
        } else {
            mapViewChooser3.f(this.o);
            f33536h = -1;
        }
        ((TextView) findViewById(R.id.reportSendText)).setText(this.n ? aVar.c(R.string.SEND, new Object[0]) : aVar.c(R.string.NEXT, new Object[0]));
        ((TextView) findViewById(R.id.TipText)).setText(aVar.c(R.string.TAP_ON_AN_ARROW, new Object[0]));
        ((TextView) findViewById(R.id.reportLaterText)).setText(aVar.c(R.string.LATER_CAPITAL, new Object[0]));
        r(f33536h);
        if (!z) {
            this.f33539l.z(10000L);
        }
        j jVar = this.f33537f;
        if (jVar != null) {
            jVar.b(new cx(this));
        }
        View viewFindViewById = findViewById(R.id.closureMapLayout);
        View viewFindViewById2 = findViewById(R.id.reportGenericButtonsArea);
        ViewCompat.setOnApplyWindowInsetsListener(viewFindViewById2, new i(this, viewFindViewById2, viewFindViewById));
    }

    @Override // com.waze.ifs.ui.a
    protected final int bq() {
        return 1;
    }

    @Override // com.waze.sharedui.a.e, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        s();
        super.onBackPressed();
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, com.waze.app_nav.hub.af, android.support.v7.app.o, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.q.u();
        v();
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, com.waze.app_nav.hub.af, android.support.v4.app.av, androidx.activity.ComponentActivity, android.support.v4.app.dd, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.n = ConfigValues.CONFIG_VALUE_REPORTING_CLOSURE_SIMPLIFIED.b().booleanValue();
        com.waze.reports_v2.d.j.f34595a.a().g();
        v();
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, com.waze.app_nav.hub.af, android.support.v7.app.o, android.support.v4.app.av, android.app.Activity
    protected final void onDestroy() {
        super.onDestroy();
        j jVar = this.f33537f;
        if (jVar != null) {
            jVar.b(null);
        }
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, android.support.v4.app.av, android.app.Activity
    public final void onPause() {
        super.onPause();
        p();
        this.q.u();
    }

    public final void p() {
        this.f33539l.A();
    }
}
