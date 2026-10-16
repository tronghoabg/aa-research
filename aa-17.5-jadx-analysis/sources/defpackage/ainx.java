package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
final class ainx implements aing {
    public static final ainx INSTANCE = new ainx();
    private static final String description = "should not have varargs or parameters with default values";

    private ainx() {
    }

    @Override // defpackage.aing
    public boolean check(agcj agcjVar) {
        agcjVar.getClass();
        List<agel> valueParameters = agcjVar.getValueParameters();
        valueParameters.getClass();
        if (valueParameters.isEmpty()) {
            return true;
        }
        for (agel agelVar : valueParameters) {
            agelVar.getClass();
            if (ahvz.declaresOrInheritsDefaultValue(agelVar) || agelVar.getVarargElementType() != null) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.aing
    public String getDescription() {
        return description;
    }

    @Override // defpackage.aing
    public /* bridge */ String invoke(agcj agcjVar) {
        return ainf.invoke(this, agcjVar);
    }
}
