package defpackage;

/* loaded from: classes2.dex */
public final class ehz {
    public final String a;

    public ehz(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ehz) {
            return affa.f(this.a, ((ehz) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
