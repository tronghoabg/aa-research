package defpackage;

/* loaded from: classes2.dex */
public final class fqk implements fqo {
    private final ajed a;

    public fqk(byte[] bArr) {
        int i = ajee.a;
        this.a = new ajed(4, 0);
    }

    @Override // defpackage.fqo
    public final fqp a(frs frsVar, ftc ftcVar) {
        return new fqm(frsVar.a, ftcVar, this.a);
    }

    public final boolean equals(Object obj) {
        return obj instanceof fqk;
    }

    public final int hashCode() {
        return getClass().hashCode();
    }

    public fqk() {
        this(null);
    }
}
