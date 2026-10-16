package defpackage;

import java.util.Collection;

/* loaded from: classes3.dex */
public final class ahxh {
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Collection getContributedDescriptors$default(ahxi ahxiVar, ahwt ahwtVar, afec afecVar, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContributedDescriptors");
        }
        if ((i & 1) != 0) {
            ahwtVar = ahwt.ALL;
        }
        if ((i & 2) != 0) {
            afecVar = ahxe.Companion.getALL_NAME_FILTER();
        }
        return ahxiVar.getContributedDescriptors(ahwtVar, afecVar);
    }

    public static void recordLookup(ahxi ahxiVar, ahnj ahnjVar, aglo agloVar) {
        ahnjVar.getClass();
        agloVar.getClass();
        ahxiVar.getContributedFunctions(ahnjVar, agloVar);
    }
}
