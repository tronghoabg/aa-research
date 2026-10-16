package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.applovin.impl.b7;
import com.applovin.impl.r2;
import com.applovin.impl.s2;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.applovin.impl.l0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC1648l0 extends n3 {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.k f21843a;

    /* renamed from: b, reason: collision with root package name */
    private s2 f21844b;

    /* renamed from: com.applovin.impl.l0$a */
    public class a extends s2 {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ List f21845e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f21846f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f21847g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ List f21848h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ List f21849i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, List list, List list2, List list3, List list4, List list5) {
            super(context);
            this.f21845e = list;
            this.f21846f = list2;
            this.f21847g = list3;
            this.f21848h = list4;
            this.f21849i = list5;
        }

        @Override // com.applovin.impl.s2
        public int b() {
            return c.values().length;
        }

        @Override // com.applovin.impl.s2
        public List c(int i5) {
            List list;
            boolean z2 = true;
            if (i5 == c.MISSING_TC_NETWORKS.ordinal()) {
                list = this.f21845e;
            } else if (i5 == c.MISSING_AC_NETWORKS.ordinal()) {
                list = this.f21846f;
            } else {
                z2 = false;
                list = i5 == c.LISTED_TC_NETWORKS.ordinal() ? this.f21847g : i5 == c.LISTED_AC_NETWORKS.ordinal() ? this.f21848h : this.f21849i;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractActivityC1648l0.this.a((b7) it.next(), z2));
            }
            return arrayList;
        }

        @Override // com.applovin.impl.s2
        public int d(int i5) {
            return i5 == c.MISSING_TC_NETWORKS.ordinal() ? this.f21845e.size() : i5 == c.MISSING_AC_NETWORKS.ordinal() ? this.f21846f.size() : i5 == c.LISTED_TC_NETWORKS.ordinal() ? this.f21847g.size() : i5 == c.LISTED_AC_NETWORKS.ordinal() ? this.f21848h.size() : this.f21849i.size();
        }

        @Override // com.applovin.impl.s2
        public r2 e(int i5) {
            return i5 == c.MISSING_TC_NETWORKS.ordinal() ? new w4("MISSING TCF VENDORS (TC STRING)") : i5 == c.MISSING_AC_NETWORKS.ordinal() ? new w4("MISSING ATP NETWORKS (AC STRING)") : i5 == c.LISTED_TC_NETWORKS.ordinal() ? new w4("LISTED TCF VENDORS (TC STRING)") : i5 == c.LISTED_AC_NETWORKS.ordinal() ? new w4("LISTED ATP NETWORKS (AC STRING)") : new w4("NON-CONFIGURABLE NETWORKS");
        }
    }

    /* renamed from: com.applovin.impl.l0$b */
    public class b implements s2.a {
        public b() {
        }

        @Override // com.applovin.impl.s2.a
        public void a(j2 j2Var, r2 r2Var) {
            o7.a(r2Var.c(), r2Var.b(), AbstractActivityC1648l0.this);
        }
    }

    /* renamed from: com.applovin.impl.l0$c */
    public enum c {
        MISSING_TC_NETWORKS,
        MISSING_AC_NETWORKS,
        LISTED_TC_NETWORKS,
        LISTED_AC_NETWORKS,
        OTHER_NETWORKS
    }

    @Override // com.applovin.impl.n3
    public com.applovin.impl.sdk.k getSdk() {
        return this.f21843a;
    }

    public void initialize(List<b7> list, List<b7> list2, List<b7> list3, List<b7> list4, List<b7> list5, com.applovin.impl.sdk.k kVar) {
        this.f21843a = kVar;
        a aVar = new a(this, list, list2, list3, list4, list5);
        this.f21844b = aVar;
        aVar.a(new b());
        this.f21844b.notifyDataSetChanged();
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_list_view);
        setTitle("Configured CMP Networks");
        ((ListView) findViewById(R.id.listView)).setAdapter((ListAdapter) this.f21844b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public r2 a(b7 b7Var, boolean z2) {
        r2.b bVarA = r2.a();
        boolean zB = this.f21843a.s0().b();
        b7.a aVarF = b7Var.f();
        b7.a aVar = b7.a.TCF_VENDOR;
        if (aVarF == aVar || (b7Var.f() == b7.a.ATP_NETWORK && zB)) {
            String strC = b7Var.c();
            String str = b7Var.f() == aVar ? "IAB Vendor ID: " : "Google ATP ID: ";
            r2.b bVarB = bVarA.d(strC).d(z2 ? -65536 : -16777216).b(strC);
            StringBuilder sbJ = N0.a.j(str);
            sbJ.append(b7Var.d());
            bVarB.a(sbJ.toString()).a(true);
        } else {
            bVarA.d(b7Var.b());
        }
        return bVarA.a();
    }
}
