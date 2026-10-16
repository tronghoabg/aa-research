package defpackage;

import j$.util.Objects;

/* loaded from: classes2.dex */
public final class pgi extends ebj implements pgj {
    public final gjv a;

    public pgi(gjv gjvVar) {
        this.a = gjvVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof pgi) && Objects.equals(this.a, ((pgi) obj).a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        return osq.F(new Object[]{this.a}, pgi.class);
    }
}
