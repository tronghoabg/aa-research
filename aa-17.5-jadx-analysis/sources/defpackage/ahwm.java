package defpackage;

/* loaded from: classes3.dex */
public final class ahwm extends ahwo {
    public static final ahwm INSTANCE = new ahwm();
    private static final int fullyExcludedDescriptorKinds = ahwt.Companion.getALL_KINDS_MASK() & (~(ahwt.Companion.getFUNCTIONS_MASK() | ahwt.Companion.getVARIABLES_MASK()));

    private ahwm() {
    }

    @Override // defpackage.ahwo
    public int getFullyExcludedDescriptorKinds() {
        return fullyExcludedDescriptorKinds;
    }
}
