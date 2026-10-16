package defpackage;

/* loaded from: classes3.dex */
final class zwi {
    public final boolean a;

    public zwi(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof zwi) && this.a == ((zwi) obj).a;
    }

    public final int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        return "UpdateTracker{backgroundColorUpdated=" + this.a + "}";
    }

    public zwi() {
        throw null;
    }
}
