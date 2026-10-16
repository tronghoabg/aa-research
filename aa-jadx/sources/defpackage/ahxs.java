package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahxs {
    private ahxs() {
    }

    public static final java.lang.String a(int i) {
        return defpackage.afga.cx(((long) i) & 4294967295L, 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.List<defpackage.ahxr> getDEBUG_MASK_BIT_NAMES() {
        return (java.util.List) defpackage.ahxt.DEBUG_MASK_BIT_NAMES$delegate.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.List<defpackage.ahxr> getDEBUG_PREDEFINED_FILTERS_MASK_NAMES() {
        return (java.util.List) defpackage.ahxt.DEBUG_PREDEFINED_FILTERS_MASK_NAMES$delegate.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int nextMask() {
        int i = defpackage.ahxt.nextMaskValue;
        int i2 = defpackage.ahxt.nextMaskValue;
        defpackage.ahxt.nextMaskValue = i2 + i2;
        return i;
    }

    public final int getALL_KINDS_MASK() {
        return defpackage.ahxt.ALL_KINDS_MASK;
    }

    public final int getCLASSIFIERS_MASK() {
        return defpackage.ahxt.CLASSIFIERS_MASK;
    }

    public final int getFUNCTIONS_MASK() {
        return defpackage.ahxt.FUNCTIONS_MASK;
    }

    public final int getNON_SINGLETON_CLASSIFIERS_MASK() {
        return defpackage.ahxt.NON_SINGLETON_CLASSIFIERS_MASK;
    }

    public final int getPACKAGES_MASK() {
        return defpackage.ahxt.PACKAGES_MASK;
    }

    public final int getSINGLETON_CLASSIFIERS_MASK() {
        return defpackage.ahxt.SINGLETON_CLASSIFIERS_MASK;
    }

    public final int getTYPE_ALIASES_MASK() {
        return defpackage.ahxt.TYPE_ALIASES_MASK;
    }

    public final int getVARIABLES_MASK() {
        return defpackage.ahxt.VARIABLES_MASK;
    }

    public /* synthetic */ ahxs(defpackage.affu affuVar) {
        this();
    }
}
