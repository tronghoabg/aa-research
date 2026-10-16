package J8;

import android.net.Uri;
import com.google.android.gms.common.internal.AbstractC1732v;
import com.google.android.gms.internal.p002firebaseauthapi.zzap;
import java.util.HashMap;
import java.util.Set;

/* renamed from: J8.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0628c {

    /* renamed from: d, reason: collision with root package name */
    public static final zzap f5794d;

    /* renamed from: a, reason: collision with root package name */
    public final String f5795a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5796b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5797c;

    static {
        HashMap map = new HashMap();
        N0.a.p(2, map, "recoverEmail", 0, "resetPassword");
        N0.a.p(4, map, "signIn", 1, "verifyEmail");
        N0.a.p(5, map, "verifyBeforeChangeEmail", 6, "revertSecondFactorAddition");
        f5794d = zzap.zza(map);
    }

    public C0628c(String str) {
        String strA = a(str, "apiKey");
        String strA2 = a(str, "oobCode");
        String strA3 = a(str, "mode");
        if (strA == null || strA2 == null || strA3 == null) {
            throw new IllegalArgumentException("apiKey, oobCode and mode are required in a valid action code URL");
        }
        AbstractC1732v.f(strA);
        AbstractC1732v.f(strA2);
        this.f5795a = strA2;
        AbstractC1732v.f(strA3);
        this.f5796b = strA3;
        a(str, "continueUrl");
        a(str, "languageCode");
        this.f5797c = a(str, "tenantId");
    }

    public static String a(String str, String str2) {
        Uri uri = Uri.parse(str);
        try {
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            if (queryParameterNames.contains(str2)) {
                return uri.getQueryParameter(str2);
            }
            if (!queryParameterNames.contains("link")) {
                return null;
            }
            String queryParameter = uri.getQueryParameter("link");
            AbstractC1732v.f(queryParameter);
            return Uri.parse(queryParameter).getQueryParameter(str2);
        } catch (NullPointerException | UnsupportedOperationException unused) {
            return null;
        }
    }
}
