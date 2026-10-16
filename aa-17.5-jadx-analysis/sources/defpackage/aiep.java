package defpackage;

import java.util.Collection;

/* loaded from: classes3.dex */
final class aiep implements afec {
    private final Collection arg$0;
    private final aiic arg$1;
    private final aimg arg$2;
    private final ailx arg$3;

    public aiep(Collection collection, aiic aiicVar, aimg aimgVar, ailx ailxVar) {
        this.arg$0 = collection;
        this.arg$1 = aiicVar;
        this.arg$2 = aimgVar;
        this.arg$3 = ailxVar;
    }

    @Override // defpackage.afec
    public Object invoke(Object obj) {
        return aier.isSubtypeOfForSingleClassifierType$lambda$3(this.arg$0, this.arg$1, this.arg$2, this.arg$3, (aihv) obj);
    }
}
