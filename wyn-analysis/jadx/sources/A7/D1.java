package A7;

import android.text.TextUtils;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class D1 {

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f436b = {"GoogleConsent", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "CmpSdkID"};

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f437a;

    public D1(HashMap map) {
        HashMap map2 = new HashMap();
        this.f437a = map2;
        map2.putAll(map);
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        String[] strArr = f436b;
        for (int i5 = 0; i5 < 6; i5++) {
            String str = strArr[i5];
            HashMap map = this.f437a;
            if (map.containsKey(str)) {
                if (sb2.length() > 0) {
                    sb2.append(";");
                }
                sb2.append(str);
                sb2.append("=");
                sb2.append((String) map.get(str));
            }
        }
        return sb2.toString();
    }

    public final int b() {
        try {
            String str = (String) this.f437a.get("PolicyVersion");
            if (TextUtils.isEmpty(str)) {
                return -1;
            }
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof D1) {
            return a().equalsIgnoreCase(((D1) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a();
    }
}
