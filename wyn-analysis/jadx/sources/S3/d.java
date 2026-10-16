package S3;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f10938a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f10939b;

    public d(String str, Long l10) {
        this.f10938a = str;
        this.f10939b = l10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return AbstractC3340k.a(this.f10938a, dVar.f10938a) && AbstractC3340k.a(this.f10939b, dVar.f10939b);
    }

    public final int hashCode() {
        int iHashCode = this.f10938a.hashCode() * 31;
        Long l10 = this.f10939b;
        return iHashCode + (l10 == null ? 0 : l10.hashCode());
    }

    public final String toString() {
        return "Preference(key=" + this.f10938a + ", value=" + this.f10939b + ')';
    }
}
