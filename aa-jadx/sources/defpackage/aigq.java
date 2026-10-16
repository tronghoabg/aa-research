package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class aigq extends defpackage.aihw {
    @Override // defpackage.aihl
    public java.util.List<defpackage.aijn> getArguments() {
        return getDelegate().getArguments();
    }

    @Override // defpackage.aihl
    public defpackage.aiir getAttributes() {
        return getDelegate().getAttributes();
    }

    @Override // defpackage.aihl
    public defpackage.aijd getConstructor() {
        return getDelegate().getConstructor();
    }

    protected abstract defpackage.aihw getDelegate();

    @Override // defpackage.aihl
    public defpackage.ahye getMemberScope() {
        return getDelegate().getMemberScope();
    }

    @Override // defpackage.aihl
    public boolean isMarkedNullable() {
        return getDelegate().isMarkedNullable();
    }

    @Override // defpackage.aikf, defpackage.aihl
    public defpackage.aihw refine(defpackage.aiku aikuVar) {
        aikuVar.getClass();
        defpackage.aihl aihlVarRefineType = aikuVar.refineType((defpackage.aimw) getDelegate());
        aihlVarRefineType.getClass();
        return replaceDelegate((defpackage.aihw) aihlVarRefineType);
    }

    public abstract defpackage.aigq replaceDelegate(defpackage.aihw aihwVar);
}
