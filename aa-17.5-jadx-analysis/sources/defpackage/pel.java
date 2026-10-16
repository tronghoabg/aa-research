package defpackage;

import j$.util.Objects;

/* loaded from: classes2.dex */
public final class pel extends ebj implements peo {
    public final ozz a;

    public pel(ozz ozzVar) {
        this.a = ozzVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof pel) && Objects.equals(this.a, ((pel) obj).a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        return osq.G(new Object[]{this.a}, pel.class);
    }
}
