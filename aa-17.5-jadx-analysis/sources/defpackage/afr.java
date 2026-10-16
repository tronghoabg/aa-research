package defpackage;

/* loaded from: classes.dex */
public final class afr implements aer {
    public final int a;

    public afr(int i) {
        this.a = i;
    }

    @Override // defpackage.aew
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final agq c(bii biiVar) {
        return new agz(this.a);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof afr) && ((afr) obj).a == this.a;
    }

    public final int hashCode() {
        return this.a;
    }

    public afr() {
        this(0);
    }
}
