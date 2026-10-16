package com.applovin.impl;

import android.app.Activity;
import android.provider.Settings;
import cb.AbstractC1593a;
import com.applovin.impl.e6;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.apache.tika.metadata.OfficeOpenXMLExtended;

/* loaded from: classes.dex */
public class d6 extends j5 {

    /* renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f21376g;

    public d6(com.applovin.impl.sdk.k kVar) {
        super("TaskInitializeSdk", kVar, true);
        this.f21376g = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z2, p2 p2Var, Exception exc) {
        if (exc != null) {
            this.f21376g.D().a("license_validation", exc);
        }
        this.f21376g.r0().a(new t6(this.f21376g, p2Var, exc));
    }

    private void g() throws Settings.SettingNotFoundException {
        String str;
        boolean zC = this.f21376g.p0().c();
        Map mapP = this.f21376g.A().p();
        Map mapL = this.f21376g.A().L();
        String strA = zC ? this.f21376g.A().f().a() : "<Enable verbose logging to see the GAID to use for test devices - https://monetization-support.applovin.com/hc/en-us/articles/236114328-How-can-I-expose-verbose-logging-for-the-SDK>";
        if (zC) {
            str = mapP.get("idfv") + " (use this for test devices)";
        } else {
            str = "<Enable verbose logging to see the App Set ID to use for test devices - https://monetization-support.applovin.com/hc/en-us/articles/236114328-How-can-I-expose-verbose-logging-for-the-SDK>";
        }
        v2 v2Var = new v2();
        v2Var.a().a("=====AppLovin SDK=====");
        v2Var.a("===SDK Versions===").a("Version", AppLovinSdk.VERSION).a("Plugin Version", this.f21376g.a(y4.f23676Q3)).a("Ad Review Version", C1643j.b()).a("OM SDK Version", this.f21376g.e0().c());
        v2Var.a("===Device Info===").a("OS", o7.d()).a("GAID", strA).a("App Set ID", str).a("Model", mapP.get("model")).a("Locale", mapP.get("locale")).a("Emulator", mapP.get("sim")).a("Tablet", mapP.get("is_tablet"));
        v2Var.a("===App Info===").a("Application ID", mapL.get("package_name")).a("Target SDK", mapL.get("target_sdk"));
        v2Var.a("===SDK Settings===").a("SDK Key", this.f21376g.j0()).a("Mediation Provider", this.f21376g.V()).a("TG", n7.a(this.f21376g)).a("MD", this.f21376g.a(y4.f23906t)).a("Test Mode On", Boolean.valueOf(this.f21376g.t0().c())).a("Verbose Logging On", Boolean.valueOf(zC));
        v2Var.a("===Privacy States===\nPlease review AppLovin MAX documentation to be compliant with regional privacy policies.").a(AbstractC1656p0.a(a()));
        v2Var.a("===MAX Terms and Privcay Policy Flow===");
        C1667u0 c1667u0X = this.f21376g.x();
        boolean zJ = c1667u0X.j();
        v2Var.a("Enabled", Boolean.valueOf(zJ));
        if (zJ) {
            AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography = this.f21376g.v().getConsentFlowUserGeography();
            AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeographyD = c1667u0X.d();
            AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography2 = AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
            String str2 = "Other";
            v2Var.a("Consent Flow Geography", consentFlowUserGeography == consentFlowUserGeography2 ? "GDPR" : consentFlowUserGeography == AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER ? "Other" : "Unknown");
            if (o7.c(this.f21376g)) {
                if (consentFlowUserGeographyD == consentFlowUserGeography2) {
                    str2 = "GDPR";
                } else if (consentFlowUserGeography != AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER) {
                    str2 = OfficeOpenXMLExtended.SECURITY_NONE;
                }
                v2Var.a("Debug User Geography", str2);
            }
        }
        v2Var.a("Privacy Policy URI", c1667u0X.f()).a("Terms of Service URI", c1667u0X.h());
        v2Var.a("===CMP (CONSENT MANAGEMENT PLATFORM)===").a(this.f21376g.s0().i());
        v2Var.a();
        com.applovin.impl.sdk.o.g("AppLovinSdk", v2Var.toString());
    }

    private void h() {
        Long l10 = (Long) this.f21376g.a(y4.f23948z);
        if (l10.longValue() >= 0 && !((Boolean) b5.a(a5.f20956i, Boolean.FALSE, com.applovin.impl.sdk.k.o())).booleanValue()) {
            this.f21376g.N().a(l10.longValue()).a(this.f21376g.r0().a("lv_task"), new G(this, 0));
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        com.applovin.impl.sdk.o oVar;
        String str2;
        StringBuilder sbJ;
        str = "failed";
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (com.applovin.impl.sdk.o.a()) {
            this.f21768c.a(this.f21767b, "Initializing AppLovin SDK v" + AppLovinSdk.VERSION + "...");
        }
        try {
            this.f21376g.G().b(a());
            this.f21376g.G().e(a());
            this.f21376g.r0().a((j5) new k5(this.f21376g), e6.b.OTHER);
            this.f21376g.A().a0();
            this.f21376g.m0().c();
            this.f21376g.y().l();
            if (o7.c(this.f21376g)) {
                this.f21376g.a();
            }
            this.f21376g.Z0();
            g();
            f();
            this.f21376g.a(true);
            h();
            this.f21376g.f0().b();
            this.f21376g.k().maybeFireAppKilledWhilePlayingAdPostback();
            if (((Boolean) this.f21376g.a(y4.f23607H2)).booleanValue()) {
                this.f21376g.X().maybeFireAppKilledWhilePlayingMediatedAdPostback();
            }
            this.f21376g.F().maybeTrackAppOpenEvent();
            this.f21376g.z().a();
            if (((Boolean) this.f21376g.a(y4.f23706U2)).booleanValue()) {
                this.f21376g.y0().b();
            }
            if (((Boolean) this.f21376g.a(y4.f23766c1)).booleanValue()) {
                this.f21376g.h().b();
            } else {
                this.f21376g.h().g();
            }
            if (this.f21376g.U().g() || (((Boolean) this.f21376g.a(r3.f22735z7)).booleanValue() && o7.c(this.f21376g) && this.f21376g.H0())) {
                this.f21376g.U().e();
            }
            if (this.f21376g.h0() != null) {
                this.f21376g.h0().b((String) this.f21376g.a(y4.f23914u));
            }
            this.f21376g.e0().i();
        } catch (Throwable th) {
            try {
                com.applovin.impl.sdk.o.c("AppLovinSdk", "Failed to initialize SDK!", th);
                this.f21376g.a(false);
                a(th);
                if (((Boolean) this.f21376g.a(y4.f23814i)).booleanValue()) {
                    this.f21376g.f0().a();
                }
                if (((Boolean) this.f21376g.a(y4.f23805h)).booleanValue()) {
                    this.f21376g.V0();
                }
                if (this.f21376g.h0() != null) {
                    this.f21376g.h0().b((String) this.f21376g.a(y4.f23914u));
                }
                this.f21376g.e0().i();
                if (!com.applovin.impl.sdk.o.a()) {
                    return;
                }
                oVar = this.f21768c;
                str2 = this.f21767b;
                sbJ = N0.a.j("AppLovin SDK ");
                sbJ.append(AppLovinSdk.VERSION);
                sbJ.append(" initialization ");
                if (this.f21376g.C0()) {
                }
            } catch (Throwable th2) {
                if (this.f21376g.h0() != null) {
                    this.f21376g.h0().b((String) this.f21376g.a(y4.f23914u));
                }
                this.f21376g.e0().i();
                if (com.applovin.impl.sdk.o.a()) {
                    com.applovin.impl.sdk.o oVar2 = this.f21768c;
                    String str3 = this.f21767b;
                    StringBuilder sb2 = new StringBuilder("AppLovin SDK ");
                    sb2.append(AppLovinSdk.VERSION);
                    sb2.append(" initialization ");
                    sb2.append(this.f21376g.C0() ? "succeeded" : "failed");
                    sb2.append(" in ");
                    sb2.append(System.currentTimeMillis() - jCurrentTimeMillis);
                    AbstractC1593a.w(sb2, "ms", oVar2, str3);
                }
                throw th2;
            }
        }
        if (com.applovin.impl.sdk.o.a()) {
            oVar = this.f21768c;
            str2 = this.f21767b;
            sbJ = N0.a.j("AppLovin SDK ");
            sbJ.append(AppLovinSdk.VERSION);
            sbJ.append(" initialization ");
            if (this.f21376g.C0()) {
                str = "succeeded";
            }
            sbJ.append(str);
            sbJ.append(" in ");
            sbJ.append(System.currentTimeMillis() - jCurrentTimeMillis);
            AbstractC1593a.w(sbJ, "ms", oVar, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f21376g.S().a(this.f21376g.e().b());
    }

    private void f() {
        if (this.f21376g.S().c()) {
            return;
        }
        Activity activityV0 = this.f21376g.v0();
        if (activityV0 != null) {
            this.f21376g.S().a(activityV0);
            return;
        }
        this.f21376g.D().a(d2.f21260C0, this.f21767b + ":maybeInitializeAdapters()");
        this.f21376g.r0().a(new s6(this.f21376g, true, "initializeAdapters", new D0(this, 6)), e6.b.CORE, TimeUnit.SECONDS.toMillis(1L));
    }
}
