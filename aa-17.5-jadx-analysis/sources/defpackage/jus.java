package defpackage;

/* loaded from: classes2.dex */
final class jus {
    public final String a;

    public jus(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jus) && affa.f(this.a, ((jus) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UiState(dialedNumber=" + this.a + ")";
    }
}
