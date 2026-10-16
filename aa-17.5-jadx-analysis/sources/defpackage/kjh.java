package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class kjh implements kka {
    private final List a;

    public kjh(List list) {
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
        return (obj instanceof kjh) && affa.f(this.a, ((kjh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CarBooleanPropertyConfig(configArray=" + this.a + ")";
    }
}
