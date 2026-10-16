package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ajm extends defpackage.cyc<defpackage.ajo> {
    private final defpackage.ask a;
    private final defpackage.akr b;
    private final boolean c;
    private final boolean d;
    private final java.lang.String f;
    private final defpackage.ddw g;
    private final defpackage.afer h;

    public ajm(defpackage.ask askVar, defpackage.akr akrVar, boolean z, boolean z2, java.lang.String str, defpackage.ddw ddwVar, defpackage.afer aferVar) {
        this.a = askVar;
        this.b = akrVar;
        this.c = z;
        this.d = z2;
        this.f = str;
        this.g = ddwVar;
        this.h = aferVar;
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ defpackage.cge d() {
        return new defpackage.ajo(this.a, this.b, this.c, this.d, this.f, this.g, this.h);
    }

    @Override // defpackage.cyc
    public final /* bridge */ /* synthetic */ void e(defpackage.cge cgeVar) {
        ((defpackage.ajo) cgeVar).w(this.a, this.b, this.c, this.d, this.f, this.g, this.h);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        defpackage.ajm ajmVar = (defpackage.ajm) obj;
        return defpackage.afga.f(this.a, ajmVar.a) && defpackage.afga.f(this.b, ajmVar.b) && this.c == ajmVar.c && this.d == ajmVar.d && defpackage.afga.f(this.f, ajmVar.f) && defpackage.afga.f(this.g, ajmVar.g) && this.h == ajmVar.h;
    }

    public final int hashCode() {
        defpackage.ask askVar = this.a;
        int iHashCode = askVar != null ? askVar.hashCode() : 0;
        defpackage.akr akrVar = this.b;
        int iHashCode2 = ((((((iHashCode * 31) + (akrVar != null ? akrVar.hashCode() : 0)) * 31) + (true != this.c ? 1237 : 1231)) * 31) + (true == this.d ? 1231 : 1237)) * 31;
        java.lang.String str = this.f;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        defpackage.ddw ddwVar = this.g;
        return ((iHashCode3 + (ddwVar != null ? ddwVar.a : 0)) * 31) + this.h.hashCode();
    }
}
