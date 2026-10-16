package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public class jek extends java.lang.Exception {
    public final boolean a;

    public jek(byte[] bArr) {
        this.a = false;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.jek)) {
            return false;
        }
        defpackage.jek jekVar = (defpackage.jek) obj;
        return this.a == jekVar.a && j$.util.Objects.equals(getCause(), jekVar.getCause());
    }

    public final int hashCode() {
        return j$.util.Objects.hash(java.lang.Boolean.valueOf(this.a), getCause());
    }

    public jek() {
        throw null;
    }

    public jek(boolean z, java.lang.Exception exc) {
        super(exc);
        this.a = z;
    }
}
