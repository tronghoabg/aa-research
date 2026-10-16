package com.applovin.impl;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import cb.AbstractC1593a;
import com.applovin.impl.C1634e0;
import com.applovin.impl.m5;
import com.applovin.impl.p7;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.x7;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
class o5 extends m5 {

    /* renamed from: q, reason: collision with root package name */
    private final p7 f22431q;

    public class a implements C1634e0.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ x7 f22432a;

        public a(x7 x7Var) {
            this.f22432a = x7Var;
        }

        @Override // com.applovin.impl.C1634e0.a
        public void a(Uri uri) {
            if (uri != null) {
                this.f22432a.a(uri);
                o5.this.f22431q.b(true);
                return;
            }
            com.applovin.impl.sdk.o oVar = o5.this.f21768c;
            if (com.applovin.impl.sdk.o.a()) {
                o5 o5Var = o5.this;
                o5Var.f21768c.b(o5Var.f21767b, "Failed to cache static companion ad");
            }
        }
    }

    public class b implements m5.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ x7 f22434a;

        public b(x7 x7Var) {
            this.f22434a = x7Var;
        }

        @Override // com.applovin.impl.m5.e
        public void a(String str) {
            this.f22434a.a(str);
            o5.this.f22431q.b(true);
        }
    }

    public class c implements m5.e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ x7 f22436a;

        public c(x7 x7Var) {
            this.f22436a = x7Var;
        }

        @Override // com.applovin.impl.m5.e
        public void a(String str) {
            this.f22436a.a(str);
            o5.this.f22431q.b(true);
        }
    }

    public class d implements C1634e0.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ d8 f22438a;

        public d(d8 d8Var) {
            this.f22438a = d8Var;
        }

        @Override // com.applovin.impl.C1634e0.a
        public void a(Uri uri) {
            if (uri != null) {
                com.applovin.impl.sdk.o oVar = o5.this.f21768c;
                if (com.applovin.impl.sdk.o.a()) {
                    o5 o5Var = o5.this;
                    o5Var.f21768c.a(o5Var.f21767b, "Video file successfully cached into: " + uri);
                }
                this.f22438a.a(uri);
                return;
            }
            com.applovin.impl.sdk.o oVar2 = o5.this.f21768c;
            if (com.applovin.impl.sdk.o.a()) {
                o5 o5Var2 = o5.this;
                o5Var2.f21768c.b(o5Var2.f21767b, "Failed to cache video file: " + this.f22438a);
            }
        }
    }

    public class e implements m5.e {
        public e() {
        }

        @Override // com.applovin.impl.m5.e
        public void a(String str) {
            if (o5.this.f22431q.isOpenMeasurementEnabled()) {
                str = o5.this.f21766a.e0().a(str, f2.a((AppLovinAdImpl) o5.this.f21916g));
            }
            o5.this.f22431q.d(str);
            com.applovin.impl.sdk.o oVar = o5.this.f21768c;
            if (com.applovin.impl.sdk.o.a()) {
                o5 o5Var = o5.this;
                o5Var.f21768c.a(o5Var.f21767b, "Finish caching HTML template " + o5.this.f22431q.i1() + " for ad #" + o5.this.f22431q.getAdIdNumber());
            }
        }
    }

    public o5(p7 p7Var, com.applovin.impl.sdk.k kVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheVastAd", p7Var, kVar, appLovinAdLoadListener);
        this.f22431q = p7Var;
    }

    private String d(String str) {
        for (String str2 : StringUtils.getRegexMatches(StringUtils.match(str, (String) this.f21766a.a(y4.i5)), 1)) {
            if (!TextUtils.isEmpty(str2)) {
                Uri uriA = a(str2, Collections.EMPTY_LIST, false);
                if (uriA != null) {
                    str = str.replace(str2, uriA.toString());
                    this.f21916g.a(uriA.toString(), str2);
                } else if (com.applovin.impl.sdk.o.a()) {
                    this.f21768c.b(this.f21767b, "Failed to cache JavaScript resource: " + str2);
                }
            }
        }
        return str;
    }

    private void m() {
        if (l()) {
            return;
        }
        if (!this.f22431q.u1()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21768c.a(this.f21767b, "Companion ad caching disabled. Skipping...");
                return;
            }
            return;
        }
        s7 s7VarG1 = this.f22431q.g1();
        if (s7VarG1 == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21768c.a(this.f21767b, "No companion ad provided. Skipping...");
                return;
            }
            return;
        }
        x7 x7VarE = s7VarG1.e();
        if (x7VarE == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21768c.b(this.f21767b, "Failed to retrieve non-video resources from companion ad. Skipping...");
                return;
            }
            return;
        }
        Uri uriC = x7VarE.c();
        String string = uriC != null ? uriC.toString() : "";
        String strB = x7VarE.b();
        if (!URLUtil.isValidUrl(string) && !StringUtils.isValidString(strB)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21768c.k(this.f21767b, "Companion ad does not have any resources attached. Skipping...");
                return;
            }
            return;
        }
        if (x7VarE.d() == x7.a.STATIC) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21768c.a(this.f21767b, "Caching static companion ad at " + string + "...");
            }
            Uri uriA = a(string, Collections.EMPTY_LIST, false);
            if (uriA != null) {
                x7VarE.a(uriA);
                this.f22431q.b(true);
                return;
            } else {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21768c.b(this.f21767b, "Failed to cache static companion ad");
                    return;
                }
                return;
            }
        }
        if (x7VarE.d() != x7.a.HTML) {
            if (x7VarE.d() == x7.a.IFRAME && com.applovin.impl.sdk.o.a()) {
                this.f21768c.a(this.f21767b, "Skip caching of iFrame resource...");
                return;
            }
            return;
        }
        if (!StringUtils.isValidString(string)) {
            if (com.applovin.impl.sdk.o.a()) {
                AbstractC1593a.s("Caching provided HTML for companion ad. No fetch required. HTML: ", strB, this.f21768c, this.f21767b);
            }
            if (((Boolean) this.f21766a.a(y4.f23811h5)).booleanValue()) {
                strB = d(strB);
            }
            x7VarE.a(a(strB, Collections.EMPTY_LIST, this.f22431q));
            this.f22431q.b(true);
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f21768c.a(this.f21767b, "Begin caching HTML companion ad. Fetching from " + string + "...");
        }
        String strC = c(string, null, false);
        if (StringUtils.isValidString(strC)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21768c.a(this.f21767b, "HTML fetched. Caching HTML now...");
            }
            x7VarE.a(a(strC, Collections.EMPTY_LIST, this.f22431q));
            this.f22431q.b(true);
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f21768c.b(this.f21767b, "Unable to load companion ad resources from " + string);
        }
    }

    private void n() {
        if (l() || !b8.a(this.f22431q)) {
            return;
        }
        String strI1 = this.f22431q.i1();
        if (!StringUtils.isValidString(strI1)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21768c.a(this.f21767b, "Unable to load HTML template");
                return;
            }
            return;
        }
        String strA = a(strI1, this.f22431q.S(), this.f21916g);
        if (this.f22431q.isOpenMeasurementEnabled()) {
            strA = this.f21766a.e0().a(strA, f2.a((AppLovinAdImpl) this.f21916g));
        }
        this.f22431q.d(strA);
        if (com.applovin.impl.sdk.o.a()) {
            this.f21768c.a(this.f21767b, "Finish caching HTML template " + this.f22431q.i1() + " for ad #" + this.f22431q.getAdIdNumber());
        }
    }

    private void o() {
        d8 d8VarQ1;
        Uri uriE;
        if (l()) {
            return;
        }
        if (!this.f22431q.v1()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21768c.a(this.f21767b, "Video caching disabled. Skipping...");
                return;
            }
            return;
        }
        if (this.f22431q.p1() == null || (d8VarQ1 = this.f22431q.q1()) == null || (uriE = d8VarQ1.e()) == null) {
            return;
        }
        Uri uriB = b(uriE.toString(), Collections.EMPTY_LIST, false);
        if (uriB != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21768c.a(this.f21767b, "Video file successfully cached into: " + uriB);
            }
            d8VarQ1.a(uriB);
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f21768c.b(this.f21767b, "Failed to cache video file: " + d8VarQ1);
        }
    }

    private AbstractCallableC1630c0 p() {
        if (!this.f22431q.u1()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21768c.a(this.f21767b, "Companion ad caching disabled. Skipping...");
            }
            return null;
        }
        s7 s7VarG1 = this.f22431q.g1();
        if (s7VarG1 == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21768c.a(this.f21767b, "No companion ad provided. Skipping...");
            }
            return null;
        }
        x7 x7VarE = s7VarG1.e();
        if (x7VarE == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21768c.b(this.f21767b, "Failed to retrieve non-video resources from companion ad. Skipping...");
            }
            return null;
        }
        Uri uriC = x7VarE.c();
        String string = uriC != null ? uriC.toString() : "";
        String strB = x7VarE.b();
        if (URLUtil.isValidUrl(string) || StringUtils.isValidString(strB)) {
            if (x7VarE.d() == x7.a.STATIC) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21768c.a(this.f21767b, "Caching static companion ad at " + string + "...");
                }
                return new C1634e0(string, this.f22431q, Collections.EMPTY_LIST, false, this.f21918i, this.f21766a, new a(x7VarE));
            }
            if (x7VarE.d() == x7.a.HTML) {
                if (!StringUtils.isValidString(string)) {
                    if (com.applovin.impl.sdk.o.a()) {
                        AbstractC1593a.s("Caching provided HTML for companion ad. No fetch required. HTML: ", strB, this.f21768c, this.f21767b);
                    }
                    return a(strB, Collections.EMPTY_LIST, new c(x7VarE));
                }
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21768c.a(this.f21767b, "Begin caching HTML companion ad. Fetching from " + string + "...");
                }
                String strC = c(string, null, false);
                if (StringUtils.isValidString(strC)) {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f21768c.a(this.f21767b, "HTML fetched. Caching HTML now...");
                    }
                    return a(strC, Collections.EMPTY_LIST, new b(x7VarE));
                }
                if (com.applovin.impl.sdk.o.a()) {
                    this.f21768c.b(this.f21767b, "Unable to load companion ad resources from " + string);
                }
            } else if (x7VarE.d() == x7.a.IFRAME && com.applovin.impl.sdk.o.a()) {
                this.f21768c.a(this.f21767b, "Skip caching of iFrame resource...");
            }
        } else if (com.applovin.impl.sdk.o.a()) {
            this.f21768c.k(this.f21767b, "Companion ad does not have any resources attached. Skipping...");
        }
        return null;
    }

    @Override // com.applovin.impl.m5
    public void f() {
        this.f22431q.getAdEventTracker().h();
        super.f();
    }

    public C1632d0 q() {
        if (!TextUtils.isEmpty(this.f22431q.i1())) {
            return a(this.f22431q.i1(), this.f22431q.S(), new e());
        }
        if (!com.applovin.impl.sdk.o.a()) {
            return null;
        }
        this.f21768c.a(this.f21767b, "Unable to load HTML template");
        return null;
    }

    public C1634e0 r() {
        d8 d8VarQ1;
        Uri uriE;
        if (!this.f22431q.v1()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21768c.a(this.f21767b, "Video caching disabled. Skipping...");
            }
            return null;
        }
        if (this.f22431q.p1() == null || (d8VarQ1 = this.f22431q.q1()) == null || (uriE = d8VarQ1.e()) == null) {
            return null;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f21768c.a(this.f21767b, "Caching video file " + d8VarQ1 + " creative...");
        }
        return a(uriE.toString(), Collections.EMPTY_LIST, false, new d(d8VarQ1));
    }

    @Override // com.applovin.impl.m5, java.lang.Runnable
    public void run() {
        super.run();
        boolean zC0 = this.f22431q.C0();
        if (com.applovin.impl.sdk.o.a()) {
            com.applovin.impl.sdk.o oVar = this.f21768c;
            String str = this.f21767b;
            StringBuilder sb2 = new StringBuilder("Begin caching for VAST ");
            sb2.append(zC0 ? "streaming " : "");
            sb2.append("ad #");
            sb2.append(this.f21916g.getAdIdNumber());
            sb2.append("...");
            oVar.a(str, sb2.toString());
        }
        if (zC0) {
            if (((Boolean) this.f21766a.a(y4.f23650N0)).booleanValue()) {
                if (!AbstractC1654o0.e()) {
                    a(e());
                }
                if (this.f22431q.s1()) {
                    f();
                    ArrayList arrayList = new ArrayList();
                    AbstractCallableC1630c0 abstractCallableC1630c0P = p();
                    if (abstractCallableC1630c0P != null) {
                        arrayList.add(abstractCallableC1630c0P);
                    }
                    C1632d0 c1632d0Q = q();
                    if (c1632d0Q != null) {
                        arrayList.add(c1632d0Q);
                    }
                    C1634e0 c1634e0R = r();
                    if (c1634e0R != null) {
                        arrayList.add(c1634e0R);
                    }
                    a(arrayList);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    if (this.f22431q.j1() == p7.c.COMPANION_AD) {
                        AbstractCallableC1630c0 abstractCallableC1630c0P2 = p();
                        if (abstractCallableC1630c0P2 != null) {
                            arrayList2.add(abstractCallableC1630c0P2);
                        }
                        C1632d0 c1632d0Q2 = q();
                        if (c1632d0Q2 != null) {
                            arrayList2.add(c1632d0Q2);
                        }
                        a(arrayList2);
                        f();
                        C1634e0 c1634e0R2 = r();
                        if (c1634e0R2 != null) {
                            arrayList3.add(c1634e0R2);
                        }
                        a(arrayList3);
                    } else {
                        C1634e0 c1634e0R3 = r();
                        if (c1634e0R3 != null) {
                            arrayList2.add(c1634e0R3);
                        }
                        a(arrayList2);
                        f();
                        AbstractCallableC1630c0 abstractCallableC1630c0P3 = p();
                        if (abstractCallableC1630c0P3 != null) {
                            arrayList3.add(abstractCallableC1630c0P3);
                        }
                        C1632d0 c1632d0Q3 = q();
                        if (c1632d0Q3 != null) {
                            arrayList3.add(c1632d0Q3);
                        }
                        a(arrayList3);
                    }
                }
            } else {
                j();
                if (this.f22431q.s1()) {
                    f();
                }
                p7.c cVarJ1 = this.f22431q.j1();
                p7.c cVar = p7.c.COMPANION_AD;
                if (cVarJ1 == cVar) {
                    m();
                    n();
                    a(this.f22431q);
                } else {
                    o();
                }
                if (!this.f22431q.s1()) {
                    f();
                }
                if (this.f22431q.j1() == cVar) {
                    o();
                } else {
                    m();
                    n();
                    a(this.f22431q);
                }
            }
        } else if (((Boolean) this.f21766a.a(y4.f23650N0)).booleanValue()) {
            ArrayList arrayList4 = new ArrayList();
            if (!AbstractC1654o0.e()) {
                arrayList4.addAll(e());
            }
            AbstractCallableC1630c0 abstractCallableC1630c0P4 = p();
            if (abstractCallableC1630c0P4 != null) {
                arrayList4.add(abstractCallableC1630c0P4);
            }
            C1634e0 c1634e0R4 = r();
            if (c1634e0R4 != null) {
                arrayList4.add(c1634e0R4);
            }
            C1632d0 c1632d0Q4 = q();
            if (c1632d0Q4 != null) {
                arrayList4.add(c1632d0Q4);
            }
            a(arrayList4);
            f();
        } else {
            j();
            m();
            o();
            n();
            a(this.f22431q);
            f();
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f21768c.a(this.f21767b, "Finished caching VAST ad #" + this.f22431q.getAdIdNumber());
        }
        this.f22431q.t1();
        k();
    }

    @Override // com.applovin.impl.m5
    public void a(int i5) {
        this.f22431q.getAdEventTracker().f();
        super.a(i5);
    }
}
