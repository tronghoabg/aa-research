package com.applovin.impl.privacy.cmp;

import A5.g;
import R8.v;
import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.C1646k0;
import com.applovin.impl.Y;
import com.applovin.impl.d2;
import com.applovin.impl.o7;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.y4;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import java.util.HashMap;
import ka.AbstractC3256n;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final k f22557a;

    /* renamed from: b, reason: collision with root package name */
    private final o f22558b;

    /* renamed from: c, reason: collision with root package name */
    private ConsentForm f22559c;

    /* renamed from: d, reason: collision with root package name */
    private int f22560d;

    /* renamed from: com.applovin.impl.privacy.cmp.a$a, reason: collision with other inner class name */
    public interface InterfaceC0018a {
        void onFlowHidden(Bundle bundle);

        void onFlowLoadFailed(CmpErrorImpl cmpErrorImpl);

        void onFlowLoaded(Bundle bundle);

        void onFlowShowFailed(CmpErrorImpl cmpErrorImpl);
    }

    public a(k kVar) {
        this.f22557a = kVar;
        this.f22558b = kVar.O();
        ConsentInformation consentInformation = UserMessagingPlatform.getConsentInformation(k.o());
        a("Initializing with SDK Version: " + b() + ", consentStatus: " + consentInformation.getConsentStatus() + ", consentFormAvailable: " + consentInformation.isConsentFormAvailable());
    }

    public void a() {
        if (this.f22559c != null) {
            this.f22559c = null;
        }
        this.f22560d = 0;
    }

    public String b() {
        return null;
    }

    public void c() {
        a("Resetting consent information");
        UserMessagingPlatform.getConsentInformation(k.o()).reset();
    }

    public boolean d() {
        return true;
    }

    public boolean e() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(InterfaceC0018a interfaceC0018a, FormError formError) {
        b("Failed to request consent info with error: " + formError.getMessage());
        interfaceC0018a.onFlowLoadFailed(a(formError, "Consent info update failed"));
    }

    private boolean c(String str) {
        if (!this.f22557a.c(y4.f23772c7).contains(str)) {
            return false;
        }
        Integer num = (Integer) this.f22557a.a(y4.f23763b7);
        return num.intValue() < 0 || this.f22560d < num.intValue();
    }

    public void a(Activity activity, C1646k0 c1646k0, InterfaceC0018a interfaceC0018a) {
        ConsentRequestParameters.Builder builder = new ConsentRequestParameters.Builder();
        if (o7.c(this.f22557a) && c1646k0.a() == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR) {
            builder.setConsentDebugSettings(new ConsentDebugSettings.Builder(activity).setForceTesting(true).setDebugGeography(1).addTestDeviceHashedId(StringUtils.emptyIfNull(this.f22557a.o0().getExtraParameters().get("google_test_device_hashed_id"))).build());
        }
        UserMessagingPlatform.getConsentInformation(activity).requestConsentInfoUpdate(activity, builder.build(), new g(this, activity, interfaceC0018a, 13), new b(this, interfaceC0018a));
    }

    public void b(Activity activity, final C1646k0 c1646k0, final InterfaceC0018a interfaceC0018a) {
        if (this.f22559c == null) {
            b("Failed to show - not ready yet");
            interfaceC0018a.onFlowShowFailed(new CmpErrorImpl(AppLovinCmpError.Code.FORM_UNAVAILABLE, "Consent form not ready"));
        } else {
            a("Showing consent form...");
            this.f22559c.show(activity, new ConsentForm.OnConsentFormDismissedListener() { // from class: com.applovin.impl.privacy.cmp.c
                @Override // com.google.android.ump.ConsentForm.OnConsentFormDismissedListener
                public final void onConsentFormDismissed(FormError formError) {
                    this.f22563a.a(c1646k0, interfaceC0018a, formError);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(FormError formError, C1646k0 c1646k0, InterfaceC0018a interfaceC0018a) {
        a("Retrying to load and show consent form...");
        this.f22560d++;
        UserMessagingPlatform.loadConsentForm(k.o(), new Y(this, interfaceC0018a, formError, c1646k0), new g(this, interfaceC0018a, formError, 14));
    }

    private void b(String str) {
        if (o.a()) {
            this.f22558b.b("GoogleCmpAdapter", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity, InterfaceC0018a interfaceC0018a) {
        ConsentInformation consentInformation = UserMessagingPlatform.getConsentInformation(activity);
        boolean zIsConsentFormAvailable = consentInformation.isConsentFormAvailable();
        int consentStatus = consentInformation.getConsentStatus();
        a("Loaded parameters consentStatus: " + consentStatus + ", consentFormAvailable: " + zIsConsentFormAvailable);
        if (!zIsConsentFormAvailable) {
            b("Failed to load form.");
            interfaceC0018a.onFlowLoadFailed(new CmpErrorImpl(AppLovinCmpError.Code.FORM_UNAVAILABLE, "Consent form unavailable"));
        } else if (consentStatus != 2) {
            b(AbstractC3256n.g(consentStatus, "Failed to load with consent status: "));
            interfaceC0018a.onFlowLoadFailed(new CmpErrorImpl(AppLovinCmpError.Code.FORM_NOT_REQUIRED, AbstractC3256n.g(consentStatus, "Consent form not required for consent status: ")));
        } else {
            a("Successfully requested consent info");
            a("Loading consent form...");
            UserMessagingPlatform.loadConsentForm(activity, new b(this, interfaceC0018a), new b(this, interfaceC0018a));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(InterfaceC0018a interfaceC0018a, ConsentForm consentForm) {
        a("Successfully loaded consent form");
        this.f22559c = consentForm;
        interfaceC0018a.onFlowLoaded(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(InterfaceC0018a interfaceC0018a, FormError formError) {
        b("Failed to load with error: " + formError.getMessage());
        interfaceC0018a.onFlowLoadFailed(a(formError, "Consent form load failed"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(C1646k0 c1646k0, InterfaceC0018a interfaceC0018a, FormError formError) {
        if (formError != null) {
            String strValueOf = String.valueOf(formError.getErrorCode());
            String message = formError.getMessage();
            HashMap map = new HashMap(2);
            map.put("error_code", strValueOf);
            map.put("error_message", message);
            this.f22557a.D().a(d2.f21283O0, "googleConsentFormDismissed", map);
            if (c(strValueOf)) {
                a(v.f("Consent form was dismissed due to error: ", message));
                AppLovinSdkUtils.runOnUiThread(new Cb.a(this, formError, c1646k0, interfaceC0018a, 16));
                return;
            } else {
                b(v.f("Failed to show with error: ", message));
                interfaceC0018a.onFlowShowFailed(a(formError, "Consent form show failed"));
                return;
            }
        }
        a("Consent form finished showing");
        interfaceC0018a.onFlowHidden(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(InterfaceC0018a interfaceC0018a, FormError formError, C1646k0 c1646k0, ConsentForm consentForm) {
        a("Successfully re-loaded consent form");
        this.f22559c = consentForm;
        Activity activityV0 = this.f22557a.v0();
        if (activityV0 == null) {
            interfaceC0018a.onFlowShowFailed(a(formError, "Consent form show failed"));
        } else {
            b(activityV0, c1646k0, interfaceC0018a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(InterfaceC0018a interfaceC0018a, FormError formError, FormError formError2) {
        b("Retry to load failed with error: " + formError2.getMessage());
        interfaceC0018a.onFlowShowFailed(a(formError, "Consent form show failed"));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.applovin.impl.privacy.cmp.CmpErrorImpl a(com.google.android.ump.FormError r4, java.lang.String r5) {
        /*
            r3 = this;
            com.applovin.sdk.AppLovinCmpError$Code r0 = com.applovin.sdk.AppLovinCmpError.Code.UNSPECIFIED
            int r1 = r4.getErrorCode()
            r2 = 1
            if (r1 == r2) goto L16
            r2 = 2
            if (r1 == r2) goto L16
            r2 = 3
            if (r1 == r2) goto L13
            r2 = 4
            if (r1 == r2) goto L16
            goto L18
        L13:
            com.applovin.sdk.AppLovinCmpError$Code r0 = com.applovin.sdk.AppLovinCmpError.Code.INTEGRATION_ERROR
            goto L18
        L16:
            com.applovin.sdk.AppLovinCmpError$Code r0 = com.applovin.sdk.AppLovinCmpError.Code.FORM_UNAVAILABLE
        L18:
            com.applovin.impl.privacy.cmp.CmpErrorImpl r1 = new com.applovin.impl.privacy.cmp.CmpErrorImpl
            int r2 = r4.getErrorCode()
            java.lang.String r4 = r4.getMessage()
            r1.<init>(r0, r5, r2, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.privacy.cmp.a.a(com.google.android.ump.FormError, java.lang.String):com.applovin.impl.privacy.cmp.CmpErrorImpl");
    }

    private void a(String str) {
        if (o.a()) {
            this.f22558b.a("GoogleCmpAdapter", str);
        }
    }
}
