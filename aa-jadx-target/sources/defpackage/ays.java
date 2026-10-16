package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ays extends defpackage.cyc<defpackage.ayt> {
    private final defpackage.afd a;
    private final defpackage.afd b;
    private final defpackage.afd c;

    public ays(defpackage.afd afdVar, defpackage.afd afdVar2, defpackage.afd afdVar3) {
        this.a = afdVar;
        this.b = afdVar2;
        this.c = afdVar3;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.ayt(this.a, this.b, this.c);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        defpackage.ayt aytVar = (defpackage.ayt) cgeVar;
        aytVar.a = this.a;
        aytVar.b = this.b;
        aytVar.c = this.c;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ays)) {
            return false;
        }
        defpackage.ays aysVar = (defpackage.ays) obj;
        return defpackage.afga.f(this.a, aysVar.a) && defpackage.afga.f(this.b, aysVar.b) && defpackage.afga.f(this.c, aysVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final java.lang.String toString() {
        return "LazyLayoutAnimateItemElement(fadeInSpec=" + this.a + ", placementSpec=" + this.b + ", fadeOutSpec=" + this.c + ")";
    }
}
