package defpackage;

/* loaded from: classes3.dex */
public final class affk implements afer {
    private final Class a;

    public affk(Class cls, String str) {
        cls.getClass();
        str.getClass();
        this.a = cls;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof affk) && affa.f(this.a, ((affk) obj).a);
    }

    @Override // defpackage.afer
    public final Class<?> getJClass() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return String.valueOf(this.a.toString()).concat(" (Kotlin reflection is not available)");
    }
}
