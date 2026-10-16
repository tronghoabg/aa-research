package defpackage;

/* loaded from: classes3.dex */
public final class agzp {
    private static final boolean isMethodWithOneObjectParameter(agzr agzrVar) {
        ahnf fqName;
        aglk aglkVar = (aglk) woy.bP(agzrVar.getValueParameters());
        agzw agzwVarM80getType = aglkVar != null ? aglkVar.m80getType() : null;
        agzl agzlVar = agzwVarM80getType instanceof agzl ? (agzl) agzwVarM80getType : null;
        if (agzlVar == null) {
            return false;
        }
        agzk classifier = agzlVar.getClassifier();
        return (classifier instanceof agzj) && (fqName = ((agzj) classifier).getFqName()) != null && affa.f(fqName.asString(), "java.lang.Object");
    }

    private static final boolean isObjectMethod(agzr agzrVar) {
        String strAsString = agzrVar.getName().asString();
        int iHashCode = strAsString.hashCode();
        if (iHashCode != -1776922004) {
            if (iHashCode == -1295482945) {
                if (strAsString.equals("equals")) {
                    return isMethodWithOneObjectParameter(agzrVar);
                }
                return false;
            }
            if (iHashCode != 147696667 || !strAsString.equals("hashCode")) {
                return false;
            }
        } else if (!strAsString.equals("toString")) {
            return false;
        }
        return agzrVar.getValueParameters().isEmpty();
    }

    public static final boolean isObjectMethodInInterface(agzq agzqVar) {
        agzqVar.getClass();
        return agzqVar.getContainingClass().isInterface() && (agzqVar instanceof agzr) && isObjectMethod((agzr) agzqVar);
    }
}
