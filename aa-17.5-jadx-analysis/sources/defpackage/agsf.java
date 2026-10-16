package defpackage;

import java.util.Collection;

/* loaded from: classes3.dex */
public final class agsf {
    public static final agsf INSTANCE = new agsf();

    private agsf() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getBuiltinSpecialPropertyGetterName$lambda$1(agax agaxVar) {
        agaxVar.getClass();
        return INSTANCE.hasBuiltinSpecialPropertyFqName(agaxVar);
    }

    private final boolean hasBuiltinSpecialPropertyFqNameImpl(agax agaxVar) {
        if (woy.cn(agsc.INSTANCE.getSPECIAL_FQ_NAMES(), ahvz.fqNameOrNull(agaxVar)) && agaxVar.getValueParameters().isEmpty()) {
            return true;
        }
        if (!afye.isBuiltIn(agaxVar)) {
            return false;
        }
        Collection<? extends agax> overriddenDescriptors = agaxVar.getOverriddenDescriptors();
        overriddenDescriptors.getClass();
        if (overriddenDescriptors.isEmpty()) {
            return false;
        }
        for (agax agaxVar2 : overriddenDescriptors) {
            agsf agsfVar = INSTANCE;
            agaxVar2.getClass();
            if (agsfVar.hasBuiltinSpecialPropertyFqName(agaxVar2)) {
                return true;
            }
        }
        return false;
    }

    public final String getBuiltinSpecialPropertyGetterName(agax agaxVar) {
        ahnj ahnjVar;
        agaxVar.getClass();
        afye.isBuiltIn(agaxVar);
        agax agaxVarFirstOverridden = ahvz.firstOverridden(ahvz.getPropertyIfAccessor(agaxVar), 1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)), agse.INSTANCE);
        if (agaxVarFirstOverridden == null || (ahnjVar = agsc.INSTANCE.getPROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP().get(ahvz.getFqNameSafe(agaxVarFirstOverridden))) == null) {
            return null;
        }
        return ahnjVar.asString();
    }

    public final boolean hasBuiltinSpecialPropertyFqName(agax agaxVar) {
        agaxVar.getClass();
        if (agsc.INSTANCE.getSPECIAL_SHORT_NAMES().contains(agaxVar.getName())) {
            return hasBuiltinSpecialPropertyFqNameImpl(agaxVar);
        }
        return false;
    }
}
