package q5;

/* renamed from: q5.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3866a extends AbstractC3869d {

    /* renamed from: a, reason: collision with root package name */
    public final Object f44120a;

    /* renamed from: b, reason: collision with root package name */
    public final EnumC3870e f44121b;

    /* renamed from: c, reason: collision with root package name */
    public final C3867b f44122c;

    public C3866a(Object obj, EnumC3870e enumC3870e, C3867b c3867b) {
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.f44120a = obj;
        this.f44121b = enumC3870e;
        this.f44122c = c3867b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3869d) {
            AbstractC3869d abstractC3869d = (AbstractC3869d) obj;
            ((C3866a) abstractC3869d).getClass();
            if (this.f44120a.equals(((C3866a) abstractC3869d).f44120a)) {
                C3866a c3866a = (C3866a) abstractC3869d;
                if (this.f44121b.equals(c3866a.f44121b)) {
                    C3867b c3867b = c3866a.f44122c;
                    C3867b c3867b2 = this.f44122c;
                    if (c3867b2 != null ? c3867b2.equals(c3867b) : c3867b == null) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((1000003 * 1000003) ^ this.f44120a.hashCode()) * 1000003) ^ this.f44121b.hashCode()) * 1000003;
        C3867b c3867b = this.f44122c;
        return (iHashCode ^ (c3867b == null ? 0 : c3867b.hashCode())) * 1000003;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f44120a + ", priority=" + this.f44121b + ", productData=" + this.f44122c + ", eventContext=null}";
    }
}
