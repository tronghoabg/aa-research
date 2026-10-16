package defpackage;

/* loaded from: classes3.dex */
final class ahoo implements ahoh<ahoo> {
    final ahos<?> enumTypeMap;
    final boolean isPacked;
    final boolean isRepeated;
    final int number;
    final ahqi type;

    public ahoo(ahos<?> ahosVar, int i, ahqi ahqiVar, boolean z, boolean z2) {
        this.enumTypeMap = ahosVar;
        this.number = i;
        this.type = ahqiVar;
        this.isRepeated = z;
        this.isPacked = z2;
    }

    public ahos<?> getEnumType() {
        return this.enumTypeMap;
    }

    @Override // defpackage.ahoh
    public ahqj getLiteJavaType() {
        return this.type.getJavaType();
    }

    @Override // defpackage.ahoh
    public ahqi getLiteType() {
        return this.type;
    }

    @Override // defpackage.ahoh
    public int getNumber() {
        return this.number;
    }

    @Override // defpackage.ahoh
    public ahpf internalMergeFrom(ahpf ahpfVar, ahpg ahpgVar) {
        return ((ahok) ahpfVar).mergeFrom((ahoq) ahpgVar);
    }

    @Override // defpackage.ahoh
    public boolean isPacked() {
        return this.isPacked;
    }

    @Override // defpackage.ahoh
    public boolean isRepeated() {
        return this.isRepeated;
    }

    @Override // java.lang.Comparable
    public int compareTo(ahoo ahooVar) {
        return this.number - ahooVar.number;
    }
}
