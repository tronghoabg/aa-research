package Jd;

import java.util.Locale;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f6058a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6059b;

    public j(String name, String value) {
        AbstractC3340k.e(name, "name");
        AbstractC3340k.e(value, "value");
        this.f6058a = name;
        this.f6059b = value;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Bf.r.c0(jVar.f6058a, this.f6058a, true) && Bf.r.c0(jVar.f6059b, this.f6059b, true);
    }

    public final int hashCode() {
        Locale locale = Locale.ROOT;
        String lowerCase = this.f6058a.toLowerCase(locale);
        AbstractC3340k.d(lowerCase, "toLowerCase(...)");
        int iHashCode = lowerCase.hashCode();
        String lowerCase2 = this.f6059b.toLowerCase(locale);
        AbstractC3340k.d(lowerCase2, "toLowerCase(...)");
        return lowerCase2.hashCode() + (iHashCode * 31) + iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HeaderValueParam(name=");
        sb2.append(this.f6058a);
        sb2.append(", value=");
        return wg.b.c(sb2, this.f6059b, ", escapeValue=false)");
    }
}
