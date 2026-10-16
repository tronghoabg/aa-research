package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class aga implements defpackage.afd {
    public final float a;
    public final float b;
    public final java.lang.Object c;

    public aga(float f, float f2, java.lang.Object obj) {
        this.a = f;
        this.b = f2;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [affc, java.lang.Object] */
    @Override // defpackage.afd
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final defpackage.ahh c(defpackage.bil bilVar) {
        java.lang.Object obj = this.c;
        return new defpackage.ahh(this.a, this.b, obj == null ? null : (defpackage.aep) bilVar.b.invoke(obj));
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.aga)) {
            return false;
        }
        defpackage.aga agaVar = (defpackage.aga) obj;
        return agaVar.a == this.a && agaVar.b == this.b && defpackage.afga.f(agaVar.c, this.c);
    }

    public final int hashCode() {
        java.lang.Object obj = this.c;
        return ((((obj != null ? obj.hashCode() : 0) * 31) + java.lang.Float.floatToIntBits(this.a)) * 31) + java.lang.Float.floatToIntBits(this.b);
    }

    public aga() {
        this(1.0f, 1500.0f, null);
    }
}
