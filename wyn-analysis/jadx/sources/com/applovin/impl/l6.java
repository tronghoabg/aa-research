package com.applovin.impl;

import com.applovin.impl.e6;
import com.applovin.impl.p7;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.HashSet;

/* loaded from: classes.dex */
class l6 extends j5 {

    /* renamed from: g, reason: collision with root package name */
    private final t7 f21871g;

    /* renamed from: h, reason: collision with root package name */
    private final AppLovinAdLoadListener f21872h;

    public l6(t7 t7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskRenderVastAd", kVar);
        this.f21872h = appLovinAdLoadListener;
        this.f21871g = t7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f21768c.a(this.f21767b, "Rendering VAST ad...");
        }
        int size = this.f21871g.a().size();
        HashSet hashSet = new HashSet(size);
        HashSet hashSet2 = new HashSet(size);
        String strA = "";
        y7 y7VarA = null;
        c8 c8VarA = null;
        s7 s7VarA = null;
        r7 r7VarA = null;
        String strA2 = "";
        for (q8 q8Var : this.f21871g.a()) {
            q8 q8VarB = q8Var.b(b8.b(q8Var) ? "Wrapper" : "InLine");
            if (q8VarB != null) {
                q8 q8VarB2 = q8VarB.b("AdSystem");
                if (q8VarB2 != null) {
                    y7VarA = y7.a(q8VarB2, y7VarA, this.f21766a);
                }
                strA = b8.a(q8VarB, "AdTitle", strA);
                strA2 = b8.a(q8VarB, "Description", strA2);
                b8.a(q8VarB.a("Impression"), hashSet, this.f21871g, this.f21766a);
                q8 q8VarC = q8VarB.c("ViewableImpression");
                if (q8VarC != null) {
                    b8.a(q8VarC.a("Viewable"), hashSet, this.f21871g, this.f21766a);
                }
                q8 q8VarB3 = q8VarB.b("AdVerifications");
                if (q8VarB3 != null) {
                    r7VarA = r7.a(q8VarB3, r7VarA, this.f21871g, this.f21766a);
                }
                b8.a(q8VarB.a("Error"), hashSet2, this.f21871g, this.f21766a);
                q8 q8VarC2 = q8VarB.c("Creatives");
                if (q8VarC2 != null) {
                    for (q8 q8Var2 : q8VarC2.b()) {
                        q8 q8VarC3 = q8Var2.c("Linear");
                        if (q8VarC3 != null) {
                            c8VarA = c8.a(q8VarC3, c8VarA, this.f21871g, this.f21766a);
                        } else {
                            q8 q8VarB4 = q8Var2.b("CompanionAds");
                            if (q8VarB4 != null) {
                                q8 q8VarB5 = q8VarB4.b("Companion");
                                if (q8VarB5 != null) {
                                    s7VarA = s7.a(q8VarB5, s7VarA, this.f21871g, this.f21766a);
                                }
                            } else if (com.applovin.impl.sdk.o.a()) {
                                this.f21768c.b(this.f21767b, "Received and will skip rendering for an unidentified creative: " + q8Var2);
                            }
                        }
                    }
                }
            } else if (com.applovin.impl.sdk.o.a()) {
                this.f21768c.b(this.f21767b, "Did not find wrapper or inline response for node: " + q8Var);
            }
        }
        p7 p7VarA = new p7.b().a(this.f21766a).a(this.f21871g.b()).b(this.f21871g.e()).a(this.f21871g.c()).b(strA).a(strA2).a(y7VarA).a(c8VarA).a(s7VarA).a(r7VarA).b(hashSet).a(r7VarA).a(hashSet2).a();
        u7 u7VarC = b8.c(p7VarA);
        if (u7VarC != null) {
            b8.a(this.f21871g, this.f21872h, u7VarC, -6, this.f21766a);
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f21768c.a(this.f21767b, "Finished rendering VAST ad: " + p7VarA);
        }
        p7VarA.getAdEventTracker().e();
        this.f21766a.r0().a((j5) new o5(p7VarA, this.f21766a, this.f21872h), e6.b.CACHING);
    }
}
