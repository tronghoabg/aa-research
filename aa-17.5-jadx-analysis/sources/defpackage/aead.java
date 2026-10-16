package defpackage;

/* loaded from: classes.dex */
public final class aead implements aeaf {
    private final adnz a;

    public aead(adnz adnzVar) {
        adnzVar.getClass();
        this.a = adnzVar;
    }

    @Override // defpackage.aeaf
    public final admr a(admo admoVar, admm admmVar) {
        return admoVar.a(this.a, admmVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aead) {
            return this.a.equals(((aead) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
