package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public class ahdk implements ahfg {
    private final ArrayList result;
    private final ahfn signature;
    final /* synthetic */ ahdl this$0;

    public ahdk(ahdl ahdlVar, ahfn ahfnVar) {
        ahfnVar.getClass();
        this.this$0 = ahdlVar;
        this.signature = ahfnVar;
        this.result = new ArrayList();
    }

    protected final ahfn getSignature() {
        return this.signature;
    }

    @Override // defpackage.ahfg
    public ahfe visitAnnotation(ahnd ahndVar, agdx agdxVar) {
        ahndVar.getClass();
        agdxVar.getClass();
        return this.this$0.this$0.loadAnnotationIfNotSpecial(ahndVar, agdxVar, this.result);
    }

    @Override // defpackage.ahfg
    public void visitEnd() {
        if (this.result.isEmpty()) {
            return;
        }
        ahdl ahdlVar = this.this$0;
        ahdlVar.$memberAnnotations.put(this.signature, this.result);
    }
}
