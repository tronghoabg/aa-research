package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahxm extends defpackage.ahxo {
    public static final defpackage.ahxm INSTANCE = new defpackage.ahxm();
    private static final int fullyExcludedDescriptorKinds = defpackage.ahxt.Companion.getALL_KINDS_MASK() & (~(defpackage.ahxt.Companion.getFUNCTIONS_MASK() | defpackage.ahxt.Companion.getVARIABLES_MASK()));

    private ahxm() {
    }

    @Override // defpackage.ahxo
    public int getFullyExcludedDescriptorKinds() {
        return fullyExcludedDescriptorKinds;
    }
}
