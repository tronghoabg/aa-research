package defpackage;

/* loaded from: classes2.dex */
public final class akab extends ajzw implements ajph {
    private final String a;
    private final String b;
    private akah c;

    public akab(String str, ajpt ajptVar) {
        akah akahVar = new akah("CONNECT", str, ajptVar);
        this.c = akahVar;
        this.a = akahVar.b;
        this.b = akahVar.c;
    }

    @Override // defpackage.ajpg
    public final ajpt d() {
        return p().a;
    }

    @Override // defpackage.ajph
    public final akah p() {
        akah akahVar = this.c;
        if (akahVar != null) {
            return akahVar;
        }
        akah akahVar2 = new akah(this.a, this.b, ajpm.c);
        this.c = akahVar2;
        return akahVar2;
    }

    public final String toString() {
        return this.a + " " + this.b + " " + String.valueOf(this.d);
    }
}
