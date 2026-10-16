package defpackage;

/* loaded from: classes3.dex */
final class ahag implements afec {
    private final ahdb arg$0;
    private final ahar[] arg$1;

    public ahag(ahdb ahdbVar, ahar[] aharVarArr) {
        this.arg$0 = ahdbVar;
        this.arg$1 = aharVarArr;
    }

    @Override // defpackage.afec
    public Object invoke(Object obj) {
        return ahaj.computeIndexedQualifiers$lambda$5(this.arg$0, this.arg$1, ((Number) obj).intValue());
    }
}
