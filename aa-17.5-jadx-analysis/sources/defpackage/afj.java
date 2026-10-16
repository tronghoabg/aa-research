package defpackage;

/* loaded from: classes.dex */
public final class afj extends afi {
    public final int c;

    public afj(Object obj, aes aesVar) {
        super(obj, aesVar);
        this.c = 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof afj)) {
            return false;
        }
        afj afjVar = (afj) obj;
        if (!affa.f(afjVar.a, this.a) || !affa.f(afjVar.b, this.b)) {
            return false;
        }
        int i = afjVar.c;
        return true;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 961) + this.b.hashCode();
    }
}
