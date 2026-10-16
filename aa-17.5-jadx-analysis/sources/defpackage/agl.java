package defpackage;

/* loaded from: classes.dex */
public final class agl implements aer {
    public final int a;
    public final int b;
    private final aes c;

    public /* synthetic */ agl(int i, aes aesVar, int i2) {
        this(1 == (i2 & 1) ? 300 : i, 0, (i2 & 4) != 0 ? aev.a : aesVar);
    }

    @Override // defpackage.aec
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ agn c(bii biiVar) {
        return d();
    }

    @Override // defpackage.aer
    public final /* bridge */ /* synthetic */ agq b(bii biiVar) {
        return d();
    }

    @Override // defpackage.aew
    public final /* bridge */ /* synthetic */ agr c(bii biiVar) {
        return d();
    }

    public final ahb d() {
        return new ahb(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof agl)) {
            return false;
        }
        agl aglVar = (agl) obj;
        return aglVar.a == this.a && aglVar.b == this.b && affa.f(aglVar.c, this.c);
    }

    public final int hashCode() {
        return (((this.a * 31) + this.c.hashCode()) * 31) + this.b;
    }

    public agl(int i, int i2, aes aesVar) {
        this.a = i;
        this.b = i2;
        this.c = aesVar;
    }

    public agl() {
        this(0, (aes) null, 7);
    }
}
