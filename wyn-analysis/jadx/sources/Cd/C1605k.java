package cd;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import java.util.ArrayList;
import java.util.Iterator;
import uc.C4278o;
import uc.C4281r;
import uc.C4287x;
import uc.InterfaceC4269f;
import uc.InterfaceC4279p;
import uc.InterfaceC4280q;

/* renamed from: cd.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1605k implements InterfaceC4279p {

    /* renamed from: a, reason: collision with root package name */
    public final C1597c f19839a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f19840b;

    /* renamed from: c, reason: collision with root package name */
    public ConsentInformation f19841c;

    /* renamed from: d, reason: collision with root package name */
    public Activity f19842d;

    public C1605k(InterfaceC4269f interfaceC4269f, Context context) {
        C1597c c1597c = new C1597c();
        this.f19839a = c1597c;
        new C4281r(interfaceC4269f, "plugins.flutter.io/google_mobile_ads/ump", new C4287x(c1597c), null).b(this);
        this.f19840b = context;
    }

    public final ConsentInformation a() {
        ConsentInformation consentInformation = this.f19841c;
        if (consentInformation != null) {
            return consentInformation;
        }
        ConsentInformation consentInformation2 = UserMessagingPlatform.getConsentInformation(this.f19840b);
        this.f19841c = consentInformation2;
        return consentInformation2;
    }

    @Override // uc.InterfaceC4279p
    public final void onMethodCall(C4278o c4278o, InterfaceC4280q interfaceC4280q) {
        final int i5;
        final int i10;
        ConsentRequestParameters consentRequestParametersBuild;
        i5 = 1;
        i10 = 0;
        String str = c4278o.f46759a;
        str.getClass();
        switch (str) {
            case "ConsentInformation#reset":
                a().reset();
                ((tc.g) interfaceC4280q).a(null);
                break;
            case "UserMessagingPlatform#loadAndShowConsentFormIfRequired":
                Activity activity = this.f19842d;
                if (activity != null) {
                    final tc.g gVar = (tc.g) interfaceC4280q;
                    UserMessagingPlatform.loadAndShowConsentFormIfRequired(activity, new ConsentForm.OnConsentFormDismissedListener() { // from class: cd.d
                        @Override // com.google.android.ump.ConsentForm.OnConsentFormDismissedListener
                        public final void onConsentFormDismissed(FormError formError) {
                            switch (i10) {
                                case 0:
                                    gVar.a(formError);
                                    break;
                                default:
                                    gVar.a(formError);
                                    break;
                            }
                        }
                    });
                    break;
                } else {
                    ((tc.g) interfaceC4280q).b("0", "UserMessagingPlatform#loadAndShowConsentFormIfRequired called before plugin has been registered to an activity.", null);
                    break;
                }
            case "ConsentInformation#requestConsentInfoUpdate":
                if (this.f19842d != null) {
                    C1596b c1596b = (C1596b) c4278o.a("params");
                    if (c1596b == null) {
                        consentRequestParametersBuild = new ConsentRequestParameters.Builder().build();
                    } else {
                        Activity activity2 = this.f19842d;
                        ConsentRequestParameters.Builder builder = new ConsentRequestParameters.Builder();
                        Boolean bool = c1596b.f19827a;
                        if (bool != null) {
                            builder.setTagForUnderAgeOfConsent(bool.booleanValue());
                        }
                        C1595a c1595a = c1596b.f19828b;
                        if (c1595a != null) {
                            ConsentDebugSettings.Builder builder2 = new ConsentDebugSettings.Builder(activity2);
                            Integer num = c1595a.f19825a;
                            if (num != null) {
                                builder2.setDebugGeography(num.intValue());
                            }
                            ArrayList arrayList = c1595a.f19826b;
                            if (arrayList != null) {
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    builder2.addTestDeviceHashedId((String) it.next());
                                }
                            }
                            builder.setConsentDebugSettings(builder2.build());
                        }
                        consentRequestParametersBuild = builder.build();
                    }
                    tc.g gVar2 = (tc.g) interfaceC4280q;
                    a().requestConsentInfoUpdate(this.f19842d, consentRequestParametersBuild, new C1599e(gVar2), new C1600f(gVar2));
                    break;
                } else {
                    ((tc.g) interfaceC4280q).b("0", "ConsentInformation#requestConsentInfoUpdate called before plugin has been registered to an activity.", null);
                    break;
                }
            case "ConsentForm#show":
                ConsentForm consentForm = (ConsentForm) c4278o.a("consentForm");
                if (consentForm != null) {
                    consentForm.show(this.f19842d, new C1603i((tc.g) interfaceC4280q));
                    break;
                } else {
                    ((tc.g) interfaceC4280q).b("0", "ConsentForm#show", null);
                    break;
                }
            case "ConsentForm#dispose":
                ConsentForm consentForm2 = (ConsentForm) c4278o.a("consentForm");
                if (consentForm2 == null) {
                    Log.w("0", "Called dispose on ad that has been freed");
                } else {
                    this.f19839a.f19829d.remove(Integer.valueOf(consentForm2.hashCode()));
                }
                ((tc.g) interfaceC4280q).a(null);
                break;
            case "UserMessagingPlatform#showPrivacyOptionsForm":
                Activity activity3 = this.f19842d;
                if (activity3 != null) {
                    final tc.g gVar3 = (tc.g) interfaceC4280q;
                    UserMessagingPlatform.showPrivacyOptionsForm(activity3, new ConsentForm.OnConsentFormDismissedListener() { // from class: cd.d
                        @Override // com.google.android.ump.ConsentForm.OnConsentFormDismissedListener
                        public final void onConsentFormDismissed(FormError formError) {
                            switch (i5) {
                                case 0:
                                    gVar3.a(formError);
                                    break;
                                default:
                                    gVar3.a(formError);
                                    break;
                            }
                        }
                    });
                    break;
                } else {
                    ((tc.g) interfaceC4280q).b("0", "UserMessagingPlatform#showPrivacyOptionsForm called before plugin has been registered to an activity.", null);
                    break;
                }
            case "ConsentInformation#isConsentFormAvailable":
                ((tc.g) interfaceC4280q).a(Boolean.valueOf(a().isConsentFormAvailable()));
                break;
            case "UserMessagingPlatform#loadConsentForm":
                tc.g gVar4 = (tc.g) interfaceC4280q;
                UserMessagingPlatform.loadConsentForm(this.f19840b, new C1601g(this, gVar4), new C1602h(gVar4));
                break;
            case "ConsentInformation#getPrivacyOptionsRequirementStatus":
                int i11 = AbstractC1604j.f19838a[a().getPrivacyOptionsRequirementStatus().ordinal()];
                if (i11 == 1) {
                    ((tc.g) interfaceC4280q).a(0);
                    break;
                } else if (i11 == 2) {
                    ((tc.g) interfaceC4280q).a(1);
                    break;
                } else {
                    ((tc.g) interfaceC4280q).a(2);
                    break;
                }
            case "ConsentInformation#canRequestAds":
                ((tc.g) interfaceC4280q).a(Boolean.valueOf(a().canRequestAds()));
                break;
            case "ConsentInformation#getConsentStatus":
                ((tc.g) interfaceC4280q).a(Integer.valueOf(a().getConsentStatus()));
                break;
            default:
                ((tc.g) interfaceC4280q).c();
                break;
        }
    }
}
