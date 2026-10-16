package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class afjo implements defpackage.aipz {
    private final defpackage.afix a;

    public afjo(defpackage.afix afixVar) {
        this.a = afixVar;
    }

    @Override // defpackage.aipz
    public final java.lang.Iterable getNeighbors(java.lang.Object obj) {
        return (java.lang.Iterable) this.a.invoke((defpackage.afie) obj);
    }
}
