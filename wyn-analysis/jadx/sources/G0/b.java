package G0;

import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final a f4136a;

    public b(a platformLocale) {
        AbstractC3340k.e(platformLocale, "platformLocale");
        this.f4136a = platformLocale;
    }

    public final String a() {
        String languageTag = this.f4136a.f4135a.toLanguageTag();
        AbstractC3340k.d(languageTag, "javaLocale.toLanguageTag()");
        return languageTag;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return a().equals(((b) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a();
    }
}
