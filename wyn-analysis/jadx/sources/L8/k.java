package L8;

/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final t f7015a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f7016b;

    public k(t tVar, boolean z2) {
        this.f7015a = tVar;
        this.f7016b = z2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (kVar.f7015a.equals(this.f7015a) && kVar.f7016b == this.f7016b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f7015a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f7016b).hashCode();
    }
}
