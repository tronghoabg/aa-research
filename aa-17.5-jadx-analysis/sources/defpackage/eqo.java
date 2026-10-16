package defpackage;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class eqo implements fbc {
    @Override // defpackage.fbc
    public final void a(fbg fbgVar) {
        if (fbgVar instanceof eru) {
            dun.a(fbgVar, dun.c(fbgVar, (eru) fbgVar));
        } else {
            Objects.toString(fbgVar);
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ".concat(fbgVar.toString()));
        }
    }
}
