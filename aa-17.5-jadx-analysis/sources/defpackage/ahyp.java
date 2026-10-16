package defpackage;

/* loaded from: classes3.dex */
final class ahyp {
    private final ahym classData;
    private final ahnd classId;

    public ahyp(ahnd ahndVar, ahym ahymVar) {
        ahndVar.getClass();
        this.classId = ahndVar;
        this.classData = ahymVar;
    }

    public boolean equals(Object obj) {
        return (obj instanceof ahyp) && affa.f(this.classId, ((ahyp) obj).classId);
    }

    public final ahym getClassData() {
        return this.classData;
    }

    public final ahnd getClassId() {
        return this.classId;
    }

    public int hashCode() {
        return this.classId.hashCode();
    }
}
