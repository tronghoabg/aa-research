package defpackage;

/* loaded from: classes3.dex */
public final class aher implements aibv {
    private final aibu abiStability;
    private final ahwd className;
    private final ahwd facadeClassName;
    private final ahzk<ahlc> incompatibility;
    private final ahwd jvmClassName;
    private final ahfj knownJvmBinaryClass;
    private final String moduleName;
    private final aidc preReleaseInfo;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public aher(ahfj ahfjVar, ahim ahimVar, ahld ahldVar, ahzk<ahlc> ahzkVar, boolean z, aibu aibuVar) {
        ahfjVar.getClass();
        ahimVar.getClass();
        ahldVar.getClass();
        aibuVar.getClass();
        ahwd ahwdVarByClassId = ahwd.byClassId(ahfjVar.getClassId());
        String multifileClassName = ahfjVar.getClassHeader().getMultifileClassName();
        this(ahwdVarByClassId, (multifileClassName == null || multifileClassName.length() <= 0) ? null : ahwd.byInternalName(multifileClassName), null, ahimVar, ahldVar, ahzkVar, new aidc(z, null, 2, 0 == true ? 1 : 0), aibuVar, ahfjVar);
    }

    public final ahnd getClassId() {
        ahnf packageFqName = getClassName().getPackageFqName();
        packageFqName.getClass();
        return new ahnd(packageFqName, getSimpleName());
    }

    public ahwd getClassName() {
        return this.className;
    }

    @Override // defpackage.agdx
    public agdz getContainingFile() {
        agdz agdzVar = agdz.NO_SOURCE_FILE;
        agdzVar.getClass();
        return agdzVar;
    }

    public ahwd getFacadeClassName() {
        return this.facadeClassName;
    }

    public final ahfj getKnownJvmBinaryClass() {
        return this.knownJvmBinaryClass;
    }

    @Override // defpackage.aibv
    public String getPresentableString() {
        return "Class '" + getClassId().asSingleFqName().asString() + '\'';
    }

    public final ahnj getSimpleName() {
        String internalName = getClassName().getInternalName();
        internalName.getClass();
        return ahnj.identifier(afyh.p(internalName, '/', internalName));
    }

    public String toString() {
        return getClass().getSimpleName() + ": " + getClassName();
    }

    public aher(ahwd ahwdVar, ahwd ahwdVar2, ahwd ahwdVar3, ahim ahimVar, ahld ahldVar, ahzk<ahlc> ahzkVar, aidc aidcVar, aibu aibuVar, ahfj ahfjVar) {
        String string;
        ahwdVar.getClass();
        ahimVar.getClass();
        ahldVar.getClass();
        aidcVar.getClass();
        aibuVar.getClass();
        this.className = ahwdVar;
        this.facadeClassName = ahwdVar2;
        this.jvmClassName = ahwdVar3;
        this.incompatibility = ahzkVar;
        this.preReleaseInfo = aidcVar;
        this.abiStability = aibuVar;
        this.knownJvmBinaryClass = ahfjVar;
        ahop<ahim, Integer> ahopVar = ahmh.packageModuleName;
        ahopVar.getClass();
        Integer num = (Integer) ahlf.getExtensionOrNull(ahimVar, ahopVar);
        this.moduleName = (num == null || (string = ahldVar.getString(num.intValue())) == null) ? "main" : string;
    }
}
