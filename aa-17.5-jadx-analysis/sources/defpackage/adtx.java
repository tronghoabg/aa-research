package defpackage;

/* loaded from: classes.dex */
class adtx extends adlm {
    public final adlm a;

    public adtx(adlm adlmVar) {
        this.a = adlmVar;
    }

    @Override // defpackage.adix
    public final String a() {
        return this.a.a();
    }

    @Override // defpackage.adlm
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.adlm
    public void c() {
        throw null;
    }

    @Override // defpackage.adix
    public final adqq d(admf admfVar, adiw adiwVar) {
        return this.a.d(admfVar, adiwVar);
    }

    public final String toString() {
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.b("delegate", this.a);
        return xxgVarAo.toString();
    }
}
