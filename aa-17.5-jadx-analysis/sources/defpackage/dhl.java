package defpackage;

@afdo
/* loaded from: classes.dex */
public final class dhl {
    public final Object a;

    public /* synthetic */ dhl(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof dhl) && affa.f(this.a, ((dhl) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        return "AsyncTypefaceResult(result=" + this.a + ")";
    }
}
