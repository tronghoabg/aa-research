package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ailb implements defpackage.ahuw {
    private final defpackage.afar _supertypes$delegate;
    private final defpackage.ailb original;
    private final defpackage.aijn projection;
    private defpackage.afer<? extends java.util.List<? extends defpackage.aikf>> supertypesComputation;
    private final defpackage.agfe typeParameter;

    public ailb(defpackage.aijn aijnVar, defpackage.afer<? extends java.util.List<? extends defpackage.aikf>> aferVar, defpackage.ailb ailbVar, defpackage.agfe agfeVar) {
        aijnVar.getClass();
        this.projection = aijnVar;
        this.supertypesComputation = aferVar;
        this.original = ailbVar;
        this.typeParameter = agfeVar;
        this._supertypes$delegate = defpackage.afga.cB(2, new defpackage.aikx(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List _supertypes_delegate$lambda$0(defpackage.ailb ailbVar) {
        defpackage.afer<? extends java.util.List<? extends defpackage.aikf>> aferVar = ailbVar.supertypesComputation;
        if (aferVar != null) {
            return aferVar.invoke();
        }
        return null;
    }

    private final java.util.List<defpackage.aikf> get_supertypes() {
        return (java.util.List) this._supertypes$delegate.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List refine$lambda$0$0(defpackage.ailb ailbVar, defpackage.aiku aikuVar) {
        java.util.List<defpackage.aikf> listMo89getSupertypes = ailbVar.mo89getSupertypes();
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.afga.aj(listMo89getSupertypes, 10));
        java.util.Iterator<T> it = listMo89getSupertypes.iterator();
        while (it.hasNext()) {
            arrayList.add(((defpackage.aikf) it.next()).refine(aikuVar));
        }
        return arrayList;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!defpackage.afga.f(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        defpackage.ailb ailbVar = this.original;
        if (ailbVar != null) {
            this = ailbVar;
        }
        defpackage.ailb ailbVar2 = ((defpackage.ailb) obj).original;
        if (ailbVar2 != null) {
            obj = ailbVar2;
        }
        return this == obj;
    }

    @Override // defpackage.aijd
    public defpackage.afze getBuiltIns() {
        defpackage.aihl type = getProjection().getType();
        type.getClass();
        return defpackage.ainr.getBuiltIns(type);
    }

    @Override // defpackage.aijd
    public defpackage.agcd getDeclarationDescriptor() {
        return null;
    }

    @Override // defpackage.aijd
    public java.util.List<defpackage.agfe> getParameters() {
        return defpackage.afce.a;
    }

    @Override // defpackage.ahuw
    public defpackage.aijn getProjection() {
        return this.projection;
    }

    @Override // defpackage.aijd
    /* JADX INFO: renamed from: getSupertypes */
    public java.util.List<defpackage.aikf> mo89getSupertypes() {
        java.util.List<defpackage.aikf> list = get_supertypes();
        return list == null ? defpackage.afce.a : list;
    }

    public int hashCode() {
        defpackage.ailb ailbVar = this.original;
        return ailbVar != null ? ailbVar.hashCode() : super.hashCode();
    }

    public final void initializeSupertypes(java.util.List<? extends defpackage.aikf> list) {
        list.getClass();
        this.supertypesComputation = new defpackage.aikz(list);
    }

    @Override // defpackage.aijd
    public boolean isDenotable() {
        return false;
    }

    @Override // defpackage.aijd
    public defpackage.ailb refine(defpackage.aiku aikuVar) {
        aikuVar.getClass();
        defpackage.aijn aijnVarRefine = getProjection().refine(aikuVar);
        aijnVarRefine.getClass();
        defpackage.aila ailaVar = this.supertypesComputation != null ? new defpackage.aila(this, aikuVar) : null;
        defpackage.ailb ailbVar = this.original;
        if (ailbVar == null) {
            ailbVar = this;
        }
        return new defpackage.ailb(aijnVarRefine, ailaVar, ailbVar, this.typeParameter);
    }

    public java.lang.String toString() {
        return "CapturedType(" + getProjection() + ')';
    }

    private static final java.util.List _init_$lambda$0(java.util.List list) {
        return list;
    }

    static /* synthetic */ java.util.List accessor$NewCapturedTypeConstructor$lambda1(java.util.List list) {
        return list;
    }

    static /* synthetic */ java.util.List accessor$NewCapturedTypeConstructor$lambda2(java.util.List list) {
        return list;
    }

    private static final java.util.List initializeSupertypes$lambda$1(java.util.List list) {
        return list;
    }

    public /* synthetic */ ailb(defpackage.aijn aijnVar, java.util.List list, defpackage.ailb ailbVar, int i, defpackage.affu affuVar) {
        this(aijnVar, list, (i & 4) != 0 ? null : ailbVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ailb(defpackage.aijn aijnVar, java.util.List<? extends defpackage.aikf> list, defpackage.ailb ailbVar) {
        this(aijnVar, new defpackage.aiky(list), ailbVar, null, 8, null);
        aijnVar.getClass();
        list.getClass();
    }

    public /* synthetic */ ailb(defpackage.aijn aijnVar, defpackage.afer aferVar, defpackage.ailb ailbVar, defpackage.agfe agfeVar, int i, defpackage.affu affuVar) {
        this(aijnVar, (i & 2) != 0 ? null : aferVar, (i & 4) != 0 ? null : ailbVar, (i & 8) != 0 ? null : agfeVar);
    }
}
