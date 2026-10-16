package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahvv implements defpackage.aijd {
    public static final defpackage.ahvu Companion = new defpackage.ahvu(null);
    private final defpackage.agdu module;
    private final java.util.Set<defpackage.aihl> possibleTypes;
    private final defpackage.afar supertypes$delegate;
    private final defpackage.aihw type;
    private final long value;

    /* JADX WARN: Multi-variable type inference failed */
    private ahvv(long j, defpackage.agdu agduVar, java.util.Set<? extends defpackage.aihl> set) {
        this.type = defpackage.aihq.integerLiteralType(defpackage.aiir.Companion.getEmpty(), this, false);
        this.supertypes$delegate = defpackage.afga.cA(new defpackage.ahvr(this));
        this.value = j;
        this.module = agduVar;
        this.possibleTypes = set;
    }

    private final java.util.List<defpackage.aihl> getSupertypes() {
        return (java.util.List) this.supertypes$delegate.a();
    }

    private final boolean isContainsOnlyUnsignedTypes() {
        java.util.Collection<defpackage.aihl> allSignedLiteralTypes = defpackage.ahwf.getAllSignedLiteralTypes(this.module);
        if (allSignedLiteralTypes.isEmpty()) {
            return true;
        }
        java.util.Iterator<T> it = allSignedLiteralTypes.iterator();
        while (it.hasNext()) {
            if (this.possibleTypes.contains((defpackage.aihl) it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List supertypes_delegate$lambda$0(defpackage.ahvv ahvvVar) {
        defpackage.aihw defaultType = ahvvVar.getBuiltIns().getComparable().getDefaultType();
        defaultType.getClass();
        java.util.List listAe = defpackage.afga.ae(defpackage.aiju.replace$default(defaultType, defpackage.afga.aa(new defpackage.aijp(defpackage.aikg.IN_VARIANCE, ahvvVar.type)), null, 2, null));
        if (!ahvvVar.isContainsOnlyUnsignedTypes()) {
            listAe.add(ahvvVar.getBuiltIns().getNumberType());
        }
        return listAe;
    }

    private final java.lang.String valueToString() {
        return "[" + defpackage.afga.bo(this.possibleTypes, ",", null, null, defpackage.ahvs.INSTANCE, 30) + ']';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.CharSequence valueToString$lambda$0(defpackage.aihl aihlVar) {
        aihlVar.getClass();
        return aihlVar.toString();
    }

    @Override // defpackage.aijd
    public defpackage.afze getBuiltIns() {
        return this.module.getBuiltIns();
    }

    @Override // defpackage.aijd
    public defpackage.agcd getDeclarationDescriptor() {
        return null;
    }

    @Override // defpackage.aijd
    public java.util.List<defpackage.agfe> getParameters() {
        return defpackage.afce.a;
    }

    public final java.util.Set<defpackage.aihl> getPossibleTypes() {
        return this.possibleTypes;
    }

    @Override // defpackage.aijd
    public boolean isDenotable() {
        return false;
    }

    @Override // defpackage.aijd
    public defpackage.aijd refine(defpackage.aiku aikuVar) {
        aikuVar.getClass();
        return this;
    }

    public java.lang.String toString() {
        return "IntegerLiteralType".concat(valueToString());
    }

    @Override // defpackage.aijd
    /* JADX INFO: renamed from: getSupertypes, reason: collision with other method in class */
    public java.util.Collection<defpackage.aihl> mo89getSupertypes() {
        return getSupertypes();
    }

    public /* synthetic */ ahvv(long j, defpackage.agdu agduVar, java.util.Set set, defpackage.affu affuVar) {
        this(j, agduVar, set);
    }
}
