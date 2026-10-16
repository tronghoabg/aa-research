package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class afvf {
    public static final afvf INSTANCE = new afvf();

    private afvf() {
    }

    private final void appendContexts(StringBuilder sb, afhd<?> afhdVar) throws IOException {
        afhdVar.getClass();
        List<afhr> parameters = afhdVar.getParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : parameters) {
            if (((afhr) obj).getKind() == afhq.b) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        woy.ct(arrayList, sb, ", ", "context(", ") ", -1, "...", afuy.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence appendContexts$lambda$0(afhr afhrVar) {
        afhrVar.getClass();
        StringBuilder sb = new StringBuilder();
        String name = afhrVar.getName();
        if (name == null) {
            name = "_";
        }
        sb.append(name);
        sb.append(": ");
        sb.append(afhrVar.getType());
        return sb.toString();
    }

    private final void appendName(StringBuilder sb, String str) {
        sb.append(ahnk.render$default(ahnj.identifier(str), false, 1, null));
    }

    private final StringBuilder appendReceiverType(StringBuilder sb, afhr afhrVar) {
        sb.append(renderType$default(this, afhrVar.getType(), false, 2, null));
        sb.append(".");
        sb.getClass();
        return sb;
    }

    private final void appendReceivers(StringBuilder sb, afhd<?> afhdVar) {
        afhdVar.getClass();
        List<afhr> allParameters = ((afue) afhdVar).getAllParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : allParameters) {
            afhr afhrVar = (afhr) obj;
            if (afhrVar.getKind() == afhq.a || afhrVar.getKind() == afhq.c) {
                arrayList.add(obj);
            }
        }
        afhr afhrVar2 = (afhr) woy.bI(arrayList, 0);
        if (afhrVar2 != null) {
            INSTANCE.appendReceiverType(sb, afhrVar2);
        }
        afhr afhrVar3 = (afhr) woy.bI(arrayList, 1);
        if (afhrVar3 != null) {
            afvf afvfVar = INSTANCE;
            sb.append("(");
            sb.getClass();
            afvfVar.appendReceiverType(sb, afhrVar3);
            sb.append(")");
        }
    }

    private final ahnh getTypeClassFqName(aiqc aiqcVar, afhe<?> afheVar) {
        if (aiqcVar.isNothingType()) {
            return afyn.nothing;
        }
        afhe<?> mutableCollectionClass = aiqcVar.getMutableCollectionClass();
        if (mutableCollectionClass != null) {
            afheVar = mutableCollectionClass;
        }
        String qualifiedName = afheVar.getQualifiedName();
        if (qualifiedName != null) {
            return new ahnh(qualifiedName);
        }
        return null;
    }

    private final String renderCallable(afhd<?> afhdVar) {
        if (afhdVar instanceof afia) {
            return renderProperty((afia) afhdVar);
        }
        if (afhdVar instanceof afhh) {
            return renderFunction((afhh) afhdVar);
        }
        Objects.toString(afhdVar);
        throw new IllegalStateException("Illegal callable: ".concat(String.valueOf(afhdVar)));
    }

    private final String renderFlexibleType(String str, String str2) {
        if (affa.f(str, afyh.J(str2, "?", ""))) {
            return afyh.J(str2, "?", "!");
        }
        if (afyh.e(str2, "?", false)) {
            if (affa.f(str + '?', str2)) {
                return str + '!';
            }
        }
        if (affa.f("(" + str + ")?", str2)) {
            return "(" + str + ")!";
        }
        String strRenderFlexibleMutabilityOrArrayElementVarianceType$default = ahsi.renderFlexibleMutabilityOrArrayElementVarianceType$default(str, str2, new afvd(str), new afve(str), null, 16, null);
        if (strRenderFlexibleMutabilityOrArrayElementVarianceType$default != null) {
            return strRenderFlexibleMutabilityOrArrayElementVarianceType$default;
        }
        return "(" + str + ".." + str2 + ')';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String renderFlexibleType$lambda$0(String str) {
        String str2 = afyo.COLLECTIONS_PACKAGE_FQ_NAME.asString() + '.';
        if (true != afyh.g(str, str2, false)) {
            str2 = null;
        }
        return str2 == null ? "" : str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String renderFlexibleType$lambda$1(String str) {
        String str2 = afyo.BUILT_INS_PACKAGE_FQ_NAME.asString() + '.';
        if (true != afyh.g(str, str2, false)) {
            str2 = null;
        }
        return str2 == null ? "" : str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence renderFunction$lambda$0$0(afhr afhrVar) {
        afhrVar.getClass();
        return renderType$default(INSTANCE, afhrVar.getType(), false, 2, null);
    }

    private final void renderFunctionType(StringBuilder sb, aiqc aiqcVar) throws IOException {
        if (aiqcVar.isMarkedNullable()) {
            sb.append("(");
        }
        if (aiqcVar.isSuspendFunctionType()) {
            sb.append("suspend ");
        }
        woy.ct(woy.bS(aiqcVar.getArguments(), 1), sb, ", ", "(", ") -> ", -1, "...", null);
        sb.append(woy.bK(aiqcVar.getArguments()));
        if (aiqcVar.isMarkedNullable()) {
            sb.append(")?");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence renderLambda$lambda$0$1(afhr afhrVar) {
        afhrVar.getClass();
        return renderType$default(INSTANCE, afhrVar.getType(), false, 2, null);
    }

    private final void renderSimpleType(StringBuilder sb, afhe<?> afheVar, ahnh ahnhVar, List<afid> list, boolean z, boolean z2) throws IOException {
        afvf afvfVar;
        StringBuilder sb2;
        boolean z3;
        if (afheVar.getTypeParameters().size() >= list.size() || affa.h(afheVar).getDeclaringClass() == null) {
            afvfVar = this;
            sb2 = sb;
            z3 = z2;
            sb2.append(ahnk.render(ahnhVar));
        } else {
            Class<?> declaringClass = affa.h(afheVar).getDeclaringClass();
            declaringClass.getClass();
            afvfVar = this;
            sb2 = sb;
            z3 = z2;
            afvfVar.renderSimpleType(sb2, affa.l(declaringClass), ahnhVar.parent(), woy.bR(list, afheVar.getTypeParameters().size()), false, z3);
            sb2.append(".");
            sb2.append(ahnk.render$default(ahnhVar.shortName(), false, 1, null));
        }
        afvfVar.renderTypeArgumentsAndNullability(sb2, woy.cd(list, afheVar.getTypeParameters().size()), z, z3);
    }

    public static /* synthetic */ String renderType$default(afvf afvfVar, afib afibVar, boolean z, int i, Object obj) {
        return afvfVar.renderType(afibVar, z & ((i & 2) == 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence renderType$lambda$0$1(ahnj ahnjVar) {
        ahnjVar.getClass();
        return ahnk.render$default(ahnjVar, false, 1, null);
    }

    private final void renderTypeArgumentsAndNullability(StringBuilder sb, List<afid> list, boolean z, boolean z2) throws IOException {
        StringBuilder sb2;
        if (list.isEmpty()) {
            sb2 = sb;
        } else {
            sb2 = sb;
            woy.ct(list, sb2, ", ", "<", ">", -1, "...", new afvc(z2));
        }
        if (z) {
            sb2.append("?");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence renderTypeArgumentsAndNullability$lambda$0(boolean z, afid afidVar) {
        afidVar.getClass();
        String str = true != z ? "" : "(raw) ";
        Objects.toString(afidVar);
        return str.concat(afidVar.toString());
    }

    public final String renderFunction(afhh<?> afhhVar) throws IOException {
        afhhVar.getClass();
        StringBuilder sb = new StringBuilder();
        afvf afvfVar = INSTANCE;
        afvfVar.appendContexts(sb, afhhVar);
        sb.append("fun ");
        afvfVar.appendReceivers(sb, afhhVar);
        afvfVar.appendName(sb, afhhVar.getName());
        woy.ct(afir.d(afhhVar), sb, ", ", "(", ")", -1, "...", afuz.INSTANCE);
        sb.append(": ");
        sb.append(renderType$default(afvfVar, afhhVar.getReturnType(), false, 2, null));
        return sb.toString();
    }

    public final String renderLambda(afhh<?> afhhVar) throws IOException {
        afhhVar.getClass();
        StringBuilder sb = new StringBuilder();
        Iterator<T> it = afhhVar.getParameters().iterator();
        boolean z = false;
        Object obj = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z) {
                    break;
                }
            } else {
                Object next = it.next();
                if (((afhr) next).getKind() == afhq.c) {
                    if (z) {
                        break;
                    }
                    z = true;
                    obj = next;
                }
            }
        }
        obj = null;
        afhr afhrVar = (afhr) obj;
        if (afhrVar != null) {
            sb.append(renderType$default(INSTANCE, afhrVar.getType(), false, 2, null));
            sb.append(".");
        }
        woy.ct(afir.d(afhhVar), sb, ", ", "(", ")", -1, "...", afva.INSTANCE);
        sb.append(" -> ");
        sb.append(renderType$default(INSTANCE, afhhVar.getReturnType(), false, 2, null));
        return sb.toString();
    }

    public final String renderParameter(afhr afhrVar) {
        afhrVar.getClass();
        StringBuilder sb = new StringBuilder();
        int iOrdinal = afhrVar.getKind().ordinal();
        if (iOrdinal == 0) {
            sb.append("instance parameter");
        } else if (iOrdinal == 1) {
            sb.append("context parameter ".concat(String.valueOf(afhrVar.getName())));
        } else if (iOrdinal == 2) {
            sb.append("extension receiver parameter");
        } else {
            if (iOrdinal != 3) {
                throw new aezs();
            }
            sb.append("parameter #" + afhrVar.getIndex() + ' ' + afhrVar.getName());
        }
        sb.append(" of ");
        sb.append(INSTANCE.renderCallable(((aful) afhrVar).getCallable()));
        return sb.toString();
    }

    public final String renderProperty(afia<?> afiaVar) throws IOException {
        afiaVar.getClass();
        StringBuilder sb = new StringBuilder();
        afvf afvfVar = INSTANCE;
        afvfVar.appendContexts(sb, afiaVar);
        sb.append(true != (afiaVar instanceof afhp) ? "val " : "var ");
        afvfVar.appendReceivers(sb, afiaVar);
        afvfVar.appendName(sb, afiaVar.getName());
        sb.append(": ");
        sb.append(renderType$default(afvfVar, afiaVar.getReturnType(), false, 2, null));
        return sb.toString();
    }

    public final String renderType(afib afibVar, boolean z) throws IOException {
        afibVar.getClass();
        aiqc aiqcVar = (aiqc) afibVar;
        if (aiqcVar.isRawType()) {
            aiqc aiqcVarLowerBoundIfFlexible = aiqcVar.lowerBoundIfFlexible();
            aiqcVarLowerBoundIfFlexible.getClass();
            return renderType(aiqcVarLowerBoundIfFlexible, true);
        }
        aiqc aiqcVarLowerBoundIfFlexible2 = aiqcVar.lowerBoundIfFlexible();
        aiqc aiqcVarUpperBoundIfFlexible = aiqcVar.upperBoundIfFlexible();
        if (aiqcVarLowerBoundIfFlexible2 != null && aiqcVarUpperBoundIfFlexible != null) {
            return renderFlexibleType(renderType$default(this, aiqcVarLowerBoundIfFlexible2, false, 2, null), renderType$default(this, aiqcVarUpperBoundIfFlexible, false, 2, null));
        }
        StringBuilder sb = new StringBuilder();
        afib abbreviation = aiqcVar.getAbbreviation();
        if (abbreviation != null) {
            sb.append(abbreviation);
            sb.append(" /* = ");
        }
        afhf classifier = afibVar.getClassifier();
        if (classifier instanceof afic) {
            INSTANCE.appendName(sb, ((afic) classifier).getName());
            if (afibVar.isMarkedNullable()) {
                sb.append("?");
            } else if (aiqcVar.isDefinitelyNotNullType()) {
                sb.append(" & Any");
            }
        } else if (classifier instanceof afhe) {
            afvf afvfVar = INSTANCE;
            afhe<?> afheVar = (afhe) classifier;
            ahnh typeClassFqName = afvfVar.getTypeClassFqName(aiqcVar, afheVar);
            if (typeClassFqName == null) {
                typeClassFqName = new ahnh(afir.g(afheVar));
            }
            ahnh ahnhVar = typeClassFqName;
            if (!afxy.isNumberedFunctionClassFqName(ahnhVar) || afibVar.getArguments().contains(afid.a)) {
                afvfVar.renderSimpleType(sb, afheVar, ahnhVar, afibVar.getArguments(), afibVar.isMarkedNullable(), z);
            } else {
                afvfVar.renderFunctionType(sb, aiqcVar);
            }
        } else if (classifier instanceof afru) {
            woy.ct(((afru) classifier).getFqName().pathSegments(), sb, ".", "", "", -1, "...", afvb.INSTANCE);
            INSTANCE.renderTypeArgumentsAndNullability(sb, afibVar.getArguments(), afibVar.isMarkedNullable(), z);
        } else {
            sb.append("???");
        }
        if (aiqcVar.getAbbreviation() != null) {
            sb.append(" */");
        }
        return sb.toString();
    }
}
