package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahyw extends defpackage.ahyu implements defpackage.ahyz {
    private final defpackage.ahoj customLabelName;
    private final defpackage.agbv declarationDescriptor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahyw(defpackage.agbv agbvVar, defpackage.aihl aihlVar, defpackage.ahoj ahojVar, defpackage.ahza ahzaVar) {
        super(aihlVar, ahzaVar);
        agbvVar.getClass();
        aihlVar.getClass();
        this.declarationDescriptor = agbvVar;
        this.customLabelName = ahojVar;
    }

    @Override // defpackage.ahyz
    public defpackage.ahoj getCustomLabelName() {
        return this.customLabelName;
    }

    public defpackage.agbv getDeclarationDescriptor() {
        return this.declarationDescriptor;
    }

    public java.lang.String toString() {
        return "Cxt { " + getDeclarationDescriptor() + " }";
    }
}
