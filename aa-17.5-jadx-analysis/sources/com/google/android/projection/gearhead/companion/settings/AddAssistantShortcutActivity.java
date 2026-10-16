package com.google.android.projection.gearhead.companion.settings;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.projection.gearhead.R;
import com.google.android.projection.gearhead.companion.settings.AddAssistantShortcutActivity;
import defpackage.abnv;
import defpackage.abon;
import defpackage.acsi;
import defpackage.ebf;
import defpackage.ef;
import defpackage.ep;
import defpackage.kfl;
import defpackage.lbh;
import defpackage.lhl;
import defpackage.mki;
import defpackage.mrc;
import defpackage.mrg;
import defpackage.mrk;
import defpackage.rrc;
import defpackage.uk;
import defpackage.wnd;
import defpackage.wne;
import defpackage.wwt;
import defpackage.wzv;
import defpackage.wzw;
import defpackage.ype;
import defpackage.yph;
import defpackage.yxy;
import defpackage.yzy;
import defpackage.yzz;
import java.util.List;
import java.util.UUID;

/* loaded from: classes3.dex */
public class AddAssistantShortcutActivity extends ep {
    public static final yph m = yph.c("GH.AddAssistantSA");
    public EditText n;
    public EditText o;
    public mrg p;
    private final lhl q = new wzv(this);
    private MaterialButton r;
    private View s;

    public final void A() {
        ((ype) m.l().ai((char) 9989)).u("test query, not connected to car");
        Snackbar.k(this.o, R.string.settings_customize_add_assistant_test_query_error_car_not_connected).f();
        ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.LAUNCHER_SHORTCUT, yzy.uN).l());
    }

    public final void B() {
        boolean zI = lbh.d().i();
        MaterialButton materialButton = this.r;
        if (zI) {
            materialButton.setEnabled(false);
            this.s.setOnClickListener(new wwt(this, 15));
        } else {
            materialButton.setEnabled(true);
            this.s.setOnClickListener(new wwt(this, 16));
        }
    }

    @Override // defpackage.bc, defpackage.ob, defpackage.cs, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!acsi.e() || !acsi.d()) {
            finish();
            return;
        }
        kfl.k(getTheme());
        mrg mrgVar = null;
        uk ukVar = new uk((short[]) null);
        ukVar.a = R.style.ThemeOverlay_Gearhead_M3_Settings;
        wnd.a(this, new wne(ukVar));
        setContentView(R.layout.material3_activity_add_assistant_shortcut);
        q((Toolbar) findViewById(R.id.toolbar));
        ((MaterialCardView) findViewById(R.id.icon_circular_crop_container)).f(((MaterialCardView) findViewById(R.id.icon_bg)).e());
        boolean z = mki.a.c.getSharedPreferences("AssistantPreferences", 0).getBoolean("GEMINI_ENABLED_KEY", false);
        ef efVarO = o();
        if (z) {
            ImageView imageView = (ImageView) findViewById(R.id.badge);
            TextInputLayout textInputLayout = (TextInputLayout) findViewById(R.id.query_container);
            ((MaterialButton) findViewById(R.id.test)).i(getDrawable(2131233026));
            imageView.setImageDrawable(getDrawable(2131233026));
            textInputLayout.n(textInputLayout.getResources().getText(R.string.settings_customize_add_gemini_shortcut_query_hint));
            textInputLayout.l(getString(R.string.settings_customize_add_gemini_shortcut_query_helper_text));
            efVarO.i(R.string.settings_customize_add_gemini_shortcut_activity_title);
        } else {
            efVarO.i(R.string.settings_customize_add_assistant_shortcut_activity_title);
        }
        o().g(true);
        this.o = (EditText) findViewById(R.id.query);
        Button button = (Button) findViewById(R.id.add);
        button.setOnClickListener(new View.OnClickListener() { // from class: wzu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AddAssistantShortcutActivity addAssistantShortcutActivity = this.a;
                String strTrim = addAssistantShortcutActivity.n.getText().toString().trim();
                String strTrim2 = addAssistantShortcutActivity.o.getText().toString().trim();
                if (TextUtils.isEmpty(strTrim)) {
                    Snackbar.k(addAssistantShortcutActivity.n, R.string.settings_customize_add_assistant_shortcut_error_label_empty).f();
                    return;
                }
                if (TextUtils.isEmpty(strTrim2)) {
                    Snackbar.k(addAssistantShortcutActivity.n, R.string.settings_customize_add_assistant_shortcut_error_query_empty).f();
                    return;
                }
                if (addAssistantShortcutActivity.p == null) {
                    mrj mrjVarB = mrj.b();
                    mrg mrgVarA = null;
                    if (acsi.e() && acsi.d()) {
                        wer.c();
                        woy.O(!TextUtils.isEmpty(strTrim), "Assistant shortcut must contain a label");
                        woy.O(!TextUtils.isEmpty(strTrim2), "Assistant shortcut must contain a query");
                        ((ype) mrj.a.l().ai(5216)).K("addAssistantShortcut l=%s, qlen=%d", strTrim, strTrim2.length());
                        abnp abnpVarN = mrg.a.n();
                        String string = UUID.randomUUID().toString();
                        abnpVarN.t();
                        mrg mrgVar2 = (mrg) abnpVarN.b;
                        string.getClass();
                        mrgVar2.b |= 4;
                        mrgVar2.f = string;
                        abnpVarN.t();
                        mrg mrgVar3 = (mrg) abnpVarN.b;
                        strTrim.getClass();
                        mrgVar3.b |= 1;
                        mrgVar3.e = strTrim;
                        abnp abnpVarN2 = mrc.a.n();
                        abnpVarN2.t();
                        mrc mrcVar = (mrc) abnpVarN2.b;
                        strTrim2.getClass();
                        mrcVar.b |= 1;
                        mrcVar.c = strTrim2;
                        mrc mrcVar2 = (mrc) abnpVarN2.q();
                        abnpVarN.t();
                        mrg mrgVar4 = (mrg) abnpVarN.b;
                        mrcVar2.getClass();
                        mrgVar4.d = mrcVar2;
                        mrgVar4.c = 4;
                        mrgVarA = mrjVarB.a((mrg) abnpVarN.q());
                        ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.LAUNCHER_SHORTCUT, yzy.uP).l());
                    }
                    if (mrgVarA != null) {
                        Intent intent = new Intent();
                        intent.putExtra("RETURN_RECORD", mrgVarA.h());
                        addAssistantShortcutActivity.setResult(-1, intent);
                    }
                } else {
                    mrj mrjVarB2 = mrj.b();
                    mrg mrgVar5 = addAssistantShortcutActivity.p;
                    if (acsi.e() && acsi.d()) {
                        wer.c();
                        woy.O(!TextUtils.isEmpty(strTrim), "Assistant shortcut must contain a label");
                        woy.O(!TextUtils.isEmpty(strTrim2), "Assistant shortcut must contain a query");
                        ((ype) mrj.a.l().ai(5224)).K("updateAssistantShortcut l=%s, qlen=%d", strTrim, strTrim2.length());
                        List list = mrjVarB2.b;
                        int iIndexOf = list.indexOf(mrgVar5);
                        if (iIndexOf < 0) {
                            throw new IllegalArgumentException("existing record not found");
                        }
                        abnp abnpVarK = mrgVar5.K();
                        String str = mrgVar5.f;
                        abnpVarK.t();
                        mrg mrgVar6 = (mrg) abnpVarK.b;
                        str.getClass();
                        mrgVar6.b |= 4;
                        mrgVar6.f = str;
                        abnpVarK.t();
                        mrg mrgVar7 = (mrg) abnpVarK.b;
                        strTrim.getClass();
                        mrgVar7.b |= 1;
                        mrgVar7.e = strTrim;
                        abnp abnpVarN3 = mrc.a.n();
                        abnpVarN3.t();
                        mrc mrcVar3 = (mrc) abnpVarN3.b;
                        strTrim2.getClass();
                        mrcVar3.b |= 1;
                        mrcVar3.c = strTrim2;
                        mrc mrcVar4 = (mrc) abnpVarN3.q();
                        abnpVarK.t();
                        mrg mrgVar8 = (mrg) abnpVarK.b;
                        mrcVar4.getClass();
                        mrgVar8.d = mrcVar4;
                        mrgVar8.c = 4;
                        list.set(iIndexOf, (mrg) abnpVarK.q());
                        mrjVarB2.c();
                        mrjVarB2.d();
                        ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.LAUNCHER_SHORTCUT, yzy.uO).l());
                    }
                    addAssistantShortcutActivity.setResult(-1);
                }
                addAssistantShortcutActivity.finish();
            }
        });
        TextView textView = (TextView) findViewById(R.id.icon_label);
        ImageView imageView2 = (ImageView) findViewById(R.id.icon);
        mrk mrkVar = new mrk(getResources());
        mrkVar.a = textView.getText().toString();
        imageView2.setImageDrawable(mrkVar);
        this.r = (MaterialButton) findViewById(R.id.test);
        View viewFindViewById = findViewById(R.id.test_wrapper);
        this.s = viewFindViewById;
        viewFindViewById.setOnClickListener(new wwt(this, 17));
        EditText editText = (EditText) findViewById(R.id.label);
        this.n = editText;
        editText.addTextChangedListener(new wzw(this, mrkVar, textView, imageView2));
        B();
        Intent intent = getIntent();
        if (intent != null) {
            Bundle bundleExtra = intent.getBundleExtra("PAYLOAD");
            byte[] byteArray = bundleExtra != null ? bundleExtra.getByteArray("EXISTING_RECORD") : null;
            if (byteArray == null) {
                ((ype) m.l().ai((char) 9985)).u("existing record not found");
            } else {
                try {
                    mrgVar = (mrg) abnv.x(mrg.a, byteArray);
                } catch (abon e) {
                    ((ype) ((ype) ((ype) m.g()).p(e)).ai((char) 9986)).u("Error parsing LauncherShortcutRecord");
                    finish();
                }
            }
        }
        this.p = mrgVar;
        if (mrgVar != null && bundle == null) {
            ((ype) m.l().ai((char) 9987)).u("updating state with existing record");
            EditText editText2 = this.o;
            mrg mrgVar2 = this.p;
            editText2.setText((mrgVar2.c == 4 ? (mrc) mrgVar2.d : mrc.a).c);
            this.n.setText(this.p.e);
            button.setText(R.string.settings_customize_add_assistant_shortcut_save_button);
        }
        lbh.d().gK(this.q);
        if (bundle == null) {
            ebf.j().F(rrc.h(yxy.GEARHEAD, yzz.LAUNCHER_SHORTCUT, lbh.d().gN() ? yzy.uT : yzy.uU).l());
        }
    }

    @Override // defpackage.ep, defpackage.bc, android.app.Activity
    protected final void onDestroy() {
        super.onDestroy();
        lbh.d().d(this.q);
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
