package com.applovin.impl;

import android.app.Activity;
import android.text.TextUtils;
import com.applovin.impl.e6;
import java.util.List;

/* loaded from: classes.dex */
public class l5 extends j5 {

    /* renamed from: g, reason: collision with root package name */
    private final List f21869g;

    /* renamed from: h, reason: collision with root package name */
    private final Activity f21870h;

    public l5(List list, Activity activity, com.applovin.impl.sdk.k kVar) {
        super("TaskAutoInitAdapters", kVar, true);
        this.f21869g = list;
        this.f21870h = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(k3 k3Var) {
        if (com.applovin.impl.sdk.o.a()) {
            this.f21768c.a(this.f21767b, "Auto-initing adapter: " + k3Var);
        }
        this.f21766a.S().a(k3Var, this.f21870h);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f21869g.size() > 0) {
            if (com.applovin.impl.sdk.o.a()) {
                com.applovin.impl.sdk.o oVar = this.f21768c;
                String str = this.f21767b;
                StringBuilder sb2 = new StringBuilder("Auto-initing ");
                sb2.append(this.f21869g.size());
                sb2.append(" adapters");
                sb2.append(this.f21766a.t0().c() ? " in test mode" : "");
                sb2.append("...");
                oVar.a(str, sb2.toString());
            }
            if (TextUtils.isEmpty(this.f21766a.V())) {
                this.f21766a.Q0();
            } else if (!this.f21766a.H0()) {
                com.applovin.impl.sdk.o.h("AppLovinSdk", "Auto-initing adapters for non-MAX mediation provider: " + this.f21766a.V());
            }
            if (this.f21870h == null) {
                com.applovin.impl.sdk.o.h("AppLovinSdk", "\n**********\nAttempting to init 3rd-party SDKs without an Activity instance.\n**********\n");
            }
            for (k3 k3Var : this.f21869g) {
                if (k3Var.s()) {
                    this.f21766a.r0().a(new F(9, this, k3Var), e6.b.MEDIATION);
                } else {
                    this.f21766a.O();
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f21766a.O().a(this.f21767b, "Skipping eager auto-init for adapter " + k3Var);
                    }
                }
            }
        }
    }
}
