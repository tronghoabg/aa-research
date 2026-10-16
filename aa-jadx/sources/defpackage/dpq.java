package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class dpq extends defpackage.dpo {
    private static final java.util.ArrayList f;

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        f = arrayList;
        arrayList.add("ConstraintSets");
        arrayList.add("Variables");
        arrayList.add("Generate");
        arrayList.add("Transitions");
        arrayList.add("KeyFrames");
        arrayList.add("KeyAttributes");
        arrayList.add("KeyPositions");
        arrayList.add("KeyCycles");
    }

    public final defpackage.dpp C() {
        if (this.a.size() > 0) {
            return (defpackage.dpp) this.a.get(0);
        }
        return null;
    }

    public final void D(defpackage.dpp dppVar) {
        if (this.a.size() > 0) {
            this.a.set(0, dppVar);
        } else {
            this.a.add(dppVar);
        }
    }

    @Override // defpackage.dpo, defpackage.dpp
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.dpq) || j$.util.Objects.equals(x(), ((defpackage.dpq) obj).x())) {
            return super.equals(obj);
        }
        return false;
    }
}
