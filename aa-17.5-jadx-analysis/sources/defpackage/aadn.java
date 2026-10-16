package defpackage;

/* loaded from: classes3.dex */
final class aadn extends vea {
    private final aado a;
    private final aael b;

    public aadn(aado aadoVar, veb vebVar) {
        this.a = aadoVar;
        this.b = new aael(vebVar);
    }

    @Override // defpackage.veb
    public final void a() {
        this.a.d = true;
        try {
            this.b.a();
        } finally {
            this.a.d = false;
        }
    }

    @Override // defpackage.veb
    public final void b() {
        this.b.b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aadn)) {
            return false;
        }
        aadn aadnVar = (aadn) obj;
        return this.a == aadnVar.a && a.C(this.b, aadnVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
