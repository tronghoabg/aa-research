package defpackage;

/* loaded from: classes.dex */
public final class abw {
    public final cfn a;
    public final afec b;
    public final aew c;
    public final boolean d = true;

    public abw(cfn cfnVar, afec afecVar, aew aewVar) {
        this.a = cfnVar;
        this.b = afecVar;
        this.c = aewVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abw)) {
            return false;
        }
        abw abwVar = (abw) obj;
        if (!affa.f(this.a, abwVar.a) || this.b != abwVar.b || !affa.f(this.c, abwVar.c)) {
            return false;
        }
        boolean z = abwVar.d;
        return true;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + a.f(true);
    }

    public final String toString() {
        return "ChangeSizeConfig(alignment=" + this.a + ", size=" + this.b + ", animationSpec=" + this.c + ", clip=true)";
    }
}
