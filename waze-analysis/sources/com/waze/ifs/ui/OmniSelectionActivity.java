package com.waze.ifs.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.ch;
import com.waze.R;
import com.waze.settings.gw;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class OmniSelectionActivity extends a implements s {

    /* renamed from: f, reason: collision with root package name */
    public static final String f24473f;

    /* renamed from: g, reason: collision with root package name */
    public static final String f24474g;

    /* renamed from: h, reason: collision with root package name */
    public static final String f24475h;

    /* renamed from: k, reason: collision with root package name */
    public static final String f24476k;

    /* renamed from: l, reason: collision with root package name */
    public static final String f24477l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public static final String q;
    public static final String r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    private static final String z = "com.waze.ifs.ui.OmniSelectionActivity";
    private Intent A;

    static {
        String name = OmniSelectionActivity.class.getName();
        f24473f = String.valueOf(name).concat(".arg.title");
        f24474g = String.valueOf(name).concat(".arg.hint");
        f24475h = String.valueOf(name).concat(".arg.values");
        f24476k = String.valueOf(name).concat(".arg.indexed");
        f24477l = String.valueOf(name).concat(".arg.search");
        m = String.valueOf(name).concat(".arg.filter");
        n = String.valueOf(name).concat(".arg.multi_select");
        o = String.valueOf(name).concat(".arg.user_input");
        p = String.valueOf(name).concat(".arg.user_input_format");
        q = String.valueOf(name).concat(".arg.expandable");
        r = String.valueOf(name).concat(".arg.fwd_intent");
        s = String.valueOf(name).concat(".ret.selected_val");
        t = String.valueOf(name).concat(".ret.selected_title");
        u = String.valueOf(name).concat(".ret.selected_idx");
        v = String.valueOf(name).concat(".ret.selected_user_input");
    }

    @Override // com.waze.ifs.ui.s
    public final void bF(int i2, String str, String str2, boolean z2) {
        Intent intent = this.A;
        if (intent == null) {
            intent = new Intent();
        }
        intent.setExtrasClassLoader(OmniSelectionActivity.class.getClassLoader());
        intent.putExtra(u, i2);
        intent.putExtra(s, str);
        intent.putExtra(t, str2);
        if (z2) {
            intent.putExtra(v, true);
        }
        if (this.A == null) {
            setResult(-1, intent);
            finish();
        } else {
            setResult(-1);
            startActivityForResult(this.A, 0);
        }
    }

    @Override // com.waze.ifs.ui.s
    public final void m() {
    }

    @Override // com.waze.ifs.ui.a, com.waze.sharedui.a.e, com.waze.app_nav.hub.af, android.support.v4.app.av, androidx.activity.ComponentActivity, android.support.v4.app.dd, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.fragment_activity_empty);
        w wVar = new w();
        aE();
        Intent intent = getIntent();
        wVar.q(intent.getStringExtra(f24473f));
        wVar.k(intent.getStringExtra(f24474g));
        Parcelable[] parcelableArrayExtra = intent.getParcelableArrayExtra(f24475h);
        if (parcelableArrayExtra != null) {
            int length = parcelableArrayExtra.length;
            gw[] gwVarArr = new gw[length];
            for (int i2 = 0; i2 < length; i2++) {
                gwVarArr[i2] = (gw) parcelableArrayExtra[i2];
            }
            wVar.s(gwVarArr);
        }
        wVar.n(intent.getBooleanExtra(f24476k, false));
        wVar.p(intent.getBooleanExtra(f24477l, false));
        wVar.m(intent.getBooleanExtra(m, false));
        wVar.o(intent.getBooleanExtra(n, false));
        wVar.r(intent.getBooleanExtra(o, false), intent.getStringExtra(p));
        wVar.l(intent.getBooleanExtra(q, false));
        this.A = (Intent) intent.getParcelableExtra(r);
        ch chVarU = bv().u();
        chVarU.q(R.id.container, wVar);
        chVarU.a();
    }
}
