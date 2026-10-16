package com.google.android.apps.auto.components.preflight.phone;

import android.os.Bundle;
import defpackage.ler;
import defpackage.luk;
import defpackage.mfr;
import defpackage.mgp;
import defpackage.tes;
import defpackage.ype;
import defpackage.yph;
import defpackage.yzz;

/* loaded from: classes2.dex */
public class PreflightPhoneErrorActivity extends ler {
    public static final /* synthetic */ int o = 0;
    private static final yph p = yph.c("GH.PreflightError");
    final mgp n = new mgp();
    private tes q;

    @Override // defpackage.ler, defpackage.bc, defpackage.ob, defpackage.cs, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        luk.b();
        new mfr(yzz.PREFLIGHT_PHONE_DISCONNECT_NOTICE).b(this);
        int intExtra = getIntent().getIntExtra("com.google.android.apps.auto.components.preflight.phone.EXTRA_CONNECTION_TYPE", -1);
        if (a().f("connection_error_dialog") == null) {
            mgp mgpVar = this.n;
            mgpVar.f(a(), "connection_error_dialog");
            mgpVar.h.m(Integer.valueOf(intExtra));
        }
        ((ype) p.l().ai((char) 4904)).w("Showing content for connectionType: %d", intExtra);
        tes tesVar = new tes(this);
        this.q = tesVar;
        tesVar.b();
    }

    @Override // defpackage.ep, defpackage.bc, android.app.Activity
    protected final void onDestroy() {
        tes tesVar = this.q;
        tesVar.getClass();
        tesVar.a();
        this.q = null;
        super.onDestroy();
    }
}
