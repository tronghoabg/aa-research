package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.applovin.sdk.R;

/* loaded from: classes.dex */
public abstract class o1 extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private q1 f22367a;

    /* renamed from: b, reason: collision with root package name */
    private com.applovin.impl.sdk.k f22368b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f22369c;

    /* renamed from: d, reason: collision with root package name */
    private Button f22370d;

    private void b() {
        v2 v2Var = new v2();
        v2Var.a(this.f22368b.y().a(this.f22367a));
        String strB = this.f22368b.y().b(this.f22367a);
        if (strB != null) {
            v2Var.a("\nBid Response Preview:\n");
            v2Var.a(strB);
        }
        TextView textView = (TextView) findViewById(R.id.email_report_tv);
        this.f22369c = textView;
        textView.setText(v2Var.toString());
        this.f22369c.setTextColor(-16777216);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!a()) {
            finish();
            return;
        }
        setTitle(this.f22367a.d() + " - " + this.f22367a.f());
        setContentView(R.layout.creative_debugger_displayed_ad_detail_activity);
        b();
        f8.a(findViewById(android.R.id.content), this.f22368b);
        Button button = (Button) findViewById(R.id.report_ad_button);
        this.f22370d = button;
        button.setOnClickListener(new K(this, 1));
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.creative_debugger_displayed_ad_activity_menu, menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (!a()) {
            finish();
            return false;
        }
        if (R.id.action_share != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        this.f22368b.y().a(this.f22367a, (Context) this, false);
        return true;
    }

    public void a(q1 q1Var, com.applovin.impl.sdk.k kVar) {
        this.f22367a = q1Var;
        this.f22368b = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.f22368b.y().a(this.f22367a, (Context) this, true);
    }

    private boolean a() {
        return (this.f22367a == null || this.f22368b == null) ? false : true;
    }
}
