package com.applovin.impl;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import com.applovin.impl.e3;
import com.applovin.impl.r2;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class g3 extends s2 {

    /* renamed from: e, reason: collision with root package name */
    private final e3 f21584e;

    /* renamed from: f, reason: collision with root package name */
    private List f21585f;

    /* renamed from: g, reason: collision with root package name */
    private final List f21586g;

    /* renamed from: h, reason: collision with root package name */
    private final List f21587h;

    /* renamed from: i, reason: collision with root package name */
    private final List f21588i;

    /* renamed from: j, reason: collision with root package name */
    private final List f21589j;
    private SpannedString k;

    public enum a {
        INTEGRATIONS,
        PERMISSIONS,
        CONFIGURATION,
        DEPENDENCIES,
        TEST_ADS,
        COUNT
    }

    public g3(e3 e3Var, Context context) {
        super(context);
        this.f21584e = e3Var;
        if (e3Var.q() == e3.a.INVALID_INTEGRATION) {
            SpannableString spannableString = new SpannableString("Tap for more information");
            spannableString.setSpan(new AbsoluteSizeSpan(12, true), 0, spannableString.length(), 33);
            this.k = new SpannedString(spannableString);
        } else {
            this.k = new SpannedString("");
        }
        this.f21585f = g();
        this.f21586g = b(e3Var.n());
        this.f21587h = e();
        this.f21588i = a(e3Var.f());
        this.f21589j = j();
        notifyDataSetChanged();
    }

    private r2 f() {
        if (this.f21584e.I()) {
            return null;
        }
        return r2.a().d("Initialization Status").c(f(this.f21584e.i())).a(false).a();
    }

    private List g() {
        ArrayList arrayList = new ArrayList(3);
        CollectionUtils.addObjectIfExists(i(), arrayList);
        CollectionUtils.addObjectIfExists(d(), arrayList);
        CollectionUtils.addObjectIfExists(f(), arrayList);
        return arrayList;
    }

    private r2 i() {
        r2.b bVarC = r2.a().d("SDK").c(this.f21584e.p());
        if (TextUtils.isEmpty(this.f21584e.p())) {
            bVarC.a(a(this.f21584e.G())).b(b(this.f21584e.G()));
        }
        return bVarC.a();
    }

    private List j() {
        ArrayList arrayList = new ArrayList(3);
        if (StringUtils.isValidString(this.f21584e.v())) {
            arrayList.add(r2.a(r2.c.DETAIL).d(this.f21584e.v()).a());
        }
        if (this.f21584e.y() == e3.b.NOT_SUPPORTED) {
            return arrayList;
        }
        if (this.f21584e.s() != null) {
            arrayList.add(c(this.f21584e.s()));
        }
        arrayList.add(a(this.f21584e.y()));
        return arrayList;
    }

    public boolean a(j2 j2Var) {
        return j2Var.b() == a.TEST_ADS.ordinal() && j2Var.a() == this.f21589j.size() - 1;
    }

    @Override // com.applovin.impl.s2
    public int b() {
        return a.COUNT.ordinal();
    }

    @Override // com.applovin.impl.s2
    public List c(int i5) {
        return i5 == a.INTEGRATIONS.ordinal() ? this.f21585f : i5 == a.PERMISSIONS.ordinal() ? this.f21586g : i5 == a.CONFIGURATION.ordinal() ? this.f21587h : i5 == a.DEPENDENCIES.ordinal() ? this.f21588i : this.f21589j;
    }

    @Override // com.applovin.impl.s2
    public int d(int i5) {
        return i5 == a.INTEGRATIONS.ordinal() ? this.f21585f.size() : i5 == a.PERMISSIONS.ordinal() ? this.f21586g.size() : i5 == a.CONFIGURATION.ordinal() ? this.f21587h.size() : i5 == a.DEPENDENCIES.ordinal() ? this.f21588i.size() : this.f21589j.size();
    }

    @Override // com.applovin.impl.s2
    public r2 e(int i5) {
        return i5 == a.INTEGRATIONS.ordinal() ? new w4("INTEGRATIONS") : i5 == a.PERMISSIONS.ordinal() ? new w4("PERMISSIONS") : i5 == a.CONFIGURATION.ordinal() ? new w4("CONFIGURATION") : i5 == a.DEPENDENCIES.ordinal() ? new w4("DEPENDENCIES") : new w4("TEST ADS");
    }

    public e3 h() {
        return this.f21584e;
    }

    public void k() {
        this.f21585f = g();
    }

    public String toString() {
        return "MediatedNetworkListAdapter{}";
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        if (list.size() > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                k1 k1Var = (k1) it.next();
                arrayList.add(a(k1Var.b(), k1Var.a(), k1Var.c(), true));
            }
        }
        return arrayList;
    }

    private List b(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        if (list.size() > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                p4 p4Var = (p4) it.next();
                arrayList.add(a(p4Var.b(), p4Var.a(), p4Var.c(), true));
            }
        }
        return arrayList;
    }

    private String f(int i5) {
        if (MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS.getCode() != i5 && MaxAdapter.InitializationStatus.INITIALIZED_UNKNOWN.getCode() != i5 && MaxAdapter.InitializationStatus.DOES_NOT_APPLY.getCode() != i5) {
            if (MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() == i5) {
                return "Failure";
            }
            if (MaxAdapter.InitializationStatus.INITIALIZING.getCode() == i5) {
                return "Initializing...";
            }
            return "Not Initialized";
        }
        return "Initialized";
    }

    private r2 a(e3.b bVar) {
        r2.b bVarA = r2.a();
        if (bVar == e3.b.READY) {
            bVarA.a(this.f22761a);
        }
        return bVarA.d("Test Mode").c(bVar.c()).c(bVar.d()).b("Restart Required").a(bVar.b()).a(true).a();
    }

    private int b(boolean z2) {
        return AbstractC1650m0.a(z2 ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this.f22761a);
    }

    private r2 c(List list) {
        return r2.a().d("Region/VPN Required").c(CollectionUtils.implode(list, ", ", list.size())).a();
    }

    private r2 d() {
        r2.b bVarC = r2.a().d("Adapter").c(this.f21584e.c());
        if (TextUtils.isEmpty(this.f21584e.c())) {
            bVarC.a(a(this.f21584e.A())).b(b(this.f21584e.A()));
        }
        return bVarC.a();
    }

    private List e() {
        ArrayList arrayList = new ArrayList(1);
        if (this.f21584e.E()) {
            arrayList.add(a("Java 8", "For optimal performance, please enable Java 8 support. See: https://support.axon.ai/en/max/android/overview/integration", com.applovin.impl.sdk.k.G0(), true));
        }
        return arrayList;
    }

    private int c(boolean z2) {
        return z2 ? R.drawable.applovin_ic_x_mark : R.drawable.applovin_ic_warning;
    }

    private int d(boolean z2) {
        return AbstractC1650m0.a(z2 ? R.color.applovin_sdk_xmarkColor : R.color.applovin_sdk_warningColor, this.f22761a);
    }

    private r2 a(String str, String str2, boolean z2, boolean z10) {
        return r2.a(z2 ? r2.c.RIGHT_DETAIL : r2.c.DETAIL).d(str).a(z2 ? null : this.k).b("Instructions").a(str2).a(z2 ? R.drawable.applovin_ic_check_mark_bordered : c(z10)).b(z2 ? AbstractC1650m0.a(R.color.applovin_sdk_checkmarkColor, this.f22761a) : d(z10)).a(!z2).a();
    }

    private int a(boolean z2) {
        return z2 ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark;
    }
}
