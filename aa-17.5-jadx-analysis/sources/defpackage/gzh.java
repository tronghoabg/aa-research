package defpackage;

/* loaded from: classes2.dex */
public final class gzh extends gvj {
    public final hjq a;

    public gzh(hjq hjqVar) {
        hjqVar.getClass();
        this.a = hjqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gzh) && affa.f(this.a, ((gzh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TranscriptionUpdate(event=" + this.a + ")";
    }
}
