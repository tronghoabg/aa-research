package defpackage;

import java.util.regex.Matcher;

/* loaded from: classes2.dex */
public final class aihs {
    public static final aisj a(Matcher matcher, int i, CharSequence charSequence) {
        if (matcher.find(i)) {
            return new aism(matcher, charSequence);
        }
        return null;
    }

    public static final aihr replaceAnnotations(aihr aihrVar, agfk agfkVar) {
        aihr aihrVarRemove;
        aihrVar.getClass();
        agfkVar.getClass();
        if (aifi.getAnnotations(aihrVar) == agfkVar) {
            return aihrVar;
        }
        aifh annotationsAttribute = aifi.getAnnotationsAttribute(aihrVar);
        if (annotationsAttribute != null && (aihrVarRemove = aihrVar.remove(annotationsAttribute)) != null) {
            aihrVar = aihrVarRemove;
        }
        return (agfkVar.iterator().hasNext() || !agfkVar.isEmpty()) ? aihrVar.plus(new aifh(agfkVar)) : aihrVar;
    }

    public static final aihr toDefaultAttributes(agfk agfkVar) {
        agfkVar.getClass();
        return aiho.toAttributes$default(aifm.INSTANCE, agfkVar, null, null, 6, null);
    }
}
