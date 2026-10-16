package com.applovin.impl;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import com.applovin.sdk.R;
import org.apache.tika.mime.MimeTypes;

/* loaded from: classes.dex */
public abstract class c7 extends n3 {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.k f21215a;

    /* renamed from: b, reason: collision with root package name */
    private String f21216b;

    /* renamed from: c, reason: collision with root package name */
    private String f21217c;

    private void a() {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(MimeTypes.PLAIN_TEXT);
        intent.putExtra("android.intent.extra.TEXT", this.f21217c);
        intent.putExtra("android.intent.extra.TITLE", this.f21216b);
        intent.putExtra("android.intent.extra.SUBJECT", this.f21216b);
        startActivity(Intent.createChooser(intent, null));
    }

    @Override // com.applovin.impl.n3
    public com.applovin.impl.sdk.k getSdk() {
        return this.f21215a;
    }

    public void initialize(String str, String str2, com.applovin.impl.sdk.k kVar) {
        this.f21215a = kVar;
        this.f21216b = str;
        this.f21217c = str2;
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_text_view_activity);
        setTitle(this.f21216b);
        ((TextView) findViewById(R.id.textView)).setText(this.f21217c);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mediation_debugger_activity_menu, menu);
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (R.id.action_share != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        a();
        return true;
    }
}
