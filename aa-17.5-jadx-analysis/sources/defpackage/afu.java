package defpackage;

/* loaded from: classes.dex */
final class afu implements aec {
    private final aec a;
    private final long b;

    public afu(aec aecVar, long j) {
        this.a = aecVar;
        this.b = j;
    }

    @Override // defpackage.aec
    /* renamed from: a */
    public final agn c(bii biiVar) {
        return new afv(this.a.c(biiVar), this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof afu)) {
            return false;
        }
        afu afuVar = (afu) obj;
        return afuVar.b == this.b && affa.f(afuVar.a, this.a);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        long j = this.b;
        return iHashCode + ((int) (j ^ (j >>> 32)));
    }
}
