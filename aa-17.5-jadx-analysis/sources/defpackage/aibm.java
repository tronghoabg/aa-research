package defpackage;

/* loaded from: classes3.dex */
final class aibm implements afec {
    private final aibp arg$0;
    private final aibt arg$1;

    public aibm(aibp aibpVar, aibt aibtVar) {
        this.arg$0 = aibpVar;
        this.arg$1 = aibtVar;
    }

    @Override // defpackage.afec
    public Object invoke(Object obj) {
        return aibp.enumEntryByName$lambda$0(this.arg$0, this.arg$1, (ahnj) obj);
    }
}
