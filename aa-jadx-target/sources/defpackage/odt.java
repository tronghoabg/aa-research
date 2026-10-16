package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class odt extends defpackage.cyc<defpackage.odw> {
    private final defpackage.ask a;
    private final defpackage.lhe b;

    public odt(defpackage.lhe lheVar, defpackage.ask askVar) {
        this.b = lheVar;
        this.a = askVar;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.odw(this.b, this.a);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        defpackage.odw odwVar = (defpackage.odw) cgeVar;
        ((defpackage.bzc) odwVar.f.a).m(odwVar);
        odwVar.f = this.b;
        ((defpackage.bzc) odwVar.f.a).n(odwVar);
        odwVar.b = this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.odt)) {
            return false;
        }
        defpackage.odt odtVar = (defpackage.odt) obj;
        return defpackage.afga.f(this.b, odtVar.b) && defpackage.afga.f(this.a, odtVar.a);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "TooltipAnchorElement(tooltipRequester=" + this.b + ", interactionSource=" + this.a + ")";
    }
}
