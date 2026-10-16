package defpackage;

@afdo
/* loaded from: classes2.dex */
public final class cqh {
    public final long a;

    public /* synthetic */ cqh(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof cqh) && this.a == ((cqh) obj).a;
    }

    public final int hashCode() {
        return a.g(this.a);
    }

    public final String toString() {
        return "IndirectPointerEventData(packedValue=" + this.a + ")";
    }
}
