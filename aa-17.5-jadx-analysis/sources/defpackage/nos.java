package defpackage;

import java.util.List;

@afdo
/* loaded from: classes2.dex */
public final class nos implements npk {
    private final List a;

    @Override // defpackage.npk
    public final float a() {
        return ((Number) this.a.get(4)).floatValue() / 10.0f;
    }

    @Override // defpackage.npk
    public final float b() {
        return ((Number) this.a.get(3)).floatValue() / 10.0f;
    }

    @Override // defpackage.npk
    public final float c() {
        return ((Number) this.a.get(5)).floatValue() / 10.0f;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof nos) && affa.f(this.a, ((nos) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FahrenheitConfigAccessor(config=" + this.a + ")";
    }
}
