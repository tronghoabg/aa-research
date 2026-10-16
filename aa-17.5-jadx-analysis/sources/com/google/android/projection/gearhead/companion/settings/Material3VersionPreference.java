package com.google.android.projection.gearhead.companion.settings;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.preference.Preference;
import defpackage.acxa;
import defpackage.exm;
import defpackage.eyg;
import defpackage.kmu;
import defpackage.mhb;
import defpackage.vdv;
import defpackage.wou;
import defpackage.wub;
import defpackage.xyc;
import defpackage.yfq;
import defpackage.yph;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class Material3VersionPreference extends Preference implements View.OnLongClickListener, exm {
    public static final yph a = yph.c("GH.VersionPreference");
    public static final yfq b = yfq.q("com.google.vending");
    public int c;
    public boolean d;
    public Toast e;
    public final AtomicBoolean f;
    public Activity g;
    private boolean h;
    private final xyc i;

    public Material3VersionPreference(Context context) {
        super(context);
        this.h = false;
        this.f = new AtomicBoolean(false);
        this.i = wub.L(new vdv(this, 14));
    }

    @Override // androidx.preference.Preference
    public final void a(eyg eygVar) {
        super.a(eygVar);
        ((TextView) eygVar.E(R.id.summary)).setMaxLines(50);
        this.o = this;
        this.d = kmu.b().d("developer_settings_enabled");
        this.e = Toast.makeText(this.j, "", 0);
    }

    @Override // defpackage.exm
    public final boolean b() {
        boolean z = this.h;
        if (!z) {
            this.h = true;
            J(this.j.getString(com.google.android.projection.gearhead.R.string.settings_about_version_expanded));
            n((CharSequence) this.i.gu());
        }
        if (!this.d) {
            int i = this.c + 1;
            this.c = i;
            if (i >= 10) {
                if (!acxa.ae()) {
                    wou wouVar = new wou(this.j, 0);
                    wouVar.u(com.google.android.projection.gearhead.R.string.dev_settings_warning_message);
                    wouVar.A(com.google.android.projection.gearhead.R.string.dev_settings_warning_title);
                    wouVar.y(R.string.ok, new mhb(this, 13));
                    wouVar.w(R.string.cancel, new mhb(this, 14));
                    wouVar.b().show();
                } else if (this.f.compareAndSet(false, true)) {
                    wou wouVar2 = new wou(this.j, 0);
                    wouVar2.u(com.google.android.projection.gearhead.R.string.dev_settings_warning_message);
                    wouVar2.A(com.google.android.projection.gearhead.R.string.dev_settings_warning_title);
                    wouVar2.s(false);
                    wouVar2.y(R.string.ok, new mhb(this, 15));
                    wouVar2.w(R.string.cancel, new mhb(this, 16));
                    wouVar2.b().show();
                }
            } else if (i >= 7) {
                int i2 = 10 - i;
                this.e.setText(this.j.getResources().getQuantityString(com.google.android.projection.gearhead.R.plurals.developer_settings_steps_count, i2, Integer.valueOf(i2)));
                this.e.show();
            }
        } else if (acxa.ae() && z) {
            this.e.setText(this.j.getString(com.google.android.projection.gearhead.R.string.developer_settings_already_enabled));
            this.e.show();
        }
        return true;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", (String) this.i.gu());
        intent.setType("text/plain");
        Context context = this.j;
        Intent intentCreateChooser = Intent.createChooser(intent, context.getString(com.google.android.projection.gearhead.R.string.settings_about_version_share));
        intentCreateChooser.addFlags(268435456);
        context.startActivity(intentCreateChooser);
        return true;
    }

    public Material3VersionPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = false;
        this.f = new AtomicBoolean(false);
        this.i = wub.L(new vdv(this, 14));
    }

    public Material3VersionPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = false;
        this.f = new AtomicBoolean(false);
        this.i = wub.L(new vdv(this, 14));
    }

    public Material3VersionPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.h = false;
        this.f = new AtomicBoolean(false);
        this.i = wub.L(new vdv(this, 14));
    }
}
