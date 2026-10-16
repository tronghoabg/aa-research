package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class kjs implements kka {
    private final List a;

    public kjs(List list) {
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
        return (obj instanceof kjs) && affa.f(this.a, ((kjs) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CarFloatArrayPropertyConfig(configArray=" + this.a + ")";
    }
}
