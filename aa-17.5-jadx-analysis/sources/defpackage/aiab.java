package defpackage;

/* loaded from: classes3.dex */
public final class aiab extends aiad {
    private final ahnd classId;
    private final ahhc classProto;
    private final boolean isData;
    private final boolean isInner;
    private final ahhb kind;
    private final aiab outerClass;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiab(ahhc ahhcVar, ahld ahldVar, ahlh ahlhVar, agdx agdxVar, aiab aiabVar) {
        super(ahldVar, ahlhVar, agdxVar, null);
        ahhcVar.getClass();
        ahldVar.getClass();
        ahlhVar.getClass();
        this.classProto = ahhcVar;
        this.outerClass = aiabVar;
        this.classId = ahzz.getClassId(ahldVar, ahhcVar.getFqName());
        ahhb ahhbVar = ahla.CLASS_KIND.get(ahhcVar.getFlags());
        this.kind = ahhbVar == null ? ahhb.CLASS : ahhbVar;
        this.isInner = ahla.IS_INNER.get(ahhcVar.getFlags()).booleanValue();
        this.isData = ahla.IS_DATA.get(ahhcVar.getFlags()).booleanValue();
    }

    @Override // defpackage.aiad
    public ahnf debugFqName() {
        return this.classId.asSingleFqName();
    }

    public final ahnd getClassId() {
        return this.classId;
    }

    public final ahhc getClassProto() {
        return this.classProto;
    }

    public final ahhb getKind() {
        return this.kind;
    }

    public final aiab getOuterClass() {
        return this.outerClass;
    }

    public final boolean isInner() {
        return this.isInner;
    }
}
