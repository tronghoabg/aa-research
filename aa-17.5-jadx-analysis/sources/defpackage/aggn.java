package defpackage;

import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public final class aggn implements aiid {
    final /* synthetic */ aggo this$0;

    public aggn(aggo aggoVar) {
        this.this$0 = aggoVar;
    }

    @Override // defpackage.aiid
    public afye getBuiltIns() {
        return ahvz.getBuiltIns(getDeclarationDescriptor());
    }

    @Override // defpackage.aiid
    public List<agee> getParameters() {
        return this.this$0.getTypeConstructorTypeParameters();
    }

    @Override // defpackage.aiid
    /* renamed from: getSupertypes */
    public Collection<aigl> mo89getSupertypes() {
        Collection<aigl> collectionMo89getSupertypes = getDeclarationDescriptor().getUnderlyingType().getConstructor().mo89getSupertypes();
        collectionMo89getSupertypes.getClass();
        return collectionMo89getSupertypes;
    }

    @Override // defpackage.aiid
    public boolean isDenotable() {
        return true;
    }

    @Override // defpackage.aiid
    public aiid refine(aiju aijuVar) {
        aijuVar.getClass();
        return this;
    }

    public String toString() {
        return "[typealias " + getDeclarationDescriptor().getName().asString() + ']';
    }

    @Override // defpackage.aiid
    public aged getDeclarationDescriptor() {
        return this.this$0;
    }
}
