package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class abqk implements java.util.Iterator {
    private final java.util.ArrayDeque a;
    private defpackage.abns b;

    public abqk(defpackage.abnv abnvVar) {
        if (!(abnvVar instanceof defpackage.abqm)) {
            this.a = null;
            this.b = (defpackage.abns) abnvVar;
            return;
        }
        defpackage.abqm abqmVar = (defpackage.abqm) abnvVar;
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque(abqmVar.f);
        this.a = arrayDeque;
        arrayDeque.push(abqmVar);
        this.b = b(abqmVar.c);
    }

    private final defpackage.abns b(defpackage.abnv abnvVar) {
        while (abnvVar instanceof defpackage.abqm) {
            defpackage.abqm abqmVar = (defpackage.abqm) abnvVar;
            this.a.push(abqmVar);
            int[] iArr = defpackage.abqm.a;
            abnvVar = abqmVar.c;
        }
        return (defpackage.abns) abnvVar;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final defpackage.abns next() {
        defpackage.abns abnsVarB;
        defpackage.abns abnsVar = this.b;
        if (abnsVar == null) {
            throw new java.util.NoSuchElementException();
        }
        do {
            java.util.ArrayDeque arrayDeque = this.a;
            abnsVarB = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            defpackage.abqm abqmVar = (defpackage.abqm) arrayDeque.pop();
            int[] iArr = defpackage.abqm.a;
            abnsVarB = b(abqmVar.e);
        } while (abnsVarB.B());
        this.b = abnsVarB;
        return abnsVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
