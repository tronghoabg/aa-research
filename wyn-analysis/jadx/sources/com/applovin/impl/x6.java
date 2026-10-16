package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.b7;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class x6 extends n3 {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.k f23517a;

    /* renamed from: b, reason: collision with root package name */
    private s2 f23518b;

    public class a extends s2 {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ArrayList f23519e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f23520f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f23521g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, ArrayList arrayList, ArrayList arrayList2, boolean z2) {
            super(context);
            this.f23519e = arrayList;
            this.f23520f = arrayList2;
            this.f23521g = z2;
        }

        @Override // com.applovin.impl.s2
        public int b() {
            return b.values().length;
        }

        @Override // com.applovin.impl.s2
        public List c(int i5) {
            return i5 == b.TC_NETWORKS.ordinal() ? this.f23519e : this.f23520f;
        }

        @Override // com.applovin.impl.s2
        public int d(int i5) {
            return i5 == b.TC_NETWORKS.ordinal() ? this.f23519e.size() : this.f23520f.size();
        }

        @Override // com.applovin.impl.s2
        public r2 e(int i5) {
            if (i5 == b.TC_NETWORKS.ordinal()) {
                return new w4("TCF VENDORS (TC STRING)");
            }
            return new w4(this.f23521g ? "ATP NETWORKS (AC STRING)" : "APPLOVIN PRIVACY SETTING");
        }
    }

    public enum b {
        TC_NETWORKS,
        AC_NETWORKS
    }

    private r2 a(String str, String str2) {
        return r2.a().d(str).c(str2).a();
    }

    @Override // com.applovin.impl.n3
    public com.applovin.impl.sdk.k getSdk() {
        return this.f23517a;
    }

    public void initialize(List<b7> list, com.applovin.impl.sdk.k kVar) {
        this.f23517a = kVar;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String strA = AbstractC1656p0.b().a(this);
        boolean zB = kVar.s0().b();
        if (!zB) {
            arrayList2.add(a("Has User Consent", strA));
        }
        for (b7 b7Var : list) {
            Boolean boolA = b7Var.a();
            if (boolA != null) {
                if (b7Var.f() == b7.a.TCF_VENDOR) {
                    arrayList.add(a(b7Var.b(), String.valueOf(boolA)));
                } else if (b7Var.f() == b7.a.ATP_NETWORK) {
                    arrayList2.add(a(b7Var.b(), String.valueOf(boolA)));
                }
            } else if (zB && b7Var.f() == b7.a.ATP_NETWORK) {
                arrayList2.add(a(b7Var.b(), strA));
            }
        }
        a aVar = new a(this, arrayList, arrayList2, zB);
        this.f23518b = aVar;
        aVar.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("Network Consent Statuses");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.f23518b);
    }
}
