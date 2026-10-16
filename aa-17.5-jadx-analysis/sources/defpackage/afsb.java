package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class afsb extends afsg {
    private final agnw kmConstructor;
    private final aezr returnType$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afsb(afrj afrjVar, String str, Object obj, agnw agnwVar) {
        super(afrjVar, str, obj, afpq.EMPTY);
        afrjVar.getClass();
        str.getClass();
        agnwVar.getClass();
        this.kmConstructor = agnwVar;
        this.returnType$delegate = woy.dH(2, new afsa(afrjVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afib returnType_delegate$lambda$0(afrj afrjVar) {
        afrjVar.getClass();
        return afir.b((afqw) afrjVar);
    }

    @Override // defpackage.afsg
    protected List<agoq> getContextParameters() {
        return afbe.a;
    }

    @Override // defpackage.afsg
    protected agol getExtensionReceiverType() {
        return null;
    }

    @Override // defpackage.afsg
    protected agqp getJvmSignature() {
        agqp signature = agqk.getSignature(this.kmConstructor);
        if (signature != null) {
            return signature;
        }
        toString();
        throw new aftw("No signature for constructor: ".concat(toString()));
    }

    @Override // defpackage.afue
    public agox getModality() {
        return agox.FINAL;
    }

    @Override // defpackage.afhd
    public String getName() {
        return "<init>";
    }

    @Override // defpackage.afhd
    public afib getReturnType() {
        return (afib) this.returnType$delegate.a();
    }

    @Override // defpackage.afsg
    protected afvq getTypeParameterTable() {
        afrj container = getContainer();
        container.getClass();
        return ((afqw) container).getTypeParameterTable$kotlin_reflection();
    }

    @Override // defpackage.afsg
    protected List<agoq> getValueParameters() {
        return this.kmConstructor.getValueParameters();
    }

    @Override // defpackage.afhd
    public afif getVisibility() {
        return afjz.toKVisibility(agmo.getVisibility(this.kmConstructor));
    }

    @Override // defpackage.afhh
    public boolean isExternal() {
        return false;
    }

    @Override // defpackage.afhh
    public boolean isInfix() {
        return false;
    }

    @Override // defpackage.afhh
    public boolean isInline() {
        return false;
    }

    @Override // defpackage.afhh
    public boolean isOperator() {
        return false;
    }

    @Override // defpackage.afui
    public boolean isPrimaryConstructor() {
        return !agmo.isSecondary(this.kmConstructor);
    }

    @Override // defpackage.afhd
    public boolean isSuspend() {
        return false;
    }

    @Override // defpackage.afue
    public afue<Object> shallowCopy(afrj afrjVar, afpq afpqVar) {
        afrjVar.getClass();
        afpqVar.getClass();
        if (!affa.f(afpqVar, afpq.EMPTY)) {
            toString();
            throw new IllegalArgumentException("Constructors cannot have fake overrides: ".concat(toString()));
        }
        return new afsb(afrjVar, getSignature(), afeq.NO_RECEIVER, this.kmConstructor);
    }
}
