package com.applovin.impl;

import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;

/* loaded from: classes.dex */
class q6 extends j5 {

    /* renamed from: g, reason: collision with root package name */
    private final t7 f22620g;

    /* renamed from: h, reason: collision with root package name */
    private final AppLovinAdLoadListener f22621h;

    public q6(t7 t7Var, AppLovinAdLoadListener appLovinAdLoadListener, com.applovin.impl.sdk.k kVar) {
        super("TaskResolveVastWrapper", kVar);
        this.f22621h = appLovinAdLoadListener;
        this.f22620g = t7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        String strA = b8.a(this.f22620g);
        if (!StringUtils.isValidString(strA)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21768c.b(this.f21767b, "Resolving VAST failed. Could not find resolution URL");
            }
            a(-1);
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f21768c.a(this.f21767b, "Resolving VAST ad with depth " + this.f22620g.d() + " at " + strA);
        }
        try {
            this.f21766a.r0().a(new a(com.applovin.impl.sdk.network.a.a(this.f21766a).b(strA).c("GET").a(q8.f22627f).a(((Integer) this.f21766a.a(y4.f23716V4)).intValue()).c(((Integer) this.f21766a.a(y4.f23724W4)).intValue()).a(false).a(), this.f21766a));
        } catch (Throwable th) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21768c.a(this.f21767b, "Unable to resolve VAST wrapper", th);
            }
            a(-1);
        }
    }

    public class a extends m6 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
        }

        @Override // com.applovin.impl.m6, com.applovin.impl.C1658q0.e
        public void a(String str, q8 q8Var, int i5) {
            this.f21766a.r0().a(i6.a(q8Var, q6.this.f22620g, q6.this.f22621h, q6.this.f21766a));
        }

        @Override // com.applovin.impl.m6, com.applovin.impl.C1658q0.e
        public void a(String str, int i5, String str2, q8 q8Var) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f21768c.b(this.f21767b, "Unable to resolve VAST wrapper. Server returned " + i5);
            }
            q6.this.a(i5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i5) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f21768c.b(this.f21767b, "Failed to resolve VAST wrapper due to error code " + i5);
        }
        if (i5 == -1009) {
            AppLovinAdLoadListener appLovinAdLoadListener = this.f22621h;
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.failedToReceiveAd(i5);
                return;
            }
            return;
        }
        b8.a(this.f22620g, this.f22621h, i5 == -1001 ? u7.TIMED_OUT : u7.GENERAL_WRAPPER_ERROR, i5, this.f21766a);
    }
}
