package defpackage;

/* loaded from: classes3.dex */
public final class tll {
    public final String a;

    public tll(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tll) && affa.f(this.a, ((tll) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RemoteAppKey(applicationId=" + this.a + ")";
    }
}
