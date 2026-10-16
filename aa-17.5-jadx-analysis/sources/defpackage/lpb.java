package defpackage;

/* loaded from: classes2.dex */
final class lpb implements loi {
    private final int a;

    public lpb(int i) {
        this.a = i;
    }

    static lpb b(int i) {
        woy.O(i != 2, "NonLoadedMediaBrowseSubscription must have a non-LOADED status");
        return new lpb(i);
    }

    @Override // defpackage.loi
    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof lpb) && this.a == ((lpb) obj).a;
    }

    public final int hashCode() {
        return this.a ^ 1000003;
    }

    public final String toString() {
        return "NonLoadedMediaBrowseSubscription{subscriptionStatus=" + lnm.i(this.a) + "}";
    }

    public lpb() {
        throw null;
    }
}
