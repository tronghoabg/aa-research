package defpackage;

/* loaded from: classes3.dex */
public final class afxn implements ahfg {
    final /* synthetic */ affq $result;

    public afxn(affq affqVar) {
        this.$result = affqVar;
    }

    @Override // defpackage.ahfg
    public ahfe visitAnnotation(ahnd ahndVar, agdx agdxVar) {
        ahndVar.getClass();
        agdxVar.getClass();
        if (!affa.f(ahndVar, agth.INSTANCE.getREPEATABLE_ANNOTATION_CONTAINER_META_ANNOTATION())) {
            return null;
        }
        this.$result.a = true;
        return null;
    }

    @Override // defpackage.ahfg
    public void visitEnd() {
    }
}
