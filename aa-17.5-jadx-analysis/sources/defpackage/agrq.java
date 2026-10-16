package defpackage;

/* loaded from: classes3.dex */
final class agrq implements afec {
    private final agru arg$0;
    private final afec arg$1;

    public agrq(agru agruVar, afec afecVar) {
        this.arg$0 = agruVar;
        this.arg$1 = afecVar;
    }

    @Override // defpackage.afec
    public Object invoke(Object obj) {
        return agru.extractNullability$lambda$2(this.arg$0, this.arg$1, obj);
    }
}
