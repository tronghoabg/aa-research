package defpackage;

/* loaded from: classes3.dex */
public final class ahvy extends aioy {
    final /* synthetic */ afec<agax, Boolean> $predicate;
    final /* synthetic */ affv<agax> $result;

    /* JADX WARN: Multi-variable type inference failed */
    public ahvy(affv<agax> affvVar, afec<? super agax, Boolean> afecVar) {
        this.$result = affvVar;
        this.$predicate = afecVar;
    }

    @Override // defpackage.aioy, defpackage.aipa
    public void afterChildren(agax agaxVar) {
        agaxVar.getClass();
        if (this.$result.a == null && this.$predicate.invoke(agaxVar).booleanValue()) {
            this.$result.a = agaxVar;
        }
    }

    @Override // defpackage.aioy, defpackage.aipa
    public boolean beforeChildren(agax agaxVar) {
        agaxVar.getClass();
        return this.$result.a == null;
    }

    @Override // defpackage.aipa
    public agax result() {
        return (agax) this.$result.a;
    }
}
