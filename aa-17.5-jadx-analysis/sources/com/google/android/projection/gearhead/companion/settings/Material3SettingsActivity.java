package com.google.android.projection.gearhead.companion.settings;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import com.google.android.projection.gearhead.R;
import defpackage.ebe;
import defpackage.ebm;
import defpackage.ef;
import defpackage.ep;
import defpackage.kfl;
import defpackage.ols;
import defpackage.onq;
import defpackage.uk;
import defpackage.w;
import defpackage.wnd;
import defpackage.wne;
import defpackage.xbo;
import defpackage.xbp;

/* loaded from: classes3.dex */
public class Material3SettingsActivity extends ep {
    private static final String m = xbp.class.getName();
    private static final String n = Material3ManageCarsFragment.class.getName();

    @Override // defpackage.bc, defpackage.ob, defpackage.cs, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Fragment xboVar;
        super.onCreate(bundle);
        kfl.k(getTheme());
        uk ukVar = new uk((short[]) null);
        ukVar.a = R.style.ThemeOverlay_Gearhead_M3_Settings;
        wnd.a(this, new wne(ukVar));
        setContentView(R.layout.material3_settings_display);
        q((Toolbar) findViewById(R.id.toolbar));
        ef efVarO = o();
        efVarO.g(true);
        wnd.a(this, new wne(new uk((short[]) null)));
        ols.c(getWindow(), findViewById(R.id.scroll_view));
        View viewFindViewById = findViewById(R.id.appbar_layout);
        onq onqVar = new onq(0);
        int[] iArr = ebm.a;
        ebe.e(viewFindViewById, onqVar);
        String stringExtra = getIntent().getStringExtra("fragment_name");
        if (bundle != null) {
            return;
        }
        if (stringExtra == null) {
            xboVar = new xbo();
        } else if (stringExtra.equals(m)) {
            xboVar = new xbp();
            efVarO.i(R.string.companion_legal_title);
        } else if (stringExtra.equals(n)) {
            xboVar = new Material3ManageCarsFragment();
            efVarO.i(R.string.settings_carmode_connected_car_title);
        } else {
            xboVar = new xbo();
        }
        w wVar = new w(a());
        wVar.q(R.id.container_settings_display, xboVar, null);
        wVar.i(false, true);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            if (a().b() > 0) {
                a().Q();
            } else {
                finish();
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
