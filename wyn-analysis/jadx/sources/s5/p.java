package s5;

/* loaded from: classes3.dex */
public final class p extends AbstractC3996B {

    /* renamed from: a, reason: collision with root package name */
    public final s f45028a;

    public p(s sVar) {
        EnumC3995A enumC3995A = EnumC3995A.f44958a;
        this.f45028a = sVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3996B)) {
            return false;
        }
        AbstractC3996B abstractC3996B = (AbstractC3996B) obj;
        if (!this.f45028a.equals(((p) abstractC3996B).f45028a)) {
            return false;
        }
        Object obj2 = EnumC3995A.f44958a;
        ((p) abstractC3996B).getClass();
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return ((this.f45028a.hashCode() ^ 1000003) * 1000003) ^ EnumC3995A.f44958a.hashCode();
    }

    public final String toString() {
        return "ComplianceData{privacyContext=" + this.f45028a + ", productIdOrigin=" + EnumC3995A.f44958a + "}";
    }
}
