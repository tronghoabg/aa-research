package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aiid extends defpackage.aijo {
    private final defpackage.afar _type$delegate;
    private final defpackage.agfe typeParameter;

    public aiid(defpackage.agfe agfeVar) {
        agfeVar.getClass();
        this.typeParameter = agfeVar;
        this._type$delegate = defpackage.afga.cB(2, new defpackage.aiic(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.aihl _type_delegate$lambda$0(defpackage.aiid aiidVar) {
        return defpackage.aiif.starProjectionType(aiidVar.typeParameter);
    }

    private final defpackage.aihl get_type() {
        return (defpackage.aihl) this._type$delegate.a();
    }

    @Override // defpackage.aijn
    public defpackage.aikg getProjectionKind() {
        return defpackage.aikg.OUT_VARIANCE;
    }

    @Override // defpackage.aijn
    public defpackage.aihl getType() {
        return get_type();
    }

    @Override // defpackage.aijn
    public boolean isStarProjection() {
        return true;
    }

    @Override // defpackage.aijn
    public defpackage.aijn refine(defpackage.aiku aikuVar) {
        aikuVar.getClass();
        return this;
    }
}
