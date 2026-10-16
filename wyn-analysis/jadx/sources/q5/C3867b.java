package q5;

/* renamed from: q5.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3867b {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f44123a;

    public C3867b(Integer num) {
        this.f44123a = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3867b)) {
            return false;
        }
        C3867b c3867b = (C3867b) obj;
        Integer num = this.f44123a;
        return num == null ? c3867b.f44123a == null : num.equals(c3867b.f44123a);
    }

    public final int hashCode() {
        Integer num = this.f44123a;
        return (num == null ? 0 : num.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return "ProductData{productId=" + this.f44123a + "}";
    }
}
