package defpackage;

/* loaded from: classes3.dex */
public final class uyu {
    public final boolean a;

    public uyu(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof uyu) && this.a == ((uyu) obj).a;
    }

    public final int hashCode() {
        return ((((((((true != this.a ? 1237 : 1231) ^ 385623362) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003) ^ 1237) * 1000003;
    }

    public final String toString() {
        return "{false, " + this.a + ", false, false, false, null}";
    }

    public uyu() {
        throw null;
    }
}
