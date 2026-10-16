package defpackage;

/* loaded from: classes3.dex */
public final class aheo implements ahyn {
    private final ahen deserializedDescriptorResolver;
    private final ahfc kotlinClassFinder;

    public aheo(ahfc ahfcVar, ahen ahenVar) {
        ahfcVar.getClass();
        ahenVar.getClass();
        this.kotlinClassFinder = ahfcVar;
        this.deserializedDescriptorResolver = ahenVar;
    }

    @Override // defpackage.ahyn
    public ahym findClassData(ahnd ahndVar) {
        ahndVar.getClass();
        ahfj ahfjVarFindKotlinClass = ahfd.findKotlinClass(this.kotlinClassFinder, ahndVar, this.deserializedDescriptorResolver.getComponents().getConfiguration().getMetadataVersion());
        if (ahfjVarFindKotlinClass == null) {
            return null;
        }
        affa.f(ahfjVarFindKotlinClass.getClassId(), ahndVar);
        return this.deserializedDescriptorResolver.readClassData$org_jetbrains_kotlin_descriptors_jvm(ahfjVarFindKotlinClass);
    }
}
