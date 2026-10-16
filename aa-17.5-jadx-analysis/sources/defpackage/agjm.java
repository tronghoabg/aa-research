package defpackage;

/* loaded from: classes3.dex */
public final class agjm {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String toRuntimeFqName(ahnd ahndVar) {
        String strI = afyh.I(ahndVar.getRelativeClassName().asString(), '.', '$');
        if (ahndVar.getPackageFqName().isRoot()) {
            return strI;
        }
        return ahndVar.getPackageFqName() + '.' + strI;
    }
}
