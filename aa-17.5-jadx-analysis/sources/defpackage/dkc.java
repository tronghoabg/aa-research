package defpackage;

import java.util.Locale;

/* loaded from: classes.dex */
public final class dkc {
    public final Locale a;

    public dkc(Locale locale) {
        this.a = locale;
    }

    public final String a() {
        return this.a.toLanguageTag();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof dkc)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return affa.f(a(), ((dkc) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a();
    }
}
