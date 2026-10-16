package defpackage;

/* loaded from: classes3.dex */
public final class aedo implements adnh {
    public final acjs a;

    public aedo(acjs acjsVar) {
        this.a = acjsVar;
    }

    @Override // defpackage.adnh
    public final adqs a(adng adngVar, admc admcVar) {
        woy.O(adngVar.a().a.a(), "asyncUnaryRequestCall is only for clientSendsOneMessage methods");
        aedm aedmVar = new aedm(adngVar);
        adngVar.f();
        return new aedn(this, aedmVar, adngVar);
    }
}
