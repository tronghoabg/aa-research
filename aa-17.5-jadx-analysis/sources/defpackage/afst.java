package defpackage;

import java.lang.reflect.Type;
import java.util.List;

/* loaded from: classes3.dex */
public final class afst extends afsg {
    private final aezr<afvq> _typeParameterTable;
    private final agog kmFunction;
    private final aezr returnType$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afst(afrj afrjVar, String str, Object obj, agog agogVar, afpq afpqVar) {
        super(afrjVar, str, obj, afpqVar);
        afrjVar.getClass();
        str.getClass();
        agogVar.getClass();
        afpqVar.getClass();
        this.kmFunction = agogVar;
        this._typeParameterTable = woy.dH(2, new afsq(afrjVar, this));
        this.returnType$delegate = woy.dH(2, new afsr(this, afrjVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afvq _typeParameterTable$lambda$0(afrj afrjVar, afst afstVar) {
        afqw afqwVar = afrjVar instanceof afqw ? (afqw) afrjVar : null;
        return afvq.Companion.create(afstVar.kmFunction.getTypeParameters(), afqwVar != null ? afqwVar.getTypeParameterTable$kotlin_reflection() : null, afstVar, agkc.getSafeClassLoader(afrjVar.getJClass()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final aiqc returnType_delegate$lambda$0(afst afstVar, afrj afrjVar) {
        return afjz.toKType$default(afstVar.kmFunction.getReturnType(), agkc.getSafeClassLoader(afrjVar.getJClass()), afstVar.getTypeParameterTable(), false, new afss(afstVar), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type returnType_delegate$lambda$0$0(afst afstVar) {
        Type typeExtractContinuationArgument = afuj.extractContinuationArgument(afstVar);
        return typeExtractContinuationArgument == null ? afstVar.getCaller().getReturnType() : typeExtractContinuationArgument;
    }

    @Override // defpackage.afsg
    protected List<agoq> getContextParameters() {
        return this.kmFunction.getContextParameters();
    }

    @Override // defpackage.afsg
    protected agol getExtensionReceiverType() {
        return this.kmFunction.getReceiverParameterType();
    }

    @Override // defpackage.afsg
    protected agqp getJvmSignature() {
        agqp signature = agqk.getSignature(this.kmFunction);
        if (signature != null) {
            return signature;
        }
        toString();
        throw new aftw("No signature for function: ".concat(toString()));
    }

    @Override // defpackage.afue
    public agox getModality() {
        return agmo.getModality(this.kmFunction);
    }

    @Override // defpackage.afhd
    public String getName() {
        return this.kmFunction.getName();
    }

    @Override // defpackage.afhd
    public afib getReturnType() {
        return (afib) this.returnType$delegate.a();
    }

    @Override // defpackage.afsg
    protected afvq getTypeParameterTable() {
        return (afvq) this._typeParameterTable.a();
    }

    @Override // defpackage.afsg
    protected List<agoq> getValueParameters() {
        return this.kmFunction.getValueParameters();
    }

    @Override // defpackage.afhd
    public afif getVisibility() {
        return afjz.toKVisibility(agmo.getVisibility(this.kmFunction));
    }

    @Override // defpackage.afhh
    public boolean isExternal() {
        return agmo.isExternal(this.kmFunction);
    }

    @Override // defpackage.afhh
    public boolean isInfix() {
        return agmo.isInfix(this.kmFunction);
    }

    @Override // defpackage.afhh
    public boolean isInline() {
        return agmo.isInline(this.kmFunction);
    }

    @Override // defpackage.afhh
    public boolean isOperator() {
        return agmo.isOperator(this.kmFunction);
    }

    @Override // defpackage.afui
    public boolean isPrimaryConstructor() {
        return false;
    }

    @Override // defpackage.afhd
    public boolean isSuspend() {
        return agmo.isSuspend(this.kmFunction);
    }

    @Override // defpackage.afue
    public afue<Object> shallowCopy(afrj afrjVar, afpq afpqVar) {
        afrjVar.getClass();
        afpqVar.getClass();
        return new afst(afrjVar, getSignature(), afeq.NO_RECEIVER, this.kmFunction, afpqVar);
    }
}
