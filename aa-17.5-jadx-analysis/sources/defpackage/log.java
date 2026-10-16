package defpackage;

/* loaded from: classes2.dex */
public final class log implements loi {
    public final yfq a;
    private final int b;

    public log(yfq yfqVar) {
        this.b = 2;
        if (yfqVar == null) {
            throw new NullPointerException("Null items");
        }
        this.a = yfqVar;
    }

    @Override // defpackage.loi
    public final int a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof log) {
            log logVar = (log) obj;
            if (this.b == logVar.b && yrm.W(this.a, logVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ ((this.b ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "LoadedMediaBrowseSubscription{subscriptionStatus=" + lnm.i(this.b) + ", items=" + this.a.toString() + "}";
    }

    public log() {
        throw null;
    }
}
