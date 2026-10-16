package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agot extends defpackage.agou {
    private final int id;

    public agot(int i) {
        super(null);
        this.id = i;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof defpackage.agot) && this.id == ((defpackage.agot) obj).id;
    }

    public final int getId() {
        return this.id;
    }

    public int hashCode() {
        return this.id;
    }

    public java.lang.String toString() {
        return "TypeParameter(id=" + this.id + ')';
    }
}
