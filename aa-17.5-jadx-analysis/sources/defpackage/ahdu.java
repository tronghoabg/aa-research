package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class ahdu implements ahfg {
    final /* synthetic */ ArrayList $result;
    final /* synthetic */ ahdv this$0;

    public ahdu(ahdv ahdvVar, ArrayList arrayList) {
        this.this$0 = ahdvVar;
        this.$result = arrayList;
    }

    @Override // defpackage.ahfg
    public ahfe visitAnnotation(ahnd ahndVar, agdx agdxVar) {
        ahndVar.getClass();
        agdxVar.getClass();
        return this.this$0.loadAnnotationIfNotSpecial(ahndVar, agdxVar, this.$result);
    }

    @Override // defpackage.ahfg
    public void visitEnd() {
    }
}
