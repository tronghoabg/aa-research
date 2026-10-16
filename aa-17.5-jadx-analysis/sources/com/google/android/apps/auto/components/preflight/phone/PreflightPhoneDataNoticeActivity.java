package com.google.android.apps.auto.components.preflight.phone;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.projection.gearhead.R;
import defpackage.kep;
import defpackage.luk;
import defpackage.mdh;
import defpackage.mfl;
import defpackage.mfo;
import defpackage.mfp;
import defpackage.mfq;
import defpackage.mfr;
import defpackage.mgl;
import defpackage.mgw;
import defpackage.mhe;
import defpackage.yzy;
import defpackage.yzz;

/* loaded from: classes2.dex */
public class PreflightPhoneDataNoticeActivity extends mhe {
    public Drawable m;
    public Drawable n;
    private mfq o;

    @Override // defpackage.mhe
    protected final void A(ScrollView scrollView) {
        getLayoutInflater().inflate(R.layout.preflight_phonescreen_data_notice, (ViewGroup) scrollView, true);
    }

    @Override // defpackage.mhe
    public final void B() {
        mfo mfoVar = ((mfp) luk.b().a()).c;
        mfoVar.getClass();
        mfoVar.k.c(1).c();
        mfl mflVarA = luk.b().a();
        ((mfp) mflVarA).b.a(mgl.f);
        mfq mfqVar = this.o;
        mfqVar.getClass();
        mfqVar.a(yzy.bH);
        finish();
    }

    public final void C(View view) {
        ((TextView) view.findViewById(R.id.data_notice_entry_body)).setMaxLines(4);
        view.setOnClickListener(new kep(this, 17, null));
    }

    public final void D(View view) {
        if (((TextView) view.findViewById(R.id.data_notice_entry_body)).getLineCount() <= 4) {
            view.findViewById(R.id.data_notice_entry_arrow).setVisibility(8);
        } else {
            C(view);
        }
    }

    @Override // defpackage.mhe
    protected final boolean E() {
        return false;
    }

    @Override // defpackage.mhe, defpackage.bc, defpackage.ob, defpackage.cs, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (mdh.h()) {
            getWindow().addFlags(2621568);
        }
        luk.b();
        mfr mfrVar = new mfr(yzz.PREFLIGHT_PHONE_DATA_NOTICE);
        this.o = mfrVar;
        mfrVar.b(this);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.data_charges);
        ViewGroup viewGroup2 = (ViewGroup) findViewById(R.id.phone_to_car);
        ViewGroup viewGroup3 = (ViewGroup) findViewById(R.id.car_to_phone);
        ((ImageView) viewGroup.findViewById(R.id.data_notice_entry_icon)).setImageDrawable(getDrawable(R.drawable.gs_sd_card_alert_vd_theme_24));
        ((ImageView) viewGroup2.findViewById(R.id.data_notice_entry_icon)).setImageDrawable(getDrawable(R.drawable.gs_directions_car_vd_theme_24));
        ((ImageView) viewGroup3.findViewById(R.id.data_notice_entry_icon)).setImageDrawable(getDrawable(R.drawable.gs_smartphone_vd_theme_24));
        Drawable drawable = getDrawable(R.drawable.gs_expand_more_vd_theme_24);
        drawable.getClass();
        this.m = drawable;
        Drawable drawable2 = getDrawable(R.drawable.gs_expand_less_vd_theme_24);
        drawable2.getClass();
        this.n = drawable2;
        ((MaterialToolbar) findViewById(R.id.toolbar)).q(new kep(this, 15));
        ((TextView) viewGroup.findViewById(R.id.data_notice_entry_title)).setText(R.string.data_charges_title);
        ((TextView) viewGroup.findViewById(R.id.data_notice_entry_body)).setText(R.string.data_charges_body);
        ((ImageView) viewGroup.findViewById(R.id.data_notice_entry_arrow)).setImageDrawable(this.m);
        ((TextView) viewGroup2.findViewById(R.id.data_notice_entry_title)).setText(R.string.phone_to_car_title);
        ((TextView) viewGroup2.findViewById(R.id.data_notice_entry_body)).setText(R.string.phone_to_car_body);
        ((ImageView) viewGroup2.findViewById(R.id.data_notice_entry_arrow)).setImageDrawable(this.m);
        ((TextView) viewGroup3.findViewById(R.id.data_notice_entry_title)).setText(R.string.car_to_phone_title);
        ((TextView) viewGroup3.findViewById(R.id.data_notice_entry_body)).setText(R.string.car_to_phone_body);
        ((ImageView) viewGroup3.findViewById(R.id.data_notice_entry_arrow)).setImageDrawable(this.m);
        viewGroup.findViewById(R.id.data_notice_entry_body).post(new mgw(this, viewGroup, 1));
        viewGroup2.findViewById(R.id.data_notice_entry_body).post(new mgw(this, viewGroup2, 0));
        viewGroup3.findViewById(R.id.data_notice_entry_body).post(new mgw(this, viewGroup3, 2));
    }
}
