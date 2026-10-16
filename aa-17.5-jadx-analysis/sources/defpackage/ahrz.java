package defpackage;

import java.util.Set;

/* loaded from: classes3.dex */
public final class ahrz {
    public static final ahrz INSTANCE = new ahrz();
    private static final Set<ahnf> internalAnnotationsForResolve = woy.di(new ahnf[]{new ahnf("kotlin.internal.NoInfer"), new ahnf("kotlin.internal.Exact")});

    private ahrz() {
    }

    public final Set<ahnf> getInternalAnnotationsForResolve() {
        return internalAnnotationsForResolve;
    }
}
