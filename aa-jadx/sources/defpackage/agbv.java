package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public interface agbv extends defpackage.agcj, defpackage.agcm, defpackage.agfa {
    java.util.List<defpackage.ageq> getContextReceiverParameters();

    defpackage.ageq getDispatchReceiverParameter();

    defpackage.ageq getExtensionReceiverParameter();

    @Override // defpackage.agci
    defpackage.agbv getOriginal();

    java.util.Collection<? extends defpackage.agbv> getOverriddenDescriptors();

    defpackage.aihl getReturnType();

    java.util.List<defpackage.agfe> getTypeParameters();

    <V> V getUserData(defpackage.agbu<V> agbuVar);

    java.util.List<defpackage.agfl> getValueParameters();

    boolean hasSynthesizedParameterNames();
}
