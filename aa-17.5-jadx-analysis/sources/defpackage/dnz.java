package defpackage;

/* loaded from: classes.dex */
final class dnz extends dnv {
    final /* synthetic */ doa d;

    public dnz(doa doaVar) {
        this.d = doaVar;
    }

    @Override // defpackage.dnv
    protected final String b() {
        dnw dnwVar = (dnw) this.d.a.get();
        if (dnwVar == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + String.valueOf(dnwVar.a) + "]";
    }
}
