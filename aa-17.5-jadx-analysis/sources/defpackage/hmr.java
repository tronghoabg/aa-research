package defpackage;

/* loaded from: classes2.dex */
public final class hmr implements hju {
    public final hju a;
    public final grw b;

    public hmr(hju hjuVar, grw grwVar) {
        this.a = hjuVar;
        this.b = grwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hmr)) {
            return false;
        }
        hmr hmrVar = (hmr) obj;
        return affa.f(this.a, hmrVar.a) && affa.f(this.b, hmrVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "WebViewErrorUiModel(header=" + this.a + ", errorState=" + this.b + ")";
    }
}
