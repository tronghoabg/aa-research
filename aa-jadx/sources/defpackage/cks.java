package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class cks extends defpackage.cku {
    public final defpackage.cjj a;

    public cks(defpackage.cjj cjjVar) {
        this.a = cjjVar;
    }

    @Override // defpackage.cku
    public final defpackage.cjj a() {
        return this.a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.cks) && defpackage.afga.f(this.a, ((defpackage.cks) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
