package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class agdz {
    private final defpackage.ahod classId;
    private final java.util.List<java.lang.Integer> typeParametersCount;

    public agdz(defpackage.ahod ahodVar, java.util.List<java.lang.Integer> list) {
        ahodVar.getClass();
        list.getClass();
        this.classId = ahodVar;
        this.typeParametersCount = list;
    }

    public final defpackage.ahod component1() {
        return this.classId;
    }

    public final java.util.List<java.lang.Integer> component2() {
        return this.typeParametersCount;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.agdz)) {
            return false;
        }
        defpackage.agdz agdzVar = (defpackage.agdz) obj;
        return defpackage.afga.f(this.classId, agdzVar.classId) && defpackage.afga.f(this.typeParametersCount, agdzVar.typeParametersCount);
    }

    public int hashCode() {
        return (this.classId.hashCode() * 31) + this.typeParametersCount.hashCode();
    }

    public java.lang.String toString() {
        return "ClassRequest(classId=" + this.classId + ", typeParametersCount=" + this.typeParametersCount + ')';
    }
}
