package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class afwf {
    public static final defpackage.afwf INSTANCE = new defpackage.afwf();

    private afwf() {
    }

    private final void appendContexts(java.lang.StringBuilder sb, defpackage.afid<?> afidVar) throws java.io.IOException {
        afidVar.getClass();
        java.util.List<defpackage.afir> parameters = afidVar.getParameters();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : parameters) {
            if (((defpackage.afir) obj).getKind() == defpackage.afiq.b) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        defpackage.afga.bn(arrayList, sb, ", ", "context(", ") ", -1, "...", defpackage.afvy.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.CharSequence appendContexts$lambda$0(defpackage.afir afirVar) {
        afirVar.getClass();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String name = afirVar.getName();
        if (name == null) {
            name = "_";
        }
        sb.append(name);
        sb.append(": ");
        sb.append(afirVar.getType());
        return sb.toString();
    }

    private final void appendName(java.lang.StringBuilder sb, java.lang.String str) {
        sb.append(defpackage.ahok.render$default(defpackage.ahoj.identifier(str), false, 1, null));
    }

    private final java.lang.StringBuilder appendReceiverType(java.lang.StringBuilder sb, defpackage.afir afirVar) {
        sb.append(renderType$default(this, afirVar.getType(), false, 2, null));
        sb.append(".");
        sb.getClass();
        return sb;
    }

    private final void appendReceivers(java.lang.StringBuilder sb, defpackage.afid<?> afidVar) {
        afidVar.getClass();
        java.util.List<defpackage.afir> allParameters = ((defpackage.afve) afidVar).getAllParameters();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : allParameters) {
            defpackage.afir afirVar = (defpackage.afir) obj;
            if (afirVar.getKind() == defpackage.afiq.a || afirVar.getKind() == defpackage.afiq.c) {
                arrayList.add(obj);
            }
        }
        defpackage.afir afirVar2 = (defpackage.afir) defpackage.afga.aC(arrayList, 0);
        if (afirVar2 != null) {
            INSTANCE.appendReceiverType(sb, afirVar2);
        }
        defpackage.afir afirVar3 = (defpackage.afir) defpackage.afga.aC(arrayList, 1);
        if (afirVar3 != null) {
            defpackage.afwf afwfVar = INSTANCE;
            sb.append("(");
            sb.getClass();
            afwfVar.appendReceiverType(sb, afirVar3);
            sb.append(")");
        }
    }

    private final defpackage.ahoh getTypeClassFqName(defpackage.airc aircVar, defpackage.afie<?> afieVar) {
        if (aircVar.isNothingType()) {
            return defpackage.afzn.nothing;
        }
        defpackage.afie<?> mutableCollectionClass = aircVar.getMutableCollectionClass();
        if (mutableCollectionClass != null) {
            afieVar = mutableCollectionClass;
        }
        java.lang.String qualifiedName = afieVar.getQualifiedName();
        if (qualifiedName != null) {
            return new defpackage.ahoh(qualifiedName);
        }
        return null;
    }

    private final java.lang.String renderCallable(defpackage.afid<?> afidVar) {
        if (afidVar instanceof defpackage.afja) {
            return renderProperty((defpackage.afja) afidVar);
        }
        if (afidVar instanceof defpackage.afih) {
            return renderFunction((defpackage.afih) afidVar);
        }
        java.util.Objects.toString(afidVar);
        throw new java.lang.IllegalStateException("Illegal callable: ".concat(java.lang.String.valueOf(afidVar)));
    }

    private final java.lang.String renderFlexibleType(java.lang.String str, java.lang.String str2) {
        if (defpackage.afga.f(str, defpackage.afzh.J(str2, "?", ""))) {
            return defpackage.afzh.J(str2, "?", "!");
        }
        if (defpackage.afzh.e(str2, "?", false)) {
            if (defpackage.afga.f(str + '?', str2)) {
                return str + '!';
            }
        }
        if (defpackage.afga.f("(" + str + ")?", str2)) {
            return "(" + str + ")!";
        }
        java.lang.String strRenderFlexibleMutabilityOrArrayElementVarianceType$default = defpackage.ahti.renderFlexibleMutabilityOrArrayElementVarianceType$default(str, str2, new defpackage.afwd(str), new defpackage.afwe(str), null, 16, null);
        if (strRenderFlexibleMutabilityOrArrayElementVarianceType$default != null) {
            return strRenderFlexibleMutabilityOrArrayElementVarianceType$default;
        }
        return "(" + str + ".." + str2 + ')';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String renderFlexibleType$lambda$0(java.lang.String str) {
        java.lang.String str2 = defpackage.afzo.COLLECTIONS_PACKAGE_FQ_NAME.asString() + '.';
        if (true != defpackage.afzh.g(str, str2, false)) {
            str2 = null;
        }
        return str2 == null ? "" : str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String renderFlexibleType$lambda$1(java.lang.String str) {
        java.lang.String str2 = defpackage.afzo.BUILT_INS_PACKAGE_FQ_NAME.asString() + '.';
        if (true != defpackage.afzh.g(str, str2, false)) {
            str2 = null;
        }
        return str2 == null ? "" : str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.CharSequence renderFunction$lambda$0$0(defpackage.afir afirVar) {
        afirVar.getClass();
        return renderType$default(INSTANCE, afirVar.getType(), false, 2, null);
    }

    private final void renderFunctionType(java.lang.StringBuilder sb, defpackage.airc aircVar) throws java.io.IOException {
        if (aircVar.isMarkedNullable()) {
            sb.append("(");
        }
        if (aircVar.isSuspendFunctionType()) {
            sb.append("suspend ");
        }
        defpackage.afga.bn(defpackage.afga.aM(aircVar.getArguments(), 1), sb, ", ", "(", ") -> ", -1, "...", null);
        sb.append(defpackage.afga.aE(aircVar.getArguments()));
        if (aircVar.isMarkedNullable()) {
            sb.append(")?");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.CharSequence renderLambda$lambda$0$1(defpackage.afir afirVar) {
        afirVar.getClass();
        return renderType$default(INSTANCE, afirVar.getType(), false, 2, null);
    }

    private final void renderSimpleType(java.lang.StringBuilder sb, defpackage.afie<?> afieVar, defpackage.ahoh ahohVar, java.util.List<defpackage.afjd> list, boolean z, boolean z2) throws java.io.IOException {
        defpackage.afwf afwfVar;
        java.lang.StringBuilder sb2;
        boolean z3;
        if (afieVar.getTypeParameters().size() >= list.size() || defpackage.afga.h(afieVar).getDeclaringClass() == null) {
            afwfVar = this;
            sb2 = sb;
            z3 = z2;
            sb2.append(defpackage.ahok.render(ahohVar));
        } else {
            java.lang.Class<?> declaringClass = defpackage.afga.h(afieVar).getDeclaringClass();
            declaringClass.getClass();
            afwfVar = this;
            sb2 = sb;
            z3 = z2;
            afwfVar.renderSimpleType(sb2, defpackage.afga.l(declaringClass), ahohVar.parent(), defpackage.afga.aL(list, afieVar.getTypeParameters().size()), false, z3);
            sb2.append(".");
            sb2.append(defpackage.ahok.render$default(ahohVar.shortName(), false, 1, null));
        }
        afwfVar.renderTypeArgumentsAndNullability(sb2, defpackage.afga.aX(list, afieVar.getTypeParameters().size()), z, z3);
    }

    public static /* synthetic */ java.lang.String renderType$default(defpackage.afwf afwfVar, defpackage.afjb afjbVar, boolean z, int i, java.lang.Object obj) {
        return afwfVar.renderType(afjbVar, z & ((i & 2) == 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.CharSequence renderType$lambda$0$1(defpackage.ahoj ahojVar) {
        ahojVar.getClass();
        return defpackage.ahok.render$default(ahojVar, false, 1, null);
    }

    private final void renderTypeArgumentsAndNullability(java.lang.StringBuilder sb, java.util.List<defpackage.afjd> list, boolean z, boolean z2) throws java.io.IOException {
        java.lang.StringBuilder sb2;
        if (list.isEmpty()) {
            sb2 = sb;
        } else {
            sb2 = sb;
            defpackage.afga.bn(list, sb2, ", ", "<", ">", -1, "...", new defpackage.afwc(z2));
        }
        if (z) {
            sb2.append("?");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.CharSequence renderTypeArgumentsAndNullability$lambda$0(boolean z, defpackage.afjd afjdVar) {
        afjdVar.getClass();
        java.lang.String str = true != z ? "" : "(raw) ";
        java.util.Objects.toString(afjdVar);
        return str.concat(afjdVar.toString());
    }

    public final java.lang.String renderFunction(defpackage.afih<?> afihVar) throws java.io.IOException {
        afihVar.getClass();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        defpackage.afwf afwfVar = INSTANCE;
        afwfVar.appendContexts(sb, afihVar);
        sb.append("fun ");
        afwfVar.appendReceivers(sb, afihVar);
        afwfVar.appendName(sb, afihVar.getName());
        defpackage.afga.bn(defpackage.afjk.d(afihVar), sb, ", ", "(", ")", -1, "...", defpackage.afvz.INSTANCE);
        sb.append(": ");
        sb.append(renderType$default(afwfVar, afihVar.getReturnType(), false, 2, null));
        return sb.toString();
    }

    public final java.lang.String renderLambda(defpackage.afih<?> afihVar) throws java.io.IOException {
        afihVar.getClass();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator<T> it = afihVar.getParameters().iterator();
        boolean z = false;
        java.lang.Object obj = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z) {
                    break;
                }
                break;
            }
            java.lang.Object next = it.next();
            if (((defpackage.afir) next).getKind() == defpackage.afiq.c) {
                if (!z) {
                    z = true;
                    obj = next;
                }
            }
            obj = null;
            break;
        }
        defpackage.afir afirVar = (defpackage.afir) obj;
        if (afirVar != null) {
            sb.append(renderType$default(INSTANCE, afirVar.getType(), false, 2, null));
            sb.append(".");
        }
        defpackage.afga.bn(defpackage.afjk.d(afihVar), sb, ", ", "(", ")", -1, "...", defpackage.afwa.INSTANCE);
        sb.append(" -> ");
        sb.append(renderType$default(INSTANCE, afihVar.getReturnType(), false, 2, null));
        return sb.toString();
    }

    public final java.lang.String renderParameter(defpackage.afir afirVar) {
        afirVar.getClass();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int iOrdinal = afirVar.getKind().ordinal();
        if (iOrdinal == 0) {
            sb.append("instance parameter");
        } else if (iOrdinal == 1) {
            sb.append("context parameter ".concat(java.lang.String.valueOf(afirVar.getName())));
        } else if (iOrdinal == 2) {
            sb.append("extension receiver parameter");
        } else {
            if (iOrdinal != 3) {
                throw new defpackage.afas();
            }
            sb.append("parameter #" + afirVar.getIndex() + ' ' + afirVar.getName());
        }
        sb.append(" of ");
        sb.append(INSTANCE.renderCallable(((defpackage.afvl) afirVar).getCallable()));
        return sb.toString();
    }

    public final java.lang.String renderProperty(defpackage.afja<?> afjaVar) throws java.io.IOException {
        afjaVar.getClass();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        defpackage.afwf afwfVar = INSTANCE;
        afwfVar.appendContexts(sb, afjaVar);
        sb.append(true != (afjaVar instanceof defpackage.afip) ? "val " : "var ");
        afwfVar.appendReceivers(sb, afjaVar);
        afwfVar.appendName(sb, afjaVar.getName());
        sb.append(": ");
        sb.append(renderType$default(afwfVar, afjaVar.getReturnType(), false, 2, null));
        return sb.toString();
    }

    public final java.lang.String renderType(defpackage.afjb afjbVar, boolean z) throws java.io.IOException {
        afjbVar.getClass();
        defpackage.airc aircVar = (defpackage.airc) afjbVar;
        if (aircVar.isRawType()) {
            defpackage.airc aircVarLowerBoundIfFlexible = aircVar.lowerBoundIfFlexible();
            aircVarLowerBoundIfFlexible.getClass();
            return renderType(aircVarLowerBoundIfFlexible, true);
        }
        defpackage.airc aircVarLowerBoundIfFlexible2 = aircVar.lowerBoundIfFlexible();
        defpackage.airc aircVarUpperBoundIfFlexible = aircVar.upperBoundIfFlexible();
        if (aircVarLowerBoundIfFlexible2 != null && aircVarUpperBoundIfFlexible != null) {
            return renderFlexibleType(renderType$default(this, aircVarLowerBoundIfFlexible2, false, 2, null), renderType$default(this, aircVarUpperBoundIfFlexible, false, 2, null));
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        defpackage.afjb abbreviation = aircVar.getAbbreviation();
        if (abbreviation != null) {
            sb.append(abbreviation);
            sb.append(" /* = ");
        }
        defpackage.afif classifier = afjbVar.getClassifier();
        if (classifier instanceof defpackage.afjc) {
            INSTANCE.appendName(sb, ((defpackage.afjc) classifier).getName());
            if (afjbVar.isMarkedNullable()) {
                sb.append("?");
            } else if (aircVar.isDefinitelyNotNullType()) {
                sb.append(" & Any");
            }
        } else if (classifier instanceof defpackage.afie) {
            defpackage.afwf afwfVar = INSTANCE;
            defpackage.afie<?> afieVar = (defpackage.afie) classifier;
            defpackage.ahoh typeClassFqName = afwfVar.getTypeClassFqName(aircVar, afieVar);
            if (typeClassFqName == null) {
                typeClassFqName = new defpackage.ahoh(defpackage.afjr.h(afieVar));
            }
            defpackage.ahoh ahohVar = typeClassFqName;
            if (!defpackage.afyy.isNumberedFunctionClassFqName(ahohVar) || afjbVar.getArguments().contains(defpackage.afjd.a)) {
                afwfVar.renderSimpleType(sb, afieVar, ahohVar, afjbVar.getArguments(), afjbVar.isMarkedNullable(), z);
            } else {
                afwfVar.renderFunctionType(sb, aircVar);
            }
        } else if (classifier instanceof defpackage.afsu) {
            defpackage.afga.bn(((defpackage.afsu) classifier).getFqName().pathSegments(), sb, ".", "", "", -1, "...", defpackage.afwb.INSTANCE);
            INSTANCE.renderTypeArgumentsAndNullability(sb, afjbVar.getArguments(), afjbVar.isMarkedNullable(), z);
        } else {
            sb.append("???");
        }
        if (aircVar.getAbbreviation() != null) {
            sb.append(" */");
        }
        return sb.toString();
    }
}
