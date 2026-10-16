package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class ahws {
    private ahws() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ahwr> getDEBUG_MASK_BIT_NAMES() {
        return (List) ahwt.DEBUG_MASK_BIT_NAMES$delegate.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ahwr> getDEBUG_PREDEFINED_FILTERS_MASK_NAMES() {
        return (List) ahwt.DEBUG_PREDEFINED_FILTERS_MASK_NAMES$delegate.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int nextMask() {
        int i = ahwt.nextMaskValue;
        int i2 = ahwt.nextMaskValue;
        ahwt.nextMaskValue = i2 + i2;
        return i;
    }

    public final int getALL_KINDS_MASK() {
        return ahwt.ALL_KINDS_MASK;
    }

    public final int getCLASSIFIERS_MASK() {
        return ahwt.CLASSIFIERS_MASK;
    }

    public final int getFUNCTIONS_MASK() {
        return ahwt.FUNCTIONS_MASK;
    }

    public final int getNON_SINGLETON_CLASSIFIERS_MASK() {
        return ahwt.NON_SINGLETON_CLASSIFIERS_MASK;
    }

    public final int getPACKAGES_MASK() {
        return ahwt.PACKAGES_MASK;
    }

    public final int getSINGLETON_CLASSIFIERS_MASK() {
        return ahwt.SINGLETON_CLASSIFIERS_MASK;
    }

    public final int getTYPE_ALIASES_MASK() {
        return ahwt.TYPE_ALIASES_MASK;
    }

    public final int getVARIABLES_MASK() {
        return ahwt.VARIABLES_MASK;
    }

    public /* synthetic */ ahws(afeu afeuVar) {
        this();
    }
}
