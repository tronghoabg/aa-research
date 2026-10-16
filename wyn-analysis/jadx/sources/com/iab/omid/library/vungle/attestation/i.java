package com.iab.omid.library.vungle.attestation;

import android.content.Context;
import com.amazon.privacypass.PrivacyPass;
import com.amazon.privacypass.VerificationContext;
import com.amazon.privacypass.callback.AttestAPICallback;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public class i implements b {

    /* renamed from: a, reason: collision with root package name */
    private final Context f28112a;

    /* renamed from: b, reason: collision with root package name */
    private final j f28113b;

    public i(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Application context cannot be null");
        }
        this.f28112a = context;
        this.f28113b = j.a(context);
    }

    @Override // com.iab.omid.library.vungle.attestation.b
    public String a() {
        return "FireTVFOSDAT";
    }

    @Override // com.iab.omid.library.vungle.attestation.b
    public h b() {
        return h.NATIVE;
    }

    @Override // com.iab.omid.library.vungle.attestation.b
    public List<String> c() {
        return Collections.singletonList("1.0");
    }

    private String a(String str) {
        return (str == null || str.trim().isEmpty()) ? "1.0" : str;
    }

    private boolean b(String str) {
        try {
            new URL(str);
            if (str.startsWith("https://")) {
                return true;
            }
            return str.startsWith("http://");
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    @Override // com.iab.omid.library.vungle.attestation.b
    public void a(a aVar) {
        String strConcat;
        String str;
        if (!this.f28113b.b()) {
            strConcat = "Attestation failed: Full attestation capability not available";
        } else if (aVar == null) {
            strConcat = "Attestation failed: AttestationArgs is null";
        } else if (aVar.a() == null) {
            strConcat = "Attestation failed: attestationData is null";
        } else {
            String str2 = aVar.a().get("verifierurl");
            String strA = a(aVar.a().get("version"));
            if (str2 == null || str2.trim().isEmpty()) {
                strConcat = "Attestation failed: verifier URL is null or empty";
            } else {
                if (b(str2)) {
                    com.iab.omid.library.vungle.utils.d.a("Starting FireTV's FOS device attestation with verifier URL: ".concat(str2));
                    try {
                        if (this.f28112a == null) {
                            com.iab.omid.library.vungle.utils.d.b("Attestation failed: application context is null");
                            return;
                        } else {
                            PrivacyPass.getInstance(this.f28112a).attest(new VerificationContext(Collections.singletonList(str2)), (AttestAPICallback) null, strA);
                            return;
                        }
                    } catch (IllegalArgumentException e7) {
                        e = e7;
                        str = "Attestation failed: Invalid input parameters";
                        com.iab.omid.library.vungle.utils.d.a(str, e);
                        return;
                    } catch (Exception e10) {
                        e = e10;
                        str = "Attestation failed: unexpected error";
                        com.iab.omid.library.vungle.utils.d.a(str, e);
                        return;
                    }
                }
                strConcat = "Attestation failed: invalid verifier URL format: ".concat(str2);
            }
        }
        com.iab.omid.library.vungle.utils.d.b(strConcat);
    }
}
