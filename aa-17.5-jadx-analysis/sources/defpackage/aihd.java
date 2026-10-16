package defpackage;

/* loaded from: classes3.dex */
public final class aihd extends aiio {
    private final aezr _type$delegate;
    private final agee typeParameter;

    public aihd(agee ageeVar) {
        ageeVar.getClass();
        this.typeParameter = ageeVar;
        this._type$delegate = woy.dH(2, new aihc(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final aigl _type_delegate$lambda$0(aihd aihdVar) {
        return aihf.starProjectionType(aihdVar.typeParameter);
    }

    private final aigl get_type() {
        return (aigl) this._type$delegate.a();
    }

    @Override // defpackage.aiin
    public aijg getProjectionKind() {
        return aijg.OUT_VARIANCE;
    }

    @Override // defpackage.aiin
    public aigl getType() {
        return get_type();
    }

    @Override // defpackage.aiin
    public boolean isStarProjection() {
        return true;
    }

    @Override // defpackage.aiin
    public aiin refine(aiju aijuVar) {
        aijuVar.getClass();
        return this;
    }
}
