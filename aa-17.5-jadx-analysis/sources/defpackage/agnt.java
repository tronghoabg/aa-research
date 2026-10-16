package defpackage;

/* loaded from: classes3.dex */
public final class agnt extends agnu {
    private final int id;

    public agnt(int i) {
        super(null);
        this.id = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof agnt) && this.id == ((agnt) obj).id;
    }

    public final int getId() {
        return this.id;
    }

    public int hashCode() {
        return this.id;
    }

    public String toString() {
        return "TypeParameter(id=" + this.id + ')';
    }
}
