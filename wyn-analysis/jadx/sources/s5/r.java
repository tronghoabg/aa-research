package s5;

/* loaded from: classes3.dex */
public final class r extends AbstractC3998D {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f45031a;

    public r(Integer num) {
        this.f45031a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3998D)) {
            return false;
        }
        Integer num = this.f45031a;
        r rVar = (r) ((AbstractC3998D) obj);
        return num == null ? rVar.f45031a == null : num.equals(rVar.f45031a);
    }

    public final int hashCode() {
        Integer num = this.f45031a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ExternalPRequestContext{originAssociatedProductId=" + this.f45031a + "}";
    }
}
