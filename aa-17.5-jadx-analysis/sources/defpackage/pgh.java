package defpackage;

import j$.util.Objects;

/* loaded from: classes2.dex */
public final class pgh extends ebj implements pgj {
    private final gjv a;

    public pgh(gjv gjvVar) {
        this.a = gjvVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof pgh) && Objects.equals(this.a, ((pgh) obj).a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        return osq.F(new Object[]{this.a}, pgh.class);
    }
}
