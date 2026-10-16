package defpackage;

/* loaded from: classes2.dex */
public final class gqc implements hju, gfx {
    public final hju a;
    public final gpk b;
    public final gqh c;
    public final gql d;
    public final aiyk e;
    public final aiyk f;
    private final cjv g;
    private final aiyk h;

    public gqc(hju hjuVar, gpk gpkVar, gqh gqhVar, gql gqlVar, aiyk aiykVar, aiyk aiykVar2, aiyk aiykVar3) {
        hjuVar.getClass();
        gpkVar.getClass();
        gqlVar.getClass();
        aiykVar.getClass();
        aiykVar2.getClass();
        this.a = hjuVar;
        this.b = gpkVar;
        this.c = gqhVar;
        this.d = gqlVar;
        this.e = aiykVar;
        this.g = null;
        this.f = aiykVar2;
        this.h = aiykVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gqc)) {
            return false;
        }
        gqc gqcVar = (gqc) obj;
        if (!affa.f(this.a, gqcVar.a) || !affa.f(this.b, gqcVar.b) || !affa.f(this.c, gqcVar.c) || !affa.f(this.d, gqcVar.d) || !affa.f(this.e, gqcVar.e)) {
            return false;
        }
        cjv cjvVar = gqcVar.g;
        return affa.f(null, null) && affa.f(this.f, gqcVar.f) && affa.f(this.h, gqcVar.h);
    }

    public final int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 961) + this.f.hashCode()) * 31) + this.h.hashCode();
    }

    public final String toString() {
        return "MediaPlaybackUiModel(header=" + this.a + ", metadata=" + this.b + ", playbackControls=" + this.c + ", playbackProgress=" + this.d + ", showProgressFlow=" + this.e + ", accentColor=null, immersiveAudioIconFlow=" + this.f + ", mediaPlaybackIconFlow=" + this.h + ")";
    }
}
