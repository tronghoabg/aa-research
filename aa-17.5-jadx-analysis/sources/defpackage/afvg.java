package defpackage;

import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes.dex */
public final class afvg {
    public static final afvg INSTANCE = new afvg();
    private static final ahnd JAVA_LANG_VOID = ahnd.Companion.topLevel(new ahnf("java.lang.Void"));

    private afvg() {
    }

    private final afyi getPrimitiveType(Class<?> cls) {
        if (cls.isPrimitive()) {
            return ahwe.get(cls.getSimpleName()).getPrimitiveType();
        }
        return null;
    }

    private final afph mapJvmFunctionSignature(agcj agcjVar) {
        return new afph(new ahmm(mapName(agcjVar), ahfp.computeJvmDescriptor$default(agcjVar, false, false, 1, null)));
    }

    private final String mapName(agax agaxVar) {
        String jvmMethodNameIfSpecial = agtu.getJvmMethodNameIfSpecial(agaxVar);
        if (jvmMethodNameIfSpecial != null) {
            return jvmMethodNameIfSpecial;
        }
        if (agaxVar instanceof agdo) {
            String strAsString = ahvz.getPropertyIfAccessor(agaxVar).getName().asString();
            strAsString.getClass();
            return agth.getterName(strAsString);
        }
        if (agaxVar instanceof agdp) {
            String strAsString2 = ahvz.getPropertyIfAccessor(agaxVar).getName().asString();
            strAsString2.getClass();
            return agth.setterName(strAsString2);
        }
        String strAsString3 = agaxVar.getName().asString();
        strAsString3.getClass();
        return strAsString3;
    }

    public final ahnd mapJvmClassToKotlinClassId(Class<?> cls) {
        ahnd ahndVarMapJavaToKotlin;
        cls.getClass();
        if (cls.isArray()) {
            Class<?> componentType = cls.getComponentType();
            componentType.getClass();
            afyi primitiveType = getPrimitiveType(componentType);
            return primitiveType != null ? new ahnd(afyo.BUILT_INS_PACKAGE_FQ_NAME, primitiveType.getArrayTypeName()) : ahnd.Companion.topLevel(afyn.array.toSafe());
        }
        if (affa.f(cls, Void.TYPE)) {
            return JAVA_LANG_VOID;
        }
        afyi primitiveType2 = getPrimitiveType(cls);
        if (primitiveType2 != null) {
            return new ahnd(afyo.BUILT_INS_PACKAGE_FQ_NAME, primitiveType2.getTypeName());
        }
        ahnd classId = agkc.getClassId(cls);
        return (classId.isLocal() || (ahndVarMapJavaToKotlin = afzq.INSTANCE.mapJavaToKotlin(classId.asSingleFqName())) == null) ? classId : ahndVarMapJavaToKotlin;
    }

    public final afpn mapPropertySignature(agdn agdnVar) {
        agdnVar.getClass();
        agdn original = ((agdn) ahst.unwrapFakeOverride(agdnVar)).getOriginal();
        original.getClass();
        if (original instanceof aicu) {
            aicu aicuVar = (aicu) original;
            ahis proto = aicuVar.getProto();
            ahop<ahis, ahly> ahopVar = ahmh.propertySignature;
            ahopVar.getClass();
            ahly ahlyVar = (ahly) ahlf.getExtensionOrNull(proto, ahopVar);
            if (ahlyVar != null) {
                return new afpl(original, proto, ahlyVar, aicuVar.getNameResolver(), aicuVar.getTypeTable());
            }
        } else if (original instanceof agvf) {
            agvf agvfVar = (agvf) original;
            agdx source = agvfVar.getSource();
            agzd agzdVar = source instanceof agzd ? (agzd) source : null;
            agzn javaElement = agzdVar != null ? agzdVar.getJavaElement() : null;
            if (javaElement instanceof agkz) {
                return new afpj(((agkz) javaElement).getMember());
            }
            if (!(javaElement instanceof aglc)) {
                throw new aftw(a.cj((byte) 41, javaElement, original, "Incorrect resolution sequence for Java field ", " (source = "));
            }
            Method member = ((aglc) javaElement).getMember();
            agdp setter = agvfVar.getSetter();
            agdx source2 = setter != null ? setter.getSource() : null;
            agzd agzdVar2 = source2 instanceof agzd ? (agzd) source2 : null;
            agzn javaElement2 = agzdVar2 != null ? agzdVar2.getJavaElement() : null;
            aglc aglcVar = javaElement2 instanceof aglc ? (aglc) javaElement2 : null;
            return new afpk(member, aglcVar != null ? aglcVar.getMember() : null);
        }
        agdo getter = original.getGetter();
        getter.getClass();
        afph afphVarMapJvmFunctionSignature = mapJvmFunctionSignature(getter);
        agdp setter2 = original.getSetter();
        return new afpm(afphVarMapJvmFunctionSignature, setter2 != null ? mapJvmFunctionSignature(setter2) : null);
    }

    public final afpi mapSignature(agcj agcjVar) {
        Method member;
        ahmm jvmConstructorSignature;
        ahmm jvmMethodSignature;
        agcjVar.getClass();
        agcj original = ((agcj) ahst.unwrapFakeOverride(agcjVar)).getOriginal();
        original.getClass();
        if (original instanceof aiax) {
            aibw aibwVar = (aibw) original;
            ahpg proto = aibwVar.getProto();
            if ((proto instanceof ahif) && (jvmMethodSignature = ahmt.INSTANCE.getJvmMethodSignature((ahif) proto, aibwVar.getNameResolver(), aibwVar.getTypeTable())) != null) {
                return new afph(jvmMethodSignature);
            }
            if (!(proto instanceof ahhi) || (jvmConstructorSignature = ahmt.INSTANCE.getJvmConstructorSignature((ahhi) proto, aibwVar.getNameResolver(), aibwVar.getTypeTable())) == null) {
                return mapJvmFunctionSignature(original);
            }
            agbi containingDeclaration = agcjVar.getContainingDeclaration();
            containingDeclaration.getClass();
            return ahsw.isInlineClass(containingDeclaration) ? new afph(jvmConstructorSignature) : new afpg(jvmConstructorSignature);
        }
        if (original instanceof agve) {
            agdx source = ((agve) original).getSource();
            agzd agzdVar = source instanceof agzd ? (agzd) source : null;
            agzn javaElement = agzdVar != null ? agzdVar.getJavaElement() : null;
            aglc aglcVar = javaElement instanceof aglc ? (aglc) javaElement : null;
            if (aglcVar != null && (member = aglcVar.getMember()) != null) {
                return new afpf(member);
            }
            Objects.toString(original);
            throw new aftw("Incorrect resolution sequence for Java method ".concat(original.toString()));
        }
        if (!(original instanceof aguy)) {
            return mapJvmFunctionSignature(original);
        }
        agdx source2 = ((aguy) original).getSource();
        agzd agzdVar2 = source2 instanceof agzd ? (agzd) source2 : null;
        agzn javaElement2 = agzdVar2 != null ? agzdVar2.getJavaElement() : null;
        if (javaElement2 instanceof agkw) {
            return new afpe(((agkw) javaElement2).getMember());
        }
        if (javaElement2 instanceof agkt) {
            agkt agktVar = (agkt) javaElement2;
            if (agktVar.isAnnotationType()) {
                return new afpd(agktVar.getElement());
            }
        }
        throw new aftw(a.cj((byte) 41, javaElement2, original, "Incorrect resolution sequence for Java constructor ", " ("));
    }
}
