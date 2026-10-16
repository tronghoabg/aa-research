package com.google.android.apps.auto.components.externalkeyboard.phone;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.search.SearchBar;
import com.google.android.material.search.SearchView;
import com.google.android.projection.gearhead.R;
import defpackage.ajmd;
import defpackage.ep;
import defpackage.lbd;
import defpackage.lbe;
import defpackage.lbf;
import defpackage.lbg;
import defpackage.uk;
import defpackage.wnd;
import defpackage.wne;
import defpackage.ygr;
import defpackage.ype;
import defpackage.yph;

/* loaded from: classes2.dex */
public class PhoneKeyboardActivity extends ep {
    public static final yph m = yph.c("GH.PhoneKeyboard");
    public static final ygr n = ygr.t(6, 2, 5, 7, 3, 4, new Integer[0]);
    private boolean A;
    public boolean o;
    public View p;
    public View q;
    public EditText r;
    public SearchBar s;
    public SearchView t;
    public lbd u;
    public int v = -1;
    final TextWatcher w = new lbe(this, 0);
    final TextView.OnEditorActionListener x = new lbf(this, 0);
    public final ajmd z = new ajmd(this, null);
    final ServiceConnection y = new lbg(this, 0);

    private final CharSequence B() {
        CharSequence charSequenceExtra = getIntent().getCharSequenceExtra("ImeHint");
        return (charSequenceExtra == null || charSequenceExtra.length() == 0) ? getString(R.string.keyboard_activity_search_hint) : charSequenceExtra;
    }

    public final void A() {
        String strA = this.u.a();
        if (!this.t.k()) {
            if (this.s.F().toString().equals(strA)) {
                return;
            }
            this.s.I(strA);
        } else {
            if (this.r.getText().toString().equals(strA)) {
                return;
            }
            this.r.setText(strA);
            this.r.setSelection(strA.length());
        }
    }

    @Override // defpackage.bc, defpackage.ob, defpackage.cs, android.app.Activity
    public final void onCreate(Bundle bundle) throws Resources.NotFoundException {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 35) {
            getTheme().applyStyle(R.style.NoEdgeToEdgeTheme, true);
        }
        setTheme(R.style.Theme_Gearhead_Material3);
        uk ukVar = new uk((short[]) null);
        ukVar.a = R.style.ThemeOverlay_PhoneKeyboard_DynamicColors_DayNight;
        wnd.a(this, new wne(ukVar));
        setContentView(R.layout.phone_keyboard);
        this.q = findViewById(R.id.search_view_android_auto_logo);
        this.s = (SearchBar) findViewById(R.id.search_bar);
        SearchView searchView = (SearchView) findViewById(R.id.search_view);
        this.t = searchView;
        searchView.h(this.s);
        SearchView searchView2 = this.t;
        searchView2.o.add(new ajmd(this));
        this.r = this.t.k;
        this.p = findViewById(R.id.background_text);
        this.r.addTextChangedListener(this.w);
        this.r.setOnEditorActionListener(this.x);
        this.r.setImeOptions(getIntent().getIntExtra("ImeOptions", 3) | 33554432);
        this.r.setHint(B());
        this.s.G(B());
        this.t.i();
    }

    @Override // defpackage.ep, defpackage.bc, android.app.Activity
    public final void onDestroy() {
        this.r.removeTextChangedListener(this.w);
        super.onDestroy();
    }

    @Override // defpackage.ep, defpackage.bc, android.app.Activity
    public final void onStart() throws PackageManager.NameNotFoundException {
        super.onStart();
        String stringExtra = getIntent().getStringExtra("IMEClass");
        stringExtra.getClass();
        this.v = getIntent().getIntExtra("BinderClientId", -1);
        Intent intent = new Intent("external_keyboard_action");
        intent.setComponent(new ComponentName(this, stringExtra));
        boolean zBindService = bindService(intent, this.y, 1);
        this.A = zBindService;
        if (zBindService) {
            ((ype) m.l().ai((char) 3732)).y("Successful bind to %s", stringExtra);
        } else {
            ((ype) ((ype) m.g()).ai((char) 3731)).y("Failed to bind to %s", stringExtra);
            finish();
        }
    }

    @Override // defpackage.ep, defpackage.bc, android.app.Activity
    public final void onStop() {
        super.onStop();
        lbd lbdVar = this.u;
        if (lbdVar != null) {
            lbdVar.b(null);
        }
        if (this.A) {
            unbindService(this.y);
            this.A = false;
        }
    }
}
