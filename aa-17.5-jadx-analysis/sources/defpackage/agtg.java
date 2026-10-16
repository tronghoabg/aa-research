package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
public final class agtg {
    private final aezr description$delegate;
    private final agtq globalLevel;
    private final boolean isDisabled;
    private final agtq migrationLevel;
    private final Map<ahnf, agtq> userDefinedLevelForSpecificAnnotation;

    /* JADX WARN: Multi-variable type inference failed */
    public agtg(agtq agtqVar, agtq agtqVar2, Map<ahnf, ? extends agtq> map) {
        agtqVar.getClass();
        map.getClass();
        this.globalLevel = agtqVar;
        this.migrationLevel = agtqVar2;
        this.userDefinedLevelForSpecificAnnotation = map;
        this.description$delegate = woy.dG(new agtf(this));
        agtq agtqVar3 = agtq.IGNORE;
        boolean z = false;
        if (agtqVar == agtqVar3 && agtqVar2 == agtqVar3 && map.isEmpty()) {
            z = true;
        }
        this.isDisabled = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String[] description_delegate$lambda$0(agtg agtgVar) {
        afbt afbtVar = new afbt(10);
        afbtVar.add(agtgVar.globalLevel.getDescription());
        agtq agtqVar = agtgVar.migrationLevel;
        if (agtqVar != null) {
            afbtVar.add("under-migration:".concat(String.valueOf(agtqVar.getDescription())));
        }
        for (Map.Entry<ahnf, agtq> entry : agtgVar.userDefinedLevelForSpecificAnnotation.entrySet()) {
            afbtVar.add("@" + entry.getKey() + ':' + entry.getValue().getDescription());
        }
        return (String[]) afbtVar.f().toArray(new String[0]);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agtg)) {
            return false;
        }
        agtg agtgVar = (agtg) obj;
        return this.globalLevel == agtgVar.globalLevel && this.migrationLevel == agtgVar.migrationLevel && affa.f(this.userDefinedLevelForSpecificAnnotation, agtgVar.userDefinedLevelForSpecificAnnotation);
    }

    public final agtq getGlobalLevel() {
        return this.globalLevel;
    }

    public final agtq getMigrationLevel() {
        return this.migrationLevel;
    }

    public final Map<ahnf, agtq> getUserDefinedLevelForSpecificAnnotation() {
        return this.userDefinedLevelForSpecificAnnotation;
    }

    public int hashCode() {
        int iHashCode = this.globalLevel.hashCode() * 31;
        agtq agtqVar = this.migrationLevel;
        return ((iHashCode + (agtqVar == null ? 0 : agtqVar.hashCode())) * 31) + this.userDefinedLevelForSpecificAnnotation.hashCode();
    }

    public final boolean isDisabled() {
        return this.isDisabled;
    }

    public String toString() {
        return "Jsr305Settings(globalLevel=" + this.globalLevel + ", migrationLevel=" + this.migrationLevel + ", userDefinedLevelForSpecificAnnotation=" + this.userDefinedLevelForSpecificAnnotation + ')';
    }

    public /* synthetic */ agtg(agtq agtqVar, agtq agtqVar2, Map map, int i, afeu afeuVar) {
        this(agtqVar, (i & 2) != 0 ? null : agtqVar2, (i & 4) != 0 ? afbf.a : map);
    }
}
