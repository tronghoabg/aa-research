package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class kkr implements kka {
    private final List a;

    public /* synthetic */ kkr(byte[] bArr) {
        this.a = afbe.a;
    }

    @Override // defpackage.kka
    public final List a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kkr) && affa.f(this.a, ((kkr) obj).a);
    }

    public final int hashCode() {
        return 1;
    }

    public final String toString() {
        return "UnsupportedCarPropertyConfig(configArray=" + this.a + ")";
    }

    public kkr() {
        this(null);
    }
}
