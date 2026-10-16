package defpackage;

/* loaded from: classes2.dex */
public final class fjm extends dsu {
    public final fjc a;

    public fjm(fjc fjcVar) {
        this.a = fjcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((fjm) obj).a);
    }

    public final int hashCode() {
        return 3143927 + this.a.hashCode();
    }

    public final String toString() {
        return "Success {mOutputData=" + this.a + '}';
    }

    public fjm() {
        this(fjc.a);
    }
}
