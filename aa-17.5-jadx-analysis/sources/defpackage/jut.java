package defpackage;

/* loaded from: classes2.dex */
public final class jut extends gwc {
    public final geu a;
    public String b;
    private final aiyk d = new hcg(new jxz(this.n, 6), this, 5);
    public final ajab c = ajac.a("");

    public jut(geu geuVar) {
        this.a = geuVar;
    }

    @Override // defpackage.gwc
    public final aiyk a() {
        return this.d;
    }

    @Override // defpackage.gwc
    public final Object b() {
        return new jus((String) this.c.b());
    }

    @Override // defpackage.gwc
    public final void c(Object obj) {
        if (obj instanceof jus) {
            this.b = ((jus) obj).a;
        }
    }
}
