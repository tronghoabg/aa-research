package com.google.android.apps.auto.components.preflight.phone;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ScrollView;
import com.google.android.apps.auto.components.preflight.phone.PreflightPhonePermissionsActivity;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.materialswitch.MaterialSwitch;
import com.google.android.projection.gearhead.R;
import defpackage.acpc;
import defpackage.actj;
import defpackage.aczg;
import defpackage.dup;
import defpackage.en;
import defpackage.eyj;
import defpackage.kep;
import defpackage.kwo;
import defpackage.luk;
import defpackage.mdh;
import defpackage.mfq;
import defpackage.mfr;
import defpackage.mgy;
import defpackage.mhe;
import defpackage.mko;
import defpackage.mkp;
import defpackage.mpl;
import defpackage.onu;
import defpackage.ype;
import defpackage.yph;
import defpackage.yzy;
import defpackage.yzz;

/* loaded from: classes2.dex */
public class PreflightPhonePermissionsActivity extends mhe {
    public static final /* synthetic */ int p = 0;
    private static final yph u = yph.c("GH.Preflight.PhonePerm");
    public mfq m;
    public en n;
    public en o;

    @Override // defpackage.mhe
    protected final void A(ScrollView scrollView) {
        getLayoutInflater().inflate(R.layout.preflight_phonescreen_permissions, (ViewGroup) scrollView, true);
    }

    @Override // defpackage.mhe
    public final void B() {
        startActivity(new Intent(this, (Class<?>) PreflightPhoneDataNoticeActivity.class), luk.c());
        mfq mfqVar = this.m;
        mfqVar.getClass();
        mfqVar.a(yzy.bH);
        finish();
    }

    @Override // defpackage.mhe
    protected final boolean E() {
        return true;
    }

    @Override // defpackage.mhe, defpackage.bc, defpackage.ob, defpackage.cs, android.app.Activity
    protected final void onCreate(Bundle bundle) throws Resources.NotFoundException {
        super.onCreate(bundle);
        yph yphVar = u;
        ((ype) yphVar.l().ai((char) 4905)).u("onCreate");
        if (mdh.h()) {
            getWindow().addFlags(2621568);
        }
        luk.b();
        mfr mfrVar = new mfr(yzz.PREFLIGHT_PHONE_BULK_PERMISSIONS);
        this.m = mfrVar;
        mfrVar.b(this);
        if (dup.c(this, "android.permission.READ_CALENDAR") != 0) {
            findViewById(R.id.calendar_container).setVisibility(8);
        }
        if (!acpc.q() && !acpc.p()) {
            findViewById(R.id.assistant_container).setVisibility(8);
        }
        if (!actj.m()) {
            findViewById(R.id.assistant_notification_container).setVisibility(8);
        }
        ((ype) ((ype) yphVar.f()).ai((char) 4906)).u("Showing allow while locked switch");
        MaterialSwitch materialSwitch = (MaterialSwitch) findViewById(R.id.lock_allow_switch);
        mkp.b();
        materialSwitch.setChecked(mkp.a());
        materialSwitch.setOnCheckedChangeListener(new eyj(this, 4, null));
        MaterialSwitch materialSwitch2 = (MaterialSwitch) findViewById(R.id.location_allow_weather);
        materialSwitch2.setChecked(onu.a().j());
        int i = 0;
        if (aczg.h()) {
            materialSwitch2.setOnCheckedChangeListener(new mgy(this, materialSwitch2, i));
        } else {
            materialSwitch2.setVisibility(8);
        }
        if (kwo.b().f()) {
            ((ype) ((ype) yphVar.f()).ai((char) 4907)).u("Showing work profile permission acknowledgement");
            MaterialSwitch materialSwitch3 = (MaterialSwitch) findViewById(R.id.cross_profile_switch);
            mko mkoVarA = mpl.f().a();
            materialSwitch3.setChecked(mkoVarA.g("key_work_profile_support", true));
            materialSwitch3.setOnCheckedChangeListener(new mgy(this, mkoVarA, 1));
        } else {
            findViewById(R.id.cross_profile_container).setVisibility(8);
        }
        final mko mkoVarA2 = mpl.f().a();
        final MaterialSwitch materialSwitch4 = (MaterialSwitch) findViewById(R.id.assistant_notification_switch);
        final Drawable drawable = getResources().getDrawable(R.drawable.gs_warning_vd_24);
        drawable.setTint(getResources().getColor(R.color.google_material_blue_300));
        materialSwitch4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: mgx
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                if (z) {
                    return;
                }
                final mko mkoVar = mkoVarA2;
                final MaterialSwitch materialSwitch5 = materialSwitch4;
                Drawable drawable2 = drawable;
                final PreflightPhonePermissionsActivity preflightPhonePermissionsActivity = this.a;
                wou wouVar = new wou(preflightPhonePermissionsActivity, 0);
                wouVar.A(R.string.permissions_settings_assistant_notifications_alert_dialog_title);
                wouVar.u(R.string.permissions_settings_assistant_notifications_alert_dialog_body);
                wouVar.t(drawable2);
                wouVar.y(R.string.permissions_settings_assistant_notifications_alert_dialog_turn_off, new DialogInterface.OnClickListener() { // from class: mgz
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) throws Resources.NotFoundException {
                        materialSwitch5.setChecked(false);
                        mkoVar.b("key_settings_messaging_allow_notification_data_sharing_agsa", false);
                        mfq mfqVar = preflightPhonePermissionsActivity.m;
                        mfqVar.getClass();
                        mfqVar.a(yzy.dT);
                    }
                });
                wouVar.w(R.string.permissions_settings_assistant_notifications_alert_dialog_cancel, new jmn(mkoVar, materialSwitch5, 4));
                preflightPhonePermissionsActivity.o = wouVar.b();
                preflightPhonePermissionsActivity.o.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: mha
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) throws Resources.NotFoundException {
                        int i2 = PreflightPhonePermissionsActivity.p;
                        mkoVar.b("key_settings_messaging_allow_notification_data_sharing_agsa", true);
                        materialSwitch5.setChecked(true);
                    }
                });
                preflightPhonePermissionsActivity.o.show();
            }
        });
        ((MaterialToolbar) findViewById(R.id.toolbar)).q(new kep(this, 19));
        Button button = (Button) findViewById(R.id.secondary_button);
        button.setVisibility(0);
        button.setOnClickListener(new kep(this, 18));
    }

    @Override // defpackage.ep, defpackage.bc, android.app.Activity
    public final void onDestroy() {
        en enVar = this.n;
        if (enVar != null && enVar.isShowing()) {
            this.n.dismiss();
        }
        en enVar2 = this.o;
        if (enVar2 != null && enVar2.isShowing()) {
            this.o.dismiss();
        }
        super.onDestroy();
    }
}
