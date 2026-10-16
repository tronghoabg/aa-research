package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aijc {
    private final boolean allowedTypeVariable;
    private int argumentsDepth;
    private final boolean isDnnTypesEqualToFlexible;
    private final boolean isErrorTypeEqualsToAnything;
    private final boolean isStubTypeEqualsToAnything;
    private final defpackage.aige kotlinTypePreparator;
    private final defpackage.aigg kotlinTypeRefiner;
    private java.util.ArrayDeque<defpackage.aimx> supertypesDeque;
    private boolean supertypesLocked;
    private java.util.Set<defpackage.aimx> supertypesSet;
    private final defpackage.aing typeSystemContext;

    public aijc(boolean z, boolean z2, boolean z3, boolean z4, defpackage.aing aingVar, defpackage.aige aigeVar, defpackage.aigg aiggVar) {
        aingVar.getClass();
        aigeVar.getClass();
        aiggVar.getClass();
        this.isErrorTypeEqualsToAnything = z;
        this.isStubTypeEqualsToAnything = z2;
        this.isDnnTypesEqualToFlexible = z3;
        this.allowedTypeVariable = z4;
        this.typeSystemContext = aingVar;
        this.kotlinTypePreparator = aigeVar;
        this.kotlinTypeRefiner = aiggVar;
    }

    public static /* synthetic */ java.lang.Boolean addSubtypeConstraint$default(defpackage.aijc aijcVar, defpackage.aimw aimwVar, defpackage.aimw aimwVar2, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addSubtypeConstraint");
        }
        aijcVar.addSubtypeConstraint(aimwVar, aimwVar2, z & ((i & 4) == 0));
        return null;
    }

    public java.lang.Boolean addSubtypeConstraint(defpackage.aimw aimwVar, defpackage.aimw aimwVar2, boolean z) {
        aimwVar.getClass();
        aimwVar2.getClass();
        return null;
    }

    public final void clear() {
        java.util.ArrayDeque<defpackage.aimx> arrayDeque = this.supertypesDeque;
        arrayDeque.getClass();
        arrayDeque.clear();
        java.util.Set<defpackage.aimx> set = this.supertypesSet;
        set.getClass();
        set.clear();
        this.supertypesLocked = false;
    }

    public final java.lang.Boolean customIsSubtypeOf(defpackage.aimw aimwVar, defpackage.aimw aimwVar2) {
        aimwVar.getClass();
        aimwVar2.getClass();
        defpackage.affg<defpackage.aimw, defpackage.aimw, java.lang.Boolean> customSubtypingCallback = this.typeSystemContext.getCustomSubtypingCallback();
        if (customSubtypingCallback != null) {
            return customSubtypingCallback.invoke(aimwVar, aimwVar2);
        }
        return null;
    }

    public final defpackage.aige getKotlinTypePreparator() {
        return this.kotlinTypePreparator;
    }

    public defpackage.aiiw getLowerCapturedTypePolicy(defpackage.aimx aimxVar, defpackage.aims aimsVar) {
        aimxVar.getClass();
        aimsVar.getClass();
        return defpackage.aiiw.CHECK_SUBTYPE_AND_LOWER;
    }

    public final java.util.ArrayDeque<defpackage.aimx> getSupertypesDeque() {
        return this.supertypesDeque;
    }

    public final java.util.Set<defpackage.aimx> getSupertypesSet() {
        return this.supertypesSet;
    }

    public final defpackage.aing getTypeSystemContext() {
        return this.typeSystemContext;
    }

    public final void initialize() {
        this.supertypesLocked = true;
        if (this.supertypesDeque == null) {
            this.supertypesDeque = new java.util.ArrayDeque<>(4);
        }
        if (this.supertypesSet == null) {
            this.supertypesSet = defpackage.aiqv.Companion.create();
        }
    }

    public final boolean isAllowedTypeVariable(defpackage.aimw aimwVar) {
        aimwVar.getClass();
        return this.allowedTypeVariable && this.typeSystemContext.isTypeVariableType(aimwVar);
    }

    public final boolean isDnnTypesEqualToFlexible() {
        return this.isDnnTypesEqualToFlexible;
    }

    public final boolean isErrorTypeEqualsToAnything() {
        return this.isErrorTypeEqualsToAnything;
    }

    public final boolean isStubTypeEqualsToAnything() {
        return this.isStubTypeEqualsToAnything;
    }

    public final defpackage.aimw prepareType(defpackage.aimw aimwVar) {
        aimwVar.getClass();
        return this.kotlinTypePreparator.prepareType(aimwVar);
    }

    public final defpackage.aimw refineType(defpackage.aimw aimwVar) {
        aimwVar.getClass();
        return this.kotlinTypeRefiner.refineType(aimwVar);
    }

    public boolean runForkingPoint(defpackage.affc<? super defpackage.aiiv, defpackage.afbk> affcVar) {
        affcVar.getClass();
        defpackage.aiiu aiiuVar = new defpackage.aiiu();
        affcVar.invoke(aiiuVar);
        return aiiuVar.getResult();
    }
}
