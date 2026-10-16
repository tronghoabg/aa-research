package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.applovin.impl.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C1649m extends s2 {

    /* renamed from: e, reason: collision with root package name */
    private final C1651n f21879e;

    /* renamed from: f, reason: collision with root package name */
    private final C1653o f21880f;

    /* renamed from: g, reason: collision with root package name */
    private final j8 f21881g;

    /* renamed from: h, reason: collision with root package name */
    private final String f21882h;

    /* renamed from: i, reason: collision with root package name */
    private final List f21883i;

    /* renamed from: j, reason: collision with root package name */
    private final List f21884j;
    private final List k;

    /* renamed from: com.applovin.impl.m$a */
    public enum a {
        INFO,
        BIDDERS,
        WATERFALL,
        COUNT
    }

    /* renamed from: com.applovin.impl.m$b */
    public class b extends z3 {

        /* renamed from: p, reason: collision with root package name */
        private final j8 f21890p;

        public b(j8 j8Var, String str, boolean z2) {
            super(j8Var.b().d(), C1649m.this.f22761a);
            this.f21890p = j8Var;
            this.f22644c = StringUtils.createSpannedString(j8Var.b().a(), -16777216, 18, 1);
            this.f22645d = !TextUtils.isEmpty(str) ? new SpannedString(str) : null;
            this.f22643b = z2;
        }

        @Override // com.applovin.impl.r2
        public int g() {
            return -12303292;
        }

        @Override // com.applovin.impl.z3, com.applovin.impl.r2
        public boolean o() {
            return this.f22643b;
        }

        public j8 v() {
            return this.f21890p;
        }
    }

    public C1649m(C1651n c1651n, C1653o c1653o, j8 j8Var, Context context) {
        super(context);
        this.f21879e = c1651n;
        this.f21881g = j8Var;
        this.f21880f = c1653o != null ? c1653o : c1651n.f();
        this.f21882h = c1653o != null ? c1653o.c() : c1651n.d();
        this.f21883i = h();
        this.f21884j = e();
        this.k = l();
        notifyDataSetChanged();
    }

    private r2 f() {
        return r2.a().d("AB Test Experiment Name").c(j().b()).a();
    }

    private r2 g() {
        return r2.a().d("ID").c(this.f21879e.c()).a();
    }

    private List h() {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(g());
        arrayList.add(d());
        if (this.f21880f.b() != null) {
            arrayList.add(f());
        }
        if (this.f21881g != null) {
            arrayList.add(i());
        }
        return arrayList;
    }

    private r2 i() {
        return r2.a().d("Selected Network").c(this.f21881g.b().a()).a();
    }

    private List l() {
        j8 j8Var = this.f21881g;
        if (j8Var != null && j8Var.d()) {
            return new ArrayList();
        }
        List<j8> listE = this.f21880f.e();
        ArrayList arrayList = new ArrayList(listE.size());
        for (j8 j8Var2 : listE) {
            j8 j8Var3 = this.f21881g;
            if (j8Var3 == null || j8Var3.b().c().equals(j8Var2.b().c())) {
                arrayList.add(new b(j8Var2, null, this.f21881g == null));
                for (a4 a4Var : j8Var2.c()) {
                    arrayList.add(r2.a().d(a4Var.a()).c(a4Var.b()).b(true).a());
                }
            }
        }
        return arrayList;
    }

    @Override // com.applovin.impl.s2
    public int b() {
        return a.COUNT.ordinal();
    }

    @Override // com.applovin.impl.s2
    public List c(int i5) {
        return i5 == a.INFO.ordinal() ? this.f21883i : i5 == a.BIDDERS.ordinal() ? this.f21884j : this.k;
    }

    @Override // com.applovin.impl.s2
    public int d(int i5) {
        return i5 == a.INFO.ordinal() ? this.f21883i.size() : i5 == a.BIDDERS.ordinal() ? this.f21884j.size() : this.k.size();
    }

    @Override // com.applovin.impl.s2
    public r2 e(int i5) {
        return i5 == a.INFO.ordinal() ? new w4("INFO") : i5 == a.BIDDERS.ordinal() ? new w4("BIDDERS") : new w4("WATERFALL");
    }

    public C1653o j() {
        return this.f21880f;
    }

    public String k() {
        return this.f21882h;
    }

    private r2 d() {
        return r2.a().d("Ad Format").c(this.f21879e.b()).a();
    }

    private List e() {
        j8 j8Var = this.f21881g;
        if (j8Var != null && !j8Var.d()) {
            return new ArrayList();
        }
        List<j8> listA = this.f21880f.a();
        ArrayList arrayList = new ArrayList(listA.size());
        for (j8 j8Var2 : listA) {
            j8 j8Var3 = this.f21881g;
            if (j8Var3 == null || j8Var3.b().c().equals(j8Var2.b().c())) {
                arrayList.add(new b(j8Var2, j8Var2.a() != null ? j8Var2.a().a() : "", this.f21881g == null));
            }
        }
        return arrayList;
    }
}
