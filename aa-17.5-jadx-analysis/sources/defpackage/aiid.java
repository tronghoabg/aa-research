package defpackage;

import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public interface aiid extends aimd {
    afye getBuiltIns();

    agbd getDeclarationDescriptor();

    List<agee> getParameters();

    /* renamed from: getSupertypes */
    Collection<aigl> mo89getSupertypes();

    boolean isDenotable();

    aiid refine(aiju aijuVar);
}
