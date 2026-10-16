package defpackage;

/* loaded from: classes3.dex */
public interface agbk<R, D> {
    R visitClassDescriptor(agba agbaVar, D d);

    R visitConstructorDescriptor(agbh agbhVar, D d);

    R visitFunctionDescriptor(agcj agcjVar, D d);

    R visitModuleDeclaration(agcu agcuVar, D d);

    R visitPackageFragmentDescriptor(agdc agdcVar, D d);

    R visitPackageViewDescriptor(agdj agdjVar, D d);

    R visitPropertyDescriptor(agdn agdnVar, D d);

    R visitPropertyGetterDescriptor(agdo agdoVar, D d);

    R visitPropertySetterDescriptor(agdp agdpVar, D d);

    R visitReceiverParameterDescriptor(agdq agdqVar, D d);

    R visitTypeAliasDescriptor(aged agedVar, D d);

    R visitTypeParameterDescriptor(agee ageeVar, D d);

    R visitValueParameterDescriptor(agel agelVar, D d);
}
