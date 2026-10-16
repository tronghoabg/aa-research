package defpackage;

import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public interface agav extends agbj, agbm, agea {
    List<agdq> getContextReceiverParameters();

    agdq getDispatchReceiverParameter();

    agdq getExtensionReceiverParameter();

    @Override // defpackage.agbi
    agav getOriginal();

    Collection<? extends agav> getOverriddenDescriptors();

    aigl getReturnType();

    List<agee> getTypeParameters();

    <V> V getUserData(agau<V> agauVar);

    List<agel> getValueParameters();

    boolean hasSynthesizedParameterNames();
}
