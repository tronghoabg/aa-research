package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class kjv implements kka {
    private final List a;

    public kjv(List list) {
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
        return (obj instanceof kjv) && affa.f(this.a, ((kjv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CarIntegerArrayPropertyConfig(configArray=" + this.a + ")";
    }
}
