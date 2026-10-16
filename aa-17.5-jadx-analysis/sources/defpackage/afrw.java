package defpackage;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class afrw {
    private static final afrj getContainerOfDeserializedMember(aibw aibwVar) {
        Class<?> klass;
        aibv containerSource = aibwVar.getContainerSource();
        if (!(containerSource instanceof aher)) {
            if (containerSource instanceof afuc) {
                return ((afuc) containerSource).getContainer();
            }
            if (containerSource instanceof afit) {
                return afmo.INSTANCE;
            }
            Objects.toString(aibwVar);
            throw new aftw("Container of deserialized member is not resolved: ".concat(String.valueOf(aibwVar)));
        }
        aher aherVar = (aher) containerSource;
        ahfj knownJvmBinaryClass = aherVar.getKnownJvmBinaryClass();
        agjk agjkVar = knownJvmBinaryClass instanceof agjk ? (agjk) knownJvmBinaryClass : null;
        if (agjkVar != null && (klass = agjkVar.getKlass()) != null) {
            afhg afhgVarC = affw.c(klass);
            afhgVarC.getClass();
            return (afrt) afhgVarC;
        }
        throw new aftw("Container of top-level deserialized member is not resolved: " + aibwVar + " (" + aherVar.getKnownJvmBinaryClass());
    }

    public static final afrx toContainer(agee ageeVar) {
        afrj containerOfDeserializedMember;
        ageeVar.getClass();
        agbi containingDeclaration = ageeVar.getContainingDeclaration();
        containingDeclaration.getClass();
        if (containingDeclaration instanceof agba) {
            return toKClassImpl((agba) containingDeclaration);
        }
        if (!(containingDeclaration instanceof agax)) {
            Objects.toString(containingDeclaration);
            throw new aftw("Unknown type parameter container: ".concat(containingDeclaration.toString()));
        }
        agbi containingDeclaration2 = ((agax) containingDeclaration).getContainingDeclaration();
        containingDeclaration2.getClass();
        if (containingDeclaration2 instanceof agba) {
            containerOfDeserializedMember = toKClassImpl((agba) containingDeclaration2);
        } else {
            aibw aibwVar = containingDeclaration instanceof aibw ? (aibw) containingDeclaration : null;
            if (aibwVar == null) {
                Objects.toString(containingDeclaration);
                throw new aftw("Non-class callable descriptor must be deserialized: ".concat(containingDeclaration.toString()));
            }
            containerOfDeserializedMember = getContainerOfDeserializedMember(aibwVar);
        }
        Object objAccept = containingDeclaration.accept(new afkb(containerOfDeserializedMember), afak.a);
        objAccept.getClass();
        return (afrx) objAccept;
    }

    private static final afqw<?> toKClassImpl(agba agbaVar) {
        Class<?> javaClass = afvu.toJavaClass(agbaVar);
        afqw<?> afqwVar = (afqw) (javaClass != null ? affa.l(javaClass) : null);
        if (afqwVar != null) {
            return afqwVar;
        }
        agbi containingDeclaration = agbaVar.getContainingDeclaration();
        Objects.toString(containingDeclaration);
        throw new aftw("Type parameter container is not resolved: ".concat(String.valueOf(containingDeclaration)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afie toKVariance(aijg aijgVar) {
        aijg aijgVar2 = aijg.INVARIANT;
        int iOrdinal = aijgVar.ordinal();
        if (iOrdinal == 0) {
            return afie.a;
        }
        if (iOrdinal == 1) {
            return afie.b;
        }
        if (iOrdinal == 2) {
            return afie.c;
        }
        throw new aezs();
    }
}
