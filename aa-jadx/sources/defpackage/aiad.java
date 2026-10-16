package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public class aiad extends defpackage.aiaa {
    private defpackage.ahye _memberScope;
    private defpackage.ahjp _proto;
    private final defpackage.aiba classDataFinder;
    private final defpackage.aicv containerSource;
    private final defpackage.ahlv metadataVersion;
    private final defpackage.ahme nameResolver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiad(defpackage.ahof ahofVar, defpackage.aifi aifiVar, defpackage.agdu agduVar, defpackage.ahjp ahjpVar, defpackage.ahlv ahlvVar, defpackage.aicv aicvVar) {
        super(ahofVar, aifiVar, agduVar);
        ahofVar.getClass();
        aifiVar.getClass();
        agduVar.getClass();
        ahjpVar.getClass();
        ahlvVar.getClass();
        this.metadataVersion = ahlvVar;
        this.containerSource = aicvVar;
        defpackage.ahkf strings = ahjpVar.getStrings();
        strings.getClass();
        defpackage.ahka qualifiedNames = ahjpVar.getQualifiedNames();
        qualifiedNames.getClass();
        defpackage.ahme ahmeVar = new defpackage.ahme(strings, qualifiedNames);
        this.nameResolver = ahmeVar;
        this.classDataFinder = new defpackage.aiba(ahjpVar, ahmeVar, ahlvVar, new defpackage.aiab(this));
        this._proto = ahjpVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.agex classDataFinder$lambda$0(defpackage.aiad aiadVar, defpackage.ahod ahodVar) {
        ahodVar.getClass();
        defpackage.aicv aicvVar = aiadVar.containerSource;
        if (aicvVar != null) {
            return aicvVar;
        }
        defpackage.agex agexVar = defpackage.agex.NO_SOURCE;
        agexVar.getClass();
        return agexVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.Collection initialize$lambda$0(defpackage.aiad aiadVar) {
        java.util.Collection<defpackage.ahod> allClassIds = aiadVar.getClassDataFinder().getAllClassIds();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : allClassIds) {
            defpackage.ahod ahodVar = (defpackage.ahod) obj;
            if (!ahodVar.isNestedClass() && !defpackage.ahzr.Companion.getBLACK_LIST().contains(ahodVar)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.afga.aj(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((defpackage.ahod) it.next()).getShortClassName());
        }
        return arrayList2;
    }

    @Override // defpackage.agec
    public defpackage.ahye getMemberScope() {
        defpackage.ahye ahyeVar = this._memberScope;
        if (ahyeVar != null) {
            return ahyeVar;
        }
        defpackage.afga.d("_memberScope");
        return null;
    }

    @Override // defpackage.aiaa
    public void initialize(defpackage.ahzv ahzvVar) {
        ahzvVar.getClass();
        defpackage.ahjp ahjpVar = this._proto;
        if (ahjpVar == null) {
            throw new java.lang.IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize");
        }
        this._proto = null;
        defpackage.ahjm ahjmVar = ahjpVar.getPackage();
        ahjmVar.getClass();
        defpackage.ahme ahmeVar = this.nameResolver;
        defpackage.ahlv ahlvVar = this.metadataVersion;
        defpackage.aicv aicvVar = this.containerSource;
        toString();
        this._memberScope = new defpackage.aidt(this, ahjmVar, ahmeVar, ahlvVar, aicvVar, ahzvVar, "scope of ".concat(toString()), new defpackage.aiac(this));
    }

    @Override // defpackage.aiaa
    public defpackage.aiba getClassDataFinder() {
        return this.classDataFinder;
    }
}
