package k8;

/* renamed from: k8.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3192a extends AbstractC3201j {

    /* renamed from: a, reason: collision with root package name */
    public static final C3192a f39293a = new C3192a();

    @Override // k8.AbstractC3201j
    public final Object a() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // k8.AbstractC3201j
    public final boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
