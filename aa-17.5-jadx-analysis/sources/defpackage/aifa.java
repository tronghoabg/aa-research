package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
final class aifa implements aiid {
    private final aiju kotlinTypeRefiner;
    private final aezr refinedSupertypes$delegate;
    final /* synthetic */ aifc this$0;

    public aifa(aifc aifcVar, aiju aijuVar) {
        aijuVar.getClass();
        this.this$0 = aifcVar;
        this.kotlinTypeRefiner = aijuVar;
        this.refinedSupertypes$delegate = woy.dH(2, new aiez(this, aifcVar));
    }

    private final List<aigl> getRefinedSupertypes() {
        return (List) this.refinedSupertypes$delegate.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List refinedSupertypes_delegate$lambda$0(aifa aifaVar, aifc aifcVar) {
        return aijv.refineTypes(aifaVar.kotlinTypeRefiner, aifcVar.mo89getSupertypes());
    }

    public boolean equals(Object obj) {
        return this.this$0.equals(obj);
    }

    @Override // defpackage.aiid
    public afye getBuiltIns() {
        afye builtIns = this.this$0.getBuiltIns();
        builtIns.getClass();
        return builtIns;
    }

    @Override // defpackage.aiid
    public agbd getDeclarationDescriptor() {
        return this.this$0.getDeclarationDescriptor();
    }

    @Override // defpackage.aiid
    public List<agee> getParameters() {
        List<agee> parameters = this.this$0.getParameters();
        parameters.getClass();
        return parameters;
    }

    public int hashCode() {
        return this.this$0.hashCode();
    }

    @Override // defpackage.aiid
    public boolean isDenotable() {
        return this.this$0.isDenotable();
    }

    @Override // defpackage.aiid
    public aiid refine(aiju aijuVar) {
        aijuVar.getClass();
        return this.this$0.refine(aijuVar);
    }

    public String toString() {
        return this.this$0.toString();
    }

    @Override // defpackage.aiid
    /* renamed from: getSupertypes */
    public List<aigl> mo89getSupertypes() {
        return getRefinedSupertypes();
    }
}
