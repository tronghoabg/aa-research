package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class ahdy implements ahfe {
    private final /* synthetic */ ahfe $$delegate_0;
    final /* synthetic */ ArrayList<agfc> $list;
    final /* synthetic */ ahnj $name;
    final /* synthetic */ ahfe $visitor;
    final /* synthetic */ aheb this$0;

    public ahdy(ahfe ahfeVar, aheb ahebVar, ahnj ahnjVar, ArrayList<agfc> arrayList) {
        this.$visitor = ahfeVar;
        this.this$0 = ahebVar;
        this.$name = ahnjVar;
        this.$list = arrayList;
        this.$$delegate_0 = ahfeVar;
    }

    @Override // defpackage.ahfe
    public void visit(ahnj ahnjVar, Object obj) {
        this.$$delegate_0.visit(ahnjVar, obj);
    }

    @Override // defpackage.ahfe
    public ahfe visitAnnotation(ahnj ahnjVar, ahnd ahndVar) {
        ahndVar.getClass();
        return this.$$delegate_0.visitAnnotation(ahnjVar, ahndVar);
    }

    @Override // defpackage.ahfe
    public ahff visitArray(ahnj ahnjVar) {
        return this.$$delegate_0.visitArray(ahnjVar);
    }

    @Override // defpackage.ahfe
    public void visitClassLiteral(ahnj ahnjVar, ahug ahugVar) {
        ahugVar.getClass();
        this.$$delegate_0.visitClassLiteral(ahnjVar, ahugVar);
    }

    @Override // defpackage.ahfe
    public void visitEnd() {
        this.$visitor.visitEnd();
        this.this$0.visitConstantValue(this.$name, new ahub((agfc) woy.bN(this.$list)));
    }

    @Override // defpackage.ahfe
    public void visitEnum(ahnj ahnjVar, ahnd ahndVar, ahnj ahnjVar2) {
        ahndVar.getClass();
        ahnjVar2.getClass();
        this.$$delegate_0.visitEnum(ahnjVar, ahndVar, ahnjVar2);
    }
}
