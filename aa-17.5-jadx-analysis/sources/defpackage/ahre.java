package defpackage;

/* loaded from: classes3.dex */
public abstract class ahre {
    public static final ahre COMPACT;
    public static final ahre COMPACT_WITHOUT_SUPERTYPES;
    public static final ahre COMPACT_WITH_MODIFIERS;
    public static final ahre COMPACT_WITH_SHORT_TYPES;
    public static final ahrb Companion;
    public static final ahre DEBUG_TEXT;
    public static final ahre FQ_NAMES_IN_TYPES;
    public static final ahre FQ_NAMES_IN_TYPES_WITH_ANNOTATIONS;
    public static final ahre HTML;
    public static final ahre ONLY_NAMES_WITH_SHORT_TYPES;
    public static final ahre SHORT_NAMES_IN_TYPES;
    public static final ahre WITHOUT_MODIFIERS;

    static {
        ahrb ahrbVar = new ahrb(null);
        Companion = ahrbVar;
        WITHOUT_MODIFIERS = ahrbVar.withOptions(ahqq.INSTANCE);
        COMPACT_WITH_MODIFIERS = ahrbVar.withOptions(ahqs.INSTANCE);
        COMPACT = ahrbVar.withOptions(ahqt.INSTANCE);
        COMPACT_WITHOUT_SUPERTYPES = ahrbVar.withOptions(ahqu.INSTANCE);
        COMPACT_WITH_SHORT_TYPES = ahrbVar.withOptions(ahqv.INSTANCE);
        ONLY_NAMES_WITH_SHORT_TYPES = ahrbVar.withOptions(ahqw.INSTANCE);
        FQ_NAMES_IN_TYPES = ahrbVar.withOptions(ahqx.INSTANCE);
        FQ_NAMES_IN_TYPES_WITH_ANNOTATIONS = ahrbVar.withOptions(ahqy.INSTANCE);
        SHORT_NAMES_IN_TYPES = ahrbVar.withOptions(ahqz.INSTANCE);
        DEBUG_TEXT = ahrbVar.withOptions(ahra.INSTANCE);
        HTML = ahrbVar.withOptions(ahqr.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak COMPACT$lambda$0(ahrt ahrtVar) {
        ahrtVar.getClass();
        ahrtVar.setWithDefinedIn(false);
        ahrtVar.setModifiers(afbg.a);
        return afak.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak COMPACT_WITHOUT_SUPERTYPES$lambda$0(ahrt ahrtVar) {
        ahrtVar.getClass();
        ahrtVar.setWithDefinedIn(false);
        ahrtVar.setModifiers(afbg.a);
        ahrtVar.setWithoutSuperTypes(true);
        return afak.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak COMPACT_WITH_MODIFIERS$lambda$0(ahrt ahrtVar) {
        ahrtVar.getClass();
        ahrtVar.setWithDefinedIn(false);
        return afak.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak COMPACT_WITH_SHORT_TYPES$lambda$0(ahrt ahrtVar) {
        ahrtVar.getClass();
        ahrtVar.setModifiers(afbg.a);
        ahrtVar.setClassifierNamePolicy(ahqn.INSTANCE);
        ahrtVar.setParameterNameRenderingPolicy(ahsc.ONLY_NON_SYNTHESIZED);
        return afak.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak DEBUG_TEXT$lambda$0(ahrt ahrtVar) {
        ahrtVar.getClass();
        ahrtVar.setDebugMode(true);
        ahrtVar.setClassifierNamePolicy(ahqm.INSTANCE);
        ahrtVar.setModifiers(ahrr.ALL);
        return afak.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak FQ_NAMES_IN_TYPES$lambda$0(ahrt ahrtVar) {
        ahrtVar.getClass();
        ahrtVar.setModifiers(ahrr.ALL_EXCEPT_ANNOTATIONS);
        return afak.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak FQ_NAMES_IN_TYPES_WITH_ANNOTATIONS$lambda$0(ahrt ahrtVar) {
        ahrtVar.getClass();
        ahrtVar.setModifiers(ahrr.ALL);
        return afak.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak HTML$lambda$0(ahrt ahrtVar) {
        ahrtVar.getClass();
        ahrtVar.setTextFormat(ahsg.HTML);
        ahrtVar.setModifiers(ahrr.ALL);
        return afak.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak ONLY_NAMES_WITH_SHORT_TYPES$lambda$0(ahrt ahrtVar) {
        ahrtVar.getClass();
        ahrtVar.setWithDefinedIn(false);
        ahrtVar.setModifiers(afbg.a);
        ahrtVar.setClassifierNamePolicy(ahqn.INSTANCE);
        ahrtVar.setWithoutTypeParameters(true);
        ahrtVar.setParameterNameRenderingPolicy(ahsc.NONE);
        ahrtVar.setReceiverAfterName(true);
        ahrtVar.setRenderCompanionObjectName(true);
        ahrtVar.setWithoutSuperTypes(true);
        ahrtVar.setStartFromName(true);
        return afak.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak SHORT_NAMES_IN_TYPES$lambda$0(ahrt ahrtVar) {
        ahrtVar.getClass();
        ahrtVar.setClassifierNamePolicy(ahqn.INSTANCE);
        ahrtVar.setParameterNameRenderingPolicy(ahsc.ONLY_NON_SYNTHESIZED);
        return afak.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak WITHOUT_MODIFIERS$lambda$0(ahrt ahrtVar) {
        ahrtVar.getClass();
        ahrtVar.setModifiers(afbg.a);
        return afak.a;
    }

    public static /* synthetic */ String renderAnnotation$default(ahre ahreVar, agfc agfcVar, agfe agfeVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renderAnnotation");
        }
        if ((i & 2) != 0) {
            agfeVar = null;
        }
        return ahreVar.renderAnnotation(agfcVar, agfeVar);
    }

    public abstract String render(agbi agbiVar);

    public abstract String renderAnnotation(agfc agfcVar, agfe agfeVar);

    public abstract String renderFlexibleType(String str, String str2, afye afyeVar);

    public abstract String renderFqName(ahnh ahnhVar);

    public abstract String renderName(ahnj ahnjVar, boolean z);

    public abstract String renderType(aigl aiglVar);

    public abstract String renderTypeProjection(aiin aiinVar);

    public final ahre withOptions(afec<? super ahrt, afak> afecVar) {
        afecVar.getClass();
        ahry ahryVarCopy = ahru.copy(((ahrp) this).getOptions());
        afecVar.invoke(ahryVarCopy);
        ahryVarCopy.lock();
        return new ahrp(ahryVarCopy);
    }
}
