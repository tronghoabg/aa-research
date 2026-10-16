package defpackage;

/* loaded from: classes2.dex */
public final class gja extends cxt<gjc> {
    private final aqf a;
    private final int b = 1;
    private final afec c;

    public gja(aqf aqfVar, afec afecVar) {
        this.a = aqfVar;
        this.c = afecVar;
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ cfx d() {
        return new gjc(this.a);
    }

    @Override // defpackage.cxt
    public final /* bridge */ /* synthetic */ void e(cfx cfxVar) {
        gjc gjcVar = (gjc) cfxVar;
        gjcVar.a = this.a;
        gjcVar.b = 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gja)) {
            return false;
        }
        gja gjaVar = (gja) obj;
        if (!affa.f(this.a, gjaVar.a)) {
            return false;
        }
        int i = gjaVar.b;
        return affa.f(this.c, gjaVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + 1) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "RotaryScrollElement(scrollableState=" + this.a + ", scrollScale=1, inspectorInfo=" + this.c + ")";
    }
}
