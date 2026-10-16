package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahvg {
    private final int arrayNestedness;
    private final defpackage.ahod classId;

    public ahvg(defpackage.ahod ahodVar, int i) {
        ahodVar.getClass();
        this.classId = ahodVar;
        this.arrayNestedness = i;
    }

    public final defpackage.ahod component1() {
        return this.classId;
    }

    public final int component2() {
        return this.arrayNestedness;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ahvg)) {
            return false;
        }
        defpackage.ahvg ahvgVar = (defpackage.ahvg) obj;
        return defpackage.afga.f(this.classId, ahvgVar.classId) && this.arrayNestedness == ahvgVar.arrayNestedness;
    }

    public final int getArrayNestedness() {
        return this.arrayNestedness;
    }

    public final defpackage.ahod getClassId() {
        return this.classId;
    }

    public int hashCode() {
        return (this.classId.hashCode() * 31) + this.arrayNestedness;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i = 0; i < this.arrayNestedness; i++) {
            sb.append("kotlin/Array<");
        }
        sb.append(this.classId);
        int i2 = this.arrayNestedness;
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append(">");
        }
        return sb.toString();
    }
}
