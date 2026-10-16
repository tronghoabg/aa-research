package defpackage;

/* loaded from: classes3.dex */
public final class agjj {
    private agjj() {
    }

    public final agjk create(Class<?> cls) {
        cls.getClass();
        ahgk ahgkVar = new ahgk();
        agjg.INSTANCE.loadClassAnnotations(cls, ahgkVar);
        ahgb ahgbVarCreateHeaderWithDefaultMetadataVersion = ahgkVar.createHeaderWithDefaultMetadataVersion();
        afeu afeuVar = null;
        if (ahgbVarCreateHeaderWithDefaultMetadataVersion == null) {
            return null;
        }
        return new agjk(cls, ahgbVarCreateHeaderWithDefaultMetadataVersion, afeuVar);
    }

    public /* synthetic */ agjj(afeu afeuVar) {
        this();
    }
}
