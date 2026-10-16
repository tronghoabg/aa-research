package defpackage;

import j$.util.Objects;

/* loaded from: classes2.dex */
public final class qsh {
    public final qsg a;
    public int b;

    public qsh(qsg qsgVar, int i) {
        this.a = qsgVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof qsh) && Objects.equals(this.a, ((qsh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
