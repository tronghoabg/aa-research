package defpackage;

import java.util.ArrayDeque;
import java.util.Set;

/* loaded from: classes3.dex */
public final class aiic {
    private final boolean allowedTypeVariable;
    private int argumentsDepth;
    private final boolean isDnnTypesEqualToFlexible;
    private final boolean isErrorTypeEqualsToAnything;
    private final boolean isStubTypeEqualsToAnything;
    private final aife kotlinTypePreparator;
    private final aifg kotlinTypeRefiner;
    private ArrayDeque<ailx> supertypesDeque;
    private boolean supertypesLocked;
    private Set<ailx> supertypesSet;
    private final aimg typeSystemContext;

    public aiic(boolean z, boolean z2, boolean z3, boolean z4, aimg aimgVar, aife aifeVar, aifg aifgVar) {
        aimgVar.getClass();
        aifeVar.getClass();
        aifgVar.getClass();
        this.isErrorTypeEqualsToAnything = z;
        this.isStubTypeEqualsToAnything = z2;
        this.isDnnTypesEqualToFlexible = z3;
        this.allowedTypeVariable = z4;
        this.typeSystemContext = aimgVar;
        this.kotlinTypePreparator = aifeVar;
        this.kotlinTypeRefiner = aifgVar;
    }

    public static /* synthetic */ Boolean addSubtypeConstraint$default(aiic aiicVar, ailw ailwVar, ailw ailwVar2, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addSubtypeConstraint");
        }
        aiicVar.addSubtypeConstraint(ailwVar, ailwVar2, z & ((i & 4) == 0));
        return null;
    }

    public Boolean addSubtypeConstraint(ailw ailwVar, ailw ailwVar2, boolean z) {
        ailwVar.getClass();
        ailwVar2.getClass();
        return null;
    }

    public final void clear() {
        ArrayDeque<ailx> arrayDeque = this.supertypesDeque;
        arrayDeque.getClass();
        arrayDeque.clear();
        Set<ailx> set = this.supertypesSet;
        set.getClass();
        set.clear();
        this.supertypesLocked = false;
    }

    public final Boolean customIsSubtypeOf(ailw ailwVar, ailw ailwVar2) {
        ailwVar.getClass();
        ailwVar2.getClass();
        afeg<ailw, ailw, Boolean> customSubtypingCallback = this.typeSystemContext.getCustomSubtypingCallback();
        if (customSubtypingCallback != null) {
            return customSubtypingCallback.invoke(ailwVar, ailwVar2);
        }
        return null;
    }

    public final aife getKotlinTypePreparator() {
        return this.kotlinTypePreparator;
    }

    public aihw getLowerCapturedTypePolicy(ailx ailxVar, ails ailsVar) {
        ailxVar.getClass();
        ailsVar.getClass();
        return aihw.CHECK_SUBTYPE_AND_LOWER;
    }

    public final ArrayDeque<ailx> getSupertypesDeque() {
        return this.supertypesDeque;
    }

    public final Set<ailx> getSupertypesSet() {
        return this.supertypesSet;
    }

    public final aimg getTypeSystemContext() {
        return this.typeSystemContext;
    }

    public final void initialize() {
        this.supertypesLocked = true;
        if (this.supertypesDeque == null) {
            this.supertypesDeque = new ArrayDeque<>(4);
        }
        if (this.supertypesSet == null) {
            this.supertypesSet = aipv.Companion.create();
        }
    }

    public final boolean isAllowedTypeVariable(ailw ailwVar) {
        ailwVar.getClass();
        return this.allowedTypeVariable && this.typeSystemContext.isTypeVariableType(ailwVar);
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

    public final ailw prepareType(ailw ailwVar) {
        ailwVar.getClass();
        return this.kotlinTypePreparator.prepareType(ailwVar);
    }

    public final ailw refineType(ailw ailwVar) {
        ailwVar.getClass();
        return this.kotlinTypeRefiner.refineType(ailwVar);
    }

    public boolean runForkingPoint(afec<? super aihv, afak> afecVar) {
        afecVar.getClass();
        aihu aihuVar = new aihu();
        afecVar.invoke(aihuVar);
        return aihuVar.getResult();
    }
}
