package defpackage;

/* loaded from: classes3.dex */
public final class ahug {
    private final int arrayNestedness;
    private final ahnd classId;

    public ahug(ahnd ahndVar, int i) {
        ahndVar.getClass();
        this.classId = ahndVar;
        this.arrayNestedness = i;
    }

    public final ahnd component1() {
        return this.classId;
    }

    public final int component2() {
        return this.arrayNestedness;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahug)) {
            return false;
        }
        ahug ahugVar = (ahug) obj;
        return affa.f(this.classId, ahugVar.classId) && this.arrayNestedness == ahugVar.arrayNestedness;
    }

    public final int getArrayNestedness() {
        return this.arrayNestedness;
    }

    public final ahnd getClassId() {
        return this.classId;
    }

    public int hashCode() {
        return (this.classId.hashCode() * 31) + this.arrayNestedness;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
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
