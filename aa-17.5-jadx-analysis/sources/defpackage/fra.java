package defpackage;

/* loaded from: classes2.dex */
public final class fra implements fqo {
    private final boolean a;

    public fra(byte[] bArr) {
        this.a = true;
    }

    @Override // defpackage.fqo
    public final fqp a(frs frsVar, ftc ftcVar) {
        if (!affa.f(frsVar.b, "image/svg+xml")) {
            ajna ajnaVarA = frsVar.a.a();
            if (!ajnaVarA.H(fqy.b) || ajnaVarA.G(fqy.a) == -1) {
                return null;
            }
        }
        return new frb(frsVar.a, ftcVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fra)) {
            return false;
        }
        boolean z = ((fra) obj).a;
        return true;
    }

    public final int hashCode() {
        return 1231;
    }

    public fra() {
        this(null);
    }
}
