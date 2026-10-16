package com.google.android.gms.ads;

import D6.C0366d;
import D6.C0388o;
import D6.C0392q;
import D6.D0;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.LinearLayout;
import com.google.android.gms.internal.ads.zzbvf;
import com.wynauto.wyn.R;
import q7.BinderC3877b;

/* loaded from: classes3.dex */
public final class OutOfContextTestingActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C0388o c0388o = C0392q.f2477g.f2479b;
        zzbvf zzbvfVar = new zzbvf();
        c0388o.getClass();
        D0 d02 = (D0) new C0366d(c0388o, this, zzbvfVar).d(this, false);
        if (d02 == null) {
            finish();
            return;
        }
        setContentView(R.layout.admob_empty_layout);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.layout);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra("adUnit");
        if (stringExtra == null) {
            finish();
            return;
        }
        try {
            d02.zze(stringExtra, new BinderC3877b(this), new BinderC3877b(linearLayout));
        } catch (RemoteException unused) {
            finish();
        }
    }
}
