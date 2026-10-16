package defpackage;

import java.util.List;

@afdo
/* loaded from: classes2.dex */
public final class nor implements npk {
    private final List a;

    @Override // defpackage.npk
    public final float a() {
        return ((Number) this.a.get(1)).floatValue() / 10.0f;
    }

    @Override // defpackage.npk
    public final float b() {
        return ((Number) this.a.get(0)).floatValue() / 10.0f;
    }

    @Override // defpackage.npk
    public final float c() {
        return ((Number) this.a.get(2)).floatValue() / 10.0f;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof nor) && affa.f(this.a, ((nor) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CelsiusConfigAccessor(config=" + this.a + ")";
    }
}
