package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agtf {
    public static final defpackage.agtf INSTANCE = new defpackage.agtf();

    private agtf() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getBuiltinSpecialPropertyGetterName$lambda$1(defpackage.agbx agbxVar) {
        agbxVar.getClass();
        return INSTANCE.hasBuiltinSpecialPropertyFqName(agbxVar);
    }

    private final boolean hasBuiltinSpecialPropertyFqNameImpl(defpackage.agbx agbxVar) {
        if (defpackage.afga.bh(defpackage.agtc.INSTANCE.getSPECIAL_FQ_NAMES(), defpackage.ahwz.fqNameOrNull(agbxVar)) && agbxVar.getValueParameters().isEmpty()) {
            return true;
        }
        if (!defpackage.afze.isBuiltIn(agbxVar)) {
            return false;
        }
        java.util.Collection<? extends defpackage.agbx> overriddenDescriptors = agbxVar.getOverriddenDescriptors();
        overriddenDescriptors.getClass();
        if (overriddenDescriptors.isEmpty()) {
            return false;
        }
        for (defpackage.agbx agbxVar2 : overriddenDescriptors) {
            defpackage.agtf agtfVar = INSTANCE;
            agbxVar2.getClass();
            if (agtfVar.hasBuiltinSpecialPropertyFqName(agbxVar2)) {
                return true;
            }
        }
        return false;
    }

    public final java.lang.String getBuiltinSpecialPropertyGetterName(defpackage.agbx agbxVar) {
        defpackage.ahoj ahojVar;
        agbxVar.getClass();
        defpackage.afze.isBuiltIn(agbxVar);
        defpackage.agbx agbxVarFirstOverridden = defpackage.ahwz.firstOverridden(defpackage.ahwz.getPropertyIfAccessor(agbxVar), 1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)), defpackage.agte.INSTANCE);
        if (agbxVarFirstOverridden == null || (ahojVar = defpackage.agtc.INSTANCE.getPROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP().get(defpackage.ahwz.getFqNameSafe(agbxVarFirstOverridden))) == null) {
            return null;
        }
        return ahojVar.asString();
    }

    public final boolean hasBuiltinSpecialPropertyFqName(defpackage.agbx agbxVar) {
        agbxVar.getClass();
        if (defpackage.agtc.INSTANCE.getSPECIAL_SHORT_NAMES().contains(agbxVar.getName())) {
            return hasBuiltinSpecialPropertyFqNameImpl(agbxVar);
        }
        return false;
    }
}
