package com.applovin.impl;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.database.DataSetObserver;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.AbstractC1631d;
import com.applovin.impl.o3;
import com.applovin.impl.s2;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerAdUnitsListActivity;
import com.applovin.mediation.MaxDebuggerDetailActivity;
import com.applovin.mediation.MaxDebuggerTcfConsentStatusesListActivity;
import com.applovin.mediation.MaxDebuggerTcfInfoListActivity;
import com.applovin.mediation.MaxDebuggerTestLiveNetworkActivity;
import com.applovin.mediation.MaxDebuggerTestModeNetworkActivity;
import com.applovin.mediation.MaxDebuggerUnifiedFlowActivity;
import org.apache.tika.mime.MimeTypes;

/* loaded from: classes.dex */
public abstract class m3 extends n3 {

    /* renamed from: a, reason: collision with root package name */
    private o3 f21897a;

    /* renamed from: b, reason: collision with root package name */
    private DataSetObserver f21898b;

    /* renamed from: c, reason: collision with root package name */
    private FrameLayout f21899c;

    /* renamed from: d, reason: collision with root package name */
    private ListView f21900d;

    /* renamed from: e, reason: collision with root package name */
    private C1623a f21901e;

    public class a extends DataSetObserver {
        public a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            m3.this.a();
            m3 m3Var = m3.this;
            m3Var.b((Context) m3Var);
        }
    }

    public class b implements s2.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1629c f21903a;

        public class a implements AbstractC1631d.b {
            public a() {
            }

            @Override // com.applovin.impl.AbstractC1631d.b
            public void a(MaxDebuggerUnifiedFlowActivity maxDebuggerUnifiedFlowActivity) {
                maxDebuggerUnifiedFlowActivity.initialize(m3.this.f21897a.t());
            }
        }

        /* renamed from: com.applovin.impl.m3$b$b, reason: collision with other inner class name */
        public class C0012b implements AbstractC1631d.b {
            public C0012b() {
            }

            @Override // com.applovin.impl.AbstractC1631d.b
            public void a(MaxDebuggerTcfInfoListActivity maxDebuggerTcfInfoListActivity) {
                maxDebuggerTcfInfoListActivity.initialize(m3.this.f21897a.d(), m3.this.f21897a.t());
            }
        }

        public class c implements AbstractC1631d.b {
            public c() {
            }

            @Override // com.applovin.impl.AbstractC1631d.b
            public void a(MaxDebuggerTcfConsentStatusesListActivity maxDebuggerTcfConsentStatusesListActivity) {
                maxDebuggerTcfConsentStatusesListActivity.initialize(m3.this.f21897a.d(), m3.this.f21897a.t());
            }
        }

        public class d implements AbstractC1631d.b {
            public d() {
            }

            @Override // com.applovin.impl.AbstractC1631d.b
            public void a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                maxDebuggerAdUnitsListActivity.initialize(m3.this.f21897a.f(), false, m3.this.f21897a.t());
            }
        }

        public class e implements AbstractC1631d.b {
            public e() {
            }

            @Override // com.applovin.impl.AbstractC1631d.b
            public void a(MaxDebuggerTestLiveNetworkActivity maxDebuggerTestLiveNetworkActivity) {
                maxDebuggerTestLiveNetworkActivity.initialize(m3.this.f21897a.k(), m3.this.f21897a.w(), m3.this.f21897a.t());
            }
        }

        public class f implements AbstractC1631d.b {
            public f() {
            }

            @Override // com.applovin.impl.AbstractC1631d.b
            public void a(MaxDebuggerTestModeNetworkActivity maxDebuggerTestModeNetworkActivity) {
                maxDebuggerTestModeNetworkActivity.initialize(m3.this.f21897a.v(), m3.this.f21897a.t());
            }
        }

        public class g implements AbstractC1631d.b {
            public g() {
            }

            @Override // com.applovin.impl.AbstractC1631d.b
            public void a(MaxDebuggerAdUnitsListActivity maxDebuggerAdUnitsListActivity) {
                maxDebuggerAdUnitsListActivity.initialize(m3.this.f21897a.o(), true, m3.this.f21897a.t());
            }
        }

        public class h implements AbstractC1631d.b {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ r2 f21912a;

            public h(r2 r2Var) {
                this.f21912a = r2Var;
            }

            @Override // com.applovin.impl.AbstractC1631d.b
            public void a(MaxDebuggerDetailActivity maxDebuggerDetailActivity) {
                maxDebuggerDetailActivity.initialize(((z3) this.f21912a).r());
            }
        }

        public b(C1629c c1629c) {
            this.f21903a = c1629c;
        }

        @Override // com.applovin.impl.s2.a
        public void a(j2 j2Var, r2 r2Var) {
            int iB = j2Var.b();
            if (iB == o3.e.APP_INFO.ordinal()) {
                o7.a(r2Var.c(), r2Var.b(), m3.this);
                return;
            }
            if (iB == o3.e.MAX.ordinal()) {
                if (m3.this.f21897a.a(r2Var)) {
                    AbstractC1631d.a(m3.this, MaxDebuggerUnifiedFlowActivity.class, this.f21903a, new a());
                    return;
                } else {
                    o7.a(r2Var.c(), r2Var.b(), m3.this);
                    return;
                }
            }
            if (iB == o3.e.PRIVACY.ordinal()) {
                if (j2Var.a() != o3.d.CMP.ordinal()) {
                    if (j2Var.a() == o3.d.NETWORK_CONSENT_STATUSES.ordinal()) {
                        AbstractC1631d.a(m3.this, MaxDebuggerTcfConsentStatusesListActivity.class, this.f21903a, new c());
                        return;
                    }
                    return;
                } else if (StringUtils.isValidString(m3.this.f21897a.t().s0().j())) {
                    AbstractC1631d.a(m3.this, MaxDebuggerTcfInfoListActivity.class, this.f21903a, new C0012b());
                    return;
                } else {
                    o7.a(r2Var.c(), r2Var.b(), m3.this);
                    return;
                }
            }
            if (iB != o3.e.ADS.ordinal()) {
                if ((iB == o3.e.MICRO_SDK_PARTNER_NETWORKS.ordinal() || iB == o3.e.INCOMPLETE_NETWORKS.ordinal() || iB == o3.e.COMPLETED_NETWORKS.ordinal()) && (r2Var instanceof z3)) {
                    AbstractC1631d.a(m3.this, MaxDebuggerDetailActivity.class, this.f21903a, new h(r2Var));
                    return;
                }
                return;
            }
            if (j2Var.a() == o3.b.AD_UNITS.ordinal()) {
                if (m3.this.f21897a.f().size() > 0) {
                    AbstractC1631d.a(m3.this, MaxDebuggerAdUnitsListActivity.class, this.f21903a, new d());
                    return;
                } else {
                    o7.a("No live ad units", "Please setup or enable your MAX ad units on https://applovin.com.", m3.this);
                    return;
                }
            }
            if (j2Var.a() == o3.b.SELECT_LIVE_NETWORKS.ordinal()) {
                if (m3.this.f21897a.k().size() <= 0 && m3.this.f21897a.w().size() <= 0) {
                    o7.a("Complete Integrations", "Please complete integrations in order to access this.", m3.this);
                    return;
                } else if (m3.this.f21897a.t().t0().c()) {
                    o7.a("Restart Required", r2Var.b(), m3.this);
                    return;
                } else {
                    AbstractC1631d.a(m3.this, MaxDebuggerTestLiveNetworkActivity.class, this.f21903a, new e());
                    return;
                }
            }
            if (j2Var.a() != o3.b.SELECT_TEST_MODE_NETWORKS.ordinal()) {
                if (j2Var.a() == o3.b.INITIALIZATION_AD_UNITS.ordinal()) {
                    AbstractC1631d.a(m3.this, MaxDebuggerAdUnitsListActivity.class, this.f21903a, new g());
                }
            } else if (!m3.this.f21897a.t().t0().c()) {
                m3.this.getSdk().t0().a();
                o7.a("Restart Required", r2Var.b(), m3.this);
            } else if (m3.this.f21897a.v().size() > 0) {
                AbstractC1631d.a(m3.this, MaxDebuggerTestModeNetworkActivity.class, this.f21903a, new f());
            } else {
                o7.a("Complete Integrations", "Please complete integrations in order to access this.", m3.this);
            }
        }
    }

    private void c() {
        a();
        C1623a c1623a = new C1623a(this, 50, R.attr.progressBarStyleLarge);
        this.f21901e = c1623a;
        c1623a.setColor(-3355444);
        this.f21899c.addView(this.f21901e, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f21899c.bringChildToFront(this.f21901e);
        this.f21901e.a();
    }

    @Override // com.applovin.impl.n3
    public com.applovin.impl.sdk.k getSdk() {
        o3 o3Var = this.f21897a;
        if (o3Var != null) {
            return o3Var.t();
        }
        return null;
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle("MAX Mediation Debugger");
        setContentView(com.applovin.sdk.R.layout.mediation_debugger_list_view);
        this.f21899c = (FrameLayout) findViewById(R.id.content);
        ListView listView = (ListView) findViewById(com.applovin.sdk.R.id.listView);
        this.f21900d = listView;
        listView.setAdapter((ListAdapter) this.f21897a);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(com.applovin.sdk.R.menu.mediation_debugger_activity_menu, menu);
        return true;
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        o3 o3Var = this.f21897a;
        if (o3Var != null) {
            o3Var.unregisterDataSetObserver(this.f21898b);
            this.f21897a.a((s2.a) null);
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (com.applovin.sdk.R.id.action_share != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        b();
        return true;
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        o3 o3Var = this.f21897a;
        if (o3Var == null || o3Var.y()) {
            return;
        }
        c();
    }

    public void setListAdapter(o3 o3Var, C1629c c1629c) {
        DataSetObserver dataSetObserver;
        o3 o3Var2 = this.f21897a;
        if (o3Var2 != null && (dataSetObserver = this.f21898b) != null) {
            o3Var2.unregisterDataSetObserver(dataSetObserver);
        }
        this.f21897a = o3Var;
        this.f21898b = new a();
        b((Context) this);
        this.f21897a.registerDataSetObserver(this.f21898b);
        this.f21897a.a(new b(c1629c));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        C1623a c1623a = this.f21901e;
        if (c1623a != null) {
            c1623a.b();
            this.f21899c.removeView(this.f21901e);
            this.f21901e = null;
        }
    }

    private void b() {
        o3 o3Var = this.f21897a;
        if (o3Var == null) {
            return;
        }
        String strP = o3Var.p();
        if (TextUtils.isEmpty(strP)) {
            return;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(MimeTypes.PLAIN_TEXT);
        intent.putExtra("android.intent.extra.TEXT", strP);
        intent.putExtra("android.intent.extra.TITLE", "Mediation Debugger logs");
        intent.putExtra("android.intent.extra.SUBJECT", "MAX Mediation Debugger logs");
        startActivity(Intent.createChooser(intent, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Context context) {
        o7.a(this.f21897a.i(), this.f21897a.h(), context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Context context) {
        if (!StringUtils.isValidString(this.f21897a.h()) || this.f21897a.x()) {
            return;
        }
        this.f21897a.b(true);
        runOnUiThread(new F(10, this, context));
    }
}
