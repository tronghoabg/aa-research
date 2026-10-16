package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agir extends defpackage.aghy implements defpackage.agej {
    static final /* synthetic */ defpackage.afja<java.lang.Object>[] $$delegatedProperties = {new defpackage.afgn(defpackage.agir.class, "fragments", "getFragments()Ljava/util/List;", 0), new defpackage.afgn(defpackage.agir.class, "empty", "getEmpty()Z", 0)};
    private final defpackage.aifc empty$delegate;
    private final defpackage.ahof fqName;
    private final defpackage.aifc fragments$delegate;
    private final defpackage.ahye memberScope;
    private final defpackage.agjc module;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agir(defpackage.agjc agjcVar, defpackage.ahof ahofVar, defpackage.aifi aifiVar) {
        super(defpackage.aggk.Companion.getEMPTY(), ahofVar.shortNameOrSpecial());
        agjcVar.getClass();
        ahofVar.getClass();
        aifiVar.getClass();
        this.module = agjcVar;
        this.fqName = ahofVar;
        this.fragments$delegate = aifiVar.createLazyValue(new defpackage.agio(this));
        this.empty$delegate = aifiVar.createLazyValue(new defpackage.agip(this));
        this.memberScope = new defpackage.ahxz(aifiVar, new defpackage.agiq(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean empty_delegate$lambda$0(defpackage.agir agirVar) {
        return defpackage.ageh.isEmpty(agirVar.getModule().getPackageFragmentProvider(), agirVar.getFqName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List fragments_delegate$lambda$0(defpackage.agir agirVar) {
        return defpackage.ageh.packageFragments(agirVar.getModule().getPackageFragmentProvider(), agirVar.getFqName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.ahye memberScope$lambda$0(defpackage.agir agirVar) {
        if (agirVar.isEmpty()) {
            return defpackage.ahyd.INSTANCE;
        }
        java.util.List<defpackage.agec> fragments = agirVar.getFragments();
        java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.afga.aj(fragments, 10));
        java.util.Iterator<T> it = fragments.iterator();
        while (it.hasNext()) {
            arrayList.add(((defpackage.agec) it.next()).getMemberScope());
        }
        java.util.List listAT = defpackage.afga.aT(arrayList, new defpackage.agjp(agirVar.getModule(), agirVar.getFqName()));
        return defpackage.ahxl.Companion.create("package view scope for " + agirVar.getFqName() + " in " + agirVar.getModule().getName(), listAT);
    }

    @Override // defpackage.agci
    public <R, D> R accept(defpackage.agck<R, D> agckVar, D d) {
        agckVar.getClass();
        return agckVar.visitPackageViewDescriptor(this, d);
    }

    public boolean equals(java.lang.Object obj) {
        defpackage.agej agejVar = obj instanceof defpackage.agej ? (defpackage.agej) obj : null;
        return agejVar != null && defpackage.afga.f(getFqName(), agejVar.getFqName()) && defpackage.afga.f(getModule(), agejVar.getModule());
    }

    @Override // defpackage.agci
    public defpackage.agej getContainingDeclaration() {
        if (getFqName().isRoot()) {
            return null;
        }
        return getModule().getPackage(getFqName().parent());
    }

    protected final boolean getEmpty() {
        return ((java.lang.Boolean) defpackage.aifh.getValue(this.empty$delegate, this, $$delegatedProperties[1])).booleanValue();
    }

    @Override // defpackage.agej
    public defpackage.ahof getFqName() {
        return this.fqName;
    }

    @Override // defpackage.agej
    public java.util.List<defpackage.agec> getFragments() {
        return (java.util.List) defpackage.aifh.getValue(this.fragments$delegate, this, $$delegatedProperties[0]);
    }

    @Override // defpackage.agej
    public defpackage.ahye getMemberScope() {
        return this.memberScope;
    }

    public int hashCode() {
        return (getModule().hashCode() * 31) + getFqName().hashCode();
    }

    @Override // defpackage.agej
    public boolean isEmpty() {
        return getEmpty();
    }

    @Override // defpackage.agej
    public defpackage.agjc getModule() {
        return this.module;
    }
}
