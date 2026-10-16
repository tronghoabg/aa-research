package ae;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final h f17651a;

    public g(h hVar) {
        this.f17651a = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.f17651a == ((g) obj).f17651a;
    }

    public final int hashCode() {
        return this.f17651a.hashCode();
    }

    public final String toString() {
        return "QScreenPresentationConfig(presentationStyle=" + this.f17651a + ")";
    }

    public /* synthetic */ g() {
        this(h.f17652a);
    }
}
