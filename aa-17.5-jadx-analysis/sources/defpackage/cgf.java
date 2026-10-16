package defpackage;

@afdo
/* loaded from: classes.dex */
public final class cgf {
    public final int a;

    public final boolean equals(Object obj) {
        return (obj instanceof cgf) && this.a == ((cgf) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "AndroidContentDataType(androidAutofillType=" + this.a + ")";
    }
}
