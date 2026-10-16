package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes3.dex */
public final class afiu {
    public static final Constructor a(afhh afhhVar) {
        afwf<?> caller;
        afhhVar.getClass();
        afue<?> afueVarAsReflectCallable = afvu.asReflectCallable(afhhVar);
        Member memberMo61getMember = (afueVarAsReflectCallable == null || (caller = afueVarAsReflectCallable.getCaller()) == null) ? null : caller.mo61getMember();
        if (memberMo61getMember instanceof Constructor) {
            return (Constructor) memberMo61getMember;
        }
        return null;
    }

    public static final Field b(afia afiaVar) {
        afiaVar.getClass();
        afun<?> afunVarAsReflectProperty = afvu.asReflectProperty(afiaVar);
        if (afunVarAsReflectProperty != null) {
            return afunVarAsReflectProperty.getJavaField();
        }
        return null;
    }

    public static final Method c(afia afiaVar) {
        return d(afiaVar.getGetter());
    }

    public static final agnq createFunctionKmClass(int i) {
        agnq agnqVar = new agnq();
        agnqVar.setName(a.bp(i, "kotlin/Function"));
        agmo.setKind(agnqVar, agmp.INTERFACE);
        agmo.setModality(agnqVar, agox.ABSTRACT);
        agmo.setVisibility(agnqVar, agoz.PUBLIC);
        if (i > 0) {
            int i2 = 1;
            while (true) {
                agnqVar.getTypeParameters().add(new agon("P" + i2, i2, agor.IN));
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        int i3 = i + 1;
        agnqVar.getTypeParameters().add(new agon("R", i3, agor.OUT));
        List<agol> supertypes = agnqVar.getSupertypes();
        agol agolVar = new agol();
        agolVar.setClassifier(new agnr("kotlin/Function"));
        List<agop> arguments = agolVar.getArguments();
        agor agorVar = agor.INVARIANT;
        agol agolVar2 = new agol();
        agolVar2.setClassifier(new agnt(i3));
        arguments.add(new agop(agorVar, agolVar2));
        supertypes.add(agolVar);
        return agnqVar;
    }

    public static final Method d(afhh afhhVar) {
        afwf<?> caller;
        afhhVar.getClass();
        afue<?> afueVarAsReflectCallable = afvu.asReflectCallable(afhhVar);
        Member memberMo61getMember = (afueVarAsReflectCallable == null || (caller = afueVarAsReflectCallable.getCaller()) == null) ? null : caller.mo61getMember();
        if (memberMo61getMember instanceof Method) {
            return (Method) memberMo61getMember;
        }
        return null;
    }
}
