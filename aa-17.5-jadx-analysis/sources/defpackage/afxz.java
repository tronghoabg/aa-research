package defpackage;

import java.util.Arrays;
import java.util.Collection;

/* loaded from: classes3.dex */
final class afxz implements afdr {
    final /* synthetic */ afye this$0;

    public afxz(afye afyeVar) {
        this.this$0 = afyeVar;
    }

    @Override // defpackage.afdr
    public Collection<agdj> invoke() {
        return Arrays.asList(this.this$0.getBuiltInsModule().getPackage(afyo.BUILT_INS_PACKAGE_FQ_NAME), this.this$0.getBuiltInsModule().getPackage(afyo.COLLECTIONS_PACKAGE_FQ_NAME), this.this$0.getBuiltInsModule().getPackage(afyo.RANGES_PACKAGE_FQ_NAME), this.this$0.getBuiltInsModule().getPackage(afyo.ANNOTATION_PACKAGE_FQ_NAME));
    }
}
