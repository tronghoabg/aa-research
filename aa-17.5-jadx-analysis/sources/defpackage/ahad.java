package defpackage;

/* loaded from: classes3.dex */
final class ahad implements afec {
    private final ahaj arg$0;
    private final ahai arg$1;

    public ahad(ahaj ahajVar, ahai ahaiVar) {
        this.arg$0 = ahajVar;
        this.arg$1 = ahaiVar;
    }

    @Override // defpackage.afec
    public Object invoke(Object obj) {
        return Boolean.valueOf(ahaj.extractQualifiersFromAnnotations$lambda$3(this.arg$0, this.arg$1, obj));
    }
}
