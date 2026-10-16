package defpackage;

import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahtx implements ahtw {
    private aikb newTypeConstructor;
    private final aiin projection;

    public ahtx(aiin aiinVar) {
        aiinVar.getClass();
        this.projection = aiinVar;
        getProjection().getProjectionKind();
        aijg aijgVar = aijg.INVARIANT;
    }

    @Override // defpackage.aiid
    public afye getBuiltIns() {
        afye builtIns = getProjection().getType().getConstructor().getBuiltIns();
        builtIns.getClass();
        return builtIns;
    }

    @Override // defpackage.aiid
    public /* bridge */ /* synthetic */ agbd getDeclarationDescriptor() {
        return null;
    }

    public final aikb getNewTypeConstructor() {
        return this.newTypeConstructor;
    }

    @Override // defpackage.aiid
    public List<agee> getParameters() {
        return afbe.a;
    }

    @Override // defpackage.ahtw
    public aiin getProjection() {
        return this.projection;
    }

    @Override // defpackage.aiid
    /* renamed from: getSupertypes */
    public Collection<aigl> mo89getSupertypes() {
        aigl type = getProjection().getProjectionKind() == aijg.OUT_VARIANCE ? getProjection().getType() : getBuiltIns().getNullableAnyType();
        type.getClass();
        return woy.bg(type);
    }

    @Override // defpackage.aiid
    public boolean isDenotable() {
        return false;
    }

    @Override // defpackage.aiid
    public ahtx refine(aiju aijuVar) {
        aijuVar.getClass();
        aiin aiinVarRefine = getProjection().refine(aijuVar);
        aiinVarRefine.getClass();
        return new ahtx(aiinVarRefine);
    }

    public final void setNewTypeConstructor(aikb aikbVar) {
        this.newTypeConstructor = aikbVar;
    }

    public String toString() {
        return "CapturedTypeConstructor(" + getProjection() + ')';
    }

    /* renamed from: getDeclarationDescriptor, reason: collision with other method in class */
    public Void m88getDeclarationDescriptor() {
        return null;
    }
}
