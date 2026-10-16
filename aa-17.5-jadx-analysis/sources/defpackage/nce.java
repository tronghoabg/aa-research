package defpackage;

import com.google.android.apps.auto.sdk.nav.suggestion.NavigationSuggestion;

/* loaded from: classes2.dex */
public final class nce extends mjv {
    public final NavigationSuggestion a;

    public nce(NavigationSuggestion navigationSuggestion) {
        super(null);
        this.a = navigationSuggestion;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nce) && affa.f(this.a, ((nce) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NavigationClientSuggestion(navSuggestion=" + this.a + ")";
    }
}
