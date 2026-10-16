package okhttp3;

import com.waze.strings.DisplayStrings;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final String f56297a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f56298b;

    public k(String str, Map map) {
        String lowerCase;
        h.g.b.x.f(str, "scheme");
        h.g.b.x.f(map, "authParams");
        this.f56297a = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            if (str2 != null) {
                Locale locale = Locale.US;
                h.g.b.x.e(locale, "US");
                lowerCase = str2.toLowerCase(locale);
                h.g.b.x.e(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            linkedHashMap.put(lowerCase, str3);
        }
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(linkedHashMap);
        h.g.b.x.e(mapUnmodifiableMap, "unmodifiableMap(...)");
        this.f56298b = mapUnmodifiableMap;
    }

    public final String a() {
        return (String) this.f56298b.get("realm");
    }

    public final String b() {
        return this.f56297a;
    }

    public final Charset c() {
        String str = (String) this.f56298b.get("charset");
        if (str != null) {
            try {
                Charset charsetForName = Charset.forName(str);
                h.g.b.x.e(charsetForName, "forName(...)");
                return charsetForName;
            } catch (Exception unused) {
            }
        }
        Charset charset = StandardCharsets.ISO_8859_1;
        h.g.b.x.e(charset, "ISO_8859_1");
        return charset;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return h.g.b.x.n(kVar.f56297a, this.f56297a) && h.g.b.x.n(kVar.f56298b, this.f56298b);
    }

    public final int hashCode() {
        return ((this.f56297a.hashCode() + DisplayStrings.DS_ROAD_CLOSED) * 31) + this.f56298b.hashCode();
    }

    public final String toString() {
        return this.f56297a + " authParams=" + this.f56298b;
    }
}
