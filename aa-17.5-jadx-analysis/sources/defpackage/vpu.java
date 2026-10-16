package defpackage;

import j$.util.Objects;

/* loaded from: classes.dex */
public abstract class vpu {
    public abstract Object a();

    public abstract String b();

    public final boolean equals(Object obj) {
        if (obj instanceof vpu) {
            return Objects.equals(a(), ((vpu) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return b();
    }
}
