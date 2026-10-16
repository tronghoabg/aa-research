package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agug {
    private final defpackage.afar description$delegate;
    private final defpackage.aguq globalLevel;
    private final boolean isDisabled;
    private final defpackage.aguq migrationLevel;
    private final java.util.Map<defpackage.ahof, defpackage.aguq> userDefinedLevelForSpecificAnnotation;

    /* JADX WARN: Multi-variable type inference failed */
    public agug(defpackage.aguq aguqVar, defpackage.aguq aguqVar2, java.util.Map<defpackage.ahof, ? extends defpackage.aguq> map) {
        aguqVar.getClass();
        map.getClass();
        this.globalLevel = aguqVar;
        this.migrationLevel = aguqVar2;
        this.userDefinedLevelForSpecificAnnotation = map;
        this.description$delegate = defpackage.afga.cA(new defpackage.aguf(this));
        defpackage.aguq aguqVar3 = defpackage.aguq.IGNORE;
        boolean z = false;
        if (aguqVar == aguqVar3 && aguqVar2 == aguqVar3 && map.isEmpty()) {
            z = true;
        }
        this.isDisabled = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String[] description_delegate$lambda$0(defpackage.agug agugVar) {
        defpackage.afct afctVar = new defpackage.afct(10);
        afctVar.add(agugVar.globalLevel.getDescription());
        defpackage.aguq aguqVar = agugVar.migrationLevel;
        if (aguqVar != null) {
            afctVar.add("under-migration:".concat(java.lang.String.valueOf(aguqVar.getDescription())));
        }
        for (java.util.Map.Entry<defpackage.ahof, defpackage.aguq> entry : agugVar.userDefinedLevelForSpecificAnnotation.entrySet()) {
            afctVar.add("@" + entry.getKey() + ':' + entry.getValue().getDescription());
        }
        return (java.lang.String[]) afctVar.f().toArray(new java.lang.String[0]);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.agug)) {
            return false;
        }
        defpackage.agug agugVar = (defpackage.agug) obj;
        return this.globalLevel == agugVar.globalLevel && this.migrationLevel == agugVar.migrationLevel && defpackage.afga.f(this.userDefinedLevelForSpecificAnnotation, agugVar.userDefinedLevelForSpecificAnnotation);
    }

    public final defpackage.aguq getGlobalLevel() {
        return this.globalLevel;
    }

    public final defpackage.aguq getMigrationLevel() {
        return this.migrationLevel;
    }

    public final java.util.Map<defpackage.ahof, defpackage.aguq> getUserDefinedLevelForSpecificAnnotation() {
        return this.userDefinedLevelForSpecificAnnotation;
    }

    public int hashCode() {
        int iHashCode = this.globalLevel.hashCode() * 31;
        defpackage.aguq aguqVar = this.migrationLevel;
        return ((iHashCode + (aguqVar == null ? 0 : aguqVar.hashCode())) * 31) + this.userDefinedLevelForSpecificAnnotation.hashCode();
    }

    public final boolean isDisabled() {
        return this.isDisabled;
    }

    public java.lang.String toString() {
        return "Jsr305Settings(globalLevel=" + this.globalLevel + ", migrationLevel=" + this.migrationLevel + ", userDefinedLevelForSpecificAnnotation=" + this.userDefinedLevelForSpecificAnnotation + ')';
    }

    public /* synthetic */ agug(defpackage.aguq aguqVar, defpackage.aguq aguqVar2, java.util.Map map, int i, defpackage.affu affuVar) {
        this(aguqVar, (i & 2) != 0 ? null : aguqVar2, (i & 4) != 0 ? defpackage.afcf.a : map);
    }
}
