package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ahse {
    public static final defpackage.ahse COMPACT;
    public static final defpackage.ahse COMPACT_WITHOUT_SUPERTYPES;
    public static final defpackage.ahse COMPACT_WITH_MODIFIERS;
    public static final defpackage.ahse COMPACT_WITH_SHORT_TYPES;
    public static final defpackage.ahsb Companion;
    public static final defpackage.ahse DEBUG_TEXT;
    public static final defpackage.ahse FQ_NAMES_IN_TYPES;
    public static final defpackage.ahse FQ_NAMES_IN_TYPES_WITH_ANNOTATIONS;
    public static final defpackage.ahse HTML;
    public static final defpackage.ahse ONLY_NAMES_WITH_SHORT_TYPES;
    public static final defpackage.ahse SHORT_NAMES_IN_TYPES;
    public static final defpackage.ahse WITHOUT_MODIFIERS;

    static {
        defpackage.ahsb ahsbVar = new defpackage.ahsb(null);
        Companion = ahsbVar;
        WITHOUT_MODIFIERS = ahsbVar.withOptions(defpackage.ahrq.INSTANCE);
        COMPACT_WITH_MODIFIERS = ahsbVar.withOptions(defpackage.ahrs.INSTANCE);
        COMPACT = ahsbVar.withOptions(defpackage.ahrt.INSTANCE);
        COMPACT_WITHOUT_SUPERTYPES = ahsbVar.withOptions(defpackage.ahru.INSTANCE);
        COMPACT_WITH_SHORT_TYPES = ahsbVar.withOptions(defpackage.ahrv.INSTANCE);
        ONLY_NAMES_WITH_SHORT_TYPES = ahsbVar.withOptions(defpackage.ahrw.INSTANCE);
        FQ_NAMES_IN_TYPES = ahsbVar.withOptions(defpackage.ahrx.INSTANCE);
        FQ_NAMES_IN_TYPES_WITH_ANNOTATIONS = ahsbVar.withOptions(defpackage.ahry.INSTANCE);
        SHORT_NAMES_IN_TYPES = ahsbVar.withOptions(defpackage.ahrz.INSTANCE);
        DEBUG_TEXT = ahsbVar.withOptions(defpackage.ahsa.INSTANCE);
        HTML = ahsbVar.withOptions(defpackage.ahrr.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afbk COMPACT$lambda$0(defpackage.ahst ahstVar) {
        ahstVar.getClass();
        ahstVar.setWithDefinedIn(false);
        ahstVar.setModifiers(defpackage.afcg.a);
        return defpackage.afbk.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afbk COMPACT_WITHOUT_SUPERTYPES$lambda$0(defpackage.ahst ahstVar) {
        ahstVar.getClass();
        ahstVar.setWithDefinedIn(false);
        ahstVar.setModifiers(defpackage.afcg.a);
        ahstVar.setWithoutSuperTypes(true);
        return defpackage.afbk.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afbk COMPACT_WITH_MODIFIERS$lambda$0(defpackage.ahst ahstVar) {
        ahstVar.getClass();
        ahstVar.setWithDefinedIn(false);
        return defpackage.afbk.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afbk COMPACT_WITH_SHORT_TYPES$lambda$0(defpackage.ahst ahstVar) {
        ahstVar.getClass();
        ahstVar.setModifiers(defpackage.afcg.a);
        ahstVar.setClassifierNamePolicy(defpackage.ahrn.INSTANCE);
        ahstVar.setParameterNameRenderingPolicy(defpackage.ahtc.ONLY_NON_SYNTHESIZED);
        return defpackage.afbk.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afbk DEBUG_TEXT$lambda$0(defpackage.ahst ahstVar) {
        ahstVar.getClass();
        ahstVar.setDebugMode(true);
        ahstVar.setClassifierNamePolicy(defpackage.ahrm.INSTANCE);
        ahstVar.setModifiers(defpackage.ahsr.ALL);
        return defpackage.afbk.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afbk FQ_NAMES_IN_TYPES$lambda$0(defpackage.ahst ahstVar) {
        ahstVar.getClass();
        ahstVar.setModifiers(defpackage.ahsr.ALL_EXCEPT_ANNOTATIONS);
        return defpackage.afbk.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afbk FQ_NAMES_IN_TYPES_WITH_ANNOTATIONS$lambda$0(defpackage.ahst ahstVar) {
        ahstVar.getClass();
        ahstVar.setModifiers(defpackage.ahsr.ALL);
        return defpackage.afbk.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afbk HTML$lambda$0(defpackage.ahst ahstVar) {
        ahstVar.getClass();
        ahstVar.setTextFormat(defpackage.ahtg.HTML);
        ahstVar.setModifiers(defpackage.ahsr.ALL);
        return defpackage.afbk.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afbk ONLY_NAMES_WITH_SHORT_TYPES$lambda$0(defpackage.ahst ahstVar) {
        ahstVar.getClass();
        ahstVar.setWithDefinedIn(false);
        ahstVar.setModifiers(defpackage.afcg.a);
        ahstVar.setClassifierNamePolicy(defpackage.ahrn.INSTANCE);
        ahstVar.setWithoutTypeParameters(true);
        ahstVar.setParameterNameRenderingPolicy(defpackage.ahtc.NONE);
        ahstVar.setReceiverAfterName(true);
        ahstVar.setRenderCompanionObjectName(true);
        ahstVar.setWithoutSuperTypes(true);
        ahstVar.setStartFromName(true);
        return defpackage.afbk.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afbk SHORT_NAMES_IN_TYPES$lambda$0(defpackage.ahst ahstVar) {
        ahstVar.getClass();
        ahstVar.setClassifierNamePolicy(defpackage.ahrn.INSTANCE);
        ahstVar.setParameterNameRenderingPolicy(defpackage.ahtc.ONLY_NON_SYNTHESIZED);
        return defpackage.afbk.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final defpackage.afbk WITHOUT_MODIFIERS$lambda$0(defpackage.ahst ahstVar) {
        ahstVar.getClass();
        ahstVar.setModifiers(defpackage.afcg.a);
        return defpackage.afbk.a;
    }

    public static /* synthetic */ java.lang.String renderAnnotation$default(defpackage.ahse ahseVar, defpackage.aggc aggcVar, defpackage.agge aggeVar, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renderAnnotation");
        }
        if ((i & 2) != 0) {
            aggeVar = null;
        }
        return ahseVar.renderAnnotation(aggcVar, aggeVar);
    }

    public abstract java.lang.String render(defpackage.agci agciVar);

    public abstract java.lang.String renderAnnotation(defpackage.aggc aggcVar, defpackage.agge aggeVar);

    public abstract java.lang.String renderFlexibleType(java.lang.String str, java.lang.String str2, defpackage.afze afzeVar);

    public abstract java.lang.String renderFqName(defpackage.ahoh ahohVar);

    public abstract java.lang.String renderName(defpackage.ahoj ahojVar, boolean z);

    public abstract java.lang.String renderType(defpackage.aihl aihlVar);

    public abstract java.lang.String renderTypeProjection(defpackage.aijn aijnVar);

    public final defpackage.ahse withOptions(defpackage.affc<? super defpackage.ahst, defpackage.afbk> affcVar) {
        affcVar.getClass();
        defpackage.ahsy ahsyVarCopy = defpackage.ahsu.copy(((defpackage.ahsp) this).getOptions());
        affcVar.invoke(ahsyVarCopy);
        ahsyVarCopy.lock();
        return new defpackage.ahsp(ahsyVarCopy);
    }
}
