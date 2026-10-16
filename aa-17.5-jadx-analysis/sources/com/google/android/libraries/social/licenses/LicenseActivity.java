package com.google.android.libraries.social.licenses;

import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.Layout;
import android.view.MenuItem;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.projection.gearhead.R;
import defpackage.eaj;
import defpackage.ebe;
import defpackage.ebm;
import defpackage.ef;
import defpackage.ep;
import defpackage.oa;
import defpackage.od;
import defpackage.vuf;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class LicenseActivity extends ep {
    @Override // defpackage.bc, defpackage.ob, defpackage.cs, android.app.Activity
    public final void onCreate(Bundle bundle) throws Resources.NotFoundException, IOException {
        od.a(this);
        super.onCreate(bundle);
        setContentView(R.layout.libraries_social_licenses_license_activity_appcompat);
        final Toolbar toolbar = (Toolbar) findViewById(R.id.license_toolbar);
        q(toolbar);
        License license = (License) getIntent().getParcelableExtra("license");
        if (o() != null) {
            ef efVarO = o();
            String str = license.a;
            efVarO.j(str);
            ArrayList<View> arrayList = new ArrayList<>();
            toolbar.findViewsWithText(arrayList, str, 1);
            if (arrayList.size() == 1) {
                ebm.p(arrayList.get(0), true);
            }
            o().s();
            o().g(true);
            o().u();
        }
        View viewFindViewById = findViewById(R.id.license_activity_root);
        final ScrollView scrollView = (ScrollView) findViewById(R.id.license_activity_scrollview);
        final int paddingLeft = toolbar.getPaddingLeft();
        final int paddingTop = toolbar.getPaddingTop();
        final int paddingRight = toolbar.getPaddingRight();
        final int paddingBottom = toolbar.getPaddingBottom();
        final int paddingLeft2 = scrollView.getPaddingLeft();
        final int paddingTop2 = scrollView.getPaddingTop();
        final int paddingRight2 = scrollView.getPaddingRight();
        final int paddingBottom2 = scrollView.getPaddingBottom();
        eaj eajVar = new eaj() { // from class: weg
            @Override // defpackage.eaj
            public final ecy a(View view, ecy ecyVar) {
                dve dveVarF = ecyVar.f(519);
                int i = dveVarF.b;
                int i2 = dveVarF.c;
                int i3 = dveVarF.d;
                toolbar.setPadding(paddingLeft + i, paddingTop + i2, paddingRight + i3, paddingBottom);
                int i4 = dveVarF.e;
                scrollView.setPadding(paddingLeft2 + i, paddingTop2, paddingRight2 + i3, paddingBottom2 + i4);
                ecm eclVar = Build.VERSION.SDK_INT >= 36 ? new ecl(ecyVar) : Build.VERSION.SDK_INT >= 35 ? new eck(ecyVar) : Build.VERSION.SDK_INT >= 34 ? new ecj(ecyVar) : Build.VERSION.SDK_INT >= 31 ? new eci(ecyVar) : Build.VERSION.SDK_INT >= 30 ? new ech(ecyVar) : Build.VERSION.SDK_INT >= 29 ? new ecg(ecyVar) : new ecf(ecyVar);
                eclVar.g(519, dve.e(i, 0, i3, i4));
                return eclVar.a();
            }
        };
        int[] iArr = ebm.a;
        ebe.e(viewFindViewById, eajVar);
        TextView textView = (TextView) findViewById(R.id.license_activity_textview);
        String strQ = vuf.Q(this, "third_party_licenses", license.b, license.c);
        if (strQ == null) {
            finish();
        } else {
            textView.setText(strQ);
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    @Override // android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        ScrollView scrollView = (ScrollView) findViewById(R.id.license_activity_scrollview);
        int i = bundle.getInt("scroll_pos");
        if (i != 0) {
            scrollView.post(new oa(this, i, scrollView, 20));
        }
    }

    @Override // defpackage.ob, defpackage.cs, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ScrollView scrollView = (ScrollView) findViewById(R.id.license_activity_scrollview);
        Layout layout = ((TextView) findViewById(R.id.license_activity_textview)).getLayout();
        if (layout != null) {
            bundle.putInt("scroll_pos", layout.getLineStart(layout.getLineForVertical(scrollView.getScrollY())));
        }
    }
}
