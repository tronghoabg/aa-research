package okhttp3;

import com.google.android.gms.internal.consent_sdk.a;
import j$.util.DesugarCollections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/Challenge;", "", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Challenge {

    /* renamed from: a, reason: collision with root package name */
    public final String f42201a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f42202b;

    public Challenge(String str, Map map) {
        String strV;
        this.f42201a = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            if (str2 == null) {
                strV = null;
            } else {
                Locale locale = Locale.US;
                strV = a.v(locale, "US", str2, locale, "this as java.lang.String).toLowerCase(locale)");
            }
            linkedHashMap.put(strV, str3);
        }
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(linkedHashMap);
        AbstractC3340k.d(mapUnmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.f42202b = mapUnmodifiableMap;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Challenge)) {
            return false;
        }
        Challenge challenge = (Challenge) obj;
        return AbstractC3340k.a(challenge.f42201a, this.f42201a) && AbstractC3340k.a(challenge.f42202b, this.f42202b);
    }

    public final int hashCode() {
        return this.f42202b.hashCode() + N0.a.c(899, 31, this.f42201a);
    }

    public final String toString() {
        return this.f42201a + " authParams=" + this.f42202b;
    }
}
