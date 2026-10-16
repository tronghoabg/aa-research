package defpackage;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class aikz {
    public static final Object a(aixy aixyVar, Object obj) {
        Object objJ = aixyVar.j(obj);
        if (objJ instanceof aixo) {
            return ((aixp) aiik.a(afcp.a, new jye(aixyVar, obj, (afck) null, 2))).b;
        }
        return afak.a;
    }

    private static final aigl approximate(aigl aiglVar) {
        return aimv.approximateCapturedTypes(aiglVar).getUpper();
    }

    private static final String debugInfo(aiid aiidVar) {
        StringBuilder sb = new StringBuilder();
        Objects.toString(aiidVar);
        debugInfo$lambda$0$unaryPlus("type: ".concat(String.valueOf(aiidVar)), sb);
        debugInfo$lambda$0$unaryPlus("hashCode: " + aiidVar.hashCode(), sb);
        debugInfo$lambda$0$unaryPlus("javaClass: ".concat(String.valueOf(aiidVar.getClass().getCanonicalName())), sb);
        for (agbi declarationDescriptor = aiidVar.getDeclarationDescriptor(); declarationDescriptor != null; declarationDescriptor = declarationDescriptor.getContainingDeclaration()) {
            debugInfo$lambda$0$unaryPlus("fqName: ".concat(String.valueOf(ahre.FQ_NAMES_IN_TYPES.render(declarationDescriptor))), sb);
            debugInfo$lambda$0$unaryPlus("javaClass: ".concat(String.valueOf(declarationDescriptor.getClass().getCanonicalName())), sb);
        }
        return sb.toString();
    }

    private static final StringBuilder debugInfo$lambda$0$unaryPlus(String str, StringBuilder sb) {
        str.getClass();
        sb.append(str);
        sb.append('\n');
        return sb;
    }

    public static final aigl findCorrespondingSupertype(aigl aiglVar, aigl aiglVar2, aiko aikoVar) {
        aiglVar.getClass();
        aiglVar2.getClass();
        aikoVar.getClass();
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(new aikl(aiglVar, null));
        aiid constructor = aiglVar2.getConstructor();
        while (!arrayDeque.isEmpty()) {
            aikl aiklVar = (aikl) arrayDeque.poll();
            aigl type = aiklVar.getType();
            aiid constructor2 = type.getConstructor();
            if (aikoVar.assertEqualTypeConstructors(constructor2, constructor)) {
                boolean zIsMarkedNullable = type.isMarkedNullable();
                for (aikl previous = aiklVar.getPrevious(); previous != null; previous = previous.getPrevious()) {
                    aigl type2 = previous.getType();
                    List<aiin> arguments = type2.getArguments();
                    if ((arguments instanceof Collection) && arguments.isEmpty()) {
                        type = aiig.Companion.create(type2).buildSubstitutor().safeSubstitute(type, aijg.INVARIANT);
                        type.getClass();
                    } else {
                        Iterator<T> it = arguments.iterator();
                        while (it.hasNext()) {
                            if (((aiin) it.next()).getProjectionKind() != aijg.INVARIANT) {
                                aigl aiglVarSafeSubstitute = ahua.wrapWithCapturingSubstitution(aiig.Companion.create(type2), 1 == ((false ? 1 : 0) | (1 & 1))).buildSubstitutor().safeSubstitute(type, aijg.INVARIANT);
                                aiglVarSafeSubstitute.getClass();
                                type = approximate(aiglVarSafeSubstitute);
                                break;
                            }
                        }
                        type = aiig.Companion.create(type2).buildSubstitutor().safeSubstitute(type, aijg.INVARIANT);
                        type.getClass();
                    }
                    zIsMarkedNullable = zIsMarkedNullable || type2.isMarkedNullable();
                }
                aiid constructor3 = type.getConstructor();
                if (aikoVar.assertEqualTypeConstructors(constructor3, constructor)) {
                    return aijc.makeNullableAsSpecified(type, zIsMarkedNullable);
                }
                throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + debugInfo(constructor3) + ", \n\nsupertype: " + debugInfo(constructor) + " \n" + aikoVar.assertEqualTypeConstructors(constructor3, constructor));
            }
            for (aigl aiglVar3 : constructor2.mo89getSupertypes()) {
                aiglVar3.getClass();
                arrayDeque.add(new aikl(aiglVar3, aiklVar));
            }
        }
        return null;
    }
}
