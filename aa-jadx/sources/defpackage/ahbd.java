package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class ahbd implements defpackage.affc {
    private final defpackage.ahbj arg$0;
    private final defpackage.ahbi arg$1;

    public ahbd(defpackage.ahbj ahbjVar, defpackage.ahbi ahbiVar) {
        this.arg$0 = ahbjVar;
        this.arg$1 = ahbiVar;
    }

    @Override // defpackage.affc
    public java.lang.Object invoke(java.lang.Object obj) {
        return java.lang.Boolean.valueOf(defpackage.ahbj.extractQualifiersFromAnnotations$lambda$3(this.arg$0, this.arg$1, obj));
    }
}
