package defpackage;

import j$.util.Objects;

/* loaded from: classes2.dex */
public final class dwo extends dsq {
    private final int a;

    public dwo(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof dwo) && this.a == ((dwo) obj).a;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a));
    }

    public final String toString() {
        return "CallControlResult(Error[errorCode=(" + this.a + ")])";
    }
}
