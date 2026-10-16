package defpackage;

/* loaded from: classes3.dex */
public final class aicu extends agik implements aiax {
    private final aibv containerSource;
    private final ahld nameResolver;
    private final ahis proto;
    private final ahlh typeTable;
    private final ahln versionRequirementTable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aicu(agbi agbiVar, agdn agdnVar, agfk agfkVar, agcq agcqVar, agcc agccVar, boolean z, ahnj ahnjVar, agaw agawVar, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, ahis ahisVar, ahld ahldVar, ahlh ahlhVar, ahln ahlnVar, aibv aibvVar) {
        super(agbiVar, agdnVar, agfkVar, agcqVar, agccVar, z, ahnjVar, agawVar, agdx.NO_SOURCE, z2, z3, z6, false, z4, z5);
        agbiVar.getClass();
        agfkVar.getClass();
        agcqVar.getClass();
        agccVar.getClass();
        ahnjVar.getClass();
        agawVar.getClass();
        ahisVar.getClass();
        ahldVar.getClass();
        ahlhVar.getClass();
        ahlnVar.getClass();
        this.proto = ahisVar;
        this.nameResolver = ahldVar;
        this.typeTable = ahlhVar;
        this.versionRequirementTable = ahlnVar;
        this.containerSource = aibvVar;
    }

    @Override // defpackage.agik
    protected agik createSubstitutedCopy(agbi agbiVar, agcq agcqVar, agcc agccVar, agdn agdnVar, agaw agawVar, ahnj ahnjVar, agdx agdxVar) {
        agbiVar.getClass();
        agcqVar.getClass();
        agccVar.getClass();
        agawVar.getClass();
        ahnjVar.getClass();
        agdxVar.getClass();
        return new aicu(agbiVar, agdnVar, getAnnotations(), agcqVar, agccVar, isVar(), ahnjVar, agawVar, isLateInit(), isConst(), isExternal(), isDelegated(), isExpect(), getProto(), getNameResolver(), getTypeTable(), getVersionRequirementTable(), getContainerSource());
    }

    @Override // defpackage.aibw
    public aibv getContainerSource() {
        return this.containerSource;
    }

    @Override // defpackage.aibw
    public ahld getNameResolver() {
        return this.nameResolver;
    }

    @Override // defpackage.aibw
    public ahlh getTypeTable() {
        return this.typeTable;
    }

    public ahln getVersionRequirementTable() {
        return this.versionRequirementTable;
    }

    @Override // defpackage.agik, defpackage.agco
    public boolean isExternal() {
        return ahla.IS_EXTERNAL_PROPERTY.get(getProto().getFlags()).booleanValue();
    }

    @Override // defpackage.aibw
    public ahis getProto() {
        return this.proto;
    }
}
