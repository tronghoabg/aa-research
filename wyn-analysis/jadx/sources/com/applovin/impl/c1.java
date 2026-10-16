package com.applovin.impl;

import android.app.Activity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.applovin.creative.MaxCreativeDebuggerDisplayedAdActivity;
import com.applovin.impl.AbstractC1631d;
import com.applovin.impl.d1;
import com.applovin.impl.s2;
import com.applovin.sdk.R;

/* loaded from: classes.dex */
public abstract class c1 extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private d1 f21176a;

    /* renamed from: b, reason: collision with root package name */
    private FrameLayout f21177b;

    /* renamed from: c, reason: collision with root package name */
    private ListView f21178c;

    public class a implements s2.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1629c f21179a;

        /* renamed from: com.applovin.impl.c1$a$a, reason: collision with other inner class name */
        public class C0008a implements AbstractC1631d.b {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ j2 f21181a;

            public C0008a(j2 j2Var) {
                this.f21181a = j2Var;
            }

            @Override // com.applovin.impl.AbstractC1631d.b
            public void a(MaxCreativeDebuggerDisplayedAdActivity maxCreativeDebuggerDisplayedAdActivity) {
                maxCreativeDebuggerDisplayedAdActivity.a((q1) c1.this.f21176a.d().get(this.f21181a.a()), c1.this.f21176a.e());
            }
        }

        public a(C1629c c1629c) {
            this.f21179a = c1629c;
        }

        @Override // com.applovin.impl.s2.a
        public void a(j2 j2Var, r2 r2Var) {
            if (j2Var.b() != d1.a.RECENT_ADS.ordinal()) {
                return;
            }
            AbstractC1631d.a(c1.this, MaxCreativeDebuggerDisplayedAdActivity.class, this.f21179a, new C0008a(j2Var));
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Creative Debugger");
        setContentView(R.layout.mediation_debugger_list_view);
        this.f21177b = (FrameLayout) findViewById(android.R.id.content);
        this.f21178c = (ListView) findViewById(R.id.listView);
        f8.a(this.f21177b, com.applovin.impl.sdk.k.f22986D0);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        d1 d1Var = this.f21176a;
        if (d1Var != null) {
            d1Var.a((s2.a) null);
            this.f21176a.g();
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        d1 d1Var = this.f21176a;
        if (d1Var == null) {
            finish();
            return;
        }
        this.f21178c.setAdapter((ListAdapter) d1Var);
        d1 d1Var2 = this.f21176a;
        if (d1Var2 != null && !d1Var2.e().y().g()) {
            a(R.string.applovin_creative_debugger_disabled_text);
            return;
        }
        d1 d1Var3 = this.f21176a;
        if (d1Var3 == null || !d1Var3.f()) {
            return;
        }
        a(R.string.applovin_creative_debugger_no_ads_text);
    }

    public void a(d1 d1Var, C1629c c1629c) {
        this.f21176a = d1Var;
        d1Var.a(new a(c1629c));
    }

    private void a(int i5) {
        TextView textView = new TextView(this);
        textView.setGravity(17);
        textView.setTextSize(18.0f);
        textView.setText(i5);
        this.f21177b.addView(textView, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f21177b.bringChildToFront(textView);
    }
}
