package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class kjw implements kka {
    private final List a;

    public kjw(List list) {
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
        return (obj instanceof kjw) && affa.f(this.a, ((kjw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CarLongArrayPropertyConfig(configArray=" + this.a + ")";
    }
}
