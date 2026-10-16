package defpackage;

/* loaded from: classes3.dex */
public final class ahfl implements aibv {
    private final aibu abiStability;
    private final ahfj binaryClass;
    private final ahzk<ahlc> incompatibility;
    private final aidc preReleaseInfo;

    public ahfl(ahfj ahfjVar, ahzk<ahlc> ahzkVar, aidc aidcVar, aibu aibuVar) {
        ahfjVar.getClass();
        aidcVar.getClass();
        aibuVar.getClass();
        this.binaryClass = ahfjVar;
        this.incompatibility = ahzkVar;
        this.preReleaseInfo = aidcVar;
        this.abiStability = aibuVar;
    }

    public final ahfj getBinaryClass() {
        return this.binaryClass;
    }

    @Override // defpackage.agdx
    public agdz getContainingFile() {
        agdz agdzVar = agdz.NO_SOURCE_FILE;
        agdzVar.getClass();
        return agdzVar;
    }

    @Override // defpackage.aibv
    public String getPresentableString() {
        return "Class '" + this.binaryClass.getClassId().asSingleFqName().asString() + '\'';
    }

    public String toString() {
        return getClass().getSimpleName() + ": " + this.binaryClass;
    }
}
