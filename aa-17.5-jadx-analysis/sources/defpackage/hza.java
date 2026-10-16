package defpackage;

/* loaded from: classes2.dex */
public final class hza {
    public final String a;

    public hza(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hza) {
            return this.a.equals(((hza) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StringHeaderFactory{value='" + this.a + "'}";
    }
}
