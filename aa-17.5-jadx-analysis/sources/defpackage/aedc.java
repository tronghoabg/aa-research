package defpackage;

/* loaded from: classes3.dex */
final class aedc extends zeu {
    public final adqq a;

    public aedc(adqq adqqVar) {
        this.a = adqqVar;
    }

    @Override // defpackage.zeu
    protected final String fO() {
        xxg xxgVarAo = woy.ao(this);
        xxgVarAo.b("clientCall", this.a);
        return xxgVarAo.toString();
    }

    @Override // defpackage.zeu
    protected final void l() {
        this.a.i("GrpcFuture was cancelled", null);
    }
}
