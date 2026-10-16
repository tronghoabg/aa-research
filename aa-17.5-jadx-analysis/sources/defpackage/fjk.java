package defpackage;

/* loaded from: classes2.dex */
public final class fjk extends dsu {
    public final fjc a = fjc.a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((fjk) obj).a);
    }

    public final int hashCode() {
        return 3143865 + this.a.hashCode();
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.a + '}';
    }
}
