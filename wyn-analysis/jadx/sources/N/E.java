package N;

/* loaded from: classes.dex */
public final class E implements N0 {

    /* renamed from: a, reason: collision with root package name */
    public final Y f7678a;

    public E(Y y10) {
        this.f7678a = y10;
    }

    @Override // N.N0
    public final Object a(InterfaceC0717c0 interfaceC0717c0) {
        return this.f7678a.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof E) && this.f7678a.equals(((E) obj).f7678a);
    }

    public final int hashCode() {
        return this.f7678a.hashCode();
    }

    public final String toString() {
        return "DynamicValueHolder(state=" + this.f7678a + ')';
    }
}
