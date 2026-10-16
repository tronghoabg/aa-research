package defpackage;

/* loaded from: classes3.dex */
public final class ahyj extends ahye implements ahyi {
    private final ahyk deserializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahyj(agcu agcuVar, agdb agdbVar, ahyd ahydVar) {
        super(ahydVar);
        agcuVar.getClass();
        agdbVar.getClass();
        ahydVar.getClass();
        this.deserializer = new ahyk(agcuVar, agdbVar);
    }

    @Override // defpackage.ahyl
    public agfc loadAnnotation(ahgx ahgxVar, ahld ahldVar) {
        ahgxVar.getClass();
        ahldVar.getClass();
        return this.deserializer.deserializeAnnotation(ahgxVar, ahldVar);
    }

    @Override // defpackage.ahyi
    public ahuh<?> loadAnnotationDefaultValue(aiad aiadVar, ahis ahisVar, aigl aiglVar) {
        aiadVar.getClass();
        ahisVar.getClass();
        aiglVar.getClass();
        return null;
    }

    @Override // defpackage.ahyi
    public ahuh<?> loadPropertyConstant(aiad aiadVar, ahis ahisVar, aigl aiglVar) {
        aiadVar.getClass();
        ahisVar.getClass();
        aiglVar.getClass();
        ahgu ahguVar = (ahgu) ahlf.getExtensionOrNull(ahisVar, getProtocol().getCompileTimeValue());
        if (ahguVar == null) {
            return null;
        }
        return this.deserializer.resolveValue(aiglVar, ahguVar, aiadVar.getNameResolver());
    }

    @Override // defpackage.ahyi
    public /* bridge */ /* synthetic */ Object loadAnnotationDefaultValue(aiad aiadVar, ahis ahisVar, aigl aiglVar) {
        loadAnnotationDefaultValue(aiadVar, ahisVar, aiglVar);
        return null;
    }
}
