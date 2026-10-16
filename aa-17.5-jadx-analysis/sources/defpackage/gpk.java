package defpackage;

/* loaded from: classes2.dex */
public final class gpk implements hju {
    public final aiyk a;
    public final aiyk b;
    public final aiyk c;

    public gpk(aiyk aiykVar, aiyk aiykVar2, aiyk aiykVar3) {
        aiykVar.getClass();
        aiykVar2.getClass();
        aiykVar3.getClass();
        this.a = aiykVar;
        this.b = aiykVar2;
        this.c = aiykVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gpk)) {
            return false;
        }
        gpk gpkVar = (gpk) obj;
        return affa.f(this.a, gpkVar.a) && affa.f(this.b, gpkVar.b) && affa.f(this.c, gpkVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "MediaMetadataUiModel(titleFlow=" + this.a + ", subtitleFlow=" + this.b + ", albumFlow=" + this.c + ")";
    }
}
