package defpackage;

/* loaded from: classes2.dex */
public final class grh implements hju {
    public final gpk a;
    public final aiyk b;
    public final gqh c;
    public final aiyk d;
    public final afdr e;

    public grh(gpk gpkVar, aiyk aiykVar, gqh gqhVar, aiyk aiykVar2, afdr afdrVar) {
        aiykVar.getClass();
        aiykVar2.getClass();
        this.a = gpkVar;
        this.b = aiykVar;
        this.c = gqhVar;
        this.d = aiykVar2;
        this.e = afdrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof grh)) {
            return false;
        }
        grh grhVar = (grh) obj;
        return affa.f(this.a, grhVar.a) && affa.f(this.b, grhVar.b) && affa.f(this.c, grhVar.c) && affa.f(this.d, grhVar.d) && affa.f(this.e, grhVar.e);
    }

    public final int hashCode() {
        int iHashCode = (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        afdr afdrVar = this.e;
        return (iHashCode * 31) + (afdrVar == null ? 0 : afdrVar.hashCode());
    }

    public final String toString() {
        return "MediaExpandableWidgetUiModel(metadata=" + this.a + ", progressFlow=" + this.b + ", playbackControls=" + this.c + ", playbackIconFlow=" + this.d + ", widgetOnClick=" + this.e + ")";
    }
}
