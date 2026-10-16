package e.a;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bk extends br {

    /* renamed from: a, reason: collision with root package name */
    private final bn f46490a;

    public bk(bn bnVar) {
        com.google.d.b.an.C(bnVar, "result");
        this.f46490a = bnVar;
    }

    @Override // e.a.br
    public final bn a(bo boVar) {
        return this.f46490a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bk) {
            return this.f46490a.equals(((bk) obj).f46490a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f46490a.hashCode();
    }

    public final String toString() {
        return "FixedResultPicker(" + this.f46490a.toString() + ")";
    }
}
