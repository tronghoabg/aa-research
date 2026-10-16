package defpackage;

import java.io.IOException;

/* loaded from: classes3.dex */
final class ahrn implements agbk {
    final /* synthetic */ ahrp this$0;

    public ahrn(ahrp ahrpVar) {
        this.this$0 = ahrpVar;
    }

    private final void visitPropertyAccessorDescriptor(agdm agdmVar, StringBuilder sb, String str) throws IOException {
        ahsd propertyAccessorRenderingPolicy = this.this$0.getPropertyAccessorRenderingPolicy();
        ahsd ahsdVar = ahsd.PRETTY;
        int iOrdinal = propertyAccessorRenderingPolicy.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                visitFunctionDescriptor((agcj) agdmVar, sb);
                return;
            } else {
                if (iOrdinal != 2) {
                    throw new aezs();
                }
                return;
            }
        }
        this.this$0.renderAccessorModifiers(agdmVar, sb);
        sb.append(String.valueOf(str).concat(" for "));
        ahrp ahrpVar = this.this$0;
        agdn correspondingProperty = agdmVar.getCorrespondingProperty();
        correspondingProperty.getClass();
        ahrpVar.renderProperty(correspondingProperty, sb);
    }

    public void visitClassDescriptor(agba agbaVar, StringBuilder sb) throws IOException {
        agbaVar.getClass();
        sb.getClass();
        this.this$0.renderClass(agbaVar, sb);
    }

    public void visitConstructorDescriptor(agbh agbhVar, StringBuilder sb) throws IOException {
        agbhVar.getClass();
        sb.getClass();
        this.this$0.renderConstructor(agbhVar, sb);
    }

    public void visitFunctionDescriptor(agcj agcjVar, StringBuilder sb) throws IOException {
        agcjVar.getClass();
        sb.getClass();
        this.this$0.renderFunction(agcjVar, sb);
    }

    public void visitModuleDeclaration(agcu agcuVar, StringBuilder sb) {
        agcuVar.getClass();
        sb.getClass();
        this.this$0.renderName(agcuVar, sb, true);
    }

    public void visitPackageFragmentDescriptor(agdc agdcVar, StringBuilder sb) {
        agdcVar.getClass();
        sb.getClass();
        this.this$0.renderPackageFragment(agdcVar, sb);
    }

    public void visitPackageViewDescriptor(agdj agdjVar, StringBuilder sb) {
        agdjVar.getClass();
        sb.getClass();
        this.this$0.renderPackageView(agdjVar, sb);
    }

    public void visitPropertyDescriptor(agdn agdnVar, StringBuilder sb) throws IOException {
        agdnVar.getClass();
        sb.getClass();
        this.this$0.renderProperty(agdnVar, sb);
    }

    public void visitPropertyGetterDescriptor(agdo agdoVar, StringBuilder sb) throws IOException {
        agdoVar.getClass();
        sb.getClass();
        visitPropertyAccessorDescriptor(agdoVar, sb, "getter");
    }

    public void visitPropertySetterDescriptor(agdp agdpVar, StringBuilder sb) throws IOException {
        agdpVar.getClass();
        sb.getClass();
        visitPropertyAccessorDescriptor(agdpVar, sb, "setter");
    }

    public void visitReceiverParameterDescriptor(agdq agdqVar, StringBuilder sb) {
        agdqVar.getClass();
        sb.getClass();
        sb.append(agdqVar.getName());
    }

    public void visitTypeAliasDescriptor(aged agedVar, StringBuilder sb) {
        agedVar.getClass();
        sb.getClass();
        this.this$0.renderTypeAlias(agedVar, sb);
    }

    public void visitTypeParameterDescriptor(agee ageeVar, StringBuilder sb) {
        ageeVar.getClass();
        sb.getClass();
        this.this$0.renderTypeParameter(ageeVar, sb, true);
    }

    public void visitValueParameterDescriptor(agel agelVar, StringBuilder sb) {
        agelVar.getClass();
        sb.getClass();
        this.this$0.renderValueParameter(agelVar, true, sb, true);
    }

    @Override // defpackage.agbk
    public /* bridge */ /* synthetic */ Object visitClassDescriptor(agba agbaVar, Object obj) throws IOException {
        visitClassDescriptor(agbaVar, (StringBuilder) obj);
        return afak.a;
    }

    @Override // defpackage.agbk
    public /* bridge */ /* synthetic */ Object visitConstructorDescriptor(agbh agbhVar, Object obj) throws IOException {
        visitConstructorDescriptor(agbhVar, (StringBuilder) obj);
        return afak.a;
    }

    @Override // defpackage.agbk
    public /* bridge */ /* synthetic */ Object visitFunctionDescriptor(agcj agcjVar, Object obj) throws IOException {
        visitFunctionDescriptor(agcjVar, (StringBuilder) obj);
        return afak.a;
    }

    @Override // defpackage.agbk
    public /* bridge */ /* synthetic */ Object visitPackageFragmentDescriptor(agdc agdcVar, Object obj) {
        visitPackageFragmentDescriptor(agdcVar, (StringBuilder) obj);
        return afak.a;
    }

    @Override // defpackage.agbk
    public /* bridge */ /* synthetic */ Object visitPackageViewDescriptor(agdj agdjVar, Object obj) {
        visitPackageViewDescriptor(agdjVar, (StringBuilder) obj);
        return afak.a;
    }

    @Override // defpackage.agbk
    public /* bridge */ /* synthetic */ Object visitPropertyDescriptor(agdn agdnVar, Object obj) throws IOException {
        visitPropertyDescriptor(agdnVar, (StringBuilder) obj);
        return afak.a;
    }

    @Override // defpackage.agbk
    public /* bridge */ /* synthetic */ Object visitPropertyGetterDescriptor(agdo agdoVar, Object obj) throws IOException {
        visitPropertyGetterDescriptor(agdoVar, (StringBuilder) obj);
        return afak.a;
    }

    @Override // defpackage.agbk
    public /* bridge */ /* synthetic */ Object visitPropertySetterDescriptor(agdp agdpVar, Object obj) throws IOException {
        visitPropertySetterDescriptor(agdpVar, (StringBuilder) obj);
        return afak.a;
    }

    @Override // defpackage.agbk
    public /* bridge */ /* synthetic */ Object visitTypeAliasDescriptor(aged agedVar, Object obj) {
        visitTypeAliasDescriptor(agedVar, (StringBuilder) obj);
        return afak.a;
    }

    @Override // defpackage.agbk
    public /* bridge */ /* synthetic */ Object visitModuleDeclaration(agcu agcuVar, Object obj) {
        visitModuleDeclaration(agcuVar, (StringBuilder) obj);
        return afak.a;
    }

    @Override // defpackage.agbk
    public /* bridge */ /* synthetic */ Object visitTypeParameterDescriptor(agee ageeVar, Object obj) {
        visitTypeParameterDescriptor(ageeVar, (StringBuilder) obj);
        return afak.a;
    }

    @Override // defpackage.agbk
    public /* bridge */ /* synthetic */ Object visitValueParameterDescriptor(agel agelVar, Object obj) {
        visitValueParameterDescriptor(agelVar, (StringBuilder) obj);
        return afak.a;
    }

    @Override // defpackage.agbk
    public /* bridge */ /* synthetic */ Object visitReceiverParameterDescriptor(agdq agdqVar, Object obj) {
        visitReceiverParameterDescriptor(agdqVar, (StringBuilder) obj);
        return afak.a;
    }
}
