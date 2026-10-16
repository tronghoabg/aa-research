package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class akbb extends defpackage.akaw implements defpackage.ajqh {
    private final java.lang.String a;
    private final java.lang.String b;
    private defpackage.akbh c;

    public akbb(java.lang.String str, defpackage.ajqt ajqtVar) {
        defpackage.akbh akbhVar = new defpackage.akbh("CONNECT", str, ajqtVar);
        this.c = akbhVar;
        this.a = akbhVar.b;
        this.b = akbhVar.c;
    }

    @Override // defpackage.ajqg
    public final defpackage.ajqt d() {
        return p().a;
    }

    @Override // defpackage.ajqh
    public final defpackage.akbh p() {
        defpackage.akbh akbhVar = this.c;
        if (akbhVar != null) {
            return akbhVar;
        }
        defpackage.akbh akbhVar2 = new defpackage.akbh(this.a, this.b, defpackage.ajqm.c);
        this.c = akbhVar2;
        return akbhVar2;
    }

    public final java.lang.String toString() {
        return this.a + " " + this.b + " " + java.lang.String.valueOf(this.d);
    }
}
