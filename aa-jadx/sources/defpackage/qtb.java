package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qtb {
    public final defpackage.qta a;
    public int b;

    public qtb(defpackage.qta qtaVar, int i) {
        this.a = qtaVar;
        this.b = i;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.qtb) && j$.util.Objects.equals(this.a, ((defpackage.qtb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
