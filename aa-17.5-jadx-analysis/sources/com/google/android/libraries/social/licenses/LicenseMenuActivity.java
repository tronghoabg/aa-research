package com.google.android.libraries.social.licenses;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import com.google.android.projection.gearhead.R;
import defpackage.bt;
import defpackage.ebe;
import defpackage.ebm;
import defpackage.ep;
import defpackage.od;
import defpackage.w;
import defpackage.wei;
import defpackage.wel;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class LicenseMenuActivity extends ep {
    @Override // defpackage.bc, defpackage.ob, defpackage.cs, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        od.a(this);
        super.onCreate(bundle);
        setContentView(R.layout.libraries_social_licenses_license_menu_activity_appcompat);
        Toolbar toolbar = (Toolbar) findViewById(R.id.license_menu_toolbar);
        q(toolbar);
        CharSequence title = getTitle();
        ArrayList<View> arrayList = new ArrayList<>();
        toolbar.findViewsWithText(arrayList, title, 1);
        if (arrayList.size() == 1) {
            ebm.p(arrayList.get(0), true);
        }
        if (o() != null) {
            o().g(true);
        }
        View viewFindViewById = findViewById(R.id.license_menu_activity_root);
        wei weiVar = new wei(toolbar, toolbar.getPaddingLeft(), toolbar.getPaddingTop(), toolbar.getPaddingRight(), toolbar.getPaddingBottom(), 1);
        int[] iArr = ebm.a;
        ebe.e(viewFindViewById, weiVar);
        bt btVarA = a();
        if (btVarA.e(R.id.license_menu_fragment_container) instanceof wel) {
            return;
        }
        wel welVar = new wel();
        w wVar = new w(btVarA);
        wVar.e(R.id.license_menu_fragment_container, welVar, null, 1);
        wVar.c();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }
}
