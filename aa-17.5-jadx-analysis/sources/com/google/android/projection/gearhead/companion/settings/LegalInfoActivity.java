package com.google.android.projection.gearhead.companion.settings;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;
import defpackage.ebf;
import defpackage.ep;
import defpackage.kfl;
import defpackage.ols;
import defpackage.uk;
import defpackage.wnd;
import defpackage.wne;
import defpackage.yzy;
import defpackage.yzz;

/* loaded from: classes3.dex */
public class LegalInfoActivity extends ep {
    @Override // defpackage.bc, defpackage.ob, defpackage.cs, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("legal_title_key");
        kfl.k(getTheme());
        uk ukVar = new uk((short[]) null);
        ukVar.a = R.style.ThemeOverlay_Gearhead_M3_Settings;
        wnd.a(this, new wne(ukVar));
        setContentView(R.layout.material3_legal_info);
        q((Toolbar) findViewById(R.id.toolbar));
        o().j(stringExtra);
        ols.c(getWindow(), findViewById(R.id.legal_body));
        String stringExtra2 = getIntent().getStringExtra("legal_body_key");
        ((TextView) findViewById(R.id.legal_title)).setText(stringExtra);
        ((TextView) findViewById(R.id.legal_body)).setText(stringExtra2);
        o().g(true);
        Intent intent = getIntent();
        if (intent == null || !intent.getBooleanExtra("data_notice_notification", false)) {
            return;
        }
        ebf.j().o(yzz.DATA_NOTICE_NOTIFICATION, yzy.iG);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
