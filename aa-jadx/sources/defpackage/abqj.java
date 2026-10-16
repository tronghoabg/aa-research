package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class abqj extends defpackage.abnp {
    final defpackage.abqk a;
    defpackage.abnr b = b();
    final /* synthetic */ defpackage.abqm c;

    public abqj(defpackage.abqm abqmVar) {
        this.c = abqmVar;
        this.a = new defpackage.abqk(abqmVar);
    }

    private final defpackage.abnr b() {
        defpackage.abqk abqkVar = this.a;
        if (abqkVar.hasNext()) {
            return abqkVar.next().iterator();
        }
        return null;
    }

    @Override // defpackage.abnr
    public final byte a() {
        defpackage.abnr abnrVar = this.b;
        if (abnrVar == null) {
            throw new java.util.NoSuchElementException();
        }
        byte bA = abnrVar.a();
        if (!this.b.hasNext()) {
            this.b = b();
        }
        return bA;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }
}
