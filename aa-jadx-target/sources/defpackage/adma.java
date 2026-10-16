package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class adma extends defpackage.admh {
    private final defpackage.admd a;

    public adma(defpackage.admd admdVar) {
        admdVar.getClass();
        this.a = admdVar;
    }

    @Override // defpackage.admh
    public final defpackage.admd a(defpackage.adme admeVar) {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof defpackage.adma) {
            return this.a.equals(((defpackage.adma) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "FixedResultPicker(" + this.a.toString() + ")";
    }
}
