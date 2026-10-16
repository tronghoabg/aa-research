package s5;

/* loaded from: classes3.dex */
public final class s extends AbstractC3999E {

    /* renamed from: a, reason: collision with root package name */
    public final r f45032a;

    public s(r rVar) {
        this.f45032a = rVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3999E) {
            return this.f45032a.equals(((s) ((AbstractC3999E) obj)).f45032a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f45032a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f45032a + "}";
    }
}
