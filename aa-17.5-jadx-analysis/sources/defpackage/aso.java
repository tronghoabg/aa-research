package defpackage;

/* loaded from: classes.dex */
public final class aso extends asq {
    private final izj a;

    public aso(izj izjVar) {
        this.a = izjVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [afec, java.lang.Object] */
    @Override // defpackage.asq
    public final int a(cuo cuoVar) {
        return ((Number) this.a.a.invoke(cuoVar)).intValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aso) && affa.f(this.a, ((aso) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Block(lineProviderBlock=" + this.a + ")";
    }
}
