package com.applovin.impl;

import A7.AbstractC0279p0;
import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.AbstractC1631d;
import com.applovin.impl.b7;
import com.applovin.impl.r2;
import com.applovin.impl.s2;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxDebuggerCmpNetworksListActivity;
import com.applovin.mediation.MaxDebuggerTcfStringActivity;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class z6 extends n3 {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.k f24012a;

    /* renamed from: b, reason: collision with root package name */
    private s2 f24013b;

    /* renamed from: c, reason: collision with root package name */
    private final List f24014c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final List f24015d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private final List f24016e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private final List f24017f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private final List f24018g = new ArrayList();

    public class a extends s2 {
        public a(Context context) {
            super(context);
        }

        @Override // com.applovin.impl.s2
        public int b() {
            return e.values().length;
        }

        @Override // com.applovin.impl.s2
        public List c(int i5) {
            return i5 == e.IAB_TCF_PARAMETERS.ordinal() ? z6.this.c() : z6.this.a();
        }

        @Override // com.applovin.impl.s2
        public int d(int i5) {
            return i5 == e.IAB_TCF_PARAMETERS.ordinal() ? d.values().length : c.values().length;
        }

        @Override // com.applovin.impl.s2
        public r2 e(int i5) {
            return i5 == e.IAB_TCF_PARAMETERS.ordinal() ? new w4("IAB TCF Parameters") : new w4("CMP CONFIGURATION");
        }
    }

    public class b implements s2.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ a7 f24020a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.sdk.k f24021b;

        public class a implements AbstractC1631d.b {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f24023a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f24024b;

            public a(String str, String str2) {
                this.f24023a = str;
                this.f24024b = str2;
            }

            @Override // com.applovin.impl.AbstractC1631d.b
            public void a(MaxDebuggerTcfStringActivity maxDebuggerTcfStringActivity) {
                maxDebuggerTcfStringActivity.initialize(this.f24023a, this.f24024b, b.this.f24021b);
            }
        }

        /* renamed from: com.applovin.impl.z6$b$b, reason: collision with other inner class name */
        public class C0025b implements AbstractC1631d.b {
            public C0025b() {
            }

            @Override // com.applovin.impl.AbstractC1631d.b
            public void a(MaxDebuggerCmpNetworksListActivity maxDebuggerCmpNetworksListActivity) {
                maxDebuggerCmpNetworksListActivity.initialize(z6.this.f24016e, z6.this.f24017f, z6.this.f24014c, z6.this.f24015d, z6.this.f24018g, b.this.f24021b);
            }
        }

        public b(a7 a7Var, com.applovin.impl.sdk.k kVar) {
            this.f24020a = a7Var;
            this.f24021b = kVar;
        }

        @Override // com.applovin.impl.s2.a
        public void a(j2 j2Var, r2 r2Var) {
            String strA;
            String strC;
            if (j2Var.b() != e.IAB_TCF_PARAMETERS.ordinal()) {
                if (j2Var.a() == c.CONFIGURED_NETWORKS.ordinal()) {
                    AbstractC1631d.a(z6.this, MaxDebuggerCmpNetworksListActivity.class, this.f24021b.e(), new C0025b());
                    return;
                } else {
                    o7.a(r2Var.c(), r2Var.b(), z6.this);
                    return;
                }
            }
            if (j2Var.a() == d.TC_STRING.ordinal()) {
                strA = a5.f20970x.a();
                strC = this.f24020a.j();
            } else {
                strA = a5.f20971y.a();
                strC = this.f24020a.c();
            }
            AbstractC1631d.a(z6.this, MaxDebuggerTcfStringActivity.class, this.f24021b.e(), new a(strA, strC));
        }
    }

    public enum c {
        CMP_SDK_ID,
        CMP_SDK_VERSION,
        INSTRUCTIONS,
        CONFIGURED_NETWORKS
    }

    public enum d {
        GDPR_APPLIES,
        TC_STRING,
        AC_STRING
    }

    public enum e {
        IAB_TCF_PARAMETERS,
        CMP_CONFIGURATION
    }

    @Override // com.applovin.impl.n3
    public com.applovin.impl.sdk.k getSdk() {
        return this.f24012a;
    }

    public void initialize(List<b7> list, com.applovin.impl.sdk.k kVar) {
        this.f24012a = kVar;
        a7 a7VarS0 = kVar.s0();
        a(list);
        a aVar = new a(this);
        this.f24013b = aVar;
        aVar.a(new b(a7VarS0, kVar));
        this.f24013b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("CMP (Consent Management Platform)");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.f24013b);
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        s2 s2Var = this.f24013b;
        if (s2Var != null) {
            s2Var.a((s2.a) null);
        }
    }

    private void a(List list) {
        boolean zB = this.f24012a.s0().b();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b7 b7Var = (b7) it.next();
            if (b7Var.f() == b7.a.TCF_VENDOR) {
                if (Boolean.TRUE.equals(b7Var.a())) {
                    a(b7Var, this.f24014c);
                } else {
                    a(b7Var, this.f24016e);
                }
            } else if (b7Var.f() != b7.a.ATP_NETWORK) {
                this.f24018g.add(b7Var);
            } else if (!zB) {
                this.f24018g.add(b7Var);
            } else if (Boolean.TRUE.equals(b7Var.a())) {
                a(b7Var, this.f24015d);
            } else {
                a(b7Var, this.f24017f);
            }
        }
    }

    private r2 b() {
        r2.b bVarA;
        String strA = a5.f20967u.a();
        Integer numE = this.f24012a.s0().e();
        if (StringUtils.isValidString(this.f24012a.s0().d())) {
            bVarA = r2.a(r2.c.RIGHT_DETAIL);
        } else {
            r2.b bVarB = r2.a(r2.c.DETAIL).b("Unknown CMP SDK ID");
            bVarA = bVarB.a("Your integrated CMP might not be Google-certified. " + ("SharedPreferences value for key " + strA + " is " + numE + ".") + "\n\nIf you use Google AdMob or Google Ad Manager, make sure that the integrated CMP is included in the list of Google-certified CMPs at: https://support.google.com/admob/answer/13554116").a(R.drawable.applovin_ic_warning).b(AbstractC1650m0.a(R.color.applovin_sdk_warningColor, this)).a(true);
        }
        bVarA.d(strA);
        bVarA.c(numE != null ? numE.toString() : "No value set");
        bVarA.c(numE != null ? -16777216 : -65536);
        return bVarA.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List c() {
        ArrayList arrayList = new ArrayList(d.values().length);
        Integer numG = this.f24012a.s0().g();
        String strJ = this.f24012a.s0().j();
        String strC = this.f24012a.s0().c();
        arrayList.add(a(a5.f20969w.a(), numG));
        arrayList.add(a(a5.f20970x.a(), strJ, !d7.b(strJ)));
        arrayList.add(a(a5.f20971y.a(), strC, false));
        return arrayList;
    }

    private void a(b7 b7Var, List list) {
        if (b7Var.d() != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (b7Var.d().equals(((b7) it.next()).d())) {
                    return;
                }
            }
        }
        list.add(b7Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List a() {
        String strI;
        ArrayList arrayList = new ArrayList(c.values().length);
        int size = this.f24017f.size() + this.f24016e.size();
        arrayList.add(b());
        arrayList.add(a(a5.f20968v.a(), this.f24012a.s0().f()));
        arrayList.add(r2.a(r2.c.DETAIL).d("To check which networks are missing from your CMP, first make sure that you have granted consent to all networks through your CMP flow. Then add the following networks to your CMP network list.").a());
        r2.b bVarD = r2.a(r2.c.RIGHT_DETAIL).d("Configured CMP Networks");
        if (size > 0) {
            strI = AbstractC0279p0.i(size, "Missing ", " network(s)");
        } else {
            strI = "";
        }
        arrayList.add(bVarD.c(strI).c(size > 0 ? -65536 : -16777216).a(this).a(true).a());
        return arrayList;
    }

    private r2 a(String str, Integer num) {
        return r2.a(r2.c.RIGHT_DETAIL).d(str).c(num != null ? num.toString() : "No value set").c(num != null ? -16777216 : -65536).a();
    }

    private r2 a(String str, String str2, boolean z2) {
        boolean zIsValidString = StringUtils.isValidString(str2);
        if (zIsValidString && str2.length() > 35) {
            str2 = str2.substring(0, 35) + "...";
        }
        r2.b bVarD = r2.a(r2.c.DETAIL).d(str);
        if (!zIsValidString) {
            str2 = "No value set";
        }
        r2.b bVarA = bVarD.c(str2).c(z2 ? -65536 : -16777216).a(zIsValidString);
        if (zIsValidString) {
            bVarA.a(this);
        }
        return bVarA.a();
    }
}
