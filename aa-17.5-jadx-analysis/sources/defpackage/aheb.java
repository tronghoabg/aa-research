package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
abstract class aheb implements ahfe {
    final /* synthetic */ ahed this$0;

    public aheb(ahed ahedVar) {
        this.this$0 = ahedVar;
    }

    @Override // defpackage.ahfe
    public void visit(ahnj ahnjVar, Object obj) {
        visitConstantValue(ahnjVar, this.this$0.createConstant(ahnjVar, obj));
    }

    @Override // defpackage.ahfe
    public ahfe visitAnnotation(ahnj ahnjVar, ahnd ahndVar) {
        ahndVar.getClass();
        ArrayList arrayList = new ArrayList();
        agdx agdxVar = agdx.NO_SOURCE;
        agdxVar.getClass();
        return new ahdy(this.this$0.loadAnnotation(ahndVar, agdxVar, arrayList), this, ahnjVar, arrayList);
    }

    @Override // defpackage.ahfe
    public ahff visitArray(ahnj ahnjVar) {
        return new ahea(this.this$0, ahnjVar, this);
    }

    public abstract void visitArrayValue(ahnj ahnjVar, ArrayList<ahuh<?>> arrayList);

    @Override // defpackage.ahfe
    public void visitClassLiteral(ahnj ahnjVar, ahug ahugVar) {
        ahugVar.getClass();
        visitConstantValue(ahnjVar, new ahvc(ahugVar));
    }

    public abstract void visitConstantValue(ahnj ahnjVar, ahuh<?> ahuhVar);

    @Override // defpackage.ahfe
    public void visitEnum(ahnj ahnjVar, ahnd ahndVar, ahnj ahnjVar2) {
        ahndVar.getClass();
        ahnjVar2.getClass();
        visitConstantValue(ahnjVar, new ahul(ahndVar, ahnjVar2));
    }
}
