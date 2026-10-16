package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahdj extends ahdk implements ahfi {
    final /* synthetic */ ahdl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahdj(ahdl ahdlVar, ahfn ahfnVar) {
        super(ahdlVar, ahfnVar);
        ahfnVar.getClass();
        this.this$0 = ahdlVar;
    }

    @Override // defpackage.ahfi
    public ahfe visitParameterAnnotation(int i, ahnd ahndVar, agdx agdxVar) {
        ahndVar.getClass();
        agdxVar.getClass();
        ahfn ahfnVarFromMethodSignatureAndParameterIndex = ahfn.Companion.fromMethodSignatureAndParameterIndex(getSignature(), i);
        List arrayList = this.this$0.$memberAnnotations.get(ahfnVarFromMethodSignatureAndParameterIndex);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.this$0.$memberAnnotations.put(ahfnVarFromMethodSignatureAndParameterIndex, arrayList);
        }
        return this.this$0.this$0.loadAnnotationIfNotSpecial(ahndVar, agdxVar, arrayList);
    }
}
