package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahyl extends defpackage.ahyf {
    static final /* synthetic */ defpackage.afja<java.lang.Object>[] $$delegatedProperties = {new defpackage.afgn(defpackage.ahyl.class, "functions", "getFunctions()Ljava/util/List;", 0), new defpackage.afgn(defpackage.ahyl.class, "properties", "getProperties()Ljava/util/List;", 0)};
    private final defpackage.agca containingClass;
    private final boolean enumEntriesCanBeUsed;
    private final defpackage.aifc functions$delegate;
    private final defpackage.aifc properties$delegate;

    public ahyl(defpackage.aifi aifiVar, defpackage.agca agcaVar, boolean z) {
        aifiVar.getClass();
        agcaVar.getClass();
        this.containingClass = agcaVar;
        this.enumEntriesCanBeUsed = z;
        agcaVar.getKind();
        defpackage.agcb agcbVar = defpackage.agcb.CLASS;
        this.functions$delegate = aifiVar.createLazyValue(new defpackage.ahyj(this));
        this.properties$delegate = aifiVar.createLazyValue(new defpackage.ahyk(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List functions_delegate$lambda$0(defpackage.ahyl ahylVar) {
        return defpackage.afga.ac(defpackage.ahts.createEnumValueOfMethod(ahylVar.containingClass), defpackage.ahts.createEnumValuesMethod(ahylVar.containingClass));
    }

    private final java.util.List<defpackage.agev> getFunctions() {
        return (java.util.List) defpackage.aifh.getValue(this.functions$delegate, this, $$delegatedProperties[0]);
    }

    private final java.util.List<defpackage.agen> getProperties() {
        return (java.util.List) defpackage.aifh.getValue(this.properties$delegate, this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List properties_delegate$lambda$0(defpackage.ahyl ahylVar) {
        return ahylVar.enumEntriesCanBeUsed ? defpackage.afga.ad(defpackage.ahts.createEnumEntriesProperty(ahylVar.containingClass)) : defpackage.afce.a;
    }

    /* JADX INFO: renamed from: getContributedClassifier, reason: collision with other method in class */
    public java.lang.Void m91getContributedClassifier(defpackage.ahoj ahojVar, defpackage.agmo agmoVar) {
        ahojVar.getClass();
        agmoVar.getClass();
        return null;
    }

    @Override // defpackage.ahyf, defpackage.ahyi
    public java.util.List<defpackage.agbx> getContributedDescriptors(defpackage.ahxt ahxtVar, defpackage.affc<? super defpackage.ahoj, java.lang.Boolean> affcVar) {
        ahxtVar.getClass();
        affcVar.getClass();
        return defpackage.afga.aS(getFunctions(), getProperties());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ahyf, defpackage.ahye, defpackage.ahyi
    public defpackage.aiqr<defpackage.agev> getContributedFunctions(defpackage.ahoj ahojVar, defpackage.agmo agmoVar) {
        ahojVar.getClass();
        agmoVar.getClass();
        java.util.List<defpackage.agev> functions = getFunctions();
        defpackage.aiqr<defpackage.agev> aiqrVar = new defpackage.aiqr<>();
        for (java.lang.Object obj : functions) {
            if (defpackage.afga.f(((defpackage.agev) obj).getName(), ahojVar)) {
                aiqrVar.add(obj);
            }
        }
        return aiqrVar;
    }

    @Override // defpackage.ahyf, defpackage.ahye
    public java.util.Collection<defpackage.agen> getContributedVariables(defpackage.ahoj ahojVar, defpackage.agmo agmoVar) {
        ahojVar.getClass();
        agmoVar.getClass();
        java.util.List<defpackage.agen> properties = getProperties();
        defpackage.aiqr aiqrVar = new defpackage.aiqr();
        for (java.lang.Object obj : properties) {
            if (defpackage.afga.f(((defpackage.agen) obj).getName(), ahojVar)) {
                aiqrVar.add(obj);
            }
        }
        return aiqrVar;
    }

    @Override // defpackage.ahyf, defpackage.ahyi
    public /* bridge */ /* synthetic */ defpackage.agcd getContributedClassifier(defpackage.ahoj ahojVar, defpackage.agmo agmoVar) {
        m91getContributedClassifier(ahojVar, agmoVar);
        return null;
    }

    @Override // defpackage.ahyf, defpackage.ahyi
    public /* bridge */ /* synthetic */ java.util.Collection getContributedDescriptors(defpackage.ahxt ahxtVar, defpackage.affc affcVar) {
        return getContributedDescriptors(ahxtVar, (defpackage.affc<? super defpackage.ahoj, java.lang.Boolean>) affcVar);
    }
}
