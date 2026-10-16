package defpackage;

/* loaded from: classes2.dex */
public final class gpl implements hju, gfx {
    public final hju a;
    public final grw b;

    public gpl(hju hjuVar, grw grwVar) {
        hjuVar.getClass();
        this.a = hjuVar;
        this.b = grwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gpl)) {
            return false;
        }
        gpl gplVar = (gpl) obj;
        return affa.f(this.a, gplVar.a) && affa.f(this.b, gplVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "MediaPlaybackErrorUiModel(header=" + this.a + ", errorState=" + this.b + ")";
    }
}
