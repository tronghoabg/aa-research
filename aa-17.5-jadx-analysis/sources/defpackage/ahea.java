package defpackage;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class ahea implements ahff {
    final /* synthetic */ ahnj $name;
    private final ArrayList<ahuh<?>> elements = new ArrayList<>();
    final /* synthetic */ ahed this$0;
    final /* synthetic */ aheb this$1;

    public ahea(ahed ahedVar, ahnj ahnjVar, aheb ahebVar) {
        this.this$0 = ahedVar;
        this.$name = ahnjVar;
        this.this$1 = ahebVar;
    }

    @Override // defpackage.ahff
    public void visit(Object obj) {
        this.elements.add(this.this$0.createConstant(this.$name, obj));
    }

    @Override // defpackage.ahff
    public ahfe visitAnnotation(ahnd ahndVar) {
        ahndVar.getClass();
        ArrayList arrayList = new ArrayList();
        agdx agdxVar = agdx.NO_SOURCE;
        agdxVar.getClass();
        return new ahdz(this.this$0.loadAnnotation(ahndVar, agdxVar, arrayList), this, arrayList);
    }

    @Override // defpackage.ahff
    public void visitClassLiteral(ahug ahugVar) {
        ahugVar.getClass();
        this.elements.add(new ahvc(ahugVar));
    }

    @Override // defpackage.ahff
    public void visitEnd() {
        this.this$1.visitArrayValue(this.$name, this.elements);
    }

    @Override // defpackage.ahff
    public void visitEnum(ahnd ahndVar, ahnj ahnjVar) {
        ahndVar.getClass();
        ahnjVar.getClass();
        this.elements.add(new ahul(ahndVar, ahnjVar));
    }
}
