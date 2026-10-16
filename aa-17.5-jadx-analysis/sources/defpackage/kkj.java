package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class kkj implements kka {
    private final List a;

    public kkj(List list) {
        this.a = list;
    }

    @Override // defpackage.kka
    public final List a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kkj) && affa.f(this.a, ((kkj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CarStringPropertyConfig(configArray=" + this.a + ")";
    }
}
